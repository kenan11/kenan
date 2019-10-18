import java.util.Random;
import java.util.Scanner;

public class AreaShooting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        int first;
        int second;
        while(true ){
            first =random.nextInt(6);
            second = random.nextInt(6);
            if(first!=0&&second!=0){
                break;
            }
        }

        String[][] array = new String[6][6];
        array[0][0] = "0";
        array[0][1] = "1";
        array[0][2] = "2";
        array[0][3] = "3";
        array[0][4] = "4";
        array[0][5] = "5";
        array[1][0] = "1";
        array[2][0] = "2";
        array[3][0] = "3";
        array[4][0] = "4";
        array[5][0] = "5";



        for(int i = 1;i<6;i++){
            for(int j = 1 ;j<6;j++){
                array[i][j] = "-";
            }
        }

        for(int i =0;i<6;i++){
            for(int j = 0;j<6;j++){
                System.out.print(array[i][j]);
            }
        }
        System.out.println("");

        System.out.println("All set. Get ready to rumble!");
        while(true){
            int your_first;
            int your_second;
            while(true){
                your_first = sc.nextInt();
                your_second = sc.nextInt();
                if((your_first>=1&&your_first<=5)&&(your_second>=1&&your_second<=5)){
                    break;
                }else{
                    System.err.println("Your numbers must be between 1 and 5!!! ");
                    System.out.println("Please enter your numbers again");
                }
            }

            if(your_first==first&&your_second==second){
                array[your_first][your_second] = "X" ;
                System.out.println("You are won");
                break;
            }else{
                array[your_first][your_second] = "*";
            }
            for(int i =0;i<6;i++){
                for(int j = 0;j<6;j++){
                    System.out.print(array[i][j]);
                }
            }
        }

        for(int i =0;i<6;i++){
            for(int j = 0;j<6;j++){
                System.out.print(array[i][j]);
            }
        }
    }
}
