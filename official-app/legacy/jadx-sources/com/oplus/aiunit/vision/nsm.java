package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.xingin.xhssharesdk.XhsSdkInject;
import com.xingin.xhssharesdk.core.XhsShareSdk;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class nsm {
    public static /* synthetic */ Map a(gdm gdmVar) {
        HashMap map = new HashMap();
        try {
            gdmVar.a(map);
        } catch (NoSuchAlgorithmException e2) {
            XhsShareSdk.d("XhsShare_XhsShareApi", "Calculate md5 error!", e2);
        }
        return map;
    }

    public static void b(@NonNull final gdm gdmVar, @NonNull tim timVar) {
        xim.a(XhsSdkInject.getCheckTokenRequestPath(), new xim.b() { // from class: com.oplus.aiunit.vision.lrm
            @Override // com.oplus.aiunit.vision.xim.b
            public final Map a() {
                return nsm.a(gdmVar);
            }
        }, new cqm(timVar));
    }
}
