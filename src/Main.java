import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<ChessPlayer> players = CSVFileChessPlayerLoader.with("C:\\Users\\Pablo\\IdeaProjects\\Archivos\\Chess FIDE rankings.csv").load();
        Map<String, Integer> histogram = new ELOHistogramCalculator(players).calculate();
        for (String key : histogram.keySet().stream().sorted().toList()) {
            System.out.println(key + " " + histogram.get(key));
        }
    }
}
