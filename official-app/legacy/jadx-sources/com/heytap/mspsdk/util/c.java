package com.heytap.mspsdk.util;

import android.os.Bundle;
import com.heytap.mspsdk.constants.Constants;
import com.opos.process.bridge.client.BaseActivityClient;
import com.opos.process.bridge.client.BaseProviderClient;
import com.opos.process.bridge.client.BaseServiceClient;

/* JADX INFO: loaded from: classes19.dex */
public class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Bundle a(T t) {
        if (t instanceof BaseProviderClient) {
            return ((BaseProviderClient) t).getData();
        }
        if (t instanceof BaseServiceClient) {
            return ((BaseServiceClient) t).getData();
        }
        return t instanceof BaseActivityClient ? ((BaseActivityClient) t).getData() : new Bundle();
    }

    public static <T> Bundle b(T t, Bundle bundle) {
        if (bundle == null) {
            bundle = a(t);
        }
        bundle.putBundle(Constants.BUNDLE_KEY_MSP_SDK_COMMON_BUNDLE, c(bundle.getString(Constants.BUNDLE_KEY_MSP_SDK_KIT_NAME)));
        return bundle;
    }

    public static Bundle c(String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.BUNDLE_KEY_MSP_SDK_VERSION_CODE, 2000113);
        bundle.putString(Constants.BUNDLE_KEY_MSP_SDK_VERSION_NAME, "2.0.1.13");
        bundle.putString(Constants.BUNDLE_KEY_MSP_SDK_CALLING_PKG, com.heytap.mspsdk.core.f.d().b().getPackageName());
        bundle.putString(Constants.BUNDLE_KEY_MSP_SDK_KIT_NAME, str);
        bundle.putBundle(Constants.BUNDLE_KEY_MSP_SDK_IPC_TIME_RECORDER, new Bundle());
        return bundle;
    }
}
