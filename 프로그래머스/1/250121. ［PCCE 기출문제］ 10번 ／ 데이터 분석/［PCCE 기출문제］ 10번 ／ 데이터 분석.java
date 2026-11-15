import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIndex = getIndex(ext);
        int sortIndex = getIndex(sort_by);

        List<int[]> result = new ArrayList<>();

        for (int[] row : data) {
            if (row[extIndex] < val_ext) {
                result.add(row);
            }
        }
        result.sort((row1, row2) ->
            Integer.compare(row1[sortIndex],row2[sortIndex]));
        return result.toArray(new int[result.size()][]);
    }
    private int getIndex(String name) {
        if (name.equals("code")) return 0;
        if (name.equals("date")) return 1;
        if (name.equals("maximum")) return 2;
        return 3;
    }
}