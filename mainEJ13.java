public class mainEJ13 {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(7);
        System.out.println("Radio círculo: " + circulo.getRadio());
        System.out.println("Área círculo: " + circulo.getArea());


        Cilindro cilindro = new Cilindro(3, 6);
        System.out.println("Volumen cilindro: " + cilindro.getVolume());


    }
}

