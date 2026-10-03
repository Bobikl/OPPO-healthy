package com.sensorsdata.analytics.android.sdk.useridentity;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.core.rpc.SensorsDataContentObserver;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentDistinctId;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentLoader;
import com.sensorsdata.analytics.android.sdk.internal.beans.EventType;
import com.sensorsdata.analytics.android.sdk.listener.SAEventListener;
import com.sensorsdata.analytics.android.sdk.monitor.TrackMonitor;
import com.sensorsdata.analytics.android.sdk.useridentity.h5identity.H5UserIdentityStrategy;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class UserIdentityAPI implements IUserIdentityAPI {
    private static final String TAG = "SA.UserIdentityAPI";
    private final PersistentDistinctId mAnonymousId;
    private H5UserIdentityStrategy mH5UserIdentityStrategy;
    private final Identities mIdentitiesInstance;
    private String mLoginIdValue;
    private final SAContextManager mSAContextManager;

    public UserIdentityAPI(SAContextManager sAContextManager) {
        this.mLoginIdValue = null;
        this.mSAContextManager = sAContextManager;
        PersistentDistinctId anonymousIdPst = PersistentLoader.getInstance().getAnonymousIdPst();
        this.mAnonymousId = anonymousIdPst;
        Identities identities = new Identities();
        this.mIdentitiesInstance = identities;
        try {
            identities.init(SensorsDataUtils.getIdentifier(sAContextManager.getContext()), anonymousIdPst.get());
            this.mLoginIdValue = identities.getJointLoginID();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void bind(String str, String str2) {
        bindBack(str, str2);
    }

    public boolean bindBack(String str, String str2) {
        try {
            return this.mIdentitiesInstance.update(str, str2);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return false;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public String getAnonymousId() {
        String str;
        try {
            synchronized (this.mAnonymousId) {
                str = this.mAnonymousId.get();
            }
            return str;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public String getDistinctId() {
        try {
            String loginId = getLoginId();
            return !TextUtils.isEmpty(loginId) ? loginId : getAnonymousId();
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    public JSONObject getIdentities(EventType eventType) {
        if (EventType.TRACK_SIGNUP == eventType) {
            return this.mIdentitiesInstance.getIdentities(Identities.State.LOGIN_KEY);
        }
        return EventType.TRACK_ID_UNBIND == eventType ? this.mIdentitiesInstance.getIdentities(Identities.State.REMOVE_KEYID) : this.mIdentitiesInstance.getIdentities(Identities.State.DEFAULT);
    }

    public Identities getIdentitiesInstance() {
        return this.mIdentitiesInstance;
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public String getLoginId() {
        String strOptString = "";
        try {
            if (!AppInfoUtils.isTaskExecuteThread()) {
                return this.mLoginIdValue;
            }
            String jointLoginID = this.mIdentitiesInstance.getJointLoginID();
            if (!TextUtils.isEmpty(jointLoginID)) {
                return jointLoginID;
            }
            String loginIDKey = this.mIdentitiesInstance.getLoginIDKey();
            if (TextUtils.isEmpty(jointLoginID)) {
                loginIDKey = LoginIDAndKey.LOGIN_ID_KEY_DEFAULT;
            }
            JSONObject identities = this.mIdentitiesInstance.getIdentities(Identities.State.LOGIN_KEY);
            if (identities != null) {
                strOptString = identities.optString(loginIDKey);
            }
            return strOptString;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return "";
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void identify(String str) {
        try {
            SALog.i(TAG, "identify is called");
            synchronized (this.mAnonymousId) {
                try {
                    if (!str.equals(this.mAnonymousId.get())) {
                        this.mAnonymousId.commit(str);
                        this.mIdentitiesInstance.updateSpecialIDKeyAndValue(Identities.SpecialID.ANONYMOUS_ID, str);
                        if (this.mSAContextManager.getEventListenerList() != null) {
                            Iterator<SAEventListener> it = this.mSAContextManager.getEventListenerList().iterator();
                            while (it.hasNext()) {
                                try {
                                    it.next().identify();
                                } catch (Exception e2) {
                                    SALog.printStackTrace(e2);
                                }
                            }
                        }
                        TrackMonitor.getInstance().callIdentify(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void login(String str) {
        loginWithKeyBack(LoginIDAndKey.LOGIN_ID_KEY_DEFAULT, str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void loginWithKey(String str, String str2) {
        loginWithKeyBack(str, str2);
    }

    public boolean loginWithKeyBack(String str, String str2) {
        try {
            boolean zUpdateLoginKeyAndID = this.mIdentitiesInstance.updateLoginKeyAndID(str, str2, getAnonymousId());
            if (!zUpdateLoginKeyAndID) {
                return zUpdateLoginKeyAndID;
            }
            if (this.mSAContextManager.getEventListenerList() != null) {
                Iterator<SAEventListener> it = this.mSAContextManager.getEventListenerList().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().login();
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            }
            TrackMonitor.getInstance().callLogin(this.mIdentitiesInstance.getJointLoginID());
            return zUpdateLoginKeyAndID;
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
            return false;
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void logout() {
        try {
            SensorsDataContentObserver.State.LOGOUT.isDid = true;
            SensorsDataContentObserver.State.LOGIN.isDid = false;
            JSONObject identities = this.mIdentitiesInstance.getIdentities(Identities.State.DEFAULT);
            boolean z = !TextUtils.isEmpty(this.mIdentitiesInstance.getLoginId());
            if (!z) {
                if (identities == null) {
                    return;
                }
                if (identities.length() == 1 && (identities.has(Identities.ANDROID_ID) || identities.has(Identities.ANDROID_UUID))) {
                    return;
                }
            }
            SALog.i(TAG, "logout is called");
            this.mIdentitiesInstance.removeLoginKeyAndID();
            if (z) {
                if (this.mSAContextManager.getEventListenerList() != null) {
                    Iterator<SAEventListener> it = this.mSAContextManager.getEventListenerList().iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().logout();
                        } catch (Exception e2) {
                            SALog.printStackTrace(e2);
                        }
                    }
                }
                TrackMonitor.getInstance().callLogout();
            }
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
        }
        SALog.i(TAG, "Clean loginId");
    }

    public boolean mergeH5Identities(EventType eventType, JSONObject jSONObject) {
        if (this.mH5UserIdentityStrategy == null) {
            this.mH5UserIdentityStrategy = new H5UserIdentityStrategy(this);
        }
        return this.mH5UserIdentityStrategy.processH5UserIdentity(eventType, jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void resetAnonymousId() {
        try {
            synchronized (this.mAnonymousId) {
                SALog.i(TAG, "resetAnonymousId is called");
                String identifier = SensorsDataUtils.getIdentifier(this.mSAContextManager.getContext());
                if (identifier.equals(this.mAnonymousId.get())) {
                    SALog.i(TAG, "DistinctId not change");
                    return;
                }
                if (!SensorsDataUtils.isValidAndroidId(identifier)) {
                    identifier = UUID.randomUUID().toString();
                }
                this.mAnonymousId.commit(identifier);
                if (this.mIdentitiesInstance.getIdentities(Identities.State.DEFAULT).has(Identities.ANONYMOUS_ID)) {
                    this.mIdentitiesInstance.updateSpecialIDKeyAndValue(Identities.SpecialID.ANONYMOUS_ID, this.mAnonymousId.get());
                }
                if (this.mSAContextManager.getEventListenerList() != null) {
                    Iterator<SAEventListener> it = this.mSAContextManager.getEventListenerList().iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().resetAnonymousId();
                        } catch (Exception e2) {
                            SALog.printStackTrace(e2);
                        }
                    }
                }
                TrackMonitor.getInstance().callResetAnonymousId(identifier);
            }
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void resetAnonymousIdentity(String str) {
        try {
            if (!TextUtils.isEmpty(this.mLoginIdValue)) {
                SALog.i(TAG, "resetAnonymousIdentity 需退出登录后调用");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                str = UUID.randomUUID().toString();
            }
            this.mAnonymousId.commit(str);
            this.mIdentitiesInstance.updateIDKeyAndValue(str);
            if (this.mSAContextManager.getEventListenerList() != null) {
                Iterator<SAEventListener> it = this.mSAContextManager.getEventListenerList().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().resetAnonymousId();
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            }
            TrackMonitor.getInstance().callResetAnonymousId(str);
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
        }
    }

    public void trackH5Notify(JSONObject jSONObject) {
        try {
            if (this.mSAContextManager.getEventListenerList() != null) {
                Iterator<SAEventListener> it = this.mSAContextManager.getEventListenerList().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().trackEvent(jSONObject);
                    } catch (Exception e2) {
                        SALog.printStackTrace(e2);
                    }
                }
            }
        } catch (Exception e3) {
            SALog.printStackTrace(e3);
        }
        TrackMonitor.getInstance().callTrack(jSONObject);
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void unbind(String str, String str2) {
        unbindBack(str, str2);
    }

    public boolean unbindBack(String str, String str2) {
        try {
            return this.mIdentitiesInstance.remove(str, str2);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return false;
        }
    }

    public void updateLoginId(String str, String str2) {
        this.mLoginIdValue = LoginIDAndKey.jointLoginID(str, str2);
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void login(String str, JSONObject jSONObject) {
        loginWithKeyBack(LoginIDAndKey.LOGIN_ID_KEY_DEFAULT, str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public void loginWithKey(String str, String str2, JSONObject jSONObject) {
        loginWithKeyBack(str, str2);
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.IUserIdentityAPI
    public JSONObject getIdentities() {
        return this.mIdentitiesInstance.getIdentities(Identities.State.DEFAULT);
    }
}
