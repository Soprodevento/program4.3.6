import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.IOException;

public class Main {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        byte[] buffer = new byte[1024];
        int bytesRead;
        StringBuilder sb = new StringBuilder();

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            sb.append(new String(buffer, 0, bytesRead, charset));
        }
    return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[]{48, 49, 50, 51};
        InputStream inputStream = new java.io.ByteArrayInputStream(data);
        Charset charset = Charset.forName("ASCII");
        try {

        String result = readAsString(inputStream, charset);
        System.out.println(result);}
        finally {
        }
            if (inputStream != null) {
                inputStream.close(); // Закрытие InputStream
            }
    }
    }
