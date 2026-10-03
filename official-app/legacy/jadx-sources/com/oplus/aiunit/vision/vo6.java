package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes15.dex */
public class vo6 {

    public interface a {
        void onResult(String str);
    }

    public static String b(Context context, String str) {
        return to6.d(context).e(str);
    }

    public static void c(final String str, final a aVar) {
        if (aVar != null) {
            f5h.e(new o6h() { // from class: com.oplus.aiunit.vision.uo6
                @Override // com.oplus.aiunit.vision.o6h
                public final void a(x5h x5hVar) throws Throwable {
                    vo6.d(aVar, str, x5hVar);
                }
            }).y(su8.c()).v();
        }
    }

    public static /* synthetic */ void d(a aVar, String str, x5h x5hVar) throws Throwable {
        aVar.onResult(to6.d(b78.a()).e(str));
    }
}
