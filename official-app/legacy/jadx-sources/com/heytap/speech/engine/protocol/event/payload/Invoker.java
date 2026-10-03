package com.heytap.speech.engine.protocol.event.payload;

import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/Invoker;", "", SpeechConstant.KEY_START_SOURCE, "", "wakeupApp", "Lcom/heytap/speech/engine/protocol/event/payload/WakeupApp;", "(Ljava/lang/String;Lcom/heytap/speech/engine/protocol/event/payload/WakeupApp;)V", "getStartSource", "()Ljava/lang/String;", "setStartSource", "(Ljava/lang/String;)V", "getWakeupApp", "()Lcom/heytap/speech/engine/protocol/event/payload/WakeupApp;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Invoker {

    @NotNull
    private String startSource;

    @Nullable
    private final WakeupApp wakeupApp;

    /* JADX WARN: Multi-variable type inference failed */
    public Invoker() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Invoker copy$default(Invoker invoker, String str, WakeupApp wakeupApp, int i, Object obj) {
        if ((i & 1) != 0) {
            str = invoker.startSource;
        }
        if ((i & 2) != 0) {
            wakeupApp = invoker.wakeupApp;
        }
        return invoker.copy(str, wakeupApp);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStartSource() {
        return this.startSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WakeupApp getWakeupApp() {
        return this.wakeupApp;
    }

    @NotNull
    public final Invoker copy(@NotNull String startSource, @Nullable WakeupApp wakeupApp) {
        Intrinsics.checkNotNullParameter(startSource, "startSource");
        return new Invoker(startSource, wakeupApp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Invoker)) {
            return false;
        }
        Invoker invoker = (Invoker) other;
        return Intrinsics.areEqual(this.startSource, invoker.startSource) && Intrinsics.areEqual(this.wakeupApp, invoker.wakeupApp);
    }

    @NotNull
    public final String getStartSource() {
        return this.startSource;
    }

    @Nullable
    public final WakeupApp getWakeupApp() {
        return this.wakeupApp;
    }

    public int hashCode() {
        int iHashCode = this.startSource.hashCode() * 31;
        WakeupApp wakeupApp = this.wakeupApp;
        return iHashCode + (wakeupApp == null ? 0 : wakeupApp.hashCode());
    }

    public final void setStartSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.startSource = str;
    }

    @NotNull
    public String toString() {
        return "Invoker(startSource=" + this.startSource + ", wakeupApp=" + this.wakeupApp + ')';
    }

    public Invoker(@NotNull String startSource, @Nullable WakeupApp wakeupApp) {
        Intrinsics.checkNotNullParameter(startSource, "startSource");
        this.startSource = startSource;
        this.wakeupApp = wakeupApp;
    }

    public /* synthetic */ Invoker(String str, WakeupApp wakeupApp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : wakeupApp);
    }
}
