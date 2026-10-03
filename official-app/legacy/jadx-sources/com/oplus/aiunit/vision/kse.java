package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.webpro.preload.res.db.PreloadResBase;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class kse {
    public static final kse b = new kse();
    public final ArrayList<String> a;

    public kse() {
        PreloadResBase.e();
        this.a = new ArrayList<>();
    }

    public static kse b() {
        return b;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.add(str);
    }

    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it = this.a.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, it.next())) {
                return true;
            }
        }
        return false;
    }
}
