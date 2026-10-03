package com.heytap.health.videosdk.utils;

import android.os.Build;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.heytap.accessory.file.model.Constant;
import com.heytap.health.videosdk.config.OutConfig;
import com.heytap.health.videosdk.data.DecodeData;
import com.heytap.health.videosdk.data.DecodeFrameData;
import com.heytap.health.videosdk.data.PhoneData;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.jzk;
import com.oplus.aiunit.vision.oea;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\u000278B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002JQ\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 JN\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019J8\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$J \u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u00102\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\fJ0\u0010+\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010,\u001a\u00020)2\u0006\u0010#\u001a\u00020-J1\u0010.\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010,\u001a\u00020)2\u0006\u0010#\u001a\u00020-H\u0082 J\b\u0010/\u001a\u00020)H\u0002J;\u00100\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0082 J\u0011\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\fH\u0082 J)\u00103\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\f2\u0006\u00104\u001a\u00020&H\u0082 J\u000e\u00105\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u00106\u001a\u00020\u00042\u0006\u00102\u001a\u00020\f¨\u00069"}, d2 = {"Lcom/heytap/health/videosdk/utils/FFMpegUtils;", "", "()V", "addLogProxy", "", "logProxy", "Lcom/heytap/health/videosdk/utils/LogProxy;", "allocateDecodeFrameData", "Lcom/heytap/health/videosdk/data/DecodeFrameData;", "allocateFrame", "Ljava/nio/ByteBuffer;", Fields.WIDTH_FIELD, "", Fields.HEIGHT_FIELD, "crop", "src", "", "dest", "previewWidth", "previewHeight", "cropPreviewWidth", "cropPreviewHeight", "cropLeft", "cropTop", "cropPreviewScale", "", "cropAndZoom", "cutting", "srcPath", Constant.DEST_PATH, "startTime", "", "endTime", "outConfig", "Lcom/heytap/health/videosdk/config/OutConfig;", oea.CALLBACK, "Lcom/heytap/health/videosdk/utils/FFMpegUtils$VideoCuttingInterface;", "getDecodeData", "Lcom/heytap/health/videosdk/data/DecodeData;", "path", "useHwDecode", "", "decodeFrameCount", "getVideoFrames", "precise", "Lcom/heytap/health/videosdk/utils/FFMpegUtils$VideoFrameArrivedInterface;", "getVideoFramesCore", "isCpuV8", "nativeCutting", "nativeSetNativeLogLevel", "logLevel", "nativeTestDecode", "decodeData", "removeLogProxy", "setNativeLogLevel", "VideoCuttingInterface", "VideoFrameArrivedInterface", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FFMpegUtils {

    @NotNull
    public static final FFMpegUtils INSTANCE = new FFMpegUtils();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/videosdk/utils/FFMpegUtils$VideoCuttingInterface;", "", "onDone", "", "onFail", "resultCode", "", "onProgress", "progress", "", "onStart", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface VideoCuttingInterface {
        void onDone();

        void onFail(int resultCode);

        void onProgress(double progress);

        void onStart();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH&¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/videosdk/utils/FFMpegUtils$VideoFrameArrivedInterface;", "", "onEnd", "", "onProgress", "", TypedValues.AttributesType.S_FRAME, "Ljava/nio/ByteBuffer;", "timestamps", "", Fields.WIDTH_FIELD, "", Fields.HEIGHT_FIELD, "rotate", "index", "onStart", "", "duration", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface VideoFrameArrivedInterface {
        void onEnd();

        boolean onProgress(@NotNull ByteBuffer frame, double timestamps, int width, int height, int rotate, int index);

        @NotNull
        double[] onStart(double duration);
    }

    static {
        System.loadLibrary(jzk.SO_NAME_VIDEO_SDK);
    }

    private FFMpegUtils() {
    }

    private final DecodeFrameData allocateDecodeFrameData() {
        return new DecodeFrameData(null, 0.0d, 0, null, 0, 31, null);
    }

    private final ByteBuffer allocateFrame(int width, int height) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(width * height * 4).order(ByteOrder.LITTLE_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "allocateDirect(width * h…(ByteOrder.LITTLE_ENDIAN)");
        return byteBufferOrder;
    }

    private final native int crop(String src, String dest, int previewWidth, int previewHeight, int cropPreviewWidth, int cropPreviewHeight, int cropLeft, int cropTop, float cropPreviewScale);

    private final native void getVideoFramesCore(String path, int width, int height, boolean precise, VideoFrameArrivedInterface cb);

    private final boolean isCpuV8() {
        Object objM5287constructorimpl;
        String str;
        try {
            Result.Companion companion = Result.INSTANCE;
            String[] SUPPORTED_64_BIT_ABIS = Build.SUPPORTED_64_BIT_ABIS;
            Intrinsics.checkNotNullExpressionValue(SUPPORTED_64_BIT_ABIS, "SUPPORTED_64_BIT_ABIS");
            int length = SUPPORTED_64_BIT_ABIS.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = null;
                    break;
                }
                str = SUPPORTED_64_BIT_ABIS[i];
                if (Intrinsics.areEqual(str, "arm64-v8a")) {
                    break;
                }
                i++;
            }
            objM5287constructorimpl = Result.m5287constructorimpl(Boolean.valueOf(str != null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m5290exceptionOrNullimpl(objM5287constructorimpl) != null) {
            objM5287constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM5287constructorimpl).booleanValue();
    }

    private final native void nativeCutting(String srcPath, String destPath, long startTime, long endTime, OutConfig outConfig, VideoCuttingInterface cb);

    private final native void nativeSetNativeLogLevel(int logLevel);

    private final native DecodeData nativeTestDecode(String path, boolean useHwDecode, int decodeFrameCount, DecodeData decodeData);

    public final void addLogProxy(@NotNull LogProxy logProxy) {
        Intrinsics.checkNotNullParameter(logProxy, "logProxy");
        LogHelper.INSTANCE.addLogProxy(logProxy);
    }

    public final int cropAndZoom(@NotNull String src, @NotNull String dest, int previewWidth, int previewHeight, int cropPreviewWidth, int cropPreviewHeight, int cropLeft, int cropTop, float cropPreviewScale) {
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dest, "dest");
        return crop(src, dest, previewWidth, previewHeight, cropPreviewWidth, cropPreviewHeight, cropLeft, cropTop, cropPreviewScale);
    }

    public final void cutting(@NotNull String srcPath, @NotNull String destPath, long startTime, long endTime, @Nullable OutConfig outConfig, @NotNull VideoCuttingInterface cb) {
        Intrinsics.checkNotNullParameter(srcPath, "srcPath");
        Intrinsics.checkNotNullParameter(destPath, "destPath");
        Intrinsics.checkNotNullParameter(cb, "cb");
        nativeCutting(srcPath, destPath, startTime, endTime, outConfig, cb);
    }

    @NotNull
    public final DecodeData getDecodeData(@Nullable String path, boolean useHwDecode, int decodeFrameCount) {
        DecodeData decodeData = path == null || path.length() == 0 ? new DecodeData(null, false, 0, 0, 0.0d, 0, "path is null or empty", null, null, 447, null) : nativeTestDecode(path, useHwDecode, decodeFrameCount, new DecodeData(null, false, 0, 0, 0.0d, 0, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null));
        decodeData.setUseHwDecode(useHwDecode);
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        boolean zIsCpuV8 = INSTANCE.isCpuV8();
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        decodeData.setPhoneData(new PhoneData(MODEL, zIsCpuV8, RELEASE, Runtime.getRuntime().availableProcessors()));
        return decodeData;
    }

    public final void getVideoFrames(@Nullable String path, int width, int height, boolean precise, @NotNull VideoFrameArrivedInterface cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        if (path == null || path.length() == 0) {
            return;
        }
        getVideoFramesCore(path, width, height, precise, cb);
    }

    public final void removeLogProxy(@NotNull LogProxy logProxy) {
        Intrinsics.checkNotNullParameter(logProxy, "logProxy");
        LogHelper.INSTANCE.removeLogProxy(logProxy);
    }

    public final void setNativeLogLevel(int logLevel) {
        LogHelper.INSTANCE.i("utils", "setNativeLogLevel " + logLevel);
        nativeSetNativeLogLevel(logLevel);
    }
}
