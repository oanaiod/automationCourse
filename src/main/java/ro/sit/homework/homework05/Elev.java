package ro.sit.homework.homework05;

public class Elev {
    private String nume;
    private byte medie;

    public String getName() {
        return nume;
    }

    public byte getMedie() {
        return medie;
    }

    public Elev(String nume, byte medie)
    {
        this.nume = nume;
        this.medie = medie;
    }

    @Override
    public String toString() {
        return "Nume: " + nume +
                ", Media: " + medie;
    }
}
