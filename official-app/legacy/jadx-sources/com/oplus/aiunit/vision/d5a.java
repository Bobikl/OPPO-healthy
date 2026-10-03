package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.base.view.RoundedImageView;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watch.watchface.proto.Proto$ScreenType;
import com.heytap.health.watchface.R$drawable;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import com.heytap.health.watchface.business.legacy.creation.album.bean.TimeStyleBitmaps;
import com.heytap.health.watchface.business.legacy.main.bean.WatchFaceBean;
import com.heytap.health.watchface.business.view.WatchFaceView;
import com.heytap.health.watchface.business.view.WfPreviewImageView;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public class d5a {

    public class a extends j4h<Bitmap> {
        public final /* synthetic */ View i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f10395j;

        public a(View view, String str) {
            this.i = view;
            this.f10395j = str;
        }

        @Override // com.oplus.aiunit.vision.boj
        public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable oak oakVar) {
            onResourceReady((Bitmap) obj, (oak<? super Bitmap>) oakVar);
        }

        public void onResourceReady(@NonNull Bitmap bitmap, @Nullable oak<? super Bitmap> oakVar) {
            if (TextUtils.equals((String) this.i.getTag(), this.f10395j)) {
                d5a.p(this.i, bitmap);
            }
        }
    }

    public class b extends j4h<Drawable> {
        public final /* synthetic */ ImageView i;

        public b(ImageView imageView) {
            this.i = imageView;
        }

        @Override // com.oplus.aiunit.vision.boj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(@NonNull Drawable drawable, @Nullable oak<? super Drawable> oakVar) {
            this.i.setImageDrawable(drawable);
            if (drawable instanceof Animatable) {
                ((Animatable) this.i.getDrawable()).start();
            }
        }
    }

    public class c extends j4h<Drawable> {
        public final /* synthetic */ ImageView i;

        public c(ImageView imageView) {
            this.i = imageView;
        }

        @Override // com.oplus.aiunit.vision.boj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(@NonNull Drawable drawable, @Nullable oak<? super Drawable> oakVar) {
            this.i.setImageDrawable(drawable);
            if (drawable instanceof Animatable) {
                ((Animatable) this.i.getDrawable()).start();
            }
        }
    }

    public static void d(Context context, View view, int i, String str) {
        Bitmap bitmapDecodeResource;
        view.setTag(str);
        try {
            bitmapDecodeResource = BitmapFactory.decodeFile(str);
        } catch (Exception e2) {
            ltl.i("ImageUtil", "[directLoadPreviewPic] Exception " + e2.getMessage() + ",path:" + str);
            bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        }
        if (TextUtils.equals((String) view.getTag(), str)) {
            p(view, bitmapDecodeResource);
        }
    }

    public static lbd<TimeStyleBitmaps> e(Context context, final boolean z, String str, Proto$DeviceInfo proto$DeviceInfo, final kvi kviVar) {
        return f(context, proto$DeviceInfo, str, proto$DeviceInfo.getScreenWidth(), proto$DeviceInfo.getScreenHeight()).J(new o14() { // from class: com.oplus.aiunit.vision.b5a
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                d5a.g(kviVar, z, (TimeStyleBitmaps) obj);
            }
        });
    }

    public static lbd<TimeStyleBitmaps> f(final Context context, final Proto$DeviceInfo proto$DeviceInfo, final String str, final int i, final int i2) {
        return lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.c5a
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                d5a.h(str, context, i, i2, proto$DeviceInfo, ccdVar);
            }
        });
    }

    public static /* synthetic */ void g(kvi kviVar, boolean z, TimeStyleBitmaps timeStyleBitmaps) throws Throwable {
        cg1.G(timeStyleBitmaps.getUpBitmap(), kviVar.r(z, true));
        cg1.G(timeStyleBitmaps.getDownBitmap(), kviVar.r(z, false));
    }

    public static /* synthetic */ void h(String str, Context context, int i, int i2, Proto$DeviceInfo proto$DeviceInfo, ccd ccdVar) throws Throwable {
        Bitmap bitmapB;
        int i3;
        int i4;
        if (TextUtils.isEmpty(str)) {
            bitmapB = BitmapFactory.decodeResource(context.getResources(), R$drawable.watch_face_album_error_photo);
        } else {
            int iY = cg1.y(str);
            ltl.a("ImageUtil", "[generateMergeRoundImage] degree " + iY);
            bitmapB = cg1.B(BitmapFactory.decodeFile(str), iY);
        }
        Bitmap bitmapN = cg1.n(bitmapB, i, i2);
        Bitmap bitmapK = cg1.K(bitmapN, i, i2);
        Proto$ScreenType screenType = proto$DeviceInfo.getScreenType();
        if (((Boolean) lc5.c(proto$DeviceInfo.getDeviceMac()).a(new ww())).booleanValue()) {
            i3 = R$drawable.watch_face_album_surface_realme_rs_default_up;
            i4 = R$drawable.watch_face_album_surface_realme_rs_default_down;
        } else if (screenType == Proto$ScreenType.SCREEN_TYPE_OVAL) {
            i3 = R$drawable.watch_face_album_surface_rs_default_up;
            i4 = R$drawable.watch_face_album_surface_rs_default_down;
        } else if (screenType == Proto$ScreenType.SCREEN_TYPE_SQUARE) {
            i3 = R$drawable.watch_face_album_surface_default_up;
            i4 = R$drawable.watch_face_album_surface_default_down;
        } else {
            i3 = 0;
            i4 = 0;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i3);
        Bitmap bitmapU = cg1.u(bitmapK, bitmapDecodeResource);
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(context.getResources(), i4);
        Bitmap bitmapU2 = cg1.u(bitmapK, bitmapDecodeResource2);
        cg1.A(bitmapK);
        cg1.A(bitmapN);
        cg1.A(bitmapDecodeResource);
        cg1.A(bitmapDecodeResource2);
        ccdVar.onNext(new TimeStyleBitmaps(bitmapU, bitmapU2));
        ccdVar.onComplete();
    }

    public static void i(Context context, View view, int i, String str) {
        view.setTag(str);
        a78.g(context, str, i, new a(view, str));
    }

    public static void j(Context context, String str, ImageView imageView, int i, int i2) {
        com.bumptech.glide.a.v(context).q(str).g0(i, i2).a(new zqf().j(ut5.RESOURCE).q(R$drawable.watch_face_album_error_photo)).Q0(imageView);
    }

    public static void k(Context context, String str, ImageView imageView, kvi kviVar) {
        if (new File(str).exists() || kviVar == null) {
            o(context, str, imageView, 300);
            return;
        }
        String str2 = kviVar.C() + "/" + ybb.b(str) + ".jpg";
        if (new File(str2).exists()) {
            o(context, str2, imageView, 300);
        } else {
            o(context, str, imageView, 300);
        }
    }

    public static void l(Context context, String str, ImageView imageView, kvi kviVar) {
        boolean zExists;
        File file = new File(str);
        if (file.exists() || kviVar == null) {
            zExists = false;
        } else {
            file = new File(kviVar.C() + "/" + ybb.b(str) + ".jpg");
            zExists = file.exists();
        }
        if (zExists) {
            com.bumptech.glide.a.v(context).n(file).a(new zqf().q(R$drawable.watch_face_album_error_photo)).Q0(imageView);
        } else {
            com.bumptech.glide.a.v(context).q(str).a(new zqf().j(ut5.RESOURCE).f0(300).q(R$drawable.watch_face_album_error_photo)).Q0(imageView);
        }
    }

    public static void m(Context context, ImageItem imageItem, ImageView imageView, kvi kviVar) {
        if (new File(imageItem.mUriPath).exists()) {
            o(context, imageItem.mUriPath, imageView, 300);
            return;
        }
        if (!TextUtils.isEmpty(imageItem.mCutPath) && new File(imageItem.mCutPath).exists()) {
            o(context, imageItem.mCutPath, imageView, 300);
            return;
        }
        File file = new File(kviVar.C() + "/" + ybb.b(imageItem.mUriPath) + ".jpg");
        if (file.exists()) {
            com.bumptech.glide.a.v(context).n(file).s0(true).a(new zqf().j(ut5.NONE).f0(300).q(R$drawable.watch_face_album_error_photo)).Q0(imageView);
        } else {
            o(context, imageItem.mUriPath, imageView, 300);
        }
    }

    public static void n(Context context, String str, ImageView imageView, kvi kviVar) {
        File file = new File(kviVar.C() + "/" + ybb.b(str) + ".jpg");
        if (!file.exists()) {
            file = new File(str);
        }
        com.bumptech.glide.a.v(context).n(file).q(R$drawable.watch_face_album_error_photo).Q0(imageView);
    }

    public static void o(Context context, String str, ImageView imageView, int i) {
        com.bumptech.glide.a.v(context).q(str).a(new zqf().j(ut5.RESOURCE).f0(i).q(R$drawable.watch_face_album_error_photo)).Q0(imageView);
    }

    public static void p(View view, @NonNull Bitmap bitmap) {
        if (view instanceof RoundedImageView) {
            ((RoundedImageView) view).setImageBitmap(bitmap);
        } else if (view instanceof WatchFaceView) {
            ((WatchFaceView) view).setWatchFaceImage(bitmap);
        } else if (view instanceof WfPreviewImageView) {
            ((WfPreviewImageView) view).setImageBitmap(bitmap);
        }
    }

    public static void q(ImageView imageView, int i) {
        com.bumptech.glide.a.v(b78.a()).c().W0(Integer.valueOf(i)).N0(new c(imageView));
    }

    public static void r(ImageView imageView, String str) {
        com.bumptech.glide.a.v(b78.a()).c().Y0(str).N0(new b(imageView));
    }

    public static void s(ImageView imageView, String str) {
        if (imageView == null || str == null) {
            ltl.b("ImageUtil", "[showImage] --> imageView == null || url == null");
        } else {
            com.bumptech.glide.a.v(b78.a()).q(str).j(ut5.RESOURCE).Q0(imageView);
        }
    }

    public static void t(ImageView imageView, String str) {
        if (imageView == null || str == null) {
            ltl.b("ImageUtil", "[showImage] --> imageView == null || url == null");
            return;
        }
        ltl.a("ImageUtil", "[showImageWithGif] --> url " + str);
        Context contextA = b78.a();
        if (str.toLowerCase().endsWith(".gif")) {
            com.bumptech.glide.a.v(contextA).d().Y0(str).j(ut5.RESOURCE).Q0(imageView);
        } else if (str.toLowerCase().endsWith(".webp")) {
            r(imageView, str);
        } else {
            com.bumptech.glide.a.v(contextA).q(str).j(ut5.RESOURCE).Q0(imageView);
        }
    }

    public static void u(ImageView imageView, BaseWatchFaceBean baseWatchFaceBean) {
        if (imageView == null || baseWatchFaceBean == null) {
            ltl.b("ImageUtil", "[showWf] --> imageView == null || bean == null");
        } else if (baseWatchFaceBean instanceof WatchFaceBean) {
            imageView.setImageBitmap(((WatchFaceBean) baseWatchFaceBean).getBitmap());
        } else {
            a78.f(b78.a(), baseWatchFaceBean.getCurrentPreviewUrl(), R$drawable.watch_face_rs_default_img, imageView);
        }
    }

    public static void v(Context context, Proto$DeviceInfo proto$DeviceInfo, View view, BaseWatchFaceBean baseWatchFaceBean) {
        if (view == null || baseWatchFaceBean == null || proto$DeviceInfo == null) {
            ltl.b("ImageUtil", "[showWfAndStyle] --> imageView == null || bean == null ||deviceInfo == null");
            return;
        }
        ltl.a("ImageUtil", "[showWfAndStyle] --> bean " + baseWatchFaceBean);
        int i = proto$DeviceInfo.getScreenType() == Proto$ScreenType.SCREEN_TYPE_OVAL ? R$drawable.watch_face_rs_default_img : R$drawable.watch_face_default_bg;
        String currentPreviewUrl = baseWatchFaceBean.getCurrentPreviewUrl();
        if (TextUtils.isEmpty(currentPreviewUrl)) {
            p(view, BitmapFactory.decodeResource(context.getResources(), i));
            return;
        }
        ltl.a("ImageUtil", "showWfAndStyle previewUrl " + currentPreviewUrl);
        if (baseWatchFaceBean.isCreationWf()) {
            d(context, view, i, currentPreviewUrl);
        } else {
            i(context, view, i, currentPreviewUrl);
        }
    }

    public static void w(ImageView imageView, String str) {
        if (imageView == null || str == null) {
            ltl.b("ImageUtil", "[showWfStyle] --> imageView == null || url == null");
        } else {
            a78.f(b78.a(), str, R$drawable.watch_face_default_bg, imageView);
        }
    }

    public static void x(ImageView imageView, String str, int i, Proto$DeviceInfo proto$DeviceInfo) {
        if (imageView == null || str == null) {
            ltl.b("ImageUtil", "[showWfStyle] --> imageView == null || url == null");
        } else {
            a78.l(b78.a(), str, i, proto$DeviceInfo.getScreenWidth(), proto$DeviceInfo.getScreenHeight(), imageView);
        }
    }

    public static void y(ImageView imageView, String str, Proto$DeviceInfo proto$DeviceInfo) {
        if (imageView == null || str == null) {
            ltl.b("ImageUtil", "[showWfStyle] --> imageView == null || url == null");
        } else {
            x(imageView, str, R$drawable.watch_face_default_bg, proto$DeviceInfo);
        }
    }
}
