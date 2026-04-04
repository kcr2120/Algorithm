import java.io.*;
import java.util.Arrays;

public class Main {
    static class Data {
        int num;
        String name;

        Data (int num, String name) {
            this.num = num;
            this.name = name;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Data[] arr = new Data[N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            int age = Integer.parseInt(input[0]);
            String name = input[1];
            arr[i] = new Data(age, name);
        }

        Arrays.sort(arr, (a,b) -> a.num - b.num); // 나이 오름차순

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i].num + " " + arr[i].name);
        }



    }
}