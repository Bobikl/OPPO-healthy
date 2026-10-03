package com.heytap.store.base.core.util.statistics;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.store.base.core.state.Constants;
import com.heytap.store.base.core.state.ConstantsKt;
import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.base.core.util.Acache;
import com.heytap.store.base.core.util.KeyMaps;
import com.heytap.store.base.core.util.SpUtil;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.base.core.util.statistics.bean.UtmBean;
import com.heytap.store.platform.tools.GsonUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DeepLinkParamsUtil {
    public static Long utCount = 0L;

    public static void parse(Map<String, String> map, String str) {
        String str2 = map.get(KeyMaps.OCPX_ADID);
        String strEncode = map.get("utm_source");
        String strEncode2 = map.get("utm_medium");
        String strEncode3 = map.get(UtmBean.UTM_CAMPAIGN);
        String strEncode4 = map.get(UtmBean.UTM_TERM);
        if (!TextUtils.isEmpty(str2)) {
            SensorsBean.INSTANCE.setAdid(str2);
        }
        String str3 = map.get(KeyMaps.REFERER);
        String str4 = map.get(KeyMaps.BD_VID);
        if (!TextUtils.isEmpty(str3)) {
            Acache.INSTANCE.put(KeyMaps.REFERER, str3, UtmBean.EXPIRATION_DATE);
        }
        String strEncode5 = "";
        if (!TextUtils.isEmpty(strEncode) || !TextUtils.isEmpty(strEncode2) || !TextUtils.isEmpty(strEncode3) || !TextUtils.isEmpty(strEncode4) || !TextUtils.isEmpty(str4)) {
            if (TextUtils.isEmpty(str4)) {
                Acache.INSTANCE.put(KeyMaps.BD_VID, "", UtmBean.EXPIRATION_DATE);
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(KeyMaps.BD_VID, str4);
                    Acache.INSTANCE.put(KeyMaps.BD_VID, jSONObject.toString(), UtmBean.EXPIRATION_DATE);
                } catch (JSONException unused) {
                }
            }
            UtmBean utmBean = new UtmBean();
            try {
                if (!TextUtils.isEmpty(strEncode)) {
                    strEncode = URLEncoder.encode(strEncode, "UTF-8");
                }
                if (!TextUtils.isEmpty(strEncode2)) {
                    strEncode2 = URLEncoder.encode(strEncode2, "UTF-8");
                }
                if (!TextUtils.isEmpty(strEncode3)) {
                    strEncode3 = URLEncoder.encode(strEncode3, "UTF-8");
                }
                if (!TextUtils.isEmpty(strEncode4)) {
                    strEncode4 = URLEncoder.encode(strEncode4, "UTF-8");
                }
                utmBean.setLatest_utm_source(strEncode);
                utmBean.setLatest_utm_medium(strEncode2);
                utmBean.setLatest_utm_campaign(strEncode3);
                utmBean.setLatest_utm_term(strEncode4);
                utmBean.updateTime();
                SpUtil.putStringOnBackground(Constants.STATISTICS_UTM, GsonUtils.INSTANCE.toJson(utmBean));
                StatisticsUtil.updateUtmParam(strEncode, strEncode2, strEncode3, strEncode4);
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2);
            }
        }
        String strEncode6 = map.get(UtmBean.US);
        String strEncode7 = map.get(UtmBean.UM);
        String strEncode8 = map.get(UtmBean.UC);
        if (!TextUtils.isEmpty(str)) {
            map.put(ConstantsKt.LIVE_UT, str);
        } else if (map.containsKey(UtmBean.UT)) {
            strEncode5 = map.get(UtmBean.UT);
            map.put(ConstantsKt.LIVE_UT, strEncode5);
        }
        if (UrlConfig.DEBUG) {
            Log.d("DeepLinkParamsUtil", "get param us->" + strEncode6 + ",us->" + strEncode7 + ",uc->" + strEncode8 + ",ut->" + strEncode5);
        }
        if (TextUtils.isEmpty(strEncode6) && TextUtils.isEmpty(strEncode7) && TextUtils.isEmpty(strEncode8) && TextUtils.isEmpty(strEncode5)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(strEncode6)) {
                strEncode6 = URLEncoder.encode(strEncode6, "UTF-8");
            }
            if (!TextUtils.isEmpty(strEncode7)) {
                strEncode7 = URLEncoder.encode(strEncode7, "UTF-8");
            }
            if (!TextUtils.isEmpty(strEncode8)) {
                strEncode8 = URLEncoder.encode(strEncode8, "UTF-8");
            }
            if (!TextUtils.isEmpty(strEncode5)) {
                strEncode5 = URLEncoder.encode(strEncode5, "UTF-8");
            }
            StatisticsUtil.updateInternalUtmParam(strEncode6, strEncode7, strEncode8, strEncode5);
            utCount = Long.valueOf(utCount.longValue() + 1);
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException(e3);
        }
    }
}
