package com.heytap.store.business.component.data;

import com.client.platform.opensdk.pay.download.resource.LanUtils;
import com.heytap.store.business.component.widget.VideoCardView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/heytap/store/business/component/data/VideoState;", "", "()V", "id", "", "getId", "()I", "setId", "(I)V", "playState", "Lcom/heytap/store/business/component/data/VideoState$PlayState;", "getPlayState", "()Lcom/heytap/store/business/component/data/VideoState$PlayState;", "setPlayState", "(Lcom/heytap/store/business/component/data/VideoState$PlayState;)V", "playView", "Lcom/heytap/store/business/component/widget/VideoCardView;", "getPlayView", "()Lcom/heytap/store/business/component/widget/VideoCardView;", "setPlayView", "(Lcom/heytap/store/business/component/widget/VideoCardView;)V", "position", "getPosition", "setPosition", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "Companion", "PlayState", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VideoState {
    public static final int PLAY_STATUS_BEGIN = 3;
    public static final int PLAY_STATUS_END = 102;
    private int id;

    @Nullable
    private VideoCardView playView;
    private int position;

    @Nullable
    private String url = "";

    @NotNull
    private PlayState playState = PlayState.STOP;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/heytap/store/business/component/data/VideoState$PlayState;", "", "(Ljava/lang/String;I)V", "PLAYING", LanUtils.US.PAUSE, "STOP", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum PlayState {
        PLAYING,
        PAUSE,
        STOP
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final PlayState getPlayState() {
        return this.playState;
    }

    @Nullable
    public final VideoCardView getPlayView() {
        return this.playView;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setPlayState(@NotNull PlayState playState) {
        Intrinsics.checkNotNullParameter(playState, "<set-?>");
        this.playState = playState;
    }

    public final void setPlayView(@Nullable VideoCardView videoCardView) {
        this.playView = videoCardView;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
