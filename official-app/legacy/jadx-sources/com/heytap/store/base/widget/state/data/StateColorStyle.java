package com.heytap.store.base.widget.state.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/heytap/store/base/widget/state/data/StateColorStyle;", "", "titleColor", "", "btnColor", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBtnColor", "()Ljava/lang/Integer;", "setBtnColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTitleColor", "setTitleColor", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/heytap/store/base/widget/state/data/StateColorStyle;", "equals", "", "other", "hashCode", "toString", "", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class StateColorStyle {

    @Nullable
    private Integer btnColor;

    @Nullable
    private Integer titleColor;

    /* JADX WARN: Multi-variable type inference failed */
    public StateColorStyle() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StateColorStyle copy$default(StateColorStyle stateColorStyle, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = stateColorStyle.titleColor;
        }
        if ((i & 2) != 0) {
            num2 = stateColorStyle.btnColor;
        }
        return stateColorStyle.copy(num, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBtnColor() {
        return this.btnColor;
    }

    @NotNull
    public final StateColorStyle copy(@Nullable Integer titleColor, @Nullable Integer btnColor) {
        return new StateColorStyle(titleColor, btnColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateColorStyle)) {
            return false;
        }
        StateColorStyle stateColorStyle = (StateColorStyle) other;
        return Intrinsics.areEqual(this.titleColor, stateColorStyle.titleColor) && Intrinsics.areEqual(this.btnColor, stateColorStyle.btnColor);
    }

    @Nullable
    public final Integer getBtnColor() {
        return this.btnColor;
    }

    @Nullable
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        Integer num = this.titleColor;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.btnColor;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setBtnColor(@Nullable Integer num) {
        this.btnColor = num;
    }

    public final void setTitleColor(@Nullable Integer num) {
        this.titleColor = num;
    }

    @NotNull
    public String toString() {
        return "StateColorStyle(titleColor=" + this.titleColor + ", btnColor=" + this.btnColor + ')';
    }

    public StateColorStyle(@Nullable Integer num, @Nullable Integer num2) {
        this.titleColor = num;
        this.btnColor = num2;
    }

    public /* synthetic */ StateColorStyle(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
