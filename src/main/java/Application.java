import java.util.Arrays;
import java.util.Comparator;

// Comparable<Class> best method to compare classes using Comparable interface
class Tuple implements Comparable<Tuple>{
    public int a, b;

    public Tuple(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "a=" + a + ", b=" + b;
    }

    @Override
    public int compareTo(Tuple o) {
        if(this.b != o.b) {
            return this.b - o.b;
        } else {
            return this.a - o.a;
        }
    }
}

public class Application {
    public static void main(String[] args) {
        Tuple[] arr = new Tuple[4];
        arr[0] = new Tuple(10, 11);
        arr[1] = new Tuple(20, 11);
        arr[2] = new Tuple(100, 5);
        arr[3] = new Tuple(5, 100);

        // sort(arr, new Comparator<Class>()) method to compare classes using Comparator interface
        Arrays.sort(arr, new Comparator<Tuple>() {
            @Override
            public int compare(Tuple o1, Tuple o2) {
                if (o1.b != o2.b) {
                    return o1.b - o2.b;
                } else {
                    return o1.a - o2.a;
                }
            }
        });

        // lambda
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.b != o2.b) {
                return o1.b - o2.b;
            } else {
                return o1.a - o2.a;
            }
        });

        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i].toString());
        }
    }
}