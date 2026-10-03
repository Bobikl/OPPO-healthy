package com.sensorsdata.analytics.android.sdk.core.business.session;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.plugin.encrypt.SAStoreManager;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SessionRelatedManager {
    private static volatile SessionRelatedManager mSessionRelatedManager;
    private long mLastEventTime;
    private String mSessionID;
    private long mStartTime;
    private final String SHARED_PREF_SESSION_CUTDATA = "sensorsdata.session.cutdata";
    public final String EVENT_SESSION_ID = "$event_session_id";
    private final String KEY_SESSION_ID = "sessionID";
    private final String KEY_START_TIME = "startTime";
    private final String KEY_LAST_EVENT_TIME = "lastEventTime";
    private long SESSION_LAST_INTERVAL_TIME = 300000;
    private final long SESSION_START_INTERVAL_TIME = 43200000;

    private SessionRelatedManager() {
        try {
            setSessionLastIntervalTime(AbstractSensorsDataAPI.getConfigOptions().getEventSessionTimeout());
            if (AbstractSensorsDataAPI.getConfigOptions().isEnableSession()) {
                readSessionData();
            } else {
                deleteSessionData();
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    private synchronized void createSessionData(long j2, boolean z) {
        this.mSessionID = UUID.randomUUID().toString();
        if (z) {
            this.mStartTime = j2;
        }
        this.mLastEventTime = Math.max(j2, this.mLastEventTime);
        SAStoreManager.getInstance().setString("sensorsdata.session.cutdata", getSessionDataPack());
    }

    private void deleteSessionData() {
        this.mSessionID = null;
        this.mStartTime = -1L;
        this.mLastEventTime = -1L;
        SAStoreManager.getInstance().remove("sensorsdata.session.cutdata");
    }

    public static SessionRelatedManager getInstance() {
        if (mSessionRelatedManager == null) {
            synchronized (SessionRelatedManager.class) {
                if (mSessionRelatedManager == null) {
                    mSessionRelatedManager = new SessionRelatedManager();
                }
            }
        }
        return mSessionRelatedManager;
    }

    private String getSessionDataPack() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sessionID", this.mSessionID);
            jSONObject.put("startTime", this.mStartTime);
            jSONObject.put("lastEventTime", this.mLastEventTime);
            return jSONObject.toString();
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    private synchronized void handleSessionState(long j2) {
        if (j2 <= 0) {
            return;
        }
        if (TextUtils.isEmpty(this.mSessionID) || j2 - this.mLastEventTime > this.SESSION_LAST_INTERVAL_TIME || j2 - this.mStartTime > 43200000) {
            createSessionData(j2, true);
        } else {
            updateSessionLastTime(j2);
        }
    }

    private void readSessionData() {
        String string = SAStoreManager.getInstance().getString("sensorsdata.session.cutdata", "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("sessionID")) {
                this.mSessionID = jSONObject.optString("sessionID");
            }
            if (jSONObject.has("startTime")) {
                this.mStartTime = jSONObject.optLong("startTime");
            }
            if (jSONObject.has("lastEventTime")) {
                this.mLastEventTime = jSONObject.optLong("lastEventTime");
            }
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    private void setSessionLastIntervalTime(int i) {
        if (i > 0) {
            this.SESSION_LAST_INTERVAL_TIME = ((long) i) * 1000;
        }
    }

    private void updateSessionLastTime(long j2) {
        this.mLastEventTime = j2;
        SAStoreManager.getInstance().setString("sensorsdata.session.cutdata", getSessionDataPack());
    }

    public String getSessionID() {
        return this.mSessionID;
    }

    public void handleEventOfSession(String str, JSONObject jSONObject, long j2) {
        if (AbstractSensorsDataAPI.getConfigOptions().isEnableSession()) {
            try {
                if (!"$AppEnd".equals(str)) {
                    handleSessionState(j2);
                    jSONObject.put("$event_session_id", this.mSessionID);
                } else if (j2 > this.mLastEventTime) {
                    this.mLastEventTime = j2;
                }
            } catch (JSONException e2) {
                SALog.printStackTrace(e2);
            }
        }
    }

    public void refreshSessionByTimer(long j2) {
        if (j2 - this.mLastEventTime > this.SESSION_LAST_INTERVAL_TIME) {
            createSessionData(j2, TextUtils.isEmpty(this.mSessionID));
        }
    }
}
