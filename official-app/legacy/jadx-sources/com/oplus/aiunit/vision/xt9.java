package com.oplus.aiunit.vision;

import com.heytap.health.wallet.key.IOneParamCallBack;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public interface xt9 {
    String beginTransaction(Map<String, String> map);

    String completeTransaction(Map<String, String> map);

    String executeTransaction(Map<String, String> map);

    String invokeFunction(Map<String, String> map);

    String isLogin(Map<String, String> map);

    String queryData(Map<String, String> map);

    void requestLogin(Map<String, String> map, IOneParamCallBack iOneParamCallBack);
}
