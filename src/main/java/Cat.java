public class Cat extends Pet implements Meowable{

    private String color;

    public Cat(int age, boolean isRescue, String name, String color) {
        super(age, isRescue, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVowelCountInColor() {
        int count = 0;
        for (int i = 0; i < color.length(); i++) {
            if(color.toUpperCase().charAt(i) == 'A' || color.toUpperCase().charAt(i) == 'E' || color.toUpperCase().charAt(i) == 'I' || color.toUpperCase().charAt(i) == 'O' || color.toUpperCase().charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }

    @Override
    public void meow() {
        System.out.println("This is a meow!");
    }
}
