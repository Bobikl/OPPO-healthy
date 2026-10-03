package com.heytap.health.watchpair.view;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.health.device_pair.R;
import com.heytap.health.device_pair.view.IWatchViewService;
import com.heytap.health.devicemanager.api.ICloudDeviceProcessorService;
import com.heytap.health.devicemanager.processor.bean.Params;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.manager.SkuHelper;
import com.oplus.aiunit.p007vision.f60;
import com.oplus.aiunit.p007vision.f8e;
import com.oplus.aiunit.p007vision.qwd;
import com.oplus.aiunit.vision.cm4;
import com.oplus.aiunit.vision.dl5;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.h2a;
import com.oplus.aiunit.vision.i2a;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.veb;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.xc5;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\official-device-assets\classes19.dex */
public class WatchView extends ConstraintLayout {
    public static final Set<String> L = new HashSet();
    public static final String TAG = "WatchView";
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public h2a F;
    public Params G;
    public final float H;
    public float I;
    public IWatchViewService J;
    public final Queue<f8e> K;
    public i2a i;
    public String j;
    public ImageView k;
    public ImageView l;
    public FrameLayout m;
    public String n;
    public String o;
    public ImageView p;
    public MediaPlayer.OnCompletionListener q;
    public boolean r;
    public double s;
    public Surface t;
    public MediaPlayer u;
    public f8e v;
    public boolean w;
    public ValueAnimator x;
    public float y;
    public float z;

    public class a extends ViewOutlineProvider {
        public final /* synthetic */ float a;

        public a(float f) {
            this.a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
        }
    }

