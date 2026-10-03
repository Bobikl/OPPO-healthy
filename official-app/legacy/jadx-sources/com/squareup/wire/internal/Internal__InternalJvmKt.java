package com.squareup.wire.internal;

import androidx.exifinterface.media.ExifInterface;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a,\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0010\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006¨\u0006\t"}, d2 = {"redactElements", "", ExifInterface.GPS_DIRECTION_TRUE, "list", "Ljava/util/List;", "adapter", "Lcom/squareup/wire/ProtoAdapter;", "map", "Ljava/util/Map;", "wire-runtime"}, k = 5, mv = {1, 1, 15}, xs = "com/squareup/wire/internal/Internal")
final /* synthetic */ class Internal__InternalJvmKt {
    public static final <T> void redactElements(@NotNull List<T> list, @NotNull ProtoAdapter<T> adapter) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.set(i, adapter.redact(list.get(i)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void redactElements(@NotNull Map<?, T> map, @NotNull ProtoAdapter<T> adapter) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        Intrinsics.checkParameterIsNotNull(adapter, "adapter");
        for (Map.Entry entry : map.entrySet()) {
            entry.setValue(adapter.redact(entry.getValue()));
        }
    }
}
