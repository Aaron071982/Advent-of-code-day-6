import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int ways = 0;
        int[] time = {60, 94, 78, 82};
        int[] distance = {475, 2138, 1015, 1650};
        int finalResult = 1;
        for(int j = 0; j<4; j++){
            ways = 0;
            for(int i = 0; i<=time[j]; i++){
                int distanceTravelled = i*(time[j]-i);
                if(distanceTravelled > distance[j]){
                    ways++;
                }
                finalResult *= ways;
            }
        }
        System.out.println(finalResult);

    }

}