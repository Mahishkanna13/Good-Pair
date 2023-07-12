import java.util.Scanner;
public class GoodPair {
    public static int Pair(int []Array,int sum)
    {
        for (int i=0;i<Array.length;i++)
        {
            for (int j=i+1;j<Array.length;j++)
            {
                if(Array[i]+Array[j]==sum)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size : ");
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[] Array=new int[size];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<size;i++)
        {
            Array[i]=scan.nextInt();
        }
        int sum=scan.nextInt();
        System.out.println("Number of pairs Are :"+Pair(Array,sum));
    }
}
