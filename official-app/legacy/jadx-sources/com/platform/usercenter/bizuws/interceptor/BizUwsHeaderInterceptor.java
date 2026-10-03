package com.platform.usercenter.bizuws.interceptor;

import android.content.Context;
import androidx.annotation.NonNull;
import com.heytap.webpro.common.exception.HandleException;
import com.oplus.aiunit.vision.fi8;
import com.platform.usercenter.network.header.UCDefaultBizHeader;
import com.platform.usercenter.network.header.UCHeaderHelperV1;
import com.platform.usercenter.network.header.UCHeaderHelperV2;
import com.platform.usercenter.tools.device.OpenIDHelper;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class BizUwsHeaderInterceptor extends fi8 {
    protected volatile JSONObject sHeadJSON = null;

    private boolean isEmptyOpenid(JSONObject jSONObject) {
        return (jSONObject.has("X-Client-GUID") || jSONObject.has("X-Client-AUID") || jSONObject.has("X-Client-OUID")) ? false : true;
    }

    private void putMapToJson(@NonNull Map<String, String> map, @NonNull JSONObject jSONObject) {
        if (map.isEmpty()) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
        } catch (Exception e2) {
            UCLogUtil.e(e2);
        }
    }

    @Override // com.oplus.aiunit.vision.fi8
    public JSONObject getH5HeaderInfo(Context context, String str) throws HandleException {
        if (this.sHeadJSON == null || isEmptyOpenid(this.sHeadJSON)) {
            JSONObject jSONObject = new JSONObject();
            UCDefaultBizHeader uCDefaultBizHeader = new UCDefaultBizHeader();
            Map<String, String> mapBuildHeader = UCHeaderHelperV1.buildHeader(context, uCDefaultBizHeader);
            mapBuildHeader.putAll(UCHeaderHelperV2.buildHeader(context, uCDefaultBizHeader));
            mapBuildHeader.putAll(OpenIDHelper.getOpenIdHeader(context));
            putMapToJson(mapBuildHeader, jSONObject);
            this.sHeadJSON = jSONObject;
        }
        return this.sHeadJSON;
    }
}
