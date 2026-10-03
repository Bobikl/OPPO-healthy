package com.heytap.health.watchface.business.creation.category.flexible.bean;

import androidx.annotation.Keep;
import com.heytap.health.watchface.R$string;
import com.oplus.aiunit.vision.b78;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B3\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010\"J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u0019\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\"\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015¨\u0006%"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/bean/ComplicationSummaryBean;", "Ljava/io/Serializable;", "", "other", "", "equals", "", "hashCode", "", "toString", "slotName", "Ljava/lang/String;", "getSlotName", "()Ljava/lang/String;", "setSlotName", "(Ljava/lang/String;)V", "slotId", "I", "getSlotId", "()I", "setSlotId", "(I)V", "providerMode", "getProviderMode", "setProviderMode", "complicationName", "getComplicationName", "setComplicationName", "providerId", "getProviderId", "setProviderId", "<init>", "(Ljava/lang/String;IILjava/lang/String;I)V", "bean", "(Lcom/heytap/health/watchface/business/creation/category/flexible/bean/ComplicationSummaryBean;)V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ComplicationSummaryBean implements Serializable {

    @NotNull
    private String complicationName;
    private int providerId;
    private int providerMode;
    private int slotId;

    @NotNull
    private String slotName;

    public ComplicationSummaryBean(@NotNull String slotName, int i, int i2, @NotNull String complicationName, int i3) {
        Intrinsics.checkNotNullParameter(slotName, "slotName");
        Intrinsics.checkNotNullParameter(complicationName, "complicationName");
        this.slotName = slotName;
        this.slotId = i;
        this.providerMode = i2;
        this.complicationName = complicationName;
        this.providerId = i3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(ComplicationSummaryBean.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.watchface.business.creation.category.flexible.bean.ComplicationSummaryBean");
        ComplicationSummaryBean complicationSummaryBean = (ComplicationSummaryBean) other;
        return this.slotId == complicationSummaryBean.slotId && this.providerMode == complicationSummaryBean.providerMode && this.providerId == complicationSummaryBean.providerId;
    }

    @NotNull
    public final String getComplicationName() {
        return this.complicationName;
    }

    public final int getProviderId() {
        return this.providerId;
    }

    public final int getProviderMode() {
        return this.providerMode;
    }

    public final int getSlotId() {
        return this.slotId;
    }

    @NotNull
    public final String getSlotName() {
        return this.slotName;
    }

    public int hashCode() {
        return (((this.slotId * 31) + this.providerMode) * 31) + this.providerId;
    }

    public final void setComplicationName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.complicationName = str;
    }

    public final void setProviderId(int i) {
        this.providerId = i;
    }

    public final void setProviderMode(int i) {
        this.providerMode = i;
    }

    public final void setSlotId(int i) {
        this.slotId = i;
    }

    public final void setSlotName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.slotName = str;
    }

    @NotNull
    public String toString() {
        return "ComplicationSummaryBean(slotId=" + this.slotId + ", providerMode=" + this.providerMode + ", providerId=" + this.providerId + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ComplicationSummaryBean(String str, int i, int i2, String str2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i4 & 8) != 0) {
            str2 = b78.a().getString(R$string.watch_face_complication_none);
            Intrinsics.checkNotNullExpressionValue(str2, "getAppContext()\n        …h_face_complication_none)");
        }
        this(str, i, i2, str2, (i4 & 16) != 0 ? 0 : i3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComplicationSummaryBean(@NotNull ComplicationSummaryBean bean) {
        this(bean.slotName, bean.slotId, bean.providerMode, bean.complicationName, bean.providerId);
        Intrinsics.checkNotNullParameter(bean, "bean");
    }
}
