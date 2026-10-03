package com.oplus.omes.srp.sysintegrity.cmm;

import android.content.Context;
import android.os.Bundle;
import com.heytap.mspsdk.MspSdk;
import com.heytap.mspsdk.constants.Constants;
import com.heytap.mspsdk.exception.MspSdkException;
import com.oplus.omes.srp.ISrpProviderModule;
import com.oplus.omes.srp.sysintegrity.BuildConfig;
import com.oplus.omes.srp.sysintegrity.SrpConstant;
import com.oplus.omes.srp.sysintegrity.SrpException;
import com.oplus.omes.srp.sysintegrity.util.LogUtil;

/* JADX INFO: loaded from: classes8.dex */
public class CmmHelper {
    private Context mContext;

    public CmmHelper(Context context) {
        this.mContext = context;
    }

    private static void assembleBundle(Bundle bundle) {
        bundle.putInt(Constants.BUNDLE_KEY_APP_MIN_VERSIONCODE, SrpConstant.KIT_MIN_VER_CODE);
        bundle.putString(Constants.BUNDLE_KEY_MSP_SDK_KIT_NAME, BuildConfig.kitName);
    }

    private static ISrpProviderModule getProviderProxyer(Context context) throws MspSdkException {
        Bundle bundle = new Bundle();
        assembleBundle(bundle);
        return (ISrpProviderModule) MspSdk.apiProxy(ISrpProviderModule.class, bundle);
    }

    public boolean init() {
        return true;
    }

    public String request(String str, String str2) throws SrpException {
        try {
            return getProviderProxyer(this.mContext).getResult(str, str2);
        } catch (Exception e2) {
            LogUtil.e(SrpException.ERROR_PROXY_SERVICE_REMOTE_EXP, e2.getMessage());
            throw new SrpException(SrpException.ERROR_PROXY_SERVICE_REMOTE_EXP, e2.getMessage());
        }
    }
}
