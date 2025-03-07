package util;

public class Contador {
    public static void Contar(int segundos) {
        for (int i = 1; i <= segundos; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
