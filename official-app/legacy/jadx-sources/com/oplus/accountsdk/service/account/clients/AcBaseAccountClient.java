package com.oplus.accountsdk.service.account.clients;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.oplus.aiunit.vision.c8;
import com.oplus.aiunit.vision.il9;
import com.platform.usercenter.account.ams.bean.AcLoginParam;

/* JADX INFO: loaded from: classes19.dex */
public abstract class AcBaseAccountClient implements il9 {
    private static final String TAG = "AcBaseAccountClient";
    protected Context mContext;

    public AcBaseAccountClient(Context context) {
        this.mContext = context;
    }

    @Override // com.oplus.aiunit.vision.il9
    @WorkerThread
    public abstract /* synthetic */ AcApiResponse getAccountInfo();

    @Override // com.oplus.aiunit.vision.il9
    @WorkerThread
    public abstract /* synthetic */ AcApiResponse getAccountToken();

    @Override // com.oplus.aiunit.vision.il9
    @WorkerThread
    public abstract /* synthetic */ AcApiResponse getV1Token();

    @Override // com.oplus.aiunit.vision.il9
    public abstract /* synthetic */ boolean isLogin();

    @Override // com.oplus.aiunit.vision.il9
    public abstract /* synthetic */ void login(Context context, c8 c8Var);

    @Override // com.oplus.aiunit.vision.il9
    public abstract /* synthetic */ void login(Context context, AcLoginParam acLoginParam, c8 c8Var);

    @Override // com.oplus.aiunit.vision.il9
    @WorkerThread
    public abstract /* synthetic */ AcApiResponse refresh();
}
