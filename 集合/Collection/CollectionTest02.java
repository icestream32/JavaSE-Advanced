package 集合.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// 迭代器Itorator的使用
public class CollectionTest02 {
    /*
        Iterator<E> iterator() 返回此集合中元素的迭代器  
        创建迭代器对象：Iterator it = c.iterator();
        此时在Iteror类里有四个重要的方法，这些方法会帮助程序员遍历集合
            1.boolean hasNext()
                如果迭代具有更多元素，则返回true。（换句话说，如果next()返回一个元素而不是抛出异常，则返回true）
            2.E next()
                返回迭代中的下一个元素。
            3.default void remove()
                从底层集合中移除此迭代器返回的最后一个元素（可选操作）。 每次调用next()时，只能调用此方法一次。 
                除非通过调用此方法以外的任何方式修改基础集合，否则迭代器的行为未指定，除非重写类已指定并发修改策略。 
                如果在调用forEachRemaining方法后调用此方法， 则不指定迭代器的行为。
            4.default void forEachRemaining​(Consumer<? super E> action)
                对每个剩余元素执行给定操作，直到处理完所有元素或操作引发异常。 如果指定了该顺序，则按迭代顺序执行操作。 操作抛出的异常将转发给调用者。 
                如果操作以任何方式修改集合（即使通过调用remove方法或Iterator子类型的其他mutator方法）。
                迭代器的行为也未指定，除非覆盖类指定了并发修改策略。 
                如果操作引发异常，则不指定迭代器的后续行为。 
     */
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(true);
        c.add("jjjj");
        c.add("23456");
        c.add(2135);

        // 创建一个迭代器对象
        Iterator it = c.iterator();
        // 遍历集合
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
