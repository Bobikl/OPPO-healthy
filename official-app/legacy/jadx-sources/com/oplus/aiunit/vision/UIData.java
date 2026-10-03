package com.oplus.aiunit.vision;

import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.xek, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0013\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/xek;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setNum", "(Ljava/lang/String;)V", "num", "b", "setLabel", Feedback.WIDGET_LABEL, "setGoalLabel", "goalLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class UIData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String num;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public String label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String goalLabel;

    public UIData(@NotNull String num, @NotNull String label, @Nullable String str) {
        Intrinsics.checkNotNullParameter(num, "num");
        Intrinsics.checkNotNullParameter(label, "label");
        this.num = num;
        this.label = label;
        this.goalLabel = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGoalLabel() {
        return this.goalLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNum() {
        return this.num;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIData)) {
            return false;
        }
        UIData uIData = (UIData) other;
        return Intrinsics.areEqual(this.num, uIData.num) && Intrinsics.areEqual(this.label, uIData.label) && Intrinsics.areEqual(this.goalLabel, uIData.goalLabel);
    }

    public int hashCode() {
        int iHashCode = ((this.num.hashCode() * 31) + this.label.hashCode()) * 31;
        String str = this.goalLabel;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "UIData(num=" + this.num + ", label=" + this.label + ", goalLabel=" + this.goalLabel + ")";
    }
}
