package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/heytap/store/business/component/entity/BannerDetail;", "", "()V", "isLookVideo", "", "()Z", "setLookVideo", "(Z)V", "link", "", "getLink", "()Ljava/lang/String;", "setLink", "(Ljava/lang/String;)V", "pic", "getPic", "setPic", "title", "getTitle", "setTitle", "video", "getVideo", "setVideo", "viewWidth", "", "getViewWidth", "()I", "setViewWidth", "(I)V", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BannerDetail {
    private boolean isLookVideo;

    @Nullable
    private String link;

    @Nullable
    private String pic;

    @Nullable
    private String title;

    @Nullable
    private String video;
    private int viewWidth = -1;

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getVideo() {
        return this.video;
    }

    public final int getViewWidth() {
        return this.viewWidth;
    }

    /* JADX INFO: renamed from: isLookVideo, reason: from getter */
    public final boolean getIsLookVideo() {
        return this.isLookVideo;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setLookVideo(boolean z) {
        this.isLookVideo = z;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setVideo(@Nullable String str) {
        this.video = str;
    }

    public final void setViewWidth(int i) {
        this.viewWidth = i;
    }
}
