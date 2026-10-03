package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/product_support/data/Video;", "", "()V", "blurCover", "", "getBlurCover", "()Ljava/lang/String;", "cover", "getCover", "duration", "", "getDuration", "()I", Fields.HEIGHT_FIELD, "getHeight", "serialVersionUID", "getSerialVersionUID", "url", "getUrl", Fields.WIDTH_FIELD, "getWidth", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Video {

    @Nullable
    private final String blurCover;

    @Nullable
    private final String cover;
    private final int duration;
    private final int height;
    private final int serialVersionUID;

    @Nullable
    private final String url;
    private final int width;

    @Nullable
    public final String getBlurCover() {
        return this.blurCover;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getSerialVersionUID() {
        return this.serialVersionUID;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }
}
