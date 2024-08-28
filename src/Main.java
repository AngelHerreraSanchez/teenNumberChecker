public class Main {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));

    }


    private static boolean isTeen(int age) {
        if(age >= 13 && age <= 19){
            return true;
        }else{
            return false;
        }
    }



    private static boolean hasTeen(int age1, int age2, int age3) {
        if(isTeen(age1)){
            return true;
        }else if(isTeen(age2)){
            return true;
        }else if(isTeen(age3)){
            return true;
        }else{
            return false;
        }
    }




}
