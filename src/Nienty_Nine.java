public class Nienty_Nine {
    public static void main(String[] args){
        int bottles = 99;
        while (bottles > 0){
            String str = String.valueOf(bottles);
            String str2 = String.valueOf(bottles - 1);

            System.out.print(str +  " Bottles of beer on the wall ,"  + str +  " bottles of bear \n");
            System.out.print("Take one down and pass it around, " + str2 + " Bottles of beer\n\n");
            bottles -= 1;
        }

        if (bottles == 0){
            System.out.print("No more bottles of beer on the wall, no more bottles of beer.\n");
            System.out.print("Go to the store and buy some more, 99 bottles of beer on the wall.\n");
        }
    }
}
