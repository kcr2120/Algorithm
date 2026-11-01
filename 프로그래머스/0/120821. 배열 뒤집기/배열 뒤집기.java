class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        reverse(num_list , 0, num_list.length - 1);
        return num_list;

    }
    
    public void reverse(int [] arr, int front, int back) {
        
        if (front >= back) {
            return;
        }
        
        int tmp = arr[back];
        arr[back]  = arr[front];
        arr[front] = tmp;
        
        reverse(arr, front + 1, back - 1);
    }
}