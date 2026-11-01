class Solution {
    public int fac(int n) {
        
        if (n <= 1) return n;
        
        int answer = n * fac(n -1);
        
        return answer;
    }
    
    public int solution(int n){
        int i = 2;
        while(true){
            if(fac(i) > n){
                break;
            }
            
            i++;
        }
        
        return --i;
    }
}