package com.oplus.aiunit.vision;

import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\u0007R\"\u0010\u0019\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\n\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/txa;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", Feedback.WIDGET_LABEL, "", "b", "I", "c", "()I", b2n.g, "(I)V", "value", "d", "i", "valueShow", "", "Z", "()Z", b2n.f, "(Z)V", "showBattery", MapSchema.FIELD_NAME_ENTRY, "f", "isCharging", "<init>", "()V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class txa {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String valueShow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean showBattery;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isCharging;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowBattery() {
        return this.showBattery;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getValueShow() {
        return this.valueShow;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsCharging() {
        return this.isCharging;
    }

    public final void f(boolean z) {
        this.isCharging = z;
    }

    public final void g(boolean z) {
        this.showBattery = z;
    }

    public final void h(int i) {
        this.value = i;
    }

    public final void i(@Nullable String str) {
        this.valueShow = str;
    }
}
