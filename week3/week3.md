# <center>3: Loops, Arrays</center>



循环在java中有很多种形式

whlie循环：

```java
while(condition){
    statements;
}
```

举个例子：

```java
public class lab3_test {
    public static void dayin(){
        int i=1;
        while(i<5){
            System.out.println(i);
            i=i+1;
        }
    }
    public static void main(String[] arguments){
        dayin();
    }
}
```

使用whlie必须要保证我们的循环是可以结束的



for循环：

```java
for (initialization;condition;update){
	statements;
}
```

也就是说我们需要初始条件，循环，和更新，直接全部放在for循环中，不像我们的whlie那样

举个例子：

```java
public class lab3_test {
    public static void dayin(){
        for(int i=1;i<=5;i=i+1){
            System.out.println("i="+i);
        }
    }
    public static void main(String[] arguments){
        dayin();
    }
}
```

这样就可以完成我们的循环打印任务

break可以用于跳出我们的循环

```java
public class lab3_test {
    public static void dayin(){
        for(int i=1;i<=50;i=i+1){
            if(i==10){
                break;
            }
            System.out.println("i="+i);
        }
    }
    public static void main(String[] arguments){
        dayin();
    }
}
```

这样我们就可以在10处直接跳出，直接跳出整个循环

```java
public class lab3_test {
    public static void dayin(){
        for(int i=1;i<=50;i=i+1){
            if(i==10){
                continue;
            }
            System.out.println("i="+i);
        }
    }
    public static void main(String[] arguments){
        dayin();
    }
}
```

continue的话就是说，我们只是跳出我们的循环的这一个例子，而不是跳出所有的循环

双层循环：

```java
public class lab3_test {
    public static void dayin(){
        for(int i=0;i<10;i=i+1){
            for(int j=0;j<10;j=j+1){
                System.out.println("i="+i+" "+"j="+j);
            }
        }
    }
    public static void main(String[] arguments){
        dayin();
    }
}
```

这样我们就完成了双层的循环



数组：数组内的元素必须都是一个类型的，不能是混合类型的

```java
public class lab3_test {
    public static void dayin(){
        int[] shuzu=new int[10];
        shuzu[1]=1;
    }
    public static void main(String[] arguments){
        dayin();
    }
}
```

当然可以是双层的数组

```java
public class lab3_test {
    public static void dayin(){
        int[][] shuzu=new int[10][10];
        shuzu[1][1]=1;
        System.out.println(shuzu[1][1]);
    }
    public static void main(String[] arguments){
        dayin();
    }
}
```

我们也可以用大括号来给一个数组赋值，初始值

```java
public class lab3_test {
    public static void dayin(){
        int shuzu[]={1,2,3,4,5};
        for(int i=0;i<shuzu.length;i++){
            System.out.println(shuzu[i]);
        }
    }
    public static void main(String[] arguments){
        dayin();
    }
}
```

如果我们将int型的一个数字换成double型，就会提示报错

![image-20240512185307163](E:\学学学\本科\CS\JAVA\week3\week3.assets\image-20240512185307163.png)

我们要修改一个数组中的值的时候，需要将我们的数组放在等号的左边

数组的长度：

```java
public class lab3_test {
    public static void dayin(){
        int shuzu[]={1,2,3,4,5};
        System.out.println(shuzu.length);
    }
    public static void main(String[] arguments){
        dayin();
    }
}
```

