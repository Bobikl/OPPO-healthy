package com.heytap.log.kit.client;

import android.os.Bundle;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;

/* JADX INFO: loaded from: classes19.dex */
public interface WriteProviderModule$Interface {
    Bundle activeNotifyLogFileReady(Bundle bundle) throws BridgeExecuteException, BridgeDispatchException;

    Bundle activeReportTask(Bundle bundle) throws BridgeExecuteException, BridgeDispatchException;

    Bundle activeSalvageTask(Bundle bundle) throws BridgeExecuteException, BridgeDispatchException;
}
