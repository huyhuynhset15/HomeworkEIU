import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static InputReader inputReader = new InputReader(System.in);

    public static void main(String[] args) throws IOException {
        int n = inputReader.nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            String name=inputReader.next();
            int m = inputReader.nextInt();
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += inputReader.nextInt();
            }
            double k = (double) sum / m;
            persons[i]= new Person(name,k);
        }
        Arrays.sort(persons, (p1, p2) ->
            Double.compare(p2.averageScore, p1.averageScore)
        );
        if (n == 1) {
            System.out.println(persons[0].name);
        } else {
            System.out.println(persons[0].name + "\n" + persons[1].name);
        }
    }

    static class Person {
        String name;
        double averageScore;

        public Person(String name, double averageScore) {
            this.name = name;
            this.averageScore = averageScore;
        }
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