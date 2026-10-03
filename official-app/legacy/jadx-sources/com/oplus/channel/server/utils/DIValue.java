package com.oplus.channel.server.utils;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J$\u0010\u0006\u001a\u00028\u00002\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0086\u0002¢\u0006\u0002\u0010\nR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/oplus/channel/server/utils/DIValue;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getValue", "t", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DIValue<T> {
    private final T data;

    public DIValue(T t) {
        this.data = t;
    }

    public final T getValue(@Nullable T t, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.data;
    }
}
