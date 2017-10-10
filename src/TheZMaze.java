import java.applet.AudioClip;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TheZMaze 
{
	static String Q1="pug352joel";
	static int check=0;
	
public static void main(String[] args) 
{
	new TheZMaze().getGoing();
}

private void getGoing()
{
	JFrame main = new JFrame();
	main.setTitle("The Z Maze");
	main.setVisible(true);
	main.setMaximumSize(null);
	
	playSound("POL-children-of-shadows-short.wav");
	
	//Setting a background for the story
	JOptionPane.showMessageDialog(null, "You are drifting through darkness, floating weightless in an inky black void.");
	JOptionPane.showMessageDialog(null, "Slowly you realize you are not quite awake, but coming out of unconsciousness;");
	JOptionPane.showMessageDialog(null, "you must have passed out for some reason...");
	JOptionPane.showMessageDialog(null, "When you finally wake up you find yourself in a dark tunnel,");
	JOptionPane.showMessageDialog(null, "and you're rushed movements get the attention of a man.");
	JOptionPane.showMessageDialog(null, "You soon realize that the man-like figure is no man at all,\n but a slow moving shadow making it's way towards you.");
	
	//First Question
	while (!(Q1.equals("1")) || (Q1.equals("2")) || (Q1.equals("3")) || (Q1.equals("pug352joel")))
	{
		
	if (check == 0)
	{
		
	Q1 = JOptionPane.showInputDialog(null,"What do you decide to do?\n1. Runaway\n2. Fight It\n3. Attempt to negotiate a piece\n(enter a number)");
	
	if (Q1.equals("1"))
	{
		JOptionPane.showMessageDialog(null,"You get up,\nright away you feel a stinging sensation coming from your head.");
		JOptionPane.showMessageDialog(null, "You touch your head where the pain is radiating from\nand to your surprise you find a shard of glass piercing through your skull!");
		JOptionPane.showMessageDialog(null, "Not only that put you can feel your right arm has gone limb\n and you notice your left leg has blood oozing down it.");
		JOptionPane.showMessageDialog(null, "In a desperate attempt you start walking,\nslowly putting one foot in front of the other");
		JOptionPane.showMessageDialog(null, "Feeling pain rush through your body you grunt in despair.\nThe ghoulish creature soon notices and begins to follow.");
		JOptionPane.showMessageDialog(null, "Out of fear your body flails and you lose your balance.");
		
		JOptionPane.showInputDialog(null, "Now on the floor, with the creature hovering over you, what do you do?\n1. Kick it on it’s chest\n2. Pick up rocks and chuck them at it\n3. Get back up and run again\n(enter a number)");
		
		check = 1;
	}
	
	else if (Q1.equals("2"))
	{
		JOptionPane.showMessageDialog(null,"");
		
		JOptionPane.showInputDialog(null,"");
				
		check = 1;
	}
	
	else if (Q1.equals("3"))
	{
		JOptionPane.showMessageDialog(null, "");
			
		JOptionPane.showInputDialog(null, "");
		
		check = 1;
	}
	
	else if (!(Q1.equals("1")) || (Q1.equals("2")) || (Q1.equals("3")))
	{
		JOptionPane.showMessageDialog(null, "Im sorry...\nThat is an invalid answer, please try again.");
		check = 0;
	}
	
	}
	}
	
}
	
	private void playSound(String fileName) 
	{
	   AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	   sound.play();
	}

	/*void playBackgroundMusic()
	{
		while(true)
		{
			playSound("POL-children-of-shadows-short.wav");
		}
	}
	*/
}
	//end of First Question
	
	
