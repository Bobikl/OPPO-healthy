package com.sensorsdata.analytics.android.sdk.useridentity.h5identity;

import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.useridentity.UserIdentityAPI;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class UnbindIDH5UserIdentityAPI extends H5UserIdentityAPI {
    private final UserIdentityAPI mUserIdentityApi;

    public UnbindIDH5UserIdentityAPI(UserIdentityAPI userIdentityAPI) {
        this.mUserIdentityApi = userIdentityAPI;
    }

    @Override // com.sensorsdata.analytics.android.sdk.useridentity.h5identity.H5UserIdentityAPI
    public boolean updateIdentities() {
        try {
            Iterator<String> itKeys = this.mIdentityJson.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.mUserIdentityApi.getIdentitiesInstance().remove(next, this.mIdentityJson.optString(next));
            }
            this.mEventObject.put("identities", this.mIdentityJson);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        return super.updateIdentities();
    }
}
