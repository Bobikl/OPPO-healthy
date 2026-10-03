package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/product_support/data/SaleAttrValue;", "", "()V", "color", "", "getColor", "()Ljava/lang/String;", "colorImageUrl", "getColorImageUrl", "content", "getContent", "serialVersionUID", "", "getSerialVersionUID", "()I", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SaleAttrValue {

    @Nullable
    private final String color;

    @Nullable
    private final String colorImageUrl;

    @Nullable
    private final String content;
    private final int serialVersionUID;

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final String getColorImageUrl() {
        return this.colorImageUrl;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final int getSerialVersionUID() {
        return this.serialVersionUID;
    }
}
