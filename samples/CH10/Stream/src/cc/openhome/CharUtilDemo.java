package cc.openhome;

import java.io.*;

public class CharUtilDemo {
    public static void main(String[] args) throws IOException {
        var reader = new FileReader(args[0]);
        var writer = new StringWriter();
        CharUtil.dump(reader, writer);
        System.out.println(writer.toString());
    }
}
