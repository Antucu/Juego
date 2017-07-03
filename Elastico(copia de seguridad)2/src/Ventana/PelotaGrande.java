package Ventana;

import java.awt.Color;
import java.awt.Graphics2D;

public class PelotaGrande {
	private Game juego;
	private  double x=610;
	private  double xa=0;
	private int y=40;
	private int fr=0;
	private double diametro=90;
	private  boolean bagP=true; 
	
	public PelotaGrande(Game juego){
		this.juego=juego;
	}
	
	public  void mover(){
		colision();
		x=x+xa+fr;
	}
	
	public boolean colision(){
		double X=(juego.p.getx()-x)*(juego.p.getx()-x);
		double Y=(juego.p.gety()-y)*(juego.p.gety()-y);
		double distancia=Math.sqrt(X+Y);
		double SumaRadios=(juego.p.getDiamentro()+diametro)/2;
		System.out.println("x: "+juego.p.getx()+" X:"+X+" Y: "+Y+" distancia: "+distancia+" sumaRadios: "+SumaRadios);
		if (Integer(distancia)-3<=SumaRadios && bagP==true){
			System.out.println("distancia: "+Integer(distancia)+" sumaRadios: "+SumaRadios+" X: "+x+" x: "+juego.p.getx()+" Y: "+y+" y: "+juego.p.gety());
			double Mf=juego.p.getDiamentro()/(diametro+juego.p.getDiamentro());
			bagP=false;
			xa=juego.p.getXA()*Mf;
			juego.p.setXA(0);
			fr=-1;
			System.out.println("xa: "+xa);
			return true;}
		else 
			return false;
	}
	static int Integer(double num){
		int var=(int)num;
		return var;
	}
	public void paint(Graphics2D forma){
		forma.setColor(Color.BLUE);
		forma.fillOval(IntegerP(x), y, IntegerP(diametro), IntegerP(diametro));
	}
	static int IntegerP(double num){
		int var=(int)num;
		return var;
	}
}