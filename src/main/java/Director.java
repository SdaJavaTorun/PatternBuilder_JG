/**
 * Created by RENT on 2017-03-28.
 */
public class Director {

    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public CarSet getCarset(){
        return builder.getcarset();
    }

    public void build(){
        builder.newCar();
        builder.buildEngine();
        builder.buildHood();
        builder.buildLacquer();
        builder.buildWheels();
    }
}
