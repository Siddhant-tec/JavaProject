public class StringMethods2 {
    public static void main(String[] args){
        String myName = "Siddhant Tiwari";
        String upperName = myName.toUpperCase();
        String lowerName = myName.toLowerCase();

        String lastname = myName.substring(9);
        int whereisT = myName.indexOf(" ");

        System.out.println(upperName + " " + lowerName + " " + lastname + " " + whereisT);
    }
}
