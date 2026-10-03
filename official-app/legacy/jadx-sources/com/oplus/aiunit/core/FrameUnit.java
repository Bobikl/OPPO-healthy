package com.oplus.aiunit.core;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.system.OsConstants;
import com.oplus.aiunit.core.FrameUnit;
import com.oplus.aiunit.core.data.IBitmap;
import com.oplus.aiunit.core.protocol.common.ImageFormat;
import com.oplus.aiunit.vision.i0;
import com.oplus.aiunit.vision.vy7;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class FrameUnit implements Parcelable {
    public static final Parcelable.Creator<FrameUnit> CREATOR = new a();
    public static final int FLAG_AUTO_CLEAN = 1;
    public static final int FLAG_FRAGMENT = 2;
    public static final int FLAG_FRAGMENT_PARENT = 4;
    private static final int FLAG_READ_BUFFER_FROM_BITMAP = 8;
    private static final String TAG = "FrameUnit";
    private IBinder mBitmap;
    private ByteBuffer mByteBuffer;
    private int mChannel;
    private int mFlag;
    private int mHeight;
    private int mImageFormat;
    private SharedMemory mSharedMemory;
    private String mStrUuid;
    private String mTag;
    private int mWidth;
    private Bitmap originBitmap;

    public class a implements Parcelable.Creator<FrameUnit> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FrameUnit createFromParcel(Parcel parcel) {
            return new FrameUnit(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FrameUnit[] newArray(int i) {
            return new FrameUnit[i];
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageFormat.values().length];
            a = iArr;
            try {
                iArr[ImageFormat.YUV_NV12.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageFormat.YUV_NV21.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageFormat.YUV_YU12.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ImageFormat.YUV_NV12_10B.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ImageFormat.YUV_NV21_10B.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageFormat.YUV_YU12_10B.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageFormat.GRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageFormat.RGB565.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageFormat.BGR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageFormat.RGB.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageFormat.BGR_10B.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageFormat.RGB_10B.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[ImageFormat.YUV_444.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[ImageFormat.RGBA.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[ImageFormat.RGBA_10B.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[ImageFormat.HARDWARE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[ImageFormat.IGNORED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    static {
        try {
            System.loadLibrary("aiunit_sdk_core");
        } catch (Throwable th) {
            i0.c(TAG, "FrameUnit load err. " + th.getMessage());
        }
    }

    public FrameUnit(FrameUnit frameUnit, Bitmap bitmap) {
        this.mWidth = -1;
        this.mHeight = -1;
        this.mChannel = -1;
        this.mImageFormat = ImageFormat.IGNORED.value();
        this.mBitmap = null;
        this.originBitmap = null;
        this.mSharedMemory = null;
        this.mFlag = 0;
        this.mTag = "";
        this.mStrUuid = frameUnit.getUUID();
        setFlag(2);
        frameUnit.setFlag(4);
        this.mByteBuffer = ByteBuffer.allocateDirect(bitmap.getByteCount());
        receiveBitmap(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0(ByteBuffer byteBuffer, vy7.a aVar, int i) {
        return "limit is " + byteBuffer.limit() + " pos is " + byteBuffer.position() + " start is " + aVar.e() + "format is " + aVar.d() + " buffer size is " + i;
    }

    private ImageFormat transform(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888) {
            return ImageFormat.RGBA;
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageFormat.RGB565;
        }
        if (config == Bitmap.Config.HARDWARE) {
            return ImageFormat.HARDWARE;
        }
        return config == Bitmap.Config.ALPHA_8 ? ImageFormat.GRAY : ImageFormat.RGBA;
    }

    public static native byte[] yuv2RGB(int i, int i2, int[] iArr, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4, int i5);

    public static native byte[] yuv2RGB2(int i, int i2, int[] iArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, int i5);

    public void cleanFlag() {
        this.mFlag = 0;
    }

    public void clear(Boolean bool) {
        Bitmap bitmap;
        i0.a(TAG, "clear recycle = " + bool + ", binder = " + this.mBitmap);
        if (bool.booleanValue() && (bitmap = this.originBitmap) != null) {
            bitmap.recycle();
        }
        this.originBitmap = null;
        this.mBitmap = null;
    }

    public void close() {
        SharedMemory sharedMemory = this.mSharedMemory;
        if (sharedMemory != null) {
            sharedMemory.close();
        }
    }

    public void closeBuffer() {
        ByteBuffer byteBuffer;
        if (isFragment() || (byteBuffer = this.mByteBuffer) == null) {
            return;
        }
        SharedMemory.unmap(byteBuffer);
        this.mByteBuffer = null;
    }

    public Bitmap createBitmap() {
        int i = b.a[ImageFormat.find(getImageFormat()).ordinal()];
        if (i == 7) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ALPHA_8);
            ByteBuffer byteBufferOpenBuffer = openBuffer();
            if (byteBufferOpenBuffer == null) {
                return null;
            }
            bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferOpenBuffer);
            closeBuffer();
            return bitmapCreateBitmap;
        }
        if (i != 10) {
            if (i != 14) {
                i0.c(TAG, "invalid image format in createBitmap: " + getImageFormat());
                return null;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            ByteBuffer byteBufferOpenBuffer2 = openBuffer();
            if (byteBufferOpenBuffer2 == null) {
                return null;
            }
            bitmapCreateBitmap2.copyPixelsFromBuffer(byteBufferOpenBuffer2);
            closeBuffer();
            return bitmapCreateBitmap2;
        }
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        ByteBuffer byteBufferOpenBuffer3 = openBuffer();
        if (byteBufferOpenBuffer3 == null) {
            return null;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((getChannel() * (getHeight() * getWidth())) / 3) * 4);
        for (int i2 = 0; i2 < byteBufferAllocateDirect.capacity(); i2++) {
            if (i2 % 4 != 3) {
                byteBufferAllocateDirect.put(byteBufferOpenBuffer3.get());
            } else {
                byteBufferAllocateDirect.put((byte) -1);
            }
        }
        byteBufferAllocateDirect.rewind();
        bitmapCreateBitmap3.copyPixelsFromBuffer(byteBufferAllocateDirect);
        closeBuffer();
        return bitmapCreateBitmap3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bitmap getBinderBitmap() {
        return this.originBitmap;
    }

    public IBinder getBitmap() {
        return this.mBitmap;
    }

    public int getBufferSize() {
        ByteBuffer byteBuffer;
        if (isFragment() && (byteBuffer = this.mByteBuffer) != null) {
            return byteBuffer.capacity();
        }
        SharedMemory sharedMemory = this.mSharedMemory;
        if (sharedMemory == null) {
            i0.c(TAG, "shared memory is null buffer size get failed.");
            return 0;
        }
        try {
            return sharedMemory.getSize();
        } catch (IllegalStateException e2) {
            i0.c(TAG, "getBufferSize failed. " + e2.getMessage());
            return 0;
        }
    }

    public int getChannel() {
        return this.mChannel;
    }

    public byte[] getData() {
        i0.f(TAG, "getData");
        byte[] bArr = new byte[getFrameSize()];
        ByteBuffer byteBufferOpenBuffer = openBuffer();
        if (byteBufferOpenBuffer == null) {
            return null;
        }
        byteBufferOpenBuffer.rewind();
        byteBufferOpenBuffer.get(bArr);
        closeBuffer();
        return bArr;
    }

    public double[] getDataDoubleArray() {
        ByteBuffer byteBufferOpenBuffer = openBuffer(getFrameSize());
        double[] dArr = new double[this.mWidth * this.mHeight];
        if (byteBufferOpenBuffer == null) {
            i0.c(TAG, "getSpecialDataDoubleArray null");
            return null;
        }
        for (int i = 0; i < this.mWidth; i++) {
            dArr[i] = byteBufferOpenBuffer.getDouble(i * 8);
        }
        closeBuffer();
        return dArr;
    }

    public double[][] getDataDoubleArray2D() {
        ByteBuffer byteBufferOpenBuffer = openBuffer(getFrameSize());
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.mWidth, this.mHeight);
        if (byteBufferOpenBuffer == null) {
            i0.c(TAG, "getSpecialDataIntArray null");
            return null;
        }
        for (int i = 0; i < this.mWidth; i++) {
            int i2 = 0;
            while (true) {
                int i3 = this.mHeight;
                if (i2 < i3) {
                    dArr[i][i2] = byteBufferOpenBuffer.getDouble(((i3 * i) + i2) * 8);
                    i2++;
                }
            }
        }
        closeBuffer();
        return dArr;
    }

    public float[] getDataFloatArray() {
        ByteBuffer byteBufferOpenBuffer = openBuffer(getFrameSize());
        float[] fArr = new float[this.mWidth * this.mHeight];
        if (byteBufferOpenBuffer == null) {
            i0.c(TAG, "getSpecialDataFloatArray null");
            return null;
        }
        for (int i = 0; i < this.mWidth; i++) {
            fArr[i] = byteBufferOpenBuffer.getFloat(i * 4);
        }
        closeBuffer();
        return fArr;
    }

    public float[][] getDataFloatArray2D() {
        ByteBuffer byteBufferOpenBuffer = openBuffer(getFrameSize());
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, this.mWidth, this.mHeight);
        if (byteBufferOpenBuffer == null) {
            i0.c(TAG, "getSpecialDataIntArray null");
            return null;
        }
        for (int i = 0; i < this.mWidth; i++) {
            int i2 = 0;
            while (true) {
                int i3 = this.mHeight;
                if (i2 < i3) {
                    fArr[i][i2] = byteBufferOpenBuffer.getFloat(((i3 * i) + i2) * 4);
                    i2++;
                }
            }
        }
        closeBuffer();
        return fArr;
    }

    public int[] getDataIntArray() {
        ByteBuffer byteBufferOpenBuffer = openBuffer(getFrameSize());
        int[] iArr = new int[this.mWidth * this.mHeight];
        if (byteBufferOpenBuffer == null) {
            i0.c(TAG, "getSpecialDataIntArray null");
            return null;
        }
        for (int i = 0; i < this.mWidth; i++) {
            iArr[i] = byteBufferOpenBuffer.getInt(i * 4);
        }
        closeBuffer();
        return iArr;
    }

    public int[][] getDataIntArray2D() {
        ByteBuffer byteBufferOpenBuffer = openBuffer(getFrameSize());
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.mWidth, this.mHeight);
        if (byteBufferOpenBuffer == null) {
            i0.c(TAG, "getSpecialDataIntArray null");
            return null;
        }
        for (int i = 0; i < this.mWidth; i++) {
            int i2 = 0;
            while (true) {
                int i3 = this.mHeight;
                if (i2 < i3) {
                    iArr[i][i2] = byteBufferOpenBuffer.getInt(((i3 * i) + i2) * 4);
                    i2++;
                }
            }
        }
        closeBuffer();
        return iArr;
    }

    public int getFlag() {
        return this.mFlag;
    }

    public int getFrameSize() {
        return this.mWidth * this.mHeight * this.mChannel;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getImageFormat() {
        return this.mImageFormat;
    }

    public native byte getNativeByte(int i);

    public native double getNativeDouble(int i);

    public native float getNativeFloat(int i);

    public native int getNativeInt(int i);

    public native long getNativeLong(int i);

    public SharedMemory getSharedMemory() {
        return this.mSharedMemory;
    }

    public String getTag() {
        return this.mTag;
    }

    public String getUUID() {
        return this.mStrUuid;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean is10BitFormat() {
        return this.mImageFormat >= ImageFormat.YUV_NV21_10B.value() && this.mImageFormat < ImageFormat.END.value();
    }

    public boolean isAutoClean() {
        return (this.mFlag & 1) != 0;
    }

    public boolean isFragment() {
        return (this.mFlag & 2) != 0;
    }

    public boolean isFragmentParent() {
        return (this.mFlag & 4) != 0;
    }

    public boolean isReadFromBitmap() {
        return (this.mFlag & 8) != 0;
    }

    public boolean match(int i, int i2, int i3) {
        return i == this.mWidth && i2 == this.mHeight && i3 == this.mChannel;
    }

    public void move(FrameUnit frameUnit) {
        if (!this.mStrUuid.equals(frameUnit.mStrUuid)) {
            i0.c(TAG, "move uuid not match!");
            return;
        }
        this.mWidth = frameUnit.mWidth;
        this.mHeight = frameUnit.mHeight;
        this.mChannel = frameUnit.mChannel;
        this.mImageFormat = frameUnit.mImageFormat;
    }

    public ByteBuffer openBuffer(int i) {
        ByteBuffer byteBuffer = this.mByteBuffer;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        SharedMemory sharedMemory = this.mSharedMemory;
        if (sharedMemory != null) {
            try {
                sharedMemory.setProtect(OsConstants.PROT_READ | OsConstants.PROT_WRITE);
                this.mByteBuffer = this.mSharedMemory.mapReadWrite();
            } catch (ErrnoException | IllegalStateException e2) {
                i0.c(TAG, "set protect or map read write failed." + e2.getMessage());
            }
        } else {
            i0.n(TAG, "shared memory is empty");
        }
        try {
            if (this.mByteBuffer == null) {
                this.mByteBuffer = ByteBuffer.allocate(i);
            }
        } catch (Throwable th) {
            i0.c(TAG, "openBuffer from bitmap failed! " + th);
        }
        i0.a(TAG, "openBuffer mByteBuffer = " + this.mByteBuffer);
        return this.mByteBuffer;
    }

    public void readFromParcel(Parcel parcel) {
        this.mStrUuid = parcel.readString();
        this.mWidth = parcel.readInt();
        this.mHeight = parcel.readInt();
        this.mChannel = parcel.readInt();
        this.mImageFormat = parcel.readInt();
        IBinder strongBinder = parcel.readStrongBinder();
        this.mBitmap = strongBinder;
        if (strongBinder != null) {
            try {
                this.originBitmap = IBitmap.Stub.asInterface(strongBinder).getBitmap();
                i0.f(TAG, "readFromParcel: originBitmap = $originBitmap");
                if (this.originBitmap == null || this.mImageFormat != ImageFormat.HARDWARE.value()) {
                    return;
                }
                setFlag(8);
                this.mImageFormat = ImageFormat.RGBA.value();
            } catch (Throwable th) {
                i0.n(TAG, "readFromParcel getBitmap err. " + th);
            }
        }
    }

    public void receiveBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            i0.c(TAG, "receiveBitmap, bitmap status error");
            return;
        }
        int bufferSize = getBufferSize();
        int byteCount = bitmap.getByteCount();
        if (bufferSize < byteCount) {
            i0.c(TAG, "bitmap size " + byteCount + ", more than buffer size " + bufferSize + " not supported. ");
            return;
        }
        setWidth(bitmap.getWidth());
        setHeight(bitmap.getHeight());
        ByteBuffer byteBufferOpenBuffer = openBuffer();
        setImageFormatDirectly(transform(bitmap.getConfig()));
        if (byteBufferOpenBuffer != null) {
            if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                bitmap.copyPixelsToBuffer(byteBufferOpenBuffer);
            }
            closeBuffer();
        }
    }

    public void restoreFrameUnit(FrameUnit frameUnit) {
        setSharedMemory(frameUnit.getSharedMemory());
        setFlag(frameUnit.getFlag());
        setTag(frameUnit.getTag());
    }

    public void setBinderBitmap(Bitmap bitmap) {
        this.originBitmap = bitmap;
        setBitmap(new IBitmap.Stub() { // from class: com.oplus.aiunit.core.FrameUnit.1
            @Override // com.oplus.aiunit.core.data.IBitmap
            public Bitmap getBitmap() {
                return FrameUnit.this.originBitmap;
            }
        });
    }

    public void setBitmap(IBinder iBinder) {
        this.mBitmap = iBinder;
    }

    public void setChannel(int i) {
        this.mChannel = i;
    }

    public void setData(byte[] bArr) {
        setData(bArr, 0);
    }

    public void setFlag(int i) {
        this.mFlag = i | this.mFlag;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setImageFormat(int i) {
        setImageFormatDirectly(ImageFormat.find(i));
    }

    public void setImageFormatDirectly(ImageFormat imageFormat) {
        switch (b.a[imageFormat.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                this.mChannel = 1;
                break;
            case 8:
                this.mChannel = 2;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                this.mChannel = 3;
                break;
            case 14:
            case 15:
            case 16:
                this.mChannel = 4;
                break;
        }
        this.mImageFormat = imageFormat.value();
    }

    public native void setNativeByteArray(byte[] bArr, int i);

    public native void setNativeDoubleArray(double[] dArr, int i);

    public native void setNativeFloatArray(float[] fArr, int i);

    public native void setNativeIntArray(int[] iArr, int i);

    public native void setNativeLongArray(long[] jArr, int i);

    public void setSharedMemory(SharedMemory sharedMemory) {
        this.mSharedMemory = sharedMemory;
    }

    public void setSpecialDataDoubleArray(double[] dArr) {
        if (dArr == null) {
            i0.c(TAG, "data is null.");
            return;
        }
        ByteBuffer byteBufferOpenBuffer = openBuffer(dArr.length * 8);
        if (byteBufferOpenBuffer != null) {
            for (int i = 0; i < dArr.length; i++) {
                byteBufferOpenBuffer.putDouble(i * 8, dArr[i]);
            }
            closeBuffer();
        }
    }

    public void setSpecialDataDoubleArray2D(double[][] dArr) {
        if (dArr == null) {
            i0.c(TAG, "data is null.");
            return;
        }
        ByteBuffer byteBuffer = this.mByteBuffer;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBufferOpenBuffer = openBuffer(this.mWidth * this.mHeight * 8);
        if (byteBufferOpenBuffer != null) {
            for (double[] dArr2 : dArr) {
                for (double d : dArr2) {
                    byteBufferOpenBuffer.putDouble(d);
                }
            }
            closeBuffer();
        }
    }

    public void setSpecialDataFloatArray(float[] fArr) {
        if (fArr == null) {
            i0.c(TAG, "data is null.");
            return;
        }
        ByteBuffer byteBufferOpenBuffer = openBuffer(fArr.length * 4);
        if (byteBufferOpenBuffer != null) {
            for (int i = 0; i < fArr.length; i++) {
                byteBufferOpenBuffer.putFloat(i * 4, fArr[i]);
            }
            closeBuffer();
        }
    }

    public void setSpecialDataFloatArray2D(float[][] fArr) {
        if (fArr == null) {
            i0.c(TAG, "data is null.");
            return;
        }
        ByteBuffer byteBufferOpenBuffer = openBuffer(this.mWidth * this.mHeight * 4);
        if (byteBufferOpenBuffer != null) {
            for (float[] fArr2 : fArr) {
                for (float f : fArr2) {
                    byteBufferOpenBuffer.putFloat(f);
                }
            }
            closeBuffer();
        }
    }

    public void setSpecialDataIntArray(int[] iArr) {
        if (iArr == null) {
            i0.c(TAG, "data is null.");
            return;
        }
        ByteBuffer byteBufferOpenBuffer = openBuffer(iArr.length * 4);
        if (byteBufferOpenBuffer != null) {
            for (int i = 0; i < iArr.length; i++) {
                byteBufferOpenBuffer.putInt(i * 4, iArr[i]);
            }
            closeBuffer();
        }
    }

    public void setSpecialDataIntArray2D(int[][] iArr) {
        if (iArr == null) {
            i0.c(TAG, "data is null.");
            return;
        }
        ByteBuffer byteBufferOpenBuffer = openBuffer(this.mWidth * this.mHeight * 4);
        if (byteBufferOpenBuffer != null) {
            for (int[] iArr2 : iArr) {
                for (int i : iArr2) {
                    byteBufferOpenBuffer.putInt(i);
                }
            }
            closeBuffer();
        }
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mStrUuid);
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mHeight);
        parcel.writeInt(this.mChannel);
        parcel.writeInt(this.mImageFormat);
        parcel.writeStrongBinder(this.mBitmap);
    }

    public void setData(byte[] bArr, int i) {
        if (bArr == null) {
            i0.a(TAG, "data is null.");
            return;
        }
        ByteBuffer byteBufferOpenBuffer = openBuffer();
        if (byteBufferOpenBuffer != null) {
            byteBufferOpenBuffer.position(i);
            byteBufferOpenBuffer.put(bArr);
            closeBuffer();
        }
    }

    public ByteBuffer openBuffer() {
        ByteBuffer byteBuffer;
        if (isFragment() && (byteBuffer = this.mByteBuffer) != null) {
            return byteBuffer;
        }
        ByteBuffer byteBuffer2 = this.mByteBuffer;
        if (byteBuffer2 != null) {
            return byteBuffer2;
        }
        SharedMemory sharedMemory = this.mSharedMemory;
        if (sharedMemory != null) {
            try {
                sharedMemory.setProtect(OsConstants.PROT_READ | OsConstants.PROT_WRITE);
                this.mByteBuffer = this.mSharedMemory.mapReadWrite();
            } catch (ErrnoException | IllegalStateException e2) {
                i0.c(TAG, "set protect or map read write failed." + e2.getMessage());
            }
        } else {
            i0.n(TAG, "shared memory is empty");
        }
        try {
            Bitmap bitmap = this.originBitmap;
            if (isReadFromBitmap() && bitmap != null) {
                if (!bitmap.isRecycled() && bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                    ByteBuffer byteBuffer3 = this.mByteBuffer;
                    if (byteBuffer3 == null) {
                        this.mByteBuffer = ByteBuffer.allocate(bitmap.getByteCount());
                    } else {
                        byteBuffer3.clear();
                    }
                    bitmap.copyPixelsToBuffer(this.mByteBuffer);
                    i0.f(TAG, "openBuffer from bitmap " + bitmap.getByteCount());
                    return this.mByteBuffer;
                }
                i0.n(TAG, "openBuffer from bitmap invalid! ");
            }
        } catch (Throwable th) {
            i0.c(TAG, "openBuffer from bitmap failed! " + th);
        }
        i0.a(TAG, "openBuffer mByteBuffer = " + this.mByteBuffer);
        return this.mByteBuffer;
    }

    public FrameUnit(FrameUnit frameUnit, final vy7.a aVar) {
        this.mWidth = -1;
        this.mHeight = -1;
        this.mChannel = -1;
        this.mImageFormat = ImageFormat.IGNORED.value();
        this.mBitmap = null;
        this.originBitmap = null;
        this.mSharedMemory = null;
        this.mFlag = 0;
        this.mTag = "";
        this.mStrUuid = frameUnit.mStrUuid;
        this.mFlag = frameUnit.mFlag;
        this.mWidth = aVar.g().intValue();
        this.mHeight = aVar.c().intValue();
        this.mChannel = aVar.b().intValue();
        this.mImageFormat = aVar.d().intValue();
        this.mTag = aVar.f();
        final int i = this.mWidth * this.mHeight * this.mChannel;
        byte[] bArr = new byte[i];
        final ByteBuffer byteBufferOpenBuffer = frameUnit.openBuffer();
        if (byteBufferOpenBuffer != null) {
            i0.b(TAG, new Function0() { // from class: com.oplus.aiunit.vision.wy7
                @Override // p010kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FrameUnit.lambda$new$0(byteBufferOpenBuffer, aVar, i);
                }
            });
            byteBufferOpenBuffer.position((int) aVar.e());
            byteBufferOpenBuffer.get(bArr, 0, i);
        }
        frameUnit.closeBuffer();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
        this.mByteBuffer = byteBufferAllocateDirect;
        byteBufferAllocateDirect.put(bArr, 0, i);
        this.mByteBuffer.rewind();
        setFlag(2);
    }

    public FrameUnit(ShareMemoryHolder shareMemoryHolder) {
        this.mWidth = -1;
        this.mHeight = -1;
        this.mChannel = -1;
        this.mImageFormat = ImageFormat.IGNORED.value();
        this.mBitmap = null;
        this.originBitmap = null;
        this.mSharedMemory = null;
        this.mFlag = 0;
        this.mTag = "";
        this.mSharedMemory = shareMemoryHolder.getSharedMemory();
        this.mStrUuid = shareMemoryHolder.getUUID();
    }

    public FrameUnit(Bitmap bitmap, String str) {
        this.mWidth = -1;
        this.mHeight = -1;
        this.mChannel = -1;
        this.mImageFormat = ImageFormat.IGNORED.value();
        this.mBitmap = null;
        this.originBitmap = null;
        this.mSharedMemory = null;
        this.mFlag = 0;
        this.mTag = "";
        setTag(str);
        setFlag(1);
        setWidth(bitmap.getWidth());
        setHeight(bitmap.getHeight());
        setImageFormatDirectly(transform(bitmap.getConfig()));
        setBinderBitmap(bitmap);
    }

    public FrameUnit(Parcel parcel) {
        this.mWidth = -1;
        this.mHeight = -1;
        this.mChannel = -1;
        this.mImageFormat = ImageFormat.IGNORED.value();
        this.mBitmap = null;
        this.originBitmap = null;
        this.mSharedMemory = null;
        this.mFlag = 0;
        this.mTag = "";
        readFromParcel(parcel);
    }
}
