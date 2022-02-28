class Fraction {
        private int numerateur;
        private int denominateur;
    
        public Fraction(int n, int n2) {
            this.numerateur = n;
            this.denominateur = n2;
        }

        public String Affichage() {
            return ("La fraction est " + this.numerateur + "/" + this.denominateur + "." 
            + "\nLe numérateur est " + this.numerateur + ", le dénominateur est " + this.denominateur);
    }
    public static void main (String args[]) {
        Fraction Frac1 = new Fraction(2,7);
        Fraction Frac2 = new Fraction(5,13);
        System.out.println("\nLes fractions  : ");
        System.out.println("Fraction N1 : " + Frac1.Affichage());
        System.out.println("Fraction N2 : " + Frac2.Affichage());
    }
}
