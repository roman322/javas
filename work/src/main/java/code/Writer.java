package code;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writer {
    public void writeToFile(final List<Party> partiesList) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter("F:\\Project/decoration.csv"))) {

            partiesList.forEach((Party party) -> {
                writer.println(party.getHeaders());
                writer.println(party.toCSV());
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}