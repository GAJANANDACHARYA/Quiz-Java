import java.io.*;
import java.util.Scanner;
public class Qna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------   QUIZ   -----\n\n");
        System.out.println("Correct Answer: +1000 points\nIncorrect Answer: -250 points\n\n ");

        try {
            File Obj = new File("D:\\Coding\\Aspire java\\Qna.txt");
            File obj2 = new File("D:\\Coding\\Aspire java\\Ans.txt");

            Scanner Reader = new Scanner(Obj);              // to read ques
            Scanner Reader2 = new Scanner(obj2);            // to read ans

            int size = 7;
            String[] ques = new String[size];
            String[] ans = new String[size];
            String[] input_ans = new String[size];

            int i = 0;
            while (Reader.hasNextLine()) {
                ques[i] = Reader.nextLine();
                ans[i] = Reader2.nextLine();
                i++;
            }
            Reader.close();

            int score = 0;

            for(int j = 0; j < 5; j++){
                System.out.println("Question number "+ (j+1) );
                System.out.println(ques[j] + "\n\n");
                System.out.print("Input Answer: ");
                input_ans[j] = sc.nextLine();
                if (ans[j].equalsIgnoreCase(input_ans[j]))
                {
                    score += 100;
                    System.out.println("\nCorrect !!!");
                    if(j == 4){
                        System.out.println("\n\nGAME OVER !!!");
                        System.out.println("Final Score : " + score);
                    }
                    else {
                        //System.out.println("\nCorrect !!!");
                        System.out.println("Score : " + score + "\n\n");
                    }
                }
                else {
                    score -= 25;
                    System.out.println("\nIncorrect !!!");
                    if(j == 4){
                        System.out.println("\n\nGAME OVER !!!");
                        System.out.println("Final Score : " + score);
                    }
                    else {
                        System.out.println("Score : " + score + "\n\n");
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}