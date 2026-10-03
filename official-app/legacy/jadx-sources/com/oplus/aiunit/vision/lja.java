package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.heytap.webpro.score.DomainScoreEntity;
import com.heytap.webpro.score.WebProScoreManager;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class lja {

    public static class b {
        public final String a;

        public b a(List<DomainScoreEntity> list) {
            WebProScoreManager.d().a(list);
            return this;
        }

        public b b(@NonNull rr9 rr9Var) {
            oja.c().b(this.a, rr9Var);
            return this;
        }

        public void c() {
            m48.a();
        }

        public b d(String str) {
            WebProScoreManager.d().k(str);
            return this;
        }

        public b(@NonNull Context context, @NonNull String str) {
            d94.c(context);
            this.a = str;
        }
    }

    static {
        oja.c().a(new wee());
        oja.c().a(new h6b());
        oja.c().a(new rb1());
        oja.c().a(new w0k());
        oja.c().a(new amd());
    }

    public static b a(@NonNull Context context, @NonNull String str) {
        return new b(context, str);
    }
}
