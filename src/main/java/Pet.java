public class Pet {

    protected int age;
    protected boolean isRescue;
    protected String name;

    public Pet(int age, boolean isRescue, String name) throws IllegalArgumentException {

        if (name == null){
            throw new IllegalArgumentException();
        }

        this.age = age;
        this.isRescue = isRescue;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRescue() {
        return isRescue;
    }

    public void setRescue(boolean rescue) {
        isRescue = rescue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
