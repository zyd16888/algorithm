package ch01;

import javax.swing.plaf.metal.MetalBorders;

import static java.util.Objects.hash;

/**
 * 描述:
 * 散列表实现
 *
 * @author dong
 * @create 2019-03-31 22:36
 */
public class HashTable {
    private static final int DEEAULT_INITIAL_CAPACITY = 4;
    private static final float LOAD_FACTOR = 0.75F;

    private Entry[] table = new Entry[DEEAULT_INITIAL_CAPACITY];
    /**散列表元素个数*/
    private int size = 0;
    /**
     * 散列表使用地址个数
     */
    private int use = 0;

    /**
     * @deprecated 添加/修改
     * @date 22:59 2019/3/31
     * @param key, value
     * @return void
     */
    public void put(int key, int value){
        int index = hash(key);
        if (table[index] == null){
            table[index] = new Entry(-1,-1,null);
        }
        Entry e = table[index];
        if (e.next == null){
            table[index].next = new Entry(key, value, null);
            size ++;
            use ++;
            if (use >= table.length * LOAD_FACTOR){
                resize();
            }
        }else {
            for (e = e.next; e != null; e = e.next){
                int k = e.key;
                if (k == key){
                    e.value = value;
                    return;
                }
            }
            Entry temp = table[index].next;
            Entry newEntry = new Entry(key, value, temp);
            table[index].next = newEntry;
            size ++;
        }
    }

    /**
     * @deprecated 扩容
     * @date 22:55 2019/3/31
     * @return void
     */
    private void resize() {
        int newLength = table.length * 2;
        Entry[] oldTable = table;
        table = new Entry[newLength];
        use = 0;
        for (int i = 0; i < oldTable.length; i++){
            if (oldTable[i] != null && oldTable[i].next != null){
                Entry e = oldTable[i];
                while (null != e.next){
                    Entry next = e.next;
                    int index = hash(next.key);
                    if (table[index] == null){
                        use++;
                        table[index] = new Entry(-1, -1, null);
                    }
                    Entry temp = table[index].next;
                    Entry newEntry = new Entry(next.key, next.value, temp);
                    table[index].next = newEntry;

                    e = e.next;
                }
            }
        }
    }

}
