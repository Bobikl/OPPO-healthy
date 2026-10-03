package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class zaf {

    public interface a {
        void a(Context context, String[] strArr, String str, File file, abf abfVar);
    }

    public interface b {
        void a(String str);

        String b(String str);

        String[] c();

        void d(String str);

        String e(String str);
    }

    public interface c {
        void a(Throwable th);

        void success();
    }

    public static void a(Context context, String str) {
        c(context, str, null, null);
    }

    public static void b(Context context, String str, c cVar) {
        c(context, str, null, cVar);
    }

    public static void c(Context context, String str, String str2, c cVar) {
        new abf().f(context, str, str2, cVar);
    }
}
