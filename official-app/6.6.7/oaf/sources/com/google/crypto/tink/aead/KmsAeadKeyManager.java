package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.KmsClients;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KmsAeadKey;
import com.google.crypto.tink.proto.KmsAeadKeyFormat;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class KmsAeadKeyManager extends KeyTypeManager<KmsAeadKey> {
    public KmsAeadKeyManager() {
        super(KmsAeadKey.class, new KeyTypeManager.PrimitiveFactory<Aead, KmsAeadKey>(Aead.class) { // from class: com.google.crypto.tink.aead.KmsAeadKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public Aead getPrimitive(KmsAeadKey kmsAeadKey) throws GeneralSecurityException {
                String keyUri = kmsAeadKey.getParams().getKeyUri();
                return KmsClients.get(keyUri).getAead(keyUri);
            }
        });
    }

    public static void register(boolean z) throws GeneralSecurityException {
        Registry.registerKeyManager(new KmsAeadKeyManager(), z);
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyTypeManager.KeyFactory<KmsAeadKeyFormat, KmsAeadKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<KmsAeadKeyFormat, KmsAeadKey>(KmsAeadKeyFormat.class) { // from class: com.google.crypto.tink.aead.KmsAeadKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public void validateKeyFormat(KmsAeadKeyFormat kmsAeadKeyFormat) throws GeneralSecurityException {
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public KmsAeadKey createKey(KmsAeadKeyFormat kmsAeadKeyFormat) throws GeneralSecurityException {
                return KmsAeadKey.newBuilder().setParams(kmsAeadKeyFormat).setVersion(KmsAeadKeyManager.this.getVersion()).build();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public KmsAeadKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return KmsAeadKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }
        };
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KmsAeadKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return KmsAeadKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(KmsAeadKey kmsAeadKey) throws GeneralSecurityException {
        Validators.validateVersion(kmsAeadKey.getVersion(), getVersion());
    }
}
