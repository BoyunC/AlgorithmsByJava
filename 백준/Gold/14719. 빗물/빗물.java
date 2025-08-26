import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();

        int[] water = new int[W];


        for (int i = 0; i < W; i++) {
            water[i] = sc.nextInt();
        }

        // 1 ~ W-1까지 반복문을 돈다.
        //   그 위치를 기준으로 왼쪽 최대값, 오른쪽 최대값을 찾는다.
        //   만약, 왼쪽 최대값과 오른쪽 최대값이 그 위치보다 높다면
        //      (둘 중 작은 값) - (내 위치) 만큼 물을 채운다.

        for (int i = 1; i < W-1; i++) {
            int leftMax = 0;
            int rightMax = 0;

            // 왼쪽 최대값 찾는 코드
            for (int j = 0; j < i; j++){
                if (leftMax < water[j]) {
                    leftMax = water[j];
                }
            }

            // 오른쪽 최대값 찾는 코드
            for (int j = i+1; j < W; j++){
                if (rightMax < water[j]) {
                    rightMax = water[j];
                }
            }

            if (leftMax > water[i] && rightMax > water[i]) {
                result += Math.min(leftMax, rightMax) - water[i];
            }
        }

        System.out.println(result);
    }
}