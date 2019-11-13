import java.util.Scanner;

public class BigerLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int num[] = new int[numbers.length];
        //字符串转换为数组
        for(int i = 0;i < numbers.length;i++) {
            num[i] = Integer.parseInt(numbers[i]);
        }
        int[] arr = new int[256];
        for (int i = 0;i < num.length;i++){
            arr[num[i]]++;
        }
        for (int j = 0;j < arr.length;j++){
            if (arr[j] >= (num.length)/2){
                System.out.println(j);
            }
        }
    }
}
