package com.heytap.health.oaf;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u001d\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010)\u001a\u00020\u0005J\t\u0010*\u001a\u00020\u0007HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006,"}, d2 = {"Lcom/heytap/health/oaf/LinkReasonBean;", "", "reasonType", "Lcom/heytap/health/oaf/LinkReasonType;", EngineConstant.REASON, "", "code", "", "(Lcom/heytap/health/oaf/LinkReasonType;Ljava/lang/String;I)V", "(Lcom/heytap/health/oaf/LinkReasonType;Ljava/lang/String;)V", ServiceNodeBundleKeys.DEVICE_NAME, "getDeviceName", "()Ljava/lang/String;", "setDeviceName", "(Ljava/lang/String;)V", "mac", "getMac", "setMac", "oafCode", "getOafCode", "()I", "setOafCode", "(I)V", "getReason", "setReason", "getReasonType", "()Lcom/heytap/health/oaf/LinkReasonType;", "setReasonType", "(Lcom/heytap/health/oaf/LinkReasonType;)V", ClickApiEntity.TIME, "", "getTime", "()J", "setTime", "(J)V", "component1", "component2", "copy", "equals", "", "other", "getStageReason", "hashCode", "toString", "oafhost_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LinkReasonBean {

    @NotNull
    private String deviceName;

    @NotNull
    private String mac;
    private int oafCode;

    @NotNull
    private String reason;

    @NotNull
    private LinkReasonType reasonType;
    private long time;

    public LinkReasonBean(@NotNull LinkReasonType reasonType, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reasonType, "reasonType");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.reasonType = reasonType;
        this.reason = reason;
        this.mac = "";
        this.deviceName = "";
        this.time = System.currentTimeMillis();
        this.oafCode = -1;
    }

    public static /* synthetic */ LinkReasonBean copy$default(LinkReasonBean linkReasonBean, LinkReasonType linkReasonType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            linkReasonType = linkReasonBean.reasonType;
        }
        if ((i & 2) != 0) {
            str = linkReasonBean.reason;
        }
        return linkReasonBean.copy(linkReasonType, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LinkReasonType getReasonType() {
        return this.reasonType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final LinkReasonBean copy(@NotNull LinkReasonType reasonType, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reasonType, "reasonType");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new LinkReasonBean(reasonType, reason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkReasonBean)) {
            return false;
        }
        LinkReasonBean linkReasonBean = (LinkReasonBean) other;
        return this.reasonType == linkReasonBean.reasonType && Intrinsics.areEqual(this.reason, linkReasonBean.reason);
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    public final int getOafCode() {
        return this.oafCode;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final LinkReasonType getReasonType() {
        return this.reasonType;
    }

    @NotNull
    public final String getStageReason() {
        return "reasonType=" + this.reasonType.name() + "&reason=" + this.reason + "&device=" + this.deviceName + "&time=" + this.time;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (this.reasonType.hashCode() * 31) + this.reason.hashCode();
    }

    public final void setDeviceName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceName = str;
    }

    public final void setMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }

    public final void setOafCode(int i) {
        this.oafCode = i;
    }

    public final void setReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reason = str;
    }

    public final void setReasonType(@NotNull LinkReasonType linkReasonType) {
        Intrinsics.checkNotNullParameter(linkReasonType, "<set-?>");
        this.reasonType = linkReasonType;
    }

    public final void setTime(long j2) {
        this.time = j2;
    }

    @NotNull
    public String toString() {
        return "LinkReasonBean(reasonType=" + this.reasonType + ", reason=" + this.reason + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkReasonBean(@NotNull LinkReasonType reasonType, @NotNull String reason, int i) {
        this(reasonType, reason);
        Intrinsics.checkNotNullParameter(reasonType, "reasonType");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.oafCode = i;
    }
}
