package com.heytap.speech.engine.protocol.directive.multimedia;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/multimedia/Episode;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "episode", "Ljava/lang/Integer;", "getEpisode", "()Ljava/lang/Integer;", "setEpisode", "(Ljava/lang/Integer;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class Episode extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Integer episode;

    @Nullable
    public final Integer getEpisode() {
        return this.episode;
    }

    public final void setEpisode(@Nullable Integer num) {
        this.episode = num;
    }
}
