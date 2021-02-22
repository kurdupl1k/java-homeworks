import java.util.Date;

class Car {
    private String name;
    private String manufacturer;
    private Date release;
    private int engine_volume;

    public Car(String name, String manufacturer, Date release, int engine_volume) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.release = release;
        this.engine_volume = engine_volume;
    }

    public void print() {
        System.out.printf("Car's name: %s\n", name);
        System.out.printf("Car's manufacturer: %s\n", manufacturer);
        System.out.printf("Car's release: %s\n", release.toString());
        System.out.printf("Car's engine volume: %d\n", engine_volume);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public int getEngine_volume() {
        return engine_volume;
    }

    public void setEngine_volume(int engine_volume) {
        this.engine_volume = engine_volume;
    }
}

public class task6 {
    public static void main(String[] args) {
        Car car = new Car("Huracan",
                "Lamborghini",
                new Date(2014, 3, 16),
                5);

        car.print();
    }
}
