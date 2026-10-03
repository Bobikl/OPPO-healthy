package com.heytap.store.platform.barcode.camera;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.view.SurfaceHolder;
import androidx.annotation.FloatRange;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.heytap.store.platform.barcode.camera.open.OpenCamera;
import com.heytap.store.platform.barcode.camera.open.OpenCameraInterface;
import com.heytap.store.platform.barcode.util.LogUtils;
import com.oplus.aiunit.vision.eo0;
import com.oplus.aiunit.vision.nte;
import com.oplus.aiunit.vision.tv2;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class CameraManager {
    private static final int MAX_FRAME_HEIGHT = 675;
    private static final int MAX_FRAME_WIDTH = 1200;
    private static final int MIN_FRAME_HEIGHT = 240;
    private static final int MIN_FRAME_WIDTH = 240;
    private eo0 autoFocusManager;
    private OpenCamera camera;
    private final tv2 configManager;
    private final Context context;
    private Rect framingRect;
    private int framingRectHorizontalOffset;
    private Rect framingRectInPreview;
    private float framingRectRatio;
    private int framingRectVerticalOffset;
    private boolean initialized;
    private boolean isFullScreenScan;
    private boolean isTorch;
    private OnSensorListener onSensorListener;
    private OnTorchListener onTorchListener;
    private final nte previewCallback;
    private boolean previewing;
    private int requestedCameraId = -1;
    private int requestedFramingRectHeight;
    private int requestedFramingRectWidth;

    public interface OnSensorListener {
        void onSensorChanged(boolean z, boolean z2, float f);
    }

    public interface OnTorchListener {
        void onTorchChanged(boolean z);
    }

    public CameraManager(Context context) {
        this.context = context.getApplicationContext();
        tv2 tv2Var = new tv2(context);
        this.configManager = tv2Var;
        this.previewCallback = new nte(tv2Var);
    }

    public PlanarYUVLuminanceSource buildLuminanceSource(byte[] bArr, int i, int i2) {
        if (getFramingRectInPreview() == null) {
            return null;
        }
        if (this.isFullScreenScan) {
            return new PlanarYUVLuminanceSource(bArr, i, i2, 0, 0, i, i2, false);
        }
        int iMin = (int) (Math.min(i, i2) * this.framingRectRatio);
        return new PlanarYUVLuminanceSource(bArr, i, i2, ((i - iMin) / 2) + this.framingRectHorizontalOffset, ((i2 - iMin) / 2) + this.framingRectVerticalOffset, iMin, iMin, false);
    }

    public void closeDriver() {
        OpenCamera openCamera = this.camera;
        if (openCamera != null) {
            openCamera.getCamera().release();
            this.camera = null;
            this.framingRect = null;
            this.framingRectInPreview = null;
        }
        this.isTorch = false;
        OnTorchListener onTorchListener = this.onTorchListener;
        if (onTorchListener != null) {
            onTorchListener.onTorchChanged(false);
        }
    }

    public Point getCameraResolution() {
        return this.configManager.b();
    }

    public synchronized Rect getFramingRect() {
        if (this.framingRect == null) {
            if (this.camera == null) {
                return null;
            }
            Point pointB = this.configManager.b();
            if (pointB == null) {
                return null;
            }
            int i = pointB.x;
            int i2 = pointB.y;
            if (this.isFullScreenScan) {
                this.framingRect = new Rect(0, 0, i, i2);
            } else {
                int iMin = (int) (Math.min(i, i2) * this.framingRectRatio);
                int i3 = ((i - iMin) / 2) + this.framingRectHorizontalOffset;
                int i4 = ((i2 - iMin) / 2) + this.framingRectVerticalOffset;
                this.framingRect = new Rect(i3, i4, i3 + iMin, iMin + i4);
            }
        }
        return this.framingRect;
    }

    public synchronized Rect getFramingRectInPreview() {
        if (this.framingRectInPreview == null) {
            Rect framingRect = getFramingRect();
            if (framingRect == null) {
                return null;
            }
            Rect rect = new Rect(framingRect);
            Point pointB = this.configManager.b();
            Point pointC = this.configManager.c();
            if (pointB != null && pointC != null) {
                int i = rect.left;
                int i2 = pointB.y;
                int i3 = pointC.x;
                rect.left = (i * i2) / i3;
                rect.right = (rect.right * i2) / i3;
                int i4 = rect.top;
                int i5 = pointB.x;
                int i6 = pointC.y;
                rect.top = (i4 * i5) / i6;
                rect.bottom = (rect.bottom * i5) / i6;
                this.framingRectInPreview = rect;
            }
            return null;
        }
        return this.framingRectInPreview;
    }

    public OpenCamera getOpenCamera() {
        return this.camera;
    }

    public Point getScreenResolution() {
        return this.configManager.c();
    }

    public synchronized boolean isOpen() {
        return this.camera != null;
    }

    public void openDriver(SurfaceHolder surfaceHolder) throws IOException {
        int i;
        OpenCamera openCameraOpen = this.camera;
        if (openCameraOpen == null) {
            openCameraOpen = OpenCameraInterface.open(this.requestedCameraId);
            if (openCameraOpen == null) {
                throw new IOException("Camera.open() failed to return object from driver");
            }
            this.camera = openCameraOpen;
        }
        if (!this.initialized) {
            this.initialized = true;
            this.configManager.e(openCameraOpen);
            int i2 = this.requestedFramingRectWidth;
            if (i2 > 0 && (i = this.requestedFramingRectHeight) > 0) {
                setManualFramingRect(i2, i);
                this.requestedFramingRectWidth = 0;
                this.requestedFramingRectHeight = 0;
            }
        }
        Camera camera = openCameraOpen.getCamera();
        Camera.Parameters parameters = camera.getParameters();
        String strFlatten = parameters == null ? null : parameters.flatten();
        try {
            this.configManager.g(openCameraOpen, false);
        } catch (RuntimeException unused) {
            LogUtils.w("Camera rejected parameters. Setting only minimal safe-mode parameters");
            LogUtils.i("Resetting to saved camera params: " + strFlatten);
            if (strFlatten != null) {
                Camera.Parameters parameters2 = camera.getParameters();
                parameters2.unflatten(strFlatten);
                try {
                    camera.setParameters(parameters2);
                    this.configManager.g(openCameraOpen, true);
                } catch (RuntimeException unused2) {
                    LogUtils.w("Camera rejected even safe-mode parameters! No configuration");
                }
            }
        }
        camera.setPreviewDisplay(surfaceHolder);
    }

    public synchronized void requestPreviewFrame(Handler handler, int i) {
        OpenCamera openCamera = this.camera;
        if (openCamera != null && this.previewing) {
            this.previewCallback.a(handler, i);
            openCamera.getCamera().setOneShotPreviewCallback(this.previewCallback);
        }
    }

    public void sensorChanged(boolean z, float f) {
        OnSensorListener onSensorListener = this.onSensorListener;
        if (onSensorListener != null) {
            onSensorListener.onSensorChanged(this.isTorch, z, f);
        }
    }

    public void setFramingRectHorizontalOffset(int i) {
        this.framingRectHorizontalOffset = i;
    }

    public void setFramingRectRatio(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.framingRectRatio = f;
    }

    public void setFramingRectVerticalOffset(int i) {
        this.framingRectVerticalOffset = i;
    }

    public void setFullScreenScan(boolean z) {
        this.isFullScreenScan = z;
    }

    public synchronized void setManualCameraId(int i) {
        this.requestedCameraId = i;
    }

    public synchronized void setManualFramingRect(int i, int i2) {
        if (this.initialized) {
            Point pointC = this.configManager.c();
            int i3 = pointC.x;
            if (i > i3) {
                i = i3;
            }
            int i4 = pointC.y;
            if (i2 > i4) {
                i2 = i4;
            }
            int i5 = (i3 - i) / 2;
            int i6 = (i4 - i2) / 2;
            this.framingRect = new Rect(i5, i6, i + i5, i2 + i6);
            LogUtils.d("Calculated manual framing rect: " + this.framingRect);
            this.framingRectInPreview = null;
        } else {
            this.requestedFramingRectWidth = i;
            this.requestedFramingRectHeight = i2;
        }
    }

    public void setOnSensorListener(OnSensorListener onSensorListener) {
        this.onSensorListener = onSensorListener;
    }

    public void setOnTorchListener(OnTorchListener onTorchListener) {
        this.onTorchListener = onTorchListener;
    }

    public synchronized void setTorch(boolean z) {
        OpenCamera openCamera = this.camera;
        if (openCamera != null && z != this.configManager.d(openCamera.getCamera())) {
            eo0 eo0Var = this.autoFocusManager;
            boolean z2 = eo0Var != null;
            if (z2) {
                eo0Var.d();
                this.autoFocusManager = null;
            }
            this.isTorch = z;
            this.configManager.h(openCamera.getCamera(), z);
            if (z2) {
                eo0 eo0Var2 = new eo0(this.context, openCamera.getCamera());
                this.autoFocusManager = eo0Var2;
                eo0Var2.c();
            }
            OnTorchListener onTorchListener = this.onTorchListener;
            if (onTorchListener != null) {
                onTorchListener.onTorchChanged(z);
            }
        }
    }

    public void startPreview() {
        OpenCamera openCamera = this.camera;
        if (openCamera == null || this.previewing) {
            return;
        }
        openCamera.getCamera().startPreview();
        this.previewing = true;
        this.autoFocusManager = new eo0(this.context, openCamera.getCamera());
    }

    public void stopPreview() {
        eo0 eo0Var = this.autoFocusManager;
        if (eo0Var != null) {
            eo0Var.d();
            this.autoFocusManager = null;
        }
        OpenCamera openCamera = this.camera;
        if (openCamera == null || !this.previewing) {
            return;
        }
        openCamera.getCamera().stopPreview();
        this.previewCallback.a(null, 0);
        this.previewing = false;
    }
}
