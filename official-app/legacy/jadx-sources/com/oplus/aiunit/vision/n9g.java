package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes19.dex */
public class n9g {
    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    public static void a(String str) {
        String strB = ybb.b(str);
        v9g v9gVarG = g();
        String[] strArrP = v9gVarG.p();
        if (strArrP == null) {
            return;
        }
        for (String str2 : strArrP) {
            if (str2.startsWith("tag_individual_timestamp" + strB)) {
                v9gVarG.a0(str2);
            } else {
                if (str2.startsWith("tag_individual_preview_url" + strB)) {
                    v9gVarG.a0(str2);
                } else {
                    if (str2.startsWith("tag_wf_edit_res_md5" + strB)) {
                        v9gVarG.a0(str2);
                    } else {
                        if (str2.startsWith("tag_wf_edit_widgets_res_md5" + strB)) {
                            v9gVarG.a0(str2);
                        }
                    }
                }
            }
        }
    }

    public static String b(String str, kvi kviVar) {
        return h(kviVar.b0()).E(str, "");
    }

    public static String c(Context context, String str, String str2) {
        return h(str).E(str2, "");
    }

    public static long d(String str, String str2) {
        return h(str).B(str2, 0L);
    }

    public static long e(Context context, String str, kvi kviVar) {
        return d(kviVar.b0(), "tag_manager_resource_download_url" + str);
    }

    public static boolean f(Context context) {
        return g().r("tag_outfits_first_flag", true);
    }

    public static v9g g() {
        return v9g.x("sp_pwatch_face");
    }

    public static v9g h(String str) {
        return v9g.x(str);
    }

    public static String i(Context context, String str, String str2) {
        return h(str).E(str2, "");
    }

    public static long j(String str, String str2) {
        return g().B("tag_individual_timestamp" + str + str2, 0L);
    }

    public static boolean k(Context context) {
        return g().r("tag_move_old_data", false);
    }

    public static boolean l() {
        return g().r("tag_paint_need_guide", true);
    }

    public static void m(String str, String str2) {
        h(str).a0(str2);
    }

    public static void n(Context context, String str, String str2) {
        m(str2, "tag_manager_resource_download_url" + str);
    }

    public static void o(String str, String str2, kvi kviVar) {
        s(b78.a(), kviVar.b0(), str, str2);
    }

    public static void p(Context context, String str, String str2, String str3) {
        h(str).U(str2, str3);
    }

    public static void q(Context context, String str, String str2, long j2) {
        h(str).T(str2, j2);
    }

    public static void r(Context context, String str, long j2, String str2) {
        q(context, str2, "tag_manager_resource_download_url" + str, j2);
    }

    public static void s(Context context, String str, String str2, String str3) {
        h(str).U(str2, str3);
    }

    public static void t(Context context, boolean z) {
        g().W("tag_move_old_data", z);
    }

    public static void u(Context context, boolean z) {
        g().W("tag_outfits_first_flag", z);
    }

    public static boolean v() {
        return g().r("tag_paint_auto_tip", true);
    }

    public static void w() {
        g().W("tag_paint_auto_tip", false);
    }

    public static void x() {
        g().W("tag_paint_need_guide", false);
    }

    public static void y(String str, String str2, long j2) {
        g().T("tag_individual_timestamp" + str + str2, j2);
    }
}
