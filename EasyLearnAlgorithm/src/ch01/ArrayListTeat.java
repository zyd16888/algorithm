package ch01;

/**
 * 描述:
 * ArrayList测试类
 *
 * @author dong
 * @create 2019-03-31 22:25
 */
public class ArrayListTeat {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList.get(3));
        arrayList.set(3, 9);
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.size());
    }
}
