package Ventana;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

class raton extends JFrame{
	private Graphics g;
	public raton(){
		setVisible(true);
		setBounds(700,300,600,450);
		ratonEvento r=new ratonEvento();
		addMouseMotionListener(r);
	}

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		g2d.fillOval(40, 30, 30, 30);
	}
}

class ratonEvento implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Esta arrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Esta moviendo");
	}
	
}
public class EventoRaton {
	
	public static void main(String[] args) throws InterruptedException {
		raton ob=new raton();
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
