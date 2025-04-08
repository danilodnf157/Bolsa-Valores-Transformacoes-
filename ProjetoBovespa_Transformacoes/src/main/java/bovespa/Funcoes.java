package bovespa;

import java.io.*;
import java.util.*;

public class Funcoes {
    public static void filtrarAcimaMedia() {
        String input = "src/main/resources/b3stocks_T1.csv";
        String output = "src/main/resources/b3stocks_T1_acimaMedia.csv";

        List<String> linhas = new ArrayList<>();
        double soma = 0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
            String header = reader.readLine();
            linhas.add(header);

            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(",");
                if (campos.length < 7) continue;

                soma += Double.parseDouble(campos[6]);
                linhas.add(linha);
                count++;
            }

            double media = soma / count;
            System.out.println("Média de volume calculada: " + media);

            int total = 0;
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
                writer.write(header);
                writer.newLine();

                for (int i = 1; i < linhas.size(); i++) {
                    String[] campos = linhas.get(i).split(",");
                    double volume = Double.parseDouble(campos[6]);
                    if (volume > media) {
                        writer.write(linhas.get(i));
                        writer.newLine();
                        total++;
                    }
                }
            }

            System.out.println("Filtro acima da média finalizado. Total: " + total);
            System.out.println("Arquivo gerado: " + output);

        } catch (IOException e) {
            System.err.println("Erro ao executar filtro de média: " + e.getMessage());
        }
    }
}
