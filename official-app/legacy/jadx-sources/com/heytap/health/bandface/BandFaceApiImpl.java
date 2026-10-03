package com.heytap.health.bandface;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.bandface.BandFaceApiImpl;
import com.heytap.health.bandface.api.BandFaceApi;
import com.heytap.health.bandface.api.SyncBandFaceCallback;
import com.heytap.health.bandface.data.BandFace$watchface;
import com.heytap.health.bandface.watchface.bean.BandFaceBean;
import com.heytap.health.bandface.watchface.bean.BandFaceOnlineBean;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.bdd;
import com.oplus.aiunit.vision.ccb;
import com.oplus.aiunit.vision.ccd;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.j4h;
import com.oplus.aiunit.vision.kw0;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.oak;
import com.oplus.aiunit.vision.pv0;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.tv0;
import com.oplus.aiunit.vision.vv0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
@Route(path = "/bandfaceapi/api_provider")
public class BandFaceApiImpl implements BandFaceApi {
    public static final String k = b78.a().getFilesDir() + "/bandface/a/%s/album.png";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f3094l = b78.a().getFilesDir() + "/bandface/%s.png";
    public static final String m = b78.a().getFilesDir() + "/bandface/c/%s/clock.png";
    public List<SyncBandFaceCallback> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vv0 f3095j = new a();

    public class a extends vv0 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.vv0, com.oplus.aiunit.vision.jv0
        public void a(String str, List<BandFaceBean> list) {
            kw0.d("BandFaceApiImpl", "[addFaceComplete] -->  mac = " + gdb.a(str));
            BandFaceApiImpl.this.qb(str, list);
        }

        @Override // com.oplus.aiunit.vision.vv0, com.oplus.aiunit.vision.jv0
        public void b(String str, List<BandFaceBean> list) {
            kw0.d("BandFaceApiImpl", "[getFaceCacheList] mac = " + gdb.a(str));
            BandFaceApiImpl.this.qb(str, list);
        }

        @Override // com.oplus.aiunit.vision.vv0, com.oplus.aiunit.vision.jv0
        public void d(String str, List<BandFaceBean> list, int i) {
            kw0.d("BandFaceApiImpl", "[getFaceSuccess] mac = " + gdb.a(str));
            BandFaceApiImpl.this.qb(str, list);
        }

        @Override // com.oplus.aiunit.vision.vv0, com.oplus.aiunit.vision.jv0
        public void e(String str, List<BandFaceBean> list) {
            kw0.d("BandFaceApiImpl", "[syncFaceComplete] mac = " + gdb.a(str));
            BandFaceApiImpl.this.qb(str, list);
        }

        @Override // com.oplus.aiunit.vision.vv0, com.oplus.aiunit.vision.jv0
        public void f(String str, int i, int i2) {
            kw0.e("BandFaceApiImpl", "[bandFaceFail] mac = " + gdb.a(str) + ",mode = " + i);
        }