    public class b extends xc5<Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public b(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(String str, String str2, String str3) {
            try {
                if (WatchView.this.F != null && TextUtils.equals(str, WatchView.this.o) && TextUtils.equals(str2, WatchView.this.n)) {
                    WatchView.this.F.o(WatchView.this, str3, false);
                }
            } catch (Exception unused) {
            }
        }

        public void b(Throwable th, String str) {
            super.b(th, str);
            synchronized (WatchView.L) {
                WatchView.L.remove(this.c);
            }
        }

        public void c(Object obj) {
            dl5.b bVar;
            super.c(obj);
            try {
                try {
                    dl5 dl5Var = (dl5) obj;
                    final String strB = null;
                    if (dl5Var != null && dl5Var.d() != null) {
                        Iterator it = dl5Var.d().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                bVar = null;
                                break;
                            }
                            bVar = (dl5.b) it.next();
                            if (bVar != null && !TextUtils.isEmpty(this.a) && TextUtils.equals(bVar.d(), this.a)) {
                                break;
                            }
                        }
                    } else {
                        bVar = null;
                        break;
                    }
                    if (bVar == null) {
                        synchronized (WatchView.L) {
                            WatchView.L.remove(this.c);
                        }
                        return;
                    }
                    if (bVar.c() != null) {
                        for (dl5.a aVar : bVar.c()) {
                            if (aVar != null && TextUtils.equals(aVar.a(), "picture_id")) {
                                strB = aVar.b();
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strB) && !TextUtils.equals(this.b, strB)) {
                        SkuHelper.c(this.c, strB);
                        SkuHelper.d();
                        ConstraintLayout constraintLayout = WatchView.this;
                        final String str = this.c;
                        final String str2 = this.d;
                        constraintLayout.post(new Runnable() { // from class: com.oplus.aiunit.vision.ykl
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.i.e(str, str2, strB);
                            }
                        });
                    }
                    synchronized (WatchView.L) {
                        WatchView.L.remove(this.c);
                    }
                } catch (Exception e) {
                    cm4.c(WatchView.TAG, WatchView.this.j + "_fetchSkuIdImageIfNeed parse error:" + e.getMessage());
                    synchronized (WatchView.L) {
                        WatchView.L.remove(this.c);
                    }
                }
            } catch (Throwable th) {
                synchronized (WatchView.L) {
                    WatchView.L.remove(this.c);
                    throw th;
                }
            }
        }
    }

    public class c extends ViewOutlineProvider {
        public final /* synthetic */ double a;

        public c(double d) {
            this.a = d;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (WatchView.this.F == null || !WatchView.this.F.b()) {
                return;
            }
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) (this.a / 2.0d));
        }
    }

    public class d implements TextureView.SurfaceTextureListener {
        public d() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
            cm4.d(WatchView.TAG, WatchView.this.j + "_ onSurfaceTextureAvailable ");
            if (WatchView.this.u != null) {
                WatchView.this.t = new Surface(surfaceTexture);
                WatchView.this.u.setSurface(WatchView.this.t);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
            cm4.d(WatchView.TAG, WatchView.this.j + "_ onSurfaceTextureDestroyed ");
            if (WatchView.this.u == null || !WatchView.this.u.isPlaying()) {
                return true;
            }
            WatchView.this.u.stop();
            WatchView.this.u.reset();
            WatchView.this.u.release();
            WatchView.this.u = null;
            if (WatchView.this.t == null) {
                return true;
            }
            WatchView.this.t.release();
            WatchView.this.t = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
            cm4.d(WatchView.TAG, WatchView.this.j + "_ onSurfaceTextureSizeChanged ");
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
        }
    }

    public WatchView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        this.p.setTag(Boolean.TRUE);
        this.p.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean B(MediaPlayer mediaPlayer, int i, int i2) {
        ImageView imageView;
        cm4.a(TAG, this.j + "_info" + i);
        if (i != 3 || (imageView = this.p) == null || imageView.getVisibility() != 0) {
            return false;
        }
        this.p.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.xkl
            @Override // java.lang.Runnable
            public final void run() {
                this.i.A();
            }
        }, 50L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(MediaPlayer mediaPlayer) {
        cm4.a(TAG, this.j + "_onCompletion");
        if (this.v != null) {
            if (this.K.peek() != null) {
                f8e f8eVarPoll = this.K.poll();
                if (f8eVarPoll != null) {
                    F(f8eVarPoll);
                    return;
                }
            } else if (this.v.b()) {
                F(this.v);
                return;
            }
        }
        this.w = false;
        MediaPlayer.OnCompletionListener onCompletionListener = this.q;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mediaPlayer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(ViewGroup.LayoutParams layoutParams, ConstraintLayout.LayoutParams layoutParams2, ViewGroup.LayoutParams layoutParams3, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        layoutParams.width = (int) Math.floor(this.y * fFloatValue);
        layoutParams.height = (int) Math.floor(this.z * fFloatValue);
        getShellView().setLayoutParams(layoutParams);
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = (int) Math.ceil(this.A * fFloatValue);
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = (int) Math.ceil(this.B * fFloatValue);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) Math.ceil(this.C * fFloatValue);
        getFaceView().setLayoutParams(layoutParams2);
        layoutParams3.width = (int) Math.ceil(this.D * fFloatValue);
        layoutParams3.height = (int) Math.ceil(this.E * fFloatValue);
        this.m.setLayoutParams(layoutParams3);
    }

    private MediaPlayer getMediaPlayer() {
        if (this.u == null) {
            x();
        }
        return this.u;
    }

    private i2a getResDelegate() {
        IWatchViewService watchViewService;
        if (this.i == null && (watchViewService = getWatchViewService()) != null) {
            this.i = watchViewService.Sa();
        }
        return this.i;
    }

    private IWatchViewService getWatchViewService() {
        if (this.J == null) {
            this.J = (IWatchViewService) e1.d().b("/device_pair/IWatchViewService").navigation();
        }
        return this.J;
    }

    private void setBuffViewColor(ImageView imageView) {
        h2a h2aVar = this.F;
        if (h2aVar == null || !h2aVar.b()) {
            imageView.setBackgroundColor(qwd.BACKGROUND_COLOR_BLACK);
        } else {
            imageView.setBackgroundResource(R.drawable.watch_round_buff);
        }
    }

    private void setFaceViewVisibility(int i) {
        this.l.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(MediaPlayer mediaPlayer) {
        cm4.d(TAG, this.j + "_ onPrepared ");
        MediaPlayer mediaPlayer2 = this.u;
        if (mediaPlayer2 != null) {
            mediaPlayer2.start();
            return;
        }
        cm4.e(TAG, this.j + "_ onPrepared mMediaPlayer is null");
    }

    public void E(f8e f8eVar) {
        cm4.a(TAG, this.j + "_offerVideo " + f8eVar);
        this.K.offer(f8eVar);
    }

    public void F(@NonNull f8e f8eVar) {
        this.w = true;
        cm4.a(TAG, this.j + "_playVideo " + f8eVar);
        this.v = f8eVar;
        G(f8eVar.a(), false);
    }

    public void G(String str, boolean z) {
        cm4.a(TAG, this.j + "_ playVideo() called with: res = [" + str + "]");
        N();
        MediaPlayer mediaPlayer = getMediaPlayer();
        ImageView imageView = this.p;
        if (imageView != null) {
            Object tag = imageView.getTag();
            cm4.d(TAG, this.j + "_playVideo: " + tag);
            if (tag == null || ((tag instanceof Boolean) && !((Boolean) tag).booleanValue())) {
                cm4.d(TAG, this.j + "_playVideo: show");
                this.p.setVisibility(0);
            }
        }
        try {
            mediaPlayer.reset();
            this.u.setLooping(z);
            this.u.setDataSource(str);
            this.u.prepareAsync();
        } catch (Exception e) {
            this.w = false;
            cm4.c(TAG, this.j + "_ set source error " + e.getMessage());
        }
    }

    public void H() {
        this.q = null;
    }

    public void I(@NonNull Runnable runnable) {
        i2a resDelegate = getResDelegate();
        if (resDelegate != null) {
            resDelegate.e(this, runnable);
        }
    }

    public void J() {
        reset();
        this.l.setImageBitmap(null);
        setBuffViewColor(this.l);
    }

    public void K() {
        if (this.v == null) {
            reset();
            this.l.setImageBitmap(null);
            setBuffViewColor(this.l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void L(String str, String str2) {
        cm4.d(TAG, this.j + "_deviceMac:" + veb.a(str) + " setDeviceModel: " + str2);
        if (TextUtils.equals(this.o, str) && TextUtils.equals(this.n, str2)) {
            i2a resDelegate = getResDelegate();
            if (resDelegate != null) {
                resDelegate.f(this);
                return;
            }
            return;
        }
        this.n = str2;
        this.o = str;
        i2a resDelegate2 = getResDelegate();
        if (resDelegate2 != null) {
            resDelegate2.b(this);
        }
        IWatchViewService watchViewService = getWatchViewService();
        if (watchViewService != null) {
            this.F = watchViewService.M2(this.n);
        }
        this.s = 0.0d;
        Context context = getContext();
        if (this.r) {
            int iE = qmg.e(context);
            double dimension = getResources().getDimension(R.dimen.pair_settings_background_hei);
            double dA = (dimension / ((double) qmg.a(context, 620.0f))) * ((double) iE);
            if (dA < dimension) {
                this.s = dA / dimension;
            }
        }
        v(false);
        P();
        if (resDelegate2 != null) {
            resDelegate2.f(this);
        }
    }

    public final void M(View view, double d2, double d3, double d4) {
        if (d2 == 0.0d || d3 == 0.0d) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        if (d4 != 0.0d) {
            if (view == this.k) {
                d3 = Math.floor(d3 * d4);
                d2 = Math.floor(d2 * d4);
            } else {
                d3 = Math.ceil(d3 * d4);
                d2 = Math.ceil(d2 * d4);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) d2;
        layoutParams.height = (int) d3;
    }

    public final void N() {
        setFaceViewVisibility(8);
        this.m.setVisibility(0);
    }

    public void O() {
        cm4.d(TAG, this.j + "_startPoll isPlaying " + this.w);
        if (this.w) {
            return;
        }
        f8e f8eVarPoll = this.K.poll();
        this.v = f8eVarPoll;
        if (f8eVarPoll != null) {
            F(f8eVarPoll);
            return;
        }
        cm4.c(TAG, this.j + "_startPoll poll is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void P() {
        Context context = getContext();
        if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
            cm4.c(TAG, this.j + "_activity isDestroyed");
            return;
        }
        if (this.F == null) {
            cm4.c(TAG, this.j + "_updateId ability is null");
            return;
        }
        String str = (String) SkuHelper.b().get(this.o);
        cm4.a(TAG, this.n + " updateId " + str);
        UserDeviceInfo boundDeviceInfoByMac = wl4.managerApi.getBoundDeviceInfoByMac(this.o);
        if (boundDeviceInfoByMac != null) {
            t(str, false, boundDeviceInfoByMac.getSkuCode(), boundDeviceInfoByMac.getDeviceType());
        }
        this.F.o(this, str, true);
    }

    public void Q() {
        cm4.d(TAG, this.j + "_videoDestroy " + this.v);
        Surface surface = this.t;
        if (surface != null) {
            surface.release();
        }
        MediaPlayer mediaPlayer = this.u;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.u.reset();
            this.u.release();
            this.u = null;
        }
        Queue<f8e> queue = this.K;
        if (queue != null) {
            queue.clear();
        }
        this.v = null;
        this.w = false;
    }

    public void R() {
        cm4.d(TAG, this.j + "_videoPause " + this.v);
        this.w = false;
        MediaPlayer mediaPlayer = this.u;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    public void S() {
        cm4.d(TAG, this.j + "_videoResume " + this.v);
        this.w = true;
        MediaPlayer mediaPlayer = this.u;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public void T() {
        cm4.d(TAG, this.j + "_videoStop " + this.v);
        this.w = false;
        MediaPlayer mediaPlayer = this.u;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.u.reset();
        }
    }

    public void U(float f, float f2) {
        ViewGroup.LayoutParams layoutParams = getShellView().getLayoutParams();
        float f3 = this.y;
        boolean z = f3 > f60.ALPHA_TRANSPARENT && this.z > f60.ALPHA_TRANSPARENT && this.A > f60.ALPHA_TRANSPARENT && this.B > f60.ALPHA_TRANSPARENT && this.D > f60.ALPHA_TRANSPARENT && this.E > f60.ALPHA_TRANSPARENT;
        if (!z) {
            f3 = layoutParams.width;
        }
        float f4 = z ? this.z : layoutParams.height;
        float f5 = f != f60.ALPHA_TRANSPARENT ? f / f3 : f2 / f4;
        this.I = f5;
        layoutParams.width = (int) Math.floor(f3 * f5);
        layoutParams.height = (int) Math.floor(f4 * f5);
        ConstraintLayout.LayoutParams layoutParams2 = getFaceView().getLayoutParams();
        float f6 = z ? this.A : ((ViewGroup.MarginLayoutParams) layoutParams2).width;
        float f7 = z ? this.B : ((ViewGroup.MarginLayoutParams) layoutParams2).height;
        float f8 = z ? this.C : ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = (int) Math.ceil(f6 * f5);
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = (int) Math.ceil(f7 * f5);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) Math.ceil(f8 * f5);
        ViewGroup.LayoutParams layoutParams3 = this.m.getLayoutParams();
        float f9 = z ? this.D : layoutParams3.width;
        float f10 = z ? this.E : layoutParams3.height;
        layoutParams3.width = (int) Math.ceil(f9 * f5);
        layoutParams3.height = (int) Math.ceil(f10 * f5);
        requestLayout();
    }

    public void V(float f, long j) {
        this.I = f;
        final ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        final ViewGroup.LayoutParams layoutParams2 = getShellView().getLayoutParams();
        final ConstraintLayout.LayoutParams layoutParams3 = getFaceView().getLayoutParams();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, f);
        this.x = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.wkl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.i.D(layoutParams2, layoutParams3, layoutParams, valueAnimator);
            }
        });
        this.x.start();
    }

    public String getDeviceModel() {
        return this.n;
    }

    public ImageView getFaceView() {
        return this.l;
    }

    public ImageView getShellView() {
        return this.k;
    }

    public float getShellViewInitHeight() {
        return this.z;
    }

    public float getShellViewInitWidth() {
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        i2a resDelegate = getResDelegate();
        if (resDelegate != null) {
            resDelegate.d(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        i2a resDelegate = getResDelegate();
        if (resDelegate != null) {
            resDelegate.a();
        }
    }

    public void reset() {
        Q();
        setFaceViewVisibility(0);
        this.m.setVisibility(8);
    }

    public final void s(ImageView imageView, float f) {
        h2a h2aVar = this.F;
        if (h2aVar == null || !h2aVar.b()) {
            imageView.setClipToOutline(false);
        } else {
            imageView.setClipToOutline(true);
            imageView.setOutlineProvider(new a(f));
        }
    }

    public void setAutoDownloadRes(boolean z) {
        i2a resDelegate = getResDelegate();
        if (resDelegate != null) {
            resDelegate.g(z, this);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.q = onCompletionListener;
    }

    public void setOrtherTag(String str) {
        this.j = str;
    }

    public void setResDownloadUpdateCallback(Runnable runnable) {
        i2a resDelegate = getResDelegate();
        if (resDelegate != null) {
            resDelegate.c(runnable, this);
        }
    }

    public void t(String str, boolean z, String str2, int i) {
        if (z || TextUtils.isEmpty(str)) {
            String str3 = this.o;
            String str4 = this.n;
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return;
            }
            Set<String> set = L;
            synchronized (set) {
                if (set.contains(str3)) {
                    return;
                }
                set.add(str3);
                ICloudDeviceProcessorService iCloudDeviceProcessorService = (ICloudDeviceProcessorService) e1.d().b("/devicemanager/ICloudDeviceProcessorService").navigation();
                if (iCloudDeviceProcessorService != null) {
                    iCloudDeviceProcessorService.B9(str4, i, new b(str2, str, str3, str4));
                } else {
                    synchronized (set) {
                        set.remove(str3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WatchView);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.WatchView_wv_face_res, 0);
            this.r = typedArrayObtainStyledAttributes.getBoolean(R.styleable.WatchView_wv_autosize, this.r);
            typedArrayObtainStyledAttributes.recycle();
            LayoutInflater.from(context).inflate(R.layout.view_watchview, (ViewGroup) this, true);
            this.m = (FrameLayout) findViewById(R.id.video_layout);
            this.l = (ImageView) findViewById(R.id.set_hand_img_band2);
            this.k = (ImageView) findViewById(R.id.iv_oobe_watch_bg);
            if0.G(this.l, false);
            if0.G(this.k, false);
            if (resourceId != 0) {
                getFaceView().setImageResource(resourceId);
            }
        } catch (Throwable th) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void v(boolean z) {
        M(this.k, getResources().getDimension(R.dimen.pair_settings_background_wid), getResources().getDimension(R.dimen.pair_settings_background_hei), this.s);
        this.y = this.k.getLayoutParams().width;
        this.z = this.k.getLayoutParams().height;
        this.G = this.F.h();
        cm4.d(TAG, this.j + "_face size:" + this.G);
        double dA = (double) ((float) qmg.a(getContext(), this.G.getFaceWidth()));
        double dA2 = (double) ((float) qmg.a(getContext(), this.G.getFaceHeight()));
        M(this.m, dA, dA2, this.s);
        this.D = this.m.getLayoutParams().width;
        this.E = this.m.getLayoutParams().height;
        M(this.l, dA, dA2, this.s);
        this.A = this.l.getLayoutParams().width;
        this.B = this.l.getLayoutParams().height;
        ConstraintLayout.LayoutParams layoutParams = this.l.getLayoutParams();
        h2a h2aVar = this.F;
        if (h2aVar == null || !h2aVar.a()) {
            layoutParams.verticalBias = 0.5f;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        } else {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.device_pair_watchview_band_top_margin);
            double d2 = this.s;
            if (d2 != 0.0d) {
                dimensionPixelSize = (int) Math.ceil(((double) dimensionPixelSize) * d2);
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize;
            layoutParams.verticalBias = f60.ALPHA_TRANSPARENT;
        }
        this.C = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        s(this.l, (float) Math.ceil(this.A / 2.0f));
        if (z) {
            requestLayout();
        }
        if (this.I != 1.0f) {
            cm4.a(TAG, this.j + "mCurrScale != mInitScale,mCurrScale:" + this.I);
            V(this.I, 0L);
        }
    }

    public boolean w() {
        Params params = this.G;
        return (params == null || params.getFaceWidth() == f60.ALPHA_TRANSPARENT || this.G.getFaceHeight() == f60.ALPHA_TRANSPARENT) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        setFaceViewVisibility(8);
        cm4.a(TAG, this.j + "_sdkVersion:" + Build.VERSION.SDK_INT);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        double dA = (double) qmg.a(getContext(), this.F.h().getFaceWidth());
        double d2 = this.s;
        if (d2 != 0.0d) {
            dA = Math.ceil(dA * d2);
        }
        TextureView textureView = new TextureView(getContext());
        textureView.setOutlineProvider(new c(dA));
        h2a h2aVar = this.F;
        if (h2aVar != null && h2aVar.b()) {
            textureView.setClipToOutline(true);
        }
        textureView.setSurfaceTextureListener(new d());
        this.m.removeAllViews();
        this.m.addView(textureView);
        ImageView imageView = new ImageView(getContext());
        this.p = imageView;
        imageView.setVisibility(8);
        this.p.setLayoutParams(layoutParams);
        setBuffViewColor(this.p);
        if0.G(this.p, false);
        this.m.addView(this.p);
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.u = mediaPlayer;
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.oplus.aiunit.vision.tkl
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                this.i.z(mediaPlayer2);
            }
        });
        this.u.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.oplus.aiunit.vision.ukl
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                return this.i.B(mediaPlayer2, i, i2);
            }
        });
        this.u.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.oplus.aiunit.vision.vkl
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                this.i.C(mediaPlayer2);
            }
        });
    }

    public boolean y() {
        h2a h2aVar;
        if (!TextUtils.isEmpty(this.n) && (h2aVar = this.F) != null) {
            try {
                return !h2aVar.i(this);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public WatchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WatchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = "";
        this.r = true;
        this.H = 1.0f;
        this.I = 1.0f;
        this.K = new LinkedList();
        u(context, attributeSet);
    }
}
