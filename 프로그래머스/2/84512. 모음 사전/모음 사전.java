class Solution {
    
    char[] dictionaries = {'A', 'E', 'I', 'O', 'U'};
    int count = 0;
    int answer = 0;
    
    public int solution(String word) {
        search("", word);
        return answer;
    }
    
    public boolean search(String current, String target) {
        if (current.equals(target)) {
            answer = count;
            return true;
        }
        
        if (current.length() == 5) {
            return false;
        }
        
        for (char dictionary : dictionaries) {
            count++;
        
            if (search(current + dictionary, target)) {
                return true;
            }
        }
        
        return false;
    }
}