package com.heytap.usercenter.accountsdk;

/* JADX INFO: loaded from: classes19.dex */
public class a implements AcExtension {
    @Override // com.heytap.usercenter.accountsdk.AcExtension
    public boolean isForeground() {
        return AccountAgentClient.get().isForeground();
    }

    @Override // com.heytap.usercenter.accountsdk.AcExtension
    public boolean isShowAcPage() {
        return true;
    }
}
