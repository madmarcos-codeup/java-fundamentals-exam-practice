public class TestGetVowelCountInColorMethod {
    public static void main(String[] args) {

        Cat blackCat = new Cat(4, true, "Midnight", "black");
        Cat orangeCat = new Cat(2, true, "Dreamsicle", "ORaNGE");
        Cat whiteCat = new Cat(10, false, "Snowball", "whIte");

        System.out.println(blackCat.getVowelCountInColor()); // blackCat's color is black
        System.out.println(orangeCat.getVowelCountInColor()); // orangeCat's color is ORaNGE
        System.out.println(whiteCat.getVowelCountInColor()); // whiteCat's color is whIte

        // DONT UNCOMMENT THIS
        // OUTPUT:
        // 1
        // 3
        // 2

    }
}
