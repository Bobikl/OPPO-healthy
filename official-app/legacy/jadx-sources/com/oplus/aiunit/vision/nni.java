package com.oplus.aiunit.vision;

import android.content.Context;
import io.protostuff.MapSchema;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\u001a\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010\t\u001a\u00020\u0007J@\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0018\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\f2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fJ,\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\fH\u0016J0\u0010\u0013\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00052\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J,\u0010\u0014\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0005J0\u0010\u0015\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00052\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J,\u0010\u0016\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0005R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/nni;", "Lcom/oplus/aiunit/vision/ry9;", com.heytap.health.gdxui.stars.b.TAG_WRAPPER, "d", "", "", "baseMap", "", "i", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "", "detailMap", "f", "initMap", "c", "eventId", "map", "a", b2n.f, "b", b2n.g, "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "wrappers", "Ljava/util/Map;", "<init>", "()V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStatisticManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticManager.kt\ncom/oplus/pay/opensdk/statistic/statistic/StatisticManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
public final class nni implements ry9 {

    @NotNull
    public static final nni INSTANCE = new nni();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final LinkedList<ry9> wrappers = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Map<String, String> baseMap = new HashMap();

    @Override // com.oplus.aiunit.vision.ry9
    public void a(@Nullable Context context, @NotNull String eventId, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        if (map == null) {
            map = baseMap;
        } else {
            map.putAll(baseMap);
        }
        qae.b("埋点信息：eventId：" + eventId + " detailMap：" + map);
        g(map, context, eventId);
    }

    @Override // com.oplus.aiunit.vision.ry9
    public void b(@Nullable Context context, @NotNull String eventId, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        if (map == null) {
            map = baseMap;
        } else {
            map.putAll(baseMap);
        }
        qae.b("埋点信息：eventId2：" + eventId + " detailMap：" + map);
        h(map, context, eventId);
    }

    @Override // com.oplus.aiunit.vision.ry9
    public void c(@Nullable Context context, @Nullable Map<String, String> initMap) {
        Iterator<ry9> it = wrappers.iterator();
        while (it.hasNext()) {
            it.next().c(context, initMap);
        }
    }

    @NotNull
    public final nni d(@NotNull ry9 wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        wrappers.add(wrapper);
        return this;
    }

    public final void e() {
        wrappers.clear();
    }

    public final void f(@Nullable Context context, @Nullable Map<String, String> detailMap, @Nullable Map<String, String> baseMap2) {
        ro0.INSTANCE.a(context, baseMap2);
        baseMap.clear();
        if (baseMap2 != null) {
            baseMap.putAll(baseMap2);
        }
        c(context, detailMap);
    }

    public final void g(@NotNull Map<String, String> detailMap, @Nullable Context context, @NotNull String eventId) {
        Intrinsics.checkNotNullParameter(detailMap, "detailMap");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        detailMap.put(sbe.PAY_SDK_EVENT_TIME, System.currentTimeMillis() + "");
        Iterator<ry9> it = wrappers.iterator();
        while (it.hasNext()) {
            it.next().a(context, eventId, detailMap);
        }
    }

    public final void h(@NotNull Map<String, String> detailMap, @Nullable Context context, @NotNull String eventId) {
        Intrinsics.checkNotNullParameter(detailMap, "detailMap");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        detailMap.put(sbe.PAY_SDK_EVENT_TIME, System.currentTimeMillis() + "");
        Iterator<ry9> it = wrappers.iterator();
        while (it.hasNext()) {
            it.next().b(context, eventId, detailMap);
        }
    }

    public final void i(@NotNull Map<String, String> baseMap2) {
        Intrinsics.checkNotNullParameter(baseMap2, "baseMap");
        baseMap.clear();
        baseMap = baseMap2;
    }
}
