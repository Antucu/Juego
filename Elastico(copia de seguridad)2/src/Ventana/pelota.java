package Ventana;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class pelota {
	private Game juego;
	private  double x=170;
	private  double y=100;
	private  double xa=0;
	private  boolean bag=true;
	private double diametro=30;
	
	public double gety(){
		return y;
	}
	public double getx(){
		return x;
	}
	public double getDiamentro(){
		return diametro;
	}
	public int getXA(){
		int V=(int)xa;
		return V;
	}
	public void setXA(double num){
		xa=num;
	}
	public pelota(Game juego){
		this.juego=juego;
	}
	public void mover(){
		if(x<=50 && bag==true)
			x=x+1;
		if(x>=170 && bag==true)
			x=x-1;
		x=x+xa;
	}
	public void paint(Graphics2D forma){
		forma.setColor(Color.BLUE);
		forma.fillOval(Integer(x), Integer(y), Integer(diametro), Integer(diametro));
	}
	
	public  void keyPressed(KeyEvent e) {
		bag=true;
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = -1;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = 1;
	}

	public  void keyReleased(KeyEvent e) {
		double Ax=(x-200)/10;
		xa = (5*(Ax*Ax))/diametro;
		bag=false;
		System.out.println("Se solto "+Ax+" x: "+x+"xA: "+xa);
		
	}
	static int Integer(double num){
		int var=(int)num;
		return var;
	}
}
/*Formula
 * E0=Ef
 * Ee=K
 * v=(k*x*x)/m
 * +++++++++
 * p0=pf
 * pa0=paf+pbf
 * mV0a=mVfa+MVfb
 * Vf=(V0a)m/(m+M)
 */
