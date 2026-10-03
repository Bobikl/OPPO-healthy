package com.accountcenter;

import android.content.Context;
import com.oplus.aiunit.vision.fi8;
import com.platform.usercenter.network.header.UCDefaultBizHeader;
import com.platform.usercenter.network.header.UCHeaderHelperV1;
import com.platform.usercenter.network.header.UCHeaderHelperV2;
import com.platform.usercenter.tools.device.OpenIDHelper;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends fi8 {
    public volatile JSONObject a = null;

    @Override // com.oplus.aiunit.vision.fi8
    public final JSONObject getH5HeaderInfo(Context context, String str) {
        if (this.a == null || (!this.a.has("X-Client-OUID"))) {
            JSONObject jSONObject = new JSONObject();
            UCDefaultBizHeader uCDefaultBizHeader = new UCDefaultBizHeader();
            Map<String, String> mapBuildHeader = UCHeaderHelperV1.buildHeader(context, uCDefaultBizHeader);
            mapBuildHeader.putAll(UCHeaderHelperV2.buildHeader(context, uCDefaultBizHeader));
            OpenIDHelper.getOpenIdHeader(context);
            mapBuildHeader.put("X-Client-OUID", OpenIDHelper.getOUID());
            if (!mapBuildHeader.isEmpty()) {
                try {
                    for (String str2 : mapBuildHeader.keySet()) {
                        jSONObject.put(str2, mapBuildHeader.get(str2));
                    }
                } catch (Exception e2) {
                    UCLogUtil.e(e2);
                }
            }
            this.a = jSONObject;
        }
        return this.a;
    }
}
