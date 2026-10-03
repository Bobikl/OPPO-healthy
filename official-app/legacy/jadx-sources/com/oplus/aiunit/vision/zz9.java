package com.oplus.aiunit.vision;

import android.media.MediaPlayer;
import android.net.Uri;
import android.view.ViewGroup;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\n\u0010\n\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&J\"\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H&J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/zz9;", "", "", "start", "pause", "release", "Landroid/net/Uri;", ParserTag.TAG_URI, "setUri", "Landroid/media/MediaPlayer;", "getMedalPlayer", "Lcom/oplus/aiunit/vision/yz9;", "listener", "setVideoListener", "", "title", "Lkotlin/Function0;", "onNavigationBack", "b", "Landroid/view/ViewGroup;", "parent", "a", "", "progress", "setDownloadProgress", "operations_release"}, k = 1, mv = {1, 8, 0})
public interface zz9 {
    void a(@NotNull ViewGroup parent);

    void b(@Nullable String title, @NotNull Function0<Unit> onNavigationBack);

    @Nullable
    MediaPlayer getMedalPlayer();

    void pause();

    void release();

    void setDownloadProgress(int progress);

    void setUri(@NotNull Uri uri);

    void setVideoListener(@NotNull yz9 listener);

    void start();
}
