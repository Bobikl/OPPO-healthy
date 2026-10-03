package com.oplus.aiunit.vision;

import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amap.api.maps.model.LatLng;
import com.heytap.sports.map.model.TrackPoint;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\r\u001a\u00020\tR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/s6k;", "", "Lcom/heytap/sports/map/model/TrackPoint;", "point", "", "a", "", "trackPoints", "b", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "c", MapSchema.FIELD_NAME_ENTRY, "count", "d", "", "Ljava/util/List;", "points", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class s6k {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<TrackPoint> points = new ArrayList();

    public final void a(@NotNull TrackPoint point) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.points.add(point);
    }

    public final void b(@NotNull List<TrackPoint> trackPoints) {
        Intrinsics.checkNotNullParameter(trackPoints, "trackPoints");
        this.points.addAll(trackPoints);
    }

    public final void c(int sportMode) {
        if (sportMode == 10) {
            return;
        }
        if (this.points.size() <= 1) {
            if (this.points.size() == 1) {
                this.points.get(0).setPause(true);
            }
        } else {
            List<TrackPoint> list = this.points;
            TrackPoint trackPoint = list.get(list.size() - 1);
            if (trackPoint.isPause()) {
                return;
            }
            this.points.add(new TrackPoint(new LatLng(trackPoint.getLatitude(), trackPoint.getLongitude()), SystemClock.elapsedRealtime(), trackPoint.getSpeed(), trackPoint.getBearing(), true));
        }
    }

    @NotNull
    public final List<TrackPoint> d(int count) {
        if (this.points.size() <= count) {
            return CollectionsKt___CollectionsKt.toList(this.points);
        }
        List<TrackPoint> list = this.points;
        return CollectionsKt___CollectionsKt.toList(list.subList(list.size() - count, this.points.size()));
    }

    @NotNull
    public final List<TrackPoint> e() {
        return CollectionsKt___CollectionsKt.toMutableList((Collection) this.points);
    }
}
