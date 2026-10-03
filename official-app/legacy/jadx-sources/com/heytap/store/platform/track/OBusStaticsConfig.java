package com.heytap.store.platform.track;

import android.content.Context;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.jla;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b \u0018\u00002\u00020\u0001:\u0001*Ba\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0002\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u001e\"\u0004\b%\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 ¨\u0006+"}, d2 = {"Lcom/heytap/store/platform/track/OBusStaticsConfig;", "", "context", "Landroid/content/Context;", "region", "", "enableLog", "", "reportEnable", HttpConst.APP_KEY, "appId", "", f04.JSON_KEY_APP_SECRET, "isSupportJellyBean", "enableAuto", "enableAutoLog", "(Landroid/content/Context;Ljava/lang/String;ZZLjava/lang/String;JLjava/lang/String;ZZZ)V", "getAppId", "()J", "setAppId", "(J)V", "getAppKey", "()Ljava/lang/String;", "setAppKey", "(Ljava/lang/String;)V", "getAppSecret", "setAppSecret", "getContext", "()Landroid/content/Context;", "getEnableAuto", "()Z", "setEnableAuto", "(Z)V", "getEnableAutoLog", "setEnableAutoLog", "getEnableLog", "setEnableLog", "setSupportJellyBean", "getRegion", "setRegion", "getReportEnable", "setReportEnable", "Builder", "track_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OBusStaticsConfig {
    private long appId;

    @NotNull
    private String appKey;

    @NotNull
    private String appSecret;

    @NotNull
    private final Context context;
    private boolean enableAuto;
    private boolean enableAutoLog;
    private boolean enableLog;
    private boolean isSupportJellyBean;

    @NotNull
    private String region;
    private boolean reportEnable;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/platform/track/OBusStaticsConfig$Builder;", "", "()V", "appId", "", HttpConst.APP_KEY, "", f04.JSON_KEY_APP_SECRET, "context", "Landroid/content/Context;", "enableAuto", "", "enableAutoLog", "enableLog", "isSupportJellyBean", "region", "reportEnable", jla.DEFAULT_BUILD_METHOD, "Lcom/heytap/store/platform/track/OBusStaticsConfig;", "setAppId", "setAppKey", "setAppSecret", "setContext", "setRegion", "setReportEnable", "track_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        private long appId;
        private Context context;
        private boolean enableAuto;
        private boolean enableAutoLog;
        private boolean enableLog;
        private boolean isSupportJellyBean;

        @NotNull
        private String region = "";

        @NotNull
        private String appSecret = "";

        @NotNull
        private String appKey = "";
        private boolean reportEnable = true;

        @NotNull
        public final OBusStaticsConfig build() {
            Context context = this.context;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            return new OBusStaticsConfig(context, this.region, this.enableLog, this.reportEnable, this.appKey, this.appId, this.appSecret, this.isSupportJellyBean, this.enableAuto, this.enableAutoLog, null);
        }

        @NotNull
        public final Builder enableAuto(boolean enableAuto) {
            this.enableAuto = enableAuto;
            return this;
        }

        @NotNull
        public final Builder enableAutoLog(boolean enableAutoLog) {
            this.enableAutoLog = enableAutoLog;
            return this;
        }

        @NotNull
        public final Builder enableLog(boolean enableLog) {
            this.enableLog = enableLog;
            return this;
        }

        @NotNull
        public final Builder isSupportJellyBean(boolean isSupportJellyBean) {
            this.isSupportJellyBean = isSupportJellyBean;
            return this;
        }

        @NotNull
        public final Builder setAppId(long appId) {
            this.appId = appId;
            return this;
        }

        @NotNull
        public final Builder setAppKey(@NotNull String appKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.appKey = appKey;
            return this;
        }

        @NotNull
        public final Builder setAppSecret(@NotNull String appSecret) {
            Intrinsics.checkNotNullParameter(appSecret, "appSecret");
            this.appSecret = appSecret;
            return this;
        }

        @NotNull
        public final Builder setContext(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            return this;
        }

        @NotNull
        public final Builder setRegion(@NotNull String region) {
            Intrinsics.checkNotNullParameter(region, "region");
            this.region = region;
            return this;
        }

        @NotNull
        public final Builder setReportEnable(boolean reportEnable) {
            this.reportEnable = reportEnable;
            return this;
        }
    }

    public /* synthetic */ OBusStaticsConfig(Context context, String str, boolean z, boolean z2, String str2, long j2, String str3, boolean z3, boolean z4, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, z, z2, str2, j2, str3, z3, z4, z5);
    }

    public final long getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getAppKey() {
        return this.appKey;
    }

    @NotNull
    public final String getAppSecret() {
        return this.appSecret;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final boolean getEnableAuto() {
        return this.enableAuto;
    }

    public final boolean getEnableAutoLog() {
        return this.enableAutoLog;
    }

    public final boolean getEnableLog() {
        return this.enableLog;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    public final boolean getReportEnable() {
        return this.reportEnable;
    }

    /* JADX INFO: renamed from: isSupportJellyBean, reason: from getter */
    public final boolean getIsSupportJellyBean() {
        return this.isSupportJellyBean;
    }

    public final void setAppId(long j2) {
        this.appId = j2;
    }

    public final void setAppKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appKey = str;
    }

    public final void setAppSecret(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appSecret = str;
    }

    public final void setEnableAuto(boolean z) {
        this.enableAuto = z;
    }

    public final void setEnableAutoLog(boolean z) {
        this.enableAutoLog = z;
    }

    public final void setEnableLog(boolean z) {
        this.enableLog = z;
    }

    public final void setRegion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.region = str;
    }

    public final void setReportEnable(boolean z) {
        this.reportEnable = z;
    }

    public final void setSupportJellyBean(boolean z) {
        this.isSupportJellyBean = z;
    }

    private OBusStaticsConfig(Context context, String str, boolean z, boolean z2, String str2, long j2, String str3, boolean z3, boolean z4, boolean z5) {
        this.context = context;
        this.region = str;
        this.enableLog = z;
        this.reportEnable = z2;
        this.appKey = str2;
        this.appId = j2;
        this.appSecret = str3;
        this.isSupportJellyBean = z3;
        this.enableAuto = z4;
        this.enableAutoLog = z5;
    }

    public /* synthetic */ OBusStaticsConfig(Context context, String str, boolean z, boolean z2, String str2, long j2, String str3, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, str2, j2, str3, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? false : z5);
    }
}
