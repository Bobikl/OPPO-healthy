package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import com.heytap.wearable.emergency.api.emergency.EmergencyTransportApis;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003Jw\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0006HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012¨\u00063"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/GuardPushObject;", "", "title", "", "content", "notifyLevel", "", "userState", "pushUserStateStr", "pushUserState", EmergencyTransportApis.KEY_TRAVEL_ID, "timestamp", "", "guardId", "calledPolice", "extendContent", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;JJILjava/lang/String;)V", "getCalledPolice", "()I", "getContent", "()Ljava/lang/String;", "getExtendContent", "getGuardId", "()J", "getNotifyLevel", "setNotifyLevel", "(I)V", "getPushUserState", "setPushUserState", "getPushUserStateStr", "getTimestamp", "getTitle", "getTravelId", "getUserState", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GuardPushObject {
    private final int calledPolice;

    @NotNull
    private final String content;

    @NotNull
    private final String extendContent;
    private final long guardId;
    private int notifyLevel;
    private int pushUserState;

    @NotNull
    private final String pushUserStateStr;
    private final long timestamp;

    @NotNull
    private final String title;

    @NotNull
    private final String travelId;
    private final int userState;

    public GuardPushObject(@NotNull String title, @NotNull String content, int i, int i2, @NotNull String pushUserStateStr, int i3, @NotNull String travelId, long j2, long j3, int i4, @NotNull String extendContent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(pushUserStateStr, "pushUserStateStr");
        Intrinsics.checkNotNullParameter(travelId, "travelId");
        Intrinsics.checkNotNullParameter(extendContent, "extendContent");
        this.title = title;
        this.content = content;
        this.notifyLevel = i;
        this.userState = i2;
        this.pushUserStateStr = pushUserStateStr;
        this.pushUserState = i3;
        this.travelId = travelId;
        this.timestamp = j2;
        this.guardId = j3;
        this.calledPolice = i4;
        this.extendContent = extendContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getCalledPolice() {
        return this.calledPolice;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getExtendContent() {
        return this.extendContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNotifyLevel() {
        return this.notifyLevel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUserState() {
        return this.userState;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPushUserStateStr() {
        return this.pushUserStateStr;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPushUserState() {
        return this.pushUserState;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTravelId() {
        return this.travelId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getGuardId() {
        return this.guardId;
    }

    @NotNull
    public final GuardPushObject copy(@NotNull String title, @NotNull String content, int notifyLevel, int userState, @NotNull String pushUserStateStr, int pushUserState, @NotNull String travelId, long timestamp, long guardId, int calledPolice, @NotNull String extendContent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(pushUserStateStr, "pushUserStateStr");
        Intrinsics.checkNotNullParameter(travelId, "travelId");
        Intrinsics.checkNotNullParameter(extendContent, "extendContent");
        return new GuardPushObject(title, content, notifyLevel, userState, pushUserStateStr, pushUserState, travelId, timestamp, guardId, calledPolice, extendContent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuardPushObject)) {
            return false;
        }
        GuardPushObject guardPushObject = (GuardPushObject) other;
        return Intrinsics.areEqual(this.title, guardPushObject.title) && Intrinsics.areEqual(this.content, guardPushObject.content) && this.notifyLevel == guardPushObject.notifyLevel && this.userState == guardPushObject.userState && Intrinsics.areEqual(this.pushUserStateStr, guardPushObject.pushUserStateStr) && this.pushUserState == guardPushObject.pushUserState && Intrinsics.areEqual(this.travelId, guardPushObject.travelId) && this.timestamp == guardPushObject.timestamp && this.guardId == guardPushObject.guardId && this.calledPolice == guardPushObject.calledPolice && Intrinsics.areEqual(this.extendContent, guardPushObject.extendContent);
    }

    public final int getCalledPolice() {
        return this.calledPolice;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getExtendContent() {
        return this.extendContent;
    }

    public final long getGuardId() {
        return this.guardId;
    }

    public final int getNotifyLevel() {
        return this.notifyLevel;
    }

    public final int getPushUserState() {
        return this.pushUserState;
    }

    @NotNull
    public final String getPushUserStateStr() {
        return this.pushUserStateStr;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTravelId() {
        return this.travelId;
    }

    public final int getUserState() {
        return this.userState;
    }

    public int hashCode() {
        return (((((((((((((((((((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.notifyLevel)) * 31) + Integer.hashCode(this.userState)) * 31) + this.pushUserStateStr.hashCode()) * 31) + Integer.hashCode(this.pushUserState)) * 31) + this.travelId.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + Long.hashCode(this.guardId)) * 31) + Integer.hashCode(this.calledPolice)) * 31) + this.extendContent.hashCode();
    }

    public final void setNotifyLevel(int i) {
        this.notifyLevel = i;
    }

    public final void setPushUserState(int i) {
        this.pushUserState = i;
    }

    @NotNull
    public String toString() {
        return "GuardPushObject(title=" + this.title + ", content=" + this.content + ", notifyLevel=" + this.notifyLevel + ", userState=" + this.userState + ", pushUserStateStr=" + this.pushUserStateStr + ", pushUserState=" + this.pushUserState + ", travelId=" + this.travelId + ", timestamp=" + this.timestamp + ", guardId=" + this.guardId + ", calledPolice=" + this.calledPolice + ", extendContent=" + this.extendContent + ")";
    }

    public /* synthetic */ GuardPushObject(String str, String str2, int i, int i2, String str3, int i3, String str4, long j2, long j3, int i4, String str5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, i, i2, str3, i3, str4, j2, j3, i4, str5);
    }
}
