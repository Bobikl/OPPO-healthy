package com.tencent.connect.avatar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.client.platform.opensdk.pay.download.resource.LanUtils;
import com.oplus.aiunit.vision.eok;
import com.oplus.aiunit.vision.h75;
import com.oplus.aiunit.vision.iz9;
import com.oplus.aiunit.vision.kcm;
import com.oplus.aiunit.vision.nz0;
import com.oplus.aiunit.vision.p4f;
import com.oplus.aiunit.vision.s04;
import com.oplus.aiunit.vision.spm;
import com.oplus.aiunit.vision.uum;
import com.oplus.aiunit.vision.yfk;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import com.tencent.open.utils.HttpUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ImageActivity extends Activity {
    public RelativeLayout A;
    public p4f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f20276j;
    public Handler k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.tencent.connect.avatar.c f20277l;
    public Button m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f20278n;
    public com.tencent.connect.avatar.b o;
    public TextView p;
    public ProgressBar q;
    public String y;
    public Bitmap z;
    public int r = 0;
    public boolean s = false;
    public long t = 0;
    public int u = 0;
    public final int v = GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH;
    public final int w = GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH;
    public Rect x = new Rect();
    public final View.OnClickListener B = new c();
    public final View.OnClickListener C = new d();
    public final iz9 D = new f();
    public final iz9 E = new g();

    public class a extends View {
        public a(Context context) {
            super(context);
        }

        public void a(Button button) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawableN = ImageActivity.this.n("com.tencent.plus.blue_normal.png");
            Drawable drawableN2 = ImageActivity.this.n("com.tencent.plus.blue_down.png");
            Drawable drawableN3 = ImageActivity.this.n("com.tencent.plus.blue_disable.png");
            stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, drawableN2);
            stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, drawableN);
            stateListDrawable.addState(View.ENABLED_STATE_SET, drawableN);
            stateListDrawable.addState(View.FOCUSED_STATE_SET, drawableN);
            stateListDrawable.addState(View.EMPTY_STATE_SET, drawableN3);
            button.setBackgroundDrawable(stateListDrawable);
        }

        public void b(Button button) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawableN = ImageActivity.this.n("com.tencent.plus.gray_normal.png");
            Drawable drawableN2 = ImageActivity.this.n("com.tencent.plus.gray_down.png");
            Drawable drawableN3 = ImageActivity.this.n("com.tencent.plus.gray_disable.png");
            stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, drawableN2);
            stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, drawableN);
            stateListDrawable.addState(View.ENABLED_STATE_SET, drawableN);
            stateListDrawable.addState(View.FOCUSED_STATE_SET, drawableN);
            stateListDrawable.addState(View.EMPTY_STATE_SET, drawableN3);
            button.setBackgroundDrawable(stateListDrawable);
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ImageActivity.this.A.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            ImageActivity imageActivity = ImageActivity.this;
            imageActivity.x = imageActivity.o.a();
            ImageActivity.this.f20277l.d(ImageActivity.this.x);
        }
    }

    public class c implements View.OnClickListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ImageActivity.this.t();
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            ImageActivity.this.q.setVisibility(0);
            ImageActivity.this.f20278n.setEnabled(false);
            ImageActivity.this.f20278n.setTextColor(Color.rgb(21, 21, 21));
            ImageActivity.this.m.setEnabled(false);
            ImageActivity.this.m.setTextColor(Color.rgb(36, 94, 134));
            new Thread(new a()).start();
            if (ImageActivity.this.s) {
                ImageActivity.this.k("10657", 0L);
            } else {
                ImageActivity.this.k("10655", System.currentTimeMillis() - ImageActivity.this.t);
                if (ImageActivity.this.f20277l.w) {
                    ImageActivity.this.k("10654", 0L);
                }
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            ImageActivity.this.k("10656", System.currentTimeMillis() - ImageActivity.this.t);
            ImageActivity.this.setResult(0);
            ImageActivity.this.x();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f20279j;

        public e(String str, int i) {
            this.i = str;
            this.f20279j = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageActivity.this.r(this.i, this.f20279j);
        }
    }

    public class f extends h75 {
        public f() {
        }

        @Override // com.oplus.aiunit.vision.h75, com.oplus.aiunit.vision.iz9
        public void onCancel() {
        }

        @Override // com.oplus.aiunit.vision.h75, com.oplus.aiunit.vision.iz9
        public void onComplete(Object obj) {
            ImageActivity.this.f20278n.setEnabled(true);
            int i = -1;
            ImageActivity.this.f20278n.setTextColor(-1);
            ImageActivity.this.m.setEnabled(true);
            ImageActivity.this.m.setTextColor(-1);
            ImageActivity.this.q.setVisibility(8);
            JSONObject jSONObject = (JSONObject) obj;
            try {
                i = jSONObject.getInt("ret");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            if (i != 0) {
                ImageActivity.this.j("设置出错了，请重新登录再尝试下呢：）", 1);
                spm.a().c(ImageActivity.this.i.i(), ImageActivity.this.i.h(), s04.VIA_SET_AVATAR_SUCCEED, "12", "19", "1");
                return;
            }
            ImageActivity.this.j("设置成功", 0);
            ImageActivity.this.k("10658", 0L);
            spm.a().c(ImageActivity.this.i.i(), ImageActivity.this.i.h(), s04.VIA_SET_AVATAR_SUCCEED, "12", "3", "0");
            ImageActivity imageActivity = ImageActivity.this;
            if (imageActivity.f20276j != null && !"".equals(ImageActivity.this.f20276j)) {
                Intent intent = new Intent();
                intent.setClassName(imageActivity, ImageActivity.this.f20276j);
                if (imageActivity.getPackageManager().resolveActivity(intent, 0) != null) {
                    imageActivity.startActivity(intent);
                }
            }
            ImageActivity.this.f(0, jSONObject.toString(), null, null);
            ImageActivity.this.x();
        }

        @Override // com.oplus.aiunit.vision.h75, com.oplus.aiunit.vision.iz9
        public void onError(yfk yfkVar) {
            ImageActivity.this.f20278n.setEnabled(true);
            ImageActivity.this.f20278n.setTextColor(-1);
            ImageActivity.this.m.setEnabled(true);
            ImageActivity.this.m.setTextColor(-1);
            ImageActivity.this.m.setText("重试");
            ImageActivity.this.q.setVisibility(8);
            ImageActivity.this.s = true;
            ImageActivity.this.j(yfkVar.b, 1);
            ImageActivity.this.k("10660", 0L);
        }
    }

    public class g extends h75 {

        public class a implements Runnable {
            public final /* synthetic */ String i;

            public a(String str) {
                this.i = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                ImageActivity.this.u(this.i);
            }
        }

        public g() {
        }

        public final void a(int i) {
            if (ImageActivity.this.r < 2) {
                ImageActivity.this.z();
            }
        }

        @Override // com.oplus.aiunit.vision.h75, com.oplus.aiunit.vision.iz9
        public void onCancel() {
        }

        @Override // com.oplus.aiunit.vision.h75, com.oplus.aiunit.vision.iz9
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            int i = -1;
            try {
                i = jSONObject.getInt("ret");
                if (i == 0) {
                    ImageActivity.this.k.post(new a(jSONObject.getString("nickname")));
                    ImageActivity.this.k("10659", 0L);
                } else {
                    ImageActivity.this.k("10661", 0L);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            if (i != 0) {
                a(i);
            }
        }

        @Override // com.oplus.aiunit.vision.h75, com.oplus.aiunit.vision.iz9
        public void onError(yfk yfkVar) {
            a(0);
        }
    }

    public class h extends nz0 {
        public h(p4f p4fVar) {
            super(p4fVar);
        }

        public void h(Bitmap bitmap, iz9 iz9Var) {
            Bundle bundleB = b();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 40, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            nz0.a aVar = new nz0.a(iz9Var);
            bundleB.putByteArray(s04.PARAM_AVATAR_URI, byteArray);
            HttpUtils.l(this.b, uum.a(), "user/set_user_face", bundleB, "POST", aVar);
            spm.a().c(this.b.i(), this.b.h(), s04.VIA_SET_AVATAR_SUCCEED, "12", "19", "0");
        }
    }

    public final Bitmap a(String str) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        Uri uri = Uri.parse(str);
        InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        try {
            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        inputStreamOpenInputStream.close();
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        while (i2 * i3 > 4194304) {
            i2 /= 2;
            i3 /= 2;
            i *= 2;
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = i;
        try {
            return BitmapFactory.decodeStream(getContentResolver().openInputStream(uri), null, options);
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public final View d() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.A = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams);
        this.A.setBackgroundColor(-16777216);
        RelativeLayout relativeLayout2 = new RelativeLayout(this);
        relativeLayout2.setLayoutParams(layoutParams3);
        this.A.addView(relativeLayout2);
        com.tencent.connect.avatar.c cVar = new com.tencent.connect.avatar.c(this);
        this.f20277l = cVar;
        cVar.setLayoutParams(layoutParams2);
        this.f20277l.setScaleType(ImageView.ScaleType.MATRIX);
        relativeLayout2.addView(this.f20277l);
        this.o = new com.tencent.connect.avatar.b(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(layoutParams2);
        layoutParams4.addRule(14, -1);
        layoutParams4.addRule(15, -1);
        this.o.setLayoutParams(layoutParams4);
        relativeLayout2.addView(this.o);
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, kcm.a(this, 80.0f));
        layoutParams5.addRule(14, -1);
        linearLayout.setLayoutParams(layoutParams5);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        this.A.addView(linearLayout);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(kcm.a(this, 24.0f), kcm.a(this, 24.0f)));
        imageView.setImageDrawable(n("com.tencent.plus.logo.png"));
        linearLayout.addView(imageView);
        this.p = new TextView(this);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(layoutParams3);
        layoutParams6.leftMargin = kcm.a(this, 7.0f);
        this.p.setLayoutParams(layoutParams6);
        this.p.setEllipsize(TextUtils.TruncateAt.END);
        this.p.setSingleLine();
        this.p.setTextColor(-1);
        this.p.setTextSize(24.0f);
        this.p.setVisibility(8);
        linearLayout.addView(this.p);
        RelativeLayout relativeLayout3 = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, kcm.a(this, 60.0f));
        layoutParams7.addRule(12, -1);
        layoutParams7.addRule(9, -1);
        relativeLayout3.setLayoutParams(layoutParams7);
        relativeLayout3.setBackgroundDrawable(n("com.tencent.plus.bar.png"));
        int iA = kcm.a(this, 10.0f);
        relativeLayout3.setPadding(iA, iA, iA, 0);
        this.A.addView(relativeLayout3);
        a aVar = new a(this);
        int iA2 = kcm.a(this, 14.0f);
        int iA3 = kcm.a(this, 7.0f);
        this.f20278n = new Button(this);
        this.f20278n.setLayoutParams(new RelativeLayout.LayoutParams(kcm.a(this, 78.0f), kcm.a(this, 45.0f)));
        this.f20278n.setText(LanUtils.CN.CANCEL);
        this.f20278n.setTextColor(-1);
        this.f20278n.setTextSize(18.0f);
        this.f20278n.setPadding(iA2, iA3, iA2, iA3);
        aVar.b(this.f20278n);
        relativeLayout3.addView(this.f20278n);
        this.m = new Button(this);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(kcm.a(this, 78.0f), kcm.a(this, 45.0f));
        layoutParams8.addRule(11, -1);
        this.m.setLayoutParams(layoutParams8);
        this.m.setTextColor(-1);
        this.m.setTextSize(18.0f);
        this.m.setPadding(iA2, iA3, iA2, iA3);
        this.m.setText("选取");
        aVar.a(this.m);
        relativeLayout3.addView(this.m);
        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(layoutParams3);
        layoutParams9.addRule(13, -1);
        textView.setLayoutParams(layoutParams9);
        textView.setText("移动和缩放");
        textView.setPadding(0, kcm.a(this, 3.0f), 0, 0);
        textView.setTextSize(18.0f);
        textView.setTextColor(-1);
        relativeLayout3.addView(textView);
        this.q = new ProgressBar(this);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(layoutParams3);
        layoutParams10.addRule(14, -1);
        layoutParams10.addRule(15, -1);
        this.q.setLayoutParams(layoutParams10);
        this.q.setVisibility(8);
        this.A.addView(this.q);
        return this.A;
    }

    public final void f(int i, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.putExtra(s04.KEY_ERROR_CODE, i);
        intent.putExtra(s04.KEY_ERROR_MSG, str2);
        intent.putExtra(s04.KEY_ERROR_DETAIL, str3);
        intent.putExtra(s04.KEY_RESPONSE, str);
        setResult(-1, intent);
    }

    public final void g(Bitmap bitmap) {
        new h(this.i).h(bitmap, this.D);
    }

    public final void j(String str, int i) {
        this.k.post(new e(str, i));
    }

    public void k(String str, long j2) {
        com.tencent.open.utils.b.k(this, str, j2, this.i.h());
    }

    public final Drawable n(String str) {
        return com.tencent.open.utils.b.b(str, this);
    }

    public final void o() {
        try {
            Bitmap bitmapA = a(this.y);
            this.z = bitmapA;
            if (bitmapA != null) {
                this.f20277l.setImageBitmap(bitmapA);
                this.m.setOnClickListener(this.B);
                this.f20278n.setOnClickListener(this.C);
                this.A.getViewTreeObserver().addOnGlobalLayoutListener(new b());
                return;
            }
            throw new IOException("cannot read picture: '" + this.y + "'!");
        } catch (IOException e2) {
            e2.printStackTrace();
            j(s04.MSG_IMAGE_ERROR, 1);
            f(-5, null, s04.MSG_IMAGE_ERROR, e2.getMessage());
            x();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        setResult(0);
        x();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView(d());
        this.k = new Handler();
        Bundle bundleExtra = getIntent().getBundleExtra(s04.KEY_PARAMS);
        this.y = bundleExtra.getString(s04.PARAM_AVATAR_URI);
        this.f20276j = bundleExtra.getString("return_activity");
        String string = bundleExtra.getString("appid");
        String string2 = bundleExtra.getString(s04.PARAM_ACCESS_TOKEN);
        long j2 = bundleExtra.getLong(s04.PARAM_EXPIRES_IN);
        String string3 = bundleExtra.getString("openid");
        this.u = bundleExtra.getInt("exitAnim");
        p4f p4fVar = new p4f(string);
        this.i = p4fVar;
        p4fVar.n(string2, ((j2 - System.currentTimeMillis()) / 1000) + "");
        this.i.o(string3);
        o();
        z();
        this.t = System.currentTimeMillis();
        k("10653", 0L);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f20277l.setImageBitmap(null);
        Bitmap bitmap = this.z;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.z.recycle();
    }

    @Override // android.app.Activity
    @SensorsDataInstrumented
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PushAutoTrackHelper.onNewIntent(this, intent);
    }

    public final void r(String str, int i) {
        Toast toastMakeText = Toast.makeText(this, str, 1);
        LinearLayout linearLayout = (LinearLayout) toastMakeText.getView();
        ((TextView) linearLayout.getChildAt(0)).setPadding(8, 0, 0, 0);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(kcm.a(this, 16.0f), kcm.a(this, 16.0f)));
        if (i == 0) {
            imageView.setImageDrawable(n("com.tencent.plus.ic_success.png"));
        } else {
            imageView.setImageDrawable(n("com.tencent.plus.ic_error.png"));
        }
        linearLayout.addView(imageView, 0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        toastMakeText.setView(linearLayout);
        toastMakeText.setGravity(17, 0, 0);
        toastMakeText.show();
    }

    public final void t() {
        float fWidth = this.x.width();
        Matrix imageMatrix = this.f20277l.getImageMatrix();
        float[] fArr = new float[9];
        imageMatrix.getValues(fArr);
        float f2 = fArr[2];
        float f3 = fArr[5];
        float f4 = fArr[0];
        float f5 = 640.0f / fWidth;
        Rect rect = this.x;
        int i = (int) ((rect.left - f2) / f4);
        int i2 = i < 0 ? 0 : i;
        int i3 = (int) ((rect.top - f3) / f4);
        int i4 = i3 < 0 ? 0 : i3;
        Matrix matrix = new Matrix();
        matrix.set(imageMatrix);
        matrix.postScale(f5, f5);
        int i5 = (int) (650.0f / f4);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.z, i2, i4, Math.min(this.z.getWidth() - i2, i5), Math.min(this.z.getHeight() - i4, i5), matrix, true);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH);
            bitmapCreateBitmap.recycle();
            g(bitmapCreateBitmap2);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            j(s04.MSG_IMAGE_ERROR, 1);
            f(-5, null, s04.MSG_IMAGE_ERROR, e2.getMessage());
            x();
        }
    }

    public final void u(String str) {
        String strW = w(str);
        if ("".equals(strW)) {
            return;
        }
        this.p.setText(strW);
        this.p.setVisibility(0);
    }

    public final String w(String str) {
        return str.replaceAll("&gt;", ">").replaceAll("&lt;", "<").replaceAll("&quot;", "\"").replaceAll("&#39;", "'").replaceAll("&amp;", "&");
    }

    public final void x() {
        finish();
        int i = this.u;
        if (i != 0) {
            overridePendingTransition(0, i);
        }
    }

    public final void z() {
        this.r++;
        new eok(this, this.i).h(this.E);
    }
}
