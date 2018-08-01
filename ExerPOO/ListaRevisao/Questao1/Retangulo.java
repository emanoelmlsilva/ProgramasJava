public class Retangulo{    

        private double largura;
        private double altura;

        public Retangulo(){
            this.largura = 0;
            this.altura = 0;
        }

        public Retangulo(double largura,double altura){
            this.largura = largura;
            this.altura = altura;
        }

        public String toString(){
            return "Retangulo\naltura "+this.altura+"\nlargura "+this.largura+"\nperimetro "+this.perimetroRetangulo()+"\narea "+this.areaRetangulo();
        }

        public boolean equals(Retangulo retangulo2){
            if(this.largura == retangulo2.getLargura() && this.altura == retangulo2.getAltura()) return true;

            return false;
        }

        public double getAltura(){
            return this.altura;
        }

        public void setAltura(double altura){
            this.altura = altura;
        }

        public double getLargura(){
            return this.largura;
        }

        public void setLargura(double largura){
            this.largura = largura;
        }

        public double perimetroRetangulo(){
            return 2*(this.altura + this.largura);
        }

        public double areaRetangulo(){
            return this.largura * this.altura;
        }    
}