import java.util.ArrayList;
import java.util.Arrays;

public class AssessmentReview {

    public static int cubed(int num) {
        return num * num * num;
    }

    public static int difference(int x, int y) {
        return x - y;
    }

    public static double difference(double x, double y) {
        return x - y;
    }

    public static double median(int[] numArray) {
        Arrays.sort(numArray);
        double median;
        if (numArray.length % 2 == 0) {
            median = ((double) numArray[numArray.length / 2] + (double) numArray[numArray.length / 2 - 1]) / 2;
        }
        else {
            median = (double) numArray[numArray.length / 2];
        }
        return median;
    }

    public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat> cats) {
        ArrayList<Cat> catOutput = new ArrayList<>();

        for (Cat cat : cats) {
            cat.setColor(cat.getColor().toUpperCase());
            catOutput.add(cat);
        }

        return catOutput;
    }


}
