class Fraction {
    private int num;
    private int denom;

    public Fraction() {
    }

    public Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }
}

public class task4 {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(5, 7);
    }
}
