package winterholidaytraincamp3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 描述:
 * https://ac.nowcoder.com/acm/contest/329/G
 *
 * @author dong
 * @date 2019-01-26 17:35
 */
class Demo_G{
    public static void main(String[] args)
    {
        String txt="168688";

        String re1=".*?";	// Non-greedy match on filler
        String re2="6";	// Uninteresting: c
        String re3=".*?";	// Non-greedy match on filler
        String re4="(6)";	// Any Single Character 1
        System.out.println(re1+re2+re3+re4);
        Pattern p = Pattern.compile(re1+re2+re3+re4,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        Matcher m = p.matcher(txt);
        if (m.find())
        {
            String c1=m.group(1);
            System.out.print(c1+"\n");
        }
    }
}