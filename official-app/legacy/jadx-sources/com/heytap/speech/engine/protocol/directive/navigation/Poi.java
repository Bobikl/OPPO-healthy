package com.heytap.speech.engine.protocol.directive.navigation;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.platform.videoplayer.bean.VideoPlayerProductDetailDataBeanKt;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/navigation/Poi;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "detailPage", "", "getDetailPage", "()Ljava/lang/String;", "setDetailPage", "(Ljava/lang/String;)V", "distance", "getDistance", "setDistance", VideoPlayerProductDetailDataBeanKt.IMG, "getImg", "setImg", SensorsBean.PRICE, "getPrice", "setPrice", "score", "getScore", "setScore", "tag", "getTag", "setTag", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Poi extends DirectivePayload {

    @Nullable
    private String detailPage;

    @Nullable
    private String distance;

    @Nullable
    private String img;

    @Nullable
    private String price;

    @Nullable
    private String score;

    @Nullable
    private String tag;

    @Nullable
    private String title;

    @Nullable
    public final String getDetailPage() {
        return this.detailPage;
    }

    @Nullable
    public final String getDistance() {
        return this.distance;
    }

    @Nullable
    public final String getImg() {
        return this.img;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getScore() {
        return this.score;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setDetailPage(@Nullable String str) {
        this.detailPage = str;
    }

    public final void setDistance(@Nullable String str) {
        this.distance = str;
    }

    public final void setImg(@Nullable String str) {
        this.img = str;
    }

    public final void setPrice(@Nullable String str) {
        this.price = str;
    }

    public final void setScore(@Nullable String str) {
        this.score = str;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
