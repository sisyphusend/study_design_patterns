
JDBC 的 桥接对象 DriverManager 

DriverManager 中 有一个属性是driver的列表 (注册driver驱动 会赋值)

获得连接对象调用DriverManager.getConnection(xx,xx,xx)   过程： 会遍历 driver  ,最后会调用driver的getConnection方法