package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0016R*\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/oza;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "toString", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "d", "(Ljava/util/List;)V", "list", "", "Z", "()Z", "c", "(Z)V", "expired", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class oza<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public List<? extends T> list;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean expired;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getExpired() {
        return this.expired;
    }

    @Nullable
    public final List<T> b() {
        return this.list;
    }

    public final void c(boolean z) {
        this.expired = z;
    }

    public final void d(@Nullable List<? extends T> list) {
        this.list = list;
    }

    @NotNull
    public String toString() {
        int size;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        List<? extends T> list = this.list;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            size = list.size();
        } else {
            size = 0;
        }
        objArr[0] = Integer.valueOf(size);
        objArr[1] = Boolean.valueOf(this.expired);
        String str = String.format(locale, "size:%d, expired:%b", Arrays.copyOf(objArr, 2));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }
}
