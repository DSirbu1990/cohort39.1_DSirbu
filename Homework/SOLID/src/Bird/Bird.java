package Bird;

public class Bird {
    public String bird;

    public Bird(String bird) {
        this.bird = bird;
    }

    public void fly (){
        System.out.println( "Это птица умеет летать");
    }

    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }
}
