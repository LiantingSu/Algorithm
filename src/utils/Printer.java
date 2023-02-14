package utils;

public class Printer {
    public static void print(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            sb.append(array[i]);
            sb.append(", ");
        }
        sb.append(array[array.length-1]);
        sb.append(" ]");
        System.out.println(sb.toString());
    }
}
