package com.lifesense.device.scale.device.product;

import com.alibaba.fastjson.JSON;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class GetProductListRespond extends JsonResponse {
    public List<DisplayProductCategory> data;

    public List<DisplayProductCategory> getData() {
        return this.data;
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse
    public void parseJsonData(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.data = JSON.parseArray(jSONObject.getString("list"), DisplayProductCategory.class);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void setData(List<DisplayProductCategory> list) {
        this.data = list;
    }

    public String toString() {
        return "DisplayProductCategory{data=" + this.data + '}';
    }
}
