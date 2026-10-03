package com.sensorsdata.analytics.android.sdk.useridentity.h5identity;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.internal.beans.EventType;
import com.sensorsdata.analytics.android.sdk.useridentity.LoginIDAndKey;
import com.sensorsdata.analytics.android.sdk.useridentity.UserIdentityAPI;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class SignUpH5UserIdentityAPI extends H5UserIdentityAPI {
    private final EventType eventType;
    private final UserIdentityAPI mUserIdentityApi;

    public SignUpH5UserIdentityAPI(UserIdentityAPI userIdentityAPI, EventType eventType) {
        this.mUserIdentityApi = userIdentityAPI;
        this.eventType = eventType;
    }

    private boolean traversalSearch(String str) {
        Iterator<String> itKeys = this.mIdentityJson.keys();
        String str2 = "";
        int i = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next)) {
                String strOptString = this.mIdentityJson.optString(next);
                if (!TextUtils.isEmpty(strOptString) && strOptString.equals(str)) {
                    i++;
                    str2 = next;
                }
            }
        }
        if (i == 1) {
            return this.mUserIdentityApi.loginWithKeyBack(str2, str);
        }
        return false;
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.h5identity.H5UserIdentityAPI
    public boolean updateIdentities() {
        try {
            if (TextUtils.isEmpty(this.mEventObject.optString("identities"))) {
                if (!this.mUserIdentityApi.loginWithKeyBack(LoginIDAndKey.LOGIN_ID_KEY_DEFAULT, this.mEventObject.optString("distinct_id"))) {
                    return false;
                }
            } else if (this.mIdentityJson.has(this.mUserIdentityApi.getIdentitiesInstance().getLoginIDKey())) {
                String strOptString = this.mIdentityJson.optString(this.mUserIdentityApi.getIdentitiesInstance().getLoginIDKey());
                UserIdentityAPI userIdentityAPI = this.mUserIdentityApi;
                if (!userIdentityAPI.loginWithKeyBack(userIdentityAPI.getIdentitiesInstance().getLoginIDKey(), strOptString)) {
                    return false;
                }
            } else {
                String strOptString2 = this.mEventObject.optString("login_id");
                if (!TextUtils.isEmpty(strOptString2)) {
                    String[] strArrSplit = strOptString2.split("\\+");
                    if (strArrSplit.length == 2) {
                        String str = strArrSplit[0];
                        String str2 = strArrSplit[1];
                        String strOptString3 = this.mIdentityJson.optString(str);
                        if (this.mIdentityJson.has(str) && !TextUtils.isEmpty(strOptString3) && strOptString3.equals(str2) && !this.mUserIdentityApi.loginWithKeyBack(str, str2)) {
                            return false;
                        }
                    } else if (!traversalSearch(strOptString2)) {
                        return false;
                    }
                }
            }
            String loginId = this.mUserIdentityApi.getIdentitiesInstance().getLoginId();
            if (TextUtils.isEmpty(loginId)) {
                this.mEventObject.put("login_id", loginId);
            }
            mergeIdentities(this.mUserIdentityApi.getIdentities(this.eventType));
            return true;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return false;
        }
    }
}
