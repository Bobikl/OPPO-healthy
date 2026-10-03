package com.heytap.store.platform.barcode.camera.open;

import android.hardware.Camera;
import com.heytap.store.platform.barcode.util.LogUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class OpenCameraInterface {
    public static final int NO_REQUESTED_CAMERA = -1;

    private OpenCameraInterface() {
    }

    public static OpenCamera open(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            LogUtils.w("No cameras!");
            return null;
        }
        if (i >= numberOfCameras) {
            LogUtils.w("Requested camera does not exist: " + i);
            return null;
        }
        if (i <= -1) {
            i = 0;
            int i2 = 0;
            while (i2 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i2, cameraInfo);
                if (CameraFacing.values()[cameraInfo.facing] == CameraFacing.BACK) {
                    break;
                }
                i2++;
            }
            if (i2 == numberOfCameras) {
                LogUtils.i("No camera facing " + CameraFacing.BACK + "; returning camera #0");
            } else {
                i = i2;
            }
        }
        LogUtils.i("Opening camera #" + i);
        Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo2);
        Camera cameraOpen = Camera.open(i);
        if (cameraOpen == null) {
            return null;
        }
        return new OpenCamera(i, cameraOpen, CameraFacing.values()[cameraInfo2.facing], cameraInfo2.orientation);
    }
}
