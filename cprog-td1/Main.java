public class Main{


    public static void main(String[] args)
        
    {
        Fraction x = new Fraction(3,4);
        Fraction y = new Fraction (3);
        Fraction z = new Fraction ();


        //assert "1/1".equals(f1.toString()) : "l'assertion est fausse"
        //pour activer les assertions, quand j'exécute. Mettre
        // java -ea Main

        Double d = x.getDoubleValue();

        System.out.println(d);
        System.out.println(y);
        System.out.println(z);
        
    }



}