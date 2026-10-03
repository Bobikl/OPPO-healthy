package com.garmin.fit;

import com.oplus.aiunit.vision.a2f;
import com.oplus.aiunit.vision.ksk;
import com.oplus.aiunit.vision.osk;

/* JADX INFO: loaded from: classes13.dex */
public class g {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Fit.ProtocolVersion.values().length];
            a = iArr;
            try {
                iArr[Fit.ProtocolVersion.V1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static a2f a(Fit.ProtocolVersion protocolVersion) {
        return a.a[protocolVersion.ordinal()] != 1 ? new osk() : new ksk();
    }
}
