package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.SparseArray;
import com.heytap.health.wallet.model.db.WalletDatabase;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class k6l {
    public a7l a;
    public SparseArray<String> b = new SparseArray<>();

    public static class a {
        public static final k6l a = new k6l();
    }

    public static k6l c() {
        return a.a;
    }

    public lz2 a() {
        return WalletDatabase.INSTANCE.a(qz0.mContext).f();
    }

    public HashMap<String, String> b(long j2) {
        if (this.a == null) {
            this.a = new a7l();
        }
        return this.a.c(j2);
    }

    public String d() {
        String str = this.b.get(0);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = String.valueOf(aec.d(qz0.mContext));
        this.b.append(0, strValueOf);
        return strValueOf;
    }

    public boolean e() {
        return Boolean.parseBoolean(d());
    }

    public boolean f() {
        return aec.g(qz0.mContext);
    }
}
