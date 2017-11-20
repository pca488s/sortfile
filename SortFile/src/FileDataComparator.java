import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FileDataComparator implements Comparator<FileData> {
	protected List<String> listFields;
	
	
	public FileDataComparator(String... fields) {
		listFields = new ArrayList<>();
		for(String field:fields){
			listFields.add(field);
		}
	}
	
	@Override
	public int compare(FileData o1, FileData o2) {
		Integer score = 0;
		Boolean continueComparison = true;
		
		for(String field : listFields){
			if(continueComparison){
				int currentScore = 0;
				if(field.equals("firstName")){
					currentScore = o1.firstName.compareTo(o2.firstName);
				} else if(field.equals("lastName")){
					currentScore = o1.lastName.compareTo(o2.lastName);
				} else if(field.equals("companyName")){
					currentScore = o1.companyName.compareTo(o2.companyName);
				} else if(field.equals("address")){
					currentScore = o1.address.compareTo(o2.address);
				} else if(field.equals("city")){
					currentScore = o1.city.compareTo(o2.city);
				} else if(field.equals("country")){
					currentScore = o1.country.compareTo(o2.country);
				} else if(field.equals("state")){
					currentScore = o1.state.compareTo(o2.state);
				} else if(field.equals("zip")){
					currentScore = o1.zip.compareTo(o2.zip);
				} else if(field.equals("phone1")){
					currentScore = o1.phone1.compareTo(o2.phone1);
				} else if(field.equals("phone2")){
					currentScore = o1.phone2.compareTo(o2.phone2);
				} else if(field.equals("email")){
					currentScore = o1.email.compareTo(o2.email);
				} else if(field.equals("web")){
					currentScore = o1.web.compareTo(o2.web);
				}
				
				if (currentScore != 0) {
                    continueComparison = false;
                }
                score = currentScore;
			}else{
				break;
			}
		}
		
		return score;
	}

}
