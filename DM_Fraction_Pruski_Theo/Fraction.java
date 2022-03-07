class Fraction {
        private int num;
        private int deno;
    
        public Fraction(int n1, int n2) {
            this.num = n1;
            this.deno = n2;
        }
    
        public int getLeNumerateur() {
            return this.num;
        }
    
        public int getLeDenominateur() {
            return this.deno;
        }
    
        public Fraction Addition(Fraction fraction) {
            this.num = this.num * fraction.deno + this.deno * fraction.num;
            this.deno *= fraction.deno;
            return new Fraction(this.num, this.deno);
        }
    
        public Fraction Multiplication(Fraction fraction) {
            this.num *= fraction.num;
            this.deno *= fraction.deno;
            return new Fraction(this.num, this.deno);
        }

        public Fraction Division(Fraction fraction){
            this.num = this.num * fraction.deno;
            this.deno = this.deno* fraction.num;
            return this;
            }
    
        public void SimplifierFraction() {
            int n1 = this.PGCD(this.num, this.deno);
            this.num /= n1;
            this.deno /= n1;
            if (this.deno < 0) {
                this.num = -this.num;
                this.deno = -this.deno;
            }
        }
    
        private int PGCD(int n1, int n2) {
            while (n2 != 0) {
                int n3 = n1 % n2;
                n1 = n2;
                n2 = n3;
            }
            return n1;
        }

        public String Affichage() {
            return ("Fraction  " + this.num + "/" + this.deno
            + "\nNumérateur : " + this.num + ", Dénominateur : " + this.deno
            + " , PGCD : " + this.PGCD(this.num, this.deno));
    }
    public static void main (String args[]) {
        Fraction Frac1 = new Fraction(2, 7);
        Fraction Frac2 = new Fraction(5, 13);
        System.out.println("Fraction N1 : " + Frac1.Affichage());
        System.out.println("Fraction N2 : " + Frac2.Affichage());
        Frac1.Addition(Frac2);
        System.out.println("Addition : " + Frac1.Affichage());
        Frac1.SimplifierFraction();
        System.out.println("Simplification : " + Frac1.Affichage());
        Frac1.Division(Frac2);
        System.out.println("Division : " + Frac1.Affichage());
        Frac1.Multiplication(Frac2);
        System.out.println("Multiplication : " + Frac1.Affichage());
    }
}
