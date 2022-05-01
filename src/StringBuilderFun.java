public class StringBuilderFun {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Siddhant Tiwari");
        sb.append(" is awesome!");
        System.out.println(sb.length());
        sb.insert(8, " Kumar");
        sb.delete(8, 14);
        sb.replace(19, 26, "amazing");
        sb.replace(0, 8, "Dr.");
        System.out.println(sb);

    }
}
