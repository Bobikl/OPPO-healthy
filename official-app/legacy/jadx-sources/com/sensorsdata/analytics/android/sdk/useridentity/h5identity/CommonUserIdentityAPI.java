package com.sensorsdata.analytics.android.sdk.useridentity.h5identity;

import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.useridentity.Identities;
import com.sensorsdata.analytics.android.sdk.useridentity.UserIdentityAPI;

/* JADX INFO: loaded from: classes10.dex */
public class CommonUserIdentityAPI extends H5UserIdentityAPI {
    UserIdentityAPI mUserIdentityAPI;

    public CommonUserIdentityAPI(UserIdentityAPI userIdentityAPI) {
        this.mUserIdentityAPI = userIdentityAPI;
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.h5identity.H5UserIdentityAPI
    public boolean updateIdentities() {
        try {
            mergeIdentities(this.mUserIdentityAPI.getIdentitiesInstance().getIdentities(Identities.State.DEFAULT));
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        this.mUserIdentityAPI.trackH5Notify(this.mEventObject);
        return true;
    }
}
