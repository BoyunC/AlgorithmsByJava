import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int count = -1; // 결과값, 기본은 불가능(-1)

        // 5원 개수를 최대로 써보기
        int five = n / 5;
        while (five >= 0) {
            int remain = n - five * 5;
            if (remain % 2 == 0) { // 2원으로 나눠떨어지는 경우
                count = five + (remain / 2);
                break; // 최소 개수니까 바로 종료
            }
            five--; // 5원을 하나 줄여서 다시 시도
        }

        System.out.println(count);
    }
}