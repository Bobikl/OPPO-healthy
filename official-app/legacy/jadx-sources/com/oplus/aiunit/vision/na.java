package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class na {
    public final List<ml9> a;

    public static class b {
        public static final na a = new na();
    }

    public static na b() {
        return b.a;
    }

    @Nullable
    public ll9 a(int i) {
        Iterator<ml9> it = this.a.iterator();
        while (it.hasNext()) {
            ll9 ll9VarCreate = it.next().create(i);
            if (ll9VarCreate != null) {
                return ll9VarCreate;
            }
        }
        AcLogUtil.e("AcIpcExecuteManager", "createExecutor error, no factory for this type " + i);
        return null;
    }

    public void c(ml9 ml9Var) {
        this.a.add(ml9Var);
    }

    public na() {
        this.a = new ArrayList();
    }
}
