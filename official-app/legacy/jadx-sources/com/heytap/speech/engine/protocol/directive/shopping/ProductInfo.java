package com.heytap.speech.engine.protocol.directive.shopping;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.platform.videoplayer.bean.VideoPlayerProductDetailDataBeanKt;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shopping/ProductInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", DeepLinkInterpreter.KEY_DEEP_LINK, "", "getDeepLink", "()Ljava/lang/String;", "setDeepLink", "(Ljava/lang/String;)V", "discountPrice", "getDiscountPrice", "setDiscountPrice", "h5Url", "getH5Url", "setH5Url", VideoPlayerProductDetailDataBeanKt.IMG, "getImg", "setImg", "itemId", "getItemId", "setItemId", "name", "getName", "setName", SensorsBean.PRICE, "getPrice", "setPrice", "soldCount", "getSoldCount", "setSoldCount", "soldPercent", "getSoldPercent", "setSoldPercent", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ProductInfo extends DirectivePayload {

    @Nullable
    private String deepLink;

    @Nullable
    private String discountPrice;

    @Nullable
    private String h5Url;

    @Nullable
    private String img;

    @Nullable
    private String itemId;

    @Nullable
    private String name;

    @Nullable
    private String price;

    @Nullable
    private String soldCount;

    @Nullable
    private String soldPercent;

    @Nullable
    public final String getDeepLink() {
        return this.deepLink;
    }

    @Nullable
    public final String getDiscountPrice() {
        return this.discountPrice;
    }

    @Nullable
    public final String getH5Url() {
        return this.h5Url;
    }

    @Nullable
    public final String getImg() {
        return this.img;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSoldCount() {
        return this.soldCount;
    }

    @Nullable
    public final String getSoldPercent() {
        return this.soldPercent;
    }

    public final void setDeepLink(@Nullable String str) {
        this.deepLink = str;
    }

    public final void setDiscountPrice(@Nullable String str) {
        this.discountPrice = str;
    }

    public final void setH5Url(@Nullable String str) {
        this.h5Url = str;
    }

    public final void setImg(@Nullable String str) {
        this.img = str;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPrice(@Nullable String str) {
        this.price = str;
    }

    public final void setSoldCount(@Nullable String str) {
        this.soldCount = str;
    }

    public final void setSoldPercent(@Nullable String str) {
        this.soldPercent = str;
    }
}
