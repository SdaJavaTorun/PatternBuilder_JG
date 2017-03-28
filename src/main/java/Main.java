/**
 * Created by RENT on 2017-03-28.
 */
public class Main {


    public static void main(String[] args){
        Director director = new Director();
        Builder tesla = new Tesla();

        System.out.println("Auto1");

        director.setBuilder(tesla);
        director.build();

        CarSet carset = director.getCarset();
        System.out.println(carset.toString());


    }
}
