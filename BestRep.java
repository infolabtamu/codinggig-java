import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.lang.Integer;


public class BestRep {
	public static void main(String []args) throws Exception {
        String line;
        JSONParser parser=new JSONParser();
        int maxRep = -1;

        // open the file
        FileInputStream fis = new FileInputStream("users.json");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis, Charset.forName("UTF-8")));

        while ((line = br.readLine()) != null) {
            JSONObject user=(JSONObject)parser.parse(line);
            int rep = Integer.parseInt((String)user.get("Reputation"));
            if(rep>maxRep) {
                maxRep = rep;
                System.out.println(user);
            }
        }
        System.out.println("The user with the highest reputation has "+maxRep+" points.");
	}
}
