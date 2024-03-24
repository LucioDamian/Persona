package app;

import modelos.Circulo;
import modelos.Rectangulo;

public class Main {

	public static void main(String[] args) {
        
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println("Rectangulo 1:");
        System.out.println(rectangulo1.toString());
        System.out.println("Área: " + rectangulo1.obtenerArea());
        System.out.println("Perímetro: " + rectangulo1.obtenerPerimetro());
        
        
        Rectangulo rectangulo2 = new Rectangulo(3.0, 4.0);
        System.out.println("Rectangulo 2:");
        System.out.println(rectangulo2.toString());
        System.out.println("Área: " + rectangulo2.obtenerArea());
        System.out.println("Perímetro: " + rectangulo2.obtenerPerimetro());
        
        
        rectangulo2.setBase(5.0);
        rectangulo2.setAltura(6.0);
        System.out.println("Rectangulo 2 (después de modificar la base y la altura):");
        System.out.println(rectangulo2.toString());
        System.out.println("Área: " + rectangulo2.obtenerArea());
        System.out.println("Perímetro: " + rectangulo2.obtenerPerimetro());
        
        
        
     
        Circulo circulo1 = new Circulo();
        System.out.println("Círculo 1:");
        System.out.println(circulo1.toString());
        System.out.println("Área: " + circulo1.obtenerArea());
        System.out.println("Perímetro: " + circulo1.obtenerPerimetro());

        Circulo circulo2 = new Circulo(3.5);
        System.out.println("\nCírculo 2:");
        System.out.println(circulo2.toString());
        System.out.println("Área: " + circulo2.obtenerArea());
        System.out.println("Perímetro: " + circulo2.obtenerPerimetro());
        
        
        
    }
	
	
        
    
	
	
}
