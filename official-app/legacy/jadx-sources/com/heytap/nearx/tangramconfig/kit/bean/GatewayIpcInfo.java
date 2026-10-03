package com.heytap.nearx.tangramconfig.kit.bean;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R6\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/heytap/nearx/tangramconfig/kit/bean/GatewayIpcInfo;", "", "()V", "extraParmaMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getExtraParmaMap", "()Ljava/util/HashMap;", "setExtraParmaMap", "(Ljava/util/HashMap;)V", Fields.PRODUCT_ID, "getProductId", "()Ljava/lang/String;", "setProductId", "(Ljava/lang/String;)V", Fields.PRODUCT_MAX_VERSION, "", "getProductMaxVersion", "()I", "setProductMaxVersion", "(I)V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GatewayIpcInfo {

    @NotNull
    private HashMap<String, String> extraParmaMap = new HashMap<>();

    @Nullable
    private String productId;
    private int productMaxVersion;

    @NotNull
    public final HashMap<String, String> getExtraParmaMap() {
        return this.extraParmaMap;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    public final int getProductMaxVersion() {
        return this.productMaxVersion;
    }

    public final void setExtraParmaMap(@NotNull HashMap<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.extraParmaMap = map;
    }

    public final void setProductId(@Nullable String str) {
        this.productId = str;
    }

    public final void setProductMaxVersion(int i) {
        this.productMaxVersion = i;
    }
}
