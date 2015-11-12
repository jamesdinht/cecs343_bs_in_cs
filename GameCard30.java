package cecs343_bs_in_cs;

/**
 * Soccer Goalie
 * Play in George Allen Field
 * Prereqs: 3 Learning and 3 Craft
 * Get 5 QP and 1 Card
 * Fail: Go to Student Parking
 */
public class GameCard30 extends GameCard {

    public GameCard30() {}
    
    public GameCard30(String newName, String imageFileName, Room[] validRooms) {
        super(newName, imageFileName, validRooms);
        
        learningPreReq = 3;
        craftPreReq = 3;
        integrityPreReq = 0;
    }
        
    @Override
    public void play(Player player) {
        // Check for correct Room
        boolean validRoom = false;
        for (Room room : listOfValidRooms) {
            // Check if the player is in one of the valid Rooms
            if (player.getCurrentRoom().equals(room)) {
                validRoom = true;
                break;
            }
        }
        
        if (validRoom) {
            // Check prereqs
            if (checkPreReqs(player, learningPreReq, craftPreReq, integrityPreReq)) {
                player.updateQP(5);
//            	player.addCardToHand();
            }
//            else 
//            	player.setCurrentRoom(model.getListOfRooms().get(2));
               
        } 
        else 
            player.updateQP(INCORRECT_ROOM_QP_LOSS);
        
    }
}
