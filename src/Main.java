import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int num = sc.nextInt();

        // Queue에 입력된 숫자만큼 배치
        for(int i = 0; i < num; i++) {
            queue.offer(i+1);
//            System.out.println(queue);
        }

        while(queue.size() > 1) {
            queue.poll(); // 첫번째 입력된 항목을 삭제 & 해당 항목을 반환
//            System.out.println(i);
            queue.offer(queue.poll());
//            System.out.println(queue);
        }
        System.out.print(queue.poll());
    }
}