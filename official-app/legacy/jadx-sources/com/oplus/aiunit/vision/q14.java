package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.wearable.oms.common.Status;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\f\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/q14;", ExifInterface.GPS_DIRECTION_TRUE, "", "a", "Ljava/lang/Object;", "t", "Lcom/heytap/wearable/oms/common/Status;", "b", "Lcom/heytap/wearable/oms/common/Status;", "()Lcom/heytap/wearable/oms/common/Status;", "status", "()Ljava/lang/Object;", "result", "<init>", "(Ljava/lang/Object;Lcom/heytap/wearable/oms/common/Status;)V", "(Ljava/lang/Object;)V", "(Lcom/heytap/wearable/oms/common/Status;)V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class q14<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final T t;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Status status;

    public q14(T t, Status status) {
        this.t = t;
        this.status = status;
    }

    public final T a() {
        bpe.a(getStatus().isSuccess(), getStatus().getStatusMessage());
        T t = this.t;
        Intrinsics.checkNotNull(t);
        return t;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public Status getStatus() {
        return this.status;
    }

    public q14(T t) {
        this(t, Status.SUCCESS);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q14(@NotNull Status status) {
        this(null, status);
        Intrinsics.checkNotNullParameter(status, "status");
        bpe.a(!status.isSuccess(), "status is success but no result");
    }
}
