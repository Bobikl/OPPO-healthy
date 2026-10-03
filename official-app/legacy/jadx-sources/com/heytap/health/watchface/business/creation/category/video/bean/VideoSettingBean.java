package com.heytap.health.watchface.business.creation.category.video.bean;

import com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListBean;
import com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListItem;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/video/bean/VideoSettingBean;", "Lcom/heytap/health/watchface/business/creation/base/custom/WatchFaceCustomStyleListBean;", "Lcom/heytap/health/watchface/business/creation/base/custom/WatchFaceCustomStyleListItem;", "", "videoPath", "Ljava/lang/String;", "getVideoPath", "()Ljava/lang/String;", "setVideoPath", "(Ljava/lang/String;)V", "", "playType", "I", "getPlayType", "()I", "setPlayType", "(I)V", "<init>", "()V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class VideoSettingBean extends WatchFaceCustomStyleListBean<WatchFaceCustomStyleListItem> {
    public static final int REPEAT_TYPE_CYCLE = 1;
    public static final int REPEAT_TYPE_ONCE = 0;
    private int playType;

    @Nullable
    private String videoPath;

    public final int getPlayType() {
        return this.playType;
    }

    @Nullable
    public final String getVideoPath() {
        return this.videoPath;
    }

    public final void setPlayType(int i) {
        this.playType = i;
    }

    public final void setVideoPath(@Nullable String str) {
        this.videoPath = str;
    }
}
