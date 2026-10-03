package com.heytap.nearx.tangramconfig.strategy;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.oplus.aiunit.vision.ap6;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006&"}, d2 = {"Lcom/heytap/nearx/tangramconfig/strategy/StrategyEntity;", "", "()V", Fields.BACKOFF_FIELD, "", "getBackoff", "()J", "setBackoff", "(J)V", Fields.FORCE_KIT_IF_KIT_FIELD, "", "getForceKitIfKit", "()Z", "setForceKitIfKit", "(Z)V", Fields.MAX_REQ_PRODUCT_FIELD, "getMaxReqProduct", "setMaxReqProduct", Fields.MIN_KIT_VERSION_FIELD, "getMinKitVersion", "setMinKitVersion", Fields.MIN_SDK_VERSION_FIELD, "getMinSDKVersion", "setMinSDKVersion", Fields.SYNC_SDK_CFG_INTERVAL_FIELD, "getSdkInterval", "setSdkInterval", Fields.STRATEGY_MODE_FIELD, "", "getStrategyMode", "()I", "setStrategyMode", "(I)V", Fields.VALID_REQ_PERIOD_FIELD, "getValidReqPeriod", "setValidReqPeriod", "toString", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StrategyEntity {
    private boolean forceKitIfKit;
    private long minSDKVersion;
    private long sdkInterval = ap6.CDP_MIN_MANUAL_SYNC_TIME_INTERVAL;
    private int strategyMode = 1;
    private long minKitVersion = 2011900;
    private long validReqPeriod = 7200000;
    private long maxReqProduct = 100;
    private long backoff = 120;

    public final long getBackoff() {
        return this.backoff;
    }

    public final boolean getForceKitIfKit() {
        return this.forceKitIfKit;
    }

    public final long getMaxReqProduct() {
        return this.maxReqProduct;
    }

    public final long getMinKitVersion() {
        return this.minKitVersion;
    }

    public final long getMinSDKVersion() {
        return this.minSDKVersion;
    }

    public final long getSdkInterval() {
        return this.sdkInterval;
    }

    public final int getStrategyMode() {
        return this.strategyMode;
    }

    public final long getValidReqPeriod() {
        return this.validReqPeriod;
    }

    public final void setBackoff(long j2) {
        this.backoff = j2;
    }

    public final void setForceKitIfKit(boolean z) {
        this.forceKitIfKit = z;
    }

    public final void setMaxReqProduct(long j2) {
        this.maxReqProduct = j2;
    }

    public final void setMinKitVersion(long j2) {
        this.minKitVersion = j2;
    }

    public final void setMinSDKVersion(long j2) {
        this.minSDKVersion = j2;
    }

    public final void setSdkInterval(long j2) {
        this.sdkInterval = j2;
    }

    public final void setStrategyMode(int i) {
        this.strategyMode = i;
    }

    public final void setValidReqPeriod(long j2) {
        this.validReqPeriod = j2;
    }

    @NotNull
    public String toString() {
        return "StrategyEntity(sdkInterval=" + this.sdkInterval + ", strategyMode=" + this.strategyMode + ", minSDKVersion=" + this.minSDKVersion + ", minKitVersion=" + this.minKitVersion + ",validReqPeriod=" + this.validReqPeriod + ", maxReqProduct=" + this.maxReqProduct + ", forceKitIfKit=" + this.forceKitIfKit + ", backoff=" + this.backoff + ')';
    }
}
