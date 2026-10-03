package com.heytap.store.platform.barcode.camera;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.heytap.store.base.core.util.dialog.CoreDialogUtil;
import com.heytap.store.platform.barcode.util.LogUtils;
import io.netty.util.internal.StringUtil;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes6.dex */
public final class CameraConfigurationUtils {
    private static final int AREA_PER_1000 = 400;
    private static final double MAX_ASPECT_DISTORTION = 0.05d;
    private static final float MAX_EXPOSURE_COMPENSATION = 1.5f;
    private static final int MAX_FPS = 20;
    private static final float MIN_EXPOSURE_COMPENSATION = 0.0f;
    private static final int MIN_FPS = 10;
    private static final int MIN_PREVIEW_PIXELS = 153600;
    private static final Pattern SEMICOLON = Pattern.compile(";");

    private CameraConfigurationUtils() {
    }

    private static List<Camera.Area> buildMiddleArea(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    public static String collectStats(Camera.Parameters parameters) {
        return collectStats(parameters.flatten());
    }

    public static Point findBestPreviewSizeValue(Camera.Parameters parameters, Point point) {
        Camera.Size size;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            LogUtils.w("Device returned no supported preview sizes; using default");
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        if (LogUtils.isShowLog()) {
            StringBuilder sb = new StringBuilder();
            for (Camera.Size size2 : supportedPreviewSizes) {
                sb.append(size2.width);
                sb.append('x');
                sb.append(size2.height);
                sb.append(StringUtil.SPACE);
            }
            LogUtils.d("Supported preview sizes: " + ((Object) sb));
        }
        int i = point.x;
        int i2 = point.y;
        double d = i < i2 ? ((double) i) / ((double) i2) : ((double) i2) / ((double) i);
        LogUtils.d("screenAspectRatio: " + d);
        Camera.Size size3 = null;
        int i3 = 0;
        for (Camera.Size size4 : supportedPreviewSizes) {
            int i4 = size4.width;
            int i5 = size4.height;
            int i6 = i4 * i5;
            if (i6 < MIN_PREVIEW_PIXELS) {
                size = size3;
            } else {
                boolean z = i4 < i5;
                int i7 = z ? i4 : i5;
                int i8 = z ? i5 : i4;
                LogUtils.d(String.format("maybeFlipped:%d * %d", Integer.valueOf(i7), Integer.valueOf(i8)));
                size = size3;
                double d2 = ((double) i7) / ((double) i8);
                LogUtils.d("aspectRatio: " + d2);
                double dAbs = Math.abs(d2 - d);
                LogUtils.d("distortion: " + dAbs);
                if (dAbs <= MAX_ASPECT_DISTORTION) {
                    if (i7 == point.x && i8 == point.y) {
                        Point point2 = new Point(i4, i5);
                        LogUtils.d("Found preview size exactly matching screen size: " + point2);
                        return point2;
                    }
                    if (i6 > i3) {
                        size3 = size4;
                        i3 = i6;
                    }
                }
            }
            size3 = size;
        }
        Camera.Size size5 = size3;
        if (size5 != null) {
            Point point3 = new Point(size5.width, size5.height);
            LogUtils.d("Using largest suitable preview size: " + point3);
            return point3;
        }
        Camera.Size previewSize2 = parameters.getPreviewSize();
        if (previewSize2 == null) {
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        Point point4 = new Point(previewSize2.width, previewSize2.height);
        LogUtils.d("No suitable preview sizes, using default: " + point4);
        return point4;
    }

    private static String findSettableValue(String str, Collection<String> collection, String... strArr) {
        LogUtils.d("Requesting " + str + " value from among: " + Arrays.toString(strArr));
        LogUtils.d("Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    LogUtils.d("Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        LogUtils.d("No supported values match");
        return null;
    }

    private static Integer indexOfClosestZoom(Camera.Parameters parameters, double d) {
        List<Integer> zoomRatios = parameters.getZoomRatios();
        LogUtils.d("Zoom ratios: " + zoomRatios);
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
            LogUtils.w("Invalid zoom ratios!");
            return null;
        }
        double d2 = d * 100.0d;
        double d3 = Double.POSITIVE_INFINITY;
        int i = 0;
        for (int i2 = 0; i2 < zoomRatios.size(); i2++) {
            double dAbs = Math.abs(((double) zoomRatios.get(i2).intValue()) - d2);
            if (dAbs < d3) {
                i = i2;
                d3 = dAbs;
            }
        }
        LogUtils.d("Chose zoom ratio of " + (((double) zoomRatios.get(i).intValue()) / 100.0d));
        return Integer.valueOf(i);
    }

    public static void setBarcodeSceneMode(Camera.Parameters parameters) {
        if (OptionalModuleUtils.BARCODE.equals(parameters.getSceneMode())) {
            LogUtils.d("Barcode scene mode already set");
            return;
        }
        String strFindSettableValue = findSettableValue("scene mode", parameters.getSupportedSceneModes(), OptionalModuleUtils.BARCODE);
        if (strFindSettableValue != null) {
            parameters.setSceneMode(strFindSettableValue);
        }
    }

    public static void setBestExposure(Camera.Parameters parameters, boolean z) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            if (exposureCompensationStep > 0.0f) {
                int iRound = Math.round((z ? 0.0f : 1.5f) / exposureCompensationStep);
                float f = exposureCompensationStep * iRound;
                int iMax = Math.max(Math.min(iRound, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == iMax) {
                    LogUtils.d("Exposure compensation already set to " + iMax + " / " + f);
                    return;
                }
                LogUtils.d("Setting exposure compensation to " + iMax + " / " + f);
                parameters.setExposureCompensation(iMax);
                return;
            }
        }
        LogUtils.d("Camera does not support exposure compensation");
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters) {
        setBestPreviewFPS(parameters, 10, 20);
    }

    public static void setFocus(Camera.Parameters parameters, boolean z, boolean z2, boolean z3) {
        String strFindSettableValue;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (z) {
            strFindSettableValue = (z3 || z2) ? findSettableValue("focus mode", supportedFocusModes, "auto") : findSettableValue("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto");
        } else {
            strFindSettableValue = null;
        }
        if (!z3 && strFindSettableValue == null) {
            strFindSettableValue = findSettableValue("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (strFindSettableValue != null) {
            if (!strFindSettableValue.equals(parameters.getFocusMode())) {
                parameters.setFocusMode(strFindSettableValue);
                return;
            }
            LogUtils.d("Focus mode already set to " + strFindSettableValue);
        }
    }

    public static void setFocusArea(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() <= 0) {
            LogUtils.d("Device does not support focus areas");
            return;
        }
        LogUtils.d("Old focus areas: " + toString((Iterable<Camera.Area>) parameters.getFocusAreas()));
        List<Camera.Area> listBuildMiddleArea = buildMiddleArea(400);
        LogUtils.d("Setting focus area to : " + toString((Iterable<Camera.Area>) listBuildMiddleArea));
        parameters.setFocusAreas(listBuildMiddleArea);
    }

    public static void setInvertColor(Camera.Parameters parameters) {
        if (CoreDialogUtil.TYPE_NEGATIVE.equals(parameters.getColorEffect())) {
            LogUtils.d("Negative effect already set");
            return;
        }
        String strFindSettableValue = findSettableValue("color effect", parameters.getSupportedColorEffects(), CoreDialogUtil.TYPE_NEGATIVE);
        if (strFindSettableValue != null) {
            parameters.setColorEffect(strFindSettableValue);
        }
    }

    public static void setMetering(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() <= 0) {
            LogUtils.d("Device does not support metering areas");
            return;
        }
        LogUtils.d("Old metering areas: " + parameters.getMeteringAreas());
        List<Camera.Area> listBuildMiddleArea = buildMiddleArea(400);
        LogUtils.d("Setting metering area to : " + toString((Iterable<Camera.Area>) listBuildMiddleArea));
        parameters.setMeteringAreas(listBuildMiddleArea);
    }

