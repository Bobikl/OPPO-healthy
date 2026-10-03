package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/heytap/store/product_support/data/BannerInfoVO;", "", "()V", "adId", "", "getAdId", "()Ljava/lang/Integer;", "setAdId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "adName", "", "getAdName", "()Ljava/lang/String;", "setAdName", "(Ljava/lang/String;)V", "link", "getLink", "setLink", "pic", "getPic", "setPic", "picJson", "getPicJson", "setPicJson", "title", "getTitle", "setTitle", "video", "getVideo", "setVideo", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BannerInfoVO {

    @Nullable
    private Integer adId;

    @Nullable
    private String adName;

    @Nullable
    private String link;

    @Nullable
    private String pic;

    @Nullable
    private String picJson;

    @Nullable
    private String title;

    @Nullable
    private String video;

    @Nullable
    public final Integer getAdId() {
        return this.adId;
    }

    @Nullable
    public final String getAdName() {
        return this.adName;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    public final String getPicJson() {
        return this.picJson;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getVideo() {
        return this.video;
    }

    public final void setAdId(@Nullable Integer num) {
        this.adId = num;
    }

    public final void setAdName(@Nullable String str) {
        this.adName = str;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setPicJson(@Nullable String str) {
        this.picJson = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setVideo(@Nullable String str) {
        this.video = str;
    }
}
