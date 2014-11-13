/**
 * Created by root on 13.11.14.
 */
public class Checker {
    public static void checkProd(int number) {
        try {
            System.out.println("Checking Prod #" + number);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void checkProd(String prodName) {
        System.out.println("Checking Prod " + prodName);
    }

    public static void checkAllProds() {
        System.out.println("Checking all Prods");
    }

    public static void checkSite(String url) {
        System.out.println("Checking url = " + url);
    }

    public static void checkAllSites() {
        System.out.println("Checking all sites");
    }
}
