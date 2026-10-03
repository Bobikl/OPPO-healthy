package com.heytap.nearx.protobuff.wire;

import com.heytap.nearx.protobuff.wire.Message;
import com.heytap.nearx.protobuff.wire.Message.a;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes17.dex */
final class MessageSerializedForm<M extends Message<M, B>, B extends Message.a<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final byte[] bytes;
    private final Class<M> messageClass;

    public MessageSerializedForm(byte[] bArr, Class<M> cls) {
        this.bytes = bArr;
        this.messageClass = cls;
    }

    public Object readResolve() throws ObjectStreamException {
        try {
            return ProtoAdapter.get(this.messageClass).decode(this.bytes);
        } catch (IOException e2) {
            throw new StreamCorruptedException(e2.getMessage());
        }
    }
}
