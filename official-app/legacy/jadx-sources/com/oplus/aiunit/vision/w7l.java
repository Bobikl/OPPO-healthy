package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public class w7l {
    public static final String TAG = "WallpaperResHelper";

    public static void a(String str, String str2, int i) throws Throwable {
        Context contextA = b78.a();
        s3 s3VarB0 = grl.a(str).B0();
        if (s3VarB0 == null) {
            ltl.b(TAG, "[insertDefaultRecord] creationWfConfig=null and return.");
            return;
        }
        int[] iArr = s3VarB0.a().b().get(lo9.TAG_DEFAULT_CREATION_WALLPAPER);
        int[] iArr2 = s3VarB0.a().e().get(lo9.TAG_DEFAULT_CREATION_WALLPAPER);
        String strF = x7l.f(contextA, str);
        String strA = x7l.a(contextA, str);
        int i2 = 2;
        while (i2 > -1) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(contextA.getResources(), iArr2[i2]);
            Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(contextA.getResources(), iArr[i2]);
            if (i2 == 0) {
                cg1.F(bitmapDecodeResource, strF);
                cg1.F(bitmapDecodeResource, strA);
            }
            b(true, str, i2 != 0 ? UUID.randomUUID().toString().replaceAll("-", "") : str2, strF, c(contextA, cg1.u(bitmapDecodeResource, bitmapDecodeResource2), str), i);
            i2--;
        }
    }

    public static void b(boolean z, String str, String str2, String str3, String str4, int i) {
        ud4 ud4Var = new ud4();
        ud4Var.a = str;
        ud4Var.h = 3;
        ud4Var.f17423c = z ? "" : str3;
        ud4Var.b = str2;
        ud4Var.g = com.heytap.health.watchface.business.creation.db.a.a().k() - 1;
        ud4Var.f17424e = str3;
        ud4Var.d = str4;
        ud4Var.i = String.valueOf(i);
        com.heytap.health.watchface.business.creation.db.a.a().n(ud4Var);
    }

    public static String c(Context context, Bitmap bitmap, String str) throws Throwable {
        String strJ = x7l.j(context, str, UUID.randomUUID().toString().replaceAll("-", ""));
        cg1.F(bitmap, strJ);
        return strJ;
    }

    public static void d(String str, String str2, String str3, Bitmap bitmap) {
        Context contextA = b78.a();
        List<ud4> listW = com.heytap.health.watchface.business.creation.db.a.a().w(3, str);
        s3 s3VarB0 = grl.a(str).B0();
        if (s3VarB0 == null) {
            ltl.b(TAG, "[insertDefaultRecord] creationWfConfig=null and return.");
            return;
        }
        int[] iArr = s3VarB0.a().b().get(lo9.TAG_DEFAULT_CREATION_WALLPAPER);
        if (listW == null || listW.isEmpty()) {
            int i = 2;
            while (i > -1) {
                b(false, str, i != 0 ? UUID.randomUUID().toString().replaceAll("-", "") : str2, str3, c(contextA, cg1.u(bitmap, BitmapFactory.decodeResource(contextA.getResources(), iArr[i])), str), 0);
                i--;
            }
            return;
        }
        if (listW.size() != 3) {
            ltl.i(TAG, "incorrect wallpaper record size: " + listW.size());
            return;
        }
        for (int i2 = 2; i2 > -1; i2--) {
            ud4 ud4Var = listW.get(i2);
            wd7.g(ud4Var.d);
            ud4Var.d = c(contextA, cg1.u(bitmap, BitmapFactory.decodeResource(contextA.getResources(), iArr[i2])), str);
            ud4Var.f17424e = str3;
            ud4Var.f17423c = str3;
            com.heytap.health.watchface.business.creation.db.a.a().n(ud4Var);
        }
    }
}
