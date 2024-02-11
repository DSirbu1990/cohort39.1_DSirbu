package Bird;

public class Bird {
    public String bird;

   void fly (boolean fly){
       if (fly == true) {
           System.out.println("Это птица умеет летать");
       } else {
           System.out.println("Это птица не умеет летать");
       }
    }

    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }




}
