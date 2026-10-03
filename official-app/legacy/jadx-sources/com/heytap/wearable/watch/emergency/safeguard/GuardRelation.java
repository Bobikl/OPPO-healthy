package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import com.heytap.wearable.emergency.api.emergency.EmergencyTransportApis;
import com.oplus.aiunit.vision.h27;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jq\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u000bHÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010¨\u0006."}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/GuardRelation;", "Ljava/io/Serializable;", "id", "", "userName", "", "remark", "guardPhone", h27.FAMILY_KEY_PUSH_FRIEND_MASKED_MOBILE, h27.FAMILY_KEY_PUSH_FRIEND_AVATAR, "status", "", EmergencyTransportApis.KEY_TRAVEL_ID, "lastTravelId", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getGuardPhone", "getId", "()J", "getLastTravelId", "setLastTravelId", "(Ljava/lang/String;)V", "getMaskedMobile", "getRemark", "getStatus", "()I", "getTravelId", "setTravelId", "getUserName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GuardRelation implements Serializable {

    @Nullable
    private final String avatar;

    @Nullable
    private final String guardPhone;
    private final long id;

    @Nullable
    private String lastTravelId;

    @Nullable
    private final String maskedMobile;

    @Nullable
    private final String remark;
    private final int status;

    @Nullable
    private String travelId;

    @Nullable
    private final String userName;

    public GuardRelation(long j2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, @Nullable String str6, @Nullable String str7) {
        this.id = j2;
        this.userName = str;
        this.remark = str2;
        this.guardPhone = str3;
        this.maskedMobile = str4;
        this.avatar = str5;
        this.status = i;
        this.travelId = str6;
        this.lastTravelId = str7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGuardPhone() {
        return this.guardPhone;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMaskedMobile() {
        return this.maskedMobile;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTravelId() {
        return this.travelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLastTravelId() {
        return this.lastTravelId;
    }

    @NotNull
    public final GuardRelation copy(long id, @Nullable String userName, @Nullable String remark, @Nullable String guardPhone, @Nullable String maskedMobile, @Nullable String avatar, int status, @Nullable String travelId, @Nullable String lastTravelId) {
        return new GuardRelation(id, userName, remark, guardPhone, maskedMobile, avatar, status, travelId, lastTravelId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuardRelation)) {
            return false;
        }
        GuardRelation guardRelation = (GuardRelation) other;
        return this.id == guardRelation.id && Intrinsics.areEqual(this.userName, guardRelation.userName) && Intrinsics.areEqual(this.remark, guardRelation.remark) && Intrinsics.areEqual(this.guardPhone, guardRelation.guardPhone) && Intrinsics.areEqual(this.maskedMobile, guardRelation.maskedMobile) && Intrinsics.areEqual(this.avatar, guardRelation.avatar) && this.status == guardRelation.status && Intrinsics.areEqual(this.travelId, guardRelation.travelId) && Intrinsics.areEqual(this.lastTravelId, guardRelation.lastTravelId);
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getGuardPhone() {
        return this.guardPhone;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getLastTravelId() {
        return this.lastTravelId;
    }

    @Nullable
    public final String getMaskedMobile() {
        return this.maskedMobile;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTravelId() {
        return this.travelId;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.userName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.remark;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.guardPhone;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.maskedMobile;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.avatar;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.status)) * 31;
        String str6 = this.travelId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastTravelId;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setLastTravelId(@Nullable String str) {
        this.lastTravelId = str;
    }

    public final void setTravelId(@Nullable String str) {
        this.travelId = str;
    }

    @NotNull
    public String toString() {
        return "GuardRelation(id=" + this.id + ", userName=" + this.userName + ", remark=" + this.remark + ", guardPhone=" + this.guardPhone + ", maskedMobile=" + this.maskedMobile + ", avatar=" + this.avatar + ", status=" + this.status + ", travelId=" + this.travelId + ", lastTravelId=" + this.lastTravelId + ")";
    }

    public /* synthetic */ GuardRelation(long j2, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j2, str, str2, str3, str4, str5, i, str6, str7);
    }
}
