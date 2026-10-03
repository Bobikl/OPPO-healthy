package org.oconscrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class OpenSSLEvpCipherDESEDE extends OpenSSLEvpCipher {
    private static final int DES_BLOCK_SIZE = 8;

    /* JADX INFO: renamed from: org.oconscrypt.OpenSSLEvpCipherDESEDE$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$oconscrypt$OpenSSLCipher$Padding;

        static {
            int[] iArr = new int[OpenSSLCipher.Padding.values().length];
            $SwitchMap$org$oconscrypt$OpenSSLCipher$Padding = iArr;
            try {
                iArr[OpenSSLCipher.Padding.NOPADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$oconscrypt$OpenSSLCipher$Padding[OpenSSLCipher.Padding.PKCS5PADDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class CBC extends OpenSSLEvpCipherDESEDE {

        public static class NoPadding extends CBC {
            public NoPadding() {
                super(OpenSSLCipher.Padding.NOPADDING);
            }
        }

        public static class PKCS5Padding extends CBC {
            public PKCS5Padding() {
                super(OpenSSLCipher.Padding.PKCS5PADDING);
            }
        }

        public CBC(OpenSSLCipher.Padding padding) {
            super(OpenSSLCipher.Mode.CBC, padding);
        }
    }

    public OpenSSLEvpCipherDESEDE(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        super(mode, padding);
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public void checkSupportedKeySize(int i) throws InvalidKeyException {
        if (i != 16 && i != 24) {
            throw new InvalidKeyException("key size must be 128 or 192 bits");
        }
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
        if (mode == OpenSSLCipher.Mode.CBC) {
            return;
        }
        throw new NoSuchAlgorithmException("Unsupported mode " + mode.toString());
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public void checkSupportedPadding(OpenSSLCipher.Padding padding) throws NoSuchPaddingException {
        int i = AnonymousClass1.$SwitchMap$org$oconscrypt$OpenSSLCipher$Padding[padding.ordinal()];
        if (i == 1 || i == 2) {
            return;
        }
        throw new NoSuchPaddingException("Unsupported padding " + padding.toString());
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public String getBaseCipherName() {
        return "DESede";
    }

    @Override // org.oconscrypt.OpenSSLCipher
    public int getCipherBlockSize() {
        return 8;
    }

    @Override // org.oconscrypt.OpenSSLEvpCipher
    public String getCipherName(int i, OpenSSLCipher.Mode mode) {
        return (i == 16 ? "des-ede" : "des-ede3") + "-" + mode.toString().toLowerCase(Locale.US);
    }
}
