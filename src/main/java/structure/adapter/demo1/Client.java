package structure.adapter.demo1;

import org.checkerframework.checker.units.qual.C;

public class Client {
    public static void main(String[] args) {
        SDCard card1 = new SDCard("abc");
        Computer computer = new Computer();

        computer.addCard("usb1",card1);
        System.out.println(computer.read("usb1"));
        computer.write("usb1","xxx");
        System.out.println(computer.read("usb1"));

        // 通过适配器 把 TFCard对象 转换成 SDCard对象
        SDCard card2 = new TFCardAdapterSD(new TFCard(new byte[]{1,2,3,4}));

        computer.addCard("usb2",card2);
        System.out.println(computer.read("usb2"));
        computer.write("usb2","xxxbb");
        System.out.println(computer.read("usb2"));

    }
}
