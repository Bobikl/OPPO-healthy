package com.google.crypto.tink.mac;

import com.google.crypto.tink.Mac;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
class MacWrapper implements PrimitiveWrapper<Mac, Mac> {
    private static final Logger logger = Logger.getLogger(MacWrapper.class.getName());

    public static class WrappedMac implements Mac {
        private final byte[] formatVersion;
        private final PrimitiveSet<Mac> primitives;

        @Override // com.google.crypto.tink.Mac
        public byte[] computeMac(byte[] bArr) throws GeneralSecurityException {
            return this.primitives.getPrimary().getOutputPrefixType().equals(OutputPrefixType.LEGACY) ? Bytes.concat(this.primitives.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().computeMac(Bytes.concat(bArr, this.formatVersion))) : Bytes.concat(this.primitives.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().computeMac(bArr));
        }

        @Override // com.google.crypto.tink.Mac
        public void verifyMac(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                throw new GeneralSecurityException("tag too short");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (PrimitiveSet.Entry<Mac> entry : this.primitives.getPrimitive(bArrCopyOf)) {
                try {
                    if (entry.getOutputPrefixType().equals(OutputPrefixType.LEGACY)) {
                        entry.getPrimitive().verifyMac(bArrCopyOfRange, Bytes.concat(bArr2, this.formatVersion));
                        return;
                    } else {
                        entry.getPrimitive().verifyMac(bArrCopyOfRange, bArr2);
                        return;
                    }
                } catch (GeneralSecurityException e) {
                    MacWrapper.logger.info("tag prefix matches a key, but cannot verify: " + e);
                }
            }
            Iterator<PrimitiveSet.Entry<Mac>> it = this.primitives.getRawPrimitives().iterator();
            while (it.hasNext()) {
                try {
                    it.next().getPrimitive().verifyMac(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }

        private WrappedMac(PrimitiveSet<Mac> primitiveSet) {
            this.formatVersion = new byte[]{0};
            this.primitives = primitiveSet;
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(new MacWrapper());
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Mac> getInputPrimitiveClass() {
        return Mac.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Mac> getPrimitiveClass() {
        return Mac.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Mac wrap(PrimitiveSet<Mac> primitiveSet) throws GeneralSecurityException {
        return new WrappedMac(primitiveSet);
    }
}
