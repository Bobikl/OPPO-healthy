package com.sensorsdata.analytics.android.sdk.useridentity;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.rpc.SensorsDataContentObserver;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbAdapter;
import com.sensorsdata.analytics.android.sdk.data.persistent.LoginIdKeyPersistent;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentDistinctId;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentLoader;
import com.sensorsdata.analytics.android.sdk.data.persistent.PersistentLoginId;
import com.sensorsdata.analytics.android.sdk.data.persistent.UserIdentityPersistent;
import com.sensorsdata.analytics.android.sdk.util.SADataHelper;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class Identities {
    public static final String ANDROID_ID = "$identity_android_id";
    public static final String ANDROID_UUID = "$identity_android_uuid";
    public static final String ANONYMOUS_ID = "$identity_anonymous_id";
    public static final String COOKIE_ID = "$identity_cookie_id";
    public static final String IDENTITIES_KEY = "identities";
    private static final String TAG = "SA.Identities";
    private String mAndroidId;
    private PersistentDistinctId mAnonymousId;
    private JSONObject mIdentities;
    private final LoginIDAndKey mLoginIDAndKey = new LoginIDAndKey();
    private JSONObject mLoginIdentities;
    private JSONObject mUnbindIdentities;

    /* JADX INFO: renamed from: com.sensorsdata.analytics.android.sdk.useridentity.Identities$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$sensorsdata$analytics$android$sdk$useridentity$Identities$SpecialID;
        static final /* synthetic */ int[] $SwitchMap$com$sensorsdata$analytics$android$sdk$useridentity$Identities$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$sensorsdata$analytics$android$sdk$useridentity$Identities$State = iArr;
            try {
                iArr[State.LOGIN_KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$sensorsdata$analytics$android$sdk$useridentity$Identities$State[State.REMOVE_KEYID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$sensorsdata$analytics$android$sdk$useridentity$Identities$State[State.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SpecialID.values().length];
            $SwitchMap$com$sensorsdata$analytics$android$sdk$useridentity$Identities$SpecialID = iArr2;
            try {
                iArr2[SpecialID.ANONYMOUS_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$sensorsdata$analytics$android$sdk$useridentity$Identities$SpecialID[SpecialID.ANDROID_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$sensorsdata$analytics$android$sdk$useridentity$Identities$SpecialID[SpecialID.ANDROID_UUID.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class Local {
        public static String getIdentitiesFromLocal() {
            try {
                UserIdentityPersistent userIdsPst = PersistentLoader.getInstance().getUserIdsPst();
                if (userIdsPst != null) {
                    return DbAdapter.decodeIdentities(userIdsPst.get());
                }
                return null;
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
                return null;
            }
        }

        public static String getLoginIdFromLocal() {
            try {
                PersistentLoginId loginIdPst = PersistentLoader.getInstance().getLoginIdPst();
                return loginIdPst == null ? "" : loginIdPst.get();
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
                return "";
            }
        }

        public static String getLoginIdKeyFromLocal() {
            try {
                LoginIdKeyPersistent loginIdKeyPst = PersistentLoader.getInstance().getLoginIdKeyPst();
                return loginIdKeyPst == null ? "" : loginIdKeyPst.get();
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
                return "";
            }
        }
    }

    public enum SpecialID {
        ANONYMOUS_ID,
        ANDROID_ID,
        ANDROID_UUID
    }

    public enum State {
        LOGIN_KEY,
        REMOVE_KEYID,
        DEFAULT
    }

    private void clearIdentities(List<String> list, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                if (!list.contains(itKeys.next())) {
                    itKeys.remove();
                }
            }
        }
    }

    private JSONObject createIdentities(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || jSONObject.length() == 0) {
            jSONObject = new JSONObject();
            if (str != null) {
                jSONObject.put(ANONYMOUS_ID, str);
            }
            if (SensorsDataUtils.isValidAndroidId(this.mAndroidId)) {
                jSONObject.put(ANDROID_ID, this.mAndroidId);
            } else {
                jSONObject.put(ANDROID_UUID, str);
            }
        } else if (jSONObject.has(ANONYMOUS_ID)) {
            jSONObject.put(ANONYMOUS_ID, str);
        }
        return jSONObject;
    }

    private JSONObject getCacheIdentities() throws JSONException {
        String identities = DbAdapter.getInstance().getIdentities();
        if (TextUtils.isEmpty(identities)) {
            return null;
        }
        return new JSONObject(identities);
    }

    private JSONObject getDefaultIdentities() {
        try {
            return getCacheIdentities();
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    private JSONObject getInitIdentities() throws JSONException {
        String identitiesFromLocal = Local.getIdentitiesFromLocal();
        if (TextUtils.isEmpty(identitiesFromLocal)) {
            return null;
        }
        return new JSONObject(identitiesFromLocal);
    }

    private void initLoginIDAndKeyIdentities(String str, String str2, JSONObject jSONObject) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            if (jSONObject.has(str)) {
                clearIdentities(Arrays.asList(ANDROID_ID, ANDROID_UUID, ANONYMOUS_ID), jSONObject);
                this.mLoginIDAndKey.setLoginIDKey("");
                return;
            }
            return;
        }
        if (!jSONObject.has(str)) {
            jSONObject.put(Local.getLoginIdKeyFromLocal(), Local.getLoginIdFromLocal());
            clearIdentities(Arrays.asList(ANDROID_ID, ANDROID_UUID, this.mLoginIDAndKey.getLoginIDKey()), jSONObject);
        } else {
            if (jSONObject.optString(this.mLoginIDAndKey.getLoginIDKey()).equals(str2)) {
                return;
            }
            jSONObject.put(Local.getLoginIdKeyFromLocal(), Local.getLoginIdFromLocal());
            clearIdentities(Arrays.asList(ANDROID_ID, ANDROID_UUID, this.mLoginIDAndKey.getLoginIDKey()), jSONObject);
        }
    }

    private boolean isInValid(String str, String str2, String str3) {
        return !this.mLoginIDAndKey.setLoginKeyAndID(str, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    private boolean isInvalidBusinessID(String str, String str2, boolean z) {
        boolean z2;
        if (z) {
            if (isRemoveKeyValid(str) && SADataHelper.assertPropertyKey(str)) {
                z2 = false;
            } else {
                SALog.i(TAG, "unbind key is invalid, key = " + str);
                z2 = true;
            }
        } else if (isKeyValid(str) && SADataHelper.assertPropertyKey(str)) {
            z2 = false;
        } else {
            SALog.i(TAG, "bind key is invalid, key = " + str);
            z2 = true;
        }
        try {
            SADataHelper.assertDistinctId(str2);
            return z2;
        } catch (Exception e2) {
            SALog.i(TAG, e2);
            return true;
        }
    }

    private boolean isKeyValid(String str) {
        return (ANONYMOUS_ID.equals(str) || ANDROID_UUID.equals(str) || ANDROID_ID.equals(str) || this.mLoginIDAndKey.getLoginIDKey().equals(str) || LoginIDAndKey.LOGIN_ID_KEY_DEFAULT.equals(str)) ? false : true;
    }

    private boolean isRemoveKeyValid(String str) {
        return (ANONYMOUS_ID.equals(str) || LoginIDAndKey.LOGIN_ID_KEY_DEFAULT.equals(str)) ? false : true;
    }

    private boolean isValidIdentities(JSONObject jSONObject) {
        return jSONObject != null && (jSONObject.has(ANDROID_ID) || jSONObject.has(ANDROID_UUID));
    }

    private JSONObject resetIdentities(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (!jSONObject.has(ANDROID_UUID) && !jSONObject.has(ANDROID_ID)) {
            if (SensorsDataUtils.isValidAndroidId(this.mAndroidId)) {
                jSONObject.put(ANDROID_ID, this.mAndroidId);
            } else {
                jSONObject.put(ANDROID_UUID, this.mAnonymousId.get());
            }
        }
        return jSONObject;
    }

    private void saveIdentities() {
        if (!isValidIdentities(this.mIdentities)) {
            try {
                this.mIdentities = resetIdentities(this.mIdentities);
            } catch (JSONException unused) {
                SALog.i(TAG, "reset identities failed!");
            }
        }
        DbAdapter.getInstance().commitIdentities(this.mIdentities.toString());
    }

    public JSONObject getIdentities(State state) {
        int i = AnonymousClass1.$SwitchMap$com$sensorsdata$analytics$android$sdk$useridentity$Identities$State[state.ordinal()];
        if (i == 1) {
            return this.mLoginIdentities;
        }
        if (i == 2) {
            JSONObject jSONObject = this.mUnbindIdentities;
            if (jSONObject != null) {
                return jSONObject;
            }
        } else if (i == 3) {
            JSONObject jSONObject2 = this.mIdentities;
            return (jSONObject2 == null || jSONObject2.length() == 0) ? getDefaultIdentities() : this.mIdentities;
        }
        return null;
    }

    public String getJointLoginID() {
        return this.mLoginIDAndKey.getJointLoginID();
    }

    public String getLoginIDKey() {
        return this.mLoginIDAndKey.getLoginIDKey();
    }

    public String getLoginId() {
        return this.mLoginIDAndKey.getLoginId();
    }

    public void init(String str, String str2) throws JSONException {
        String loginIdKeyFromLocal = Local.getLoginIdKeyFromLocal();
        String loginIdFromLocal = Local.getLoginIdFromLocal();
        this.mLoginIDAndKey.init(loginIdKeyFromLocal);
        this.mAndroidId = str;
        this.mAnonymousId = PersistentLoader.getInstance().getAnonymousIdPst();
        JSONObject jSONObjectCreateIdentities = createIdentities(getInitIdentities(), str2);
        initLoginIDAndKeyIdentities(loginIdKeyFromLocal, loginIdFromLocal, jSONObjectCreateIdentities);
        this.mIdentities = jSONObjectCreateIdentities;
        saveIdentities();
    }

    public void mergeIdentities(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!this.mIdentities.has(next)) {
                this.mIdentities.put(next, jSONObject.optString(next));
            }
        }
        saveIdentities();
    }

    public boolean remove(String str, String str2) throws JSONException {
        if (isInvalidBusinessID(str, str2, true)) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        this.mUnbindIdentities = jSONObject;
        jSONObject.put(str, str2);
        if (!(ANDROID_ID.equals(str) || ANDROID_UUID.equals(str)) && this.mIdentities.has(str) && this.mIdentities.optString(str).equals(str2)) {
            this.mIdentities.remove(str);
        }
        if ((str + "+" + str2).equals(getJointLoginID())) {
            this.mIdentities.remove(str);
            this.mLoginIDAndKey.removeLoginKeyAndID();
        }
        saveIdentities();
        return true;
    }

    public void removeLoginKeyAndID() {
        this.mLoginIdentities = new JSONObject();
        clearIdentities(Arrays.asList(ANDROID_ID, ANDROID_UUID), this.mIdentities);
        SensorsDataContentObserver.State state = SensorsDataContentObserver.State.LOGOUT;
        if (!state.isObserverCalled) {
            this.mLoginIDAndKey.removeLoginKeyAndID();
        }
        saveIdentities();
        state.isObserverCalled = false;
    }

    public boolean update(String str, String str2) throws JSONException {
        if (isInvalidBusinessID(str, str2, false)) {
            return false;
        }
        this.mIdentities.put(str, str2);
        saveIdentities();
        return true;
    }

    public void updateIDKeyAndValue(String str) throws JSONException {
        if (this.mIdentities.has(ANDROID_ID)) {
            this.mIdentities.put(ANDROID_ID, str);
        } else if (this.mIdentities.has(ANDROID_UUID)) {
            this.mIdentities.put(ANDROID_UUID, str);
        }
        saveIdentities();
    }

    public void updateIdentities() {
        try {
            this.mIdentities = getCacheIdentities();
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    public boolean updateLoginKeyAndID(String str, String str2, String str3) throws Exception {
        if (isInValid(str, str2, str3)) {
            return false;
        }
        this.mIdentities.put(str, str2);
        this.mLoginIdentities = new JSONObject(this.mIdentities.toString());
        clearIdentities(Arrays.asList(ANDROID_ID, ANDROID_UUID, str), this.mIdentities);
        saveIdentities();
        return true;
    }

    public void updateSpecialIDKeyAndValue(SpecialID specialID, String str) throws JSONException {
        int i = AnonymousClass1.$SwitchMap$com$sensorsdata$analytics$android$sdk$useridentity$Identities$SpecialID[specialID.ordinal()];
        if (i == 1) {
            this.mIdentities.put(ANONYMOUS_ID, str);
        } else if (i == 2) {
            this.mIdentities.put(ANDROID_ID, str);
        } else if (i == 3) {
            this.mIdentities.put(ANDROID_UUID, str);
        }
        saveIdentities();
    }
}
