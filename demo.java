public class demo {

    static String studentName = "divya";
    static int studentId = 6789;
    static String branch = "BSc Computer Science";
    static String mobileNO = "9087654321";
    static String collegeName = "Nishitha College";

    public static void main(String[] args) {

        studentdetails();

        changestudentName("shinchan");
        changestudentId(9087);
        changebranch("BCom");
        changemobileNo("8096114129");
        changecollegeName("BCA");

        checkstudentName("shinchan");
    }

    public static void studentdetails() {

        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentId);
        System.out.println("Branch       : " + branch);
        System.out.println("Mobile No    : " + mobileNO);
        System.out.println("College Name : " + collegeName);
    }

    public static void changestudentName(String newstudentName) {

        studentName = newstudentName;
        System.out.println("Student Name updated to: " + studentName);
    }

    public static void changestudentId(int newstudentId) {

        studentId = newstudentId;
        System.out.println("Student ID updated to: " + studentId);
    }

    public static void changebranch(String newbranch) {

        branch = newbranch;
        System.out.println("Branch updated to: " + branch);
    }

    public static void changemobileNo(String newmobileNO) {

        mobileNO = newmobileNO;
        System.out.println("Mobile No updated to: " + mobileNO);
    }

    public static void changecollegeName(String newcollegeName) {

        collegeName = newcollegeName;
        System.out.println("College Name updated to: " + collegeName);
    }

    public static void checkstudentName(String enteredstudentName) {

        if (enteredstudentName.equals(studentName)) {
            System.out.println("Student Name is updated");
        } else {
            System.out.println("Student is not updated");
        }
    }
public static void checkstudentld(string enteredstudentld){

    if(enteredstudentld.equals(studentId)){
        System.out.println("student ld is updated");
    }
        else{
            System.out.println("student ld is not updated");
        }
    }
        public static void  checkbranch(string enteredbranch){

            if(enteredbranch.equals(branch)){
                System.out.println("branch is updated");
            }
            else{
                System.out.println("branch is not updated");
            }
}       public static void  checkmobileNO(string enteredmobileNO){

             if(enteredmobileNO.equals(mobileNO)){
                System.out.println("mobilNO is updated");
             }
            else{
                System.out.print("mobileNO  is not updated");
            }
        }
            public static void checkcollegeName(string enteredcollegeName){
                if(enteredcollegeName.equals(collegeName)){
                    System.out.println("collegeName is updated");
                }
                else{
                    System.out.println("collegeName is not updated");
                }
             
}
}