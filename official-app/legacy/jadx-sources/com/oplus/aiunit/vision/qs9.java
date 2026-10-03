package com.oplus.aiunit.vision;

import android.view.Surface;
import com.oplus.channel.client.data.Action;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0004\u001f !\"J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0002H&J\b\u0010\f\u001a\u00020\u0002H&J\b\u0010\r\u001a\u00020\u0002H&J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH&J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH&¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/qs9;", "", "", "initMediaPlayer", "Landroid/view/Surface;", "surface", "setSurface", "", "dataPath", "setDataSource", "prepareAsync", "start", Action.LIFE_CIRCLE_VALUE_STOP, "release", "", "isMute", "setMute", "looping", "setLooping", "Lcom/oplus/aiunit/vision/qs9$a;", "completionListener", "setOnCompletionListener", "Lcom/oplus/aiunit/vision/qs9$d;", "preparedListener", "setOnPreparedListener", "Lcom/oplus/aiunit/vision/qs9$b;", "errorListener", "setOnErrorListener", "Lcom/oplus/aiunit/vision/qs9$c;", "firstFrameListener", "setOnFirstFrameListener", "a", "b", "c", "d", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
public interface qs9 {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/qs9$a;", "", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
    public interface a {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/qs9$b;", "", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
    public interface b {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/qs9$c;", "", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
    public interface c {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/qs9$d;", "", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
    public interface d {
    }

    void initMediaPlayer() throws Exception;

    void prepareAsync();

    void release();

    void setDataSource(@NotNull String dataPath) throws IOException;

    void setLooping(boolean looping);

    void setMute(boolean isMute);

    void setOnCompletionListener(@NotNull a completionListener);

    void setOnErrorListener(@NotNull b errorListener);

    void setOnFirstFrameListener(@NotNull c firstFrameListener);

    void setOnPreparedListener(@NotNull d preparedListener);

    void setSurface(@NotNull Surface surface);

    void start();

    void stop();
}
