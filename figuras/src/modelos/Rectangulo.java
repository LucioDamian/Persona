package modelos;
/*
 * Clase que representa el rectagunlo
 * 
 * @version 1.0
 * 
 * @author Damian
 */
public class Rectangulo extends Figuras{
	private double base;
	private double altura;
	/*
	 * Constructor por defecto. Crea un rectangulo con base y altura, en metros.
	 */
	public Rectangulo() {
		this.base = 1;
		this.altura = 1;
	}
	/*
	 * Constructor que recibe como parametros la base y la altura del rectangulo en metros.
	 * 
	 * @param base		la base del rectangulo, en metros
	 * @param altura 	la altura del rectngulo, en metros
	 */
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	/*
	 * @see modelos.Figuras#area()
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	/*
	 * @see modelos.Figuras#perimetro()
	 */
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
