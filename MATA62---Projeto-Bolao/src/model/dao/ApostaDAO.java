package model.dao;

import bolao.Executavel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;
import model.vo.Aposta;

/**
 *
 * @author FABIO
 */
public class ApostaDAO {

    private boolean test = false;
    private final File file = new File("registros.json");

    public void salvar(List<Aposta> lRegistros, String registros) {

        Gson gson = new Gson();

        // converte objetos Java para JSON e retorna JSON como String
        String json = gson.toJson(lRegistros);

        try {
            //Escreve Json convertido em arquivo chamado "file.json"
            FileWriter writer = new FileWriter("registros.json");
            writer.write(json);
            writer.close();

        } catch (IOException e) {
        }

        System.out.println(json);

    }

    public List<Aposta> ler(String registros) throws FileNotFoundException, IOException {
        test = file.exists();
        if (test != true) {
            System.out.println("Arquivo não existe");
        } else {
            FileInputStream fstream = new FileInputStream("registros.json");
            List<Aposta> apostas;
            try (BufferedReader br = new BufferedReader(new InputStreamReader(fstream))) {
                Gson gson = new Gson();
                Type apostaType = new TypeToken<List<Aposta>>() {
                }.getType();
                apostas = gson.fromJson(br, apostaType);
            }
            for (Aposta aposta : apostas) {
                Executavel.lApostas.add(aposta);
            }
        }
        return Executavel.lApostas;
    }
}
