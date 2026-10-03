package com.lifesense.device.scale.infrastructure.protocol;

import com.alibaba.fastjson.JSON;
import com.lifesense.device.scale.infrastructure.bean.SyncFromServerData;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class SyncDownloadResponse extends JsonResponse {
    public SyncFromServerData mSyncFromServerData;

    public SyncFromServerData getSyncFromServerData() {
        return this.mSyncFromServerData;
    }

    @Override // com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse
    public void parseJsonData(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mSyncFromServerData = (SyncFromServerData) JSON.parseObject(jSONObject.toString(), SyncFromServerData.class);
    }
}
