package date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {
public String readInputText() throws IOException {
// TODO: add error handling here
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	System.out.print("Enter String");
        	String str = br.readLine();
return str;
}
public  String processText(String str) {
    int count=0;
    String[] allMatches = new String[1];
    Matcher m = Pattern.compile("(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d").matcher(str);
    while (m.find()) {
        allMatches[count] = m.group();
    }
    String finalStr = Arrays.toString(allMatches);
    return finalStr;
}

public void showResult(String newstr /* or pass your class instance as parameter */) {
	System.out.println(newstr + " ");
} 
 
}
