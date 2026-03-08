class Solution {
    public String solution(String my_string, String alp) {
        char[] arr = my_string.toCharArray();
        char target = alp.charAt(0);  // String → char
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        
        return new String(arr);
    }
}