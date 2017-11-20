import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<FileData> listFileData = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("us-500.csv"));

			for(String line = br.readLine(); line != null; line = br.readLine()){
				String values[] = line.replace("\"", "").split(",");
				FileData fd = new FileData(values[0], values[1], values[2], values[3], values[4], values[5], values[6], values[7], 
						values[8], values[9], values[10], values[11]);
				listFileData.add(fd);
			}
			
			Collections.sort(listFileData, new FileDataComparator("city","lastName","firstName"));
			for(FileData data: listFileData){
				System.out.println(data.city+" "+data.lastName);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
