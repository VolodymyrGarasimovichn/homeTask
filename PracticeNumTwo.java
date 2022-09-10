import java.util.Scanner;

public class PracticeNumTwo {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("\n Write num of task :)");
            byte taskNum = scan.nextByte();
            switch(taskNum) {
                case 1:
                    Task1();
                    break;
                case 2:
                    Task2();
                    break;
                case 3:
                    Task3();
                    break;
                case 4:
                    Task4();
                    break;
                case 5:
                    Task5();
                    break;
                case 6:
                    Task6();
                    break;
                case 7:
                    Task7();
                    break;
                case 8:
                    Task8();
                    break;
            }
        }
    }
    public static void Task1(){
        // Java literals
        boolean IronMan = false; //Boolean(true/false)
        String BalckWidow= "Marvel";
        char AntMan = 'A'; // Char(characters only)
        byte BlackPanter = -128;//Byte(-128 <= x <= 127)
        short SpiderMan = 32767;//Short(-32,768 <= x <= 32,767)
        int Halk = -2147483648;//Int(-2,147,483,648 <= x <= 2,147,483,647)
        long Vision = 9223372036854775807L;//Long(-9,223,372,036,854,775,808 <= x <= 9,223,372,036,854,775,807)
        double DoctorStrange = 1.123456789101112131415;//Double(15 decimal digits)
        float Warrior = 1.1234567f;//Float(6-7 decimal digits)
        System.out.println("Java literals:" +
                "\n Boolean: " + IronMan +
                "\n String: " + BalckWidow +
                "\n Char: " + AntMan +
                "\n Byte: " + BlackPanter +
                "\n Short: " + SpiderMan +
                "\n Int: " + Halk +
                "\n Long: " + Vision +
                "\n Double: " + DoctorStrange +
                "\n Float: " + Warrior);
    }
    public static void Task2(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input first num: ");
        int num1 = scan.nextInt();
        System.out.print("\nPlease input sign: ");
        char sign = scan.next().charAt(0);
        System.out.print("\nPlease input second num: ");
        int num2 = scan.nextInt();
        switch(sign){
            case '+':
                System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
                break;
            case '/':
                System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
                break;
        }
    }
    public static void Task3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number and I'm gonna detect is it odd");
        int num = scan.nextInt();
        if(num%2!=0) {
            System.out.println(num + " is odd");
        } else{
            System.out.println("Your number is even!");
        }
    }
    public static void Task4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input ur num");
        int num = scan.nextInt();
        if(num>=0 && num<10){
            System.out.println("Number " + num + " is positive, it is more than or equal zero and less than 10");
        } else {
            System.out.println("Your number " + num + " is negative or more than 10");
        }
    }
    public static void Task5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose a method ur wanna do this task :)");
        System.out.println("1) switch case\n "+"2) if-else-if");
        byte method = scan.nextByte();
        switch (method){
            case 1:
                System.out.println("Write a number that means a day of a week");
                byte DayOfTheWeekS = scan.nextByte();
                switch(DayOfTheWeekS){
                    case 1:
                        System.out.println("You chose Monday");
                        break;
                    case 2:
                        System.out.println("You chose Tuesday");
                        break;
                    case 3:
                        System.out.println("You chose Wednesday");
                        break;
                    case 4:
                        System.out.println("You chose Thursday");
                        break;
                    case 5:
                        System.out.println("You chose Friday");
                        break;
                    case 6:
                        System.out.println("Weekends started! \nYou chose Saturday");
                        break;
                    case 7:
                        System.out.println("Weekends almost end :(\nYou chose Sunday");
                        break;
                }
                break;
            case 2:
                System.out.println("Write a number that means day of a week");
                byte DayOfTheWeek = scan.nextByte();
                if(DayOfTheWeek == 1){
                    System.out.println("You chose Monday");
                } else if (DayOfTheWeek == 2) {
                    System.out.println("You chose Tuesday");
                }else if (DayOfTheWeek == 3) {
                    System.out.println("You chose Wednesday");
                }else if (DayOfTheWeek == 4) {
                    System.out.println("You chose Thursday");
                }else if (DayOfTheWeek == 5) {
                    System.out.println("You chose Friday");
                }else if (DayOfTheWeek == 6) {
                    System.out.println("Weekends started! \nYou chose Saturday");
                }else if (DayOfTheWeek == 7) {
                    System.out.println("Weekends almost end :(\nYou chose Sunday");
                }
                break;
        }
    }
    public static void Task6(){
        int taskNum = 1;
        String taskword = "Task";
        while(taskNum <= 10){
            System.out.println("\""+taskword.concat(String.valueOf(taskNum))+"\"");
            taskNum++;
        }
    }
    public static void Task7(){
        byte num = 1;
        byte counter = 1;
        do{
            if (num % 5 == 0) {
                System.out.println(counter+") "+num);
                counter++;
            }
            num++;
        }while(num<=100);
    }
    public static void Task8(){
        byte randNum = (byte) (Math.random()* 20 + 1);
        int counter = 1;
        long factorial = 1L;

        System.out.println("Your number is "+randNum);
        while(counter <= randNum){
            factorial*=counter;
            counter++;
        }
        System.out.println("Factorial of "+ randNum+ " = "+ factorial);
    }
}
