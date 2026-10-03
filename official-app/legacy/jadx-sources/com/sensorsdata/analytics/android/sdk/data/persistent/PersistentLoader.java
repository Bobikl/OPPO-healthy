package com.sensorsdata.analytics.android.sdk.data.persistent;

import android.content.Context;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;

/* JADX INFO: loaded from: classes10.dex */
public class PersistentLoader {
    private static volatile PersistentLoader INSTANCE;
    private final Context mContext;
    private final PersistentAppEndData mAppEndDataPst = (PersistentAppEndData) loadPersistent(DbParams.PersistentName.APP_END_DATA);
    private final PersistentAppExitData mAppExitDataPst = (PersistentAppExitData) loadPersistent(DbParams.APP_EXIT_DATA);
    private final PersistentLoginId mLoginIdPst = (PersistentLoginId) loadPersistent(DbParams.PersistentName.LOGIN_ID);
    private final PersistentRemoteSDKConfig mRemoteSDKConfig = (PersistentRemoteSDKConfig) loadPersistent(DbParams.PersistentName.REMOTE_CONFIG);
    private final UserIdentityPersistent mUserIdsPst = (UserIdentityPersistent) loadPersistent(DbParams.PersistentName.PERSISTENT_USER_ID);
    private final LoginIdKeyPersistent mLoginIdKeyPst = (LoginIdKeyPersistent) loadPersistent(DbParams.PersistentName.PERSISTENT_LOGIN_ID_KEY);
    private final PersistentDistinctId mAnonymousIdPst = (PersistentDistinctId) loadPersistent(DbParams.PersistentName.DISTINCT_ID);
    private final PersistentFirstStart mFirstStartPst = (PersistentFirstStart) loadPersistent(DbParams.PersistentName.FIRST_START);
    private final PersistentFirstDay mFirstDayPst = (PersistentFirstDay) loadPersistent(DbParams.PersistentName.FIRST_DAY);
    private final PersistentSuperProperties mSuperPropertiesPst = (PersistentSuperProperties) loadPersistent(DbParams.PersistentName.SUPER_PROPERTIES);
    private final PersistentVisualConfig mVisualConfigPst = (PersistentVisualConfig) loadPersistent(DbParams.PersistentName.VISUAL_PROPERTIES);
    private final PersistentFirstTrackInstallation mFirstInstallationPst = (PersistentFirstTrackInstallation) loadPersistent(DbParams.PersistentName.FIRST_INSTALL);
    private final PersistentFirstTrackInstallationWithCallback mFirstInstallationWithCallbackPst = (PersistentFirstTrackInstallationWithCallback) loadPersistent(DbParams.PersistentName.FIRST_INSTALL_CALLBACK);
    private final PersistentDailyDate mDayDatePst = (PersistentDailyDate) loadPersistent(DbParams.PersistentName.PERSISTENT_DAY_DATE);

    private PersistentLoader(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static PersistentLoader getInstance() {
        return INSTANCE;
    }

    private PersistentIdentity<?> loadPersistent(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "events_login_id":
                return new PersistentLoginId();
            case "super_properties":
                return new PersistentSuperProperties();
            case "first_track_installation_with_callback":
                return new PersistentFirstTrackInstallationWithCallback();
            case "first_start":
                return new PersistentFirstStart();
            case "login_id_key":
                return new LoginIdKeyPersistent();
            case "user_ids":
                return new UserIdentityPersistent();
            case "visual_properties":
                return new PersistentVisualConfig();
            case "first_day":
                return new PersistentFirstDay();
            case "events_distinct_id":
                return new PersistentDistinctId(this.mContext);
            case "app_exit_data":
                return new PersistentAppExitData();
            case "sensorsdata_sdk_configuration":
                return new PersistentRemoteSDKConfig();
            case "first_track_installation":
                return new PersistentFirstTrackInstallation();
            case "app_end_data":
                return new PersistentAppEndData();
            case "daily_date":
                return new PersistentDailyDate();
            default:
                return null;
        }
    }

    public static void preInit(Context context) {
        if (INSTANCE == null) {
            synchronized (PersistentLoader.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PersistentLoader(context);
                }
            }
        }
    }

    public PersistentDistinctId getAnonymousIdPst() {
        return this.mAnonymousIdPst;
    }

    public PersistentAppEndData getAppEndDataPst() {
        return this.mAppEndDataPst;
    }

    public PersistentAppExitData getAppExitDataPst() {
        return this.mAppExitDataPst;
    }

    public PersistentDailyDate getDayDatePst() {
        return this.mDayDatePst;
    }

    public PersistentFirstDay getFirstDayPst() {
        return this.mFirstDayPst;
    }

    public PersistentFirstTrackInstallation getFirstInstallationPst() {
        return this.mFirstInstallationPst;
    }

    public PersistentFirstTrackInstallationWithCallback getFirstInstallationWithCallbackPst() {
        return this.mFirstInstallationWithCallbackPst;
    }

    public PersistentFirstStart getFirstStartPst() {
        return this.mFirstStartPst;
    }

    public LoginIdKeyPersistent getLoginIdKeyPst() {
        return this.mLoginIdKeyPst;
    }

    public PersistentLoginId getLoginIdPst() {
        return this.mLoginIdPst;
    }

    public PersistentRemoteSDKConfig getRemoteSDKConfig() {
        return this.mRemoteSDKConfig;
    }

    public PersistentSuperProperties getSuperPropertiesPst() {
        return this.mSuperPropertiesPst;
    }

    public UserIdentityPersistent getUserIdsPst() {
        return this.mUserIdsPst;
    }

    public PersistentVisualConfig getVisualConfigPst() {
        return this.mVisualConfigPst;
    }
}
