
import java.util.HashMap;
import java.util.Map;

public class BattleSnakeHandlers {
    
    public Object handleStart(Map<String, Object> requestBody) {
        Map<String, Object> responseObject = new HashMap<String, Object>();
        responseObject.put("name", "RAID0SNAKE");
        responseObject.put("color", "#00FF00");
        responseObject.put("head_url", "i.imgur.com/9dHO5Mo.png");
        responseObject.put("taunt", "It's RAIDing time!");
        return responseObject;
    }
    
    public Object handleMove(Map<String, Object> requestBody) {
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
        responseObject.put("taunt", ConnorSnake.getBoardArray(requestBody));
        return responseObject;
    }
    
    public Object handleEnd(Map<String, Object> requestBody) {
        // No response required
        Map<String, Object> responseObject = new HashMap<String, Object>();
        return responseObject;
    }

}
