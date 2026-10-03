package com.platform.usercenter.account.ams.api;

import android.content.Context;
import com.platform.usercenter.account.ams.bean.AcOauthApiResponse;
import com.platform.usercenter.account.ams.bean.AcOauthMaskInfoRequest;
import com.platform.usercenter.account.ams.bean.AcOauthRequest;
import com.platform.usercenter.account.ams.bean.AcOauthResult;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface IAcOAuthAgent {
    void auth(Context context, AcOauthRequest acOauthRequest, AcOauthCallback<AcOauthApiResponse<AcOauthResult>> acOauthCallback);

    void getMaskInfo(Context context, AcOauthMaskInfoRequest acOauthMaskInfoRequest, AcOauthCallback<AcOauthApiResponse<Map<String, String>>> acOauthCallback);
}
