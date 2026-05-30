import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Chooser {

    FileReader reader = new FileReader("books.json");

    Gson gson = new Gson();

    Type type = new TypeToken<ArrayList<Book>>(){}.getType();

    public ArrayList<Book> books = gson.fromJson(reader, type);

    reader.close();

}