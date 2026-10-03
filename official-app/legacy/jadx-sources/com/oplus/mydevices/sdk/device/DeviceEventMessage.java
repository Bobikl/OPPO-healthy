package com.oplus.mydevices.sdk.device;

import androidx.annotation.Keep;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/oplus/mydevices/sdk/device/DeviceEventMessage;", "", "eventMessageType", "", "timestamp", "", "content", "", TraceConstants.INTELLIGENT_DATA_EVENT_CODE, "(ILjava/lang/Long;Ljava/lang/String;I)V", "getContent", "()Ljava/lang/String;", "getEventCode", "()I", "getEventMessageType", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Long;Ljava/lang/String;I)Lcom/oplus/mydevices/sdk/device/DeviceEventMessage;", "equals", "", "other", "hashCode", "toString", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class DeviceEventMessage {

    @NotNull
    private final String content;
    private final int eventCode;
    private final int eventMessageType;

    @Nullable
    private final Long timestamp;

    public DeviceEventMessage(int i, @Nullable Long l2, @NotNull String content, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.eventMessageType = i;
        this.timestamp = l2;
        this.content = content;
        this.eventCode = i2;
    }

    public static /* synthetic */ DeviceEventMessage copy$default(DeviceEventMessage deviceEventMessage, int i, Long l2, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = deviceEventMessage.eventMessageType;
        }
        if ((i3 & 2) != 0) {
            l2 = deviceEventMessage.timestamp;
        }
        if ((i3 & 4) != 0) {
            str = deviceEventMessage.content;
        }
        if ((i3 & 8) != 0) {
            i2 = deviceEventMessage.eventCode;
        }
        return deviceEventMessage.copy(i, l2, str, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEventMessageType() {
        return this.eventMessageType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getEventCode() {
        return this.eventCode;
    }

    @NotNull
    public final DeviceEventMessage copy(int eventMessageType, @Nullable Long timestamp, @NotNull String content, int eventCode) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new DeviceEventMessage(eventMessageType, timestamp, content, eventCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceEventMessage)) {
            return false;
        }
        DeviceEventMessage deviceEventMessage = (DeviceEventMessage) other;
        return this.eventMessageType == deviceEventMessage.eventMessageType && Intrinsics.areEqual(this.timestamp, deviceEventMessage.timestamp) && Intrinsics.areEqual(this.content, deviceEventMessage.content) && this.eventCode == deviceEventMessage.eventCode;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final int getEventCode() {
        return this.eventCode;
    }

    public final int getEventMessageType() {
        return this.eventMessageType;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i = this.eventMessageType * 31;
        Long l2 = this.timestamp;
        int iHashCode = (i + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.content;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.eventCode;
    }

    @NotNull
    public String toString() {
        return "DeviceEventMessage(eventMessageType=" + this.eventMessageType + ", timestamp=" + this.timestamp + ", content=" + this.content + ", eventCode=" + this.eventCode + ")";
    }
}
