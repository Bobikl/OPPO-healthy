package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.cardiovascular.model.SingleOsaInfo;
import com.heytap.health.cardiovascular.model.SnoreAnalysis;
import com.heytap.health.cardiovascular.model.TempCrossAnalysis;
import com.heytap.health.cardiovascular.model.WristTemperatureInfo;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0005\u000e\u000fB\u001b\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/jxf;", "", "", "a", "Z", "b", "()Z", "isRisk", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "state", "<init>", "(ZLjava/lang/Integer;)V", "c", "d", "Lcom/oplus/aiunit/vision/jxf$a;", "Lcom/oplus/aiunit/vision/jxf$b;", "Lcom/oplus/aiunit/vision/jxf$c;", "Lcom/oplus/aiunit/vision/jxf$d;", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public abstract class jxf {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isRisk;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Integer state;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/jxf$a;", "Lcom/oplus/aiunit/vision/jxf;", "", "isRisk", "", "state", "<init>", "(ZI)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends jxf {
        public static final int $stable = 0;

        public a(boolean z, int i) {
            super(z, Integer.valueOf(i), null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/jxf$b;", "Lcom/oplus/aiunit/vision/jxf;", "Lcom/heytap/health/cardiovascular/model/SnoreAnalysis;", "c", "Lcom/heytap/health/cardiovascular/model/SnoreAnalysis;", "d", "()Lcom/heytap/health/cardiovascular/model/SnoreAnalysis;", "weekSnoreAnalysis", "Lcom/heytap/health/cardiovascular/model/SingleOsaInfo;", "Lcom/heytap/health/cardiovascular/model/SingleOsaInfo;", "()Lcom/heytap/health/cardiovascular/model/SingleOsaInfo;", "singleOsa", "", "isRisk", "", "state", "<init>", "(ZLjava/lang/Integer;Lcom/heytap/health/cardiovascular/model/SnoreAnalysis;Lcom/heytap/health/cardiovascular/model/SingleOsaInfo;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends jxf {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final SnoreAnalysis weekSnoreAnalysis;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final SingleOsaInfo singleOsa;

        public b(boolean z, @Nullable Integer num, @Nullable SnoreAnalysis snoreAnalysis, @Nullable SingleOsaInfo singleOsaInfo) {
            super(z, num, null);
            this.weekSnoreAnalysis = snoreAnalysis;
            this.singleOsa = singleOsaInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final SingleOsaInfo getSingleOsa() {
            return this.singleOsa;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final SnoreAnalysis getWeekSnoreAnalysis() {
            return this.weekSnoreAnalysis;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/jxf$c;", "Lcom/oplus/aiunit/vision/jxf;", "", "isRisk", "", "state", "<init>", "(ZLjava/lang/Integer;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends jxf {
        public static final int $stable = 0;

        public c(boolean z, @Nullable Integer num) {
            super(z, num, null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/jxf$d;", "Lcom/oplus/aiunit/vision/jxf;", "Lcom/heytap/health/cardiovascular/model/TempCrossAnalysis;", "c", "Lcom/heytap/health/cardiovascular/model/TempCrossAnalysis;", "()Lcom/heytap/health/cardiovascular/model/TempCrossAnalysis;", "analysis", "Lcom/heytap/health/cardiovascular/model/WristTemperatureInfo;", "d", "Lcom/heytap/health/cardiovascular/model/WristTemperatureInfo;", "()Lcom/heytap/health/cardiovascular/model/WristTemperatureInfo;", "singleWristInfo", "", "isRisk", "", "state", "<init>", "(ZLjava/lang/Integer;Lcom/heytap/health/cardiovascular/model/TempCrossAnalysis;Lcom/heytap/health/cardiovascular/model/WristTemperatureInfo;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends jxf {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final TempCrossAnalysis analysis;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final WristTemperatureInfo singleWristInfo;

        public d(boolean z, @Nullable Integer num, @Nullable TempCrossAnalysis tempCrossAnalysis, @Nullable WristTemperatureInfo wristTemperatureInfo) {
            super(z, num, null);
            this.analysis = tempCrossAnalysis;
            this.singleWristInfo = wristTemperatureInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TempCrossAnalysis getAnalysis() {
            return this.analysis;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final WristTemperatureInfo getSingleWristInfo() {
            return this.singleWristInfo;
        }
    }

    public /* synthetic */ jxf(boolean z, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, num);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsRisk() {
        return this.isRisk;
    }

    public jxf(boolean z, Integer num) {
        this.isRisk = z;
        this.state = num;
    }
}
