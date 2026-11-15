class Solution {
    public int[] solution(String[] wallpaper) {
        int height = wallpaper.length;
        int width = wallpaper[0].length();
        int lux = height;
        int luy = width;
        int rdx = -1;
        int rdy = -1;
        
        for(int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                }
            }
        }
        
        return new int[]{lux, luy, rdx + 1, rdy + 1};
        
        
    }
}