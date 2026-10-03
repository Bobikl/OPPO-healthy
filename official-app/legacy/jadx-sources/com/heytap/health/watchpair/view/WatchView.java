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
import com.heytap.health.device_pair.R$dimen;
import com.heytap.health.device_pair.R$drawable;
import com.heytap.health.device_pair.R$id;
import com.heytap.health.device_pair.R$layout;
import com.heytap.health.device_pair.R$styleable;
import com.heytap.health.device_pair.view.IWatchViewService;
import com.heytap.health.devicemanager.api.ICloudDeviceProcessorService;
import com.heytap.health.devicemanager.processor.bean.Params;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.manager.SkuHelper;
import com.oplus.aiunit.vision.a1a;
import com.oplus.aiunit.vision.b1a;
import com.oplus.aiunit.vision.cc5;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.g6e;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.hk5;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.x0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class WatchView extends ConstraintLayout {
    public static final Set<String> L = new HashSet();
    public static final String TAG = "WatchView";
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public a1a F;
    public Params G;
    public final float H;
    public float I;
    public IWatchViewService J;
    public final Queue<g6e> K;
    public b1a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f7188j;
    public ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f7189l;
    public FrameLayout m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f7190n;
    public String o;
    public ImageView p;
    public MediaPlayer.OnCompletionListener q;
    public boolean r;
    public double s;
    public Surface t;
    public MediaPlayer u;
    public g6e v;
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

    public class b extends cc5<Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f7191c;
        public final /* synthetic */ String d;

        public b(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.f7191c = str3;
            this.d = str4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(String str, String str2, String str3) {
            try {
                if (WatchView.this.F != null && TextUtils.equals(str, WatchView.this.o) && TextUtils.equals(str2, WatchView.this.f7190n)) {
                    WatchView.this.F.o(WatchView.this, str3, false);
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void b(Throwable th, String str) {
            super.b(th, str);
            synchronized (WatchView.L) {
                WatchView.L.remove(this.f7191c);
            }
        }

        @Override // com.oplus.aiunit.vision.cc5
        public void c(Object obj) {
            hk5.b next;
            super.c(obj);
            try {
                try {
                    hk5 hk5Var = (hk5) obj;
                    final String strB = null;
                    if (hk5Var != null && hk5Var.d() != null) {
                        Iterator<hk5.b> it = hk5Var.d().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (next != null && !TextUtils.isEmpty(this.a) && TextUtils.equals(next.d(), this.a)) {
                                break;
                            }
                        }
                    } else {
                        next = null;
                        break;
                    }
                    if (next == null) {
                        synchronized (WatchView.L) {
                            WatchView.L.remove(this.f7191c);
                        }
                        return;
                    }
                    if (next.c() != null) {
                        for (hk5.a aVar : next.c()) {
                            if (aVar != null && TextUtils.equals(aVar.a(), "picture_id")) {
                                strB = aVar.b();
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strB) && !TextUtils.equals(this.b, strB)) {
                        SkuHelper.c(this.f7191c, strB);
                        SkuHelper.d();
                        WatchView watchView = WatchView.this;
                        final String str = this.f7191c;
                        final String str2 = this.d;
                        watchView.post(new Runnable() { // from class: com.oplus.aiunit.vision.ahl
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.i.e(str, str2, strB);
                            }
                        });
                    }
                    synchronized (WatchView.L) {
                        WatchView.L.remove(this.f7191c);
                    }
                } catch (Exception e2) {
                    ml4.c(WatchView.TAG, WatchView.this.f7188j + "_fetchSkuIdImageIfNeed parse error:" + e2.getMessage());
                    synchronized (WatchView.L) {
                        WatchView.L.remove(this.f7191c);
                    }
                }
            } catch (Throwable th) {
                synchronized (WatchView.L) {
                    WatchView.L.remove(this.f7191c);
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
            ml4.d(WatchView.TAG, WatchView.this.f7188j + "_ onSurfaceTextureAvailable ");
            if (WatchView.this.u != null) {
                WatchView.this.t = new Surface(surfaceTexture);
                WatchView.this.u.setSurface(WatchView.this.t);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
            ml4.d(WatchView.TAG, WatchView.this.f7188j + "_ onSurfaceTextureDestroyed ");
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
            ml4.d(WatchView.TAG, WatchView.this.f7188j + "_ onSurfaceTextureSizeChanged ");
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
        ml4.a(TAG, this.f7188j + "_info" + i);
        if (i != 3 || (imageView = this.p) == null || imageView.getVisibility() != 0) {
            return false;
        }
        this.p.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.zgl
            @Override // java.lang.Runnable
            public final void run() {
                this.i.A();
            }
        }, 50L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(MediaPlayer mediaPlayer) {
        ml4.a(TAG, this.f7188j + "_onCompletion");
        if (this.v != null) {
            if (this.K.peek() != null) {
                g6e g6eVarPoll = this.K.poll();
                if (g6eVarPoll != null) {
                    F(g6eVarPoll);
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

    private b1a getResDelegate() {
        IWatchViewService watchViewService;
        if (this.i == null && (watchViewService = getWatchViewService()) != null) {
            this.i = watchViewService.Qa();
        }
        return this.i;
    }

    private IWatchViewService getWatchViewService() {
        if (this.J == null) {
            this.J = (IWatchViewService) x0.d().b("/device_pair/IWatchViewService").navigation();
        }
        return this.J;
    }

    private void setBuffViewColor(ImageView imageView) {
        a1a a1aVar = this.F;
        if (a1aVar == null || !a1aVar.b()) {
            imageView.setBackgroundColor(-16777216);
        } else {
            imageView.setBackgroundResource(R$drawable.watch_round_buff);
        }
    }

    private void setFaceViewVisibility(int i) {
        this.f7189l.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(MediaPlayer mediaPlayer) {
        ml4.d(TAG, this.f7188j + "_ onPrepared ");
        MediaPlayer mediaPlayer2 = this.u;
        if (mediaPlayer2 != null) {
            mediaPlayer2.start();
            return;
        }
        ml4.e(TAG, this.f7188j + "_ onPrepared mMediaPlayer is null");
    }

    public void E(g6e g6eVar) {
        ml4.a(TAG, this.f7188j + "_offerVideo " + g6eVar);
        this.K.offer(g6eVar);
    }

    public void F(@NonNull g6e g6eVar) {
        this.w = true;
        ml4.a(TAG, this.f7188j + "_playVideo " + g6eVar);
        this.v = g6eVar;
        G(g6eVar.a(), false);
    }

    public void G(String str, boolean z) {
        ml4.a(TAG, this.f7188j + "_ playVideo() called with: res = [" + str + "]");
        N();
        MediaPlayer mediaPlayer = getMediaPlayer();
        ImageView imageView = this.p;
        if (imageView != null) {
            Object tag = imageView.getTag();
            ml4.d(TAG, this.f7188j + "_playVideo: " + tag);
            if (tag == null || ((tag instanceof Boolean) && !((Boolean) tag).booleanValue())) {
                ml4.d(TAG, this.f7188j + "_playVideo: show");
                this.p.setVisibility(0);
            }
        }
        try {
            mediaPlayer.reset();
            this.u.setLooping(z);
            this.u.setDataSource(str);
            this.u.prepareAsync();
        } catch (Exception e2) {
            this.w = false;
            ml4.c(TAG, this.f7188j + "_ set source error " + e2.getMessage());
        }
    }

    public void H() {
        this.q = null;
    }

    public void I(@NonNull Runnable runnable) {
        b1a resDelegate = getResDelegate();
        if (resDelegate != null) {
            resDelegate.e(this, runnable);
        }
    }

    public void J() {
        reset();
        this.f7189l.setImageBitmap(null);
        setBuffViewColor(this.f7189l);
    }

    public void K() {
        if (this.v == null) {
            reset();
            this.f7189l.setImageBitmap(null);
            setBuffViewColor(this.f7189l);
        }
    }

    public void L(String str, String str2) {
        ml4.d(TAG, this.f7188j + "_deviceMac:" + gdb.a(str) + " setDeviceModel: " + str2);
        if (TextUtils.equals(this.o, str) && TextUtils.equals(this.f7190n, str2)) {
            b1a resDelegate = getResDelegate();
            if (resDelegate != null) {
                resDelegate.f(this);
                return;
            }
            return;
        }
        this.f7190n = str2;
        this.o = str;
        b1a resDelegate2 = getResDelegate();
        if (resDelegate2 != null) {
            resDelegate2.b(this);
        }
        IWatchViewService watchViewService = getWatchViewService();
        if (watchViewService != null) {
            this.F = watchViewService.M2(this.f7190n);
        }
        this.s = 0.0d;
        Context context = getContext();
        if (this.r) {
            int iE = ejg.e(context);
            double dimension = getResources().getDimension(R$dimen.pair_settings_background_hei);
            double dA = (dimension / ((double) ejg.a(context, 620.0f))) * ((double) iE);
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
        ml4.d(TAG, this.f7188j + "_startPoll isPlaying " + this.w);
        if (this.w) {
            return;
        }
        g6e g6eVarPoll = this.K.poll();
        this.v = g6eVarPoll;
        if (g6eVarPoll != null) {
            F(g6eVarPoll);
            return;
        }
        ml4.c(TAG, this.f7188j + "_startPoll poll is null");
    }

    public void P() {
        Context context = getContext();
        if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
            ml4.c(TAG, this.f7188j + "_activity isDestroyed");
            return;
        }
        if (this.F == null) {
            ml4.c(TAG, this.f7188j + "_updateId ability is null");
            return;
        }
        String str = SkuHelper.b().get(this.o);
        ml4.a(TAG, this.f7190n + " updateId " + str);
        UserDeviceInfo boundDeviceInfoByMac = gl4.managerApi.getBoundDeviceInfoByMac(this.o);
        if (boundDeviceInfoByMac != null) {
            t(str, false, boundDeviceInfoByMac.getSkuCode(), boundDeviceInfoByMac.getDeviceType());
        }
        this.F.o(this, str, true);
    }

    public void Q() {
        ml4.d(TAG, this.f7188j + "_videoDestroy " + this.v);
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
        Queue<g6e> queue = this.K;
        if (queue != null) {
            queue.clear();
        }
        this.v = null;
        this.w = false;
    }

    public void R() {
        ml4.d(TAG, this.f7188j + "_videoPause " + this.v);
        this.w = false;
        MediaPlayer mediaPlayer = this.u;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    public void S() {
        ml4.d(TAG, this.f7188j + "_videoResume " + this.v);
        this.w = true;
        MediaPlayer mediaPlayer = this.u;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public void T() {
        ml4.d(TAG, this.f7188j + "_videoStop " + this.v);
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
        boolean z = f3 > 0.0f && this.z > 0.0f && this.A > 0.0f && this.B > 0.0f && this.D > 0.0f && this.E > 0.0f;
        if (!z) {
            f3 = layoutParams.width;
        }
        float f4 = z ? this.z : layoutParams.height;
        float f5 = f != 0.0f ? f / f3 : f2 / f4;
        this.I = f5;
        layoutParams.width = (int) Math.floor(f3 * f5);
        layoutParams.height = (int) Math.floor(f4 * f5);
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) getFaceView().getLayoutParams();
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

    public void V(float f, long j2) {
        this.I = f;
        final ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        final ViewGroup.LayoutParams layoutParams2 = getShellView().getLayoutParams();
        final ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) getFaceView().getLayoutParams();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, f);
        this.x = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j2);
        this.x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.ygl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.i.D(layoutParams2, layoutParams3, layoutParams, valueAnimator);
            }
        });
        this.x.start();
    }

    public String getDeviceModel() {
        return this.f7190n;
    }

    public ImageView getFaceView() {
        return this.f7189l;
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

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b1a resDelegate = getResDelegate();
        if (resDelegate != null) {
            resDelegate.d(this);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b1a resDelegate = getResDelegate();
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
        a1a a1aVar = this.F;
        if (a1aVar == null || !a1aVar.b()) {
            imageView.setClipToOutline(false);
        } else {
            imageView.setClipToOutline(true);
            imageView.setOutlineProvider(new a(f));
        }
    }

    public void setAutoDownloadRes(boolean z) {
        b1a resDelegate = getResDelegate();
        if (resDelegate != null) {
            resDelegate.g(z, this);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.q = onCompletionListener;
    }

    public void setOrtherTag(String str) {
        this.f7188j = str;
    }

    public void setResDownloadUpdateCallback(Runnable runnable) {
        b1a resDelegate = getResDelegate();
        if (resDelegate != null) {
            resDelegate.c(runnable, this);
        }
    }

    public void t(String str, boolean z, String str2, int i) {
        if (z || TextUtils.isEmpty(str)) {
            String str3 = this.o;
            String str4 = this.f7190n;
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return;
            }
            Set<String> set = L;
            synchronized (set) {
                if (set.contains(str3)) {
                    return;
                }
                set.add(str3);
                ICloudDeviceProcessorService iCloudDeviceProcessorService = (ICloudDeviceProcessorService) x0.d().b(ICloudDeviceProcessorService.SERVICE_PATH).navigation();
                if (iCloudDeviceProcessorService != null) {
                    iCloudDeviceProcessorService.A9(str4, i, new b(str2, str, str3, str4));
                } else {
                    synchronized (set) {
                        set.remove(str3);
                    }
                }
            }
        }
    }

    public final void u(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WatchView);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.WatchView_wv_face_res, 0);
            this.r = typedArrayObtainStyledAttributes.getBoolean(R$styleable.WatchView_wv_autosize, this.r);
            typedArrayObtainStyledAttributes.recycle();
            LayoutInflater.from(context).inflate(R$layout.view_watchview, (ViewGroup) this, true);
            this.m = (FrameLayout) findViewById(R$id.video_layout);
            this.f7189l = (ImageView) findViewById(R$id.set_hand_img_band2);
            this.k = (ImageView) findViewById(R$id.iv_oobe_watch_bg);
            qe0.G(this.f7189l, false);
            qe0.G(this.k, false);
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

    public void v(boolean z) {
        M(this.k, getResources().getDimension(R$dimen.pair_settings_background_wid), getResources().getDimension(R$dimen.pair_settings_background_hei), this.s);
        this.y = this.k.getLayoutParams().width;
        this.z = this.k.getLayoutParams().height;
        this.G = this.F.h();
        ml4.d(TAG, this.f7188j + "_face size:" + this.G);
        double dA = (double) ((float) ejg.a(getContext(), this.G.getFaceWidth()));
        double dA2 = (double) ((float) ejg.a(getContext(), this.G.getFaceHeight()));
        M(this.m, dA, dA2, this.s);
        this.D = this.m.getLayoutParams().width;
        this.E = this.m.getLayoutParams().height;
        M(this.f7189l, dA, dA2, this.s);
        this.A = this.f7189l.getLayoutParams().width;
        this.B = this.f7189l.getLayoutParams().height;
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f7189l.getLayoutParams();
        a1a a1aVar = this.F;
        if (a1aVar == null || !a1aVar.a()) {
            layoutParams.verticalBias = 0.5f;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        } else {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.device_pair_watchview_band_top_margin);
            double d2 = this.s;
            if (d2 != 0.0d) {
                dimensionPixelSize = (int) Math.ceil(((double) dimensionPixelSize) * d2);
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize;
            layoutParams.verticalBias = 0.0f;
        }
        this.C = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        s(this.f7189l, (float) Math.ceil(this.A / 2.0f));
        if (z) {
            requestLayout();
        }
        if (this.I != 1.0f) {
            ml4.a(TAG, this.f7188j + "mCurrScale != mInitScale,mCurrScale:" + this.I);
            V(this.I, 0L);
        }
    }

    public boolean w() {
        Params params = this.G;
        return (params == null || params.getFaceWidth() == 0.0f || this.G.getFaceHeight() == 0.0f) ? false : true;
    }

    public final void x() {
        setFaceViewVisibility(8);
        ml4.a(TAG, this.f7188j + "_sdkVersion:" + Build.VERSION.SDK_INT);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        double dA = (double) ejg.a(getContext(), this.F.h().getFaceWidth());
        double d2 = this.s;
        if (d2 != 0.0d) {
            dA = Math.ceil(dA * d2);
        }
        TextureView textureView = new TextureView(getContext());
        textureView.setOutlineProvider(new c(dA));
        a1a a1aVar = this.F;
        if (a1aVar != null && a1aVar.b()) {
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
        qe0.G(this.p, false);
        this.m.addView(this.p);
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.u = mediaPlayer;
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.oplus.aiunit.vision.vgl
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                this.i.z(mediaPlayer2);
            }
        });
        this.u.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.oplus.aiunit.vision.wgl
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                return this.i.B(mediaPlayer2, i, i2);
            }
        });
        this.u.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.oplus.aiunit.vision.xgl
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                this.i.C(mediaPlayer2);
            }
        });
    }

    public boolean y() {
        a1a a1aVar;
        if (!TextUtils.isEmpty(this.f7190n) && (a1aVar = this.F) != null) {
            try {
                return !a1aVar.i(this);
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
        this.f7188j = "";
        this.r = true;
        this.H = 1.0f;
        this.I = 1.0f;
        this.K = new LinkedList();
        u(context, attributeSet);
    }
}
