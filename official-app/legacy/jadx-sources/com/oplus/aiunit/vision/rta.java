package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import io.netty.util.internal.StringUtil;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0007¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/rta;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "tag", "methodName", "collectionName", "", "collection", "", "a", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class rta {

    @NotNull
    public static final rta INSTANCE = new rta();

    @JvmStatic
    public static final <T> void a(@NotNull String tag, @NotNull String methodName, @NotNull String collectionName, @Nullable Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(collectionName, "collectionName");
        StringBuilder sb = new StringBuilder();
        sb.append(methodName);
        sb.append(": ");
        sb.append(collectionName);
        sb.append(" size: ");
        sb.append(collection == null ? null : Integer.valueOf(collection.size()));
        sb.append(StringUtil.SPACE);
        f7b.h(qug.TAG, sb.toString());
        int i = 0;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        for (T t : collection) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            f7b.d(tag, methodName + ": " + collectionName + "-[" + i + "]-" + t);
            i = i2;
        }
    }
}
