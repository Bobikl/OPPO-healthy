package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.reflect.TypeToken;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0011*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0006B\u001f\b\u0000\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/l1f;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/ma4;", "Lcom/oplus/aiunit/vision/cuf;", "value", "a", "(Lcom/oplus/aiunit/vision/cuf;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/i1f;", "Lcom/oplus/aiunit/vision/i1f;", "protoStuff", "Lcom/google/gson/reflect/TypeToken;", "b", "Lcom/google/gson/reflect/TypeToken;", "typeToken", "<init>", "(Lcom/oplus/aiunit/vision/i1f;Lcom/google/gson/reflect/TypeToken;)V", "Companion", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class l1f<T> implements ma4<cuf, T> {

    @NotNull
    public static final String TAG = "ProtoStuffResponseBodyConverter";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final i1f protoStuff;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TypeToken<T> typeToken;

    public l1f(@NotNull i1f protoStuff, @NotNull TypeToken<T> typeToken) {
        Intrinsics.checkNotNullParameter(protoStuff, "protoStuff");
        Intrinsics.checkNotNullParameter(typeToken, "typeToken");
        this.protoStuff = protoStuff;
        this.typeToken = typeToken;
    }

    @Override // com.oplus.aiunit.vision.ma4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T convert(@NotNull cuf value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Thread.currentThread().getContextClassLoader() == null) {
            Thread.currentThread().setContextClassLoader(l1f.class.getClassLoader());
            ltl.i(TAG, "convert contextClassLoader == null and new is " + Thread.currentThread().getContextClassLoader());
        }
        i1f i1fVar = this.protoStuff;
        InputStream inputStreamA = value.a();
        Class<T> rawType = this.typeToken.getRawType();
        Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<T of com.heytap.health.watchface.network.protostuff.ProtoStuffResponseBodyConverter>");
        return (T) i1fVar.a(inputStreamA, rawType);
    }
}
