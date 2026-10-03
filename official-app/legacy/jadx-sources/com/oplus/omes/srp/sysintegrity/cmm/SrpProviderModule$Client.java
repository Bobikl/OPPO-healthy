package com.oplus.omes.srp.sysintegrity.cmm;

import android.content.Context;
import android.os.Bundle;
import com.opos.process.bridge.base.BridgeResultCode;
import com.opos.process.bridge.client.BaseProviderClient;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;

/* JADX INFO: loaded from: classes8.dex */
public final class SrpProviderModule$Client extends BaseProviderClient implements SrpProviderModule$Interface {
    public static final String TARGET_CLASS = "com.oplus.omes.srp.SrpProviderModule";

    public SrpProviderModule$Client(Context context) {
        this(context, null);
    }

    @Override // com.oplus.omes.srp.sysintegrity.cmm.SrpProviderModule$Interface
    public final String getResult(String str, String str2) throws BridgeExecuteException, BridgeDispatchException {
        checkMainThread();
        Object objCallForResult = callForResult(this.mContext, TARGET_CLASS, this.mTargetIdentify, 1, str, str2);
        checkNullResultType(objCallForResult, String.class);
        if (objCallForResult == null || (objCallForResult instanceof String)) {
            return (String) objCallForResult;
        }
        throw new BridgeExecuteException("return value is not match:" + objCallForResult, BridgeResultCode.CODE_RESPONSE_ERROR);
    }

    @Override // com.opos.process.bridge.client.BaseProviderClient
    public String getTargetClass() {
        return "com.oplus.omes.srp.SrpProvider";
    }

    public SrpProviderModule$Client(Context context, Bundle bundle) {
        super(context, null, bundle);
        this.defaultAuthorities = new String[]{"com.oplus.omes.srp.SAFETY_CHECK"};
    }
}