        @Override // com.oplus.aiunit.vision.vv0, com.oplus.aiunit.vision.jv0
        public void g(String str, List<BandFaceBean> list) {
            kw0.d("BandFaceApiImpl", "[syncCurrentSuccess] mac = " + gdb.a(str));
            BandFaceApiImpl.this.qb(str, list);
        }
    }

    public class b extends j4h<Bitmap> {
        public final /* synthetic */ BandFaceBean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f3096j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f3097l;
        public final /* synthetic */ String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ccd f3098n;

        public b(BandFaceBean bandFaceBean, Context context, String str, String str2, String str3, ccd ccdVar) {
            this.i = bandFaceBean;
            this.f3096j = context;
            this.k = str;
            this.f3097l = str2;
            this.m = str3;
            this.f3098n = ccdVar;
        }

        @Override // com.oplus.aiunit.vision.k91, com.oplus.aiunit.vision.boj
        public void onLoadFailed(@Nullable Drawable drawable) throws Throwable {
            super.onLoadFailed(drawable);
            BandFaceOnlineBean bandFaceOnlineBean = new BandFaceOnlineBean();
            String str = String.format(BandFaceApiImpl.k, ccb.a(this.k));
            File file = new File(str);
            if (!file.exists()) {
                BandFaceApiImpl.rb(BandFaceApiImpl.jb(R$drawable.band_face_album_default_preview), str);
            }
            bandFaceOnlineBean.previewImg = file.getAbsolutePath();
            bandFaceOnlineBean.hasChoosed = this.i.isCurrent();
            bandFaceOnlineBean.dialKey = this.m;
            this.f3098n.onNext(bandFaceOnlineBean);
            this.f3098n.onComplete();
        }

        @Override // com.oplus.aiunit.vision.boj
        public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable oak oakVar) throws Throwable {
            onResourceReady((Bitmap) obj, (oak<? super Bitmap>) oakVar);
        }

        public void onResourceReady(@NonNull Bitmap bitmap, @Nullable oak<? super Bitmap> oakVar) throws Throwable {
            Bitmap bitmapPb = BandFaceApiImpl.pb(bitmap, BandFaceApiImpl.this.ib(this.i, this.f3096j));
            if (bitmapPb == null) {
                onLoadFailed(null);
                return;
            }
            String str = String.format(BandFaceApiImpl.f3094l, ccb.a(this.k) + this.f3097l);
            BandFaceApiImpl.rb(bitmapPb, str);
            BandFaceOnlineBean bandFaceOnlineBean = new BandFaceOnlineBean();
            bandFaceOnlineBean.previewImg = str;
            bandFaceOnlineBean.hasChoosed = this.i.isCurrent();
            bandFaceOnlineBean.dialKey = this.m;
            this.f3098n.onNext(bandFaceOnlineBean);
            this.f3098n.onComplete();
        }
    }

    public static Bitmap jb(@DrawableRes int i) {
        Drawable drawable = ContextCompat.getDrawable(b78.a(), i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(252, 588, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, 252, 588);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ void kb(BandFaceBean bandFaceBean, String str, ccd ccdVar, int i, BandFaceOnlineBean bandFaceOnlineBean, String str2) {
        if (i == 0) {
            BandFaceOnlineBean bandFaceOnlineBean2 = new BandFaceOnlineBean();
            bandFaceOnlineBean2.hasChoosed = bandFaceBean.isCurrent();
            bandFaceOnlineBean2.previewImg = bandFaceOnlineBean.previewImg;
            bandFaceOnlineBean2.dialKey = str;
            ccdVar.onNext(bandFaceOnlineBean2);
            return;
        }
        BandFaceOnlineBean bandFaceOnlineBean3 = new BandFaceOnlineBean();
        bandFaceOnlineBean3.hasChoosed = bandFaceBean.isCurrent();
        bandFaceOnlineBean3.previewImg = "";
        bandFaceOnlineBean3.dialKey = str;
        ccdVar.onNext(bandFaceOnlineBean3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lb(int i, String str, final String str2, final BandFaceBean bandFaceBean, final ccd ccdVar) throws Throwable {
        if (i == 0) {
            tv0.i(str, str2, b78.a(), new tv0.e() { // from class: com.oplus.aiunit.vision.iv0
                @Override // com.oplus.aiunit.vision.tv0.e
                public final void a(int i2, BandFaceOnlineBean bandFaceOnlineBean, String str3) {
                    BandFaceApiImpl.kb(bandFaceBean, str2, ccdVar, i2, bandFaceOnlineBean, str3);
                }
            });
            ccdVar.onComplete();
            return;
        }
        if (i != 1) {
            if (i == 2) {
                BandFaceOnlineBean bandFaceOnlineBean = new BandFaceOnlineBean();
                String str3 = String.format(m, ccb.a(str));
                File file = new File(str3);
                if (!file.exists()) {
                    rb(jb(R$drawable.band_face_world_clock_default_preview), str3);
                }
                bandFaceOnlineBean.previewImg = file.getAbsolutePath();
                bandFaceOnlineBean.hasChoosed = bandFaceBean.isCurrent();
                bandFaceOnlineBean.dialKey = str2;
                ccdVar.onNext(bandFaceOnlineBean);
                ccdVar.onComplete();
                return;
            }
            return;
        }
        Context contextA = b78.a();
        String watchDialId = bandFaceBean.getFace().getWatchDialId();
        String str4 = String.format(f3094l, ccb.a(str) + watchDialId);
        if (!new File(str4).exists()) {
            com.bumptech.glide.a.v(contextA).b().Y0(tv0.j(watchDialId)).N0(new b(bandFaceBean, contextA, str, watchDialId, str2, ccdVar));
            return;
        }
        BandFaceOnlineBean bandFaceOnlineBean2 = new BandFaceOnlineBean();
        bandFaceOnlineBean2.previewImg = str4;
        bandFaceOnlineBean2.hasChoosed = bandFaceBean.isCurrent();
        bandFaceOnlineBean2.dialKey = str2;
        ccdVar.onNext(bandFaceOnlineBean2);
        ccdVar.onComplete();
    }

    public static /* synthetic */ List mb(Object[] objArr) throws Throwable {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj instanceof BandFaceOnlineBean) {
                BandFaceOnlineBean bandFaceOnlineBean = (BandFaceOnlineBean) obj;
                SyncBandFaceCallback.SimpleBandFaceBean simpleBandFaceBean = new SyncBandFaceCallback.SimpleBandFaceBean();
                simpleBandFaceBean.setWfUnique(bandFaceOnlineBean.dialKey);
                simpleBandFaceBean.setPreviewUrl(bandFaceOnlineBean.previewImg);
                if (bandFaceOnlineBean.hasChoosed) {
                    arrayList.add(0, simpleBandFaceBean);
                } else {
                    arrayList.add(simpleBandFaceBean);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nb(String str, List list) throws Throwable {
        Iterator<SyncBandFaceCallback> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().a(str, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ob(String str, Throwable th) throws Throwable {
        kw0.b("BandFaceApiImpl", "[zip accept] --> " + th.getMessage());
        Iterator<SyncBandFaceCallback> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().b(str);
        }
    }

    public static Bitmap pb(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) {
            kw0.b("BandFaceApiImpl", "[mergeBitmap] --> error");
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(bitmapCopy);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), (Paint) null);
        return bitmapCopy;
    }

    public static void rb(Bitmap bitmap, String str) throws Throwable {
        StringBuilder sb;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    kw0.a("BandFaceApiImpl", file.getAbsolutePath() + " mkdirs mkStatus = " + file.getParentFile().mkdirs() + " nfStatus = " + file.createNewFile());
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    try {
                        fileOutputStream2.close();
                    } catch (Exception e2) {
                        e = e2;
                        sb = new StringBuilder();
                        sb.append("[saveBitmap] 2 ");
                        sb.append(e.getMessage());
                        kw0.b("BandFaceApiImpl", sb.toString());
                    }
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream2;
                    kw0.b("BandFaceApiImpl", "[saveBitmap] 2 " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e4) {
                            e = e4;
                            sb = new StringBuilder();
                            sb.append("[saveBitmap] 2 ");
                            sb.append(e.getMessage());
                            kw0.b("BandFaceApiImpl", sb.toString());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e5) {
                            kw0.b("BandFaceApiImpl", "[saveBitmap] 2 " + e5.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e6) {
            e = e6;
        }
    }

    @Override // com.heytap.health.bandface.api.BandFaceApi
    public void D3(SyncBandFaceCallback syncBandFaceCallback) {
        for (int size = this.i.size() - 1; size >= 0; size--) {
            if (this.i.get(size) == syncBandFaceCallback) {
                this.i.remove(size);
            }
        }
    }

    @Override // com.heytap.health.bandface.api.BandFaceApi
    public void f8(@NonNull LifecycleOwner lifecycleOwner, @NonNull String str, @NonNull final BandFaceApi.a aVar) {
        Objects.requireNonNull(aVar);
        tv0.h(lifecycleOwner, str, new tv0.d() { // from class: com.oplus.aiunit.vision.hv0
            @Override // com.oplus.aiunit.vision.tv0.d
            public final void onResult(String str2) {
                aVar.onResult(str2);
            }
        });
    }

    public final Bitmap ib(BandFaceBean bandFaceBean, Context context) {
        int styleId = bandFaceBean.getFace().getVisual().getStyleId();
        int i = R$drawable.band_album_style0;
        if (styleId == 1) {
            i = R$drawable.band_album_style1;
        } else if (styleId == 2) {
            i = R$drawable.band_album_style2;
        }
        Drawable drawable = ContextCompat.getDrawable(context, i);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        BandFaceSyncApp.a(context);
    }

    @Override // com.heytap.health.bandface.api.BandFaceApi
    public void m6(@NonNull Context context, @NonNull String str, @NonNull ImageView imageView) {
        tv0.z(context, str, imageView);
    }

    @Override // com.heytap.health.bandface.api.BandFaceApi
    public void p2(SyncBandFaceCallback syncBandFaceCallback) {
        this.i.add(syncBandFaceCallback);
    }

    public final void qb(final String str, List<BandFaceBean> list) {
        if (this.i.size() == 0 || list == null || list.isEmpty()) {
            kw0.b("BandFaceApiImpl", "[notifyFaceViewChange] --> error");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (final BandFaceBean bandFaceBean : list) {
            BandFace$watchface face = bandFaceBean.getFace();
            final String watchDialId = face.getWatchDialId();
            final int type = face.getType();
            arrayList.add(lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.dv0
                @Override // com.oplus.aiunit.vision.bdd
                public final void a(ccd ccdVar) throws Throwable {
                    this.a.lb(type, str, watchDialId, bandFaceBean, ccdVar);
                }
            }));
        }
        lbd.q1(arrayList, new d08() { // from class: com.oplus.aiunit.vision.ev0
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return BandFaceApiImpl.mb((Object[]) obj);
            }
        }).L0(su8.c()).n0(f30.c()).b(new o14() { // from class: com.oplus.aiunit.vision.fv0
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.nb(str, (List) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.gv0
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.ob(str, (Throwable) obj);
            }
        });
    }

    @Override // com.heytap.health.bandface.api.BandFaceApi
    public void ya(Context context, String str) {
        pv0.z(str).B(this.f3095j);
    }
}
