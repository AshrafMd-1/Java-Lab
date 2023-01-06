import java.io.*;

class LineNum {
    public static void main(String args[]) {
        String thisline;
        for (int i = 0; i < args.length; i++) {
            try {
                LineNumberReader br = new LineNumberReader(new FileReader("filename.txt"));
                while ((thisline = br.readLine()) != null) {
                    System.out.println(br.getLineNumber() + "." + thisline);
                }
            } catch (IOException e) {
                System.out.println("error:" + e);
            }
        }
    }
}
