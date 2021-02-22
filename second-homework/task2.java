class City {
    private String name;
    private int population;
    private int square;

    public City() {
    }

    public City(String name, int population, int square) {
        this.name = name;
        this.population = population;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }
}

public class task2 {
    public static void main(String[] args) {
        City city = new City("Rivne", 246003, 64);
    }
}
