
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class SnakeGet {


		ArrayList rows = (ArrayList) requestBody.get("board");
		int width = rows.size();
		ArrayList columns = (ArrayList) rows.get(0);
		int height = columns.size();

		int ourSnakeX = 0;
		int ourSnakeY = 0;

		ArrayList snakeList = (ArrayList) requestBody.get("snakes");

		for (int i=0; i<snakeList.size(); i++) {
			HashMap snake = (HashMap) snakeList.get(i);
			if ( ((String) snake.get("name")).equals("RAID0SNAKE")) {
				ArrayList coords = (ArrayList) snake.get("coords");
				ArrayList head = (ArrayList) coords.get(0);
				ourSnakeX = ((Integer) head.get(0)).intValue();
				ourSnakeY = ((Integer) head.get(1)).intValue();
			}
		}

		String dir;

		

		int turn = Integer.parseInt(requestBody.get("turn").toString());
		String dir;

		if (turn%4 == 0) {
			dir = "up";
		}
		else if (turn%4 == 1) {
			dir = "right";
		}
		else if (turn%4 == 2) {
			dir = "down";
		}
		else {
			dir = "left";
		}
	

		
				

        Map<String, Object> responseObject = new HashMap<String, Object>();
        responseObject.put("move", dir);
        responseObject.put("taunt", "" + ourSnakeX + "," + ourSnakeY);
        return responseObject;
    }
    
    public Object handleEnd(Map<String, Object> requestBody) {
        // No response required
        Map<String, Object> responseObject = new HashMap<String, Object>();
        return responseObject;
    }

}
