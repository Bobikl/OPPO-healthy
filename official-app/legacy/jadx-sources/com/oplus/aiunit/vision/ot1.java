package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0006\u0010\u000b\u001a\u00020\u0004R/\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/ot1;", "", "", "mac", "", "d", MapSchema.FIELD_NAME_ENTRY, "", "actionTime", "", "b", "c", "", "Lkotlin/Pair;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "connectedDevices", "<init>", "()V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
public final class ot1 {

    @NotNull
    public static final ot1 INSTANCE = new ot1();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, Pair<Long, Long>> connectedDevices = new LinkedHashMap();

    @NotNull
    public final Map<String, Pair<Long, Long>> a() {
        return connectedDevices;
    }

    @SuppressLint({"MissingPermission"})
    public final boolean b(@NotNull String mac, long actionTime) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Pair<Long, Long> pair = connectedDevices.get(mac);
        if (pair == null) {
            return false;
        }
        return pair.getSecond().longValue() == 0 || pair.getSecond().longValue() > actionTime;
    }

    public final synchronized void c() {
        connectedDevices.clear();
    }

    public final synchronized void d(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        connectedDevices.put(mac, TuplesKt.to(Long.valueOf(System.currentTimeMillis()), 0L));
    }

    public final synchronized void e(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Map<String, Pair<Long, Long>> map = connectedDevices;
        Pair<Long, Long> pair = map.get(mac);
        map.put(mac, TuplesKt.to(Long.valueOf(pair != null ? pair.getFirst().longValue() : 0L), Long.valueOf(System.currentTimeMillis())));
    }
}
