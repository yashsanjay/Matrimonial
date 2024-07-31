package khizr3.jdbc;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Objects;

public class Start {

	public Start() {

	}

	public static void main(String[] args)throws IOException{

		System.out.println(".>.>.>.>.>.>.>.WELCOME TO MATRIMONIAL SITE.<.<.<.<.<.<.<.\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

		System.out.println("Enter password : ");
		String password = br.readLine();

		if(Objects.equals(password, "13BallB@99")){
			System.out.println("You can access");
		}
		else{
			System.out.println("You are not admin. You cann't access.");
			return;
		}
		while(true) {

			System.out.println("Press 1 to Insert Person Information ");
			System.out.println("Press 2 to Remove User");
			System.out.println("Press 3 to exit.........");
			int c= Integer.parseInt(br.readLine());

			if(c==1) {


				System.out.println("Enter person name: ");
			String name = br.readLine();

		System.out.println("Enter person gender: ");
		String gender = br.readLine();

		System.out.println("Enter person age: ");
		String age = br.readLine();

		System.out.println("Enter person martial_status: ");
		String martial_status = br.readLine();

		System.out.println("Enter person birth_place: ");
		String birth_place = br.readLine();

		System.out.println("Enter person country: ");
		String country = br.readLine();

		System.out.println("Enter person dob: ");
		String dob = br.readLine();

		System.out.println("Enter person height: ");
		String height = br.readLine();

		System.out.println("Enter person complexion: ");
		String complexion = br.readLine();

		System.out.println("Enter person mother_tongue: ");
		String mother_tongue = br.readLine();

		System.out.println("Enter person religion: ");
		String religion = br.readLine();


			System.out.println("Enter person education: ");
			String education = br.readLine();

			System.out.println("Enter person occupation: ");
			String occupation = br.readLine();

			System.out.println("Enter person salary: ");
			String salary = br.readLine();

		System.out.println("Enter person phone_number: ");
		String phone_number = br.readLine();

			// create person object to store person
			person pr = new person( name, gender, age, martial_status, birth_place,
					 country,  dob,  height, complexion,
					   mother_tongue,  religion,  education,
					occupation, salary,  phone_number) ;

        boolean answer= Insert.insertPersonToDB(pr);
		if(answer) {
			System.out.println("Person is added successfully....");
		}else {
			System.out.println("Try again...");
		}
			System.out.println(pr);


		}else if (c==2) {


				System.out.println("Enter person id to delete : ");
				int p_id = Integer.parseInt(br.readLine());
				boolean f = Delete.deletePerson(p_id);
				if (f) {
					System.out.println("Data Deleted.........");
				} else {
					System.out.println("Something went wrong.........");
				}

			}
			else if(c==3) {
			//exit;
			System.out.println("You are successfully exit....");
			break;
		}else {

	}
	}

	System.out.println("\nThank you for using this Matrimonial Site\n Nice to see you again...");
}
}
