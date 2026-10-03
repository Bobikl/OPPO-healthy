package com.platform.usercenter.tools.algorithm;

import com.platform.usercenter.tools.log.UCLogUtil;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
public class RandomFactory {
    public static final int DEFAULT_SEED_LENGTH = 24;
    private static String TAG = "RandomFactory";

    public static Random generateRandom() {
        return generateSecureRandom(24);
    }

    public static SecureRandom generateSecureRandom(int i) {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e2) {
            UCLogUtil.e(TAG, e2.getMessage());
            secureRandom = new SecureRandom();
        }
        secureRandom.nextBytes(new byte[20]);
        secureRandom.setSeed(secureRandom.generateSeed(i));
        return secureRandom;
    }

    public static Random generateRandom(int i) {
        return generateSecureRandom(i);
    }
}
