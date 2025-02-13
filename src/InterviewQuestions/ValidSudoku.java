package InterviewQuestions;
//Leetcode 36
import java.util.*;
public class ValidSudoku {

    class Solution {
        public boolean isValidSudoku(char[][] board) {
            int N = 9;
            HashSet<Character>[] rows = new HashSet[N];
            HashSet<Character>[] cols = new HashSet[N];
            HashSet<Character>[] boxes = new HashSet[N];

            for(int i = 0; i < N; i++) {
                rows[i] = new HashSet<Character>();
                cols[i] = new HashSet<Character>();
                boxes[i] = new HashSet<Character>();
            }

            for(int r = 0; r < N; r++) {
                for(int c = 0; c < N; c++) {
                    char value = board[r][c];

                    if(value == '.') continue;

                    if(rows[r].contains(value)) return false;
                    rows[r].add(value);

                    if(cols[c].contains(value)) return false;
                    cols[c].add(value);

                    int idx = (r/3) * 3 + (c/3);
                    if(boxes[idx].contains(value)) return false;
                    boxes[idx].add(value);
                }

            }
            return true;
        }
    }
}
