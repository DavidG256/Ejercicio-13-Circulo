public class mainEJ13 {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(7);
        System.out.println("Radio del círculo: " + circulo.getRadio());
        System.out.println("Área del círculo: " + circulo.getArea());


        Cilindro cilindro = new Cilindro(3, 6);
        System.out.println("Volumen del cilindro: " + cilindro.getVolume());


    }
}

