package com.oplus.aiunit.vision;

import com.oppo.obus.common.configmetadata.core.exception.ProtobufDeserializationException;
import com.oppo.obus.common.configmetadata.core.exception.ProtobufSerializationException;
import com.oppo.obus.common.protobuf.ProtobufSerializable;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes9.dex */
public interface o1f {

    public static class a {
        public static o1f a;
        public static final AtomicBoolean b = new AtomicBoolean(false);

        public static synchronized void e() {
            f(new Supplier() { // from class: com.oplus.aiunit.vision.n1f
                @Override // java.util.function.Supplier
                public final Object get() {
                    return o1f.a.g();
                }
            });
        }

        public static synchronized void f(Supplier<o1f> supplier) {
            AtomicBoolean atomicBoolean = b;
            if (atomicBoolean.get()) {
                return;
            }
            if (Objects.nonNull(supplier)) {
                a = supplier.get();
            } else {
                a = g();
            }
            atomicBoolean.set(true);
        }

        public static o1f g() {
            for (o1f o1fVar : ServiceLoader.load(o1f.class)) {
                if (Objects.nonNull(o1fVar)) {
                    return o1fVar;
                }
            }
            return null;
        }
    }

    static o1f load() {
        if (!a.b.get()) {
            a.e();
        }
        return a.a;
    }

    byte[] a(ProtobufSerializable protobufSerializable) throws ProtobufSerializationException;

    <T extends ProtobufSerializable> T fromPb(Class<T> cls, byte[] bArr) throws ProtobufDeserializationException;
}
