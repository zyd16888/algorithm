package BlueBridgeCup;

/**
 * 描述:
 * 字符串替换
 *
 * @author dong
 * @date 2018-12-09 21:51
 */
public class StringReplacement {
    static String src = "aeiou";
    static boolean flag = false;

    public static void main(String[] args) {
        String ch1="amcsefig",ch2="2931";
        System.out.println("ch1:"+ch1+"; ch2:"+"\t"+getSrc(ch1,ch2));
        ch2="29";
        System.out.println("ch1:"+ch1+"; ch2:"+"\t"+getSrc(ch1,ch2));
    }

    private static String getSrc(String ch1, String ch2){
        String tem = "";
        for (int i=0, c=0; i<ch1.length(); i++){
            char a=ch1.charAt(i);
            for (int j=0; j<src.length(); j++){
                char b=src.charAt(j);
                if (a == b){
                    flag = true;
                    break;
                }
            }
            if (flag){
                if (c<ch2.length()){
                    a=ch2.charAt(c);
                    c++;
                }else {
                    a='#';
                }
            }
            tem +=a;
            flag = false;
        }
        return tem;
    }

}
