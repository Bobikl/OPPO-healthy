package com.heytap.speech.engine.protocol.event.payload.command;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.heytap.speech.engine.protocol.event.payload.speechRecognizer.Wakeup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/command/EnterOneshotPayload;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "component1", "", "component2", "round", "wakeupWord", "copy", "toString", "hashCode", "", "other", "", "equals", "I", "getRound", "()I", "Ljava/lang/String;", "getWakeupWord", "()Ljava/lang/String;", "setWakeupWord", "(Ljava/lang/String;)V", "Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/Wakeup;", "wakeup", "Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/Wakeup;", "getWakeup", "()Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/Wakeup;", "setWakeup", "(Lcom/heytap/speech/engine/protocol/event/payload/speechRecognizer/Wakeup;)V", "<init>", "(ILjava/lang/String;)V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EnterOneshotPayload extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.1";
    private final int round;

    @Nullable
    private Wakeup wakeup;

    @NotNull
    private String wakeupWord;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.command.EnterOneshotPayload$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/command/EnterOneshotPayload$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return EnterOneshotPayload.VERSION;
        }
    }

    public EnterOneshotPayload(int i, @NotNull String wakeupWord) {
        Intrinsics.checkNotNullParameter(wakeupWord, "wakeupWord");
        this.round = i;
        this.wakeupWord = wakeupWord;
    }

    public static /* synthetic */ EnterOneshotPayload copy$default(EnterOneshotPayload enterOneshotPayload, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = enterOneshotPayload.round;
        }
        if ((i2 & 2) != 0) {
            str = enterOneshotPayload.wakeupWord;
        }
        return enterOneshotPayload.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRound() {
        return this.round;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWakeupWord() {
        return this.wakeupWord;
    }

    @NotNull
    public final EnterOneshotPayload copy(int round, @NotNull String wakeupWord) {
        Intrinsics.checkNotNullParameter(wakeupWord, "wakeupWord");
        return new EnterOneshotPayload(round, wakeupWord);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterOneshotPayload)) {
            return false;
        }
        EnterOneshotPayload enterOneshotPayload = (EnterOneshotPayload) other;
        return this.round == enterOneshotPayload.round && Intrinsics.areEqual(this.wakeupWord, enterOneshotPayload.wakeupWord);
    }

    public final int getRound() {
        return this.round;
    }

    @Nullable
    public final Wakeup getWakeup() {
        return this.wakeup;
    }

    @NotNull
    public final String getWakeupWord() {
        return this.wakeupWord;
    }

    public int hashCode() {
        return (Integer.hashCode(this.round) * 31) + this.wakeupWord.hashCode();
    }

    public final void setWakeup(@Nullable Wakeup wakeup) {
        this.wakeup = wakeup;
    }

    public final void setWakeupWord(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wakeupWord = str;
    }

    @NotNull
    public String toString() {
        return "EnterOneshotPayload(round=" + this.round + ", wakeupWord=" + this.wakeupWord + ')';
    }
}
