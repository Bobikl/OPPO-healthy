package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.WindowManager;
import com.heytap.store.platform.barcode.Preferences;
import com.heytap.store.platform.barcode.camera.CameraConfigurationUtils;
import com.heytap.store.platform.barcode.camera.FrontLightMode;
import com.heytap.store.platform.barcode.camera.open.CameraFacing;
import com.heytap.store.platform.barcode.camera.open.OpenCamera;
import com.heytap.store.platform.barcode.util.LogUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class tv2 {
    public final Context a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17164c;
    public Point d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Point f17165e;
    public Point f;
    public Point g;

    public tv2(Context context) {
        this.a = context;
    }

    public final void a(Camera.Parameters parameters, boolean z, boolean z2) {
        CameraConfigurationUtils.setTorch(parameters, z);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a);
        if (z2 || defaultSharedPreferences.getBoolean(Preferences.KEY_DISABLE_EXPOSURE, true)) {
            return;
        }
        CameraConfigurationUtils.setBestExposure(parameters, z);
    }

    public Point b() {
        return this.f17165e;
    }

    public Point c() {
        return this.d;
    }

    public boolean d(Camera camera) {
        Camera.Parameters parameters;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return false;
        }
        String flashMode = parameters.getFlashMode();
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    public void e(OpenCamera openCamera) {
        int i;
        Camera.Parameters parameters = openCamera.getCamera().getParameters();
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        int rotation = defaultDisplay.getRotation();
        if (rotation == 0) {
            i = 0;
        } else if (rotation == 1) {
            i = 90;
        } else if (rotation == 2) {
            i = 180;
        } else if (rotation == 3) {
            i = 270;
        } else {
            if (rotation % 90 != 0) {
                throw new IllegalArgumentException("Bad rotation: " + rotation);
            }
            i = (rotation + 360) % 360;
        }
        LogUtils.i("Display at: " + i);
        int orientation = openCamera.getOrientation();
        LogUtils.i("Camera at: " + orientation);
        CameraFacing facing = openCamera.getFacing();
        CameraFacing cameraFacing = CameraFacing.FRONT;
        if (facing == cameraFacing) {
            orientation = (360 - orientation) % 360;
            LogUtils.i("Front camera overriden to: " + orientation);
        }
        this.f17164c = ((orientation + 360) - i) % 360;
        LogUtils.i("Final display orientation: " + this.f17164c);
        if (openCamera.getFacing() == cameraFacing) {
            LogUtils.i("Compensating rotation for front camera");
            this.b = (360 - this.f17164c) % 360;
        } else {
            this.b = this.f17164c;
        }
        LogUtils.i("Clockwise rotation from display to camera: " + this.b);
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.d = point;
        LogUtils.i("Screen resolution in current orientation: " + this.d);
        this.f17165e = CameraConfigurationUtils.findBestPreviewSizeValue(parameters, this.d);
        LogUtils.i("Camera resolution: " + this.f17165e);
        this.f = CameraConfigurationUtils.findBestPreviewSizeValue(parameters, this.d);
        LogUtils.i("Best available preview size: " + this.f);
        Point point2 = this.d;
        boolean z = point2.x < point2.y;
        Point point3 = this.f;
        if (z == (point3.x < point3.y)) {
            this.g = point3;
        } else {
            Point point4 = this.f;
            this.g = new Point(point4.y, point4.x);
        }
        LogUtils.i("Preview size on screen: " + this.g);
    }

    public final void f(Camera.Parameters parameters, SharedPreferences sharedPreferences, boolean z) {
        a(parameters, FrontLightMode.readPref(sharedPreferences) == FrontLightMode.ON, z);
    }

    public void g(OpenCamera openCamera, boolean z) {
        Camera camera = openCamera.getCamera();
        Camera.Parameters parameters = camera.getParameters();
        if (parameters == null) {
            LogUtils.w("Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        LogUtils.i("Initial camera parameters: " + parameters.flatten());
        if (z) {
            LogUtils.w("In camera config safe mode -- most settings will not be honored");
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.a);
        if (parameters.isZoomSupported()) {
            parameters.setZoom(parameters.getMaxZoom() / 10);
        }
        f(parameters, defaultSharedPreferences, z);
        CameraConfigurationUtils.setFocus(parameters, defaultSharedPreferences.getBoolean(Preferences.KEY_AUTO_FOCUS, true), defaultSharedPreferences.getBoolean(Preferences.KEY_DISABLE_CONTINUOUS_FOCUS, true), z);
        if (!z) {
            if (defaultSharedPreferences.getBoolean(Preferences.KEY_INVERT_SCAN, false)) {
                CameraConfigurationUtils.setInvertColor(parameters);
            }
            if (!defaultSharedPreferences.getBoolean(Preferences.KEY_DISABLE_BARCODE_SCENE_MODE, true)) {
                CameraConfigurationUtils.setBarcodeSceneMode(parameters);
            }
            if (!defaultSharedPreferences.getBoolean(Preferences.KEY_DISABLE_METERING, true)) {
                CameraConfigurationUtils.setVideoStabilization(parameters);
                CameraConfigurationUtils.setFocusArea(parameters);
                CameraConfigurationUtils.setMetering(parameters);
            }
            parameters.setRecordingHint(true);
        }
        Point point = this.f;
        parameters.setPreviewSize(point.x, point.y);
        camera.setParameters(parameters);
        camera.setDisplayOrientation(this.f17164c);
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        if (previewSize != null) {
            Point point2 = this.f;
            if (point2.x == previewSize.width && point2.y == previewSize.height) {
                return;
            }
            LogUtils.w("Camera said it supported preview size " + this.f.x + 'x' + this.f.y + ", but after setting it, preview size is " + previewSize.width + 'x' + previewSize.height);
            Point point3 = this.f;
            point3.x = previewSize.width;
            point3.y = previewSize.height;
        }
    }

    public void h(Camera camera, boolean z) {
        Camera.Parameters parameters = camera.getParameters();
        a(parameters, z, false);
        camera.setParameters(parameters);
    }
}
