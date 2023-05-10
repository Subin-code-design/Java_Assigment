public class Reverse_string {
    public static String reverse(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] arg)
    {
        System.out.println(Reverse_string.reverse("Malayalam"));

    }
}
