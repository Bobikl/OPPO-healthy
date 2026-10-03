package com.heytap.health.home.sp;

import android.content.SharedPreferences;
import androidx.annotation.Keep;
import androidx.camera.core.processing.util.GLUtils;
import com.amap.api.services.district.DistrictSearchQuery;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ld9;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b;\u0010<R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\"\u0010 \u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\"\u0010&\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u00103\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0012\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016R\"\u00106\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0012\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u0010\u0016R\"\u00109\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010+\u001a\u0004\b9\u0010-\"\u0004\b:\u0010/¨\u0006?"}, d2 = {"Lcom/heytap/health/home/sp/HomeRankSpConfig;", "", "", "homeRankDate", "I", "getHomeRankDate", "()I", "setHomeRankDate", "(I)V", "", "homeRankTimeStamp", "J", "getHomeRankTimeStamp", "()J", "setHomeRankTimeStamp", "(J)V", "", "homeRankLocation", "Ljava/lang/String;", "getHomeRankLocation", "()Ljava/lang/String;", "setHomeRankLocation", "(Ljava/lang/String;)V", "homeRankCity", "getHomeRankCity", "setHomeRankCity", "homeRankAdcode", "getHomeRankAdcode", "setHomeRankAdcode", "homeRankLatitude", "getHomeRankLatitude", "setHomeRankLatitude", "homeRankLongtitude", "getHomeRankLongtitude", "setHomeRankLongtitude", "homeRankRanking", "getHomeRankRanking", "setHomeRankRanking", "homeRankList", "getHomeRankList", "setHomeRankList", "", "homeRankFirstOpen", "Z", "getHomeRankFirstOpen", "()Z", "setHomeRankFirstOpen", "(Z)V", "homeRankPermission", "getHomeRankPermission", "setHomeRankPermission", DebugModeEntity.KEY_AREA, "getArea", "setArea", DistrictSearchQuery.KEYWORDS_CITY, "getCity", "setCity", "isMigrate", "setMigrate", "<init>", "()V", "Companion", "a", "home_release"}, k = 1, mv = {1, 8, 0})
public final class HomeRankSpConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DEFAULT_SP_NAME = "health_share_preference";

    @NotNull
    public static final String TAG = "HomeRankSpConfig";
    private boolean homeRankFirstOpen;
    private boolean homeRankPermission;
    private boolean isMigrate;
    private int homeRankDate = -1;
    private long homeRankTimeStamp = -1;

    @NotNull
    private String homeRankLocation = "";

    @NotNull
    private String homeRankCity = "";

    @NotNull
    private String homeRankAdcode = "";

    @NotNull
    private String homeRankLatitude = GLUtils.VERSION_UNKNOWN;

    @NotNull
    private String homeRankLongtitude = GLUtils.VERSION_UNKNOWN;

    @NotNull
    private String homeRankRanking = "";

    @NotNull
    private String homeRankList = "";

    @NotNull
    private String area = "";

    @NotNull
    private String city = "";

    /* JADX INFO: renamed from: com.heytap.health.home.sp.HomeRankSpConfig$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/home/sp/HomeRankSpConfig$a;", "", "", "b", "", "timestamp", "", "a", "", "DEFAULT_SP_NAME", "Ljava/lang/String;", "TAG", "<init>", "()V", "home_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long timestamp) {
            try {
                return Integer.parseInt(LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyyMMdd")));
            } catch (Exception unused) {
                return -1;
            }
        }

        public final void b() {
            if (ld9.s(false)) {
                a7b.f(HomeRankSpConfig.TAG, "Data has migrated");
                return;
            }
            SharedPreferences sharedPreferences = b78.a().getSharedPreferences("health_share_preference", 0);
            if (sharedPreferences.getLong("home_rank_time_stamp", -1L) == -1) {
                a7b.f(HomeRankSpConfig.TAG, "Old sp is null");
                ld9.T(true);
                return;
            }
            ld9.B(sharedPreferences.getInt("home_rank_date", a(System.currentTimeMillis())));
            ld9.R(sharedPreferences.getLong("home_rank_time_stamp", -1L));
            ld9.J(sharedPreferences.getString("home_rank_location", ""));
            ld9.z(sharedPreferences.getString("home_rank_city", ""));
            ld9.x(sharedPreferences.getString("home_rank_adcode", ""));
            ld9.F(sharedPreferences.getString("home_rank_latitude", GLUtils.VERSION_UNKNOWN));
            ld9.L(sharedPreferences.getString("home_rank_longtitude", GLUtils.VERSION_UNKNOWN));
            ld9.P(sharedPreferences.getString("home_rank_ranking", ""));
            ld9.H(sharedPreferences.getString("home_rank_list", ""));
            ld9.D(sharedPreferences.getBoolean("home_rank_first_open", false));
            ld9.N(sharedPreferences.getBoolean("home_rank_rank_permission", false));
            ld9.t(sharedPreferences.getString(DebugModeEntity.KEY_AREA, ""));
            ld9.v(sharedPreferences.getString(DistrictSearchQuery.KEYWORDS_CITY, ""));
            a7b.f(HomeRankSpConfig.TAG, "Data is migrating now");
            ld9.T(true);
        }
    }

    @NotNull
    public final String getArea() {
        return this.area;
    }

    @NotNull
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getHomeRankAdcode() {
        return this.homeRankAdcode;
    }

    @NotNull
    public final String getHomeRankCity() {
        return this.homeRankCity;
    }

    public final int getHomeRankDate() {
        return this.homeRankDate;
    }

    public final boolean getHomeRankFirstOpen() {
        return this.homeRankFirstOpen;
    }

    @NotNull
    public final String getHomeRankLatitude() {
        return this.homeRankLatitude;
    }

    @NotNull
    public final String getHomeRankList() {
        return this.homeRankList;
    }

    @NotNull
    public final String getHomeRankLocation() {
        return this.homeRankLocation;
    }

    @NotNull
    public final String getHomeRankLongtitude() {
        return this.homeRankLongtitude;
    }

    public final boolean getHomeRankPermission() {
        return this.homeRankPermission;
    }

    @NotNull
    public final String getHomeRankRanking() {
        return this.homeRankRanking;
    }

    public final long getHomeRankTimeStamp() {
        return this.homeRankTimeStamp;
    }

    /* JADX INFO: renamed from: isMigrate, reason: from getter */
    public final boolean getIsMigrate() {
        return this.isMigrate;
    }

    public final void setArea(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.area = str;
    }

    public final void setCity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.city = str;
    }

    public final void setHomeRankAdcode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.homeRankAdcode = str;
    }

    public final void setHomeRankCity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.homeRankCity = str;
    }

    public final void setHomeRankDate(int i) {
        this.homeRankDate = i;
    }

    public final void setHomeRankFirstOpen(boolean z) {
        this.homeRankFirstOpen = z;
    }

    public final void setHomeRankLatitude(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.homeRankLatitude = str;
    }

    public final void setHomeRankList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.homeRankList = str;
    }

    public final void setHomeRankLocation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.homeRankLocation = str;
    }

    public final void setHomeRankLongtitude(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.homeRankLongtitude = str;
    }

    public final void setHomeRankPermission(boolean z) {
        this.homeRankPermission = z;
    }

    public final void setHomeRankRanking(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.homeRankRanking = str;
    }

    public final void setHomeRankTimeStamp(long j2) {
        this.homeRankTimeStamp = j2;
    }

    public final void setMigrate(boolean z) {
        this.isMigrate = z;
    }
}
