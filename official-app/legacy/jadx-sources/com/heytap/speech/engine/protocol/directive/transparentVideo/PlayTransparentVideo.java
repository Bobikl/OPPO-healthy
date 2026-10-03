package com.heytap.speech.engine.protocol.directive.transparentVideo;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR6\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/transparentVideo/PlayTransparentVideo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/transparentVideo/VideoInfo;", "loadingVideo", "Lcom/heytap/speech/engine/protocol/directive/transparentVideo/VideoInfo;", "getLoadingVideo", "()Lcom/heytap/speech/engine/protocol/directive/transparentVideo/VideoInfo;", "setLoadingVideo", "(Lcom/heytap/speech/engine/protocol/directive/transparentVideo/VideoInfo;)V", "playingVideo", "getPlayingVideo", "setPlayingVideo", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "Lkotlin/collections/ArrayList;", "actionInfos", "Ljava/util/ArrayList;", "getActionInfos", "()Ljava/util/ArrayList;", "setActionInfos", "(Ljava/util/ArrayList;)V", "Lcom/heytap/speech/engine/protocol/directive/transparentVideo/Speak;", "speak", "Lcom/heytap/speech/engine/protocol/directive/transparentVideo/Speak;", "getSpeak", "()Lcom/heytap/speech/engine/protocol/directive/transparentVideo/Speak;", "setSpeak", "(Lcom/heytap/speech/engine/protocol/directive/transparentVideo/Speak;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class PlayTransparentVideo extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<ActionInfo> actionInfos;

    @Nullable
    private VideoInfo loadingVideo;

    @Nullable
    private VideoInfo playingVideo;

    @Nullable
    private Speak speak;

    @Nullable
    public final ArrayList<ActionInfo> getActionInfos() {
        return this.actionInfos;
    }

    @Nullable
    public final VideoInfo getLoadingVideo() {
        return this.loadingVideo;
    }

    @Nullable
    public final VideoInfo getPlayingVideo() {
        return this.playingVideo;
    }

    @Nullable
    public final Speak getSpeak() {
        return this.speak;
    }

    public final void setActionInfos(@Nullable ArrayList<ActionInfo> arrayList) {
        this.actionInfos = arrayList;
    }

    public final void setLoadingVideo(@Nullable VideoInfo videoInfo) {
        this.loadingVideo = videoInfo;
    }

    public final void setPlayingVideo(@Nullable VideoInfo videoInfo) {
        this.playingVideo = videoInfo;
    }

    public final void setSpeak(@Nullable Speak speak) {
        this.speak = speak;
    }
}
