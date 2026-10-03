package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import com.oplus.accountsdk.service.account.trace.AcIdTraceManager;

/* JADX INFO: loaded from: classes19.dex */
public class ea implements sl9 {
    @Override // com.oplus.aiunit.vision.sl9
    public AcBaseTraceHelper a(Context context) {
        return AcIdTraceManager.getInstance(context);
    }
}
