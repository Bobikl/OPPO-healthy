package com.vfx.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import com.vfx.lib.ResizeLayout;
import com.vfx.lib.VFXEngineHelper;
import com.vfx.lib.VFXRenderer;
import com.vfx.lib.VFXTextureView;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes10.dex */
public class VFXPaintingView extends ResizeLayout implements VFXTextureView.m {
    private static final String TAG = "VFXPaintingView";
    private static final String VERSION = "AODCreationEngine-1.3.10";
    private y OnSaveAsyncListener;
    private z OnVFXCreatedAsyncListener;
    private Context mContext;
    private int mFPS;
    private Bitmap mFinishBitmap;
    private Handler mHandler;
    private String mJson;
    private boolean mPreinit;
    private Bitmap mSemiBitmap;
    private boolean mShowIntro;
    private Timer mTimer;
    private int mType;
    private int mVFXIndex;
    private VFXRenderer mVFXRenderer;
    private VFXTextureView mVFXTextureView;
    private boolean mWithSpark;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (VFXPaintingView.this.isSaveFinished()) {
                Message message = new Message();
                message.what = 0;
                Log.d(VFXPaintingView.TAG, "VFX--------------------requestSave--------------------SaveFinished");
                VFXPaintingView.this.mHandler.sendMessage(message);
                VFXPaintingView.this.mTimer.cancel();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeReplay();
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ float i;

        public c(float f) {
            this.i = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(VFXPaintingView.TAG, "VFX--------------------setAlpha--------------------alpha, " + this.i);
            VFXPaintingView.nativeSetOpacity(this.i);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeRefreshAutoDraw();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeRedo();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeUndo();
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ int i;

        public g(int i) {
            this.i = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetStyle(this.i);
        }
    }

    public class h implements Runnable {
        public final /* synthetic */ float i;

        public h(float f) {
            this.i = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetSilkOpacity(this.i);
        }
    }

    public class i implements Runnable {
        public final /* synthetic */ float i;

        public i(float f) {
            this.i = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetVelocity(this.i);
        }
    }

    public class j implements Runnable {
        public final /* synthetic */ float i;

        public j(float f) {
            this.i = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetFallOut(this.i);
        }
    }

    public class k extends Handler {
        public k() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                Log.d(VFXPaintingView.TAG, "handle SaveFinished Message");
                if (VFXPaintingView.this.mSemiBitmap == null || VFXPaintingView.this.mSemiBitmap.isRecycled()) {
                    Log.d(VFXPaintingView.TAG, "null or recycled, create semi bitmap");
                    VFXPaintingView vFXPaintingView = VFXPaintingView.this;
                    vFXPaintingView.mSemiBitmap = Bitmap.createBitmap(vFXPaintingView.mVFXTextureView.getWidth(), VFXPaintingView.this.mVFXTextureView.getWidth(), Bitmap.Config.ARGB_8888);
                }
                if (VFXPaintingView.this.mFinishBitmap == null || VFXPaintingView.this.mFinishBitmap.isRecycled()) {
                    Log.d(VFXPaintingView.TAG, "null or recycled, create finish bitmap");
                    VFXPaintingView vFXPaintingView2 = VFXPaintingView.this;
                    vFXPaintingView2.mFinishBitmap = Bitmap.createBitmap(vFXPaintingView2.mVFXTextureView.getWidth(), VFXPaintingView.this.mVFXTextureView.getWidth(), Bitmap.Config.ARGB_8888);
                }
                boolean zNativeGetBitmap = VFXPaintingView.nativeGetBitmap(VFXPaintingView.this.mSemiBitmap, 1);
                boolean zNativeGetBitmap2 = VFXPaintingView.nativeGetBitmap(VFXPaintingView.this.mFinishBitmap, 0);
                VFXPaintingView.this.mJson = VFXPaintingView.nativeGetAnimation();
                if (VFXPaintingView.this.OnSaveAsyncListener != null) {
                    if (VFXPaintingView.this.mJson == null) {
                        Log.d(VFXPaintingView.TAG, "VFX--------------------SaveFinished--------------------json is null");
                        VFXPaintingView.this.OnSaveAsyncListener.a(false, VFXPaintingView.this.mSemiBitmap, VFXPaintingView.this.mFinishBitmap, VFXPaintingView.this.mJson);
                        return;
                    }
                    Log.d(VFXPaintingView.TAG, "VFX--------------------SaveFinished--------------------mJson.length(): " + VFXPaintingView.this.mJson.length() + ", mSemiBitmap has been saved: " + zNativeGetBitmap + ", mFinishBitmap has been saved: " + zNativeGetBitmap2);
                    VFXPaintingView.this.OnSaveAsyncListener.a(VFXPaintingView.this.mJson.length() != 0 && zNativeGetBitmap && zNativeGetBitmap2, VFXPaintingView.this.mSemiBitmap, VFXPaintingView.this.mFinishBitmap, VFXPaintingView.this.mJson);
                }
            }
        }
    }

    public class l implements Runnable {
        public final /* synthetic */ float i;

        public l(float f) {
            this.i = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetForceScale(this.i);
        }
    }

    public class m implements Runnable {
        public final /* synthetic */ float i;

        public m(float f) {
            this.i = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetLineWidth(this.i);
        }
    }

    public class n implements Runnable {
        public final /* synthetic */ int i;

        public n(int i) {
            this.i = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetDrawPerFrame(this.i);
        }
    }

    public class o implements Runnable {
        public final /* synthetic */ int i;

        public o(int i) {
            this.i = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetStaySparkRation(this.i);
        }
    }

    public class p implements Runnable {
        public final /* synthetic */ float i;

        public p(float f) {
            this.i = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetStaySparkOpacityRation(this.i);
        }
    }

    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeRequestPlayback(VFXPaintingView.this.mJson, VFXPaintingView.this.mSemiBitmap, VFXPaintingView.this.mFinishBitmap, VFXPaintingView.this.mFPS);
        }
    }

    public class r implements Runnable {
        public final /* synthetic */ int i;

        public r(int i) {
            this.i = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetBrushColor(this.i);
        }
    }

    public class s implements Runnable {
        public final /* synthetic */ int i;

        public s(int i) {
            this.i = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetBrushHighLightColor(this.i);
        }
    }

    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeClearCanvas();
        }
    }

    public class u implements Runnable {
        public final /* synthetic */ boolean i;

        public u(boolean z) {
            this.i = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetMirror(this.i ? 1 : 0);
        }
    }

    public class v implements Runnable {
        public final /* synthetic */ int i;

        public v(int i) {
            this.i = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetRotations(this.i);
        }
    }

    public class w implements Runnable {
        public final /* synthetic */ int i;

        public w(int i) {
            this.i = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            VFXPaintingView.nativeSetSprials(this.i);
        }
    }

    public class x implements Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(VFXPaintingView.TAG, "VFX--------------------requestSave--------------------nativeRequestSave");
            VFXPaintingView.nativeRequestSave();
        }
    }

    public interface y {
        void a(boolean z, Bitmap bitmap, Bitmap bitmap2, String str);
    }

    public interface z {
        void a(int i);
    }

    public VFXPaintingView(Context context, int i2) {
        this(context, i2, true);
    }

    private int getVFXIndex() {
        return this.mVFXIndex;
    }

    private void initWithParameters(Context context, int i2, boolean z2, boolean z3) {
        this.mContext = context;
        onLoadNativeLibraries();
        this.mType = i2;
        this.mWithSpark = z2;
        this.mShowIntro = z3;
        if (i2 != 1) {
            start();
        }
        Log.d(TAG, "VFXPaintingView created With showIntro:" + this.mShowIntro + " by:" + context.getClass().getSimpleName() + ", playback withSpark: " + this.mWithSpark + ", currentVersion: " + VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSaveFinished() {
        return nativeisSaveFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeClearCanvas();

    private static native boolean nativeDisableSpark();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nativeGetAnimation();

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nativeGetBitmap(Bitmap bitmap, int i2);

    private static native void nativePause();

    private static native int nativePreInit(int i2, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeRedo();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeRefreshAutoDraw();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeReplay();

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nativeRequestPlayback(String str, Bitmap bitmap, Bitmap bitmap2, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeRequestSave();

    private static native void nativeResume();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetBrushColor(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetBrushHighLightColor(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetDrawPerFrame(float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetFallOut(float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetForceScale(float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetLineWidth(float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetMirror(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetOpacity(float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetRotations(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetSilkOpacity(float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetSprials(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetStaySparkOpacityRation(float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetStaySparkRation(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetStyle(int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetVelocity(float f2);

    private static native boolean nativeShowIntro();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeUndo();

    private static native boolean nativeisSaveFinished();

    private void resetVFXID() {
        if (this.mVFXIndex == -1 || this.mVFXTextureView == null) {
            return;
        }
        Log.d(TAG, "VFX--------------------resetVFXID--------------------nativeReset VFXID: " + this.mVFXIndex);
        VFXRenderer.nativeResetVFXID(this.mVFXIndex);
    }

    public void clearCanvas() {
        Log.d(TAG, "VFX--------------------clearCanvas--------------------");
        this.mVFXTextureView.r(new t());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Log.d("VFX", "VFXPaintingView: onAttachedToWindow called by " + this.mContext.getClass().getSimpleName());
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.mPreinit = false;
        Log.d("VFX", "VFXPaintingView: onDetachedFromWindow called by " + this.mContext.getClass().getSimpleName());
        VFXTextureView vFXTextureView = this.mVFXTextureView;
        if (vFXTextureView != null) {
            vFXTextureView.o();
            this.mVFXTextureView.q();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public void onLoadNativeLibraries() {
        try {
            System.loadLibrary("handpaintedeffects");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.vfx.lib.VFXTextureView.m
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        Log.d("VFX", "VFXPaintingView-----------------onSurfaceTextureAvailable called by " + this.mContext.getClass().getSimpleName());
        if (this.mPreinit) {
            return;
        }
        Log.d(TAG, "VFX--------------------onSurfaceTextureAvailable--------------------nativePreInit");
        int iNativePreInit = nativePreInit(this.mType, Thread.currentThread().getId());
        this.mVFXIndex = iNativePreInit;
        z zVar = this.OnVFXCreatedAsyncListener;
        if (zVar != null) {
            zVar.a(iNativePreInit);
        }
        this.mVFXTextureView.setVFXID(this.mVFXIndex);
        int i4 = this.mType;
        if (i4 == 1) {
            this.mVFXTextureView.setPreProcess(new q());
        } else if (i4 == 0) {
            if (this.mShowIntro) {
                nativeShowIntro();
            }
            if (!this.mWithSpark) {
                nativeDisableSpark();
            }
        }
        this.mPreinit = true;
    }

    @Override // com.vfx.lib.VFXTextureView.m
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // com.vfx.lib.VFXTextureView.m
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    @Override // com.vfx.lib.VFXTextureView.m
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void pause() {
        if (this.mVFXTextureView != null) {
            Log.d(TAG, "VFX--------------------onPause called by " + this.mContext.getClass().getSimpleName());
            this.mVFXTextureView.setVFXPaused(true);
            if (this.mPreinit && this.mType == 0) {
                nativePause();
            }
        }
    }

    public void playback(String str, Bitmap bitmap, Bitmap bitmap2, int i2) {
        if (str == null) {
            Log.d(TAG, "VFX--------------------playback--------------------The json is null!");
            return;
        }
        if (bitmap2 == null) {
            Log.d(TAG, "VFX--------------------playback--------------------The finishBitmap is null");
            return;
        }
        if (bitmap2.getConfig() != Bitmap.Config.ARGB_8888) {
            Log.d(TAG, "VFX--------------------playback--------------------The config of the bitmap must be ARGB_8888");
            return;
        }
        if (bitmap != null && bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            Log.d(TAG, "VFX--------------------playback--------------------The config of the bitmap must be ARGB_8888");
            return;
        }
        this.mSemiBitmap = bitmap;
        this.mFinishBitmap = bitmap2;
        this.mJson = str;
        this.mFPS = i2;
        start();
    }

    public void redo() {
        Log.d(TAG, "VFX--------------------redo--------------------nativeRedo");
        this.mVFXTextureView.r(new e());
    }

    public void refreshAutoDraw() {
        Log.d(TAG, "VFX--------------------refreshAutoDraw--------------------nativeRefreshAutoDraw");
        this.mVFXTextureView.r(new d());
    }

    public void replay() {
        VFXTextureView vFXTextureView = this.mVFXTextureView;
        if (vFXTextureView != null) {
            vFXTextureView.r(new b());
        }
    }

    public void requestSave() {
        Log.d(TAG, "VFX--------------------requestSave--------------------");
        this.mVFXTextureView.r(new x());
        Timer timer = new Timer();
        this.mTimer = timer;
        timer.schedule(new a(), 100L, 16L);
    }

    public void resume() {
        if (this.mVFXTextureView != null) {
            Log.d(TAG, "VFX--------------------onResume called by " + this.mContext.getClass().getSimpleName());
            resetVFXID();
            VFXRenderer.setAnimationInterval(1.0f / ((float) this.mFPS));
            this.mVFXTextureView.setVFXPaused(false);
            if (this.mPreinit) {
                this.mVFXTextureView.v();
                if (this.mType == 0) {
                    nativeResume();
                }
            }
        }
    }

    public void seVFXCreatedAsyncListener(z zVar) {
        if (zVar != null) {
            this.OnVFXCreatedAsyncListener = zVar;
            Log.d(TAG, "VFX-----------------seVFXCreatedAsyncListener--------------------");
        }
    }

    @Override // android.view.View
    public void setAlpha(float f2) {
        this.mVFXTextureView.r(new c(f2));
    }

    public void setBrushColor(int i2) {
        Log.d(TAG, "VFX--------------------setBrushColor--------------------nativeSetBrushColor: " + i2);
        this.mVFXTextureView.r(new r(i2));
    }

    public void setBrushHighLightColor(int i2) {
        Log.d(TAG, "VFX--------------------setBrushHighLightColor--------------------nativeSetBrushHighLightColor: " + i2);
        this.mVFXTextureView.r(new s(i2));
    }

    public void setDrawPerFrame(int i2) {
        this.mVFXTextureView.r(new n(i2));
    }

    public void setFallOut(float f2) {
        this.mVFXTextureView.r(new j(f2));
    }

    public void setForceScale(float f2) {
        this.mVFXTextureView.r(new l(f2));
    }

    public void setLineWidth(float f2) {
        this.mVFXTextureView.r(new m(f2));
    }

    public void setMirror(boolean z2) {
        Log.d(TAG, "VFX--------------------setMirror--------------------nativeSetMirror: " + z2);
        this.mVFXTextureView.r(new u(z2));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019 A[PHI: r0
  0x0019: PHI (r0v5 int) = (r0v2 int), (r0v3 int) binds: [B:3:0x0017, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public void setRotations(int i2) {
        Log.d(TAG, "VFX--------------------setRotations--------------------nativeSetRotations: " + i2);
        int i3 = 1;
        if (i2 < 1) {
            i2 = i3;
        } else {
            i3 = 6;
            if (i2 > 6) {
                i2 = i3;
            }
        }
        this.mVFXTextureView.r(new v(i2));
    }

    public void setSaveAsyncListener(y yVar) {
        if (yVar != null) {
            this.OnSaveAsyncListener = yVar;
            Log.d(TAG, "VFX-----------------setSaveAsyncListener--------------------");
        }
    }

    public void setSilkOpacity(float f2) {
        this.mVFXTextureView.r(new h(f2));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019 A[PHI: r0
  0x0019: PHI (r0v5 int) = (r0v2 int), (r0v3 int) binds: [B:3:0x0017, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public void setSprials(int i2) {
        Log.d(TAG, "VFX--------------------setSprials--------------------nativeSetSprials: " + i2);
        int i3 = 1;
        if (i2 < 1) {
            i2 = i3;
        } else {
            i3 = 5;
            if (i2 > 5) {
                i2 = i3;
            }
        }
        this.mVFXTextureView.r(new w(i2));
    }

    public void setStaySparkOpacityRation(float f2) {
        this.mVFXTextureView.r(new p(f2));
    }

    public void setStaySparkRation(int i2) {
        this.mVFXTextureView.r(new o(i2));
    }

    public void setStyle(int i2) {
        Log.d(TAG, "VFX--------------------setStyle--------------------nativeSetStyle, style: " + i2);
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > 1) {
            i2 = 1;
        }
        this.mVFXTextureView.r(new g(i2));
    }

    public void setVelocity(float f2) {
        this.mVFXTextureView.r(new i(f2));
    }

    public void showFPS(boolean z2) {
        this.mVFXTextureView.w(z2);
    }

    public void start() {
        Log.d(TAG, "VFX-----------------start--------------------");
        if (this.mVFXTextureView == null) {
            VFXEngineHelper.init(this.mContext);
            VFXTextureView vFXTextureView = new VFXTextureView(this.mContext);
            this.mVFXTextureView = vFXTextureView;
            addView(vFXTextureView);
            VFXRenderer vFXRenderer = new VFXRenderer(this.mType);
            this.mVFXRenderer = vFXRenderer;
            this.mVFXTextureView.setVFXRenderer(vFXRenderer);
            this.mVFXTextureView.setTextureViewEngineControl(this);
            Log.d(TAG, "VFX--------------------start--------------------mVFXTextureView : " + this.mVFXTextureView.hashCode());
        }
    }

    public void undo() {
        Log.d(TAG, "VFX--------------------undo--------------------nativeUndo");
        this.mVFXTextureView.r(new f());
    }

    public VFXPaintingView(Context context, int i2, boolean z2) {
        this(context, i2, z2, false);
    }

    public VFXPaintingView(Context context, int i2, boolean z2, boolean z3) {
        super(context);
        this.mVFXTextureView = null;
        this.mVFXRenderer = null;
        this.mPreinit = false;
        this.mVFXIndex = -1;
        this.mWithSpark = true;
        this.mShowIntro = false;
        this.mFPS = 60;
        this.mHandler = new k();
        initWithParameters(context, i2, z2, z3);
    }

    public VFXPaintingView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, true);
    }

    public VFXPaintingView(Context context, AttributeSet attributeSet, int i2, boolean z2) {
        this(context, attributeSet, i2, z2, false);
    }

    public VFXPaintingView(Context context, AttributeSet attributeSet, int i2, boolean z2, boolean z3) {
        super(context, attributeSet);
        this.mVFXTextureView = null;
        this.mVFXRenderer = null;
        this.mPreinit = false;
        this.mVFXIndex = -1;
        this.mWithSpark = true;
        this.mShowIntro = false;
        this.mFPS = 60;
        this.mHandler = new k();
        initWithParameters(context, i2, z2, z3);
    }
}
