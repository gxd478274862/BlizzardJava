package 集合类.List集合;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List lt1 = new ArrayList();

        //由源码可知：当调用add方法添加元素时会给数组申请长度为1e的一维数组，扩容原理是：原始长度的1.5倍
        lt1.add("one");
        System.out.println("lst = "+lt1);
        System.out.println("-------------------------------------------------");
        List lt2 = new LinkedList();
        lt2.add("one");
        System.out.println("lt2 = "+lt2);

    }
}
