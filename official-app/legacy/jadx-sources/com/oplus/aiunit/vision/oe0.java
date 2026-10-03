package com.oplus.aiunit.vision;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.heytap.health.sleep.R$array;
import com.heytap.health.sleep.disturb.bean.AppTypeRspItem;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class oe0 {
    public static final Integer[] a;
    public static final List<Integer> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, Integer> f14907c;

    static {
        Integer[] numArr = {0, 6762, 6786, Integer.valueOf(com.alipay.sdk.m.u.a.i), 74, 6792, 78, 77, 8, 463, 79, 6761, 6795, 6796, 80, 462, 465, 6878, 0};
        a = numArr;
        b = Arrays.asList(numArr);
        f14907c = new HashMap();
        e();
    }

    public static Map<String, Integer> a() {
        List<AppTypeRspItem> listD = sc8.d(v9g.w().D("disturb_app_type"), AppTypeRspItem.class);
        if (listD == null || listD.isEmpty()) {
            return f14907c;
        }
        lw5.c("AppTypeUtil", "getAppTypes currentDatum : " + listD.toString());
        HashMap map = new HashMap(f14907c);
        for (AppTypeRspItem appTypeRspItem : listD) {
            if (!map.containsKey(appTypeRspItem.getPkgName())) {
                map.put(appTypeRspItem.getPkgName(), Integer.valueOf(appTypeRspItem.getSecondCategoryId()));
            }
        }
        return map;
    }

    public static int b(int i) {
        int iIndexOf = b.indexOf(Integer.valueOf(i));
        if (iIndexOf == -1) {
            return 0;
        }
        return iIndexOf;
    }

    public static Drawable c(int i) {
        TypedArray typedArrayObtainTypedArray = b78.a().getResources().obtainTypedArray(R$array.health_sleep_array_app_type);
        Drawable drawable = typedArrayObtainTypedArray.getDrawable(i);
        typedArrayObtainTypedArray.recycle();
        return drawable;
    }

    public static String d(int i) {
        return b78.a().getResources().getStringArray(R$array.health_sleep_array_app_type_name)[i];
    }

    public static void e() {
        Properties propertiesA = xye.a(b78.a(), "top_app_type.properties");
        String property = propertiesA != null ? propertiesA.getProperty("topApps") : null;
        f14907c.clear();
        if (TextUtils.isEmpty(property)) {
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(property).optJSONArray("content");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                f14907c.put(jSONObjectOptJSONObject.optString("name"), Integer.valueOf(jSONObjectOptJSONObject.optInt("type")));
            }
        } catch (JSONException e2) {
            lw5.b("AppTypeUtil", e2.getMessage());
        }
    }
}
