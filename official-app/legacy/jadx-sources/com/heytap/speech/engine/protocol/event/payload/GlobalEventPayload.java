package com.heytap.speech.engine.protocol.event.payload;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/GlobalEventPayload;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "toString", "Lcom/heytap/speech/engine/protocol/event/payload/DeviceInfo;", "device", "Lcom/heytap/speech/engine/protocol/event/payload/DeviceInfo;", "getDevice", "()Lcom/heytap/speech/engine/protocol/event/payload/DeviceInfo;", "Lcom/heytap/speech/engine/protocol/event/payload/UserInfo;", "user", "Lcom/heytap/speech/engine/protocol/event/payload/UserInfo;", "getUser", "()Lcom/heytap/speech/engine/protocol/event/payload/UserInfo;", "Lcom/heytap/speech/engine/protocol/event/payload/ApplicationInfo;", "application", "Lcom/heytap/speech/engine/protocol/event/payload/ApplicationInfo;", "getApplication", "()Lcom/heytap/speech/engine/protocol/event/payload/ApplicationInfo;", "<init>", "(Lcom/heytap/speech/engine/protocol/event/payload/DeviceInfo;Lcom/heytap/speech/engine/protocol/event/payload/UserInfo;Lcom/heytap/speech/engine/protocol/event/payload/ApplicationInfo;)V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class GlobalEventPayload extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.3";

    @NotNull
    private final ApplicationInfo application;

    @NotNull
    private final DeviceInfo device;

    @Nullable
    private final UserInfo user;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.GlobalEventPayload$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/GlobalEventPayload$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return GlobalEventPayload.VERSION;
        }
    }

    public GlobalEventPayload(@NotNull DeviceInfo device, @Nullable UserInfo userInfo, @NotNull ApplicationInfo application) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(application, "application");
        this.device = device;
        this.user = userInfo;
        this.application = application;
    }

    @NotNull
    public final ApplicationInfo getApplication() {
        return this.application;
    }

    @NotNull
    public final DeviceInfo getDevice() {
        return this.device;
    }

    @Nullable
    public final UserInfo getUser() {
        return this.user;
    }

    @NotNull
    public String toString() {
        return "GlobalEventPayload(device=" + this.device + ", user=" + this.user + ')';
    }
}
