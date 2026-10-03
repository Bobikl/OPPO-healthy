package com.oplus.aiunit.vision;

import android.os.Bundle;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ejm, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u000f\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/ejm;", "Lcom/oplus/aiunit/vision/t9m;", "", "toString", "", "hashCode", "", "other", "", "equals", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/String;", b2n.g, "()Ljava/lang/String;", "widgetCode", "f", b2n.f, "state", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CardStateEvent extends t9m {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String widgetCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final String state;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Bundle data;

    public CardStateEvent(@NotNull String widgetCode, @NotNull String state) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(state, "state");
        this.widgetCode = widgetCode;
        this.state = state;
        c(System.currentTimeMillis());
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Bundle getData() {
        return this.data;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardStateEvent)) {
            return false;
        }
        CardStateEvent cardStateEvent = (CardStateEvent) other;
        return Intrinsics.areEqual(this.widgetCode, cardStateEvent.widgetCode) && Intrinsics.areEqual(this.state, cardStateEvent.state);
    }

    public final void f(@Nullable Bundle bundle) {
        this.data = bundle;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getWidgetCode() {
        return this.widgetCode;
    }

    public int hashCode() {
        return (this.widgetCode.hashCode() * 31) + this.state.hashCode();
    }

    @NotNull
    public String toString() {
        return "CardStateEvent(widgetCode=" + this.widgetCode + ", state=" + this.state + ")";
    }
}
