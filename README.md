## JAVA学习日记
### Day 1
#### 1、Class的使用以及继承，多态的使用。
定义方法为

~~~ java
public class className{}
~~~

​		其中一个JAVA文件中只能有一个public的class，其他的class只能直接使用class className{}来创建；
类在继承时需要在声明自身的变量的同时，声明父类中的变量，例如

~~~ java
public class Car{
  int id;
}

public class carInfo extend Car{
  String brand;
  public className(int id, String brand){
    this.brand = brand;
  }
}
~~~

​		多态是我从未听说过的一种方法概念。多态可以使相同名字的方法通过传入不同类型、不同顺序的值来决定使用哪一个具体的方法
例如：
public int add(int a, int b) { ... } 和 public double add(double a, double b) { ... }
​		上述两个方法名字都为add，但在传入值时，前一个为int类型的a,b后一个为double类型的a,b，在使用这两个方法时只需传入两个int即可调用前者，传入两个double即可使用后者。

##### 2、对象
对象是类的一个实例（对象不是找个女朋友），有状态和行为。例如，一辆车是一个对象，他的状态有：品牌，颜色，生产商；行为有：跑高速，趴窝，美美哒换个颜色等。
示例：
carInfo myCar = new carInfo(1001, "一汽大众");
carInfo yourCar = new carInfo(1002, "一汽奥迪");
