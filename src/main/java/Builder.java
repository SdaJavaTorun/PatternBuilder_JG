/**
 * Created by RENT on 2017-03-28.
 */
public abstract class Builder {

    protected CarSet carset;
    public void newCar() {
        carset = new CarSet();
    }

    public CarSet getcarset(){
        return carset;
    }

    public abstract void buildEngine();
    public abstract void buildHood();
    public abstract void buildLacquer();
    public abstract void buildWheels();
    public abstract void buildSeats();


}
