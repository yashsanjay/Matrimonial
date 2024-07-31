package Khizr2.jdbc;

import khizr3.jdbc.Delete;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class SearchAndUpdateMain {

        public static void main(String[] args) throws Exception{
            int choice = -1;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            SearchAndUpdateMethods con = new SearchAndUpdateMethods();

            do {


                System.out.println("1. Search By ID(Primary Key).............");
                System.out.println("2. Search By Gender...........");
                System.out.println("3. Search By Gender,Religion..........");
                System.out.println("4. Search By Gender,Age,Martial_Status, Complexion, Religion, Occupation, Salary...........");
                System.out.println("5. Search By Age(Numeric Field).............. ");
                System.out.println("6. Updating Name,DOB columns of the existing table.........  ");
                System.out.println("7. Updating Four Diff columns of the existing table.........  ");
                System.out.println("8. Updating Six Diff columns of the existing table.........  ");
                System.out.println("9. Updating Five Diff columns of the existing table.........  ");
                System.out.println("10. Updating Multiple columns of the existing table.........  ");


                System.out.println("11. Delete your profile.........  ");
                System.out.println("12. Exit");

                System.out.println("Enter Your Choice");

                choice = Integer.parseInt(br.readLine());




                switch (choice){


                    case 1:
                        System.out.println("Enter value to Search By ID(Primary Key)");
                        int  p_id = Integer.parseInt(br.readLine());
                        con.searchById(p_id);
                        break;

                    case 2:
                        System.out.println("Enter value to Search By Gender");
                        String gen = br.readLine();
                        con.searchByGender(gen);
                        break;

                    case 3:
                        System.out.println("Enter values to Search By Gender and Religion..........");

                        System.out.println("Enter Gender: ");
                        String Gen = br.readLine();

                        System.out.println("Enter Religion: ");
                        String rel = br.readLine();

                        con.searchByGenderAndReligion(Gen, rel);
                        break;

                    case 4:
                        System.out.println("Enter values to Search By Gender,Age,Martial_Status, Complexion, Religion, Occupation and Salary.........");

                        System.out.println("Enter Gender: ");
                        String gend = br.readLine();

                        System.out.println("Enter Age: ");
                        int  aGe = Integer.parseInt(br.readLine());

                        System.out.println("Enter Martial Status: ");
                        String m_s = br.readLine();

                        System.out.println("Enter Complexion: ");
                        String comp = br.readLine();

                        System.out.println("Enter Religion: ");
                        String Rel = br.readLine();

                        System.out.println("Enter Occupation: ");
                        String Occup = br.readLine();

                        System.out.println("Enter Salary: ");
                        String Sal = br.readLine();


                        con.searchByMultipleAttributes(gend,aGe,m_s,comp,Rel,Occup,Sal);
                        break;
                    case 5:
                        System.out.println("Enter value to search by Age(Numeric field)....");
                        System.out.println("Enter Age: ");
                          aGe = Integer.parseInt(br.readLine());

                          con.searchByAge(aGe);






//Updating Values

                    case 6:



                        System.out.println("Do You want to update values\nIf yes then write 'YES' otherwise write 'NO' : ");
                        String val = br.readLine();


                        if(Objects.equals(val, "YES")){
                            System.out.println("Yaa..........You can update.............");
                        }

                        else{
                            System.out.println("Sorry.....You cann't update..........");
                            break;
                        }

                        System.out.println("Enter Values to update.... ");

                        System.out.println("Enter ID to Update Name and Date Of Birth....");
                        int id = Integer.parseInt(br.readLine());

                        System.out.println("Enter correct name : ");
                        String naam = br.readLine();

                        System.out.println("Enter correct Date Of Birth : ");
                        String dob = br.readLine();
                         con.updateNameAndDob(naam,dob,id);
                        break;
                    case 7:

                        System.out.println("Do You want to update values\nIf yes then write 'YES' otherwise write 'NO' : ");
                        val = br.readLine();


                        if(Objects.equals(val, "YES")){
                            System.out.println("Yaa..........You can update.............");
                        }

                        else{
                            System.out.println("Sorry.....You cann't update..........");
                            break;
                        }

                        System.out.println("Enter Values to update.... ");

                        System.out.println("Enter ID to update  : ");
                        p_id = Integer.parseInt(br.readLine()) ;

                        System.out.println("Enter correct Name : ");
                        naam = br.readLine();

                        System.out.println("Enter correct Gender : ");
                        String gender = br.readLine();

                        System.out.println("Enter correct Age : ");
                        int age = Integer.parseInt(br.readLine());

                        System.out.println("Enter correct Martial Status : ");
                        m_s = br.readLine();

                        con.UpdatingFourCol(naam, gender, age,m_s,p_id);

                    case 8:

                        System.out.println("Do You want to update values\nIf yes then write 'YES' otherwise write 'NO' : ");
                        val = br.readLine();


                        if(Objects.equals(val, "YES")){
                            System.out.println("Yaa..........You can update.............");
                        }

                        else{
                            System.out.println("Sorry.....You cann't update..........");
                            break;
                        }

                        System.out.println("Enter Values to update.... ");

                        System.out.println("Enter ID to update  : ");
                        p_id = Integer.parseInt(br.readLine()) ;

                        System.out.println("Enter correct Birth Place : ");
                        String b_p= br.readLine();

                        System.out.println("Enter correct Country : ");
                        String country = br.readLine();

                        System.out.println("Enter correct Date Of Birth : ");
                        dob = br.readLine();

                        System.out.println("Enter correct Height : ");
                        String height = br.readLine();

                        System.out.println("Enter correct Complexion : ");
                        comp = br.readLine();

                        System.out.println("Enter correct Mother Tongue : ");
                        String mT = br.readLine();

                        con.UpdatingSixDiffCol(b_p,country,dob,height, comp,mT, p_id);

                    case 9:

                        System.out.println("Do You want to update values\nIf yes then write 'YES' otherwise write 'NO' : ");
                        val = br.readLine();


                        if(Objects.equals(val, "YES")){
                            System.out.println("Yaa..........You can update.............");
                        }

                        else{
                            System.out.println("Sorry.....You cann't update..........");
                            break;
                        }

                        System.out.println("Enter Values to update.... ");

                        System.out.println("Enter ID to update  : ");
                        p_id = Integer.parseInt(br.readLine()) ;

                        System.out.println("Enter correct Name : ");
                        naam = br.readLine();

                        System.out.println("Enter correct Education : ");
                        String edu = br.readLine();

                        System.out.println("Enter correct Occupation  : ");
                        String occup = br.readLine();

                        System.out.println("Enter correct Salary : ");
                        String sal = br.readLine();

                        System.out.println("Enter correct Phone_Number : ");
                        String ph = br.readLine();

                        con.UpdatingFiveDiffCol(naam,edu,occup,sal,ph,p_id);

                    case 10:


                        System.out.println("Do You want to update values\nIf yes then write 'YES' otherwise write 'NO' : ");
                         val = br.readLine();


                        if(Objects.equals(val, "YES")){
                            System.out.println("Yaa..........You can update.............");
                        }

                        else{
                            System.out.println("Sorry.....You cann't update..........");
                            break;
                        }

                        System.out.println("Enter Values to update.... ");

                        System.out.println("Enter ID to update  : ");
                        p_id = Integer.parseInt(br.readLine()) ;

                        System.out.println("Enter correct Name : ");
                        naam = br.readLine();

                        System.out.println("Enter correct Gender : ");
                        gender = br.readLine();

                        System.out.println("Enter correct Age : ");
                         age = Integer.parseInt(br.readLine());

                        System.out.println("Enter correct Martial Status : ");
                        m_s = br.readLine();

                        System.out.println("Enter correct Birth Place : ");
                        b_p= br.readLine();

                        System.out.println("Enter correct Country : ");
                        country = br.readLine();

                        System.out.println("Enter correct Date Of Birth : ");
                        dob = br.readLine();

                        System.out.println("Enter correct Height : ");
                         height = br.readLine();

                        System.out.println("Enter correct Complexion : ");
                        comp = br.readLine();

                        System.out.println("Enter correct Mother Tongue : ");
                         mT = br.readLine();

                        System.out.println("Enter correct Religion : ");
                        rel = br.readLine();

                        System.out.println("Enter correct Education : ");
                         edu = br.readLine();

                        System.out.println("Enter correct Occupation  : ");
                       occup = br.readLine();

                        System.out.println("Enter correct Salary : ");
                         sal = br.readLine();

                        System.out.println("Enter correct Phone_Number : ");
                        ph = br.readLine();




                        con.UpdatingMultipleCol(naam, gender, age,m_s, b_p,country,dob,height, comp,mT,rel,edu,occup,sal,ph,p_id);

                    case 11:
                        System.out.println("Enter person id to delete : ");
                        int P_id = Integer.parseInt(br.readLine());
                        boolean f = Delete.deletePerson(P_id);
                        if (f) {
                            System.out.println("Data Deleted.........");
                        } else {
                            System.out.println("Something went wrong.........");
                        }


                        case 12:
                        con.close();
                        System.out.println("..................See You Again...................");
                        break;
                }

            }while(choice!=0);

        }
    }

