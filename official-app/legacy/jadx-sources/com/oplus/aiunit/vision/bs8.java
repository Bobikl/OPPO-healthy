package com.oplus.aiunit.vision;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0005\"\u0004\b\u000e\u0010\u0007R\"\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0011\u001a\u0004\b\f\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/bs8;", "Lcom/github/mikephil/charting/data/LineDataSet;", "", "a", "Z", "()Z", MapSchema.FIELD_NAME_ENTRY, "(Z)V", "animationEnable", "b", "f", "animationFadeOut", "c", "d", b2n.f, "isDrawOuterCircleEnabled", "", UserInfo.SEX_FEMALE, "()F", b2n.g, "(F)V", "outerCircleHoleRadius", "", "Lcom/github/mikephil/charting/data/Entry;", "yEntryList", "", Feedback.WIDGET_LABEL, "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
public final class bs8 extends LineDataSet {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean animationEnable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean animationFadeOut;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isDrawOuterCircleEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float outerCircleHoleRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs8(@NotNull List<Entry> yEntryList, @NotNull String label) {
        super(yEntryList, label);
        Intrinsics.checkNotNullParameter(yEntryList, "yEntryList");
        Intrinsics.checkNotNullParameter(label, "label");
        this.outerCircleHoleRadius = 12.0f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAnimationFadeOut() {
        return this.animationFadeOut;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getOuterCircleHoleRadius() {
        return this.outerCircleHoleRadius;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsDrawOuterCircleEnabled() {
        return this.isDrawOuterCircleEnabled;
    }

    public final void e(boolean z) {
        this.animationEnable = z;
    }

    public final void f(boolean z) {
        this.animationFadeOut = z;
    }

    public final void g(boolean z) {
        this.isDrawOuterCircleEnabled = z;
    }

    public final void h(float f) {
        this.outerCircleHoleRadius = f;
    }
}
