package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.reflect.TypeToken;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001f\b\u0000\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/k1f;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/ma4;", "Lcom/oplus/aiunit/vision/gqf;", "value", "a", "(Ljava/lang/Object;)Lcom/oplus/aiunit/vision/gqf;", "Lcom/oplus/aiunit/vision/i1f;", "Lcom/oplus/aiunit/vision/i1f;", "protoStuff", "Lcom/google/gson/reflect/TypeToken;", "b", "Lcom/google/gson/reflect/TypeToken;", "typeToken", "Lokhttp3/MediaType;", "c", "Lokhttp3/MediaType;", "mediaType", "<init>", "(Lcom/oplus/aiunit/vision/i1f;Lcom/google/gson/reflect/TypeToken;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class k1f<T> implements ma4<T, gqf> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final i1f protoStuff;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TypeToken<T> typeToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MediaType mediaType;

    public k1f(@NotNull i1f protoStuff, @NotNull TypeToken<T> typeToken) {
        Intrinsics.checkNotNullParameter(protoStuff, "protoStuff");
        Intrinsics.checkNotNullParameter(typeToken, "typeToken");
        this.protoStuff = protoStuff;
        this.typeToken = typeToken;
        this.mediaType = MediaType.INSTANCE.a(abe.a.MEDIA_TYPE);
    }

    @Override // com.oplus.aiunit.vision.ma4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gqf convert(@NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return gqf.Companion.l(gqf.INSTANCE, this.protoStuff.d(value), this.mediaType, 0, 0, 6, null);
    }
}
