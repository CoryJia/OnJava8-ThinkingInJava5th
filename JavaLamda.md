
## Lambda and Anonymous Classes(I)

本节将介绍如何使用Lambda表达式简化匿名内部类的书写，但Lambda表达式并不能取代所有的匿名内部类，只能用来取代**函数接口（Functional Interface）**的简写。先别在乎细节，看几个例子再说。

例子1：无参函数的简写

如果需要新建一个线程，一种常见的写法是这样：

~~~java
//JDK7 匿名内部类写法
new Thread(new Runnable() {//接口
  @Override
  public void run() { // 方法名
    System.out.println("Thread run()");
  }
}).start();
~~~

上述代码给`Tread`类传递了一个匿名的`Runnable`对象，重载`Runnable`接口的`run()`方法来实现相应逻辑。这是JDK7以及之前的常见写法。匿名内部类省去了为类起名字的烦恼，但还是不够简化，在Java 8中可以简化为如下形式：

~~~java
// JDK8 Lambda表达式写法
new Thread(
	() -> System.out.println("Trhead.run()"); //省略接口名和方法名
).start();
~~~

上述代码跟匿名内部类的作用是一样的，但比匿名内部类更进一步。这里连**接口名和函数名都一同省掉**了，写起来更加神清气爽。如果函数体有多行，可以用大括号括起来，就像这样：

~~~java
//JDK8 Lambda表达式代码块写法
new Thread(
	() -> {
    System.out.print("Hello");
    System.out.println(" World!");
  }
).start();
~~~

例子2：带参函数的简写

如果要给一个字符串列表通过自定义比较器，按照字符串长度进行排序，Java 7的书写形式如下：

~~~java
//JDK7 匿名内部类写法

List<String> list = Arrays.asList("I", "love", "coding", "very", "much");
Collections.sort(list, new Comaparator(String)(){// 接口名
  @Override
  public int compare(String s1, String s2){ // 方法名
    if(s1 == null){
      return -1;
    }
    if(s2 == null) {
      return 1;
    }
    return s1.length() - s2.length();
  }
});
~~~

上述代码通过内部类重载了`Comparator`接口的`compare()`方法，实现比较逻辑。采用Lambda表达式可简写如下：

~~~java
//JDK8 Lambda表达式写法

List<String> list = Arrays.asList("I", "love", "coding", "very", "much");

Collections.sor(list, (s1, s2) -> { //省略参数表的类型
  return s1 == null ? -1 : s2 == null ? 1 : s1.length() - s2.length(); 
})
~~~

上述代码跟匿名内部类的作用是一样的。除了省略了接口名和方法名，代码中把参数表的类型也省略了。这得益于`javac`的**类型推断**机制，编译器能够根据上下文信息推断出参数的类型，当然也有推断失败的时候，这时就需要手动指明参数类型了。注意，Java是强类型语言，每个变量和对象都必需有明确的类型。