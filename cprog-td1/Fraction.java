public class Fraction{
    private int numerateur;
    private int denominateur;

    private static final int ONE = 1;
    private static final int ZERO = 0;

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