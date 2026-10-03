package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.oplus.accountsdk.base.account.beans.AcAccountToken;
import com.oplus.accountsdk.base.account.beans.AcApiResponse;
import com.platform.usercenter.account.ams.bean.AcLoginParam;
import com.platform.usercenter.account.ams.ipc.AcAccountInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface il9 {
    public static final String TAG = "IAcAccountClient";

    @WorkerThread
    AcApiResponse<AcAccountInfo> getAccountInfo();

    @WorkerThread
    AcApiResponse<AcAccountToken> getAccountToken();

    @WorkerThread
    AcApiResponse<AcAccountToken> getV1Token();

    boolean isLogin();

    void login(Context context, c8<AcApiResponse<String>> c8Var);

    void login(Context context, AcLoginParam acLoginParam, c8<AcApiResponse<String>> c8Var);

    @WorkerThread
    AcApiResponse<String> refresh();
}
