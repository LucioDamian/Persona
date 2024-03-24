package modelos;

public class Rectangulo extends Figura {

	    /**
	     * Default constructor
	     */
	    public Rectangulo() {
	    	 this.base = 1.0;
	         this.altura = 1.0;
	    }
		/**
	     * 
	     */
	    private double base;

	    /**
	     * 
	     */
	    private double altura;

	    /**
	     * 
	     */
	    public double obtenerArea() {
	        return base * altura;
	    }

	    /**
	     * 
	     */
	    public double obtenerPerimetro() {
	        return 2 * (base + altura);
	    }

	    /**
	     * @param double base 
	     * @param double altura
	     */
	    public Rectangulo(double base, double altura) {
	    	this.base = base;
	        this.altura = altura;
	    }

	    /**
	     * @return
	     */
	    public double getBase() {
	        // TODO implement here
	        return 0.0d;
	    }

	    /**
	     * @param value
	     */
	    public void setBase(double value) {
	        // TODO implement here
	    }

	    /**
	     * @return
	     */
	    public double getAltura() {
	        // TODO implement here
	        return 0.0d;
	    }

	    /**
	     * @param value
	     */
	    public void setAltura(double value) {
	        // TODO implement here
	    }

	    /**
	     * @return 
	     * 
	     */
	    @Override
	    public String toString() {
	        return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	    }

	}

