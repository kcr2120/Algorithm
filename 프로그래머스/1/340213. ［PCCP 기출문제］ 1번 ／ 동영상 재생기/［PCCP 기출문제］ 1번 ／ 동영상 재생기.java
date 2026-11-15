class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video = toSecond(video_len);
        int current = toSecond(pos);
        int opStart = toSecond(op_start);
        int opEnd = toSecond(op_end);

        if (opStart <= current && current <= opEnd) {
            current = opEnd;
        }
        for (String command : commands) {
            if (command.equals("prev")) {
                current -= 10;
                if (current < 0) {
                    current = 0;
                }
            } else {
                current += 10;
                if (current > video) {
                    current = video;
                }
            }
            if (opStart <= current && current <= opEnd) {
                current = opEnd;
            }
        }

        int minute = current / 60;
        int second = current % 60;

        return String.format("%02d:%02d", minute, second);
    }
    private int toSecond(String time) {
        String[] parts = time.split(":");

        int minute = Integer.parseInt(parts[0]);
        int second = Integer.parseInt(parts[1]);

        return minute * 60 + second;
        
     
    }
}