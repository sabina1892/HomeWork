package HomeWork3;

import java.util.Locale;
import java.util.Scanner;
public class weekPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String schedule[][] = new String[7][2];
        schedule[0][0] = "sunday";
        schedule[0][1] ="do home work";
        schedule[1][0] = "monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "tuesday";
        schedule[2][1] = "read a book";
        schedule[3][0] = "wednesday";
        schedule[3][1] = "to go for a walk";
        schedule[4][0] = "thursday";
        schedule[4][1] = "read a newspaper";
        schedule[5][0] = "friday";
        schedule[5][1] = "go to the gym";
        schedule[6][0] = "saturday";
        schedule[6][1] = "resting";
        for( int i=0; i<7; i++){
            for(int j=0; j<2;j++){
                System.out.print(schedule[i][j] + "\t");
            }
            System.out.println();
        }
        String day;
        while (true){
            System.out.println();
            System.out.println("Please, input the day of the week: ");
            day = sc.next();
            day=day.toLowerCase();
            if(day.equals(schedule[0][0]) ||
                    day.equals(schedule[1][0]) ||
                    day.equals(schedule[2][0]) ||
                    day.equals(schedule[3][0]) ||
                    day.equals(schedule[4][0]) ||
                    day.equals(schedule[5][0]) ||
                    day.equals(schedule[6][0]) ){

                switch (day) {
                    case "sunday" :
                        System.out.printf("Your tasks for %s: %s", schedule[0][0], schedule[0][1]);
                        break;
                    case "monday":
                        System.out.printf("Your tasks for %s: %s", schedule[1][0], schedule[1][1]);
                        break;
                    case "tuesday":
                        System.out.printf("Your tasks for %s: %s", schedule[2][0], schedule[2][1]);
                        break;
                    case "wednesday":
                        System.out.printf("Your tasks for %s: %s", schedule[3][0], schedule[3][1]);
                        break;
                    case "thursday":
                        System.out.printf("Your tasks for %s: %s", schedule[4][0], schedule[4][1]);
                        break;
                    case "friday":
                        System.out.printf("Your tasks for %s: %s", schedule[5][0], schedule[5][1]);
                        break;
                    case "saturday":
                        System.out.printf("Your tasks for %s: %s", schedule[6][0], schedule[6][1]);
                        break;

                }
            }
            else if (day.equals("exit")) {
                break;
            }
            else System.out.print("Sorry, I don't understand you, please try again. ");
        }
    }
}
