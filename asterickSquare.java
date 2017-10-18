import java.util.Scanner;
public class asterickSquare{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter a positive integer that you would like to see a diamond created.");
        int input=in.nextInt();
        int count=-1;
        int spacecount=input-1;
        System.out.println(spacecount);
        for(int i=1;i<=input;i++){
            for(int k=spacecount;k>=1;k--){
                System.out.print(" ");
            }
            spacecount--; 
            count+=2;
            for (int j=1;j<=count;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        spacecount+=2; //spacecount is now at 1 
        for(int i=input;i>1;i--){
            for(int k=0;k<spacecount;k++){
                System.out.print(" ");
            }
            spacecount++;
            count-=2;
            for(int j=count;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
      

    