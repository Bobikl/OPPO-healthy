package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes15.dex */
public class a78 {
    public static void a(Context context, int i, ImageView imageView) {
        com.bumptech.glide.a.v(context).o(Integer.valueOf(i)).j(ut5.RESOURCE).Q0(imageView);
    }

    public static void b(Context context, String str, int i, ImageView imageView) {
        com.bumptech.glide.a.v(context).q(str).q(i).s0(true).j(ut5.NONE).Q0(imageView);
    }

    public static void c(Context context, String str, ImageView imageView) {
        com.bumptech.glide.a.v(context).q(str).Q0(imageView);
    }

    public static void d(Context context, String str, ImageView imageView, int i) {
        com.bumptech.glide.a.v(context).q(str).f0(i).j(ut5.RESOURCE).Q0(imageView);
    }

    public static void e(Context context, Fragment fragment, String str, ImageView imageView, int i) {
        vqf vqfVarX;
        if (context != null) {
            vqfVarX = com.bumptech.glide.a.v(context);
        } else {
            vqfVarX = fragment != null ? com.bumptech.glide.a.x(fragment) : null;
        }
        if (vqfVarX == null) {
            return;
        }
        vqfVarX.q(str).h0(i).j(ut5.RESOURCE).Q0(imageView);
    }

    public static void f(Context context, String str, int i, ImageView imageView) {
        com.bumptech.glide.a.v(context).q(str).h0(i).j(ut5.RESOURCE).Q0(imageView);
    }

    public static void g(Context context, String str, int i, j4h<Bitmap> j4hVar) {
        com.bumptech.glide.a.v(context).b().h0(i).q(i).Y0(str).k().j(ut5.DATA).N0(j4hVar);
    }

    public static void h(Context context, String str, ImageView imageView) {
        com.bumptech.glide.a.v(context).q(str).j(ut5.RESOURCE).Q0(imageView);
    }

    public static void i(Context context, String str, j4h<Bitmap> j4hVar) {
        com.bumptech.glide.a.v(context).b().Y0(str).N0(j4hVar);
    }

    public static void j(Context context, String str, j4h<Bitmap> j4hVar, int i) {
        com.bumptech.glide.a.v(context).b().Y0(str).f0(i).N0(j4hVar);
    }

    public static void k(Context context, String str, j4h<Bitmap> j4hVar, int i, int i2) {
        com.bumptech.glide.a.v(context).b().Y0(str).g0(i, i2).N0(j4hVar);
    }

    public static void l(Context context, String str, int i, int i2, int i3, ImageView imageView) {
        com.bumptech.glide.a.v(context).q(str).h0(i).g0(i2, i3).c().j(ut5.RESOURCE).Q0(imageView);
    }

    public static void m(Context context, String str, int i, int i2, eg4<Bitmap> eg4Var) {
        com.bumptech.glide.a.v(context).b().Y0(str).g0(i, i2).N0(eg4Var);
    }
}
