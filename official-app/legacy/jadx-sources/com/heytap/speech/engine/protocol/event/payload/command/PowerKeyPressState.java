package com.heytap.speech.engine.protocol.event.payload.command;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/command/PowerKeyPressState;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "state", "Ljava/lang/Integer;", "getState", "()Ljava/lang/Integer;", "setState", "(Ljava/lang/Integer;)V", "", SpeechConstant.KEY_RECORD_ID, "Ljava/lang/String;", "getRecordId", "()Ljava/lang/String;", "setRecordId", "(Ljava/lang/String;)V", "longPressVadMode", "getLongPressVadMode", "setLongPressVadMode", "Ljava/util/HashMap;", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class PowerKeyPressState extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private Integer longPressVadMode;

    @NotNull
    private String recordId = "";

    @Nullable
    private Integer state;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.command.PowerKeyPressState$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/command/PowerKeyPressState$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return PowerKeyPressState.VERSION;
        }
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final Integer getLongPressVadMode() {
        return this.longPressVadMode;
    }

    @NotNull
    public final String getRecordId() {
        return this.recordId;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setLongPressVadMode(@Nullable Integer num) {
        this.longPressVadMode = num;
    }

    public final void setRecordId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.recordId = str;
    }

    public final void setState(@Nullable Integer num) {
        this.state = num;
    }
}
