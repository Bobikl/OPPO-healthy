package com.heytap.health.wallet.service.impl;

import android.os.RemoteException;
import com.heytap.health.wallet.key.IOneParamCallBack;
import com.heytap.health.wallet.key.IOperateCardService;
import com.oplus.aiunit.vision.xt9;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class OperateCardStub extends IOperateCardService.Stub {
    private xt9 iOperateCard;

    public OperateCardStub(xt9 xt9Var) {
        this.iOperateCard = xt9Var;
    }

    @Override // com.heytap.health.wallet.key.IOperateCardService
    public String beginTransaction(Map map) throws RemoteException {
        return this.iOperateCard.beginTransaction(map);
    }

    @Override // com.heytap.health.wallet.key.IOperateCardService
    public String completeTransaction(Map map) throws RemoteException {
        return this.iOperateCard.completeTransaction(map);
    }

    @Override // com.heytap.health.wallet.key.IOperateCardService
    public String executeTransaction(Map map) throws RemoteException {
        return this.iOperateCard.executeTransaction(map);
    }

    @Override // com.heytap.health.wallet.key.IOperateCardService
    public String invokeFunction(Map map) throws RemoteException {
        return this.iOperateCard.invokeFunction(map);
    }

    @Override // com.heytap.health.wallet.key.IOperateCardService
    public String isLogin(Map map) throws RemoteException {
        return this.iOperateCard.isLogin(map);
    }

    @Override // com.heytap.health.wallet.key.IOperateCardService
    public String queryData(Map map) throws RemoteException {
        return this.iOperateCard.queryData(map);
    }

    @Override // com.heytap.health.wallet.key.IOperateCardService
    public void requestLogin(Map map, IOneParamCallBack iOneParamCallBack) throws RemoteException {
        this.iOperateCard.requestLogin(map, iOneParamCallBack);
    }
}
