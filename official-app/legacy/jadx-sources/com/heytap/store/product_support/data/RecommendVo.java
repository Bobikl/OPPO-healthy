package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\nR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\nR\u0013\u0010 \u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\n¨\u0006\""}, d2 = {"Lcom/heytap/store/product_support/data/RecommendVo;", "", "()V", "configKey", "", "getConfigKey", "()I", "contentTransparent", "", "getContentTransparent", "()Ljava/lang/String;", "expId", "getExpId", "logId", "getLogId", "productDetailss", "", "Lcom/heytap/store/product_support/data/ProductDetails;", "getProductDetailss", "()Ljava/util/List;", NotificationCompat.CATEGORY_RECOMMENDATION, "", "getRecommendation", "()Z", "sceneId", "getSceneId", "searchId", "getSearchId", "sectionId", "getSectionId", "strategyId", "getStrategyId", "transparent", "getTransparent", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RecommendVo {
    private final int configKey;

    @Nullable
    private final String contentTransparent;

    @Nullable
    private final String expId;

    @Nullable
    private final String logId;

    @Nullable
    private final List<ProductDetails> productDetailss;
    private final boolean recommendation;

    @Nullable
    private final String sceneId;

    @Nullable
    private final String searchId;

    @Nullable
    private final String sectionId;

    @Nullable
    private final String strategyId;

    @Nullable
    private final String transparent;

    public final int getConfigKey() {
        return this.configKey;
    }

    @Nullable
    public final String getContentTransparent() {
        return this.contentTransparent;
    }

    @Nullable
    public final String getExpId() {
        return this.expId;
    }

    @Nullable
    public final String getLogId() {
        return this.logId;
    }

    @Nullable
    public final List<ProductDetails> getProductDetailss() {
        return this.productDetailss;
    }

    public final boolean getRecommendation() {
        return this.recommendation;
    }

    @Nullable
    public final String getSceneId() {
        return this.sceneId;
    }

    @Nullable
    public final String getSearchId() {
        return this.searchId;
    }

    @Nullable
    public final String getSectionId() {
        return this.sectionId;
    }

    @Nullable
    public final String getStrategyId() {
        return this.strategyId;
    }

    @Nullable
    public final String getTransparent() {
        return this.transparent;
    }
}
