package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wtd {
    public static void a(kvi kviVar, List<String> list) {
        String strI = kviVar.i();
        if (strI == null) {
            return;
        }
        if (list.size() <= 5) {
            list.add(strI);
        } else {
            list.remove(5);
            list.add(5, strI);
        }
    }
}
