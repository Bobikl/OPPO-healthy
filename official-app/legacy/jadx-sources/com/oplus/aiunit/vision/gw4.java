package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amap.api.maps.model.LatLng;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010(R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u000b\u0010\u0017R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00128\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001f\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0003\u0010\u0017R#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00128\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00120\u00128\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006)"}, d2 = {"Lcom/oplus/aiunit/vision/gw4;", "", "", "a", "Z", "getHasInit", "()Z", "j", "(Z)V", "hasInit", "", "b", "D", "i", "()D", MapSchema.FIELD_NAME_KEY, "(D)V", "totalDistance", "", "Lcom/amap/api/maps/model/LatLng;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "latLngList", b2n.g, "stateList", MapSchema.FIELD_NAME_ENTRY, b2n.f, "speedList", "f", "kmLatLngList", "Lcom/oplus/aiunit/vision/lpa;", "kmMilestones", "Landroid/graphics/Bitmap;", "kmIcons", "polylineLatLngList", "", "polylineColorList", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class gw4 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean hasInit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public double totalDistance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<LatLng> latLngList = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<Boolean> stateList = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Double> speedList = new ArrayList();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<LatLng> kmLatLngList = new ArrayList();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<KmMilestone> kmMilestones = new ArrayList();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final List<Bitmap> kmIcons = new ArrayList();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final List<List<LatLng>> polylineLatLngList = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<List<Integer>> polylineColorList = new ArrayList();

    @NotNull
    public final List<Bitmap> a() {
        return this.kmIcons;
    }

    @NotNull
    public final List<LatLng> b() {
        return this.kmLatLngList;
    }

    @NotNull
    public final List<KmMilestone> c() {
        return this.kmMilestones;
    }

    @NotNull
    public final List<LatLng> d() {
        return this.latLngList;
    }

    @NotNull
    public final List<List<Integer>> e() {
        return this.polylineColorList;
    }

    @NotNull
    public final List<List<LatLng>> f() {
        return this.polylineLatLngList;
    }

    @NotNull
    public final List<Double> g() {
        return this.speedList;
    }

    @NotNull
    public final List<Boolean> h() {
        return this.stateList;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final double getTotalDistance() {
        return this.totalDistance;
    }

    public final void j(boolean z) {
        this.hasInit = z;
    }

    public final void k(double d) {
        this.totalDistance = d;
    }
}
