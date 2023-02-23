import java.util.ArrayList;

public class TestUpperCaseCatColorMethod {

    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();

        Cat blackCat = new Cat(4, true, "Midnight", "black");
        Cat whiteCat = new Cat(10, false, "Snowball", "white");
        Cat orangeCat = new Cat(2, true, "Dreamsicle", "orange");

        cats.add(blackCat);
        cats.add(whiteCat);
        cats.add(orangeCat);

        cats = AssessmentReview.uppercaseCatColor(cats);

        cats.forEach(cat -> System.out.println(cat.getColor()));

        // DONT UNCOMMENT THIS
        // OUTPUT:
        // BLACK
        // WHITE
        // ORANGE

    }
}
