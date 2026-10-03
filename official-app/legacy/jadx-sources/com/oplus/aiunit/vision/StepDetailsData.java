package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.nri, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\u0017\u0010\tR\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0005\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b \u0010\tR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0016\u0010%R\"\u0010)\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\r\u001a\u0004\b#\u0010\u000f\"\u0004\b(\u0010\u0011R\"\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b'\u0010\u000f\"\u0004\b*\u0010\u0011R\"\u0010-\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b,\u0010\u0011R\"\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0005\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\tR\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0005\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\t¨\u00066"}, d2 = {"Lcom/oplus/aiunit/vision/nri;", "", "", "toString", "a", "Ljava/lang/String;", MapSchema.FIELD_NAME_KEY, "()Ljava/lang/String;", "w", "(Ljava/lang/String;)V", "title", "", "b", "I", b2n.f, "()I", "s", "(I)V", "maxProgress", "c", LogFieldKey.PROCESS_NAME_KEY, "curProgress", "d", "o", "consumeKcalStr", MapSchema.FIELD_NAME_ENTRY, "q", "distanceStr", "f", "j", "v", "noCurDataTip", "n", "averageStepTip", "", b2n.g, "Ljava/util/List;", "()Ljava/util/List;", "dataList", "i", "t", "maxYAxisValue", "u", "minYAxisValue", "r", "limitLineValue", LogFieldKey.LEVEL_KEY, "x", "xAxisLeftLabel", LogFieldKey.MESSAGE_KEY, "y", "xAxisRightLabel", "<init>", "()V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class StepDetailsData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int maxProgress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int cur;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public int minYAxisValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    public int limitLineValue;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String title = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String consumeKcalStr = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String distanceStr = "";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public String noCurDataTip = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public String averageStepTip = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final List<Integer> dataList = new ArrayList();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public int maxYAxisValue = 8000;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String xAxisLeftLabel = "";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public String xAxisRightLabel = "";

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAverageStepTip() {
        return this.averageStepTip;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getConsumeKcalStr() {
        return this.consumeKcalStr;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCur() {
        return this.cur;
    }

    @NotNull
    public final List<Integer> d() {
        return this.dataList;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDistanceStr() {
        return this.distanceStr;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getLimitLineValue() {
        return this.limitLineValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMaxProgress() {
        return this.maxProgress;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMaxYAxisValue() {
        return this.maxYAxisValue;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMinYAxisValue() {
        return this.minYAxisValue;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getNoCurDataTip() {
        return this.noCurDataTip;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getXAxisLeftLabel() {
        return this.xAxisLeftLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getXAxisRightLabel() {
        return this.xAxisRightLabel;
    }

    public final void n(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.averageStepTip = str;
    }

    public final void o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consumeKcalStr = str;
    }

    public final void p(int i) {
        this.cur = i;
    }

    public final void q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.distanceStr = str;
    }

    public final void r(int i) {
        this.limitLineValue = i;
    }

    public final void s(int i) {
        this.maxProgress = i;
    }

    public final void t(int i) {
        this.maxYAxisValue = i;
    }

    @NotNull
    public String toString() {
        return "StepDetailsData(maxProgress=" + this.maxProgress + ", cur=" + this.cur + ",  dataList=" + this.dataList + ", maxYAxisValue=" + this.maxYAxisValue + ", minYAxisValue=" + this.minYAxisValue + ", limitLineValue=" + this.limitLineValue + ")";
    }

    public final void u(int i) {
        this.minYAxisValue = i;
    }

    public final void v(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.noCurDataTip = str;
    }

    public final void w(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void x(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.xAxisLeftLabel = str;
    }

    public final void y(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.xAxisRightLabel = str;
    }
}
