/**
 * 描述:
 * 换零钞
 *  星球的钞票的面额只有：100元，5元，2元，1元，共4种。
 *  小明去x星旅游，他手里只有2张100元的x星币，太不方便，恰好路过x星银行就去换零钱。
 *  小明有点强迫症，他坚持要求200元换出的零钞中2元的张数刚好是1元的张数的10倍，
 *  剩下的当然都是5元面额的。
 *  银行的工作人员有点为难，你能帮助算出：在满足小明要求的前提下，最少要换给他多少张钞票吗？
 *  （5元，2元，1元面额的必须都有，不能是0）
 *
 * @author dong
 * @date 2018-12-09 15:11
 */
public class Banknote {
    public static void main(String[] args) {
        int aas = 100000;
        for (int x=1; x<100; x++){
            for (int y=0; y<100; y++){
                if (21*x+5*y == 200){
                    System.out.println("x="+x+" y="+y);
                    aas = Math.min(aas,x+10*x+y);
                }
            }
        }

        System.out.println("一共需要"+aas+"张");

    }
}
