import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static InputReader inputReader = new InputReader(System.in);

    public static void main(String[] args) throws IOException {
        long N = inputReader.nextLong();
        long [] arr = new long[(int) N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = inputReader.nextInt();
            sum = sum + arr[i];

        }
        System.out.println(sum * 2);

    }
}

class InputReader {
    StringTokenizer tokenizer;
    BufferedReader reader;
    String token;
    String temp;

    public InputReader(InputStream stream) {
        tokenizer = null;
        reader = new BufferedReader(new InputStreamReader(stream));
    }

    public InputReader(FileInputStream stream) {
        tokenizer = null;
        reader = new BufferedReader(new InputStreamReader(stream));
    }

    public boolean hasNext() throws IOException {
        if (tokenizer != null && tokenizer.hasMoreTokens()) {
            return true;
        }
        temp = reader.readLine();
        return (temp != null && temp.length() > 0);
    }

    public String nextLine() throws IOException {
        return reader.readLine();
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                if (temp != null) {
                    tokenizer = new StringTokenizer(temp);
                    temp = null;
                } else {
                    tokenizer = new StringTokenizer(reader.readLine());
                }

            } catch (IOException e) {
            }
        }
        return tokenizer.nextToken();
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }
}