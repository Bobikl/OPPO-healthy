package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.bean.SportSummaryBean;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BY\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u001b\u0012\b\b\u0002\u0010$\u001a\u00020\u001b\u0012\b\b\u0002\u0010&\u001a\u00020\u001b\u0012\b\b\u0002\u0010)\u001a\u00020\u001b\u0012\b\b\u0002\u0010+\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u001b\u0012\u0006\u0010+\u001a\u00020\u0004¢\u0006\u0004\b,\u0010/J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\tH\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b\u0011\u0010\u001e\"\u0004\b#\u0010 R\"\u0010&\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u000b\u0010\u001e\"\u0004\b%\u0010 R\"\u0010)\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R\"\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0012\u001a\u0004\b\"\u0010\u0014\"\u0004\b*\u0010\u0016¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/lji;", "", "", "step", "", "dis", "cal", "", LogFieldKey.LEVEL_KEY, "", "toString", "a", "J", "f", "()J", "o", "(J)V", "b", "D", "d", "()D", LogFieldKey.MESSAGE_KEY, "(D)V", "distance", "c", MapSchema.FIELD_NAME_KEY, SportSummaryBean.CALORIES, "", "I", b2n.f, "()I", LogFieldKey.PROCESS_NAME_KEY, "(I)V", "stepGoal", MapSchema.FIELD_NAME_ENTRY, "j", "calGoal", "i", "actGoal", b2n.g, "q", "timeGoal", "n", "duration", "<init>", "(JDDIIIID)V", "goal", "(JDDID)V", "sport_release"}, k = 1, mv = {1, 8, 0})
public final class lji {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long step;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public double mDistance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public double mCalories;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int mStepGoal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public int mCalGoal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public int mActGoal;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public int mTimeGoal;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public double mDuration;

    @JvmOverloads
    public lji() {
        this(0L, 0.0d, 0.0d, 0, 0, 0, 0, 0.0d, 255, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMActGoal() {
        return this.mActGoal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMCalGoal() {
        return this.mCalGoal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getMCalories() {
        return this.mCalories;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getMDistance() {
        return this.mDistance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getMDuration() {
        return this.mDuration;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMStepGoal() {
        return this.mStepGoal;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMTimeGoal() {
        return this.mTimeGoal;
    }

    public final void i(int i) {
        this.mActGoal = i;
    }

    public final void j(int i) {
        this.mCalGoal = i;
    }

    public final void k(double d) {
        this.mCalories = d;
    }

    public final void l(long step, double dis, double cal) {
        this.step = step;
        this.mDistance = dis;
        this.mCalories = cal;
    }

    public final void m(double d) {
        this.mDistance = d;
    }

    public final void n(double d) {
        this.mDuration = d;
    }

    public final void o(long j2) {
        this.step = j2;
    }

    public final void p(int i) {
        this.mStepGoal = i;
    }

    public final void q(int i) {
        this.mTimeGoal = i;
    }

    @NotNull
    public String toString() {
        return "SportsDisplayData{mStep=" + this.step + ", mDistance=" + this.mDistance + ", mCalories=" + this.mCalories + ", mStepGoal=" + this.mStepGoal + ", mCalGoal=" + this.mCalGoal + ", mActGoal=" + this.mActGoal + ", mTimeGoal=" + this.mTimeGoal + ", mDuration=" + this.mDuration + "}";
    }

    @JvmOverloads
    public lji(long j2, double d, double d2, int i, int i2, int i3, int i4, double d3) {
        this.step = j2;
        this.mDistance = d;
        this.mCalories = d2;
        this.mStepGoal = i;
        this.mCalGoal = i2;
        this.mActGoal = i3;
        this.mTimeGoal = i4;
        this.mDuration = d3;
    }

    public /* synthetic */ lji(long j2, double d, double d2, int i, int i2, int i3, int i4, double d3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0L : j2, (i5 & 2) != 0 ? 0.0d : d, (i5 & 4) != 0 ? 0.0d : d2, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) == 0 ? i4 : 0, (i5 & 128) == 0 ? d3 : 0.0d);
    }

    public lji(long j2, double d, double d2, int i, double d3) {
        this(j2, d, d2, i, 0, 0, 0, d3, 112, null);
    }
}
