package com.oplus.aiunit.vision;

import android.util.Base64;

/* JADX INFO: loaded from: classes6.dex */
public class l04 {
    public static final String BRAND_O = a("T1BQTw==");
    public static final String BRAND_ONE = a("T25lUGx1cw==");
    public static final String BRAND_R = a("cmVhbG1l");
    public static final String ROM_VERSION = a("cm8uYnVpbGQudmVyc2lvbi5vcHBvcm9t");
    public static final String ROM_VERSION_OPLUS = a("cm8uYnVpbGQudmVyc2lvbi5vcGx1c3JvbQ==");
    public static final String IS_EUROPE_PROPERTIES = a("b3Bwby5kY3MuZW5hYmxlLmFub255bW91cw==");
    public static final String IS_WX_PROPERTIES = a("b3Bwby52ZXJzaW9uLmV4cA==");
    public static final String REGION_MASK_PROPERTIES_Q = a("cm8ub3Bwby5yZWdpb25tYXJr");
    public static final String REGION_MASK_PROPERTIES_R = a("cm8ub3BsdXMucmVnaW9ubWFyaw==");
    public static final String REGION_MASK_PROPERTIES_VENDOR_R = a("cm8udmVuZG9yLm9wbHVzLnJlZ2lvbm1hcms=");
    public static final String REGION_MASK_PROPERTIES_VENDOR_Q = a("cm8udmVuZG9yLm9wcG8ucmVnaW9ubWFyaw==");
    public static final String REGION_MASK_PROPERTIES_PIPELINE_R = a("cm8ub3BsdXMucGlwZWxpbmUucmVnaW9u");
    public static final String REGION_MASK_AOSP = a("cm8uYm9vdC5yZWdpb25tYXJr");
    public static final String REGION_PROPERTIES = a("cGVyc2lzdC5zeXMub3Bwby5yZWdpb24=");
    public static final String REGION_OPLUS_PROPERTIES = a("cGVyc2lzdC5zeXMub3BsdXMucmVnaW9u");
    public static final String REGION_OEM_PROPERTIES = a("cGVyc2lzdC5zeXMub2VtLnJlZ2lvbg==");
    public static final String ONE_LABEL_PROPERTIES = a("Y29tLm9uZXBsdXMubW9iaWxlcGhvbmU=");
    public static final String ONE_PARAM_SERVICE_PROPERTIES = a("Y29tLm9uZXBsdXMubW9iaWxlcGhvbmU=");

    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 0), "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }
}
