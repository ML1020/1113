import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int num[] = new int[numbers.length];
        //字符串转换为数组
        for(int i = 0;i < numbers.length;i++) {
            num[i] = Integer.parseInt(numbers[i]);
        }
        howABC(num);
    }

    private static void howABC(int[] num) {
        //下标为0时A-B;1,B-C;2,A+B;3,B+C
        if ((num[1] + num[3]) % 2 == 0 && (num[0]+num[2])%2 == 0 && (num[1]-num[3])%2 == 0){
            int A = Math.abs((num[0]+num[2])/2);
            int B = Math.abs((num[1] + num[3])/2);
            int C = Math.abs((num[1]-num[3])/2);
            System.out.print(A+" ");
            System.out.print(B+" ");
            System.out.print(C);
        }else {
            System.out.println("No");
        }
    }
}
