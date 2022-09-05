import java.util.Scanner;

public class PracticeNumOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("\n Write num of task :)"+ "\n By the way, 34 means task 3 and 4 ;)");
            byte taskNum = scan.nextByte();
            switch(taskNum) {
                case 1:
                    Task1();
                    break;
                case 2:
                    Task2();
                    break;
                case 34:
                    Task3n4();
                    break;
            }
        }
    }

    // Task #1
    public static void Task1() {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        System.out.println("Task #1 \n" + "Please input first num that is less than or equal 1 000");
        a = scan.nextDouble();
        System.out.println("Please input second num that is less than or equal 1 000");
        b = scan.nextDouble();
        c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println("Hypotenuse " + c);
    }

    // Task #2
    public static void Task2() {
        Scanner scan = new Scanner(System.in);
        int a;

        System.out.println("Task #2 \n" + "Please input a num which is less than or equal 10 000");
        a = scan.nextInt();
        System.out.println("Previous one is " + (a - 1) + "\nYour num is " + a + "\nNext one is " + (a + 1));

    }

    //  Task #3 and 4
    public static void Task3n4() {
        Scanner scan = new Scanner(System.in);
        int N, K, applePerGuy, RemainderOfApple;

        System.out.println("Task #3 and 4\n" + "Input num of pupils and apples");
        System.out.println("Pupils:");
        N = scan.nextInt();
        System.out.println("Apples:");
        K = scan.nextInt();

        applePerGuy = K/N;
        RemainderOfApple = K%N;

        System.out.println("Every guy got: " + applePerGuy);
        System.out.println("Remainder of apples in basket: " + RemainderOfApple);
    }
}
