package ro.sit.homework.homework05;

public class Dogs {

    private String nume;
    private String talie;
    private Byte varsta;
    private String rasa;

    public Dogs(String nume, String talie, String rasa, Byte varsta)
    {
        this.nume = nume;
        this.talie = talie;
        this.rasa = rasa;
        this.varsta = varsta;
    }

    public String getName() {
        return nume;
    }
    public String getTalie() {
        return talie;
    }
    public String getRasa() {
        return rasa;
    }
    public Byte getVarsta() {
        return varsta;
    }

    @Override
    public String toString() {
        return "Nume: " + nume +
                ", Talie: " + talie +
                ", Rasa: " + rasa +
                ", Varsta: " + varsta.toString() + " ani";
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Dogs)
        {
            Dogs temp = (Dogs) obj;
            if(this.nume.equals(temp.nume) && this.talie.equals(temp.talie) && this.rasa.equals(temp.rasa) && this.varsta.equals(temp.varsta))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.nume.hashCode() + this.talie.hashCode() + this.rasa.hashCode() + this.varsta.hashCode());
    }

}
