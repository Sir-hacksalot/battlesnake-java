import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class ConnorSnake {

	static public String getBoardArray (Map <String, Object> requestBody) {
		return requestBody.get("board").toString();
	}

}
