package com.omron.lib;

import com.omron.lib.common.OMRONBLEErrMsg;

/* JADX INFO: loaded from: classes5.dex */
public interface IdentifierCallback {
    void onFail(OMRONBLEErrMsg oMRONBLEErrMsg);

    void onSuccess();
}
