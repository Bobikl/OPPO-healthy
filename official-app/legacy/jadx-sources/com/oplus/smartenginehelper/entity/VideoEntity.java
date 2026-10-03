package com.oplus.smartenginehelper.entity;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0010¨\u0006\u0018"}, d2 = {"Lcom/oplus/smartenginehelper/entity/VideoEntity;", "Lcom/oplus/smartenginehelper/entity/ViewEntity;", "id", "", "(Ljava/lang/String;)V", "setInVisibleAutoPause", "", "value", "", "setRepeatMode", "repeatMode", "", "setResizeMode", VideoEntity.RESIZE_MODE, "setSpeed", "speed", "", "setSrc", "rawId", "src", "setVisibleAutoPlay", "setVolume", SpeechConstant.KEY_VOLUME, "Companion", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class VideoEntity extends ViewEntity {

    @NotNull
    public static final String INVISIBLE_AUTO_PAUSE = "invisible_auto_pause";

    @NotNull
    public static final String PLAY_SPEED = "playSpeed";

    @NotNull
    public static final String REPEAT_MODE = "repeatMode";
    public static final int REPEAT_OFF = 0;
    public static final int REPEAT_ONE = 1;
    public static final int RESIZE_FILL = 3;
    public static final int RESIZE_FIXED_HEIGHT = 2;
    public static final int RESIZE_FIXED_WIDTH = 1;

    @NotNull
    public static final String RESIZE_MODE = "resizeMode";
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_ZOOM = 4;

    @NotNull
    public static final String STATE_LISTENER = "stateListener";

    @NotNull
    public static final String VISIBLE_AUTO_PLAY = "visible_auto_play";

    @NotNull
    public static final String VOLUME_VALUE = "volumeValue";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoEntity(@NotNull String id) throws JSONException {
        super(id);
        Intrinsics.checkNotNullParameter(id, "id");
        getMJSONObject().put("type", "video");
    }

    public final void setInVisibleAutoPause(boolean value) throws JSONException {
        getMJSONObject().put(INVISIBLE_AUTO_PAUSE, value);
    }

    public final void setRepeatMode(int repeatMode) throws JSONException {
        getMJSONObject().put("repeatMode", repeatMode);
    }

    public final void setResizeMode(int resizeMode) throws JSONException {
        getMJSONObject().put(RESIZE_MODE, resizeMode);
    }

    public final void setSpeed(float speed) throws JSONException {
        getMJSONObject().put(PLAY_SPEED, Float.valueOf(speed));
    }

    public final void setSrc(int rawId) throws JSONException {
        getMJSONObject().put("src", rawId);
    }

    public final void setVisibleAutoPlay(boolean value) throws JSONException {
        getMJSONObject().put(VISIBLE_AUTO_PLAY, value);
    }

    public final void setVolume(float volume) throws JSONException {
        getMJSONObject().put(VOLUME_VALUE, Float.valueOf(volume));
    }

    public final void setSrc(@NotNull String src) throws JSONException {
        Intrinsics.checkNotNullParameter(src, "src");
        getMJSONObject().put("src", src);
    }
}
