public class Main {
    public static void main(String[] args) {
        String str = "Kuchi ";
        StringBuffer sb = new StringBuffer("Kuchi");

        
        str += " Pratap";
        sb.append(" Kumar");

       
        System.out.println("String: " + str);
        System.out.println("StringBuffer: " + sb);
    }
}

