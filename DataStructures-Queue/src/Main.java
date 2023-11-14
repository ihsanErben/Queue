import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue x = new Queue();
        Scanner input = new Scanner(System.in);
        int a = 1;
        while(a == 1){
            
            System.out.println("1 - enqueu");
            System.out.println("2 - denqueu");
            System.out.println("3 - print");
            System.out.print("option: ");
            int option = input.nextInt();
            
            switch(option){
                case 0:
                    a = 0;
                    break;
                case 1:
                    x.enqueu();
                    break;
                case 2:
                    x.dequeu();
                    break;
                case 3:
                    System.out.println("");
                    x.print();
                    System.out.println("");
                    break;
                default:
                    System.out.println("   ---   INVALID VALUE   ---   ");
                    break;
            }
        }
        
    }
}
