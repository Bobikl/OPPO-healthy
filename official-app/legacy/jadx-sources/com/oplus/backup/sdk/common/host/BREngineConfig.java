package com.oplus.backup.sdk.common.host;

import android.os.Bundle;
import com.oplus.backup.sdk.common.utils.BRLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class BREngineConfig {
    public static final String BACKUP_ROOT_PATH = "backup_root_path";
    public static final int BACKUP_TYPE = 0;
    public static final String BR_TYPE = "br_type";
    public static final String CACHE_APP_DATA_FOLDER = "cache_app_data_folder";
    public static final String FEATURES = "features";
    public static final String FEATURE_SUPPORT_DIRECT_SEND = "support_direct_send";
    public static final String FEATURE_SUPPORT_LIST_FILE = "support_list_file";
    private static final String LOG_LEVEL = "log_level";
    private static final String PAIRED_PHONE_ANDROID_VERSION = "paired_phone_android_version";
    private static final String PAIRED_PHONE_OS_VERSION = "paired_phone_os_version";
    public static final String RESTORE_ROOT_PATH = "restore_root_path";
    public static final int RESTORE_TYPE = 1;
    public static final String SOURCE = "source";
    public static final String SOURCE_FLAG = "source_flag";
    public static final String SUPPORT_DIR_MIGRATION = "support_dir_migration";
    private Bundle mBundle;
    private ArrayList<String> mFeatureList;

    public BREngineConfig() {
        this.mBundle = new Bundle();
    }

    public static BREngineConfig parse(Bundle bundle) {
        return new BREngineConfig(bundle);
    }

    public int getBRType() {
        return this.mBundle.getInt("br_type");
    }

    public String getBackupRootPath() {
        return this.mBundle.getString(BACKUP_ROOT_PATH);
    }

    public Bundle getBundle() {
        return this.mBundle;
    }

    public String getCacheAppDataFolder() {
        return this.mBundle.getString(CACHE_APP_DATA_FOLDER);
    }

    public ArrayList<String> getFeatures() {
        if (this.mFeatureList == null) {
            this.mFeatureList = this.mBundle.getStringArrayList("features");
        }
        return this.mFeatureList;
    }

    public int getLogLevel() {
        return this.mBundle.getInt(LOG_LEVEL, 5);
    }

    public String getOldPhoneAndroidVersion() {
        return this.mBundle.getString(PAIRED_PHONE_ANDROID_VERSION);
    }

    public int getOldPhoneOSVersion() {
        return this.mBundle.getInt(PAIRED_PHONE_OS_VERSION);
    }

    public String getRestoreRootPath() {
        return this.mBundle.getString(RESTORE_ROOT_PATH);
    }

    public String getSource() {
        return this.mBundle.getString("source");
    }

    public boolean hasFeature(String str) {
        ArrayList<String> features = getFeatures();
        return features != null && features.contains(str);
    }

    public void putValue(String str, String str2) {
        this.mBundle.putString(str, str2);
    }

    public void setBRType(int i) {
        this.mBundle.putInt("br_type", i);
    }

    public void setBackupRootPath(String str) {
        this.mBundle.putString(BACKUP_ROOT_PATH, str);
    }

    public void setLogLevel(int i) {
        this.mBundle.putInt(LOG_LEVEL, i);
    }

    public void setRestoreRootPath(String str) {
        this.mBundle.putString(RESTORE_ROOT_PATH, str);
    }

    public void setSource(String str) {
        this.mBundle.putString("source", str);
    }

    public String toString() {
        return "BREngineConfig:[" + getBRType() + ", " + BRLog.getModifiedPath(getBackupRootPath()) + ", " + BRLog.getModifiedPath(getRestoreRootPath()) + ", " + getSource() + ", " + getLogLevel() + ",OSVersion " + getOldPhoneOSVersion() + ", androidVersion " + getOldPhoneAndroidVersion() + ", featureList:" + this.mFeatureList + "]";
    }

    public void putValue(String str, String[] strArr) {
        this.mBundle.putStringArray(str, strArr);
    }

    public BREngineConfig(Bundle bundle) {
        this.mBundle = bundle;
    }
}
