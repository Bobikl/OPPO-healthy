package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002R(\u0010\u0014\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/i1f;", "", ExifInterface.GPS_DIRECTION_TRUE, "obj", "", "d", "(Ljava/lang/Object;)[B", "data", "Ljava/lang/Class;", "cls", "b", "([BLjava/lang/Class;)Ljava/lang/Object;", "Ljava/io/InputStream;", "input", "a", "(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;", "Lio/protostuff/Schema;", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "cachedSchema", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class i1f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<Class<?>, Schema<?>> cachedSchema = new ConcurrentHashMap<>();

    @NotNull
    public final <T> T a(@NotNull InputStream input, @NotNull Class<T> cls) throws IllegalAccessException, InstantiationException, IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(cls, "cls");
        T tNewInstance = cls.newInstance();
        ProtobufIOUtil.mergeFrom(input, tNewInstance, c(cls));
        Intrinsics.checkNotNullExpressionValue(tNewInstance, "{\n            val messag…        message\n        }");
        return tNewInstance;
    }

    @NotNull
    public final <T> T b(@NotNull byte[] data, @NotNull Class<T> cls) throws IllegalAccessException, InstantiationException {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(cls, "cls");
        T tNewInstance = cls.newInstance();
        ProtobufIOUtil.mergeFrom(data, tNewInstance, c(cls));
        Intrinsics.checkNotNullExpressionValue(tNewInstance, "{\n            val messag…        message\n        }");
        return tNewInstance;
    }

    public final <T> Schema<T> c(Class<T> cls) {
        Schema<T> it = (Schema) this.cachedSchema.get(cls);
        if (it == null) {
            it = RuntimeSchema.createFrom(cls);
            ConcurrentHashMap<Class<?>, Schema<?>> concurrentHashMap = this.cachedSchema;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            concurrentHashMap.put(cls, it);
        }
        Intrinsics.checkNotNull(it, "null cannot be cast to non-null type io.protostuff.Schema<T of com.heytap.health.watchface.network.protostuff.ProtoStuff.getSchema>");
        return it;
    }

    @NotNull
    public final <T> byte[] d(@NotNull T obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Class<?> cls = obj.getClass();
        LinkedBuffer linkedBufferAllocate = LinkedBuffer.allocate(512);
        try {
            try {
                byte[] byteArray = ProtobufIOUtil.toByteArray(obj, c(cls), linkedBufferAllocate);
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(obj, schema, buffer)");
                linkedBufferAllocate.clear();
                return byteArray;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Throwable th) {
            linkedBufferAllocate.clear();
            throw th;
        }
    }
}
