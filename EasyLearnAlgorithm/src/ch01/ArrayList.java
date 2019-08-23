package ch01;

import java.util.Arrays;

/**
 * 描述:
 * ArrayList集合实现
 *
 * @author dong
 * @create 2019-03-31 22:04
 */
public class ArrayList {
    private static final int INITIAL_SIZE = 10;
    private int size = 0;
    private int[] array;

    public ArrayList() {
        array = new int[INITIAL_SIZE];
    }

    public ArrayList(int initial){
        if (initial <= 0){
            initial = INITIAL_SIZE;
        }
        array = new int[initial];
    }
    /**
     * @deprecated //增加元素
     * @date 22:12 2019/3/31
     * @param num
     * @return void
     */
    public void add(int num){
        if (size == array.length){
            array = Arrays.copyOf(array, size * 2);
        }
        array[size++] = num;
    }

    public int set(int i, int num){
        int oldNum = get(i);
        array[i] = num;
        return oldNum;
    }

    /**
     * @deprecated 获取指定位置的元素值
     * @date 22:17 2019/3/31
     * @param
     * @return inti
     */
    public int get(int i){
        if (i >= size){
            throw new IndexOutOfBoundsException("获取的元素位置超过了最大长度");
        }
        return array[i];
    }
    /**
     * @deprecated 获取变长数组长度
     * @date 22:19 2019/3/31
     * @return int
     */
    public int size(){
        return size;
    }
}
