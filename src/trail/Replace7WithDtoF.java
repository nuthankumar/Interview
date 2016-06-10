package trail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Davidvilla
 */
public class Replace7WithDtoF {

	public static void main(String... a) {
		try {

			FileReader fileReader = new FileReader("C:/Users/Davidvilla/Desktop/test.txt");
			BufferedReader br = new BufferedReader(new FileReader(
					"C:/Users/Davidvilla/Desktop/test.txt"));// or r
			List<String> fileContents = new ArrayList<String>();
			try {
				String b = "";
				while (b != null) {
					b = br.readLine();
					fileContents.add(b);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)
						br.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			String line7 = fileContents.get(6).replaceAll("line", "line #");
			fileContents.remove(6);
			fileContents.add(6, line7);
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					"C:/Users/Davidvilla/Desktop/test.txt"));
			try {
				for (String s : fileContents) {
					if (s!=null) {
						bw.write(s);
						bw.write("\n");
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (bw != null) {
					try {
						bw.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			// fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}