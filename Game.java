package selfevaluation;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Gmethods obj = new Gmethods();
        while(true){
            Scanner get = new Scanner(System.in);
            int n = get.nextInt();
            switch (n) {
                case 1:
                    obj.output();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
            }

        }

    }
