public class StringMethods1 {
    public static void main(String[] args){
        String name = "Siddhant Tiwari";
        String name2 = "Siddhant Tiwari";
        String name3 = "Ashish Tiwari";

        int n = 0;
        while(n < name.length()){
            System.out.print(name.charAt(n) + " ");
            n += 1;

        }
        if (name.equals(name2)){
            System.out.println("\nNames are equal");
        }

        if (name.compareTo(name3) > 0){
            System.out.println(name + " is greater than " +  name3);
        }
        else {
            System.out.println(name + "is leas than or equal to " + name3);
        }
        System.out.println(name.compareTo(name3));
    }
}
