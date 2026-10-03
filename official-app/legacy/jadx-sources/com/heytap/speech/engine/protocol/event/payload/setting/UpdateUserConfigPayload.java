package com.heytap.speech.engine.protocol.event.payload.setting;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.heytap.speech.engine.protocol.event.payload.UserInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/setting/UpdateUserConfigPayload;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "Lcom/heytap/speech/engine/protocol/event/payload/UserInfo;", "component1", "user", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/speech/engine/protocol/event/payload/UserInfo;", "getUser", "()Lcom/heytap/speech/engine/protocol/event/payload/UserInfo;", "setUser", "(Lcom/heytap/speech/engine/protocol/event/payload/UserInfo;)V", "<init>", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UpdateUserConfigPayload extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private UserInfo user;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.setting.UpdateUserConfigPayload$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/setting/UpdateUserConfigPayload$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return UpdateUserConfigPayload.VERSION;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateUserConfigPayload() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UpdateUserConfigPayload copy$default(UpdateUserConfigPayload updateUserConfigPayload, UserInfo userInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            userInfo = updateUserConfigPayload.user;
        }
        return updateUserConfigPayload.copy(userInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserInfo getUser() {
        return this.user;
    }

    @NotNull
    public final UpdateUserConfigPayload copy(@Nullable UserInfo user) {
        return new UpdateUserConfigPayload(user);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdateUserConfigPayload) && Intrinsics.areEqual(this.user, ((UpdateUserConfigPayload) other).user);
    }

    @Nullable
    public final UserInfo getUser() {
        return this.user;
    }

    public int hashCode() {
        UserInfo userInfo = this.user;
        if (userInfo == null) {
            return 0;
        }
        return userInfo.hashCode();
    }

    public final void setUser(@Nullable UserInfo userInfo) {
        this.user = userInfo;
    }

    @NotNull
    public String toString() {
        return "UpdateUserConfigPayload(user=" + this.user + ')';
    }

    public /* synthetic */ UpdateUserConfigPayload(UserInfo userInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userInfo);
    }

    public UpdateUserConfigPayload(@Nullable UserInfo userInfo) {
        this.user = userInfo;
    }
}
