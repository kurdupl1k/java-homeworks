class Country {
    private String name;
    private String capital;
    private String language;
    private int population;
    private int square;

    public Country() {
    }

    public Country(String name, String capital, String language, int population, int square) {
        this.name = name;
        this.capital = capital;
        this.language = language;
        this.population = population;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

public class task3 {
    public static void main(String[] args) {
        Country country = new Country("Ukraine", "Kyiv", "Ukrainian", 41588354, 603628);
    }
}
