package katas;
public class SnakesAndLadders {
    private int activePlayer;
    private int player1Position;
    private int player2Position;
    
    public SnakesAndLadders() {
        activePlayer = 1;
        player1Position = 0;
        player2Position = 0;
    }
    
    public String play(int die1, int die2) {
        int currentPlayersPosition = activePlayer == 1 ? player1Position : player2Position;
        
        String message = move(currentPlayersPosition, die1 + die2);
        
        boolean isTheSamePlayersMove = (die1 == die2);
        if (!isTheSamePlayersMove) {
            activePlayer = (activePlayer == 1) ? 2 : 1;
        }

        return message;
    }

    public String move(int activePlayerPosition, int sum) {
        //check if game is over
        if (player1Position == 100 || player2Position == 100) {
            return "Game over!";
        }
        
        // update player position
        activePlayerPosition += sum;
        
       //knock a player back if going further than square 100
       activePlayerPosition = knockPlayerBackIfNessesary(activePlayerPosition);
        
        activePlayerPosition = modifyPositionForSnakesAndLadders(activePlayerPosition);
       
        //update player position
        if (activePlayer == 1) {
            player1Position = activePlayerPosition;
        } else {
            player2Position = activePlayerPosition;
        }
        
        //check if any player won
        if (activePlayerPosition == 100) {
            return "Player " + activePlayer + " Wins!";
        }
        
        //return activePlayer position
        return "Player " + activePlayer + " is on square " + activePlayerPosition;
    }
     public int modifyPositionForSnakesAndLadders(int activePlayerPosition) {
        switch(activePlayerPosition){
          //ladders
          case 2:
          activePlayerPosition = 38;
          break;
          case 7:
          activePlayerPosition = 14;
          break;
          case 8:
          activePlayerPosition = 31;
          break;
          case 15:
          activePlayerPosition = 26;
          break;
          case 21:
          activePlayerPosition = 42;
          break;
          case 28:
          activePlayerPosition = 84;
          break;
          case 36:
          activePlayerPosition = 44;
          break;
          case 51:
          activePlayerPosition = 67;
          break;
          case 71:
          activePlayerPosition = 91;
          break;
          case 78:
          activePlayerPosition = 98;
          break;
          case 87:
          activePlayerPosition = 94;
          break;
          //snakes
          case 16:
          activePlayerPosition = 6;
          break;
          case 46:
          activePlayerPosition = 25;
          break;
          case 49:
          activePlayerPosition = 11;
          break;
          case 62:
          activePlayerPosition = 19;
          break;
          case 64:
          activePlayerPosition = 60;
          break;
          case 74:
          activePlayerPosition = 53;
          break;
          case 89:
          activePlayerPosition = 68;
          break;
          case 92:
          activePlayerPosition = 88;
          break;
          case 95:
          activePlayerPosition = 75;
          break;
          case 99:
          activePlayerPosition = 80;
          break;
        }
        return activePlayerPosition;
    }
    public int knockPlayerBackIfNessesary(int activePlayerPosition) {
        int distanceToFinalSquare = activePlayerPosition - 100;
        if (distanceToFinalSquare > 0) {
            activePlayerPosition = 100 - distanceToFinalSquare;
        }
        return activePlayerPosition;
    }
    
    
    
    
    
    
    
    
    
    
    
    private int[] players = {0,0};
    private  int currentPlayer = 0;

    private static int[] dependencies = {0, 38, 0, 0, 0, 0, 14, 31, 0, 0,
                                         0, 0, 0, 0, 26, 6, 0, 0, 0, 0,
                                         42, 0, 0, 0, 0, 0, 0, 84, 0, 0,
                                         0, 0, 0, 0, 0, 44, 0, 0, 0, 0,
                                         0, 0, 0, 0, 0, 25, 0, 0, 11, 0,
                                         67, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                         0, 19, 0, 60, 0, 0, 0, 0, 0, 0,
                                         91, 0, 0, 53, 0, 0, 0, 98, 0, 0,
                                         0, 0, 0, 0, 0, 0, 94, 0, 68, 0,
                                         0, 88, 0, 0, 75, 0, 0, 0, 80, 0
                                        }; 
    
    public String playOptimal(int die1, int die2) {  
        if(players[0] == 100 || players[1] == 100) {
            return "Game over!";
        }

        int newPosition = players[currentPlayer] + die1 + die2;

        if(newPosition > 100) {
            newPosition = 100 - (newPosition - 100);
        }
        
        
        players[currentPlayer] = dependencies[newPosition-1] != 0 ? dependencies[newPosition-1] : newPosition;
        
        String response =  "Player ";
        if(players[currentPlayer] == 100) {
           response += currentPlayer + 1 + " Wins!";
        } else {
           response += currentPlayer + 1 + " is on square " + players[currentPlayer];
        }
        
        if(die1 != die2) {
          currentPlayer = currentPlayer == 1 ? 0 : 1;
        }
        
        return response;
    }
     
}