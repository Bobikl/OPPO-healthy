package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.view.exceptionview.DevicePageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.gfk, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/gfk;", "PB", "", "Lcom/heytap/health/base/view/exceptionview/DevicePageType;", "state", "data", "a", "(Lcom/heytap/health/base/view/exceptionview/DevicePageType;Ljava/lang/Object;)Lcom/oplus/aiunit/vision/gfk;", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/health/base/view/exceptionview/DevicePageType;", "d", "()Lcom/heytap/health/base/view/exceptionview/DevicePageType;", "b", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "<init>", "(Lcom/heytap/health/base/view/exceptionview/DevicePageType;Ljava/lang/Object;)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class UIState<PB> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final DevicePageType state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final PB data;

    public UIState(@NotNull DevicePageType state, @Nullable PB pb) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.data = pb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState b(UIState uIState, DevicePageType devicePageType, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            devicePageType = uIState.state;
        }
        if ((i & 2) != 0) {
            obj = uIState.data;
        }
        return uIState.a(devicePageType, obj);
    }

    @NotNull
    public final UIState<PB> a(@NotNull DevicePageType state, @Nullable PB data) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new UIState<>(state, data);
    }

    @Nullable
    public final PB c() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final DevicePageType getState() {
        return this.state;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return this.state == uIState.state && Intrinsics.areEqual(this.data, uIState.data);
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        PB pb = this.data;
        return iHashCode + (pb == null ? 0 : pb.hashCode());
    }

    @NotNull
    public String toString() {
        return "UIState(state=" + this.state + ", data=" + this.data + ")";
    }

    public /* synthetic */ UIState(DevicePageType devicePageType, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(devicePageType, (i & 2) != 0 ? null : obj);
    }
}
