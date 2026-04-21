class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                char t = board[i][j];
                int b = (i/3)*3 + j/3;
                if(t != '.'){
                    if(!rows[i].contains(t) && !columns[j].contains(t) && !boxes[b].contains(t)){
                        rows[i].add(t);
                        columns[j].add(t);
                        boxes[b].add(t);
                    }else return false;
                }
            }
        }

        return true;
    }
}
