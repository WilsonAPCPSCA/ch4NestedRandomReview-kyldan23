import java.util.Scanner;
public class CoinFlip{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        System.out.println("This program will simulate flipping a fair coin.");
        System.out.print("How many times would you like the coiun to be flipped? Enter a positive integer.");
        int input=in.nextInt();
        System.out.println("Here is the sequence of the coin flips:");
        int heads=0; //heads are 0s 
        int tails=0; //tails are 1s
        for(int i=0;i<input;i++){
            int random=(int)(Math.random() * ((1 - 0) + 1) + 0);
            if(random==0){
                heads+=1; 
                System.out.print("H");
            }
            else{
                tails+=1;
                System.out.print("T");
            }
        }
        System.out.println();
        System.out.println("There were "+heads+" heads and "+tails+" tails.");
    }
}
            