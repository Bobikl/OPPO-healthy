package com.oplus.aiunit.vision;

import com.heytap.store.business.rn.service.RnConstant;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.bbm, reason: from toString */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\tB-\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/bbm;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "widgetCode", "b", "I", "()I", "action", "", "Ljava/util/Map;", "()Ljava/util/Map;", RnConstant.KEY_INIT_OPTIONS, "<init>", "(Ljava/lang/String;ILjava/util/Map;)V", "d", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CardAction {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String widgetCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int action;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Map<String, String> param;

    public CardAction(@NotNull String widgetCode, int i, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        this.widgetCode = widgetCode;
        this.action = i;
        this.param = map;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    @Nullable
    public final Map<String, String> b() {
        return this.param;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getWidgetCode() {
        return this.widgetCode;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardAction)) {
            return false;
        }
        CardAction cardAction = (CardAction) other;
        return Intrinsics.areEqual(this.widgetCode, cardAction.widgetCode) && this.action == cardAction.action && Intrinsics.areEqual(this.param, cardAction.param);
    }

    public int hashCode() {
        int iHashCode = ((this.widgetCode.hashCode() * 31) + Integer.hashCode(this.action)) * 31;
        Map<String, String> map = this.param;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "CardAction(widgetCode=" + this.widgetCode + ", action=" + this.action + ", param=" + this.param + ")";
    }
}
