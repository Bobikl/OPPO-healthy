package com.heytap.log.kit.client;

import android.content.Context;
import android.os.Bundle;
import com.opos.process.bridge.base.BridgeResultCode;
import com.opos.process.bridge.client.BaseProviderClient;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;

/* JADX INFO: loaded from: classes19.dex */
public final class QueryProviderModule$Client extends BaseProviderClient implements QueryProviderModule$Interface {
    public static final String TARGET_CLASS = "com.heytap.msp.hlog.kit.ipc.server.QueryProviderModule";

    public QueryProviderModule$Client(Context context) {
        this(context, null);
    }

    @Override // com.opos.process.bridge.client.BaseProviderClient
    public String getTargetClass() {
        return "com.heytap.msp.hlog.kit.ipc.componet.main.QueryProvider";
    }

    @Override // com.heytap.log.kit.client.QueryProviderModule$Interface
    public final Bundle queryConfig(Bundle bundle) throws BridgeExecuteException, BridgeDispatchException {
        checkMainThread();
        Object objCallForResult = callForResult(this.mContext, TARGET_CLASS, this.mTargetIdentify, 1, bundle);
        checkNullResultType(objCallForResult, Bundle.class);
        if (objCallForResult == null || (objCallForResult instanceof Bundle)) {
            return (Bundle) objCallForResult;
        }
        throw new BridgeExecuteException("return value is not match:" + objCallForResult, BridgeResultCode.CODE_RESPONSE_ERROR);
    }

    @Override // com.heytap.log.kit.client.QueryProviderModule$Interface
    public final Bundle queryLogDirection(Bundle bundle) throws BridgeExecuteException, BridgeDispatchException {
        checkMainThread();
        Object objCallForResult = callForResult(this.mContext, TARGET_CLASS, this.mTargetIdentify, 3, bundle);
        checkNullResultType(objCallForResult, Bundle.class);
        if (objCallForResult == null || (objCallForResult instanceof Bundle)) {
            return (Bundle) objCallForResult;
        }
        throw new BridgeExecuteException("return value is not match:" + objCallForResult, BridgeResultCode.CODE_RESPONSE_ERROR);
    }

    @Override // com.heytap.log.kit.client.QueryProviderModule$Interface
    public final Bundle raiseUploadTask(Bundle bundle) throws BridgeExecuteException, BridgeDispatchException {
        checkMainThread();
        Object objCallForResult = callForResult(this.mContext, TARGET_CLASS, this.mTargetIdentify, 4, bundle);
        checkNullResultType(objCallForResult, Bundle.class);
        if (objCallForResult == null || (objCallForResult instanceof Bundle)) {
            return (Bundle) objCallForResult;
        }
        throw new BridgeExecuteException("return value is not match:" + objCallForResult, BridgeResultCode.CODE_RESPONSE_ERROR);
    }

    @Override // com.heytap.log.kit.client.QueryProviderModule$Interface
    public final Bundle syncSalvageTask(Bundle bundle) throws BridgeExecuteException, BridgeDispatchException {
        checkMainThread();
        Object objCallForResult = callForResult(this.mContext, TARGET_CLASS, this.mTargetIdentify, 2, bundle);
        checkNullResultType(objCallForResult, Bundle.class);
        if (objCallForResult == null || (objCallForResult instanceof Bundle)) {
            return (Bundle) objCallForResult;
        }
        throw new BridgeExecuteException("return value is not match:" + objCallForResult, BridgeResultCode.CODE_RESPONSE_ERROR);
    }

    public QueryProviderModule$Client(Context context, Bundle bundle) {
        super(context, null, bundle);
        this.defaultAuthorities = new String[]{"com.heytap.htms.hlog.query_provider"};
    }
}
