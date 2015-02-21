

import java.util.HashMap;
import java.util.Map;


public class BattleSnakeHandlers {
    
    public Object handleStart(Map<String, Object> requestBody) {
        // Dummy Response
        Map<String, Object> responseObject = new HashMap<String, Object>();
        responseObject.put("name", "RAID0SNAKE");
        responseObject.put("color", "#00FF00");
        responseObject.put("head_url", "i.imgur.com/9dHO5Mo.png");
        responseObject.put("taunt", "It's RAIDing time!");
        return responseObject;
    }
    
    public Object handleMove(Map<String, Object> requestBody) {
		Object gameid = requestBody.get("game_id");
        Map<String, Object> responseObject = new HashMap<String, Object>();
        responseObject.put("move", "up");
        responseObject.put("taunt", requestBody.get("board"));
        return responseObject;
    }
    
    public Object handleEnd(Map<String, Object> requestBody) {
        // No response required
        Map<String, Object> responseObject = new HashMap<String, Object>();
        return responseObject;
    }

}
