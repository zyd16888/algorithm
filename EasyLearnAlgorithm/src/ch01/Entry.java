package ch01;

/**
 * 描述:
 *
 * @author dong
 * @create 2019-03-31 22:34
 */
public class Entry {
    int key;
    int value;
    Entry next;

    public  Entry(int key, int value, Entry next){
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
