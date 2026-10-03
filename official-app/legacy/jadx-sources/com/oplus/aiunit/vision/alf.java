package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.drs.base.util.SystemProperty;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class alf {
    public static final String AE = "AE";
    public static final String BH = "BH";
    public static final String BR = "BR";
    public static final String BY = "BY";
    public static final String CA = "CA";
    public static final String CN = "CN";
    public static final String CO = "CO";
    public static final String DZ = "DZ";
    public static final String EG = "EG";
    public static final String ID = "ID";
    public static final String IN = "IN";
    public static final String IQ = "IQ";
    public static final String JO = "JO";
    public static final String KW = "KW";
    public static final String KZ = "KZ";
    public static final String LB = "LB";
    public static final String MX = "MX";
    public static final String MY = "MY";
    public static final String OC = "OC";
    public static final String OM = "OM";
    public static final String PH = "PH";
    public static final String PS = "PS";
    public static final String QA = "QA";
    public static final String RU = "RU";
    public static final String SA = "SA";
    public static final String SG = "SG";
    public static final String SY = "SY";
    public static final String TH = "TH";
    public static final String TR = "TR";
    public static final String TW = "TW";
    public static final String US = "US";
    public static final String VN = "VN";
    public static final String VODAFONE = "Vodafone";
    public static volatile String a = "";
    public static final List<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<String> f9424c;
    public static final List<String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<String> f9425e;
    public static final List<String> f;
    public static final List<String> g;

    static {
        ArrayList arrayList = new ArrayList();
        b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f9424c = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        d = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        f9425e = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        f = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        g = arrayList6;
        arrayList.add("EUEX");
        arrayList.add("EUEX-ALL-CUST");
        arrayList.add("AT");
        arrayList.add("BE");
        arrayList.add("DK");
        arrayList.add("FI");
        arrayList.add("PL");
        arrayList.add("EE");
        arrayList.add("FR");
        arrayList.add("NL");
        arrayList.add("IE");
        arrayList.add("BG");
        arrayList.add("DE");
        arrayList.add("LV");
        arrayList.add("SE");
        arrayList.add("GR");
        arrayList.add("SI");
        arrayList.add("LU");
        arrayList.add("IT");
        arrayList.add("PT");
        arrayList.add(apj.Thread_Type_Executor_Single);
        arrayList.add("HU");
        arrayList.add("SK");
        arrayList.add("CY");
        arrayList.add("CZ");
        arrayList.add("LT");
        arrayList.add("RO");
        arrayList.add("HR");
        arrayList.add("MT");
        arrayList.add(TR);
        arrayList.add("CH");
        arrayList.add("GB");
        arrayList.add("NO");
        arrayList.add("MD");
        arrayList.add("IS");
        arrayList.add("LI");
        arrayList2.add(US);
        arrayList2.add(CA);
        arrayList5.addAll(arrayList);
        arrayList5.add(IN);
        arrayList5.add(VN);
        arrayList5.add(TH);
        arrayList5.add(MY);
        arrayList5.add(PH);
        arrayList5.add(ID);
        arrayList5.add(BR);
        arrayList5.add(MX);
        arrayList5.add(CO);
        arrayList5.add(EG);
        arrayList6.add(RU);
        arrayList3.add(EG);
        arrayList3.add(DZ);
        arrayList3.add(AE);
        arrayList3.add(OM);
        arrayList3.add(QA);
        arrayList3.add(KW);
        arrayList3.add(BH);
        arrayList3.add(SA);
        arrayList3.add("LB");
        arrayList3.add(SY);
        arrayList3.add(IQ);
        arrayList3.add(JO);
        arrayList3.add(PS);
        arrayList4.add(TR);
        arrayList4.add(RU);
        arrayList4.add(US);
        arrayList4.add(BY);
        arrayList4.add(KZ);
    }

    public static String a() {
        return a;
    }

    public static String b() {
        String strD = d();
        if (!TextUtils.isEmpty(strD)) {
            z6b.t("Track.RegionUtil", "==== getRegion【" + strD + "】 from RegionMark");
            return strD;
        }
        String strC = c();
        if (TextUtils.isEmpty(strC)) {
            return "";
        }
        z6b.t("Track.RegionUtil", "==== getRegion【" + strC + "】 from UserRegionCode");
        return strC;
    }

    public static String c() {
        String str = SystemProperty.get(l04.REGION_OPLUS_PROPERTIES, "");
        if (TextUtils.isEmpty(str)) {
            str = SystemProperty.get(l04.REGION_PROPERTIES, "");
        }
        return TextUtils.isEmpty(str) ? SystemProperty.get(l04.REGION_OEM_PROPERTIES, "") : str;
    }

    public static String d() {
        String str = SystemProperty.get(l04.REGION_MASK_PROPERTIES_PIPELINE_R, "");
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = SystemProperty.get(l04.REGION_MASK_PROPERTIES_R, "");
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String str3 = SystemProperty.get(l04.REGION_MASK_PROPERTIES_Q, "");
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        String str4 = SystemProperty.get(l04.REGION_MASK_PROPERTIES_VENDOR_R, "");
        if (!TextUtils.isEmpty(str4)) {
            return str4;
        }
        String str5 = SystemProperty.get(l04.REGION_MASK_PROPERTIES_VENDOR_Q, "");
        if (!TextUtils.isEmpty(str5)) {
            return str5;
        }
        if (!o52.h()) {
            String str6 = SystemProperty.get(l04.REGION_MASK_AOSP, "");
            if (!TextUtils.isEmpty(str6)) {
                return str6;
            }
        }
        return SystemProperty.get(l04.REGION_OEM_PROPERTIES, "");
    }

    public static boolean e() {
        String strB = b();
        return "OC".equalsIgnoreCase(strB) || "CN".equalsIgnoreCase(strB);
    }

    public static boolean f() {
        return b.contains(b().toUpperCase());
    }

    public static boolean g(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return b.contains(str.toUpperCase());
    }

    public static boolean h() {
        return f9424c.contains(b().toUpperCase());
    }

    public static void i(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        a = str;
    }
}
