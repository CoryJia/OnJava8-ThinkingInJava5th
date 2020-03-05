package ch12collections;// collections/AsListInference.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
import java.util.*;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

/**
 * Collection.addAll() 方法只能接受另一个 Collection 作为参数，因此它没有 Arrays.asList()
 * 或 Collections.addAll() 灵活。这两个方法都使用可变参数列表。
 *
 * 也可以直接使用 Arrays.asList() 的输出作为一个 List ，但是这里的底层实现是数组，没法调整大小。
 * 如果尝试在这个 List 上调用 add()或 remove()，由于这两个方法会尝试修改数组大小，所以会在运行
 * 时得到“Unsupported Operation（不支持的操作）”错误：
 */
public class AsListInference {
  public static void main(String[] args) {
    List<Snow> snow1 = Arrays.asList(
      new Crusty(), new Slush(), new Powder());
//      snow1.add(new Heavy()); // Exception

    List<Snow> snow2 = Arrays.asList(
      new Light(), new Heavy());
    //- snow2.add(new Slush()); // Exception

    List<Snow> snow3 = new ArrayList<>();
    Collections.addAll(snow3,
      new Light(), new Heavy(), new Powder());
    snow3.add(new Crusty());

    // Hint with explicit type argument specification:
    List<Snow> snow4 = Arrays.<Snow>asList(
       new Light(), new Heavy(), new Slush());
    //- snow4.add(new Powder()); // Exception
  }
}
