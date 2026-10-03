package com.lifesense.weidong.lzsimplenetlibs.net.invoker;

import com.lifesense.weidong.lzsimplenetlibs.base.BaseResponse;
import com.lifesense.weidong.lzsimplenetlibs.net.exception.ProtocolException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class JsonResponse extends BaseResponse {
    public static final String DEFAULT_ERROR_MSG = "no message";
    public static final String PROTOCOL_JSON_KEY_DATA = "data";
    public static final String PROTOCOL_JSON_KEY_LIST_IN_DATA = "list";
    public static final String PROTOCOL_JSON_KEY_MSG = "msg";
    public static final String PROTOCOL_JSON_KEY_RET = "code";
    public static final int RET_DEFAULT_ERROR = -1;
    public static final int RET_SUCCESS = 200;
    public JSONObject mJSONData;
    public JSONObject mRootJSON;

    private void retryParseArrayData(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray != null) {
            JSONObject jSONObject2 = new JSONObject();
            this.mJSONData = jSONObject2;
            try {
                jSONObject2.put("list", jSONArrayOptJSONArray);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public JSONObject getRootJSON() {
        return this.mRootJSON;
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseResponse
    public final void parse() throws ProtocolException {
        super.parse();
        if (this.content == null) {
            throw new ProtocolException(getmRequest().getRequestName(), "data is Empty ");
        }
        try {
            JSONObject jSONObject = new JSONObject(this.content);
            this.mRootJSON = jSONObject;
            parseRootJSON(jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
            throw new ProtocolException(getmRequest().getRequestName(), "data format json error ");
        }
    }

    public abstract void parseJsonData(JSONObject jSONObject);

    public void parseRootJSON(JSONObject jSONObject) {
        int i;
        try {
            i = jSONObject.getInt("code");
        } catch (JSONException e2) {
            e2.printStackTrace();
            i = -1;
        }
        String strOptString = jSONObject.optString("msg");
        setmMsg(strOptString);
        setmRet(i);
        if (i == 200) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            this.mJSONData = jSONObjectOptJSONObject;
            if (jSONObjectOptJSONObject == null) {
                retryParseArrayData(jSONObject);
            }
        } else {
            setmRet(i);
            setmMsg(strOptString);
        }
        JSONObject jSONObject2 = this.mJSONData;
        if (jSONObject2 != null) {
            parseJsonData(jSONObject2);
        }
    }
}
