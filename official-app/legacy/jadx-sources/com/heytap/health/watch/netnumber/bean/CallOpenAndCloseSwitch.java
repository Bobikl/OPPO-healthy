package com.heytap.health.watch.netnumber.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/heytap/health/watch/netnumber/bean/CallOpenAndCloseSwitch;", "", "isOpen", "", "slotId", "", "type", "", "days", "startHour", "endHour", "startMinute", "endMinute", "(ZILjava/lang/String;IIIII)V", "getDays", "()I", "getEndHour", "getEndMinute", "()Z", "getSlotId", "getStartHour", "getStartMinute", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CallOpenAndCloseSwitch {
    private final int days;
    private final int endHour;
    private final int endMinute;
    private final boolean isOpen;
    private final int slotId;
    private final int startHour;
    private final int startMinute;

    @NotNull
    private final String type;

    public CallOpenAndCloseSwitch(boolean z, int i, @NotNull String type, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.isOpen = z;
        this.slotId = i;
        this.type = type;
        this.days = i2;
        this.startHour = i3;
        this.endHour = i4;
        this.startMinute = i5;
        this.endMinute = i6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSlotId() {
        return this.slotId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDays() {
        return this.days;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStartHour() {
        return this.startHour;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getEndHour() {
        return this.endHour;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStartMinute() {
        return this.startMinute;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getEndMinute() {
        return this.endMinute;
    }

    @NotNull
    public final CallOpenAndCloseSwitch copy(boolean isOpen, int slotId, @NotNull String type, int days, int startHour, int endHour, int startMinute, int endMinute) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new CallOpenAndCloseSwitch(isOpen, slotId, type, days, startHour, endHour, startMinute, endMinute);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallOpenAndCloseSwitch)) {
            return false;
        }
        CallOpenAndCloseSwitch callOpenAndCloseSwitch = (CallOpenAndCloseSwitch) other;
        return this.isOpen == callOpenAndCloseSwitch.isOpen && this.slotId == callOpenAndCloseSwitch.slotId && Intrinsics.areEqual(this.type, callOpenAndCloseSwitch.type) && this.days == callOpenAndCloseSwitch.days && this.startHour == callOpenAndCloseSwitch.startHour && this.endHour == callOpenAndCloseSwitch.endHour && this.startMinute == callOpenAndCloseSwitch.startMinute && this.endMinute == callOpenAndCloseSwitch.endMinute;
    }

    public final int getDays() {
        return this.days;
    }

    public final int getEndHour() {
        return this.endHour;
    }

    public final int getEndMinute() {
        return this.endMinute;
    }

    public final int getSlotId() {
        return this.slotId;
    }

    public final int getStartHour() {
        return this.startHour;
    }

    public final int getStartMinute() {
        return this.startMinute;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public int hashCode() {
        boolean z = this.isOpen;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((((((((r0 * 31) + Integer.hashCode(this.slotId)) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.days)) * 31) + Integer.hashCode(this.startHour)) * 31) + Integer.hashCode(this.endHour)) * 31) + Integer.hashCode(this.startMinute)) * 31) + Integer.hashCode(this.endMinute);
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    @NotNull
    public String toString() {
        return "CallOpenAndCloseSwitch(isOpen=" + this.isOpen + ", slotId=" + this.slotId + ", type=" + this.type + ", days=" + this.days + ", startHour=" + this.startHour + ", endHour=" + this.endHour + ", startMinute=" + this.startMinute + ", endMinute=" + this.endMinute + ")";
    }
}
