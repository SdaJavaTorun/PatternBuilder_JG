/**
 * Created by RENT on 2017-03-28.
 */
public class CarSet {

    private String engine;
    private String hood;
    private String lacquer;
    private String wheels;
    private String seats;


    @Override
    public String toString() {
        return "CarSet{" +
                "engine='" + engine + '\'' +
                ", hood='" + hood + '\'' +
                ", lacquer='" + lacquer + '\'' +
                ", wheels='" + wheels + '\'' +
                ", seats='" + seats + '\'' +
                '}';
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getHood() {
        return hood;
    }

    public void setHood(String hood) {
        this.hood = hood;
    }

    public String getLacquer() {
        return lacquer;
    }

    public void setLacquer(String lacquer) {
        this.lacquer = lacquer;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }
}
