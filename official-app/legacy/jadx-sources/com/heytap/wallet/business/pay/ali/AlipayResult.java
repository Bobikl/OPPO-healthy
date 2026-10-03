package com.heytap.wallet.business.pay.ali;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.oplus.aiunit.vision.j3n;
import com.oplus.aiunit.vision.t6b;
import com.oplus.utrace.utils.DcsCommon;
import com.oppo.lib.common.R$string;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AlipayResult {
    public static final String CODE_CANCEL = "6001";
    public static final String CODE_SUCCESS = "9000";
    public static final String CODE_UPDATE = "6000";
    private static final Map<String, Integer> sResultStatus;
    public boolean isSignOk = true;
    private Map<String, String> mOriginResult;
    private String memo;
    private String order;
    private String result;
    private String resultStatus;

    static {
        HashMap map = new HashMap();
        sResultStatus = map;
        map.put("9000", Integer.valueOf(R$string.alipay_result_code_9000));
        map.put("8000", Integer.valueOf(R$string.alipay_result_code_8000));
        map.put(DcsCommon.EVENT_ID_INTENT_TRACE, Integer.valueOf(R$string.alipay_result_code_4000));
        map.put("4001", Integer.valueOf(R$string.alipay_result_code_4001));
        map.put("4003", Integer.valueOf(R$string.alipay_result_code_4003));
        map.put("4004", Integer.valueOf(R$string.alipay_result_code_4004));
        map.put("4005", Integer.valueOf(R$string.alipay_result_code_4005));
        map.put("4006", Integer.valueOf(R$string.alipay_result_code_4006));
        map.put("4010", Integer.valueOf(R$string.alipay_result_code_4010));
        map.put(UserGoalInfo.DEVICE_STEPS_GOAL_DEFAULT, Integer.valueOf(R$string.alipay_result_code_5000));
        map.put(CODE_UPDATE, Integer.valueOf(R$string.alipay_result_code_6000));
        map.put(CODE_CANCEL, Integer.valueOf(R$string.alipay_result_code_6001));
        map.put("6002", Integer.valueOf(R$string.alipay_result_code_6002));
        map.put("6004", Integer.valueOf(R$string.alipay_result_code_6004));
        map.put("7001", Integer.valueOf(R$string.alipay_result_code_7001));
    }

    public AlipayResult(Map<String, String> map) {
        this.resultStatus = "";
        this.memo = "";
        this.result = "";
        this.order = "";
        if (map == null) {
            return;
        }
        this.mOriginResult = map;
        for (String str : map.keySet()) {
            if (TextUtils.equals(str, j3n.a)) {
                this.resultStatus = map.get(str);
            } else if (TextUtils.equals(str, "result")) {
                this.result = map.get(str);
            } else if (TextUtils.equals(str, j3n.b)) {
                this.memo = map.get(str);
            } else if (TextUtils.equals(str, "out_trade_no")) {
                this.order = map.get(str);
            }
        }
        t6b.a(toString());
    }

    public String getMemo() {
        return this.memo;
    }

    public String getResultStatus() {
        return this.resultStatus;
    }

    public String getStatusMsg(Context context) {
        return context.getResources().getString(getStatusMsgResId());
    }

    public int getStatusMsgResId() {
        Map<String, Integer> map = sResultStatus;
        return map.containsKey(this.resultStatus) ? map.get(this.resultStatus).intValue() : R$string.alipay_result_code_other;
    }

    public String toString() {
        return "AlipayResult{mOriginResult='" + this.mOriginResult + "', resultStatus='" + this.resultStatus + "', memo='" + this.memo + "', result='" + this.result + "', isSignOk=" + this.isSignOk + '}';
    }
}
