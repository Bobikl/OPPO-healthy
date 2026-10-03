package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.MetadataUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002J \u0010\n\u001a\u00020\t2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0002R&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/xj3;", "", "", "", "", "Lcom/heytap/databaseengine/model/MetadataUnit;", "a", "", "cache", "", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "metadataUnitCache", "", "b", "Z", "()Z", "d", "(Z)V", "last7RunningRecordsContainCapacity", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoachTipsDataCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachTipsDataCache.kt\ncom/heytap/sports/coach/tips/CoachTipsDataCache\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,34:1\n125#2:35\n152#2,3:36\n*S KotlinDebug\n*F\n+ 1 CoachTipsDataCache.kt\ncom/heytap/sports/coach/tips/CoachTipsDataCache\n*L\n23#1:35\n23#1:36,3\n*E\n"})
public final class xj3 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean last7RunningRecordsContainCapacity;

    @NotNull
    public static final xj3 INSTANCE = new xj3();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<Integer, List<MetadataUnit>> metadataUnitCache = new ConcurrentHashMap<>();
    public static final int $stable = 8;

    @NotNull
    public final Map<Integer, List<MetadataUnit>> a() {
        ConcurrentHashMap<Integer, List<MetadataUnit>> concurrentHashMap = metadataUnitCache;
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (Map.Entry<Integer, List<MetadataUnit>> entry : concurrentHashMap.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), CollectionsKt___CollectionsKt.toList(entry.getValue())));
        }
        return MapsKt__MapsKt.toMap(arrayList);
    }

    public final boolean b() {
        return last7RunningRecordsContainCapacity;
    }

    public final void c(@NotNull Map<Integer, ? extends List<MetadataUnit>> cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        ConcurrentHashMap<Integer, List<MetadataUnit>> concurrentHashMap = metadataUnitCache;
        concurrentHashMap.clear();
        concurrentHashMap.putAll(cache);
    }

    public final void d(boolean z) {
        last7RunningRecordsContainCapacity = z;
    }
}
