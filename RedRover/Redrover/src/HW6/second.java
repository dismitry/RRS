package HW6;

public class second {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i)=='е') {
                count++;}}
                System.out.print(count);
            }
        }