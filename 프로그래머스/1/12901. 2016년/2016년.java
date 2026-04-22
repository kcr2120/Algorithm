class Solution {
    public String solution(int a, int b) {
        String answer = null;
        int day = 0;
        if (a == 1) day = b % 7;
        else if (a == 2) day = (31 + b) % 7;
        else if (a == 3) day = (31 + 29 + b) % 7;
        else if (a == 4) day = (31 + 29 + 31 + b) % 7;
        else if (a == 5) day = (31 + 29 + 31 + 30 + b) % 7;
        else if (a == 6) day = (31 + 29 + 31 + 30 + 31 + b) % 7;
        else if (a == 7) day = (31 + 29 + 31 + 30 + 31 + 30 + b) % 7;
        else if (a == 8) day = (31 + 29 + 31 + 30 + 31 + 30 + 31 + b) % 7;
        else if (a == 9) day = (31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + b) % 7;
        else if (a == 10) day= (31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + b) % 7;
        else if (a == 11) day= (31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + b) % 7;
        else day = (31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + b) % 7;
        
        
        
        switch (day) {
            case 3 : answer = "SUN";
                break;
            case 4 : answer = "MON";
                break;
            case 5 : answer = "TUE";
                break;
            case 6 : answer = "WED";
                break;
            case 0 : answer = "THU";
                break;
            case 1 : answer = "FRI";
                break;
            case 2 : answer = "SAT";
                break;
        }
        return answer;
    }
}