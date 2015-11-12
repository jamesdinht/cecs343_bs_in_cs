package cecs343_bs_in_cs;

/**
 * Choosing a Major
 * Play in CECS Conference
 * Prereq: 3 Integrity
 * Get 5 QP
 * Fail: Lose 3 QP
 */
public class GameCard19 extends GameCard {

    public GameCard19() {}
    
    public GameCard19(String newName, String imageFileName, Room[] validRooms) {
        super(newName, imageFileName, validRooms);
        
        learningPreReq = 0;
        craftPreReq = 0;
        integrityPreReq = 3;
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
            if (checkPreReqs(player, learningPreReq, craftPreReq, integrityPreReq))
                player.updateQP(5);
            else 
                player.updateQP(-3);
            
        } else 
             player.updateQP(INCORRECT_ROOM_QP_LOSS);
        
    }

}
