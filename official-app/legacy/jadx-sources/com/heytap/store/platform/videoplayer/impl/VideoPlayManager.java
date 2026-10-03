package com.heytap.store.platform.videoplayer.impl;

import com.heytap.store.platform.videoplayer.base.ILivePlayerController;
import com.heytap.store.platform.videoplayer.bean.VideoControlBean;
import com.heytap.store.platform.videoplayer.wrapper.VideoPlayerView;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013J\u0016\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\rJ\u0006\u0010\u001c\u001a\u00020\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\fJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u0017R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\""}, d2 = {"Lcom/heytap/store/platform/videoplayer/impl/VideoPlayManager;", "", "()V", "livePlayerRef", "Ljava/lang/ref/WeakReference;", "Lcom/heytap/store/platform/videoplayer/base/ILivePlayerController;", "getLivePlayerRef", "()Ljava/lang/ref/WeakReference;", "setLivePlayerRef", "(Ljava/lang/ref/WeakReference;)V", "videoPlayers", "", "", "Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerView;", "getVideoPlayers", "()Ljava/util/Map;", "setVideoPlayers", "(Ljava/util/Map;)V", "videoStatus", "Lcom/heytap/store/platform/videoplayer/bean/VideoControlBean;", "getVideoStatus", "setVideoStatus", "addStatus", "", "key", "bean", "addVideoPlay", "txVodPlayer", "clear", "getStatus", "getVideoPlay", "registerLivePlayer", "controller", "unRegisterLivePlayer", "androidplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VideoPlayManager {

    @Nullable
    private static WeakReference<ILivePlayerController> livePlayerRef;

    @NotNull
    public static final VideoPlayManager INSTANCE = new VideoPlayManager();

    @NotNull
    private static Map<String, VideoPlayerView> videoPlayers = new LinkedHashMap();

    @NotNull
    private static Map<String, VideoControlBean> videoStatus = new LinkedHashMap();

    private VideoPlayManager() {
    }

    public final void addStatus(@Nullable String key, @Nullable VideoControlBean bean) {
        if (key == null || bean == null) {
            return;
        }
        videoStatus.put(key, bean);
    }

    public final void addVideoPlay(@NotNull String key, @NotNull VideoPlayerView txVodPlayer) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(txVodPlayer, "txVodPlayer");
        if (videoPlayers.containsKey(key)) {
            return;
        }
        videoPlayers.put(key, txVodPlayer);
    }

    public final void clear() {
        videoPlayers.clear();
    }

    @Nullable
    public final WeakReference<ILivePlayerController> getLivePlayerRef() {
        return livePlayerRef;
    }

    @Nullable
    public final VideoControlBean getStatus(@Nullable String key) {
        if (key == null) {
            return null;
        }
        return videoStatus.get(key);
    }

    @Nullable
    public final VideoPlayerView getVideoPlay(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (videoPlayers.containsKey(key)) {
            return videoPlayers.get(key);
        }
        return null;
    }

    @NotNull
    public final Map<String, VideoPlayerView> getVideoPlayers() {
        return videoPlayers;
    }

    @NotNull
    public final Map<String, VideoControlBean> getVideoStatus() {
        return videoStatus;
    }

    public final void registerLivePlayer(@NotNull ILivePlayerController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        livePlayerRef = new WeakReference<>(controller);
    }

    public final void setLivePlayerRef(@Nullable WeakReference<ILivePlayerController> weakReference) {
        livePlayerRef = weakReference;
    }

    public final void setVideoPlayers(@NotNull Map<String, VideoPlayerView> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        videoPlayers = map;
    }

    public final void setVideoStatus(@NotNull Map<String, VideoControlBean> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        videoStatus = map;
    }

    public final void unRegisterLivePlayer() {
        WeakReference<ILivePlayerController> weakReference = livePlayerRef;
        if (weakReference == null) {
            return;
        }
        weakReference.clear();
    }
}
