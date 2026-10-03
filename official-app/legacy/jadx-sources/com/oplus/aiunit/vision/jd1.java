package com.oplus.aiunit.vision;

import android.view.animation.Interpolator;
import com.heytap.databaseengine.model.UserInfo;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/jd1;", "Landroid/view/animation/Interpolator;", "", "input", "getInterpolation", "Lcom/oplus/aiunit/vision/nik;", "a", "Lcom/oplus/aiunit/vision/nik;", "mTheme1UnitBezier", "", "b", "D", "EPSILON", "c", UserInfo.SEX_FEMALE, "ABOVE_ONE", "d", "BELOW_ONE", MapSchema.FIELD_NAME_ENTRY, "ABOVE_ZERO", "", "f", "Z", "mAbove", b2n.f, "mLimit", "p1x", "p1y", "p2x", "p2y", "limit", "<init>", "(DDDDZ)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class jd1 implements Interpolator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public nik mTheme1UnitBezier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final double EPSILON = 6.25E-5d;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float ABOVE_ONE = 1.0f;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final float BELOW_ONE = 0.9999f;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final float ABOVE_ZERO = 1.0E-4f;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean mAbove;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean mLimit;

    public jd1(double d, double d2, double d3, double d4, boolean z) {
        this.mLimit = z;
        this.mTheme1UnitBezier = new nik(d, d2, d3, d4);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float input) {
        double d = this.mTheme1UnitBezier.d(input, this.EPSILON);
        if (this.mLimit) {
            if (input < this.ABOVE_ZERO || input > this.BELOW_ONE) {
                this.mAbove = false;
            }
            if (d > this.ABOVE_ONE && !this.mAbove) {
                this.mAbove = true;
                d = 1.0d;
            }
            if (this.mAbove) {
                d = 1.0d;
            }
        }
        return (float) d;
    }
}
