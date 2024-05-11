# <center>1: Types, Variables, Operators</center>



计算机的计算过程：

<img src="E:\学学学\本科\CS\JAVA\notes\week1.assets\image-20240511215914843.png" alt="image-20240511215914843" style="zoom:33%;" />

我们输入z=x+y，我们先是读取我们的x和y，然后我们再去调用我们的add加法，将我们的结果传给我们的z



编译java文件：

![image-20240511220343896](E:\学学学\本科\CS\JAVA\notes\week1.assets\image-20240511220343896.png)

先是编译我们的java文件。我们会得到一个class文件，然后再对其进行编译，就可以获得我们最后的结果了

<img src="E:\学学学\本科\CS\JAVA\notes\week1.assets\image-20240511220938827.png" alt="image-20240511220938827" style="zoom: 50%;" />

<img src="E:\学学学\本科\CS\JAVA\notes\week1.assets\image-20240511221002766.png" alt="image-20240511221002766" style="zoom:50%;" />

一般格式：

```java
class CLASSNAME {
	public static void main(String[] arguments){
		STATEMENTS
	}
}
```

输出：

```java
System.out.println(some String);
```



几种类型：

- bool，就是true或者是false
- int，就是整数
- double，就是小数
- String，就是字符串



变量就是和c++是一样的

类型+变量名

```java
String lhz;
```

给变量赋值：

```java
lhz="lhzlhz";
```

合起来写：

```java
String lhz="lhzlhz";
```



运算符：

```java
Assignment: =
Addition: +
Subtraction: -
Multiplication: *
Division: /
```

运算顺序就是先是括号，然后是乘除，然后是加减



字符与字符之间可以相连

```java
String text = "hello" + " world";
text = text + " number " + 5;
```

