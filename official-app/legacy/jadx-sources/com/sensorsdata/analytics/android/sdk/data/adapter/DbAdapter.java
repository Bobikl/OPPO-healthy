package com.sensorsdata.analytics.android.sdk.data.adapter;

import android.content.ContentValues;
import com.sensorsdata.analytics.android.sdk.SAConfigOptions;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentLoader;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentRemoteSDKConfig;
import com.sensorsdata.analytics.android.sdk.util.Base64Coder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class DbAdapter {
    private static DbAdapter instance;
    private final DbParams mDbParams;
    private DataOperation mPersistentOperation;
    private DataOperation mTrackEventOperation;

    private DbAdapter(SAContextManager sAContextManager) {
        this.mDbParams = DbParams.getInstance(sAContextManager.getContext().getPackageName());
        SAConfigOptions sAConfigOptions = sAContextManager.getInternalConfigs().saConfigOptions;
        if (sAConfigOptions.isEnableEncrypt()) {
            this.mTrackEventOperation = new EncryptDataOperation(sAContextManager.getContext().getApplicationContext());
        } else if (sAConfigOptions.isTransportEncrypt()) {
            this.mTrackEventOperation = new TransportEncryption(sAContextManager.getContext().getApplicationContext());
        } else {
            this.mTrackEventOperation = new EventDataOperation(sAContextManager.getContext().getApplicationContext());
        }
        this.mPersistentOperation = new PersistentDataOperation(sAContextManager.getContext().getApplicationContext());
    }

    public static String decodeIdentities(String str) {
        if (str == null) {
            return null;
        }
        return Base64Coder.decodeString(str.substring(str.indexOf(":") + 1));
    }

    public static DbAdapter getInstance(SAContextManager sAContextManager) {
        if (instance == null) {
            instance = new DbAdapter(sAContextManager);
        }
        return instance;
    }

    public void addChannelEvent(String str) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(DbParams.KEY_CHANNEL_EVENT_NAME, str);
            this.mTrackEventOperation.insertData(this.mDbParams.getChannelPersistentUri(), contentValues);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public int addJSON(JSONObject jSONObject) {
        int iInsertData = this.mTrackEventOperation.insertData(this.mDbParams.getEventUri(), jSONObject);
        return iInsertData == 0 ? this.mTrackEventOperation.queryDataCount(this.mDbParams.getEventUri(), 2) : iInsertData;
    }

    public int cleanupEvents(JSONArray jSONArray, boolean z) {
        this.mTrackEventOperation.deleteData(this.mDbParams.getEventUri(), jSONArray);
        return this.mTrackEventOperation.queryDataCount(this.mDbParams.getEventUri(), z ? 1 : 0);
    }

    public void commitActivityCount(int i) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getActivityStartCountUri(), new JSONObject().put("value", i));
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void commitAppExitData(String str) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getAppExitDataUri(), new JSONObject().put("value", str));
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void commitAppStartTime(long j2) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getAppStartTimeUri(), new JSONObject().put("value", j2));
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void commitIdentities(String str) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getUserIdentities(), new JSONObject().put("value", "Base64:" + Base64Coder.encodeString(str)));
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void commitLoginId(String str) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getLoginIdUri(), new JSONObject().put("value", str));
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void commitLoginIdKey(String str) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getLoginIdKeyUri(), new JSONObject().put("value", str));
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void commitPushID(String str, String str2) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getPushIdUri(), new JSONObject().put(DbParams.PUSH_ID_KEY, str).put(DbParams.PUSH_ID_VALUE, str2));
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void commitRemoteConfig(String str) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getRemoteConfigUri(), new JSONObject().put("value", str));
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void commitSessionIntervalTime(int i) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getSessionTimeUri(), new JSONObject().put("value", i));
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void commitSubProcessFlushState(boolean z) {
        try {
            this.mPersistentOperation.insertData(this.mDbParams.getSubProcessUri(), new JSONObject().put("value", z));
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void deleteAllEvents() {
        this.mTrackEventOperation.deleteData(this.mDbParams.getEventUri(), "DB_DELETE_ALL");
    }

    public String[] generateDataString(String str, int i, boolean z) {
        try {
            return this.mTrackEventOperation.queryData(this.mDbParams.getEventUri(), z, i);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    public int getActivityCount() {
        String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getActivityStartCountUri(), 1);
        if (strArrQueryData == null || strArrQueryData.length <= 0) {
            return 0;
        }
        return Integer.parseInt(strArrQueryData[0]);
    }

    public String getAppExitData() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getAppExitDataUri(), 1);
            return (strArrQueryData == null || strArrQueryData.length <= 0) ? "" : strArrQueryData[0];
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    public long getAppStartTime() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getAppStartTimeUri(), 1);
            if (strArrQueryData == null || strArrQueryData.length <= 0) {
                return 0L;
            }
            return Long.parseLong(strArrQueryData[0]);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return 0L;
        }
    }

    public String getIdentities() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getUserIdentities(), 1);
            if (strArrQueryData == null || strArrQueryData.length <= 0) {
                return null;
            }
            return decodeIdentities(strArrQueryData[0]);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    public String getLoginId() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getLoginIdUri(), 1);
            return (strArrQueryData == null || strArrQueryData.length <= 0) ? "" : strArrQueryData[0];
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    public String getLoginIdKey() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getLoginIdKeyUri(), 1);
            return (strArrQueryData == null || strArrQueryData.length <= 0) ? "" : strArrQueryData[0];
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    public String getPushId(String str) {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getPushIdUri().buildUpon().appendQueryParameter(DbParams.PUSH_ID_KEY, str).build(), 1);
            return (strArrQueryData == null || strArrQueryData.length <= 0) ? "" : strArrQueryData[0];
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    public String getRemoteConfig() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getRemoteConfigUri(), 1);
            return (strArrQueryData == null || strArrQueryData.length <= 0) ? "" : strArrQueryData[0];
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    public String getRemoteConfigFromLocal() {
        try {
            PersistentRemoteSDKConfig remoteSDKConfig = PersistentLoader.getInstance().getRemoteSDKConfig();
            return remoteSDKConfig == null ? "" : remoteSDKConfig.get();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    public int getSessionIntervalTime() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getSessionTimeUri(), 1);
            if (strArrQueryData != null && strArrQueryData.length > 0) {
                return Integer.parseInt(strArrQueryData[0]);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        return 0;
    }

    public boolean isFirstChannelEvent(String[] strArr) {
        try {
            return this.mTrackEventOperation.queryDataCount(this.mDbParams.getChannelPersistentUri(), null, "event_name = ? or event_name = ? ", strArr, null) <= 0;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return false;
        }
    }

    public boolean isSubProcessFlushing() {
        try {
            String[] strArrQueryData = this.mPersistentOperation.queryData(this.mDbParams.getSubProcessUri(), 1);
            return strArrQueryData == null || strArrQueryData.length <= 0 || Integer.parseInt(strArrQueryData[0]) == 1;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        return true;
    }

    public void removePushId(String str) {
        this.mPersistentOperation.deleteData(this.mDbParams.getPushIdUri(), str);
    }

    public static DbAdapter getInstance() {
        DbAdapter dbAdapter = instance;
        if (dbAdapter != null) {
            return dbAdapter;
        }
        throw new IllegalStateException("The static method getInstance(SAContextManager saContextManager) should be called before calling getInstance()");
    }
}
