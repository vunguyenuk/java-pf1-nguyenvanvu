package AccessModifier.VuonDiaDang;

public class Human {
    public String name;
    public int age;
    public boolean gender;

    public Human(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGender(){
        if(isGender()){
            return "male";
        } else {
            return "female";
        }
    }

    public void say(String words){
        System.out.println(words);
    }

    public void eat(Apple food){
        food.weight--;
    }

    public void sleep(){
        System.out.println("Zzzz");
    }
}
