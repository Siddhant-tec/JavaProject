public class Phrase_O_Matic {
    public static void main(String[] args){
        String[] s = {"a", "act", "ball", "lick", "sun"};
        int length = s.length;
        int random = (int) (Math.random() * length);
        System.out.print(length + " " + random);
        System.out.print("\nRandom is" + " " + s[random]);

    }
}
