package khizr3.jdbc;

public class person {

	 int personId;
	 String personName;
	 String gender;
	 String age;
	
	 String martial_Status;
	 String birth_place;     
	 String country;
	
	 String date_of_birth;
	 String height;
	 String complexion;
	 String mother_Tongue;
	
      String religion;

      String education;
      String occupation;
      String salary;
      String phone_number;
	
	
	public person(int personId, String personName, String gender, String age, String martial_Status, String birth_place,
			String country, String date_of_birth, String height,   String complexion,
			 String mother_Tongue, String religion,  String education,
			String occupation, String salary, String phone_number) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.gender = gender;
		this.age = age;
		this.martial_Status = martial_Status;
		this.birth_place = birth_place;
		this.country = country;
		this.date_of_birth = date_of_birth;
		this.height = height;
		
		
		this.complexion = complexion;
		
		this.mother_Tongue = mother_Tongue;
		this.religion = religion;

		this.education = education;
		this.occupation = occupation;
		this.salary = salary;
		this.phone_number = phone_number;
	}

	public person(String personName, String gender, String age, String martial_Status, String birth_place,
			String country, String date_of_birth, String height,  String complexion,
			 String mother_Tongue, String religion, String education,
			String occupation, String salary, String phone_number) {
		super();
		this.personName = personName;
		this.gender = gender;
		this.age = age;
		this.martial_Status = martial_Status;
		this.birth_place = birth_place;
		this.country = country;
		this.date_of_birth = date_of_birth;
		this.height = height;
		
		
		this.complexion = complexion;
		
		this.mother_Tongue = mother_Tongue;
		this.religion = religion;

		this.education = education;
		this.occupation = occupation;
		this.salary = salary;
		this.phone_number = phone_number;
	}

	public person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMartial_Status() {
		return martial_Status;
	}

	public void setMartial_Status(String martial_Status) {
		this.martial_Status = martial_Status;
	}

	public String getBirth_place() {
		return birth_place;
	}

	public void setBirth_place(String birth_place) {
		this.birth_place = birth_place;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	

	

	public String getComplexion() {
		return complexion;
	}

	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}

	

	public String getMother_Tongue() {
		return mother_Tongue;
	}

	public void setMother_Tongue(String mother_Tongue) {
		this.mother_Tongue = mother_Tongue;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}





	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "person [personId=" + personId + ", personName=" + personName + ", gender=" + gender + ", age=" + age
				+ ", martial_Status=" + martial_Status + ", birth_place=" + birth_place + ", country=" + country
				+ ", date_of_birth=" + date_of_birth + ", height=" + height + ", complexion=" + complexion
				+ ", mother_Tongue=" + mother_Tongue + ", religion=" + religion + ",  education="
				+ education + ", occupation=" + occupation + ", salary=" + salary + ", phone_number=" + phone_number
				+ "]";
	}
	
	 

	

	

}
