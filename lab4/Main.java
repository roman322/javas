
package date;

import java.io.IOException;

/**
 *
 * @author rmoch
 */
public class Main {

    public static void main(String args[]) {
        StringProcessor stringProcessor = new StringProcessor();
        String finalStr = "";
        try {
            finalStr = stringProcessor.readInputText();
        } catch (IOException e) {
        }
         finalStr = stringProcessor.processText(finalStr);
             
        stringProcessor.showResult(finalStr);
    }
}
