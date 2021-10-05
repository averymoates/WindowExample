import java.awt.Color;

import javax.swing.JFrame;

public class Window {
	
	//These are my variables for the window class.
	private static int HEIGHT;
	private static int WIDTH;
	private static String windowName;
	
	//Constructor of the Window Class. Set the name, height, and width. Then run the createWindow() method.
	public Window(String name, int width, int height) {
		this.windowName = name;
		this.HEIGHT = height;
		this.WIDTH = width;
		
		createWindow();
	}
	
	//This is the method that actually creates the window.
	public static void createWindow() {
		JFrame frame = new JFrame(windowName);	//This sets the name.
		frame.setSize(WIDTH,HEIGHT);			//This sets the size.
		
		frame.setBackground(Color.RED);
		frame.setVisible(true);					//This makes the window show up on the screen.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//This will close the window when you press the x button.
		frame.setLocationRelativeTo(null);		//This will make the window appear in the middle of the screen.
		frame.pack();
		
	}

	
}
