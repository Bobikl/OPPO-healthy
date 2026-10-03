package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/PinResBean;", "", "normalPinBean", "Lcom/heytap/health/devicemanager/processor/bean/NormalPinBean;", "notifyPinBean", "Lcom/heytap/health/devicemanager/processor/bean/NotifyPinBean;", "(Lcom/heytap/health/devicemanager/processor/bean/NormalPinBean;Lcom/heytap/health/devicemanager/processor/bean/NotifyPinBean;)V", "getNormalPinBean", "()Lcom/heytap/health/devicemanager/processor/bean/NormalPinBean;", "getNotifyPinBean", "()Lcom/heytap/health/devicemanager/processor/bean/NotifyPinBean;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PinResBean {

    @NotNull
    private final NormalPinBean normalPinBean;

    @NotNull
    private final NotifyPinBean notifyPinBean;

    public PinResBean(@NotNull NormalPinBean normalPinBean, @NotNull NotifyPinBean notifyPinBean) {
        Intrinsics.checkNotNullParameter(normalPinBean, "normalPinBean");
        Intrinsics.checkNotNullParameter(notifyPinBean, "notifyPinBean");
        this.normalPinBean = normalPinBean;
        this.notifyPinBean = notifyPinBean;
    }

    public static /* synthetic */ PinResBean copy$default(PinResBean pinResBean, NormalPinBean normalPinBean, NotifyPinBean notifyPinBean, int i, Object obj) {
        if ((i & 1) != 0) {
            normalPinBean = pinResBean.normalPinBean;
        }
        if ((i & 2) != 0) {
            notifyPinBean = pinResBean.notifyPinBean;
        }
        return pinResBean.copy(normalPinBean, notifyPinBean);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NormalPinBean getNormalPinBean() {
        return this.normalPinBean;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NotifyPinBean getNotifyPinBean() {
        return this.notifyPinBean;
    }

    @NotNull
    public final PinResBean copy(@NotNull NormalPinBean normalPinBean, @NotNull NotifyPinBean notifyPinBean) {
        Intrinsics.checkNotNullParameter(normalPinBean, "normalPinBean");
        Intrinsics.checkNotNullParameter(notifyPinBean, "notifyPinBean");
        return new PinResBean(normalPinBean, notifyPinBean);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinResBean)) {
            return false;
        }
        PinResBean pinResBean = (PinResBean) other;
        return Intrinsics.areEqual(this.normalPinBean, pinResBean.normalPinBean) && Intrinsics.areEqual(this.notifyPinBean, pinResBean.notifyPinBean);
    }

    @NotNull
    public final NormalPinBean getNormalPinBean() {
        return this.normalPinBean;
    }

    @NotNull
    public final NotifyPinBean getNotifyPinBean() {
        return this.notifyPinBean;
    }

    public int hashCode() {
        return (this.normalPinBean.hashCode() * 31) + this.notifyPinBean.hashCode();
    }

    @NotNull
    public String toString() {
        return "PinResBean(normalPinBean=" + this.normalPinBean + ", notifyPinBean=" + this.notifyPinBean + ")";
    }
}
