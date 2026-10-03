package com.cloud.sdk.cloudstorage.common;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.aiunit.vision.jla;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00015B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u00104\u001a\u00020\u0016R\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\fR\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/cloud/sdk/cloudstorage/common/OCloudSdkOptions;", "", "cxt", "Landroid/content/Context;", "serverHost", "", "(Landroid/content/Context;Ljava/lang/String;)V", "context", "getContext$cloud_storage_sdk_release", "()Landroid/content/Context;", "deviceId", "getDeviceId$cloud_storage_sdk_release", "()Ljava/lang/String;", "setDeviceId$cloud_storage_sdk_release", "(Ljava/lang/String;)V", "deviceIdCallback", "Lcom/cloud/sdk/cloudstorage/common/IDeviceIdCallback;", "getDeviceIdCallback$cloud_storage_sdk_release", "()Lcom/cloud/sdk/cloudstorage/common/IDeviceIdCallback;", "setDeviceIdCallback$cloud_storage_sdk_release", "(Lcom/cloud/sdk/cloudstorage/common/IDeviceIdCallback;)V", "isVerboseLog", "", "isVerboseLog$cloud_storage_sdk_release", "()Z", "setVerboseLog$cloud_storage_sdk_release", "(Z)V", "logCallback", "Lcom/cloud/sdk/cloudstorage/common/ILogCallback;", "getLogCallback$cloud_storage_sdk_release", "()Lcom/cloud/sdk/cloudstorage/common/ILogCallback;", "setLogCallback$cloud_storage_sdk_release", "(Lcom/cloud/sdk/cloudstorage/common/ILogCallback;)V", "multiplier", "", "getMultiplier$cloud_storage_sdk_release", "()I", "setMultiplier$cloud_storage_sdk_release", "(I)V", "regionMark", "getRegionMark$cloud_storage_sdk_release", "setRegionMark$cloud_storage_sdk_release", "romVersion", "getRomVersion$cloud_storage_sdk_release", "setRomVersion$cloud_storage_sdk_release", "getServerHost$cloud_storage_sdk_release", "statisticsDispatcher", "Lcom/cloud/sdk/cloudstorage/common/IStatisticsDispatcher;", "getStatisticsDispatcher$cloud_storage_sdk_release", "()Lcom/cloud/sdk/cloudstorage/common/IStatisticsDispatcher;", "setStatisticsDispatcher$cloud_storage_sdk_release", "(Lcom/cloud/sdk/cloudstorage/common/IStatisticsDispatcher;)V", "isExpDevice", "Builder", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class OCloudSdkOptions {

    @NotNull
    private final Context context;

    @Nullable
    private String deviceId;

    @Nullable
    private IDeviceIdCallback deviceIdCallback;
    private boolean isVerboseLog;

    @Nullable
    private ILogCallback logCallback;
    private int multiplier;

    @NotNull
    private String regionMark;

    @Nullable
    private String romVersion;

    @NotNull
    private final String serverHost;

    @Nullable
    private IStatisticsDispatcher statisticsDispatcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0005J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/cloud/sdk/cloudstorage/common/OCloudSdkOptions$Builder;", "", "context", "Landroid/content/Context;", "host", "", "(Landroid/content/Context;Ljava/lang/String;)V", "option", "Lcom/cloud/sdk/cloudstorage/common/OCloudSdkOptions;", jla.DEFAULT_BUILD_METHOD, "setDeviceId", "deviceId", "setDeviceIdCallback", "deviceIdCallback", "Lcom/cloud/sdk/cloudstorage/common/IDeviceIdCallback;", "setLogCallback", "logCallback", "Lcom/cloud/sdk/cloudstorage/common/ILogCallback;", "setMultiplier", "multiplier", "", "setRegionMark", "regionMark", "setRomVersion", "romVersion", "setStatisticsDispatcher", "statisticsDispatcher", "Lcom/cloud/sdk/cloudstorage/common/IStatisticsDispatcher;", "setVerboseLog", "isVerboseLog", "", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
    public static final class Builder {
        private final OCloudSdkOptions option;

        public Builder(@NotNull Context context, @NotNull String host) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(host, "host");
            this.option = new OCloudSdkOptions(context, host, null);
        }

        @NotNull
        /* JADX INFO: renamed from: build, reason: from getter */
        public final OCloudSdkOptions getOption() {
            return this.option;
        }

        @NotNull
        public final Builder setDeviceId(@Nullable String deviceId) {
            this.option.setDeviceId$cloud_storage_sdk_release(deviceId);
            return this;
        }

        @NotNull
        public final Builder setDeviceIdCallback(@Nullable IDeviceIdCallback deviceIdCallback) {
            this.option.setDeviceIdCallback$cloud_storage_sdk_release(deviceIdCallback);
            return this;
        }

        @NotNull
        public final Builder setLogCallback(@Nullable ILogCallback logCallback) {
            this.option.setLogCallback$cloud_storage_sdk_release(logCallback);
            return this;
        }

        @NotNull
        public final Builder setMultiplier(int multiplier) {
            if (multiplier < 10) {
                this.option.setMultiplier$cloud_storage_sdk_release(multiplier);
            }
            return this;
        }

        @NotNull
        public final Builder setRegionMark(@NotNull String regionMark) {
            Intrinsics.checkNotNullParameter(regionMark, "regionMark");
            this.option.setRegionMark$cloud_storage_sdk_release(regionMark);
            return this;
        }

        @NotNull
        public final Builder setRomVersion(@Nullable String romVersion) {
            this.option.setRomVersion$cloud_storage_sdk_release(romVersion);
            return this;
        }

        @NotNull
        public final Builder setStatisticsDispatcher(@Nullable IStatisticsDispatcher statisticsDispatcher) {
            this.option.setStatisticsDispatcher$cloud_storage_sdk_release(statisticsDispatcher);
            return this;
        }

        @NotNull
        public final Builder setVerboseLog(boolean isVerboseLog) {
            this.option.setVerboseLog$cloud_storage_sdk_release(isVerboseLog);
            return this;
        }
    }

    private OCloudSdkOptions(Context context, String str) {
        this.serverHost = str;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext != null ? applicationContext : context;
        this.regionMark = "";
        this.romVersion = "";
        this.multiplier = 10;
    }

    @NotNull
    /* JADX INFO: renamed from: getContext$cloud_storage_sdk_release, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    /* JADX INFO: renamed from: getDeviceId$cloud_storage_sdk_release, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: getDeviceIdCallback$cloud_storage_sdk_release, reason: from getter */
    public final IDeviceIdCallback getDeviceIdCallback() {
        return this.deviceIdCallback;
    }

    @Nullable
    /* JADX INFO: renamed from: getLogCallback$cloud_storage_sdk_release, reason: from getter */
    public final ILogCallback getLogCallback() {
        return this.logCallback;
    }

    /* JADX INFO: renamed from: getMultiplier$cloud_storage_sdk_release, reason: from getter */
    public final int getMultiplier() {
        return this.multiplier;
    }

    @NotNull
    /* JADX INFO: renamed from: getRegionMark$cloud_storage_sdk_release, reason: from getter */
    public final String getRegionMark() {
        return this.regionMark;
    }

    @Nullable
    /* JADX INFO: renamed from: getRomVersion$cloud_storage_sdk_release, reason: from getter */
    public final String getRomVersion() {
        return this.romVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: getServerHost$cloud_storage_sdk_release, reason: from getter */
    public final String getServerHost() {
        return this.serverHost;
    }

    @Nullable
    /* JADX INFO: renamed from: getStatisticsDispatcher$cloud_storage_sdk_release, reason: from getter */
    public final IStatisticsDispatcher getStatisticsDispatcher() {
        return this.statisticsDispatcher;
    }

    public final boolean isExpDevice() {
        return !TextUtils.isEmpty(this.regionMark) && (Intrinsics.areEqual(this.regionMark, "CN") ^ true) && (Intrinsics.areEqual(this.regionMark, "OC") ^ true);
    }

    /* JADX INFO: renamed from: isVerboseLog$cloud_storage_sdk_release, reason: from getter */
    public final boolean getIsVerboseLog() {
        return this.isVerboseLog;
    }

    public final void setDeviceId$cloud_storage_sdk_release(@Nullable String str) {
        this.deviceId = str;
    }

    public final void setDeviceIdCallback$cloud_storage_sdk_release(@Nullable IDeviceIdCallback iDeviceIdCallback) {
        this.deviceIdCallback = iDeviceIdCallback;
    }

    public final void setLogCallback$cloud_storage_sdk_release(@Nullable ILogCallback iLogCallback) {
        this.logCallback = iLogCallback;
    }

    public final void setMultiplier$cloud_storage_sdk_release(int i) {
        this.multiplier = i;
    }

    public final void setRegionMark$cloud_storage_sdk_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.regionMark = str;
    }

    public final void setRomVersion$cloud_storage_sdk_release(@Nullable String str) {
        this.romVersion = str;
    }

    public final void setStatisticsDispatcher$cloud_storage_sdk_release(@Nullable IStatisticsDispatcher iStatisticsDispatcher) {
        this.statisticsDispatcher = iStatisticsDispatcher;
    }

    public final void setVerboseLog$cloud_storage_sdk_release(boolean z) {
        this.isVerboseLog = z;
    }

    public /* synthetic */ OCloudSdkOptions(Context context, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str);
    }
}
