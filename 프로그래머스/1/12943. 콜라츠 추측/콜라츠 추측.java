class Solution {
    
    public long solution(int num) {
        return collatz(num, 0);
    }
    
    public long odd(long num) {
        return 3 * num + 1;
    }
    
    public long even(long num) {
        return num / 2;
    }
    
    public int collatz(long num, int count) {
        if (num == 1) {
            return count;
        }
        if (count >= 500) {
            return -1;
        }
        
        long next;

        if (num % 2 == 0) {
            next = even(num);
        } else {
            next = odd(num);
        }

        return collatz(next, count + 1);
    }
}