public class exercise1 {

    static boolean iwillBehave = true;
    static boolean iwillGraduate = true;
    public static void main(String[] args) throws Exception {

        //precondition
        assert iwillBehave == true: "Magpapakabait";

        College();

        //postcondition
        assert iwillGraduate == false: "Makakapagtapos";


    }

    static void College(){

        iwillGraduate = false;
        System.out.println("Lezgow!");
    }
}
