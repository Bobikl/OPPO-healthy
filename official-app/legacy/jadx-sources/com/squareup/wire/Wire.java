package com.squareup.wire;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0006\u001a#\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {ParserTag.TAG_GET, ExifInterface.GPS_DIRECTION_TRUE, "value", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "wire-runtime"}, k = 2, mv = {1, 1, 15})
@JvmName(name = "Wire")
public final class Wire {
    public static final <T> T get(@Nullable T t, T t2) {
        return t != null ? t : t2;
    }
}
