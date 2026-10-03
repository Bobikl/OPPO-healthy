package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthIndicatorDetail;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.store.base.core.connectivity.ConnectivityManagerProxy;
import com.oplus.smartenginehelper.ParserTag;
import com.unionpay.UPPayWapActivity;
import com.unionpay.utils.UPUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class kfk {
    public static String A = null;
    public static String B = "";
    public static String C = "";
    public static String D = "";
    public static String E = "";
    public static boolean F = false;
    public static int G = 10;
    public static WeakReference H = null;
    public static String I = "";
    public static String J = null;
    public static String K = null;
    public static String L = "";
    public static int M = 0;
    public static boolean N = false;
    public static boolean O = false;
    public static wpm P = null;
    public static Handler Q = null;
    public static String R = "[{\"package_info\":[{\"schema\":\"com.unionpay\",\"sign\":\"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\":101,\"version\":\".*\"}],\"sort\":100,\"type\":\"app\"}]";
    public static String S = "[{\"package_info\": [{\"schema\": \"com.unionpay.tsmservice\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 102,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[2-9].*|^01\\\\.00\\\\.1[012789].*|^01\\\\.00\\\\.0[8-9].*\"},{\"schema\": \"com.unionpay.tsmservice.mi\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 103,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[1-9].*|^01\\\\.00\\\\.0[8-9].*\"}],\"sort\": 100,\"type\": \"app\"}]";
    public static final String SDK_TYPE = "02";
    public static String T = "[{\"package_info\": [{\"schema\": \"com.huawei.wallet\",\"sign\": \"9095F915D6C143A41CE029209AFECB87AB481DDD\",\"sort\": 101,\"version\": \"([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\"},{\"schema\": \"com.huawei.wallet\",\"sign\": \"059e2480adf8c1c5b3d9ec007645ccfc442a23c5\",\"sort\": 102,\"version\": \"([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\\\\.([0-9]\\\\d*)\"},{\"schema\": \"com.unionpay.tsmservice\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 103,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[2-9].*|^01\\\\.00\\\\.1[012789].*|^01\\\\.00\\\\.0[8-9].*\"},{\"schema\": \"com.unionpay.tsmservice.mi\",\"sign\": \"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\": 104,\"version\": \"^[1-9].*|^0[2-9].*|^01\\\\.[1-9].*|^01\\\\.0[1-9].*|^01\\\\.00\\\\.[1-9].*|^01\\\\.00\\\\.0[8-9].*\"}],\"sort\": 100,\"type\": \"app\"}]";
    public static JSONArray U = null;
    public static final Handler.Callback V = new qcm();
    public static final String VERSION = "3.5.15";
    public static String a = "SpId";
    public static String b = "paydata";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f13261c = "pay_tn";
    public static String d = "SysProvide";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f13262e = "UseTestMode";
    public static String f = "SecurityChipType";
    public static String g = "reqOriginalId";
    public static String h = "wapurl";
    public static String i = "actionType";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f13263j = "dlgstyle";
    public static String k = "com.unionpay.uppay.PayActivity";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f13264l = "com.huawei.wallet";
    public static String m = "com.huawei.wallet.action.onlinepay.startpay";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String f13265n = "ex_mode";
    public static String o = "server";
    public static String p = "source";
    public static String q = "samsung_out";
    public static String r = "se_type";
    public static String s = "se_title_logo";
    public static String t = "se_loading_logo";
    public static String u = "se_title_bg_color";
    public static String v = "se_cancel_bg_color";
    public static String w = "02";
    public static String x;
    public static String y;
    public static String z;

    public static /* synthetic */ boolean C() {
        O = true;
        return true;
    }

    public static int F() {
        JSONArray jSONArray;
        int i2;
        WeakReference weakReference = H;
        if (weakReference == null || weakReference.get() == null) {
            return 1;
        }
        if (TextUtils.isEmpty(C) && TextUtils.isEmpty(D)) {
            F = false;
        } else {
            F = true;
            if (w.equalsIgnoreCase(D)) {
                C = q;
            }
        }
        M = 0;
        N = false;
        O = false;
        try {
            System.loadLibrary("entryexpro");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String strC = UPUtils.c(G(), "configs" + D);
        String strC2 = UPUtils.c(G(), "mode" + D);
        String strC3 = UPUtils.c(G(), "or" + D);
        if (!TextUtils.isEmpty(strC) && !TextUtils.isEmpty(strC2) && !TextUtils.isEmpty(strC3)) {
            try {
                JSONObject jSONObject = new JSONObject(strC);
                String strB = ozm.b(jSONObject, "sign");
                try {
                    i2 = Integer.parseInt(strC2);
                } catch (Exception unused) {
                    i2 = 0;
                }
                String str = new String(Base64.decode(jSONObject.getString("configs"), 2));
                String str2 = "";
                String str3 = jSONObject.has("sePayConf") ? new String(Base64.decode(jSONObject.getString("sePayConf"), 2)) : "";
                if (!TextUtils.isEmpty(str3)) {
                    str2 = str3;
                }
                String strI = com.unionpay.utils.a.i(UPUtils.d(str + str2 + strC3));
                String strB2 = UPUtils.b(i2, strB);
                if (!TextUtils.isEmpty(strB2) && strB2.equals(strI)) {
                    if (TextUtils.isEmpty(D)) {
                        R = str;
                    } else if ("04".equals(D)) {
                        T = str;
                    } else {
                        S = str;
                    }
                    if (!TextUtils.isEmpty(B)) {
                        String strC4 = UPUtils.c(G(), "se_configs" + B);
                        if (!TextUtils.isEmpty(strC4)) {
                            t(strC4);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        try {
            if (TextUtils.isEmpty(D)) {
                jSONArray = new JSONArray(R);
            } else {
                jSONArray = "04".equals(D) ? new JSONArray(T) : new JSONArray(S);
            }
            U = o(jSONArray, DBHealthIndicatorDetail.SORT);
        } catch (Exception unused3) {
        }
        Q = new Handler(V);
        if (TextUtils.isEmpty(D) || !com.unionpay.utils.a.e()) {
            r("0");
        } else {
            com.huawei.nfc.sdk.service.b bVar = new com.huawei.nfc.sdk.service.b(G());
            Q.sendEmptyMessageDelayed(1004, 1000L);
            bVar.l("UNIONONLINEPAY", new hmm());
        }
        return 0;
    }

    public static Context G() {
        WeakReference weakReference = H;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public static int H(Context context, String str, String str2, String str3, String str4) {
        return a(context, str, str2, str3, str4, "", "");
    }

    public static int a(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        H = new WeakReference(context);
        I = str3;
        J = str;
        K = str2;
        L = str4;
        D = str6;
        C = str5;
        E = TextUtils.isEmpty(str6) ? "0" : "1";
        x = null;
        y = null;
        z = null;
        B = str6;
        F();
        return 0;
    }

    public static String c(Context context) {
        return e(context, true, "0");
    }

    public static String d(Context context, int i2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v", "1.5");
            jSONObject.put("os_name", "android");
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("tn", UPUtils.h(i2, com.unionpay.utils.a.i(str)));
            }
            try {
                jSONObject.put("terminal_version", VERSION);
                jSONObject.put("os_version", jsm.a());
                jSONObject.put(va5.TAG_DEVICE_MODEL, jsm.e());
                jSONObject.put("app_version", com.unionpay.utils.a.l(context, str2));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("package_name", str2);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static String e(Context context, boolean z2, String str) {
        return n(context, L, z2 ? null : I, z2 ? "0" : null, str, E, B);
    }

    public static void h() {
    }

    public static /* synthetic */ void i(Context context, JSONArray jSONArray, int i2) {
        while (jSONArray != null && i2 < jSONArray.length()) {
            Object objA = ozm.a(jSONArray, i2);
            if (objA == null) {
                return;
            }
            JSONObject jSONObject = (JSONObject) objA;
            String strB = ozm.b(jSONObject, "type");
            if ("app".equals(strB)) {
                JSONArray jSONArrayC = ozm.c(jSONObject, "package_info");
                String strB2 = ozm.b(jSONObject, "app_server");
                JSONArray jSONArrayO = o(jSONArrayC, DBHealthIndicatorDetail.SORT);
                boolean z2 = false;
                if (jSONArrayO.length() > 0) {
                    int length = jSONArrayO.length();
                    int i3 = 0;
                    boolean z3 = false;
                    while (true) {
                        if (i3 >= length) {
                            z2 = z3;
                            break;
                        }
                        Object objA2 = ozm.a(jSONArrayO, i3);
                        if (objA2 != null) {
                            JSONObject jSONObject2 = (JSONObject) objA2;
                            String strB3 = ozm.b(jSONObject2, "schema");
                            String strB4 = ozm.b(jSONObject2, "sign");
                            String strB5 = ozm.b(jSONObject2, "version");
                            if (com.unionpay.utils.a.f(context, strB3) && strB4.equalsIgnoreCase(com.unionpay.utils.a.j(context, strB3)) && com.unionpay.utils.a.l(context, strB3).matches(strB5)) {
                                try {
                                    Bundle bundle = new Bundle();
                                    k(I, bundle, L);
                                    bundle.putString(a, J);
                                    bundle.putString(d, K);
                                    bundle.putString(b, I);
                                    bundle.putString(p, C);
                                    bundle.putString(r, D);
                                    if (!TextUtils.isEmpty(D)) {
                                        bundle.putString(s, x);
                                        bundle.putString(t, y);
                                        bundle.putString(u, z);
                                        bundle.putString(v, A);
                                    }
                                    bundle.putBoolean(f13263j, F);
                                    bundle.putString(o, strB2);
                                    bundle.putString(f, null);
                                    bundle.putInt(g, 0);
                                    Intent intent = new Intent();
                                    intent.putExtras(bundle);
                                    if (f13264l.equals(strB3)) {
                                        intent.setAction(m);
                                        intent.setPackage(strB3);
                                    } else {
                                        intent.setClassName(strB3, k);
                                    }
                                    Context contextG = G();
                                    if (contextG != null) {
                                        if (contextG instanceof Activity) {
                                            ((Activity) contextG).startActivityForResult(intent, G);
                                        } else {
                                            intent.addFlags(268435456);
                                            contextG.startActivity(intent);
                                        }
                                    }
                                    try {
                                        int iA = com.unionpay.utils.a.a(L);
                                        String strK = UPUtils.k(iA);
                                        f1n.b("uppay", "calling app url: " + strK);
                                        P = new wpm(strK, (byte) 0);
                                        P.b(d(G(), iA, I, strB3));
                                        Executors.newSingleThreadExecutor().execute(new ism());
                                        z2 = true;
                                        break;
                                    } catch (Exception e2) {
                                        e = e2;
                                        z3 = true;
                                        e.printStackTrace();
                                        i3++;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            }
                        }
                        i3++;
                    }
                }
                if (z2) {
                    return;
                }
            } else {
                String string = "";
                if (ConnectivityManagerProxy.NETWORK_TYPE_NAME_MOBILE_WAP.equals(strB)) {
                    if (!q.equals(C)) {
                        try {
                            string = (String) jSONObject.get("url");
                        } catch (Exception unused) {
                        }
                        l(string, ConnectivityManagerProxy.NETWORK_TYPE_NAME_MOBILE_WAP);
                        return;
                    }
                } else if ("link".equals(strB)) {
                    try {
                        string = jSONObject.getString("url");
                    } catch (Exception unused2) {
                    }
                    l(string, "link");
                    return;
                } else {
                    if ("wcd".equals(strB)) {
                        try {
                            string = jSONObject.getString("url");
                        } catch (Exception unused3) {
                        }
                        l(string, "wcd");
                        return;
                    }
                    context = G();
                }
            }
            jSONArray = U;
            i2 = M + 1;
            M = i2;
        }
    }

    public static void k(String str, Bundle bundle, String str2) {
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        if (str.trim().charAt(0) != '<') {
            bundle.putString(f13265n, str2);
        } else if (str2 == null || !str2.trim().equalsIgnoreCase("00")) {
            bundle.putBoolean(f13262e, true);
        } else {
            bundle.putBoolean(f13262e, false);
        }
    }

    public static void l(String str, String str2) {
        int i2;
        Bundle bundle = new Bundle();
        if (!"link".equals(str2)) {
            k(I, bundle, L);
            bundle.putString(a, J);
            bundle.putString(d, K);
            try {
                i2 = Integer.parseInt(L);
            } catch (Exception unused) {
                i2 = 0;
            }
            if ("wcd".equals(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("os", "android");
                    jSONObject.put("tn", I);
                    bundle.putString(b, UPUtils.h(i2, com.unionpay.utils.a.i(jSONObject.toString())));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                bundle.putString(b, UPUtils.h(i2, com.unionpay.utils.a.i(I)));
            }
            bundle.putString(f13261c, I);
        }
        bundle.putString("magic_data", "949A1CC");
        bundle.putString(h, str);
        bundle.putString(i, str2);
        try {
            Context contextG = G();
            if (contextG != null) {
                Intent intent = new Intent();
                intent.putExtras(bundle);
                intent.setClass(contextG, UPPayWapActivity.class);
                if (contextG instanceof Activity) {
                    ((Activity) contextG).startActivityForResult(intent, G);
                } else {
                    intent.addFlags(268435456);
                    contextG.startActivity(intent);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public static String n(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        int i2;
        int i3;
        Resources resources;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v", "1.5");
            jSONObject.put("sdkVerMode", "02");
            jSONObject.put("os_name", "android");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("tn", UPUtils.h(com.unionpay.utils.a.a(str), com.unionpay.utils.a.i(str2)));
            }
            jSONObject.put("appUuId", jsm.f(context));
            try {
                jSONObject.put(CityBean.LOCALE, Locale.getDefault().toString().startsWith("zh") ? "zh_CN" : "en_US");
                jSONObject.put("terminal_version", VERSION);
                if (context == null || (resources = context.getResources()) == null) {
                    i2 = 0;
                    i3 = 0;
                } else {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = displayMetrics.widthPixels;
                    i3 = displayMetrics.heightPixels;
                }
                jSONObject.put("terminal_resolution", (i2 + "*" + i3).trim());
                jSONObject.put("os_version", jsm.a());
                jSONObject.put(va5.TAG_DEVICE_MODEL, jsm.e());
                jSONObject.put("root", new File("/system/bin/su").exists() ? "1" : "0");
                jSONObject.put("country", com.unionpay.utils.a.m(Locale.getDefault().getCountry()));
                jSONObject.put("package", com.unionpay.utils.a.m(jsm.b(context)));
                jSONObject.put("sign", jsm.c(context, com.unionpay.utils.a.m(jsm.b(context)), gc0.SHA256));
                String upperCase = Build.MANUFACTURER;
                if (!TextUtils.isEmpty(upperCase)) {
                    upperCase = upperCase.toUpperCase();
                }
                jSONObject.put("phone_model", upperCase);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            jSONObject.put("vendorCapacity", str4);
            if (!TextUtils.isEmpty(null)) {
                jSONObject.put("randKey", UPUtils.h(com.unionpay.utils.a.a(str), com.unionpay.utils.a.i(null)));
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("has_sdk", str3);
            }
            if (!TextUtils.isEmpty(null)) {
                jSONObject.put("merId", (Object) null);
            }
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("isLimitSe", str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                jSONObject.put("seType", com.unionpay.utils.a.k(str6));
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static JSONArray o(JSONArray jSONArray, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; jSONArray != null && i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.optJSONObject(i2));
        }
        Collections.sort(arrayList, new vum(str));
        JSONArray jSONArray2 = new JSONArray();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            jSONArray2.put((JSONObject) arrayList.get(i3));
        }
        return jSONArray2;
    }

    public static void r(String str) {
        int i2;
        try {
            i2 = Integer.parseInt(L);
        } catch (Exception unused) {
            i2 = 0;
        }
        String strA = UPUtils.a(i2);
        f1n.b("uppay", "url: " + strA);
        P = new wpm(strA, (byte) 0);
        P.b(e(G(), false, str));
        if (Q == null) {
            Q = new Handler(V);
        }
        Executors.newSingleThreadExecutor().execute(new mim());
    }

    public static void t(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            x = jSONObject.getString("titleLogo");
            y = jSONObject.getString("loadingLogo");
            z = jSONObject.getString("backGroundColor");
            A = jSONObject.getString(ParserTag.TAG_TEXT_COLOR);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ boolean z() {
        N = true;
        return true;
    }
}
