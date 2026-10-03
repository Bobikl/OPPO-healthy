package com.heytap.health.home.sp;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/home/sp/HomeSpConfig;", "", "", "healthCardHasBindDevice", "Z", "getHealthCardHasBindDevice", "()Z", "setHealthCardHasBindDevice", "(Z)V", "hasDisplayRecommendPage", "getHasDisplayRecommendPage", "setHasDisplayRecommendPage", "healthCardHasDownloadVideo", "getHealthCardHasDownloadVideo", "setHealthCardHasDownloadVideo", "", "homeShowStatus", "I", "getHomeShowStatus", "()I", "setHomeShowStatus", "(I)V", "isMigrate", "setMigrate", "<init>", "()V", "Companion", "a", "home_release"}, k = 1, mv = {1, 8, 0})
public final class HomeSpConfig {

    @NotNull
    public static final String DEFAULT_SP_NAME = "health_share_preference";

    @NotNull
    public static final String OLD_SP = "health_card_display_status";
    private boolean hasDisplayRecommendPage;
    private boolean healthCardHasBindDevice;
    private boolean healthCardHasDownloadVideo;
    private int homeShowStatus = 1;
    private boolean isMigrate;

    public final boolean getHasDisplayRecommendPage() {
        return this.hasDisplayRecommendPage;
    }

    public final boolean getHealthCardHasBindDevice() {
        return this.healthCardHasBindDevice;
    }

    public final boolean getHealthCardHasDownloadVideo() {
        return this.healthCardHasDownloadVideo;
    }

    public final int getHomeShowStatus() {
        return this.homeShowStatus;
    }

    /* JADX INFO: renamed from: isMigrate, reason: from getter */
    public final boolean getIsMigrate() {
        return this.isMigrate;
    }

    public final void setHasDisplayRecommendPage(boolean z) {
        this.hasDisplayRecommendPage = z;
    }

    public final void setHealthCardHasBindDevice(boolean z) {
        this.healthCardHasBindDevice = z;
    }

    public final void setHealthCardHasDownloadVideo(boolean z) {
        this.healthCardHasDownloadVideo = z;
    }

    public final void setHomeShowStatus(int i) {
        this.homeShowStatus = i;
    }

    public final void setMigrate(boolean z) {
        this.isMigrate = z;
    }
}