    public static void setTorch(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String strFindSettableValue = z ? findSettableValue("flash mode", supportedFlashModes, "torch", "on") : findSettableValue("flash mode", supportedFlashModes, DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        if (strFindSettableValue != null) {
            if (strFindSettableValue.equals(parameters.getFlashMode())) {
                LogUtils.d("Flash mode already set to " + strFindSettableValue);
                return;
            }
            LogUtils.d("Setting flash mode to " + strFindSettableValue);
            parameters.setFlashMode(strFindSettableValue);
        }
    }

    public static void setVideoStabilization(Camera.Parameters parameters) {
        if (!parameters.isVideoStabilizationSupported()) {
            LogUtils.d("This device does not support video stabilization");
        } else if (parameters.getVideoStabilization()) {
            LogUtils.d("Video stabilization already enabled");
        } else {
            LogUtils.d("Enabling video stabilization...");
            parameters.setVideoStabilization(true);
        }
    }

    public static void setZoom(Camera.Parameters parameters, double d) {
        if (!parameters.isZoomSupported()) {
            LogUtils.d("Zoom is not supported");
            return;
        }
        Integer numIndexOfClosestZoom = indexOfClosestZoom(parameters, d);
        if (numIndexOfClosestZoom == null) {
            return;
        }
        if (parameters.getZoom() == numIndexOfClosestZoom.intValue()) {
            LogUtils.d("Zoom is already set to " + numIndexOfClosestZoom);
            return;
        }
        LogUtils.d("Setting zoom to " + numIndexOfClosestZoom);
        parameters.setZoom(numIndexOfClosestZoom.intValue());
    }

    private static String toString(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static String collectStats(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("BOARD=");
        sb.append(Build.BOARD);
        sb.append('\n');
        sb.append("BRAND=");
        sb.append(Build.BRAND);
        sb.append('\n');
        sb.append("CPU_ABI=");
        sb.append(Build.CPU_ABI);
        sb.append('\n');
        sb.append("DEVICE=");
        sb.append(Build.DEVICE);
        sb.append('\n');
        sb.append("DISPLAY=");
        sb.append(Build.DISPLAY);
        sb.append('\n');
        sb.append("FINGERPRINT=");
        sb.append(Build.FINGERPRINT);
        sb.append('\n');
        sb.append("HOST=");
        sb.append(Build.HOST);
        sb.append('\n');
        sb.append("ID=");
        sb.append(Build.ID);
        sb.append('\n');
        sb.append("MANUFACTURER=");
        sb.append(Build.MANUFACTURER);
        sb.append('\n');
        sb.append("MODEL=");
        sb.append(Build.MODEL);
        sb.append('\n');
        sb.append("PRODUCT=");
        sb.append(Build.PRODUCT);
        sb.append('\n');
        sb.append("TAGS=");
        sb.append(Build.TAGS);
        sb.append('\n');
        sb.append("TIME=");
        sb.append(Build.TIME);
        sb.append('\n');
        sb.append("TYPE=");
        sb.append(Build.TYPE);
        sb.append('\n');
        sb.append("USER=");
        sb.append(Build.USER);
        sb.append('\n');
        sb.append("VERSION.CODENAME=");
        sb.append(Build.VERSION.CODENAME);
        sb.append('\n');
        sb.append("VERSION.INCREMENTAL=");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append('\n');
        sb.append("VERSION.RELEASE=");
        sb.append(Build.VERSION.RELEASE);
        sb.append('\n');
        sb.append("VERSION.SDK_INT=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append('\n');
        if (charSequence != null) {
            String[] strArrSplit = SEMICOLON.split(charSequence);
            Arrays.sort(strArrSplit);
            for (String str : strArrSplit) {
                sb.append(str);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters, int i, int i2) {
        int[] next;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        LogUtils.d("Supported FPS ranges: " + toString((Collection<int[]>) supportedPreviewFpsRange));
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        Iterator<int[]> it = supportedPreviewFpsRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i3 = next[0];
            int i4 = next[1];
            if (i3 >= i * 1000 && i4 <= i2 * 1000) {
                break;
            }
        }
        if (next == null) {
            LogUtils.d("No suitable FPS range?");
            return;
        }
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        if (Arrays.equals(iArr, next)) {
            LogUtils.d("FPS range already set to " + Arrays.toString(next));
            return;
        }
        LogUtils.d("Setting FPS range to " + Arrays.toString(next));
        parameters.setPreviewFpsRange(next[0], next[1]);
    }

    private static String toString(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb.append(area.rect);
            sb.append(':');
            sb.append(area.weight);
            sb.append(StringUtil.SPACE);
        }
        return sb.toString();
    }
}
