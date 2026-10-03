package com.oplus.drs.track;

import com.oplus.aiunit.vision.fs9;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/oplus/drs/track/IStaticConfig;", "", "", "getRegion", "()Ljava/lang/String;", "region", "getFeedbackRegion", "feedbackRegion", "", "getEnableLog", "()Z", "enableLog", "getEnableTrackSdkCrash", "enableTrackSdkCrash", "getDefaultToDeviceProtectedStorage", "defaultToDeviceProtectedStorage", "Lcom/oplus/aiunit/vision/fs9;", "getLogHook", "()Lcom/oplus/aiunit/vision/fs9;", "logHook", "getEnableTrackInCurrentProcess", "enableTrackInCurrentProcess", "getEnableCacheStdid", "enableCacheStdid", "getStorageFilePrefix", "storageFilePrefix", "getLegacyDrainProcess", "legacyDrainProcess", "getEnableLegacyDataMigration", "enableLegacyDataMigration", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public interface IStaticConfig {
    boolean getDefaultToDeviceProtectedStorage();

    boolean getEnableCacheStdid();

    boolean getEnableLegacyDataMigration();

    boolean getEnableLog();

    boolean getEnableTrackInCurrentProcess();

    boolean getEnableTrackSdkCrash();

    @NotNull
    String getFeedbackRegion();

    @NotNull
    String getLegacyDrainProcess();

    @NotNull
    fs9 getLogHook();

    @NotNull
    String getRegion();

    @NotNull
    String getStorageFilePrefix();
}
