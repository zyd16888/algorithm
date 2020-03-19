package simple;

import java.util.LinkedList;
import java.util.List;

/**
 * 描述:
 * 412. Fizz Buzz
 *
 * @author dong
 * @date 2020-03-19 18:30
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n){
        List<String> lists = new LinkedList<>();
        int a = 1;
        while (a <= n){
            if ( a%3 == 0 && a%5 != 0) {
                lists.add("Fizz");
            }else if (a%3 != 0 && a%5 == 0) {
                lists.add("Buzz");
            }else if (a%3 == 0 && a%5 == 0) {
                lists.add("FizzBuzz");
            }else {
                lists.add(String.valueOf(a));
            }
            a++;
        }
        return lists;
    }
}
