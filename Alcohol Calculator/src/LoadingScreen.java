import java.awt.Color;
import java.awt.event.MouseEvent;
import acm.graphics.GImage;
import acm.graphics.GObject;

public class LoadingScreen extends GraphicsPane {
	private MainApplication program; 

	private GImage bg;
	private GImage title;
	private EnterInfoScreen EnterInfoScreen;
	
	
	public LoadingScreen(MainApplication app) {
		super();
		program = app;
		
		bg = new GImage("bg2.png", 0, 0);
		title = new GImage("title.png", 100, 100);
		
		EnterInfoScreen = new EnterInfoScreen(app);
		
//		dif = new GImage("TitleImage/TITLE_DIFFICULTY.png", 50, 25);
//		dif.setSize(500, 50);
//	
//		X = new GButton("X",750, 0, 50, 50);
//		X.setFillColor(Color.RED);
//		
//		easy = new GImage("Button/EASY0.png", 50, 150);
//		medium = new GImage("Button/MEDIUM0.png",300, 150);
//		hard = new GImage("Button/HARD0.png", 550, 150);
	}

	@Override
	public void showContents() 
	{
		program.add(bg);
		program.add(title);
//		program.add(X);
//		program.add(easy);
//		program.add(medium);
//		program.add(hard);
//		program.add(dif);
	}

	@Override
	public void hideContents() 
	{
		program.add(bg);
		program.add(title);
//		program.remove(X);
//		program.remove(easy);
//		program.remove(medium);
//		program.remove(hard);
//		program.remove(dif);
	}

	private GObject obj;
	
	@Override
	public void mousePressed(MouseEvent e) 
	{
		program.switchToScreen(EnterInfoScreen);
//		obj = program.getElementAt(e.getX(), e.getY());
//		
//		if(obj == X)
//		{
//			program.startGame();
//		}
//		else if(obj == easy)
//		{
//			program.switchToDraft(true , 1);
//		}
//		else if(obj == medium)
//		{
//			program.switchToDraft(true , 2);
//		}
//		else if(obj == hard)
//		{
//			program.switchToDraft(true , 3);
//		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
//		obj = program.getElementAt(e.getX(), e.getY());
//		
//		if(obj == easy) {
//			easy.setImage("Button/EASY1.png");
//		}
//		else if (obj == medium) {
//			medium.setImage("Button/MEDIUM1.png");
//		}
//		else if (obj == hard) {
//			hard.setImage("Button/HARD1.png");
//		}
//		else {
//			easy.setImage("Button/EASY0.png");
//			medium.setImage("Button/MEDIUM0.png");
//			hard.setImage("Button/HARD0.png");
//			
//		}
	}
}