package andre.alura.conversor.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class JsonGenerator {
    public void saveJson(Currency currency) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("Json.json");
        escrita.write(gson.toJson(currency));
        escrita.close();
    }
}
