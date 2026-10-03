package com.heytap.store.platform.htrouter.facade.models;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.TypeCastException;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0014¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/store/platform/htrouter/facade/models/TypeWrapper;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "type", "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "htrouter-annotation"}, k = 1, mv = {1, 1, 15})
public class TypeWrapper<T> {

    @NotNull
    private final Type type;

    public TypeWrapper() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        }
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        Intrinsics.checkExpressionValueIsNotNull(type, "(supperClass as Paramete…e).actualTypeArguments[0]");
        this.type = type;
    }

    @NotNull
    public Type getType() {
        return this.type;
    }
}
