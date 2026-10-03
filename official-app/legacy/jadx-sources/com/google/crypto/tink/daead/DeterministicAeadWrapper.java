package com.google.crypto.tink.daead;

import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes14.dex */
public class DeterministicAeadWrapper implements PrimitiveWrapper<DeterministicAead, DeterministicAead> {
    private static final Logger logger = Logger.getLogger(DeterministicAeadWrapper.class.getName());

    public static class WrappedDeterministicAead implements DeterministicAead {
        private PrimitiveSet<DeterministicAead> primitives;

        public WrappedDeterministicAead(PrimitiveSet<DeterministicAead> primitiveSet) {
            this.primitives = primitiveSet;
        }

        @Override // com.google.crypto.tink.DeterministicAead
        public byte[] decryptDeterministically(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator<PrimitiveSet.Entry<DeterministicAead>> it = this.primitives.getPrimitive(bArrCopyOfRange).iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().getPrimitive().decryptDeterministically(bArrCopyOfRange2, bArr2);
                    } catch (GeneralSecurityException e2) {
                        DeterministicAeadWrapper.logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e2.toString());
                    }
                }
            }
            Iterator<PrimitiveSet.Entry<DeterministicAead>> it2 = this.primitives.getRawPrimitives().iterator();
            while (it2.hasNext()) {
                try {
                    return it2.next().getPrimitive().decryptDeterministically(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }

        @Override // com.google.crypto.tink.DeterministicAead
        public byte[] encryptDeterministically(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return Bytes.concat(this.primitives.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().encryptDeterministically(bArr, bArr2));
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(new DeterministicAeadWrapper());
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<DeterministicAead> getInputPrimitiveClass() {
        return DeterministicAead.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<DeterministicAead> getPrimitiveClass() {
        return DeterministicAead.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public DeterministicAead wrap(PrimitiveSet<DeterministicAead> primitiveSet) {
        return new WrappedDeterministicAead(primitiveSet);
    }
}
