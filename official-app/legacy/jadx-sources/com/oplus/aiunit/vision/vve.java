package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class vve {
    public static final int ID_DEVICE = 2;
    public static final int ID_HEALTH = 1;

    public static boolean a(int i) {
        if (m3k.g()) {
            a7b.f("TouristPolicyDialogSPHelper", "getModulePolicy has agree total protocol,set device and health true");
            b(1, true);
            return true;
        }
        boolean zH = i == 1 ? m3k.h() : m3k.g();
        a7b.f("TouristPolicyDialogSPHelper", "getModulePolicy moduleId::" + i + ",agree:" + zH);
        return zH;
    }

    public static void b(int i, boolean z) {
        a7b.f("TouristPolicyDialogSPHelper", "setModulePolicy moduleId:" + i + ",agree:" + z);
        if (i == 1) {
            m3k.n(z);
        } else {
            m3k.m(z);
        }
    }
}
