
import java.util.*;
public class main extends User {
    public static void main (String[] args) {

        boolean want = true;        
        do{          //to get multiple choise.....
        User U = new User();
        System.out.println("1.To Register YourSelf");
        System.out.println("2.Login To Your Account");
        System.out.println("3.Send a Messege");
        System.out.println("4.View Your Messeges");
        System.out.println("5.exit");
        System.out.println("Enter Your Choise");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();

    

        switch (choise) {
            case 1:
            System.out.print("Enter your username : ");
            String username=sc.next();
            U.user(username);
            System.out.println("You Have registerd Succesfully....");
            //System.out.println("your UId is : " + U.getUserId());       just yo see Id

            break;

            case 2:
            System.out.print("Enter your username to log in : ");
            String userLog = sc.next();
            //if (userLog=){
            
            //}

            case 5:
            want=false;
            System.out.println("Thank you..See you soon...");
            break;

            default:
            System.out.println("I think your Math is weak..\nEnter a valid Number plss....");
        }
    }while (want);
        
    }



    }

