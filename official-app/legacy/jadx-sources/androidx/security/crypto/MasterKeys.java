package androidx.security.crypto;

import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.heytap.omas.a.b.a;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes12.dex */
public final class MasterKeys {
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    static final String KEYSTORE_PATH_URI = "android-keystore://";
    private static final int KEY_SIZE = 256;
    static final String MASTER_KEY_ALIAS = "_androidx_security_master_key_";

    @NonNull
    public static final KeyGenParameterSpec AES256_GCM_SPEC = createAES256GCMKeyGenParameterSpec(MASTER_KEY_ALIAS);

    private MasterKeys() {
    }

    @NonNull
    private static KeyGenParameterSpec createAES256GCMKeyGenParameterSpec(@NonNull String str) {
        return new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings(a.k).setKeySize(256).build();
    }

    private static void generateKey(@NonNull KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(keyGenParameterSpec);
        keyGenerator.generateKey();
    }

    @NonNull
    public static String getOrCreate(@NonNull KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException, IOException {
        validate(keyGenParameterSpec);
        if (!keyExists(keyGenParameterSpec.getKeystoreAlias())) {
            generateKey(keyGenParameterSpec);
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }

    private static boolean keyExists(@NonNull String str) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore.containsAlias(str);
    }

    @VisibleForTesting
    public static void validate(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        }
        if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{a.k})) {
            if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            }
        } else {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        }
    }
}
