package cecs343_bs_in_cs;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public abstract class GameCard {
	
	private String gameCardName;
	private ImageIcon gameCardImage;
	private ArrayList<Room> listOfValidRooms;
	private int integrityPreReq1, craftPreReq2, learningPreReq3;
	
	//Maybe pass in the model to gamecard
		
        public GameCard() {}
        
	public GameCard(String newName, String imageFileName) {
		gameCardName = newName;
		gameCardImage = new ImageIcon(imageFileName);
	}

	public abstract void play();
}
