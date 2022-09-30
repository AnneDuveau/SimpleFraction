public class Fraction{

    // attributs
    private int numerateur;
    private int denominateur;

    public static final Fraction ONE = new Fraction(1);
    public static final Fraction ZERO = new Fraction();



    // Constructeurs
    public Fraction(int numerateur, int denominateur){
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int denominateur){ 
        this.numerateur = 1;
        this.denominateur = denominateur;    
    }

    public Fraction(){ 
        this.numerateur = 0;
        this.denominateur = 1;    
    }


    // méthodes
    public int getNumerateur()
    {
        return numerateur;
    }

    public int getDenominateur()
    {
        return denominateur;
    }



    @Override
    public String toString() {
    return numerateur +"/"+ denominateur;
    
    

    

   }
}