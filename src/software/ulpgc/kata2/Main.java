package software.ulpgc.kata2;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EsqueletoLoader loader = new TsvFileEsqueletoLoader(new File("Skelet.txt"));
        List<Esqueleto> esqueletos = loader.load();
        Map<String, String> chart = new HashMap<>();
        for (Esqueleto esqueleto : esqueletos) {
            String nombre = esqueleto.getNombre();
            String numMemes = esqueleto.getNumMemes();
            chart.put(nombre, numMemes);
        }
            for (String key : chart.keySet()) {
                System.out.println(key + " : " + chart.get(key));

        }

    }
}
