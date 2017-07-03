package Ventana;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rango {
	private Game juego;
	private static int x=200;
	private static int xa=0;
	public Rango(Game juego){
		this.juego=juego;
	}
	public static void mover(){
		x=x+xa;
	}
	public static void paint(Graphics2D forma,int pos){
		if (pos==50){
			forma.setColor(Color.RED);
			forma.fillRect(pos, 135, 50, 10);}
		if (pos==100){
			forma.setColor(Color.YELLOW);
			forma.fillRect(pos, 135, 50, 10);}
		if (pos==150){
			forma.setColor(Color.GREEN);
			forma.fillRect(pos, 135, 50, 10);}
	}
}