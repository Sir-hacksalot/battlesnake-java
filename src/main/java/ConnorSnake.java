import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class ConnorSnake {

	static public String getBoardArray (Map <String, Object> requestBody) {
		ArrayList list = (ArrayList) requestBody.get("board");
		return list.get(0).toString();
	}

}
