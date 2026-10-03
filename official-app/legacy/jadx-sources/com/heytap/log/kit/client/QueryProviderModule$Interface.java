package com.heytap.log.kit.client;

import android.os.Bundle;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;

/* JADX INFO: loaded from: classes19.dex */
public interface QueryProviderModule$Interface {
    Bundle queryConfig(Bundle bundle) throws BridgeExecuteException, BridgeDispatchException;

    Bundle queryLogDirection(Bundle bundle) throws BridgeExecuteException, BridgeDispatchException;

    Bundle raiseUploadTask(Bundle bundle) throws BridgeExecuteException, BridgeDispatchException;

    Bundle syncSalvageTask(Bundle bundle) throws BridgeExecuteException, BridgeDispatchException;
}
