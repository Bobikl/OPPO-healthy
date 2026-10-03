package com.lifesense.device.scale.infrastructure.protocol;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.lifesense.android.bluetooth.scale.bean.WeightData_A3;
import com.lifesense.device.scale.device.dto.receive.WeightData;
import com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UploadWeightRequest extends BaseRequest {
    public static String RECORD_LIST = "recordList";
    public static final String kRequestParam_UserId = "userId";

    public UploadWeightRequest(List<WeightData> list, long j2) {
        setRequestMethod("POST");
        addLongValue("userId", Long.valueOf(j2));
        JSONArray jSONArray = new JSONArray();
        for (WeightData weightData : list) {
            try {
                JSONObject jSONObject = new JSONObject(JSON.toJSONString(weightData));
                jSONObject.remove("measurementDate");
                jSONObject.put("measurementDate", weightData.getMeasurementTime());
                jSONArray.put(jSONObject);
            } catch (JSONException e2) {
                Log.e(WeightData_A3.IMPEDANCE_STATUS_ERROR, e2.getMessage(), e2);
            }
        }
        addValue(RECORD_LIST, jSONArray);
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getResponseClassName() {
        return UploadWeightResponse.class.getName();
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.base.BaseRequest
    public String getUrlWithoutProtocol() {
        return "/weight_service/weight/syncToServer";
    }
}
