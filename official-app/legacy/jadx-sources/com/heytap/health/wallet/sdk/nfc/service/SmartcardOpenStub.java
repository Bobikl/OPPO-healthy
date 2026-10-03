package com.heytap.health.wallet.sdk.nfc.service;

import android.content.Context;
import android.os.RemoteException;
import com.oplus.aiunit.vision.by9;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class SmartcardOpenStub extends ISmartcardOperateService.Stub {
    private Context mContext;
    private by9 mService;

    public SmartcardOpenStub(by9 by9Var, Context context) {
        this.mService = by9Var;
        this.mContext = context;
    }

    @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
    public String checkIssueConditions(Map map) throws RemoteException {
        return this.mService.checkIssueConditions(map);
    }

    @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
    public String checkServiceStatus(Map map) throws RemoteException {
        return this.mService.checkServiceStatus(map);
    }

    @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
    public String deleteCard(Map map) throws RemoteException {
        return this.mService.deleteCard(map);
    }

    @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
    public String issueCard(Map map) throws RemoteException {
        return this.mService.issueCard(map);
    }

    @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
    public String preIssueCard(Map map) throws RemoteException {
        return this.mService.preIssueCard(map);
    }

    @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
    public String queryCplc() throws RemoteException {
        return this.mService.queryCplc();
    }

    @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
    public String queryTrafficCardInfo(String str, int i) throws RemoteException {
        return this.mService.queryTrafficCardInfo(str, i);
    }

    @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardOperateService
    public String recharge(Map map) throws RemoteException {
        return this.mService.recharge(map);
    }
}
