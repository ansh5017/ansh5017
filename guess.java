
import java.util.Scanner;

class working
{
int random;
   public  working()
   {
     random=(int)((Math.random())*100);

   }

   public void input(){
       Scanner sc=new Scanner(System.in);
      
       int a=sc.nextInt();
       if(a==random)
       {
           System.out.println("Bingo");
           return;
       }
       else if (a>random)
       {
           System.out.println("Smaller");

       }
       else {
           System.out.println("Bigger");
       }
        input();
        return;

   }

}
public class Guess {
    public static void main(String[] args)
     {
         working condition=new working();
         
         condition.input();

    }
}

