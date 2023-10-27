public class Circulo extends FiguraGeometrica {
    // Atributo del circulo
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    /**
     * Calulo el area del circulo
     */
    public double calcularArea() {

        return Math.PI * radio * radio;
    }
}
