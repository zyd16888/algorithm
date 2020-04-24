package simple;

/**
 * 描述:
 * 999. 车的可用捕获量
 *
 * @author dong
 * @date 2020-03-26 16:19
 */
public class AvailableCapturesForRook {
    public int numRookCaptures(char[][] board) {
        int[][] directions = {{-1, 0},{1, 0}, {0, 1}, {0, -1}};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    int res = 0;
                    for (int[] direction : directions) {
                        if (burnout(board, i, j, direction)){
                            res++;
                        }
                    }
                    return res;
                }
            }
        }
        return 0;
    }

    private boolean burnout(char[][] board, int x, int y, int[] direction) {
        int i = x, j = y;
        while (inArea(i, j)) {
            if (board[i][j] == 'B') {
                break;
            }
            if (board[i][j] == 'p') {
                return true;
            }

            i += direction[0];
            j += direction[1];
        }
        return false;
    }

    /**
     * @param i 当前位置横坐标
     * @param j 当前位置纵坐标
     * @return 是否在棋盘范围内
     */
    private boolean inArea(int i, int j) {
        return i >= 0 && i < 8 && j >= 0 && j < 8;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        AvailableCapturesForRook availableCapturesForRook = new AvailableCapturesForRook();
        int res = availableCapturesForRook.numRookCaptures(board);
        System.out.println(res);
    }

}
