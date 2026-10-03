package com.heytap.store.platform.videoplayer.wrapper;

import android.os.Bundle;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/heytap/store/platform/videoplayer/wrapper/VideoPlayerStatusListener;", "", "()V", "onPlayEventComing", "", "code", "", "bundle", "Landroid/os/Bundle;", "baseplayer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class VideoPlayerStatusListener {
    public abstract void onPlayEventComing(int code, @Nullable Bundle bundle);
}
