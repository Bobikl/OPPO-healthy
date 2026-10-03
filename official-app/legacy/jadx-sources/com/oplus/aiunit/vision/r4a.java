package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.DecodeFormat;

/* JADX INFO: loaded from: classes15.dex */
public class r4a {

    public interface a {
        zqf a(zqf zqfVar);
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public static void b(Context context, String str, int i, uqf<Drawable> uqfVar) {
        com.bumptech.glide.a.v(context).q(str).S0(uqfVar).a(new zqf().j(ut5.DATA).u0(i)).c1();
    }

    public static void c(Context context, Object obj, int i, x9k<Bitmap> x9kVar, uqf<Drawable> uqfVar) {
        com.bumptech.glide.a.v(context).p(obj).S0(uqfVar).a(new zqf().w0(x9kVar).j(ut5.RESOURCE).u0(i).u(DecodeFormat.PREFER_RGB_565)).c1();
    }

    public static void d(Context context, String str, int i, uqf<Drawable> uqfVar) {
        com.bumptech.glide.a.v(context).q(str).S0(uqfVar).a(new zqf().j(ut5.DATA).u0(i).u(DecodeFormat.PREFER_RGB_565)).c1();
    }

    public static void e(Context context, Object obj, ImageView imageView) {
        f(context, obj, imageView, null);
    }

    public static void f(Context context, Object obj, ImageView imageView, zqf zqfVar) {
        if (!a(context)) {
            a7b.f("ImageShowUtil", "[show] context is invalid.");
        } else {
            if (imageView == null) {
                a7b.b("ImageShowUtil", "[show] iv is null");
                return;
            }
            if (zqfVar == null) {
                zqfVar = new zqf();
            }
            com.bumptech.glide.a.v(context).p(obj).a(zqfVar).Q0(imageView);
        }
    }

    public static void g(Context context, Object obj, zqf zqfVar, eg4<Drawable> eg4Var) {
        if (!a(context)) {
            a7b.f("ImageShowUtil", "[show] context is invalid.");
            return;
        }
        if (zqfVar == null) {
            zqfVar = new zqf();
        }
        com.bumptech.glide.a.v(context).p(obj).a(zqfVar).N0(eg4Var);
    }

    public static void h(Context context, Object obj, ImageView imageView, zqf zqfVar) {
        if (!a(context)) {
            a7b.f("ImageShowUtil", "[show] context is invalid.");
            return;
        }
        if (zqfVar == null) {
            zqfVar = new zqf();
        }
        com.bumptech.glide.a.v(context).b().X0(obj).a(zqfVar).Q0(imageView);
    }

    public static void i(Context context, String str, ImageView imageView, zqf zqfVar) {
        if (zqfVar == null) {
            zqfVar = new zqf();
        }
        scg.d(imageView, str, zqfVar);
    }

    public static void j(Context context, Object obj, ImageView imageView) {
        l(context, obj, imageView, null);
    }

    public static void k(Context context, Object obj, ImageView imageView, zqf zqfVar) {
        f(context, obj, imageView, zqfVar.j(ut5.DATA));
    }

    public static void l(Context context, Object obj, ImageView imageView, a aVar) {
        zqf zqfVarJ = new zqf().t().j(ut5.DATA);
        if (aVar != null) {
            zqfVarJ = aVar.a(zqfVarJ);
        }
        f(context, obj, imageView, zqfVarJ);
    }
}
