package com.heytap.health.watchface.business.manager.base;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0007\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0004J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0004J&\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/watchface/business/manager/base/LoadCallback;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/heytap/health/watchface/business/manager/base/LoadCallback$DataType;", "sourceType", "", "b", "a", "", "data", "", "adjacentPageKey", "", "c", "<init>", "()V", "Companion", "DataType", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class LoadCallback<T> {
    public static final int PAGE_KEY_END = -1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/watchface/business/manager/base/LoadCallback$DataType;", "", "(Ljava/lang/String;I)V", "ASYNC", "CACHE", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum DataType {
        ASYNC,
        CACHE
    }

    public final boolean a(@NotNull DataType sourceType) {
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        return sourceType == DataType.ASYNC;
    }

    public final boolean b(@NotNull DataType sourceType) {
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        return sourceType == DataType.CACHE;
    }

    public abstract void c(@NotNull List<? extends T> data, int adjacentPageKey, @NotNull DataType sourceType);
}
