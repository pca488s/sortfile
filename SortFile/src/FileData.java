
public class FileData {

	//"first_name","last_name","company_name","address","city","county","state","zip","phone1","phone2","email","web"
	public String firstName;
	public String lastName;
	public String companyName;
	public String address;
	public String city;
	public String country;
	public String state;
	public String zip;
	public String phone1;
	public String phone2;
	public String email;
	public String web;

	public FileData(){
		
	}

	public FileData(String firstName, String lastName, String companyName, String address, String city, String country,
			String state, String zip, String phone1, String phone2, String email, String web) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.state = state;
		this.zip = zip;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.email = email;
		this.web = web;
	}
	
	
	@Override
	public String toString() {
		return "FileData [firstName=" + firstName + ", lastName=" + lastName + ", companyName=" + companyName
				+ ", address=" + address + ", city=" + city + ", country=" + country + ", state=" + state + ", zip="
				+ zip + ", phone1=" + phone1 + ", phone2=" + phone2 + ", email=" + email + ", web=" + web + "]";
	}
}
