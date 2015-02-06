import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class GameBoard extends JPanel 
	{
	@Override
	public void paint(Graphics g) 
		{
		Graphics2D g2d = (Graphics2D) g;
		//First Line
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, 75, 40);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(75, 0, 75, 40);
		g2d.setColor(Color.RED);
		g2d.fillRect(150, 0, 75, 40);
		g2d.setColor(Color.GREEN);
		g2d.fillRect(225, 0, 75, 40);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(300, 0, 75, 40);
		g2d.fillRect(375, 0, 40, 75);
		//Second Line
		g2d.setColor(Color.PINK);
		g2d.fillRect(375, 75, 40, 75);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(300, 110, 75, 40);
		g2d.setColor(Color.RED);
		g2d.fillRect(225, 110, 75, 40);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(150, 110, 75, 40);
		g2d.setColor(Color.GREEN);
		g2d.fillRect(110, 110, 40, 75);
		//Third Line
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(110, 185, 75, 40);
		g2d.setColor(Color.GREEN);
		g2d.fillRect(185, 185, 75, 40);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(260, 185, 75, 40);
		g2d.setColor(Color.PINK);
		g2d.fillRect(335, 185, 75, 40);
		g2d.setColor(Color.GREEN);
		g2d.fillRect(410, 185, 75, 40);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(485, 185, 40, 75);
		g2d.fillRect(450, 260, 75, 40);
		//Fourth Line
		g2d.setColor(Color.RED);
		g2d.fillRect(375, 260, 75, 40);
		g2d.setColor(Color.PINK);
		g2d.fillRect(300, 260, 75, 40);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(225, 260, 75, 40);
		g2d.setColor(Color.GREEN);
		g2d.fillRect(150, 260, 75, 40);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(75, 260, 75, 40);
		g2d.fillRect(35, 260, 40, 75);
		g2d.setColor(Color.PINK);
		g2d.fillRect(35, 335, 40, 75);
		g2d.setColor(Color.GREEN);
		//Fifth Line
		g2d.fillRect(75, 370, 75, 40);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(150, 370, 75, 40);
		g2d.fillRect(225, 370, 75, 40);
		g2d.setColor(Color.BLUE);
		g2d.fillRect(300, 370, 75, 40);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(375, 370, 75, 40);
		g2d.setColor(Color.GREEN);
		g2d.fillRect(450, 370, 75, 40);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(525, 370, 40, 75);
		g2d.fillRect(490, 445, 75, 40);
		//Sixth Line
		g2d.setColor(Color.PINK);
		g2d.fillRect(415, 445, 75, 40);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(340, 445, 75, 40);
		g2d.setColor(Color.GREEN);
		g2d.fillRect(265, 445, 75, 40);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(190, 445, 75, 40);
		g2d.setColor(Color.BLUE);
		g2d.fillRect(150, 445, 40, 75);
		g2d.setColor(Color.ORANGE);
		g2d.fillRect(150, 520, 40, 75);
		g2d.fillRect(190, 555, 75, 40);
		//Seventh Line
		g2d.setColor(Color.GREEN);
		g2d.fillRect(265, 555, 75, 40);
		g2d.setColor(Color.PINK);
		g2d.fillRect(340, 555, 75, 40);
		g2d.setColor(Color.BLACK);
		g2d.fillOval(415, 525, 120, 100);
		g2d.setColor(Color.DARK_GRAY);
		g2d.fillOval(438, 545, 75, 60);
		//g2d.drawImage();
		}
	public static void main(String[] args) 
		{
		JFrame frame = new JFrame("Game of Life");
		frame.add(new GameBoard());
		frame.setSize(600, 650);
		frame.setBackground(Color.DARK_GRAY);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}


