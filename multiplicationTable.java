public class multiplicationTable{
    public static void main(String []args){
        int total=0;
        for (int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                total=i*j;
                System.out.print(total + " ");
            }
            System.out.println();
        }
    }
}
            