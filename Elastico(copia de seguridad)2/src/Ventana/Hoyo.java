package Ventana;

import java.awt.Color;
import java.awt.Graphics2D;

public class Hoyo {
	private Game juego;
	private static int x=170;
	private static int xa=0;
	
	public Hoyo(Game juego){
		this.juego=juego;
	}
	public static void mover(){
		x=x+xa;
	}
	public static void paint(Graphics2D forma,int tam){
		if (tam==90){
			forma.setColor(Color.BLUE);
			forma.fillRect(810, 145, tam, 5);
		}
		if (tam==10){
			forma.setColor(Color.BLUE);
			forma.fillRect(805, 135, 5, tam);
			forma.setColor(Color.BLUE);
			forma.fillRect(900, 135, 5, tam);
		}
	}
}