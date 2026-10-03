package com.andes.crypto.scheme;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.andes.crypto.api.AndesCryptoKit;
import com.andes.crypto.engine.EngineAesGCMCipher;
import com.andes.crypto.engine.EngineFileCipher;
import com.andes.crypto.engine.EngineTransCipher;
import com.andes.crypto.entity.ConfigureEntity;
import com.andes.crypto.exception.AuthException;
import com.andes.crypto.proto.AndesCryptoKitProto;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.oplus.aiunit.vision.fkf;
import com.oplus.aiunit.vision.mwi;
import com.oplus.aiunit.vision.re4;
import com.oplus.aiunit.vision.x6b;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public final class ServiceBasedKMS implements AndesCryptoKit {
    private static final int CIPHER_MATERIAL_LENGTH = 342;
    private static final String TAG = "ServiceBasedKMS";
    private final String mPublicKey;

    public ServiceBasedKMS(@NonNull ConfigureEntity configureEntity) throws AuthException {
        if (TextUtils.isEmpty(configureEntity.getPublicKey())) {
            x6b.a(TAG, "init", "public key is null!");
            throw new AuthException("public key is null!");
        }
        this.mPublicKey = configureEntity.getPublicKey();
    }

    private AndesCryptoKitProto.CipherMaterial createCipherMaterial(byte[] bArr, boolean z) {
        byte[] bArrC = re4.c(this.mPublicKey, bArr);
        if (bArrC == null) {
            x6b.a(TAG, "createCipherMaterial", "encrypt key by rsa failed!");
            return null;
        }
        byte[] bArrD = fkf.e().d(bArr);
        if (bArrD != null) {
            return AndesCryptoKitProto.CipherMaterial.newBuilder().setIV(ByteString.copyFrom(re4.b(16))).setPublickKeyCipherDEK(ByteString.copyFrom(bArrC)).setTEECipherDEK(ByteString.copyFrom(bArrD)).setHmac(z ? 2 : 1).build();
        }
        x6b.a(TAG, "createCipherMaterial", "encrypt key by keystore failed!");
        return null;
    }

    @Override // com.andes.crypto.api.AndesCryptoKit
    public EngineAesGCMCipher newEngineAesGCMCipher(byte[] bArr) throws InvalidProtocolBufferException {
        AndesCryptoKitProto.CipherMaterial from;
        if (bArr == null) {
            byte[] bArrA = re4.a();
            if (bArrA == null) {
                x6b.a(TAG, "newEngineAesGCMCipher", "create key failed!");
                return null;
            }
            from = createCipherMaterial(bArrA, false);
        } else {
            from = AndesCryptoKitProto.CipherMaterial.parseFrom(bArr);
        }
        if (from == null) {
            x6b.a(TAG, "newEngineAesGCMCipher", "cipher material is null!");
            return null;
        }
        byte[] bArrC = fkf.e().c(from.getTEECipherDEK().toByteArray());
        if (bArrC != null) {
            return new EngineAesGCMCipher(bArrC, from.toByteArray());
        }
        x6b.a(TAG, "newEngineAesGCMCipher", "decrypt key failed!");
        return null;
    }

    @Override // com.andes.crypto.api.AndesCryptoKit
    public EngineFileCipher newEngineFileCipher(int i, byte[] bArr, InputStream inputStream, int i2) throws IOException {
        AndesCryptoKitProto.CipherMaterial from;
        if (i != 1) {
            if (bArr == null) {
                if (inputStream == null) {
                    x6b.a(TAG, "newEngineFileCipher", "inputStream and cipherMaterial are null!");
                    throw new IllegalArgumentException("at least one of the inputStream and cipherMaterial must not be null!");
                }
                bArr = new byte[CIPHER_MATERIAL_LENGTH];
                mwi.a(inputStream, bArr, 0, CIPHER_MATERIAL_LENGTH);
            }
            from = AndesCryptoKitProto.CipherMaterial.parseFrom(bArr);
        } else if (bArr == null) {
            byte[] bArrA = re4.a();
            if (bArrA == null) {
                x6b.a(TAG, "newEngineFileCipher", "create key failed!");
                return null;
            }
            from = createCipherMaterial(bArrA, false);
        } else {
            from = AndesCryptoKitProto.CipherMaterial.parseFrom(bArr).toBuilder().setIV(ByteString.copyFrom(re4.b(16))).build();
        }
        if (from == null) {
            x6b.a(TAG, "newEngineFileCipher", "cipher material is null!");
            return null;
        }
        byte[] bArrC = fkf.e().c(from.getTEECipherDEK().toByteArray());
        if (bArrC != null) {
            return new EngineFileCipher(i, from.toByteArray(), bArrC, inputStream, i2);
        }
        x6b.a(TAG, "newEngineFileCipher", "decrypt key failed!");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.andes.crypto.api.AndesCryptoKit
    public EngineTransCipher newEngineTransCipher(int i, byte[] bArr, InputStream inputStream, boolean z) throws IOException {
        AndesCryptoKitProto.CipherMaterial from;
        byte[] bArrC;
        byte[] bArr2;
        if (i == 1) {
            if (bArr == null) {
                bArrC = re4.a();
                if (bArrC == null) {
                    x6b.a(TAG, "newEngineTransCipher", "create key failed!");
                    return null;
                }
                from = createCipherMaterial(bArrC, z);
            } else {
                from = AndesCryptoKitProto.CipherMaterial.parseFrom(bArr).toBuilder().setIV(ByteString.copyFrom(re4.b(16))).setHmac(z ? 2 : 1).build();
            }
            if (from == null) {
                x6b.a(TAG, "newEngineTransCipher", "cipher material is null!");
                return null;
            }
            if (bArrC == null) {
                bArrC = fkf.e().c(from.getTEECipherDEK().toByteArray());
            }
            bArr2 = bArrC;
            if (bArr2 != null) {
                x6b.a(TAG, "newEngineTransCipher", "decrypt key failed!");
                return null;
            }
            try {
                return new EngineTransCipher(i, from.toByteArray(), bArr2, from.getIV().toByteArray(), inputStream, z);
            } catch (UnsupportedOperationException e2) {
                throw e2;
            } catch (Exception e3) {
                e3.printStackTrace();
                x6b.a(TAG, "newEngineTransCipher", "new Engine failed!");
                return null;
            }
        }
        if (bArr == null) {
            if (inputStream == null) {
                x6b.a(TAG, "newEngineTransCipher", "inputStream and cipherMaterial are null!");
                throw new IllegalArgumentException("at least one of the inputStream and cipherMaterial must not null!");
            }
            bArr = new byte[CIPHER_MATERIAL_LENGTH];
            mwi.a(inputStream, bArr, 0, CIPHER_MATERIAL_LENGTH);
        }
        from = AndesCryptoKitProto.CipherMaterial.parseFrom(bArr);
        bArrC = null;
        if (from == null) {
            x6b.a(TAG, "newEngineTransCipher", "cipher material is null!");
            return null;
        }
        if (bArrC == null) {
            bArrC = fkf.e().c(from.getTEECipherDEK().toByteArray());
        }
        bArr2 = bArrC;
        if (bArr2 != null) {
            return new EngineTransCipher(i, from.toByteArray(), bArr2, from.getIV().toByteArray(), inputStream, z);
        }
        x6b.a(TAG, "newEngineTransCipher", "decrypt key failed!");
        return null;
    }
}
