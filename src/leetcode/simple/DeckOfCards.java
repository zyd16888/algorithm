package simple;

/**
 * 描述:
 * 914.卡牌分组
 *
 * @author dong
 * @date 2020-03-27 8:36
 */
public class DeckOfCards {
    public boolean hasGroupsSizeX(int[] deck) {
        // 计数
        int[] arr = new int[10000];
        for(int a : deck) {
            arr[a]++;
        }
        int x = -1;
        for (int cnt : arr) {
            if (cnt > 0) {
                x = x == -1 ? cnt : gcd(x, cnt);
                if (x == 1) {
                    return false;
                }
            }
        }
        return x >= 2;
    }

    /**
     * 辗转相除法求最大公约数
     * @param a 数字a
     * @param b 数字b
     * @return a与b的公约数
     */
    private int gcd (int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,2,2,2};
        DeckOfCards deckOfCards = new DeckOfCards();
        boolean flag = deckOfCards.hasGroupsSizeX(arr);
        System.out.println(flag);
    }

}
