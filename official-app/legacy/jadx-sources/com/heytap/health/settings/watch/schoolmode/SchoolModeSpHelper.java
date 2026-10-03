package com.heytap.health.settings.watch.schoolmode;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.settings.watch.schoolmode.bean.AppItemBean;
import com.heytap.health.settings.watch.schoolmode.bean.DefaultAppInfo;
import com.heytap.health.settings.watch.schoolmode.bean.SchoolModeConfig;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ct7;
import com.oplus.aiunit.vision.lc1;
import com.oplus.aiunit.vision.v9g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SchoolModeSpHelper {
    public static void a(String str) {
        a7b.f("school.SpHelper", "SchoolModeClear");
        l(str, false);
        o(str, 0L);
        n(str, null);
        m(str, null);
        i(str, null);
        k(str, null);
        p(str, 0L);
    }

    public static List<AppItemBean> b(String str) {
        List<AppItemBean> list;
        try {
            list = (List) new Gson().fromJson(v9g.x("sp_name_school_mode").D(str + "_applist"), new TypeToken<List<AppItemBean>>() { // from class: com.heytap.health.settings.watch.schoolmode.SchoolModeSpHelper.1
            }.getType());
        } catch (Exception e2) {
            a7b.m("school.SpHelper", "getAppItemList error:" + e2.getMessage());
            list = null;
        }
        return list == null ? new ArrayList() : list;
    }

    public static lc1 c(String str) {
        lc1 lc1Var;
        try {
            lc1Var = (lc1) new Gson().fromJson(v9g.x("sp_name_school_mode").D(str + "_batteryProtect"), new TypeToken<lc1>() { // from class: com.heytap.health.settings.watch.schoolmode.SchoolModeSpHelper.4
            }.getType());
        } catch (Exception e2) {
            a7b.b("school.SpHelper", "getBatteryProtect para:" + e2.getMessage());
            lc1Var = null;
        }
        return lc1Var == null ? new lc1() : lc1Var;
    }

    public static List<DefaultAppInfo> d(String str) {
        List<DefaultAppInfo> list;
        try {
            list = (List) new Gson().fromJson(v9g.x("sp_name_school_mode").D(str + "_clouldApplist"), new TypeToken<List<DefaultAppInfo>>() { // from class: com.heytap.health.settings.watch.schoolmode.SchoolModeSpHelper.2
            }.getType());
        } catch (Exception e2) {
            a7b.m("school.SpHelper", "getAppItemList error:" + e2.getMessage());
            list = null;
        }
        return list == null ? new ArrayList() : list;
    }

    public static ct7 e(String str) {
        ct7 ct7Var;
        try {
            ct7Var = (ct7) new Gson().fromJson(v9g.x("sp_name_school_mode").D(str + "_flightMode"), new TypeToken<ct7>() { // from class: com.heytap.health.settings.watch.schoolmode.SchoolModeSpHelper.3
            }.getType());
        } catch (Exception e2) {
            a7b.b("school.SpHelper", "getFlightMode para:" + e2.getMessage());
            ct7Var = null;
        }
        return ct7Var == null ? new ct7() : ct7Var;
    }

    public static SchoolModeConfig f(String str) {
        SchoolModeConfig schoolModeConfig;
        try {
            schoolModeConfig = (SchoolModeConfig) new Gson().fromJson(v9g.x("sp_name_school_mode").D(str + "_config"), new TypeToken<SchoolModeConfig>() { // from class: com.heytap.health.settings.watch.schoolmode.SchoolModeSpHelper.5
            }.getType());
        } catch (Exception e2) {
            a7b.b("school.SpHelper", "getSchoolModeConfig para:" + e2.getMessage());
            schoolModeConfig = null;
        }
        return schoolModeConfig == null ? new SchoolModeConfig() : schoolModeConfig;
    }

    public static long g(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return v9g.x("sp_name_school_mode").B(str + "_newTimeStamp", 0L);
    }

    public static void h(String str) {
        SchoolModeConfig schoolModeConfigF = f(str);
        if (schoolModeConfigF != null) {
            schoolModeConfigF.setEnable(false);
            n(str, schoolModeConfigF);
        }
    }

    public static void i(String str, List<AppItemBean> list) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String json = list != null ? new Gson().toJson(list) : "";
        v9g.x("sp_name_school_mode").U(str + "_applist", json);
    }

    public static void j(String str, lc1 lc1Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String json = lc1Var != null ? new Gson().toJson(lc1Var) : "";
        v9g.x("sp_name_school_mode").U(str + "_batteryProtect", json);
    }

    public static void k(String str, List<DefaultAppInfo> list) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String json = list != null ? new Gson().toJson(list) : "";
        v9g.x("sp_name_school_mode").U(str + "_clouldApplist", json);
    }

    public static void l(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strE = v9g.x("sp_name_school_mode").E("_syncState", "");
        if (!z) {
            v9g.x("sp_name_school_mode").U("_syncState", strE.replace(str.concat("/"), ""));
        } else {
            if (strE.contains(str)) {
                return;
            }
            v9g.x("sp_name_school_mode").U("_syncState", strE.concat(str).concat("/"));
        }
    }

    public static void m(String str, ct7 ct7Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String json = ct7Var != null ? new Gson().toJson(ct7Var) : "";
        v9g.x("sp_name_school_mode").U(str + "_flightMode", json);
    }

    public static void n(String str, SchoolModeConfig schoolModeConfig) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String json = schoolModeConfig != null ? new Gson().toJson(schoolModeConfig) : "";
        v9g.x("sp_name_school_mode").U(str + "_config", json);
    }

    public static void o(String str, long j2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        v9g.x("sp_name_school_mode").T(str + "_newTimeStamp", j2);
    }

    public static void p(String str, long j2) {
        v9g.x("sp_name_school_mode").T(str + "_lastQueryNetData", j2);
    }
}
