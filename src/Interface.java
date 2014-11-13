import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by root on 13.11.14.
 */
public class Interface {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String curBf;
        while (!(curBf = bf.readLine()).equals("exit")) {
            String[] inputSplit = curBf.split(" ");
            switch (inputSplit[0].toLowerCase()) {
                case "check": {
                    if (inputSplit.length >= 2) {
                        switch (inputSplit[1].toLowerCase()) {
                            case "prod": {
                                if (inputSplit.length == 3) {
                                    if (inputSplit[2].equalsIgnoreCase("all")) {
                                        Checker.checkAllProds();
                                    } else if (inputSplit[2].startsWith("#")) {
                                        Checker.checkProd(inputSplit[2].substring(1));
                                    } else {
                                        Checker.checkProd(inputSplit[2]);
                                    }

                                }
                                break;
                            }
                            case "site": {
                                if (inputSplit.length == 3) {
                                    if (inputSplit[2].equalsIgnoreCase("all")) {
                                        Checker.checkAllSites();
                                    } else if (inputSplit[2].startsWith("#")) {
                                        Checker.checkSite(inputSplit[2].substring(1));
                                    } else {
                                        Checker.checkSite(inputSplit[2]);
                                    }

                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
