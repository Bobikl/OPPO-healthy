package com.oplus.aiunit.vision;

import com.oppo.obus.common.configmetadata.core.exception.ProtobufDeserializationException;
import com.oppo.obus.common.configmetadata.core.exception.ProtobufSerializationException;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;

/* JADX INFO: loaded from: classes6.dex */
public class p1f {
    public static <T> T a(Class<T> cls, byte[] bArr) throws ProtobufDeserializationException {
        if (bArr == null || cls == null) {
            return null;
        }
        try {
            Schema schema = RuntimeSchema.getSchema(cls);
            T t = (T) schema.newMessage();
            ProtostuffIOUtil.mergeFrom(bArr, t, schema);
            return t;
        } catch (Exception e2) {
            throw new ProtobufDeserializationException("Protobuf deserialization failed: " + e2.getMessage(), e2);
        }
    }

    public static byte[] b(Object obj) throws ProtobufSerializationException {
        if (obj == null) {
            return null;
        }
        try {
            return ProtostuffIOUtil.toByteArray(obj, RuntimeSchema.getSchema(obj.getClass()), LinkedBuffer.allocate());
        } catch (Exception e2) {
            throw new ProtobufSerializationException("Protobuf serialization failed: " + e2.getMessage(), e2);
        }
    }
}
