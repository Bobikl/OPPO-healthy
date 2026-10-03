package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import com.oplus.aiunit.core.FrameUnit;
import com.oplus.aiunit.core.ParamPackage;
import com.oplus.aiunit.core.callback.IAIMessenger;
import com.oplus.aiunit.core.callback.IProcessCallback;
import com.oplus.aiunit.core.protocol.common.ErrorCode;
import com.oplus.aiunit.core.protocol.common.ImageFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class qy7 extends uy7 {
    private static final String DEFAULT_INPUT_TAG = "input_0";
    public static final int ERROR_APPLY_FAILED = -2;
    public static final int ERROR_PARAM_INVALID = -1;
    public static final int ERROR_YUV_TRANS_FAILED = -3;
    private static final String INPUT_TAG_PREFIX = "input_";
    public static final String INPUT_TYPE_DOUBLE_ARRAY = "double_array";
    public static final String INPUT_TYPE_DOUBLE_ARRAY_2D = "double_array_2D";
    public static final String INPUT_TYPE_FLOAT_ARRAY = "float_array";
    public static final String INPUT_TYPE_FLOAT_ARRAY_2D = "float_array_2D";
    public static final String INPUT_TYPE_INT_ARRAY = "int_array";
    public static final String INPUT_TYPE_INT_ARRAY_2D = "int_array_2D";
    private static final String TAG = "FrameInputSlot";
    private ErrorCode mErrorCode;
    protected String mJsonSource;
    private final ParamPackage mParamPackage;

    public qy7(d0 d0Var) {
        super(d0Var);
        this.mJsonSource = "";
        this.mParamPackage = new ParamPackage();
        this.mErrorCode = ErrorCode.kErrorNone;
    }

    public ParamPackage getCustomParam() {
        return this.mParamPackage;
    }

    public ErrorCode getErrorCode() {
        return this.mErrorCode;
    }

    public String getJsonSource() {
        return this.mJsonSource;
    }

    public int setBitmap(Bitmap bitmap, String str, Boolean bool) {
        if (bitmap == null || bitmap.isRecycled()) {
            i0.n(TAG, "set bitmap is null.");
            return -1;
        }
        d0 aIContext = getAIContext();
        if (aIContext == null) {
            i0.c(TAG, "ai context is null");
            return -1;
        }
        FrameUnit frameUnitApplyFrameUnit = aIContext.applyFrameUnit(bitmap.getByteCount());
        if (frameUnitApplyFrameUnit == null) {
            i0.c(TAG, "frame unit apply failed.");
            return -2;
        }
        frameUnitApplyFrameUnit.setTag(str);
        frameUnitApplyFrameUnit.setFlag(1);
        if (bool.booleanValue() || bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            i0.f(TAG, "set binder bitmap");
            frameUnitApplyFrameUnit.setBinderBitmap(bitmap);
        }
        frameUnitApplyFrameUnit.receiveBitmap(bitmap);
        return addFrameUnit(frameUnitApplyFrameUnit);
    }

    public void setCustomParam(String str, String str2) {
        this.mParamPackage.setParam("custom::" + str, str2);
    }

    public int setData(byte[] bArr, int i, int i2, ImageFormat imageFormat, String str) {
        if (bArr == null || bArr.length == 0 || i <= 0 || i2 <= 0) {
            i0.c(TAG, "invalid target data!");
            return -1;
        }
        d0 aIContext = getAIContext();
        if (aIContext == null) {
            i0.c(TAG, "setData aiContext is null");
            return -1;
        }
        FrameUnit frameUnitApplyFrameUnit = aIContext.applyFrameUnit(bArr.length);
        if (frameUnitApplyFrameUnit == null) {
            i0.c(TAG, "setData applyFrameUnit failed.");
            return -2;
        }
        frameUnitApplyFrameUnit.setImageFormatDirectly(imageFormat);
        frameUnitApplyFrameUnit.setTag(str);
        frameUnitApplyFrameUnit.setFlag(1);
        frameUnitApplyFrameUnit.setWidth(i);
        frameUnitApplyFrameUnit.setHeight(i2);
        frameUnitApplyFrameUnit.setData(bArr);
        return addFrameUnit(frameUnitApplyFrameUnit);
    }

    public int setDoubleArray(double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            i0.c(TAG, "setDoubleArray invalid target data!");
            return -1;
        }
        d0 aIContext = getAIContext();
        if (aIContext == null) {
            i0.c(TAG, "setDoubleArray aiContext is null");
            return -1;
        }
        FrameUnit frameUnitFindFrameUnitByTag = findFrameUnitByTag(INPUT_TYPE_DOUBLE_ARRAY);
        if (frameUnitFindFrameUnitByTag != null && frameUnitFindFrameUnitByTag.getBufferSize() != 0 && frameUnitFindFrameUnitByTag.match(dArr.length, 1, 8)) {
            try {
                frameUnitFindFrameUnitByTag.setSpecialDataDoubleArray(dArr);
                return 0;
            } catch (Exception e2) {
                i0.c(TAG, "setDoubleArray failed. frameUnit size is invalid:" + e2.getMessage());
                return -1;
            }
        }
        removeFrameUnit(INPUT_TYPE_DOUBLE_ARRAY);
        FrameUnit frameUnitApplyFrameUnit = aIContext.applyFrameUnit(dArr.length * 8);
        if (frameUnitApplyFrameUnit == null) {
            i0.c(TAG, "setDoubleArray applyFrameUnit failed.");
            return -2;
        }
        frameUnitApplyFrameUnit.setTag(INPUT_TYPE_DOUBLE_ARRAY);
        frameUnitApplyFrameUnit.setFlag(1);
        frameUnitApplyFrameUnit.setWidth(dArr.length);
        frameUnitApplyFrameUnit.setHeight(1);
        frameUnitApplyFrameUnit.setChannel(8);
        frameUnitApplyFrameUnit.setSpecialDataDoubleArray(dArr);
        return addFrameUnit(frameUnitApplyFrameUnit);
    }

    public int setDoubleArray2D(double[][] dArr) {
        if (dArr == null || dArr.length == 0) {
            i0.c(TAG, "setDoubleArray2D invalid target data!");
            return -1;
        }
        d0 aIContext = getAIContext();
        if (aIContext == null) {
            i0.c(TAG, "setDoubleArray2D aiContext is null");
            return -1;
        }
        FrameUnit frameUnitFindFrameUnitByTag = findFrameUnitByTag(INPUT_TYPE_DOUBLE_ARRAY_2D);
        int length = dArr.length;
        int length2 = dArr[0].length;
        if (frameUnitFindFrameUnitByTag != null && frameUnitFindFrameUnitByTag.getBufferSize() != 0 && frameUnitFindFrameUnitByTag.match(length, length2, 8)) {
            try {
                frameUnitFindFrameUnitByTag.setSpecialDataDoubleArray2D(dArr);
                return 0;
            } catch (Exception e2) {
                i0.c(TAG, "setDoubleArray2D failed. frameUnit size is invalid:" + e2.getMessage());
                return -1;
            }
        }
        removeFrameUnit(INPUT_TYPE_DOUBLE_ARRAY_2D);
        FrameUnit frameUnitApplyFrameUnit = aIContext.applyFrameUnit(length * length2 * 8);
        if (frameUnitApplyFrameUnit == null) {
            i0.c(TAG, "setDoubleArray2D applyFrameUnit failed.");
            return -2;
        }
        frameUnitApplyFrameUnit.setTag(INPUT_TYPE_DOUBLE_ARRAY_2D);
        frameUnitApplyFrameUnit.setFlag(1);
        frameUnitApplyFrameUnit.setWidth(length);
        frameUnitApplyFrameUnit.setHeight(length2);
        frameUnitApplyFrameUnit.setChannel(8);
        frameUnitApplyFrameUnit.setSpecialDataDoubleArray2D(dArr);
        return addFrameUnit(frameUnitApplyFrameUnit);
    }

    public void setError(ErrorCode errorCode) {
        this.mErrorCode = errorCode;
    }

    public int setFloatArray(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            i0.c(TAG, "setFloatArray invalid target data!");
            return -1;
        }
        d0 aIContext = getAIContext();
        if (aIContext == null) {
            i0.c(TAG, "setFloatArray aiContext is null");
            return -1;
        }
        FrameUnit frameUnitFindFrameUnitByTag = findFrameUnitByTag(INPUT_TYPE_FLOAT_ARRAY);
        if (frameUnitFindFrameUnitByTag != null && frameUnitFindFrameUnitByTag.getBufferSize() != 0 && frameUnitFindFrameUnitByTag.match(fArr.length, 1, 4)) {
            try {
                frameUnitFindFrameUnitByTag.setSpecialDataFloatArray(fArr);
                return 0;
            } catch (Exception e2) {
                i0.c(TAG, "setFloatArray failed. frameUnit size is invalid:" + e2.getMessage());
                return -1;
            }
        }
        removeFrameUnit(INPUT_TYPE_FLOAT_ARRAY);
        FrameUnit frameUnitApplyFrameUnit = aIContext.applyFrameUnit(fArr.length * 4);
        if (frameUnitApplyFrameUnit == null) {
            i0.c(TAG, "setFloatArray applyFrameUnit failed.");
            return -2;
        }
        frameUnitApplyFrameUnit.setTag(INPUT_TYPE_FLOAT_ARRAY);
        frameUnitApplyFrameUnit.setFlag(1);
        frameUnitApplyFrameUnit.setWidth(fArr.length);
        frameUnitApplyFrameUnit.setHeight(1);
        frameUnitApplyFrameUnit.setChannel(4);
        frameUnitApplyFrameUnit.setSpecialDataFloatArray(fArr);
        return addFrameUnit(frameUnitApplyFrameUnit);
    }

    public int setFloatArray2D(float[][] fArr) {
        if (fArr == null || fArr.length == 0) {
            i0.c(TAG, "setFloatArray2D invalid target data!");
            return -1;
        }
        d0 aIContext = getAIContext();
        if (aIContext == null) {
            i0.c(TAG, "setFloatArray2D aiContext is null");
            return -1;
        }
        FrameUnit frameUnitFindFrameUnitByTag = findFrameUnitByTag(INPUT_TYPE_FLOAT_ARRAY_2D);
        int length = fArr.length;
        int length2 = fArr[0].length;
        if (frameUnitFindFrameUnitByTag != null && frameUnitFindFrameUnitByTag.getBufferSize() != 0 && frameUnitFindFrameUnitByTag.match(length, length2, 4)) {
            try {
                frameUnitFindFrameUnitByTag.setSpecialDataFloatArray2D(fArr);
                return 0;
            } catch (Exception e2) {
                i0.c(TAG, "setFloatArray2D failed. frameUnit size is invalid:" + e2.getMessage());
                return -1;
            }
        }
        removeFrameUnit(INPUT_TYPE_FLOAT_ARRAY_2D);
        FrameUnit frameUnitApplyFrameUnit = aIContext.applyFrameUnit(length * length2 * 4);
        if (frameUnitApplyFrameUnit == null) {
            i0.c(TAG, "setFloatArray2D applyFrameUnit failed.");
            return -2;
        }
        frameUnitApplyFrameUnit.setTag(INPUT_TYPE_FLOAT_ARRAY_2D);
        frameUnitApplyFrameUnit.setFlag(1);
        frameUnitApplyFrameUnit.setWidth(length);
        frameUnitApplyFrameUnit.setHeight(length2);
        frameUnitApplyFrameUnit.setChannel(4);
        frameUnitApplyFrameUnit.setSpecialDataFloatArray2D(fArr);
        return addFrameUnit(frameUnitApplyFrameUnit);
    }

    public int setFragmentBitmap(FrameUnit frameUnit, Bitmap bitmap, String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            i0.n(TAG, "set bitmap is null.");
            return -1;
        }
        if (getAIContext() == null) {
            i0.c(TAG, "ai context is null");
            return -1;
        }
        FrameUnit frameUnit2 = new FrameUnit(frameUnit, bitmap);
        frameUnit2.setTag(str);
        return addFrameUnit(frameUnit2);
    }

    public int setIntArray(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            i0.c(TAG, "setIntArray invalid target data!");
            return -1;
        }
        d0 aIContext = getAIContext();
        if (aIContext == null) {
            i0.c(TAG, "setIntArray aiContext is null");
            return -1;
        }
        FrameUnit frameUnitFindFrameUnitByTag = findFrameUnitByTag(INPUT_TYPE_INT_ARRAY);
        if (frameUnitFindFrameUnitByTag != null && frameUnitFindFrameUnitByTag.getBufferSize() != 0 && frameUnitFindFrameUnitByTag.match(iArr.length, 1, 4)) {
            try {
                frameUnitFindFrameUnitByTag.setSpecialDataIntArray(iArr);
                return 0;
            } catch (Exception e2) {
                i0.c(TAG, "setIntArray failed. frameUnit size is invalid:" + e2.getMessage());
                return -1;
            }
        }
        removeFrameUnit(INPUT_TYPE_INT_ARRAY);
        FrameUnit frameUnitApplyFrameUnit = aIContext.applyFrameUnit(iArr.length * 4);
        if (frameUnitApplyFrameUnit == null) {
            i0.c(TAG, "setIntArray applyFrameUnit failed.");
            return -2;
        }
        frameUnitApplyFrameUnit.setTag(INPUT_TYPE_INT_ARRAY);
        frameUnitApplyFrameUnit.setFlag(1);
        frameUnitApplyFrameUnit.setWidth(iArr.length);
        frameUnitApplyFrameUnit.setHeight(1);
        frameUnitApplyFrameUnit.setChannel(4);
        frameUnitApplyFrameUnit.setSpecialDataIntArray(iArr);
        return addFrameUnit(frameUnitApplyFrameUnit);
    }

    public int setIntArray2D(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            i0.c(TAG, "setIntArray2D invalid target data!");
            return -1;
        }
        d0 aIContext = getAIContext();
        if (aIContext == null) {
            i0.c(TAG, "setIntArray2D aiContext is null");
            return -1;
        }
        FrameUnit frameUnitFindFrameUnitByTag = findFrameUnitByTag(INPUT_TYPE_INT_ARRAY_2D);
        int length = iArr.length;
        int length2 = iArr[0].length;
        if (frameUnitFindFrameUnitByTag != null && frameUnitFindFrameUnitByTag.getBufferSize() != 0 && frameUnitFindFrameUnitByTag.match(length, length2, 4)) {
            try {
                frameUnitFindFrameUnitByTag.setSpecialDataIntArray2D(iArr);
                return 0;
            } catch (Exception e2) {
                i0.c(TAG, "setIntArray2D failed. frameUnit size is invalid:" + e2.getMessage());
                return -1;
            }
        }
        removeFrameUnit(INPUT_TYPE_INT_ARRAY_2D);
        FrameUnit frameUnitApplyFrameUnit = aIContext.applyFrameUnit(length * length2 * 4);
        if (frameUnitApplyFrameUnit == null) {
            i0.c(TAG, "setIntArray2D applyFrameUnit failed.");
            return -2;
        }
        frameUnitApplyFrameUnit.setTag(INPUT_TYPE_INT_ARRAY_2D);
        frameUnitApplyFrameUnit.setFlag(1);
        frameUnitApplyFrameUnit.setWidth(length);
        frameUnitApplyFrameUnit.setHeight(length2);
        frameUnitApplyFrameUnit.setChannel(4);
        frameUnitApplyFrameUnit.setSpecialDataIntArray2D(iArr);
        return addFrameUnit(frameUnitApplyFrameUnit);
    }

    public void setJsonSource(String str) {
        this.mJsonSource = str;
    }

    public void setMessenger(IAIMessenger iAIMessenger) {
        this.mParamPackage.setParam("package:client_messenger", iAIMessenger);
    }

    public <E> void setParam(String str, E e2) {
        this.mParamPackage.setParam(str, e2);
    }

    public void setParamBoolean(String str, Boolean bool) {
        this.mParamPackage.setParam(str, bool);
    }

    public void setParamInt(String str, int i) {
        this.mParamPackage.setParam(str, Integer.valueOf(i));
    }

    public void setParamString(String str, String str2) {
        this.mParamPackage.setParam(str, str2);
    }

    public void setProcessCallback(IProcessCallback iProcessCallback) {
        try {
            this.mParamPackage.setParam("callback::" + iProcessCallback.name(), iProcessCallback);
        } catch (Exception e2) {
            i0.c(TAG, "setProcessCallback: " + e2);
        }
    }

    public int setTargetBitmap(Bitmap bitmap) {
        cleanExistFrameUnit();
        return transErrorCode(setBitmap(bitmap, DEFAULT_INPUT_TAG, Boolean.FALSE)).value();
    }

    public int setTargetData(byte[] bArr, int i, int i2, ImageFormat imageFormat) {
        cleanExistFrameUnit();
        if (ImageFormat.isYUV(imageFormat.value())) {
            i2 = (i2 * 3) / 2;
        }
        return transErrorCode(setData(bArr, i, i2, imageFormat, DEFAULT_INPUT_TAG)).value();
    }

    public int setTargetImage(@NonNull Image image) {
        int format = image.getFormat();
        ImageFormat imageFormat = ImageFormat.YUV_420_888;
        if (format != imageFormat.value()) {
            i0.c(TAG, "setTargetImage format " + format + "not support");
            ErrorCode errorCode = ErrorCode.kErrorInvalidParam;
            setError(errorCode);
            return errorCode.value();
        }
        i0.a(TAG, "setTargetImage with image");
        Image.Plane[] planes = image.getPlanes();
        if (planes.length >= 3) {
            return setTargetImage(image.getWidth(), image.getHeight(), imageFormat, image.getCropRect(), planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride());
        }
        ErrorCode errorCode2 = ErrorCode.kErrorInvalidParam;
        setError(errorCode2);
        return errorCode2.value();
    }

    public ErrorCode transErrorCode(int i) {
        if (i == -3) {
            setError(ErrorCode.kErrorIOError);
        } else if (i == -2) {
            setError(ErrorCode.kErrorNoBufferSpace);
        } else if (i != -1) {
            setError(ErrorCode.kErrorNone);
        } else {
            setError(ErrorCode.kErrorInvalidParam);
        }
        return getErrorCode();
    }

    public int setTargetBitmap(Bitmap bitmap, Boolean bool) {
        cleanExistFrameUnit();
        return transErrorCode(setBitmap(bitmap, DEFAULT_INPUT_TAG, bool)).value();
    }

    public int setTargetBitmap(Bitmap bitmap, int i, Boolean bool) {
        cleanExistFrameUnit();
        return transErrorCode(setBitmap(bitmap, INPUT_TAG_PREFIX + i, bool)).value();
    }

    public int setTargetBitmap(Bitmap bitmap, String str, Boolean bool) {
        cleanExistFrameUnit();
        return transErrorCode(setBitmap(bitmap, str, bool)).value();
    }

    public int setTargetImage(int i, int i2, ImageFormat imageFormat, Rect rect, @NonNull ByteBuffer byteBuffer, @NonNull ByteBuffer byteBuffer2, @NonNull ByteBuffer byteBuffer3, int i3, int i4) {
        if (imageFormat != ImageFormat.YUV_420_888) {
            i0.c(TAG, "setTargetImage format " + imageFormat + "not support");
            ErrorCode errorCode = ErrorCode.kErrorInvalidParam;
            setError(errorCode);
            return errorCode.value();
        }
        cleanExistFrameUnit();
        i0.a(TAG, "setTargetImage with buffer: " + i + ", " + i2 + ". " + imageFormat);
        int[] iArr = new int[4];
        if (rect != null) {
            iArr[0] = rect.left;
            iArr[1] = rect.top;
            iArr[2] = rect.right;
            iArr[3] = rect.bottom;
        }
        try {
            return transErrorCode(setData(FrameUnit.yuv2RGB2(i, i2, iArr, byteBuffer, byteBuffer2, byteBuffer3, i3, i4, 1), i, i2, ImageFormat.RGB, DEFAULT_INPUT_TAG)).value();
        } catch (Throwable th) {
            i0.c(TAG, "setTargetImage trans err: " + th.getMessage());
            return transErrorCode(-3).value();
        }
    }

    public int setTargetImage(int i, int i2, ImageFormat imageFormat, Rect rect, @NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, int i3, int i4) {
        if (imageFormat != ImageFormat.YUV_420_888) {
            i0.c(TAG, "setTargetImage format " + imageFormat + "not support");
            ErrorCode errorCode = ErrorCode.kErrorInvalidParam;
            setError(errorCode);
            return errorCode.value();
        }
        cleanExistFrameUnit();
        i0.a(TAG, "setTargetImage with byte[]: " + i + ", " + i2 + ". " + imageFormat);
        int[] iArr = new int[4];
        if (rect != null) {
            iArr[0] = rect.left;
            iArr[1] = rect.top;
            iArr[2] = rect.right;
            iArr[3] = rect.bottom;
        }
        try {
            return transErrorCode(setData(FrameUnit.yuv2RGB(i, i2, iArr, bArr, bArr2, bArr3, i3, i4, 1), i, i2, ImageFormat.RGB, DEFAULT_INPUT_TAG)).value();
        } catch (Throwable th) {
            i0.c(TAG, "setTargetImage trans err: " + th.getMessage());
            return transErrorCode(-3).value();
        }
    }
}
