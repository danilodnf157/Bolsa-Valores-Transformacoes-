package bovespa;

import java.io.*;
import java.util.*;

public class FiltrarMediaDiaria {
    public static void filtrarMaiorVolume() {
        String input = "src/main/resources/b3stocks_T1.csv";
        String output = "src/main/resources/b3stocks_F1.csv";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(input));
            BufferedWriter writer = new BufferedWriter(new FileWriter(output))
        ) {
            String header = reader.readLine();
            writer.write(header);
            writer.newLine();

            Map<String, String[]> maiorVolumePorData = new HashMap<>();
            int total = 0;

            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(",");
                if (campos.length < 7) continue;

                String data = campos[0];
                double volume = Double.parseDouble(campos[6]);

                if (!maiorVolumePorData.containsKey(data) ||
                    volume > Double.parseDouble(maiorVolumePorData.get(data)[6])) {
                    maiorVolumePorData.put(data, campos);
                }
            }

            for (String[] campos : maiorVolumePorData.values()) {
                writer.write(String.join(",", campos));
                writer.newLine();
                total++;
            }

            System.out.println("F1 finalizado. Registros únicos por dia: " + total);
            System.out.println("Arquivo gerado: " + output);

        } catch (IOException e) {
            System.err.println("Erro ao executar F1: " + e.getMessage());
        }
    }
}
