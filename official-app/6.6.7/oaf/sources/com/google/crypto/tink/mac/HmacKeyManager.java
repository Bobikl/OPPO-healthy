package com.google.crypto.tink.mac;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacKey;
import com.google.crypto.tink.proto.HmacKeyFormat;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.PrfHmacJce;
import com.google.crypto.tink.subtle.PrfMac;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class HmacKeyManager extends KeyTypeManager<HmacKey> {
    private static final int MIN_KEY_SIZE_IN_BYTES = 16;
    private static final int MIN_TAG_SIZE_IN_BYTES = 10;

    public static /* synthetic */ class 3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HmacKeyManager() {
        super(HmacKey.class, new KeyTypeManager.PrimitiveFactory<Mac, HmacKey>(Mac.class) { // from class: com.google.crypto.tink.mac.HmacKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public Mac getPrimitive(HmacKey hmacKey) throws GeneralSecurityException {
                HashType hash = hmacKey.getParams().getHash();
                SecretKeySpec secretKeySpec = new SecretKeySpec(hmacKey.getKeyValue().toByteArray(), "HMAC");
                int tagSize = hmacKey.getParams().getTagSize();
                int i = 3.$SwitchMap$com$google$crypto$tink$proto$HashType[hash.ordinal()];
                if (i == 1) {
                    return new PrfMac(new PrfHmacJce("HMACSHA1", secretKeySpec), tagSize);
                }
                if (i == 2) {
                    return new PrfMac(new PrfHmacJce("HMACSHA256", secretKeySpec), tagSize);
                }
                if (i == 3) {
                    return new PrfMac(new PrfHmacJce("HMACSHA512", secretKeySpec), tagSize);
                }
                throw new GeneralSecurityException("unknown hash");
            }
        });
    }

    private static KeyTemplate createTemplate(int i, int i2, HashType hashType) {
        return KeyTemplate.create(new HmacKeyManager().getKeyType(), HmacKeyFormat.newBuilder().setParams(HmacParams.newBuilder().setHash(hashType).setTagSize(i2).build()).setKeySize(i).build().toByteArray(), KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate hmacSha256HalfDigestTemplate() {
        return createTemplate(32, 16, HashType.SHA256);
    }

    public static final KeyTemplate hmacSha256Template() {
        return createTemplate(32, 32, HashType.SHA256);
    }

    public static final KeyTemplate hmacSha512HalfDigestTemplate() {
        return createTemplate(64, 32, HashType.SHA512);
    }

    public static final KeyTemplate hmacSha512Template() {
        return createTemplate(64, 64, HashType.SHA512);
    }

    public static void register(boolean z) throws GeneralSecurityException {
        Registry.registerKeyManager(new HmacKeyManager(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void validateParams(HmacParams hmacParams) throws GeneralSecurityException {
        if (hmacParams.getTagSize() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = 3.$SwitchMap$com$google$crypto$tink$proto$HashType[hmacParams.getHash().ordinal()];
        if (i == 1) {
            if (hmacParams.getTagSize() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (hmacParams.getTagSize() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i != 3) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (hmacParams.getTagSize() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyTypeManager.KeyFactory<HmacKeyFormat, HmacKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<HmacKeyFormat, HmacKey>(HmacKeyFormat.class) { // from class: com.google.crypto.tink.mac.HmacKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public HmacKey createKey(HmacKeyFormat hmacKeyFormat) throws GeneralSecurityException {
                return HmacKey.newBuilder().setVersion(HmacKeyManager.this.getVersion()).setParams(hmacKeyFormat.getParams()).setKeyValue(ByteString.copyFrom(Random.randBytes(hmacKeyFormat.getKeySize()))).build();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public HmacKey deriveKey(HmacKeyFormat hmacKeyFormat, InputStream inputStream) throws GeneralSecurityException {
                Validators.validateVersion(hmacKeyFormat.getVersion(), HmacKeyManager.this.getVersion());
                byte[] bArr = new byte[hmacKeyFormat.getKeySize()];
                try {
                    if (inputStream.read(bArr) == hmacKeyFormat.getKeySize()) {
                        return HmacKey.newBuilder().setVersion(HmacKeyManager.this.getVersion()).setParams(hmacKeyFormat.getParams()).setKeyValue(ByteString.copyFrom(bArr)).build();
                    }
                    throw new GeneralSecurityException("Not enough pseudorandomness given");
                } catch (IOException e) {
                    throw new GeneralSecurityException("Reading pseudorandomness failed", e);
                }
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public HmacKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return HmacKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public void validateKeyFormat(HmacKeyFormat hmacKeyFormat) throws GeneralSecurityException {
                if (hmacKeyFormat.getKeySize() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                HmacKeyManager.validateParams(hmacKeyFormat.getParams());
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public HmacKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return HmacKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(HmacKey hmacKey) throws GeneralSecurityException {
        Validators.validateVersion(hmacKey.getVersion(), getVersion());
        if (hmacKey.getKeyValue().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        validateParams(hmacKey.getParams());
    }
}
