package com.heytap.sports.track.worker;

import android.location.Location;
import android.util.Pair;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amap.api.maps.model.LatLng;
import com.heytap.sports.track.worker.Douglas;
import com.oplus.aiunit.vision.LatLngPoint;
import com.oplus.aiunit.vision.pfb;
import com.oplus.smartenginehelper.entity.TextEntity;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u00100\u001a\u00020\u0013¢\u0006\u0004\b1\u00102J$\u0010\b\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0002J\u0015\u0010\n\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0082\u0004J]\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000ej\b\u0012\u0004\u0012\u00020\f`\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000ej\b\u0012\u0004\u0012\u00020\f`\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0002R2\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000ej\b\u0012\u0004\u0012\u00020\f`\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR2\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000ej\b\u0012\u0004\u0012\u00020\f`\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010)\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-¨\u00063"}, d2 = {"Lcom/heytap/sports/track/worker/Douglas;", "", "Landroid/util/Pair;", "", "Lcom/amap/api/maps/model/LatLng;", "", "", "", "c", "last", "b", "", "Lcom/oplus/aiunit/vision/wta;", "originalLatLngs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "endLatLngs", "start", TextEntity.ELLIPSIZE_END, "", "dMax", MapSchema.FIELD_NAME_ENTRY, "([Lcom/oplus/aiunit/vision/wta;Ljava/util/ArrayList;IID)Ljava/util/ArrayList;", "center", "f", "a", "Ljava/util/ArrayList;", "getMLineInit", "()Ljava/util/ArrayList;", "setMLineInit", "(Ljava/util/ArrayList;)V", "mLineInit", "getMLineFilter", "setMLineFilter", "mLineFilter", "D", "getDMax", "()D", "setDMax", "(D)V", "d", "I", "getStart", "()I", "setStart", "(I)V", "getEnd", "setEnd", "dmax", "<init>", "(Ljava/util/List;D)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDouglas.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Douglas.kt\ncom/heytap/sports/track/worker/Douglas\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,108:1\n37#2,2:109\n*S KotlinDebug\n*F\n+ 1 Douglas.kt\ncom/heytap/sports/track/worker/Douglas\n*L\n47#1:109,2\n*E\n"})
public final class Douglas {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public ArrayList<LatLngPoint> mLineInit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public ArrayList<LatLngPoint> mLineFilter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public double dMax;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int start;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int end;

    public Douglas(@NotNull List<LatLng> mLineInit, double d) {
        Intrinsics.checkNotNullParameter(mLineInit, "mLineInit");
        this.mLineInit = new ArrayList<>();
        this.mLineFilter = new ArrayList<>();
        this.dMax = d;
        this.start = 0;
        this.end = mLineInit.size() - 1;
        int size = mLineInit.size();
        for (int i = 0; i < size; i++) {
            this.mLineInit.add(new LatLngPoint(i, mLineInit.get(i)));
        }
    }

    public static final int d(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public final float b(LatLng latLng, LatLng latLng2) {
        float[] fArr = new float[2];
        Location.distanceBetween(latLng2.latitude, latLng2.longitude, latLng.latitude, latLng.longitude, fArr);
        return (((int) fArr[1]) + 360) % 360.0f;
    }

    @NotNull
    public final Pair<List<LatLng>, Map<Integer, Float>> c() {
        int size = this.mLineInit.size();
        ArrayList<LatLngPoint> arrayListE = e((LatLngPoint[]) this.mLineInit.toArray(new LatLngPoint[0]), this.mLineFilter, this.start, this.end, this.dMax);
        arrayListE.add(this.mLineInit.get(0));
        arrayListE.add(this.mLineInit.get(size - 1));
        final Douglas$compress$1 douglas$compress$1 = new Function2<LatLngPoint, LatLngPoint, Integer>() { // from class: com.heytap.sports.track.worker.Douglas$compress$1
            @Override // p010kotlin.jvm.functions.Function2
            @NotNull
            public final Integer invoke(LatLngPoint latLngPoint, LatLngPoint o2) {
                Intrinsics.checkNotNullExpressionValue(o2, "o2");
                return Integer.valueOf(latLngPoint.compareTo(o2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayListE, new Comparator() { // from class: com.oplus.aiunit.vision.u06
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Douglas.d(douglas$compress$1, obj, obj2);
            }
        });
        LatLngPoint latLngPoint = arrayListE.get(0);
        Intrinsics.checkNotNullExpressionValue(latLngPoint, "latLngPoints[0]");
        LatLngPoint latLngPoint2 = latLngPoint;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (LatLngPoint point : arrayListE) {
            LatLng latLng = point.getLatLng();
            arrayList.add(latLng);
            if (latLngPoint2.getLatLng() != latLng) {
                linkedHashMap.put(Integer.valueOf(latLngPoint2.getId()), Float.valueOf(b(latLng, latLngPoint2.getLatLng())));
            }
            Intrinsics.checkNotNullExpressionValue(point, "point");
            latLngPoint2 = point;
        }
        Pair<List<LatLng>, Map<Integer, Float>> pairCreate = Pair.create(arrayList, linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(pairCreate, "create(latLngs, angles)");
        return pairCreate;
    }

    public final ArrayList<LatLngPoint> e(LatLngPoint[] originalLatLngs, ArrayList<LatLngPoint> endLatLngs, int start, int end, double dMax) {
        if (start < end) {
            double d = 0.0d;
            int i = 0;
            for (int i2 = start + 1; i2 < end; i2++) {
                double dF = f(originalLatLngs[start], originalLatLngs[end], originalLatLngs[i2]);
                if (dF > d) {
                    i = i2;
                    d = dF;
                }
            }
            if (d >= dMax) {
                endLatLngs.add(originalLatLngs[i]);
                e(originalLatLngs, endLatLngs, start, i, dMax);
                e(originalLatLngs, endLatLngs, i, end, dMax);
            }
        }
        return endLatLngs;
    }

    public final double f(LatLngPoint start, LatLngPoint end, LatLngPoint center) {
        double dAbs = Math.abs(pfb.a(start.getLatLng(), end.getLatLng()));
        double dAbs2 = Math.abs(pfb.a(start.getLatLng(), center.getLatLng()));
        double dAbs3 = Math.abs(pfb.a(end.getLatLng(), center.getLatLng()));
        double d = ((dAbs + dAbs2) + dAbs3) / 2.0d;
        return (Math.sqrt(Math.abs((((d - dAbs) * d) * (d - dAbs2)) * (d - dAbs3))) * 2.0d) / dAbs;
    }
}
