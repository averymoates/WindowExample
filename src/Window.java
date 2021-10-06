import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.*;
import javax.swing.JFrame;

public class Window {
	
	//These are my variables for the window class.
	private static int HEIGHT;
	private static int WIDTH;
	private static String windowName;
	
	private static JFrame frame;
	private static Canvas canvas;
	
	//Constructor of the Window Class. Set the name, height, and width. Then run the createWindow() method.
	public Window(String name, int width, int height) {
		this.windowName = name;
		this.HEIGHT = height;
		this.WIDTH = width;
		
		createWindow();
	}
	
	//This is the method that actually creates the window.
	public static void createWindow() {
		frame = new JFrame(windowName);							//This sets the name.
		frame.setSize(WIDTH,HEIGHT);							//This sets the size.
		frame.setVisible(true);									//This makes the window show up on the screen.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//This will close the window when you press the x button.
		frame.setLocationRelativeTo(null);						//This will make the window appear in the middle of the screen.
		
		canvas = new Canvas();									//This is where other objects will be attached to.
		canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));	//Making sure that the size matches the window size.
		canvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		canvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		canvas.setBackground(Color.RED);						//This is to set the background.
		
		frame.add(canvas);										//Attaching the Canvas object to the JFrame object.
		frame.pack();											//PAcking everything together.
		
	}

	
}
