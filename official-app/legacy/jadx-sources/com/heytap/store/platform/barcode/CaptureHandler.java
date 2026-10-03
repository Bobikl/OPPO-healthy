package com.heytap.store.platform.barcode;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.heytap.store.platform.barcode.camera.CameraManager;
import com.oplus.aiunit.vision.z25;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class CaptureHandler extends Handler implements ResultPointCallback {
    private static final String TAG = "CaptureHandler";
    private final CameraManager cameraManager;
    private final z25 decodeThread;
    private boolean isReturnBitmap;
    private boolean isSupportAutoZoom;
    private boolean isSupportLuminanceInvert;
    private boolean isSupportVerticalCode;
    private final OnCaptureListener onCaptureListener;
    private State state;
    private final ViewfinderView viewfinderView;

    public enum State {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public CaptureHandler(Activity activity, ViewfinderView viewfinderView, OnCaptureListener onCaptureListener, Collection<BarcodeFormat> collection, Map<DecodeHintType, Object> map, String str, CameraManager cameraManager) {
        this.viewfinderView = viewfinderView;
        this.onCaptureListener = onCaptureListener;
        z25 z25Var = new z25(activity, cameraManager, this, collection, map, str, this);
        this.decodeThread = z25Var;
        z25Var.start();
        this.state = State.SUCCESS;
        this.cameraManager = cameraManager;
        cameraManager.startPreview();
        restartPreviewAndDecode();
    }

    private boolean isScreenPortrait(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x < point.y;
    }

    private ResultPoint transform(ResultPoint resultPoint) {
        float x;
        float y;
        int iMax;
        Point screenResolution = this.cameraManager.getScreenResolution();
        Point cameraResolution = this.cameraManager.getCameraResolution();
        int i = screenResolution.x;
        int i2 = screenResolution.y;
        if (i < i2) {
            float f = (i * 1.0f) / cameraResolution.y;
            float f2 = (i2 * 1.0f) / cameraResolution.x;
            x = (resultPoint.getX() * f) - (Math.max(screenResolution.x, cameraResolution.y) / 2);
            y = resultPoint.getY() * f2;
            iMax = Math.min(screenResolution.y, cameraResolution.x) / 2;
        } else {
            float f3 = (i * 1.0f) / cameraResolution.x;
            float f4 = (i2 * 1.0f) / cameraResolution.y;
            x = (resultPoint.getX() * f3) - (Math.min(screenResolution.y, cameraResolution.y) / 2);
            y = resultPoint.getY() * f4;
            iMax = Math.max(screenResolution.x, cameraResolution.x) / 2;
        }
        return new ResultPoint(x, y - iMax);
    }

    @Override // com.google.zxing.ResultPointCallback
    public void foundPossibleResultPoint(ResultPoint resultPoint) {
        if (this.viewfinderView != null) {
            this.viewfinderView.addPossibleResultPoint(transform(resultPoint));
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        float f;
        int i = message.what;
        if (i == R.id.restart_preview) {
            restartPreviewAndDecode();
            return;
        }
        if (i != R.id.decode_succeeded) {
            if (i == R.id.decode_failed) {
                this.state = State.PREVIEW;
                this.cameraManager.requestPreviewFrame(this.decodeThread.a(), R.id.decode);
                return;
            }
            return;
        }
        this.state = State.SUCCESS;
        Bundle data = message.getData();
        Bitmap bitmapCopy = null;
        if (data != null) {
            byte[] byteArray = data.getByteArray(z25.BARCODE_BITMAP);
            bitmapCopy = byteArray != null ? BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, null).copy(Bitmap.Config.ARGB_8888, true) : null;
            f = data.getFloat(z25.BARCODE_SCALED_FACTOR);
        } else {
            f = 1.0f;
        }
        this.onCaptureListener.onHandleDecode((Result) message.obj, bitmapCopy, f);
    }

    public boolean isReturnBitmap() {
        return this.isReturnBitmap;
    }

    public boolean isSupportAutoZoom() {
        return this.isSupportAutoZoom;
    }

    public boolean isSupportLuminanceInvert() {
        return this.isSupportLuminanceInvert;
    }

    public boolean isSupportVerticalCode() {
        return this.isSupportVerticalCode;
    }

    public void quitSynchronously() {
        this.state = State.DONE;
        this.cameraManager.stopPreview();
        Message.obtain(this.decodeThread.a(), R.id.quit).sendToTarget();
        try {
            this.decodeThread.join(100L);
        } catch (InterruptedException unused) {
        }
        removeMessages(R.id.decode_succeeded);
        removeMessages(R.id.decode_failed);
    }

    public void restartPreviewAndDecode() {
        if (this.state == State.SUCCESS) {
            this.state = State.PREVIEW;
            this.cameraManager.requestPreviewFrame(this.decodeThread.a(), R.id.decode);
            ViewfinderView viewfinderView = this.viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.drawViewfinder();
            }
        }
    }

    public void setReturnBitmap(boolean z) {
        this.isReturnBitmap = z;
    }

    public void setSupportAutoZoom(boolean z) {
        this.isSupportAutoZoom = z;
    }

    public void setSupportLuminanceInvert(boolean z) {
        this.isSupportLuminanceInvert = z;
    }

    public void setSupportVerticalCode(boolean z) {
        this.isSupportVerticalCode = z;
    }
}
