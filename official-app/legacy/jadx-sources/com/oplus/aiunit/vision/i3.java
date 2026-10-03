package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.heytap.health.wallet.key.IOneParamCallBack;
import com.heytap.health.wallet.service.model.ResultData;
import com.heytap.wallet.business.common.constant.ReturnCode;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public abstract class i3 implements xt9 {
    public Context a;

    public i3(Context context) {
        this.a = context;
    }

    public final ResultData a(Map<String, String> map) {
        ResultData resultData = new ResultData();
        String str = map.get("type");
        String str2 = map.get("aid");
        String str3 = map.get("channelID");
        String str4 = map.get("packageName");
        String str5 = map.get(dld.TRANSACTION_ID);
        String str6 = map.get("timestamp");
        String str7 = map.get("signData");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7) || TextUtils.isEmpty(str5)) {
            resultData.setResultCode(10001);
            resultData.setResultMsg("params error");
            return resultData;
        }
        if (!"1001".equals(str) && !"1003".equals(str) && !"1004".equals(str) && !"1006".equals(str) && !"1005".equals(str) && !"1007".equals(str) && !"1008".equals(str) && !"1009".equals(str)) {
            resultData.setResultCode(10001);
            resultData.setResultMsg("params type invalid");
        }
        return resultData;
    }

    public final ResultData b(Map<String, String> map) {
        ResultData resultData = new ResultData();
        String str = map.get("aid");
        String str2 = map.get("channelID");
        String str3 = map.get("packageName");
        String str4 = map.get(dld.TRANSACTION_ID);
        String str5 = map.get("timestamp");
        String str6 = map.get("signData");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str6)) {
            return resultData;
        }
        resultData.setResultCode(10001);
        resultData.setResultMsg("params error");
        return resultData;
    }

    @Override // com.oplus.aiunit.vision.xt9
    public String beginTransaction(Map<String, String> map) {
        t6b.b("AbsBYDOperateCard", "Enter beginTransaction");
        ResultData resultDataG = g();
        if (resultDataG.getResultCode() != 0) {
            return moa.g(resultDataG);
        }
        ResultData resultDataF = f(map);
        return resultDataF.getResultCode() != 0 ? moa.g(resultDataF) : n(map);
    }

    public final ResultData c(Map<String, String> map) {
        ResultData resultData = new ResultData();
        String str = map.get("aid");
        String str2 = map.get("channelID");
        String str3 = map.get("packageName");
        String str4 = map.get("timestamp");
        String str5 = map.get("signData");
        String str6 = map.get("type");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            return resultData;
        }
        resultData.setResultCode(10001);
        resultData.setResultMsg("params error");
        return resultData;
    }

    @Override // com.oplus.aiunit.vision.xt9
    public String completeTransaction(Map<String, String> map) {
        t6b.b("AbsBYDOperateCard", "Enter completeTransaction");
        ResultData resultDataG = g();
        if (resultDataG.getResultCode() != 0) {
            return moa.g(resultDataG);
        }
        ResultData resultDataB = b(map);
        return resultDataB.getResultCode() != 0 ? moa.g(resultDataB) : h(map);
    }

    public final ResultData d(Map<String, String> map) {
        ResultData resultData = new ResultData();
        String str = map.get("aid");
        String str2 = map.get("channelID");
        String str3 = map.get("packageName");
        String str4 = map.get("timestamp");
        String str5 = map.get("signData");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            return resultData;
        }
        resultData.setResultCode(10001);
        resultData.setResultMsg("params error");
        return resultData;
    }

    public final ResultData e(Map<String, String> map) {
        ResultData resultData = new ResultData();
        String str = map.get("type");
        String str2 = map.get("channelID");
        String str3 = map.get("packageName");
        String str4 = map.get("aid");
        String str5 = map.get("timestamp");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            resultData.setResultCode(10001);
            resultData.setResultMsg("params error");
            return resultData;
        }
        if (!"1001".equals(str) && !"1002".equals(str) && !"1003".equals(str) && !"1004".equals(str)) {
            resultData.setResultCode(10001);
            resultData.setResultMsg("params type invalid");
        }
        return resultData;
    }

    @Override // com.oplus.aiunit.vision.xt9
    public String executeTransaction(Map<String, String> map) {
        t6b.b("AbsBYDOperateCard", "Enter executeTransaction");
        ResultData resultDataG = g();
        if (resultDataG.getResultCode() != 0) {
            return moa.g(resultDataG);
        }
        ResultData resultDataA = a(map);
        return resultDataA.getResultCode() != 0 ? moa.g(resultDataA) : i(map);
    }

    public final ResultData f(Map<String, String> map) {
        ResultData resultData = new ResultData();
        String str = map.get("aid");
        String str2 = map.get("channelID");
        String str3 = map.get("packageName");
        String str4 = map.get("timestamp");
        String str5 = map.get("signData");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            return resultData;
        }
        resultData.setResultCode(10001);
        resultData.setResultMsg("params error");
        return resultData;
    }

    public final ResultData g() {
        ResultData resultData = new ResultData();
        Context context = this.a;
        if (context == null) {
            resultData.setResultCode(ReturnCode.WALLET_SYS_ERROR);
        } else if (!moa.e(context)) {
            resultData.setResultCode(10002);
        } else if (!moa.d()) {
            resultData.setResultCode(30000);
        }
        return resultData;
    }

    public abstract String h(Map<String, String> map);

    public abstract String i(Map<String, String> map);

    @Override // com.oplus.aiunit.vision.xt9
    public String invokeFunction(Map<String, String> map) {
        t6b.b("AbsBYDOperateCard", "Enter invokeFunction");
        ResultData resultDataG = g();
        if (resultDataG.getResultCode() != 0) {
            return moa.g(resultDataG);
        }
        ResultData resultDataC = c(map);
        return resultDataC.getResultCode() != 0 ? moa.g(resultDataC) : j(map);
    }

    @Override // com.oplus.aiunit.vision.xt9
    public String isLogin(Map<String, String> map) {
        t6b.b("AbsBYDOperateCard", "Enter isLogin");
        ResultData resultDataG = g();
        if (resultDataG.getResultCode() != 0) {
            return moa.g(resultDataG);
        }
        ResultData resultDataD = d(map);
        return resultDataD.getResultCode() != 0 ? moa.g(resultDataD) : l(map);
    }

    public abstract String j(Map<String, String> map);

    public abstract String k(Map<String, String> map);

    public abstract String l(Map<String, String> map);

    public abstract void m(Map<String, String> map, IOneParamCallBack iOneParamCallBack);

    public abstract String n(Map<String, String> map);

    @Override // com.oplus.aiunit.vision.xt9
    public String queryData(Map<String, String> map) {
        t6b.b("AbsBYDOperateCard", "Enter queryData");
        ResultData resultDataG = g();
        if (resultDataG.getResultCode() != 0) {
            return moa.g(resultDataG);
        }
        ResultData resultDataE = e(map);
        return resultDataE.getResultCode() != 0 ? moa.g(resultDataE) : k(map);
    }

    @Override // com.oplus.aiunit.vision.xt9
    public void requestLogin(Map<String, String> map, IOneParamCallBack iOneParamCallBack) {
        t6b.b("AbsBYDOperateCard", "Enter requestLogin");
        ResultData resultDataG = g();
        if (resultDataG.getResultCode() != 0) {
            try {
                iOneParamCallBack.callBack(moa.g(resultDataG));
            } catch (RemoteException e2) {
                t6b.b("AbsBYDOperateCard", "RemoteException e =" + e2.getMessage());
            }
        }
        ResultData resultDataD = d(map);
        if (resultDataD.getResultCode() != 0) {
            try {
                iOneParamCallBack.callBack(moa.g(resultDataD));
            } catch (RemoteException e3) {
                t6b.b("AbsBYDOperateCard", "RemoteException e =" + e3.getMessage());
            }
        }
        m(map, iOneParamCallBack);
    }
}
