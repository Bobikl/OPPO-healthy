package com.heytap.store.platform.track;

import android.content.Context;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.oplus.aiunit.vision.jla;
import com.oplus.aiunit.vision.l18;
import com.oplus.aiunit.vision.zz4;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b,\u0018\u0000 82\u00020\u0001:\u000278B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007¢\u0006\u0002\u0010\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\u0011\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u001e\"\u0004\b-\u0010 R\u001a\u0010\u0013\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u001e\"\u0004\b.\u0010 R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/heytap/store/platform/track/SAStatisticsConfig;", "", "context", "Landroid/content/Context;", "serverURL", "", "reportEnable", "", FragmentStyle.DEBUG, "enableJavascriptInterface", "autoTrackEventType", "", "maxCacheSize", "", "flushBulkSize", "flushInterval", "enableTrackPush", "enablePageLeave", "isEnableAndroidId", "isEnableOAId", "(Landroid/content/Context;Ljava/lang/String;ZZZIJIJZZZZ)V", "getAutoTrackEventType", "()I", "setAutoTrackEventType", "(I)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getDebug", "()Z", "setDebug", "(Z)V", "getEnableJavascriptInterface", "setEnableJavascriptInterface", "getEnablePageLeave", "setEnablePageLeave", "getEnableTrackPush", "setEnableTrackPush", "getFlushBulkSize", "setFlushBulkSize", "getFlushInterval", "()J", "setFlushInterval", "(J)V", "setEnableAndroidId", "setEnableOAId", "getMaxCacheSize", "setMaxCacheSize", "getReportEnable", "setReportEnable", "getServerURL", "()Ljava/lang/String;", "setServerURL", "(Ljava/lang/String;)V", "Builder", "Companion", "track_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SAStatisticsConfig {
    public static final int APP_CLICK = 4;
    public static final int APP_END = 2;
    public static final int APP_START = 1;
    public static final int APP_VIEW_SCREEN = 8;
    public static final int TYPE_NONE = 0;
    private int autoTrackEventType;

    @NotNull
    private Context context;
    private boolean debug;
    private boolean enableJavascriptInterface;
    private boolean enablePageLeave;
    private boolean enableTrackPush;
    private int flushBulkSize;
    private long flushInterval;
    private boolean isEnableAndroidId;
    private boolean isEnableOAId;
    private long maxCacheSize;
    private boolean reportEnable;

    @NotNull
    private String serverURL;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/heytap/store/platform/track/SAStatisticsConfig$Builder;", "", "()V", "autoTrackEventType", "", "context", "Landroid/content/Context;", FragmentStyle.DEBUG, "", "enableJavascriptInterface", "enablePageLeave", "enableTrackPush", "flushBulkSize", "flushInterval", "", "maxCacheSize", "reportEnable", "serverURL", "", jla.DEFAULT_BUILD_METHOD, "Lcom/heytap/store/platform/track/SAStatisticsConfig;", "url", "setEnablePageLeave", "track_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        private Context context;
        private boolean debug;
        private boolean enableJavascriptInterface;
        private boolean reportEnable;

        @NotNull
        private String serverURL = "";
        private long maxCacheSize = zz4.JOURNAL_SIZE_LIMIT_LOW;
        private int flushBulkSize = 50;
        private long flushInterval = 5000;
        private boolean enableTrackPush = true;
        private boolean enablePageLeave = true;
        private int autoTrackEventType = 3;

        @NotNull
        public final Builder autoTrackEventType(int autoTrackEventType) {
            this.autoTrackEventType = autoTrackEventType;
            return this;
        }

        @NotNull
        public final SAStatisticsConfig build() {
            Context context = this.context;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            return new SAStatisticsConfig(context, this.serverURL, this.reportEnable, this.debug, this.enableJavascriptInterface, this.autoTrackEventType, this.maxCacheSize, this.flushBulkSize, this.flushInterval, this.enableTrackPush, this.enablePageLeave, false, false, l18.GL_COLOR, null);
        }

        @NotNull
        public final Builder context(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            return this;
        }

        @NotNull
        public final Builder debug(boolean debug) {
            this.debug = debug;
            return this;
        }

        @NotNull
        public final Builder enableJavascriptInterface(boolean enableJavascriptInterface) {
            this.enableJavascriptInterface = enableJavascriptInterface;
            return this;
        }

        @NotNull
        public final Builder enableTrackPush(boolean enableTrackPush) {
            this.enableTrackPush = enableTrackPush;
            return this;
        }

        @NotNull
        public final Builder flushBulkSize(int flushBulkSize) {
            this.flushBulkSize = flushBulkSize;
            return this;
        }

        @NotNull
        public final Builder flushInterval(long flushInterval) {
            this.flushInterval = flushInterval;
            return this;
        }

        @NotNull
        public final Builder maxCacheSize(long maxCacheSize) {
            this.maxCacheSize = maxCacheSize;
            return this;
        }

        @NotNull
        public final Builder reportEnable(boolean reportEnable) {
            this.reportEnable = reportEnable;
            return this;
        }

        @NotNull
        public final Builder serverURL(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.serverURL = url;
            return this;
        }

        @NotNull
        public final Builder setEnablePageLeave(boolean enablePageLeave) {
            this.enablePageLeave = enablePageLeave;
            return this;
        }
    }

    public SAStatisticsConfig(@NotNull Context context, @NotNull String serverURL, boolean z, boolean z2, boolean z3, int i, long j2, int i2, long j3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serverURL, "serverURL");
        this.context = context;
        this.serverURL = serverURL;
        this.reportEnable = z;
        this.debug = z2;
        this.enableJavascriptInterface = z3;
        this.autoTrackEventType = i;
        this.maxCacheSize = j2;
        this.flushBulkSize = i2;
        this.flushInterval = j3;
        this.enableTrackPush = z4;
        this.enablePageLeave = z5;
        this.isEnableAndroidId = z6;
        this.isEnableOAId = z7;
    }

    public final int getAutoTrackEventType() {
        return this.autoTrackEventType;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final boolean getEnableJavascriptInterface() {
        return this.enableJavascriptInterface;
    }

    public final boolean getEnablePageLeave() {
        return this.enablePageLeave;
    }

    public final boolean getEnableTrackPush() {
        return this.enableTrackPush;
    }

    public final int getFlushBulkSize() {
        return this.flushBulkSize;
    }

    public final long getFlushInterval() {
        return this.flushInterval;
    }

    public final long getMaxCacheSize() {
        return this.maxCacheSize;
    }

    public final boolean getReportEnable() {
        return this.reportEnable;
    }

    @NotNull
    public final String getServerURL() {
        return this.serverURL;
    }

    /* JADX INFO: renamed from: isEnableAndroidId, reason: from getter */
    public final boolean getIsEnableAndroidId() {
        return this.isEnableAndroidId;
    }

    /* JADX INFO: renamed from: isEnableOAId, reason: from getter */
    public final boolean getIsEnableOAId() {
        return this.isEnableOAId;
    }

    public final void setAutoTrackEventType(int i) {
        this.autoTrackEventType = i;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDebug(boolean z) {
        this.debug = z;
    }

    public final void setEnableAndroidId(boolean z) {
        this.isEnableAndroidId = z;
    }

    public final void setEnableJavascriptInterface(boolean z) {
        this.enableJavascriptInterface = z;
    }

    public final void setEnableOAId(boolean z) {
        this.isEnableOAId = z;
    }

    public final void setEnablePageLeave(boolean z) {
        this.enablePageLeave = z;
    }

    public final void setEnableTrackPush(boolean z) {
        this.enableTrackPush = z;
    }

    public final void setFlushBulkSize(int i) {
        this.flushBulkSize = i;
    }

    public final void setFlushInterval(long j2) {
        this.flushInterval = j2;
    }

    public final void setMaxCacheSize(long j2) {
        this.maxCacheSize = j2;
    }

    public final void setReportEnable(boolean z) {
        this.reportEnable = z;
    }

    public final void setServerURL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serverURL = str;
    }

    public /* synthetic */ SAStatisticsConfig(Context context, String str, boolean z, boolean z2, boolean z3, int i, long j2, int i2, long j3, boolean z4, boolean z5, boolean z6, boolean z7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? false : z3, i, (i3 & 64) != 0 ? 33554432L : j2, (i3 & 128) != 0 ? 50 : i2, (i3 & 256) != 0 ? 5000L : j3, (i3 & 512) != 0 ? true : z4, (i3 & 1024) != 0 ? true : z5, (i3 & 2048) != 0 ? false : z6, (i3 & 4096) != 0 ? false : z7);
    }
}
