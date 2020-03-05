package charpter12collections;// collections/ListIteration.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import typeinfo.pets.*;

import java.util.*;


/**
 * ListIterator 是一个更强大的 Iterator 子类型，它只能由各种 List 类生成。 Iterator 只能向前移动，
 * 而 ListIterator 可以双向移动。它还可以生成相对于迭代器在列表中指向的当前位置的后一个和前一个元素
 * 的索引，并且可以使用 set() 方法替换它访问过的最近一个元素。可以通过调用 listIterator() 方法来
 * 生成指向 List 开头处的 ListIterator ，还可以通过调用 listIterator(n) 创建一个一开始就指向列表
 * 索引号为 n 的元素处的 ListIterator 。
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.list(8);
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext())
            System.out.print(it.next() +
                    ", " + it.nextIndex() +
                    ", " + it.previousIndex() + "; ");
        System.out.println();
        // Backwards:
        while (it.hasPrevious())
            System.out.print(it.previous().id() + " ");
        System.out.println();
        System.out.println(pets);

        //创建一个一开始就指向列表索引号为 n 的元素处的 ListIterator
        it = pets.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.set(Pets.get());
        }
        System.out.println(pets);
    }
}
/* Output:
Rat, 1, 0; Manx, 2, 1; Cymric, 3, 2; Mutt, 4, 3; Pug,
5, 4; Cymric, 6, 5; Pug, 7, 6; Manx, 8, 7;
7 6 5 4 3 2 1 0
[Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Manx]
[Rat, Manx, Cymric, Cymric, Rat, EgyptianMau, Hamster,
EgyptianMau]
*/
