package com.oplus.aiunit.vision;

import com.andes.crypto.entity.ConfigureEntity;
import com.andes.crypto.enums.EnvironmentType;
import com.andes.crypto.exception.AuthException;
import com.andes.crypto.scheme.ServiceBasedKMS;

/* JADX INFO: loaded from: classes5.dex */
public class b35 {
    public static int BLOCK_SIZE = 4096;
    public static final String OSEC_PUBLIC_KEY_PROD = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxsrG75If1ysuGmfLfUX660EZxxSyh/EnTuA+OZX6a09sdU6A5mbBbZ8Ir0C8IUhsSZ+XzDYzFde5FMSlelKhKW560zdKCidefGd7YofPsNkpzHIpFFKF4iXSUomk+0eBTkZi8Z9Eaa7Jol1TKLXH+/V+KrcizHT/RqBoSYtx0Xqie274K4bmxv65dV2jvzo24xSLXYyNYFAtPed7BJDA6UyBRds7w2uEeZts73RN0qNHYNBOTJ8I1NqbAshtX6YD0BLDvPyoGU9uCRs4ZUpLTp+G1jK6KRg0emtsdfygjTiwPQbOrB0s6tDGFntgy43z1lIg1yG/FZNb855vTER0/wIDAQAB";
    public static final String OSEC_PUBLIC_KEY_TEST = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAo2LepkQSgS6N+4eoZDYQZ+BTtKAZvxOuQUU6TzYXXrUMKxJQ/aOuKB3cJ+y1ZgH9sy4bk2gZUQmyfXujtXsKR2sL4/dH873aQQIMHUvyRJEqZiqRjHip+HNsD8z4HZw5zrQOA4YRbv271w14bR9yj4Kk6ykivkBFU0+khd/E6+bEQx1pQzlsrxCISUzRyd4r+yTcpfNS/ZAsxinGuqjpqfG6AFcj2gZXGEp3QeuJ53/KqjT8e09M0TU8EZHfKQQCNNT4RfRnTIzpc9EtGqSar+08gmwnA8C3BX7S2LRMVi+4jYPjZ89ydQtecqzlYqb4+UaZ1euo4Jk3kw1a12knJQIDAQAB";
    public static byte[] mCipherMaterial = null;
    public static ServiceBasedKMS mTEEServiceAndesCryptKit = null;
    public static boolean needEncrypt = true;

    public static void a() {
        try {
            mTEEServiceAndesCryptKit = new ServiceBasedKMS(ConfigureEntity.newBuilder().setEnvironment(EnvironmentType.PRODUCT).setPublicKey(OSEC_PUBLIC_KEY_PROD).build());
            i0.a("DecryptUtils", "SRW init AndesCryptKit RELEASE MODE！ ");
        } catch (AuthException e2) {
            e2.printStackTrace();
            i0.c("DecryptUtils", "init AndesCryptKit failed " + e2.toString());
        }
    }
}
