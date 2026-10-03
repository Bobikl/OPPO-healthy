package com.heytap.nearx.tangramconfig.kit.bean;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u000bH\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/heytap/nearx/tangramconfig/kit/bean/ConfigIpcResponse;", "", "()V", Fields.CONFIG_DATAS, "", "Lcom/heytap/nearx/tangramconfig/kit/bean/IpcConfigData;", "getConfigDatas", "()Ljava/util/List;", "setConfigDatas", "(Ljava/util/List;)V", Fields.PRODUCT_ID, "", "getProductId", "()Ljava/lang/String;", "setProductId", "(Ljava/lang/String;)V", Fields.PRODUCT_MAX_VERSION, "", "getProductMaxVersion", "()Ljava/lang/Long;", "setProductMaxVersion", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "spkey", "getSpkey", "setSpkey", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConfigIpcResponse {

    @Nullable
    private List<IpcConfigData> configDatas;

    @Nullable
    private String productId;

    @Nullable
    private Long productMaxVersion;

    @Nullable
    private String spkey;

    @Nullable
    public final List<IpcConfigData> getConfigDatas() {
        return this.configDatas;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final Long getProductMaxVersion() {
        return this.productMaxVersion;
    }

    @Nullable
    public final String getSpkey() {
        return this.spkey;
    }

    public final void setConfigDatas(@Nullable List<IpcConfigData> list) {
        this.configDatas = list;
    }

    public final void setProductId(@Nullable String str) {
        this.productId = str;
    }

    public final void setProductMaxVersion(@Nullable Long l2) {
        this.productMaxVersion = l2;
    }

    public final void setSpkey(@Nullable String str) {
        this.spkey = str;
    }

    @NotNull
    public String toString() {
        return "ConfigIpcResponse{productId='" + this.productId + "', productMaxVersion=" + this.productMaxVersion + ", spkey='" + this.spkey + "', configDatas=" + this.configDatas + '}';
    }
}
