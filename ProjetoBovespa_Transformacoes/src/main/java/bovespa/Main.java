package bovespa;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Iniciando execuções das transformações ===");

        System.out.println("[1] T1 - Transformar datas");
        TransformarData.transformar();

        System.out.println("[2] F1 - Filtrar maior volume por dia");
        FiltrarMediaDiaria.filtrarMaiorVolume();

        System.out.println("[3] Filtro - Volume acima da média");
        Funcoes.filtrarAcimaMedia();

        System.out.println("=== Transformações concluídas ===");
    }
}
