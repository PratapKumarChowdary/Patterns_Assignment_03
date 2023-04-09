public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        StringBuffer sbf = new StringBuffer("Hii");

        sb.append(" Kuchi"); 
        sbf.append(" Pratap"); 

        System.out.println(sb); // print Hello Kuchi
        System.out.println(sbf); // prints Hii Pratap
    }
}
