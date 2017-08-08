package JsonPackage;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonReader {

    public static StudentList read() throws FileNotFoundException {

        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/students.json"));

        StudentList response = gson.fromJson(br, StudentList.class);
        return response;
    }
}
