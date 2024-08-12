package behavior.visitor.demo2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/*
* 合并文件中的内容
* */
public class Test {
    public static void main(String[] args) throws Exception {
        // 需要遍历的文件夹
        String fileDirectory = "E:\\test\\1";
        // 包含的文件名后缀
        String includeFileNameSuffix = ".txt";
        // 输出的文件名
        String outputFilePath = "E:\\test\\1\\merge.txt";

        Path startingDir = Paths.get(fileDirectory);
        FindFileVisitor findJavaVisitor = new FindFileVisitor(includeFileNameSuffix);
        // 传入观察者对象
        Files.walkFileTree(startingDir, findJavaVisitor);

        try {

            FileOutputStream fos = new FileOutputStream(outputFilePath);
            FileChannel channel = fos.getChannel();
            // 获取 findJavaVisitor 的 FileNameList （文件路径集合） 遍历  写入 channel对象
            findJavaVisitor.getFileNameList().forEach(name -> {
                System.out.println(name);
                if (!name.endsWith("CodeOutput.java")) {
                    Path path = Paths.get(name);
                    try {
                        byte[] bytes = Files.readAllBytes(path);
                        channel.write(ByteBuffer.wrap(bytes));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            });

        }  catch (Exception e) {
            e.printStackTrace();
        }

    }


    static class FindFileVisitor extends SimpleFileVisitor<Path> {

        private String fileNameSuffix;
        public FindFileVisitor(String fileNameSuffix) {
            this.fileNameSuffix = fileNameSuffix;
        }

        private List<String> fileNameList = new ArrayList<>();
        public List<String> getFileNameList() {
            return fileNameList;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            String fileName = file.toString();
            if (fileName.endsWith(fileNameSuffix)) {
                fileNameList.add(fileName);
            }
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            return FileVisitResult.CONTINUE;
        }

    }

}

