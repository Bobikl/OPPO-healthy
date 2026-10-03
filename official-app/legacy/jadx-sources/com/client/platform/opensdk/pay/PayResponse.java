package com.client.platform.opensdk.pay;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class PayResponse {
    public static final int CODE_CANCEL = 1004;
    public static final int CODE_RESULT_UNKNOWN = 1005;
    public static final int CODE_SUCCESS = 1001;
    public static final int ERROR_ABSENCE_PARAM = 1201;
    public static final int ERROR_AMOUNT_ERROR = 5000;
    public static final int ERROR_AUTH_FAILED = 5005;
    public static final int ERROR_BALANCE_NOT_ENOUGH = 5002;
    public static final int ERROR_DIRECTPAY_FAILED = 40001;
    public static final int ERROR_DIRECTPAY_FAILED_UNSAFE = 40003;
    public static final int ERROR_DIRECTPAY_SUCCESS = 40000;
    public static final int ERROR_DIRECTPAY_UNKNOWN = 40002;
    public static final int ERROR_IN_PROGRESS = 1012;
    public static final int ERROR_MERCHANT_ORDERID_REPEAT = 5006;
    public static final int ERROR_NO_NEW_VERSION = 1007;
    public static final int ERROR_ORDERID_REPEAT = 1002;
    public static final int ERROR_OVER_MAX_LIMIT = 1003;
    public static final int ERROR_PARAM_INVALID = 5003;
    public static final int ERROR_PAY_FAIL = 1100;
    public static final int ERROR_PAY_FAILED = 5555;
    public static final int ERROR_PAY_FAILED_OTHER = 1010;
    public static final int ERROR_QUERY_BALANCE_FAILED = 30001;
    public static final int ERROR_QUERY_BALANCE_SUCCESS = 30000;
    public static final int ERROR_QUERY_BALANCE_UNKNOWN = 30002;
    public static final int ERROR_QUERY_ORDER_FAILED = 50001;
    public static final int ERROR_QUERY_ORDER_SUCCESS = 50000;
    public static final int ERROR_QUERY_ORDER_UNKNOWN = 50002;
    public static final int ERROR_SINAGURE_ERROR = 1200;
    public static final int ERROR_SYSTEM_ERROR = 5001;
    public static final int ERROR_USER_NOT_EXISTS = 5004;
    public int mErrorCode;
    public String mMsg;
    public String mOder;
    public String mPayChannel;
    public String mRawMsg;

    private static String getMsg(int i) {
        if (i == 1007) {
            return "no update in version";
        }
        if (i == 1010) {
            return "payment failed";
        }
        if (i == 1012) {
            return "payment is being processed";
        }
        if (i == 1100 || i == 5555) {
            return "payment failed";
        }
        if (i == 1200) {
            return "signature error";
        }
        if (i == 1201) {
            return "missing parameters";
        }
        switch (i) {
            case 1001:
                return "success";
            case 1002:
                return "orderId repeat";
            case 1003:
                return "over max limit";
            case 1004:
                return "cancel";
            default:
                switch (i) {
                    case 5000:
                        return "amount error";
                    case 5001:
                        return "system error";
                    case 5002:
                        return "insufficient balance";
                    case ERROR_PARAM_INVALID /* 5003 */:
                        return "parameters error";
                    case ERROR_USER_NOT_EXISTS /* 5004 */:
                        return "user does not exit";
                    case ERROR_AUTH_FAILED /* 5005 */:
                        return "login authentication failed";
                    case ERROR_MERCHANT_ORDERID_REPEAT /* 5006 */:
                        return "merchant orderId repeat";
                    default:
                        switch (i) {
                            case 30000:
                                return "query balance successfully";
                            case 30001:
                                return "query balance failed";
                            case 30002:
                                return "query balance result is unknown";
                            default:
                                switch (i) {
                                    case 40000:
                                        return "direct payment success";
                                    case ERROR_DIRECTPAY_FAILED /* 40001 */:
                                        return "direct payment failed";
                                    case ERROR_DIRECTPAY_UNKNOWN /* 40002 */:
                                        return "direct payment result is unknown";
                                    default:
                                        switch (i) {
                                            case 50000:
                                                return "query order successfully";
                                            case 50001:
                                                return "query order failed";
                                            case ERROR_QUERY_ORDER_UNKNOWN /* 50002 */:
                                                return "query order result is unknown";
                                            default:
                                                return "unknown result";
                                        }
                                }
                        }
                }
        }
    }

    public static PayResponse parse(String str) {
        if (str == null || str.trim().equals("")) {
            return null;
        }
        PayResponse payResponse = new PayResponse();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("errCode");
            payResponse.mErrorCode = i;
            payResponse.mMsg = getMsg(i);
            if (jSONObject.has("order")) {
                payResponse.mOder = jSONObject.getString("order");
            }
            if (jSONObject.has("payChannel")) {
                payResponse.mPayChannel = jSONObject.getString("payChannel");
            }
            if (jSONObject.has("msg")) {
                payResponse.mRawMsg = jSONObject.getString("msg");
            }
            if (TextUtils.isEmpty(payResponse.mMsg) || payResponse.mMsg.equals("未知结果")) {
                payResponse.mMsg = jSONObject.getString("msg");
            }
        } catch (Exception unused) {
            Log.i(PayResponse.class.getSimpleName(), "parse error. response is " + str);
        }
        return payResponse;
    }
}
