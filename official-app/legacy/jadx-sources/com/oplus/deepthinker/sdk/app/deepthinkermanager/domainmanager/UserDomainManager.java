package com.oplus.deepthinker.sdk.app.deepthinkermanager.domainmanager;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.oplus.aiunit.vision.g5g;
import com.oplus.aiunit.vision.vz9;
import com.oplus.deepthinker.platform.server.IDeepThinkerBridge;
import com.oplus.deepthinker.sdk.app.ServiceHolder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class UserDomainManager implements vz9 {
    public ServiceHolder a;

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.deepthinkermanager.domainmanager.UserDomainManager$1, reason: invalid class name */
    class AnonymousClass1 extends TypeToken<HashMap<String, Double>> {
    }

    public UserDomainManager(ServiceHolder serviceHolder) {
        this.a = serviceHolder;
    }

    @Override // com.oplus.aiunit.vision.vz9
    public Map<Integer, Integer> a(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            g5g.h("UserDomainManager", "checkLabelAvailable: empty labelIds");
            return null;
        }
        try {
            IDeepThinkerBridge iDeepThinkerBridgeB = b();
            if (iDeepThinkerBridgeB != null) {
                Bundle bundle = new Bundle();
                bundle.putIntArray("detail", iArr);
                Bundle bundleCall = iDeepThinkerBridgeB.call("ability_userprofile", "check_label_available", bundle);
                if (bundleCall != null && bundleCall.containsKey("query_result_user_profile")) {
                    String string = bundleCall.getString("query_result_user_profile");
                    if (!TextUtils.isEmpty(string)) {
                        g5g.e("UserDomainManager", "checkLabelAvailable:" + string);
                        return (Map) new Gson().fromJson(string, new TypeToken<HashMap<Integer, Integer>>() { // from class: com.oplus.deepthinker.sdk.app.deepthinkermanager.domainmanager.UserDomainManager.2
                        }.getType());
                    }
                }
            }
        } catch (RemoteException e2) {
            g5g.c("UserDomainManager", "checkLabelAvailable: RemoteException:" + e2);
        } catch (JsonSyntaxException e3) {
            g5g.c("UserDomainManager", "checkLabelAvailable: JsonSyntaxException:" + e3);
        }
        return null;
    }

    public final IDeepThinkerBridge b() {
        return this.a.a();
    }
}
