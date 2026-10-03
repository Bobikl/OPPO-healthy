package com.heytap.store.homeservice;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/homeservice/FragmentThemeState;", "", "()V", "hasThemeBackground", "", "getHasThemeBackground", "()Z", "setHasThemeBackground", "(Z)V", "isDarkMode", "setDarkMode", "isGradientNav", "setGradientNav", "isPullRefreshTranslate", "setPullRefreshTranslate", "refreshPullDownPercent", "", "getRefreshPullDownPercent", "()F", "setRefreshPullDownPercent", "(F)V", "scrollY", "", "getScrollY", "()I", "setScrollY", "(I)V", "useLightIcon", "getUseLightIcon", "setUseLightIcon", "com.heytap.store.business.home-service"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FragmentThemeState {
    private boolean hasThemeBackground;
    private boolean isGradientNav;
    private boolean isPullRefreshTranslate;
    private float refreshPullDownPercent;
    private int scrollY;
    private boolean isDarkMode = true;
    private boolean useLightIcon = true;

    public final boolean getHasThemeBackground() {
        return this.hasThemeBackground;
    }

    public final float getRefreshPullDownPercent() {
        return this.refreshPullDownPercent;
    }

    public final int getScrollY() {
        return this.scrollY;
    }

    public final boolean getUseLightIcon() {
        return this.useLightIcon;
    }

    /* JADX INFO: renamed from: isDarkMode, reason: from getter */
    public final boolean getIsDarkMode() {
        return this.isDarkMode;
    }

    /* JADX INFO: renamed from: isGradientNav, reason: from getter */
    public final boolean getIsGradientNav() {
        return this.isGradientNav;
    }

    /* JADX INFO: renamed from: isPullRefreshTranslate, reason: from getter */
    public final boolean getIsPullRefreshTranslate() {
        return this.isPullRefreshTranslate;
    }

    public final void setDarkMode(boolean z) {
        this.isDarkMode = z;
    }

    public final void setGradientNav(boolean z) {
        this.isGradientNav = z;
    }

    public final void setHasThemeBackground(boolean z) {
        this.hasThemeBackground = z;
    }

    public final void setPullRefreshTranslate(boolean z) {
        this.isPullRefreshTranslate = z;
    }

    public final void setRefreshPullDownPercent(float f) {
        this.refreshPullDownPercent = f;
    }

    public final void setScrollY(int i) {
        this.scrollY = i;
    }

    public final void setUseLightIcon(boolean z) {
        this.useLightIcon = z;
    }
}
