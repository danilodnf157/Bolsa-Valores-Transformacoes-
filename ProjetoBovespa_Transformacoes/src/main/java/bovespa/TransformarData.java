package bovespa;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransformarData {
    public static void transformar() {
        String inputPath = "src/main/resources/b3_stocks_1994_2020.csv";
        String outputPath = "src/main/resources/b3stocks_T1.csv";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputPath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))
        ) {
            String header = reader.readLine();
            writer.write(header);
            writer.newLine();

            String linha;
            int linhasTransformadas = 0;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(",");
                if (campos.length > 0) {
                    campos[0] = formatarData(campos[0]);
                    writer.write(String.join(",", campos));
                    writer.newLine();
                    linhasTransformadas++;
                }
            }

            System.out.println("T1 finalizado. Linhas transformadas: " + linhasTransformadas);
            System.out.println("Arquivo gerado: " + outputPath);

        } catch (IOException e) {
            System.err.println("Erro ao executar T1: " + e.getMessage());
        }
    }

    private static String formatarData(String data) {
        try {
            SimpleDateFormat original = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatada = new SimpleDateFormat("dd/MM/yyyy");
            Date date = original.parse(data);
            return formatada.format(date);
        } catch (Exception e) {
            return data;
        }
    }
}
