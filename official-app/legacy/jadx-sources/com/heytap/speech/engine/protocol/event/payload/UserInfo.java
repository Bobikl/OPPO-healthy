package com.heytap.speech.engine.protocol.event.payload;

import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/UserInfo;", "", "userId", "", "userMode", "token", SpeechConstant.KEY_ACCOUNT_DEVICE_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHeytapAccountDeviceId", "()Ljava/lang/String;", AcCommonApiMethod.GET_TOKEN, "getUserId", "getUserMode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class UserInfo {

    @NotNull
    private final String heytapAccountDeviceId;

    @NotNull
    private final String token;

    @NotNull
    private final String userId;

    @NotNull
    private final String userMode;

    public UserInfo(@NotNull String userId, @NotNull String userMode, @NotNull String token, @NotNull String heytapAccountDeviceId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userMode, "userMode");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(heytapAccountDeviceId, "heytapAccountDeviceId");
        this.userId = userId;
        this.userMode = userMode;
        this.token = token;
        this.heytapAccountDeviceId = heytapAccountDeviceId;
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userInfo.userId;
        }
        if ((i & 2) != 0) {
            str2 = userInfo.userMode;
        }
        if ((i & 4) != 0) {
            str3 = userInfo.token;
        }
        if ((i & 8) != 0) {
            str4 = userInfo.heytapAccountDeviceId;
        }
        return userInfo.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserMode() {
        return this.userMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeytapAccountDeviceId() {
        return this.heytapAccountDeviceId;
    }

    @NotNull
    public final UserInfo copy(@NotNull String userId, @NotNull String userMode, @NotNull String token, @NotNull String heytapAccountDeviceId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userMode, "userMode");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(heytapAccountDeviceId, "heytapAccountDeviceId");
        return new UserInfo(userId, userMode, token, heytapAccountDeviceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return Intrinsics.areEqual(this.userId, userInfo.userId) && Intrinsics.areEqual(this.userMode, userInfo.userMode) && Intrinsics.areEqual(this.token, userInfo.token) && Intrinsics.areEqual(this.heytapAccountDeviceId, userInfo.heytapAccountDeviceId);
    }

    @NotNull
    public final String getHeytapAccountDeviceId() {
        return this.heytapAccountDeviceId;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUserMode() {
        return this.userMode;
    }

    public int hashCode() {
        return (((((this.userId.hashCode() * 31) + this.userMode.hashCode()) * 31) + this.token.hashCode()) * 31) + this.heytapAccountDeviceId.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserInfo(userId='" + this.userId + "', userMode='" + this.userMode + "', token='" + this.token + "', heytapAccountDeviceId='" + this.heytapAccountDeviceId + "')";
    }
}
