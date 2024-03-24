package modelos;

public class Circulo extends Figura{

	/**
     * Default constructor
     */
    public Circulo() {
    	this.radio = 1.0;
    }

    /**
     * 
     */
    private double radio;

    /**
     * @param radio
     */
    public Circulo(double radio) {
    	this.radio = radio;
    }

    /**
     * 
     */
    public double obtenerArea() {
    	return Math.PI * radio * radio;
    }

    /**
     * 
     */
    public double obtenerPerimetro() {
    	return 2 * Math.PI * radio;
    }

    /**
     * @return
     */
    public double getRadio() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param value
     */
    public void setRadio(double value) {
        // TODO implement here
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }
	
}
