package leetcode.Test.simple;

import simple.CompressStringLcci;

/**
 * 描述:
 * 01.06. 测试类
 *
 * @author dong
 * @date 2020-03-16 8:22
 */
public class CompressStringLcciTest {
    public static void main(String[] args) {
        CompressStringLcci csl = new CompressStringLcci();
        String S = "abbccd";
        String res = csl.compressString(S);
        System.out.println(res);
    }
}
