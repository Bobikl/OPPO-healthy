package com.heytap.health.bandface.utils;

import com.oplus.aiunit.vision.v9g;

/* JADX INFO: loaded from: classes15.dex */
public class Bandsp {
    public static String TAGNAME = "comheytaphealthband";

    public enum SpName {
        BAND_DIAL,
        WTACHFACE,
        BAND_FACEIMG
    }

    public static v9g a() {
        return v9g.x(TAGNAME + SpName.BAND_FACEIMG);
    }

    public static v9g b(SpName spName) {
        return v9g.x(TAGNAME + spName);
    }
}
