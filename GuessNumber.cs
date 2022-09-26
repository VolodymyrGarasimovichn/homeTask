// Online C# Editor for free
// Write, Edit and Run your C# code using C# Online Compiler

using System;

public class HelloWorld
{
    public static void Main(string[] args) {
        int counter = 0;
        byte score = 0;
        Console.WriteLine("This game was created by 222/1 group student, Volodymyr Garasimovich" + "\n" + "I hope you get pleasure playing this :)" + "\n \n");
        Console.WriteLine("Hey! Do you wanna play the game (guess number) with me?" + "\n" + "Yes(y)/No(n)" + "\n");
        while(true){
            
            string answer = Console.ReadLine();
            if(answer.Equals("y")){
                Random rnd = new Random();
                int randNum  = rnd.Next(1, 101); 
                Console.WriteLine("So, I have just imagined the number from 1 to 100, try to guess it :) \n");
                
                while(true){
                    counter++;
                    int PlayerNumber = Convert.ToInt32(Console.ReadLine());
                    if(PlayerNumber == randNum){
                        if(counter == 1||counter == 2||counter == 3){
                            Console.WriteLine("Woooooow, how did you make it!? This is it, you WON! \n");
                        }else{
                            Console.WriteLine("Woooooow, this is it, you WON! \n");
                        }
                        if(counter == 1){
                            Console.WriteLine("You guessed it in " + counter + " time");
                        }else{
                            Console.WriteLine("You guessed it in " + counter + " times");
                        }
                        if(counter > 0 && counter <=3){
                            Console.WriteLine("Your score is A");
                        }else if(counter > 3 && counter <= 8){
                            Console.WriteLine("Your score is B");
                        }else if(counter > 8 && counter <=13){
                            Console.WriteLine("Your score is C");
                        }else if(counter > 13 && counter <=18){
                            Console.WriteLine("Your score is D");
                        }else{
                            Console.WriteLine("Your score is E");
                        }
                    Console.WriteLine("Do you wanna play one more time?" + "\n" + "Yes(y)/No(n)" + "\n");
                    break;
                    
                    } else {
                        if(PlayerNumber > randNum){
                            Console.WriteLine("Your number is more than mine \n");
                            
                        }else{
                            Console.WriteLine("Your number is less than mine \n");
                            
                        }
                        if(counter%3 == 0){
                        Console.WriteLine("Do you wanna get a bit more help?" + "\n" + "Yes(y)/No(n)" + "\n");

                        string helpAnswer = Console.ReadLine();
                            switch(helpAnswer){
                                case "y":
                                    int randHelp  = rnd.Next(1, 3);
                                    if(randHelp == 1){
                                //range
                                        if(randNum <= 30){
                                            Console.WriteLine("My number is in the range from 0 to 30");
                                        
                                        }else if(randNum >= 70){
                                            Console.WriteLine("My number is in the range from 70 to 100");
                                        
                                        }else{
                                            Console.WriteLine("My number is in the range from " + ((randNum-15)-randNum%10) + " to " + ((randNum+15)-randNum%10));
                                        
                                    }
                                    
                                } else {
                                    if(randNum%2 == 0){
                                    Console.WriteLine("My number is even");
                                    
                                    } else{
                                        Console.WriteLine("My number is odd");
                                        
                                    }
                        }
                        break;
                        
                        case "n":
                        Console.WriteLine("Okay :)");
                        break;
                        default:
                        Console.WriteLine("I don't have any phrase for your answer in my base :(");
                        break;
                    }
                    }//
                    }
                }
                
            }else if(answer.Equals("n")){
                Console.WriteLine("I'm so sad you go :( \n Bye!");
                break;
                
            }else{
                Console.WriteLine("You wrote wrong character :( \n Please, try again ;) \n");
            }
        }
    }
}
