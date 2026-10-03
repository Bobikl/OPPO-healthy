package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class jaf {

    public static abstract class a {
        public abstract c a();

        public abstract a b(String str, String str2);

        public abstract a c(String str, String str2);

        public abstract a d(String str, String str2);

        public abstract a e(String str, String str2);

        public abstract a f(kt2 kt2Var);

        public abstract a g(String str);

        public abstract a h();
    }

    public interface b {
        void onStat(Map<String, String> map);
    }

    public static abstract class c {
        public abstract void a(Context context);

        public abstract void b(Context context);
    }

    public static a a(String str, String str2) {
        return new nmm(str, str2);
    }

    public static boolean b(Context context) {
        return yan.d(context);
    }

    public static boolean c(String str) {
        return z5n.p(str);
    }

    public static boolean d(Context context) {
        return com.oplus.quickgame.sdk.engine.utils.a.j(context);
    }

    public static boolean e(Context context) {
        String strK = com.oplus.quickgame.sdk.engine.utils.a.k(context);
        if (TextUtils.isEmpty(strK)) {
            return false;
        }
        return com.oplus.quickgame.sdk.engine.utils.a.f(strK);
    }
}
