package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/product_support/data/InformationVideoBean;", "", "()V", "blur_cover", "", "getBlur_cover", "()Ljava/lang/String;", "setBlur_cover", "(Ljava/lang/String;)V", "cover", "getCover", "setCover", "duration", "", "getDuration", "()J", "setDuration", "(J)V", Fields.HEIGHT_FIELD, "", "getHeight", "()I", "setHeight", "(I)V", "url", "getUrl", "setUrl", Fields.WIDTH_FIELD, "getWidth", "setWidth", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class InformationVideoBean {
    private long duration;
    private int height;
    private int width;

    @NotNull
    private String blur_cover = "";

    @NotNull
    private String cover = "";

    @NotNull
    private String url = "";

    @NotNull
    public final String getBlur_cover() {
        return this.blur_cover;
    }

    @NotNull
    public final String getCover() {
        return this.cover;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setBlur_cover(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.blur_cover = str;
    }

    public final void setCover(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cover = str;
    }

    public final void setDuration(long j2) {
        this.duration = j2;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
