package com.platform.usercenter.network.header;

import android.content.Context;
import com.platform.usercenter.network.data.HeaderOpenIdBean;
import com.platform.usercenter.tools.sim.TelEntity;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface IBizHeaderManager {
    String extApp();

    String fromPkg(Context context);

    int fromPkgVersion(Context context, String str);

    default Map<String, String> getAppMap() {
        return null;
    }

    default HeaderOpenIdBean getHeaderOpenId(Context context) {
        return null;
    }

    default String getImei(Context context) {
        return null;
    }

    default String getOperators(Context context) {
        return "";
    }

    default String getSerialNum() {
        return "";
    }

    default long getSerialNumberForUser(Context context) {
        return 0L;
    }

    default TelEntity getTelEntity(Context context, int i) {
        return null;
    }

    default String getWifiSsid() {
        return null;
    }

    String instantVerson();

    String pushId();

    String userDeviceID();
}
