package day5;

import java.applet.AudioClip;
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.sun.org.apache.bcel.internal.generic.IfInstruction;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {

	BufferedImage maze;
	final int frameWidth = 800;
	final int frameHeight = 600;

	ScaryMaze() throws Exception {

		maze = ImageIO.read(getClass().getResource("Scary Unicow.jpg"));

		new Robot().mouseMove(100, 145);

		// addMouseMotionListener(this)
		addMouseMotionListener(this);

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);

		System.out.println(mouseColor);

		Integer Background = -7216664;
		
		if (mouseColor == Background) {
			scare();
		}
		// call the scare method

		
if (mouseColor == -11807308) {
	JOptionPane.showMessageDialog(null, "YOU WIN!!! Now move ur mouse !");
}
		

	}

	boolean playing = false;

	private void scare() {
		System.out.println("BOO!");
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("pink unicorns .wav"));

		if (!playing)
			sound.play();
		
		showScaryImage("pink unicorn.jpg");
		// method to scare your victim!
		playing = true;
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("June's Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

}
