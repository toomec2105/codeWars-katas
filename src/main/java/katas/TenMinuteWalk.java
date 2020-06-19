package katas;

public class TenMinuteWalk {
    public static boolean isValid(char[] walk) {
        int northSouthSum = 0;
        int eastWestSum = 0;

        if (walk.length != 10) {
            return false;
        }

        for (int i = 0; i < 10; i++) {
        
            char currentDirection = walk[i];
            switch (currentDirection) {
            
                case 'n':
                    northSouthSum += 1;
                    break;
                    
                case 's':
                    northSouthSum += -1;
                    break;
                    
                case 'e':
                    eastWestSum += 1;
                    break;
                    
                case 'w':
                    eastWestSum += -1;
                    break;
            }
        }

        if (northSouthSum == 0 && eastWestSum == 0) {
            return true;
        }

        return false;
    }
}