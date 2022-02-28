class Fraction {
        private int numerateur;
        private int denominateur;
    
        public Fraction(int n, int n2) {
            this.numerateur = n;
            this.denominateur = n2;
        }
    
        public int getLeNumerateur() {
            return this.numerateur;
        }
    
        public int getLeDenominateur() {
            return this.denominateur;
        }
    
        public Fraction Addition(Fraction fraction) {
            this.numerateur = this.numerateur * fraction.denominateur + this.denominateur * fraction.numerateur;
            this.denominateur *= fraction.denominateur;
            return new Fraction(this.numerateur, this.denominateur);
        }
    
        public Fraction Multiplication(Fraction fraction) {
            this.numerateur *= fraction.numerateur;
            this.denominateur *= fraction.denominateur;
            return new Fraction(this.numerateur, this.denominateur);
        }
    
        public void SimplifierFraction() {
            int n = this.PGCD(this.numerateur, this.denominateur);
            this.numerateur /= n;
            this.denominateur /= n;
            if (this.denominateur < 0) {
                this.numerateur = -this.numerateur;
                this.denominateur = -this.denominateur;
            }
        }
    
        private int PGCD(int n, int n2) {
            while (n2 != 0) {
                int n3 = n % n2;
                n = n2;
                n2 = n3;
            }
            return n;
        }

        public String Affichage() {
            return ("La fraction est " + this.numerateur + "/" + this.denominateur + "." 
            + "\nLe numérateur est " + this.numerateur + ", le dénominateur est " + this.denominateur
            + " et le PGCD est " + this.PGCD(this.numerateur, this.denominateur) + ".");
    }
    public static void main (String args[]) {
        Fraction Frac1 = new Fraction(2,7);
        Fraction Frac2 = new Fraction(5,13);
        System.out.println("\nLes fractions  : ");
        System.out.println("Fraction N1 : " + Frac1.Affichage());
        System.out.println("Fraction N2 : " + Frac2.Affichage());
    }
}
