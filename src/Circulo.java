
public class Circulo extends Figura {
    private double radio;

    public Circulo(){
        this.radio = 0;
    }

    public Circulo(double radio){
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimetro() {
        return 0;
    }
}
