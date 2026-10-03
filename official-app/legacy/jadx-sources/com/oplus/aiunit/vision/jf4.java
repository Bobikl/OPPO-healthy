package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.SurfaceHolder;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class jf4 implements Camera.PreviewCallback {
    public static volatile jf4 o;
    public Camera a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12872c;
    public int f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12874j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f12875l;
    public int d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12873e = -1;
    public int g = 0;
    public int h = 90;
    public int i = 0;
    public SensorManager m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SensorEventListener f12876n = new a();

    public class a implements SensorEventListener {
        public a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (1 != sensorEvent.sensor.getType()) {
                return;
            }
            float[] fArr = sensorEvent.values;
            int iB = t30.b(fArr[0], fArr[1]);
            if (jf4.this.g != iB) {
                jf4.this.g = iB;
                ltl.a("CustomCameraManager", "[onSensorChanged] mAngle " + jf4.this.g);
            }
        }
    }

    public interface b {
        void onFailure();

        void onSuccess();
    }

    public interface c {
        void a(Bitmap bitmap);
    }

    public jf4() {
        this.f = -1;
        i();
        this.f = this.f12873e;
    }

    public static Rect e(int i, int i2, float f, float f2) {
        int iIntValue = Float.valueOf(300.0f).intValue();
        int i3 = (int) (((f / i) * 2000.0f) - 1000.0f);
        int i4 = (int) (((f2 / i2) * 2000.0f) - 1000.0f);
        int i5 = iIntValue / 2;
        int iF = f(i3 - i5);
        int iF2 = f(i4 - i5);
        RectF rectF = new RectF(iF, iF2, iF + iIntValue, iF2 + iIntValue);
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public static int f(int i) {
        if (i > 1000) {
            return 1000;
        }
        if (i < -1000) {
            return -1000;
        }
        return i;
    }

    public static synchronized jf4 k() {
        if (o == null) {
            synchronized (jf4.class) {
                if (o == null) {
                    o = new jf4();
                }
            }
        }
        return o;
    }

    public static /* synthetic */ void q(String str, b bVar, boolean z, Camera camera) {
        if (!z) {
            if (bVar != null) {
                bVar.onFailure();
            }
        } else {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFocusMode(str);
            camera.setParameters(parameters);
            if (bVar != null) {
                bVar.onSuccess();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(int i, c cVar, byte[] bArr, Camera camera) {
        Bitmap bitmapJ = j(bArr, i);
        if (cVar != null) {
            cVar.a(bitmapJ);
        }
    }

    public static void v() {
        if (o != null) {
            o = null;
        }
    }

    public void A(Context context) {
        if (this.m == null) {
            this.m = (SensorManager) context.getSystemService(com.heytap.health.gdxui.stars.b.TAG_SENSOR);
        }
        this.m.unregisterListener(this.f12876n);
    }

    public void g() {
        Camera camera = this.a;
        if (camera == null) {
            ltl.i("CustomCameraManager", "[destroyCamera]  mCamera = null and return ");
            return;
        }
        try {
            camera.setPreviewCallback(null);
            this.a.stopPreview();
            this.a.setPreviewDisplay(null);
            this.b = false;
            this.a.release();
            this.a = null;
        } catch (Exception e2) {
            ltl.i("CustomCameraManager", "[destroyCamera]  Exception  " + e2.getMessage());
        }
    }

    public final void h() {
        Camera camera = this.a;
        if (camera != null) {
            try {
                camera.enableShutterSound(false);
            } catch (Exception e2) {
                ltl.i("CustomCameraManager", "[enableShutterSound]  Exception  " + e2.getMessage());
            }
        }
    }

    public final void i() {
        ltl.a("CustomCameraManager", "[findAvailableCameras]");
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            int i2 = cameraInfo.facing;
            if (i2 == 0) {
                this.f12873e = i2;
            } else if (i2 == 1) {
                this.d = i2;
            }
        }
    }

    public final Bitmap j(byte[] bArr, int i) {
        float f;
        int i2;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Matrix matrix = new Matrix();
        int i3 = this.f;
        if (i3 == this.f12873e) {
            matrix.setRotate(i);
        } else if (i3 == this.d) {
            matrix.setRotate(360 - i);
            matrix.postScale(-1.0f, 1.0f);
        }
        int width = bitmapDecodeByteArray.getWidth();
        int height = bitmapDecodeByteArray.getHeight();
        if (height > width) {
            f = this.k / width;
            i2 = this.f12874j;
        } else {
            f = this.f12874j / width;
            i2 = this.k;
        }
        matrix.postScale(f, i2 / height);
        return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height, matrix, true);
    }

    public Bitmap l() {
        Camera camera;
        if (this.f12875l != null && (camera = this.a) != null) {
            try {
                Camera.Size previewSize = camera.getParameters().getPreviewSize();
                if (previewSize == null) {
                    ltl.i("CustomCameraManager", "[getPreviewBitmap]  previewSize = null and return");
                    return null;
                }
                Bitmap bitmapM = m(previewSize);
                Matrix matrix = new Matrix();
                int i = this.f;
                if (i == this.f12873e) {
                    matrix.setRotate(-90.0f);
                } else if (i == this.d) {
                    matrix.setRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                }
                float fMin = this.k / Math.min(previewSize.width, previewSize.height);
                matrix.postScale(fMin, fMin);
                return Bitmap.createBitmap(bitmapM, 0, 0, previewSize.width, previewSize.height, matrix, true);
            } catch (Exception e2) {
                ltl.b("CustomCameraManager", "[getPreviewBitmap] --> error=" + e2.getMessage());
            }
        }
        return null;
    }

    public final Bitmap m(Camera.Size size) {
        new BitmapFactory.Options().inJustDecodeBounds = true;
        YuvImage yuvImage = new YuvImage(this.f12875l, 17, size.width, size.height, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, size.width, size.height), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    public void n(int i, int i2, float f, float f2, final b bVar) {
        ltl.a("CustomCameraManager", "[handleFocus] screenWidth " + i + " screenHeight " + i2);
        Camera camera = this.a;
        if (camera == null) {
            ltl.i("CustomCameraManager", "[handleFocus]  mCamera = null and return");
            if (bVar != null) {
                bVar.onFailure();
                return;
            }
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            Rect rectE = e(i, i2, f, f2);
            this.a.cancelAutoFocus();
            if (parameters.getMaxNumFocusAreas() <= 0) {
                if (bVar != null) {
                    bVar.onFailure();
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(rectE, 800));
            parameters.setFocusAreas(arrayList);
            final String focusMode = parameters.getFocusMode();
            parameters.setFocusMode("auto");
            this.a.setParameters(parameters);
            this.a.autoFocus(new Camera.AutoFocusCallback() { // from class: com.oplus.aiunit.vision.if4
                @Override // android.hardware.Camera.AutoFocusCallback
                public final void onAutoFocus(boolean z, Camera camera2) {
                    jf4.q(focusMode, bVar, z, camera2);
                }
            });
        } catch (Exception e2) {
            ltl.i("CustomCameraManager", "[handleFocus]  Exception " + e2.getMessage());
            if (bVar != null) {
                bVar.onFailure();
            }
        }
    }

    public void o(boolean z) {
        this.b = z;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        this.f12875l = bArr;
    }

    public synchronized boolean p() {
        return this.f12872c;
    }

    public final synchronized void s(int i) {
        ltl.a("CustomCameraManager", "[openCamera] id " + i);
        try {
            this.a = Camera.open(i);
        } catch (Exception e2) {
            ltl.a("CustomCameraManager", "[openCamera] open Exception  " + e2.getMessage());
        }
        h();
    }

    public void t(SurfaceHolder surfaceHolder, int i, int i2) {
        ltl.a("CustomCameraManager", "[openCamera] ... previewHeight " + i + " previewWidth " + i2);
        if (this.a == null) {
            s(this.f);
        }
        this.f12874j = i;
        this.k = i2;
        y(surfaceHolder, i / i2);
    }

    public synchronized void takePicture(final c cVar) {
        try {
            if (this.a == null) {
                ltl.i("CustomCameraManager", "[takePicture]  mCamera = null and return");
                return;
            }
            final int iA = t30.a(this.g, this.h);
            try {
                this.a.takePicture(null, null, new Camera.PictureCallback() { // from class: com.oplus.aiunit.vision.hf4
                    @Override // android.hardware.Camera.PictureCallback
                    public final void onPictureTaken(byte[] bArr, Camera camera) {
                        this.a.r(iA, cVar, bArr, camera);
                    }
                });
            } catch (Exception e2) {
                ltl.i("CustomCameraManager", "[takePicture]  Exception " + e2.getMessage());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void u(Context context) {
        if (this.m == null) {
            this.m = (SensorManager) context.getSystemService(com.heytap.health.gdxui.stars.b.TAG_SENSOR);
        }
        SensorManager sensorManager = this.m;
        sensorManager.registerListener(this.f12876n, sensorManager.getDefaultSensor(1), 3);
    }

    public void w(Context context) {
        this.h = kw2.c(context, this.f);
    }

    public void x(float f) {
        int i;
        ltl.a("CustomCameraManager", "[setZoom] zoom " + f);
        Camera camera = this.a;
        if (camera == null) {
            ltl.i("CustomCameraManager", "[setZoom]  mCamera = null and return");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters.isZoomSupported() && (i = (int) (f / 25.0f)) < parameters.getMaxZoom()) {
                int i2 = this.i + i;
                this.i = i2;
                if (i2 < 0) {
                    this.i = 0;
                } else if (i2 > parameters.getMaxZoom()) {
                    this.i = parameters.getMaxZoom();
                }
                parameters.setZoom(this.i);
                this.a.setParameters(parameters);
            }
        } catch (Exception e2) {
            ltl.b("CustomCameraManager", "[setZoom] --> error=" + e2.getMessage());
        }
    }

    public void y(SurfaceHolder surfaceHolder, float f) {
        Camera camera;
        ltl.a("CustomCameraManager", "[startPreview] screenProp " + f);
        if (this.b) {
            ltl.i("CustomCameraManager", "[stopPreview]  mIsPreviewing is true and return");
            return;
        }
        if (surfaceHolder == null || (camera = this.a) == null) {
            ltl.i("CustomCameraManager", "[stopPreview]  (holder == null) || (mCamera == null) and return");
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            if (supportedPreviewSizes == null) {
                ltl.i("CustomCameraManager", " supportedPreviewSizes = null,and return ");
                return;
            }
            Camera.Size sizeD = kw2.d(supportedPreviewSizes, 1080, f);
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            if (supportedPictureSizes == null) {
                ltl.i("CustomCameraManager", " supportedPictureSizes = null,and return ");
                return;
            }
            Camera.Size sizeD2 = kw2.d(supportedPictureSizes, 1080, f);
            if (sizeD2 == null) {
                ltl.i("CustomCameraManager", " pictureSize = null,and return ");
                return;
            }
            ltl.a("CustomCameraManager", " previewSize.width = " + sizeD.width + " previewSize height = " + sizeD.height);
            parameters.setPreviewSize(sizeD.width, sizeD.height);
            ltl.a("CustomCameraManager", " pictureSize.width = " + sizeD2.width + " pictureSize height = " + sizeD2.height);
            parameters.setPictureSize(sizeD2.width, sizeD2.height);
            if (kw2.e(parameters.getSupportedFocusModes(), "auto")) {
                parameters.setFocusMode("auto");
            }
            if (kw2.f(parameters.getSupportedPictureFormats(), 256)) {
                parameters.setPictureFormat(256);
                parameters.setJpegQuality(100);
            }
            this.a.setParameters(parameters);
            this.a.setPreviewDisplay(surfaceHolder);
            this.a.setDisplayOrientation(this.h);
            this.a.setPreviewCallback(this);
            this.a.startPreview();
            this.b = true;
        } catch (Exception e2) {
            ltl.i("CustomCameraManager", "[startPreview]  Exception  " + e2.getMessage());
        }
    }

    public synchronized void z(SurfaceHolder surfaceHolder, float f) {
        ltl.a("CustomCameraManager", "[switchCamera] screenProp " + f);
        this.f12872c = true;
        int i = this.f;
        int i2 = this.f12873e;
        if (i == i2) {
            this.f = this.d;
        } else {
            this.f = i2;
        }
        g();
        s(this.f);
        h();
        y(surfaceHolder, f);
        this.f12872c = false;
    }
}
