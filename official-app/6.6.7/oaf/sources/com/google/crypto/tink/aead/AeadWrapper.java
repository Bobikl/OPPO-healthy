package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class AeadWrapper implements PrimitiveWrapper<Aead, Aead> {
    private static final Logger logger = Logger.getLogger(AeadWrapper.class.getName());

    public static class WrappedAead implements Aead {
        private final PrimitiveSet<Aead> pSet;

        @Override // com.google.crypto.tink.Aead
        public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator<PrimitiveSet.Entry<Aead>> it = this.pSet.getPrimitive(bArrCopyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().getPrimitive().decrypt(bArrCopyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        AeadWrapper.logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            Iterator<PrimitiveSet.Entry<Aead>> it2 = this.pSet.getRawPrimitives().iterator();
            while (it2.hasNext()) {
                try {
                    return it2.next().getPrimitive().decrypt(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }

        @Override // com.google.crypto.tink.Aead
        public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return Bytes.concat(this.pSet.getPrimary().getIdentifier(), this.pSet.getPrimary().getPrimitive().encrypt(bArr, bArr2));
        }

        private WrappedAead(PrimitiveSet<Aead> primitiveSet) {
            this.pSet = primitiveSet;
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(new AeadWrapper());
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Aead> getInputPrimitiveClass() {
        return Aead.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Aead> getPrimitiveClass() {
        return Aead.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Aead wrap(PrimitiveSet<Aead> primitiveSet) throws GeneralSecurityException {
        return new WrappedAead(primitiveSet);
    }
}
