package com.heytap.health.settings.band.utils;

import com.heytap.health.settings.band.settings.sporthealthsetting.appsedit.AppEditPresenter;
import com.oplus.aiunit.vision.m3c;
import com.oplus.aiunit.vision.rjk;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.x9f;

/* JADX INFO: loaded from: classes17.dex */
public class Bandsp {
    public static String TAGNAME = "comheytaphealthband";

    public enum SpName {
        RAISEMANAGER,
        MOREMANAGER,
        OTA,
        BAND_FACEIMG
    }

    public static void a(String str) {
        v9g v9gVarC = c(SpName.MOREMANAGER);
        v9gVarC.a0(b(str, rjk.TAG));
        v9gVarC.a0(b(str, m3c.TAG));
        v9gVarC.a0(b(str, AppEditPresenter.TAG));
        v9g v9gVarC2 = c(SpName.RAISEMANAGER);
        v9gVarC2.a0(b(str, x9f.NIGHT));
        v9gVarC2.a0(b(str, x9f.RAISE));
    }

    public static String b(String str, String str2) {
        return str + str2;
    }

    public static v9g c(SpName spName) {
        return v9g.x(TAGNAME + spName);
    }
}
