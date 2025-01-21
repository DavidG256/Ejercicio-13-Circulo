public class Circulo {

    private double radio;


    public Circulo(double radio) {
        if (radio < 0) {
            this.radio = 0;
        } else {
            this.radio = radio;
        }
    }


    public double getRadio() {
        return this.radio;
    }


    public double getArea() {
        return  radio * radio * Math.PI;
    }
}

