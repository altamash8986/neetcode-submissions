class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int islands = 0;
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    islands++;
                    dfs(i, j, row, col, visited, grid);
                }
            }
        }
        return islands;
    }

    public void dfs(int i, int j, int row, int col, boolean[][] visited, char[][] grid) {

        if (i < 0 || j < 0 || i >= row || j >= col || visited[i][j] || grid[i][j] != '1') {
            return;
        }

        visited[i][j] = true;

        // Explore 4 directions
        dfs(i - 1, j, row, col, visited, grid); // Up
        dfs(i + 1, j, row, col, visited, grid); // Down
        dfs(i, j - 1, row, col, visited, grid); // Left
        dfs(i, j + 1, row, col, visited, grid); // Right
    }
}