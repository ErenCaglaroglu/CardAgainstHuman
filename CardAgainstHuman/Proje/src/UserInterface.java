import java.util.*;
public class UserInterface {
 public String user1;
 public String user2;
 public String user3;
 public String user4;
 public String user5;


    public void Player(){
        Scanner scan= new Scanner (System.in);


        System.out.println("First user please enter your nickname");
        user1=scan.nextLine();
        System.out.println("Second user please enter your nickname");
        user2=scan.nextLine();
        System.out.println("Third user please enter your nickname");
        user3=scan.nextLine();
        System.out.println("Fourth user please enter your nickname");
        user4=scan.nextLine();
        System.out.println("Fifth user please enter your nickname");
        user5=scan.nextLine();
        System.out.println("--------------------------------------");

        System.out.println("First User:"+user1+"\n"+"Second User:"+user2+"\n"+"Third User:"+user3+"\n"+"Fourth User:"+user4+"\n"+"Fifth User:"+user5+"");
        System.out.println("--------------------------------------");

    }
    public void Referee(){
        System.out.println("Now system choosing referee ");




        Random referee=new Random();
        int a=referee.nextInt(6);
        switch(a)
        { case 1:
            System.out.println("This round referee is:" + user1);
            break;
            case 2:
                System.out.println("This round referee is:" + user2);
                break;
            case 3:
                System.out.println("This round referee is:" + user3);
                break;
            case 4:
                System.out.println("This round referee is:" + user4);
                break;
            case 5:
                System.out.println("This round referee is:" + user5);
                break; }
        System.out.println();
        System.out.println("--------------------------------------");

    }






}
