package com.oppo.obus.common.protobuf;

import com.oplus.aiunit.vision.o1f;
import com.oppo.obus.common.configmetadata.core.exception.ProtobufDeserializationException;
import com.oppo.obus.common.configmetadata.core.exception.ProtobufSerializationException;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public interface ProtobufSerializable extends Serializable {
    static <T extends ProtobufSerializable> T fromPb(Class<T> cls, byte[] bArr) throws ProtobufDeserializationException {
        o1f o1fVarLoad = o1f.load();
        if (Objects.isNull(o1fVarLoad)) {
            throw new ProtobufDeserializationException("no resolver");
        }
        return (T) o1fVarLoad.fromPb(cls, bArr);
    }

    default byte[] toPb() throws ProtobufSerializationException {
        o1f o1fVarLoad = o1f.load();
        if (Objects.isNull(o1fVarLoad)) {
            throw new ProtobufSerializationException("no resolver");
        }
        return o1fVarLoad.a(this);
    }
}
