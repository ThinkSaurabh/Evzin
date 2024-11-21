package Evzin_AdminPortal.RPM;

import java.util.Random;

public class RandomUtil {
    private static final Random random = new Random();

    public static int generateRandomNumber(int upperBound) {
        return random.nextInt(upperBound);
    }
}

