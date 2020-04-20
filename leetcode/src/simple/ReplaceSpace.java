package simple;

/**
 * 描述:
 * 面试题05. 替换空格
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 *
 * @author dong
 * @date 2020-04-20 8:18
 */
public class ReplaceSpace {
    public String replaceSpace(String s){
        char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(char c: chars) {
            if (c == ' '){
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReplaceSpace test = new ReplaceSpace();
        String res = test.replaceSpace("We are happy.");
        System.out.println(res);
    }
}
