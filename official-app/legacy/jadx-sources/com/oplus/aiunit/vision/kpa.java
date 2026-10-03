package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amap.api.maps.model.LatLng;
import com.heytap.sports.map.model.TrackPoint;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/kpa;", "", "", "Lcom/heytap/sports/map/model/TrackPoint;", "trackPoints", "", "kmTimestamps", "Lcom/oplus/aiunit/vision/lpa;", "a", "DROP_GAP_MS", "J", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nKmMarkerCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KmMarkerCalculator.kt\ncom/heytap/sports/map/util/KmMarkerCalculator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1549#2:63\n1620#2,3:64\n*S KotlinDebug\n*F\n+ 1 KmMarkerCalculator.kt\ncom/heytap/sports/map/util/KmMarkerCalculator\n*L\n60#1:63\n60#1:64,3\n*E\n"})
public final class kpa {
    public static final int $stable = 0;
    public static final long DROP_GAP_MS = 60000;

    @NotNull
    public static final kpa INSTANCE = new kpa();

    @NotNull
    public final List<KmMilestone> a(@NotNull List<TrackPoint> trackPoints, @NotNull List<Long> kmTimestamps) {
        Intrinsics.checkNotNullParameter(trackPoints, "trackPoints");
        Intrinsics.checkNotNullParameter(kmTimestamps, "kmTimestamps");
        if (trackPoints.isEmpty() || kmTimestamps.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(kmTimestamps.size());
        int i = 1;
        for (TrackPoint trackPoint : trackPoints) {
            if (i > kmTimestamps.size()) {
                break;
            }
            long jLongValue = kmTimestamps.get(i - 1).longValue();
            if (trackPoint.getTimeStamp() >= jLongValue) {
                arrayList.add(new KmMilestone(jLongValue, trackPoint.getTimeStamp() - jLongValue >= 60000 ? new LatLng(0.0d, 0.0d) : new LatLng(trackPoint.getLatitude(), trackPoint.getLongitude())));
                i++;
            }
        }
        return arrayList;
    }
}
