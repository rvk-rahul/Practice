package practice.string;

public class ValidateAnIPAddress {

    public boolean isValid(String s) {
if (s.charAt(s.length() - 1) =='.' || s.charAt(0) =='.')
    return false;
        String[] ipArray = s.split("\\.");


        if (ipArray.length != 4)
            return false;
        try {
            for (int i = 0; i < 4; i++) {
                String val = ipArray[i];

                if (val.charAt(0) == '0' && val.length() > 1)
                    return false;

                if (Integer.valueOf(val) > 255 || Integer.valueOf(val) < 0)
                    return false;
            }
        }
        catch (Exception ex) {
            return false;
        }

        return true;
    }


    public ValidateAnIPAddress() {

        System.out.println("##############################");
        System.out.println("Find smallest +ve number which is not a sum of subset of given array");
        String ip = "02.111.111.111";
        System.out.println(isValid(ip));
        ip = "0.0.0.0.";
        System.out.println(isValid(ip));
        System.out.println("##############################");
    }
}
