package com.oplus.aiunit.vision;

import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.Postcard;
import java.io.Serializable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/y0;", "", "", "path", "", "params", "", "a", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nARouterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ARouterHelper.kt\ncom/heytap/sports/utils/ARouterHelper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,25:1\n215#2,2:26\n*S KotlinDebug\n*F\n+ 1 ARouterHelper.kt\ncom/heytap/sports/utils/ARouterHelper\n*L\n10#1:26,2\n*E\n"})
public final class y0 {
    public static final int $stable = 0;

    @NotNull
    public static final y0 INSTANCE = new y0();

    public final void a(@NotNull String path, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(params, "params");
        Postcard postcardB = x0.d().b(path);
        for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Integer) {
                String key = entry.getKey();
                Object value2 = entry.getValue();
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.Int");
                postcardB.withInt(key, ((Integer) value2).intValue());
            } else if (value instanceof Long) {
                String key2 = entry.getKey();
                Object value3 = entry.getValue();
                Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Long");
                postcardB.withLong(key2, ((Long) value3).longValue());
            } else if (value instanceof Float) {
                String key3 = entry.getKey();
                Object value4 = entry.getValue();
                Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Float");
                postcardB.withFloat(key3, ((Float) value4).floatValue());
            } else if (value instanceof Double) {
                String key4 = entry.getKey();
                Object value5 = entry.getValue();
                Intrinsics.checkNotNull(value5, "null cannot be cast to non-null type kotlin.Double");
                postcardB.withDouble(key4, ((Double) value5).doubleValue());
            } else if (value instanceof String) {
                String key5 = entry.getKey();
                Object value6 = entry.getValue();
                Intrinsics.checkNotNull(value6, "null cannot be cast to non-null type kotlin.String");
                postcardB.withString(key5, (String) value6);
            } else if (value instanceof Boolean) {
                String key6 = entry.getKey();
                Object value7 = entry.getValue();
                Intrinsics.checkNotNull(value7, "null cannot be cast to non-null type kotlin.Boolean");
                postcardB.withBoolean(key6, ((Boolean) value7).booleanValue());
            } else if (value instanceof Parcelable) {
                String key7 = entry.getKey();
                Object value8 = entry.getValue();
                Intrinsics.checkNotNull(value8, "null cannot be cast to non-null type android.os.Parcelable");
                postcardB.withParcelable(key7, (Parcelable) value8);
            } else if (value instanceof Serializable) {
                String key8 = entry.getKey();
                Object value9 = entry.getValue();
                Intrinsics.checkNotNull(value9, "null cannot be cast to non-null type java.io.Serializable");
                postcardB.withSerializable(key8, (Serializable) value9);
            }
        }
        postcardB.navigation();
    }
}
