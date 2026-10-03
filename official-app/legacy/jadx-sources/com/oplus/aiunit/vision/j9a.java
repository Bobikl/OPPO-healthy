package com.oplus.aiunit.vision;

import android.content.Context;
import com.amap.api.services.help.Tip;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class j9a {
    public br9 a;

    public interface a {
        void a(List<Tip> list, int i);
    }

    public j9a(Context context, k9a k9aVar) {
        this.a = null;
        try {
            this.a = new com.amap.api.col.p0003sl.c0(context, k9aVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a() {
        br9 br9Var = this.a;
        if (br9Var != null) {
            br9Var.b();
        }
    }

    public final void b(a aVar) {
        br9 br9Var = this.a;
        if (br9Var != null) {
            br9Var.a(aVar);
        }
    }
}
