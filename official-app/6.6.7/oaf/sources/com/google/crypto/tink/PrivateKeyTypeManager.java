package com.google.crypto.tink;

import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Alpha
public abstract class PrivateKeyTypeManager<KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> extends KeyTypeManager<KeyProtoT> {
    private final Class<PublicKeyProtoT> publicKeyClazz;

    @SafeVarargs
    public PrivateKeyTypeManager(Class<KeyProtoT> cls, Class<PublicKeyProtoT> cls2, KeyTypeManager.PrimitiveFactory<?, KeyProtoT>... primitiveFactoryArr) {
        super(cls, primitiveFactoryArr);
        this.publicKeyClazz = cls2;
    }

    public abstract PublicKeyProtoT getPublicKey(KeyProtoT keyprotot) throws GeneralSecurityException;

    public final Class<PublicKeyProtoT> getPublicKeyClass() {
        return this.publicKeyClazz;
    }
}
