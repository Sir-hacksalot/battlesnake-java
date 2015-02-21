import java.util.HashMap;
import java.util.Map;


public class ConnorSnake {

	public String getBoardArray (Map <String, Object> requestBody) {
		return requestBody.get("board").getClass().toString();
	}

}
