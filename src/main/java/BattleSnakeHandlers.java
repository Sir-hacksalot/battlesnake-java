

import java.util.HashMap;
import java.util.Map;


public class BattleSnakeHandlers {
    
    public Object handleStart(Map<String, Object> requestBody) {
        // Dummy Response
        Map<String, Object> responseObject = new HashMap<String, Object>();
        responseObject.put("name", "RAID0SNAKE");
        responseObject.put("color", "#00FF00");
        responseObject.put("head_url", "static-cdn.jtvnw.net/emoticons/v1/25/1.0");
        responseObject.put("taunt", "It's RAIDing time!");
        return responseObject;
    }
    
    public Object handleMove(Map<String, Object> requestBody) {
		Object gameid = requestBody.get("game_id");
        Map<String, Object> responseObject = new HashMap<String, Object>();
        responseObject.put("move", "up");
        responseObject.put("taunt", gameid);
        return responseObject;
    }
    
    public Object handleEnd(Map<String, Object> requestBody) {
        // No response required
        Map<String, Object> responseObject = new HashMap<String, Object>();
        return responseObject;
    }

}
