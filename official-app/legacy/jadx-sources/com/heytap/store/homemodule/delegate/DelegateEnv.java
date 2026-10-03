package com.heytap.store.homemodule.delegate;

import com.heytap.store.platform.tools.SimpleNetworkInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003Jo\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0011\"\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019¨\u0006."}, d2 = {"Lcom/heytap/store/homemodule/delegate/DelegateEnv;", "", "isDarkMode", "", "isFullScreen", "needTopBarBg", "isTabVisible", "disableTopBg", "isCarousel", "tabName", "", "omsId", "simpleNetworkInfo", "Lcom/heytap/store/platform/tools/SimpleNetworkInfo;", "sceneReveal", "(ZZZZZZLjava/lang/String;Ljava/lang/String;Lcom/heytap/store/platform/tools/SimpleNetworkInfo;Ljava/lang/String;)V", "getDisableTopBg", "()Z", "setCarousel", "(Z)V", "setDarkMode", "setFullScreen", "getNeedTopBarBg", "setNeedTopBarBg", "getOmsId", "()Ljava/lang/String;", "getSceneReveal", "getSimpleNetworkInfo", "()Lcom/heytap/store/platform/tools/SimpleNetworkInfo;", "getTabName", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class DelegateEnv {
    private final boolean disableTopBg;
    private boolean isCarousel;
    private boolean isDarkMode;
    private boolean isFullScreen;
    private final boolean isTabVisible;
    private boolean needTopBarBg;

    @NotNull
    private final String omsId;

    @NotNull
    private final String sceneReveal;

    @Nullable
    private final SimpleNetworkInfo simpleNetworkInfo;

    @NotNull
    private final String tabName;

    public DelegateEnv(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull String tabName, @NotNull String omsId, @Nullable SimpleNetworkInfo simpleNetworkInfo, @NotNull String sceneReveal) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        Intrinsics.checkNotNullParameter(omsId, "omsId");
        Intrinsics.checkNotNullParameter(sceneReveal, "sceneReveal");
        this.isDarkMode = z;
        this.isFullScreen = z2;
        this.needTopBarBg = z3;
        this.isTabVisible = z4;
        this.disableTopBg = z5;
        this.isCarousel = z6;
        this.tabName = tabName;
        this.omsId = omsId;
        this.simpleNetworkInfo = simpleNetworkInfo;
        this.sceneReveal = sceneReveal;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsDarkMode() {
        return this.isDarkMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSceneReveal() {
        return this.sceneReveal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsFullScreen() {
        return this.isFullScreen;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getNeedTopBarBg() {
        return this.needTopBarBg;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsTabVisible() {
        return this.isTabVisible;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDisableTopBg() {
        return this.disableTopBg;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsCarousel() {
        return this.isCarousel;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTabName() {
        return this.tabName;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOmsId() {
        return this.omsId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SimpleNetworkInfo getSimpleNetworkInfo() {
        return this.simpleNetworkInfo;
    }

    @NotNull
    public final DelegateEnv copy(boolean isDarkMode, boolean isFullScreen, boolean needTopBarBg, boolean isTabVisible, boolean disableTopBg, boolean isCarousel, @NotNull String tabName, @NotNull String omsId, @Nullable SimpleNetworkInfo simpleNetworkInfo, @NotNull String sceneReveal) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        Intrinsics.checkNotNullParameter(omsId, "omsId");
        Intrinsics.checkNotNullParameter(sceneReveal, "sceneReveal");
        return new DelegateEnv(isDarkMode, isFullScreen, needTopBarBg, isTabVisible, disableTopBg, isCarousel, tabName, omsId, simpleNetworkInfo, sceneReveal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DelegateEnv)) {
            return false;
        }
        DelegateEnv delegateEnv = (DelegateEnv) other;
        return this.isDarkMode == delegateEnv.isDarkMode && this.isFullScreen == delegateEnv.isFullScreen && this.needTopBarBg == delegateEnv.needTopBarBg && this.isTabVisible == delegateEnv.isTabVisible && this.disableTopBg == delegateEnv.disableTopBg && this.isCarousel == delegateEnv.isCarousel && Intrinsics.areEqual(this.tabName, delegateEnv.tabName) && Intrinsics.areEqual(this.omsId, delegateEnv.omsId) && Intrinsics.areEqual(this.simpleNetworkInfo, delegateEnv.simpleNetworkInfo) && Intrinsics.areEqual(this.sceneReveal, delegateEnv.sceneReveal);
    }

    public final boolean getDisableTopBg() {
        return this.disableTopBg;
    }

    public final boolean getNeedTopBarBg() {
        return this.needTopBarBg;
    }

    @NotNull
    public final String getOmsId() {
        return this.omsId;
    }

    @NotNull
    public final String getSceneReveal() {
        return this.sceneReveal;
    }

    @Nullable
    public final SimpleNetworkInfo getSimpleNetworkInfo() {
        return this.simpleNetworkInfo;
    }

    @NotNull
    public final String getTabName() {
        return this.tabName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z = this.isDarkMode;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isFullScreen;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.needTopBarBg;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.isTabVisible;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i4 = (i3 + r4) * 31;
        boolean z5 = this.disableTopBg;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i5 = (i4 + r5) * 31;
        boolean z6 = this.isCarousel;
        int iHashCode = (((((i5 + (z6 ? 1 : z6)) * 31) + this.tabName.hashCode()) * 31) + this.omsId.hashCode()) * 31;
        SimpleNetworkInfo simpleNetworkInfo = this.simpleNetworkInfo;
        return ((iHashCode + (simpleNetworkInfo == null ? 0 : simpleNetworkInfo.hashCode())) * 31) + this.sceneReveal.hashCode();
    }

    public final boolean isCarousel() {
        return this.isCarousel;
    }

    public final boolean isDarkMode() {
        return this.isDarkMode;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    public final boolean isTabVisible() {
        return this.isTabVisible;
    }

    public final void setCarousel(boolean z) {
        this.isCarousel = z;
    }

    public final void setDarkMode(boolean z) {
        this.isDarkMode = z;
    }

    public final void setFullScreen(boolean z) {
        this.isFullScreen = z;
    }

    public final void setNeedTopBarBg(boolean z) {
        this.needTopBarBg = z;
    }

    @NotNull
    public String toString() {
        return "DelegateEnv(isDarkMode=" + this.isDarkMode + ", isFullScreen=" + this.isFullScreen + ", needTopBarBg=" + this.needTopBarBg + ", isTabVisible=" + this.isTabVisible + ", disableTopBg=" + this.disableTopBg + ", isCarousel=" + this.isCarousel + ", tabName=" + this.tabName + ", omsId=" + this.omsId + ", simpleNetworkInfo=" + this.simpleNetworkInfo + ", sceneReveal=" + this.sceneReveal + ')';
    }
}
