package Ventana;

import java.awt.Color;
import java.awt.Graphics2D;

public class Limites {
	private Game juego;
	private static int x=170;
	private static int xa=0;
	
	public Limites(Game juego){
		this.juego=juego;
	}
	public static void mover(){
		x=x+xa;
	}
	public static void paint(Graphics2D forma){
		forma.setColor(Color.BLUE);
		forma.fillRect(40, 40, 10, 90);
	}
}