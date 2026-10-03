package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001a\u0010\u0007\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR;\u0010\u0014\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u00000\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/tab;", ExifInterface.GPS_DIRECTION_TRUE, "", "a", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "property", "Lcom/oplus/aiunit/vision/hoa;", "b", "Lcom/oplus/aiunit/vision/hoa;", "()Lcom/oplus/aiunit/vision/hoa;", "keyPath", "Lkotlin/Function1;", "Lcom/oplus/aiunit/vision/wab;", "Lkotlin/ParameterName;", "name", "frameInfo", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "callback", "lottie-compose_release"}, k = 1, mv = {1, 6, 0})
public final class tab<T> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final T property;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final hoa keyPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<wab<T>, T> callback;

    @NotNull
    public final Function1<wab<T>, T> a() {
        return this.callback;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final hoa getKeyPath() {
        return this.keyPath;
    }

    public final T c() {
        return this.property;
    }
}
