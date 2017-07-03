package Ventana;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Game extends JPanel {
	pelota p=new pelota(this);
	PelotaGrande pG=new PelotaGrande(this);
	Rango r=new Rango(this);
	Limites lim=new Limites(this);
	Piso pis=new Piso(this);
	Hoyo hoyo=new Hoyo(this);
	
	public void paint(Graphics g){
		Graphics2D obj=(Graphics2D) g;
		p.paint(obj);
		lim.paint(obj);
		pis.paint(obj);
		pG.paint(obj);
		for (int i=50;i<=150;i=i+50){
			r.paint(obj,i);
		}
		int aux=90;
		while (aux>=10){
			hoyo.paint(obj,aux);
			aux=aux-10;
		}
	}
	
	private void mover(){
		p.mover();
		pG.mover();
	}
	public Game() {
		KeyListener listener = new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				p.keyPressed(e);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				p.keyReleased(e);
			}
		};
		addKeyListener(listener);
		setFocusable(true);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Elastico");
		Game keyboardExample = new Game();
		frame.add(keyboardExample);
		frame.setSize(1500, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		while (true){
			keyboardExample.mover();
			keyboardExample.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}