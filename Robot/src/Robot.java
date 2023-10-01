import java.util.Scanner;

public class Robot {
   int x;
 int y;
    //Constructor creating
    Robot(int x, int y){
        this.x=x;
        this.y=y;
    }
    void up(){
        y++;
    }
    void down(){
        y--;
    }
    void right(){
        x++;
    }
    void left(){
        x--;
    }

     static void menu(){
        System.out.println("# press 'w' to up movement");
        System.out.println("# press 's' to down movement");
        System.out.println("# press 'a' to left movement");
        System.out.println("# press 'd' to right movement");
        System.out.println("# press 'Q' for final Location");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Robot r1= new Robot(0,0);
        System.out.println("How you want to move your Robot");
        menu();
        while(true) {

        String choice = sc.next();


            switch (choice) {
                case "w":
                    r1.up();
                    System.out.println(r1.x + " " + r1.y);
                    break;
                case "s":
                    r1.down();
                    System.out.println(r1.x + " " + r1.y);

                    break;
                case "a":
                    r1.left();
                    System.out.println(r1.x + " " + r1.y);
                    break;
                case "d":
                    r1.right();
                    System.out.println(r1.x + " " + r1.y);
                    break;
                case "Q":
                    System.out.println("your movement is complete");
                    System.out.println(" Your final location:" +r1.x + " "+ r1.y);
                    System.exit(1);
                default:
                    System.out.println("invalid option");
                    System.out.println("Please try with w/s/a/d/Q");

            }
        }

    }
}