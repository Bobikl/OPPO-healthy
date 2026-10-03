package com.lifesense.weidong.lzsimplenetlibs.base;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.store.base.core.http.HttpUtils;
import com.lifesense.weidong.lzsimplenetlibs.net.callback.IRequestCallBack;
import com.lifesense.weidong.lzsimplenetlibs.net.dispatcher.DefaultApiDispatcher;
import com.lifesense.weidong.lzsimplenetlibs.util.RequestCommonParamsUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseRequest {
    public static final String CONTENT_TYPE_JSON = String.format("application/json; charset=%s", "utf-8");
    public static final String HTTP_GET = "GET";
    public static final String HTTP_HEAD = "HEAD";
    public static final String HTTP_POST = "POST";
    public static final String PROTOCOL_CHARSET = "utf-8";
    public String domain;
    public String mRequestName;
    public String url;
    public String requestMethod = "POST";
    public Map<String, Object> mDataDict = new HashMap();
    public Map<String, String> mUrlParams = new HashMap();
    public Map<String, String> headerParams = new HashMap();

    public enum Method {
        GET("GET"),
        POST("POST");

        public String method;

        Method(String str) {
            this.method = str;
        }

        public String getMethod() {
            return this.method;
        }
    }

    public BaseRequest() {
        addCommonParams();
        setRequestName(getClass().getSimpleName());
    }

    private String appendingKeyValue(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        Object[] objArr = {str, String.format("%s=%s", str2, str3)};
        return !str.contains("?") ? String.format("%s?%s", objArr) : String.format("%s&%s", objArr);
    }

    public void addBoolValue(String str, boolean z) {
        if (str == null) {
            return;
        }
        this.mDataDict.put(str, Boolean.valueOf(z));
    }

    public void addCommonParams() {
        RequestCommonParamsUtils.addCommonParams(this);
        this.mUrlParams.put("requestId", UUID.randomUUID().toString().replace("-", ""));
    }

    public void addDoubleValue(String str, double d) {
        if (str == null) {
            return;
        }
        this.mDataDict.put(str, Double.valueOf(d));
    }

    public void addHeaderParams(String str, String str2) {
        this.headerParams.put(str, str2);
    }

    public void addIntValue(String str, int i) {
        if (str == null) {
            return;
        }
        this.mDataDict.put(str, Integer.valueOf(i));
    }

    public void addLongValue(String str, Long l2) {
        if (str == null) {
            return;
        }
        this.mDataDict.put(str, l2);
    }

    public void addStringValue(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.mDataDict.put(str, str2);
    }

    public void addUrlParams(String str, String str2) {
        this.mUrlParams.put(str, str2);
    }

    public void addValue(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        this.mDataDict.put(str, obj);
    }

    public String dictToBody() {
        Set<Map.Entry<String, Object>> setEntrySet = this.mDataDict.entrySet();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : setEntrySet) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e2) {
                Log.i("JSON_PARSE_ERROR", e2.getMessage());
            }
        }
        return jSONObject.toString();
    }

    public <T extends BaseResponse> void execute(IRequestCallBack<T> iRequestCallBack) {
        DefaultApiDispatcher.sharedInstance().dispatch(this, iRequestCallBack);
    }

    public String formatUrlParams() {
        String strAppendingKeyValue = "";
        for (Map.Entry<String, String> entry : this.mUrlParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            try {
                value = URLEncoder.encode(value, "utf-8");
                key = URLEncoder.encode(key, "utf-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
            strAppendingKeyValue = appendingKeyValue(strAppendingKeyValue, key, value);
        }
        return strAppendingKeyValue;
    }

    public String getCustomParamString() {
        if (this.mDataDict == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : this.mDataDict.entrySet()) {
            String key = entry.getKey();
            String string = entry.getValue().toString();
            try {
                string = URLEncoder.encode(string, "utf-8");
                key = URLEncoder.encode(key, "utf-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
            sb.append("&");
            sb.append(key);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(string);
        }
        return sb.toString();
    }

    public String getDomain() {
        return this.domain;
    }

    public Map<String, String> getHeaderParams() {
        return this.headerParams;
    }

    public String getRequestMethod() {
        return this.requestMethod;
    }

    public String getRequestName() {
        return this.mRequestName;
    }

    public abstract String getResponseClassName();

    public String getUrl() {
        if (!TextUtils.isEmpty(this.url)) {
            return this.url;
        }
        return getDomain() + getUrlWithoutProtocol();
    }

    public abstract String getUrlWithoutProtocol();

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setRequestMethod(String str) {
        this.requestMethod = str;
    }

    public void setRequestName(String str) {
        this.mRequestName = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
