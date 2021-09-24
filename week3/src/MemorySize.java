import java.text.DecimalFormat;

public class MemorySize {
    public static void main (String[] args) {
        System.out.println("32GB => " + actualSize("32GB"));
        System.out.println("2GB => " + actualSize("2GB"));
        System.out.println("512MB => " + actualSize("512MB"));
    }

    public static String actualSize(String s) {
        String out = "";

        DecimalFormat df = new DecimalFormat("#.##");

        String format = s.substring(s.length()-2);
        double num = Double.parseDouble(s.substring(0, s.length()-2));
        num = num * 97/100;

        if (num == 1) {
            num = num * 1024;
            format = "MB";
        }

        if (format.equals("GB")) {
            float y = (float)num;
            y = y * 0.93f;
            out = y + format;
        } else if (format.equals("MB")) {
            num = (double)(num * 0.93f);
            out = num + format;
        }

        return out;
    }
}
