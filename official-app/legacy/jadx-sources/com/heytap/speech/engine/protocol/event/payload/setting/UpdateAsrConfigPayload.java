package com.heytap.speech.engine.protocol.event.payload.setting;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.heytap.speech.engine.protocol.event.payload.AsrInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/setting/UpdateAsrConfigPayload;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "Lcom/heytap/speech/engine/protocol/event/payload/AsrInfo;", "component1", "asr", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/speech/engine/protocol/event/payload/AsrInfo;", "getAsr", "()Lcom/heytap/speech/engine/protocol/event/payload/AsrInfo;", "setAsr", "(Lcom/heytap/speech/engine/protocol/event/payload/AsrInfo;)V", "<init>", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UpdateAsrConfigPayload extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private AsrInfo asr;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.setting.UpdateAsrConfigPayload$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/setting/UpdateAsrConfigPayload$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return UpdateAsrConfigPayload.VERSION;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateAsrConfigPayload() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UpdateAsrConfigPayload copy$default(UpdateAsrConfigPayload updateAsrConfigPayload, AsrInfo asrInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            asrInfo = updateAsrConfigPayload.asr;
        }
        return updateAsrConfigPayload.copy(asrInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AsrInfo getAsr() {
        return this.asr;
    }

    @NotNull
    public final UpdateAsrConfigPayload copy(@Nullable AsrInfo asr) {
        return new UpdateAsrConfigPayload(asr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdateAsrConfigPayload) && Intrinsics.areEqual(this.asr, ((UpdateAsrConfigPayload) other).asr);
    }

    @Nullable
    public final AsrInfo getAsr() {
        return this.asr;
    }

    public int hashCode() {
        AsrInfo asrInfo = this.asr;
        if (asrInfo == null) {
            return 0;
        }
        return asrInfo.hashCode();
    }

    public final void setAsr(@Nullable AsrInfo asrInfo) {
        this.asr = asrInfo;
    }

    @NotNull
    public String toString() {
        return "UpdateAsrConfigPayload(asr=" + this.asr + ')';
    }

    public /* synthetic */ UpdateAsrConfigPayload(AsrInfo asrInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : asrInfo);
    }

    public UpdateAsrConfigPayload(@Nullable AsrInfo asrInfo) {
        this.asr = asrInfo;
    }
}
