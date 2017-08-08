package JsonPackage;

import com.google.gson.Gson;
import java.io.*;

public class JsonReader {

    public static StudentList read() {

        Gson gson = new Gson();
        BufferedReader br;
        br = null;
        try {
            br = new BufferedReader(new FileReader("src/main/resources/students.json"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        StudentList response = gson.fromJson(br, StudentList.class);
        return response;
    }
}
