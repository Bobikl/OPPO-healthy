package com.heytap.store.platform.barcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.GlobalHistogramBinarizer;
import com.google.zxing.common.HybridBinarizer;
import com.heytap.store.platform.barcode.camera.CameraManager;
import com.heytap.store.platform.barcode.util.LogUtils;
import com.oplus.aiunit.vision.z25;
import java.io.ByteArrayOutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends Handler {
    public final Context a;
    public final CameraManager b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CaptureHandler f8265c;
    public final MultiFormatReader d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8266e = true;
    public long f;

    public a(Context context, CameraManager cameraManager, CaptureHandler captureHandler, Map<DecodeHintType, Object> map) {
        MultiFormatReader multiFormatReader = new MultiFormatReader();
        this.d = multiFormatReader;
        multiFormatReader.setHints(map);
        this.a = context;
        this.b = cameraManager;
        this.f8265c = captureHandler;
    }

    public static void b(PlanarYUVLuminanceSource planarYUVLuminanceSource, Bundle bundle) {
        int[] iArrRenderThumbnail = planarYUVLuminanceSource.renderThumbnail();
        int thumbnailWidth = planarYUVLuminanceSource.getThumbnailWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArrRenderThumbnail, 0, thumbnailWidth, thumbnailWidth, planarYUVLuminanceSource.getThumbnailHeight(), Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        bundle.putByteArray(z25.BARCODE_BITMAP, byteArrayOutputStream.toByteArray());
        bundle.putFloat(z25.BARCODE_SCALED_FACTOR, thumbnailWidth / planarYUVLuminanceSource.getWidth());
    }

    public final PlanarYUVLuminanceSource a(byte[] bArr, int i, int i2, boolean z) {
        if (!z) {
            return this.b.buildLuminanceSource(bArr, i, i2);
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                bArr2[(((i4 * i2) + i2) - i3) - 1] = bArr[(i3 * i) + i4];
            }
        }
        return this.b.buildLuminanceSource(bArr2, i2, i);
    }

    public final void c(byte[] bArr, int i, int i2, boolean z, boolean z2) throws NotFoundException {
        boolean z3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        PlanarYUVLuminanceSource planarYUVLuminanceSourceA = a(bArr, i, i2, z);
        Result resultDecodeWithState = null;
        if (planarYUVLuminanceSourceA != null) {
            try {
                resultDecodeWithState = this.d.decodeWithState(new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSourceA)));
                z3 = false;
            } catch (Exception unused) {
                z3 = true;
            }
            if (z3 && this.f8265c.isSupportLuminanceInvert()) {
                try {
                    resultDecodeWithState = this.d.decodeWithState(new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSourceA.invert())));
                    z3 = false;
                } catch (Exception unused2) {
                    z3 = true;
                }
            }
            if (z3) {
                try {
                    resultDecodeWithState = this.d.decodeWithState(new BinaryBitmap(new GlobalHistogramBinarizer(planarYUVLuminanceSourceA)));
                    z3 = false;
                } catch (Exception unused3) {
                    z3 = true;
                }
            }
            if (z3 && z2) {
                PlanarYUVLuminanceSource planarYUVLuminanceSourceA2 = a(bArr, i, i2, !z);
                if (planarYUVLuminanceSourceA2 != null) {
                    try {
                        planarYUVLuminanceSourceA = planarYUVLuminanceSourceA2;
                        resultDecodeWithState = this.d.decodeWithState(new BinaryBitmap(new HybridBinarizer(planarYUVLuminanceSourceA2)));
                    } catch (Exception unused4) {
                        planarYUVLuminanceSourceA = planarYUVLuminanceSourceA2;
                    }
                } else {
                    planarYUVLuminanceSourceA = planarYUVLuminanceSourceA2;
                }
            }
            this.d.reset();
        }
        if (resultDecodeWithState == null) {
            CaptureHandler captureHandler = this.f8265c;
            if (captureHandler != null) {
                Message.obtain(captureHandler, R.id.decode_failed).sendToTarget();
                return;
            }
            return;
        }
        LogUtils.d("Found barcode in " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        BarcodeFormat barcodeFormat = resultDecodeWithState.getBarcodeFormat();
        CaptureHandler captureHandler2 = this.f8265c;
        if (captureHandler2 != null && captureHandler2.isSupportAutoZoom() && barcodeFormat == BarcodeFormat.QR_CODE) {
            ResultPoint[] resultPoints = resultDecodeWithState.getResultPoints();
            if (resultPoints.length >= 3) {
                if (d((int) Math.max(Math.max(ResultPoint.distance(resultPoints[0], resultPoints[1]), ResultPoint.distance(resultPoints[1], resultPoints[2])), ResultPoint.distance(resultPoints[0], resultPoints[2])), i)) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = R.id.decode_succeeded;
                    messageObtain.obj = resultDecodeWithState;
                    if (this.f8265c.isReturnBitmap()) {
                        Bundle bundle = new Bundle();
                        b(planarYUVLuminanceSourceA, bundle);
                        messageObtain.setData(bundle);
                    }
                    this.f8265c.sendMessageDelayed(messageObtain, 300L);
                    return;
                }
            }
        }
        CaptureHandler captureHandler3 = this.f8265c;
        if (captureHandler3 != null) {
            Message messageObtain2 = Message.obtain(captureHandler3, R.id.decode_succeeded, resultDecodeWithState);
            if (this.f8265c.isReturnBitmap()) {
                Bundle bundle2 = new Bundle();
                b(planarYUVLuminanceSourceA, bundle2);
                messageObtain2.setData(bundle2);
            }
            messageObtain2.sendToTarget();
        }
    }

    public final boolean d(int i, int i2) {
        Camera camera;
        if (this.f > System.currentTimeMillis() - 1000) {
            return true;
        }
        if (i >= i2 / 5 || (camera = this.b.getOpenCamera().getCamera()) == null) {
            return false;
        }
        Camera.Parameters parameters = camera.getParameters();
        if (!parameters.isZoomSupported()) {
            LogUtils.d("Zoom not supported");
            return false;
        }
        int maxZoom = parameters.getMaxZoom();
        parameters.setZoom(Math.min(parameters.getZoom() + (maxZoom / 5), maxZoom));
        camera.setParameters(parameters);
        this.f = System.currentTimeMillis();
        return true;
    }

    public final boolean e() {
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x < point.y;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws NotFoundException {
        if (message == null || !this.f8266e) {
            return;
        }
        int i = message.what;
        if (i == R.id.decode) {
            c((byte[]) message.obj, message.arg1, message.arg2, e(), this.f8265c.isSupportVerticalCode());
        } else if (i == R.id.quit) {
            this.f8266e = false;
            Looper.myLooper().quit();
        }
    }
}
