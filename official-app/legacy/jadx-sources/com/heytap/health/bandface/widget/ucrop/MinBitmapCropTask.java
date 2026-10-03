package com.heytap.health.bandface.widget.ucrop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.yq8;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.model.ImageState;
import com.yalantis.ucrop.util.BitmapLoadUtils;
import com.yalantis.ucrop.util.FileUtils;
import com.yalantis.ucrop.util.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class MinBitmapCropTask {
    private static final Executor FALLBACK_BG_EXECUTOR = yq8.a();
    private static final String TAG = "BitmapCropTask";
    private int cropOffsetX;
    private int cropOffsetY;
    private final Bitmap.CompressFormat mCompressFormat;
    private final int mCompressQuality;
    private final WeakReference<Context> mContext;
    private final BitmapCropCallback mCropCallback;
    private final RectF mCropRect;
    private int mCroppedImageHeight;
    private int mCroppedImageWidth;
    private float mCurrentAngle;
    private final RectF mCurrentImageRect;
    private float mCurrentScale;
    private final ExifInfo mExifInfo;
    private final String mImageInputPath;
    private final String mImageOutputPath;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private int mMaxResultImageSizeX;
    private int mMaxResultImageSizeY;
    private int mMinResultImageSizeX;
    private int mMinResultImageSizeY;
    private Bitmap mViewBitmap;

    public MinBitmapCropTask(@NonNull Context context, @Nullable Bitmap bitmap, @NonNull ImageState imageState, @NonNull MinCropParameters minCropParameters, @Nullable BitmapCropCallback bitmapCropCallback) {
        this.mContext = new WeakReference<>(context);
        this.mViewBitmap = bitmap;
        this.mCropRect = imageState.getCropRect();
        this.mCurrentImageRect = imageState.getCurrentImageRect();
        this.mCurrentScale = imageState.getCurrentScale();
        this.mCurrentAngle = imageState.getCurrentAngle();
        this.mMinResultImageSizeX = minCropParameters.getMinResultImageSizeX();
        this.mMinResultImageSizeY = minCropParameters.getMinResultImageSizeY();
        this.mMaxResultImageSizeX = minCropParameters.getMaxResultImageSizeX();
        this.mMaxResultImageSizeY = minCropParameters.getMaxResultImageSizeY();
        this.mCompressFormat = minCropParameters.getCompressFormat();
        this.mCompressQuality = minCropParameters.getCompressQuality();
        this.mImageInputPath = minCropParameters.getImageInputPath();
        this.mImageOutputPath = minCropParameters.getImageOutputPath();
        this.mExifInfo = minCropParameters.getExifInfo();
        this.mCropCallback = bitmapCropCallback;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    private boolean crop() throws Exception {
        boolean z;
        float f;
        float f2;
        boolean z2 = this.mMinResultImageSizeX > 0 && this.mMinResultImageSizeY > 0;
        boolean z3 = this.mMaxResultImageSizeX > 0 && this.mMaxResultImageSizeY > 0;
        if (z2 || z3) {
            float fWidth = this.mCropRect.width() / this.mCurrentScale;
            float fHeight = this.mCropRect.height() / this.mCurrentScale;
            if (z2) {
                int i = this.mMinResultImageSizeX;
                if (fWidth < i || fHeight < this.mMinResultImageSizeY) {
                    f = i / fWidth;
                    f2 = this.mMinResultImageSizeY / fHeight;
                    z = true;
                } else {
                    z = false;
                    f = 0.0f;
                    f2 = 0.0f;
                }
            } else {
                z = false;
                f = 0.0f;
                f2 = 0.0f;
            }
            if (z3) {
                int i2 = this.mMaxResultImageSizeX;
                if (fWidth > i2 || fHeight > this.mMaxResultImageSizeY) {
                    f = i2 / fWidth;
                    f2 = this.mMaxResultImageSizeY / fHeight;
                    z = true;
                }
            }
            if (z) {
                float fMax = Math.max(f, f2);
                Bitmap bitmap = this.mViewBitmap;
                this.mViewBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * fMax), Math.round(this.mViewBitmap.getHeight() * fMax), false);
                this.mCurrentScale /= fMax;
            }
        }
        if (this.mCurrentAngle != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.mCurrentAngle, this.mViewBitmap.getWidth() / 2, this.mViewBitmap.getHeight() / 2);
            Bitmap bitmap2 = this.mViewBitmap;
            this.mViewBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.mViewBitmap.getHeight(), matrix, true);
        }
        this.cropOffsetX = Math.round((this.mCropRect.left - this.mCurrentImageRect.left) / this.mCurrentScale);
        this.cropOffsetY = Math.round((this.mCropRect.top - this.mCurrentImageRect.top) / this.mCurrentScale);
        this.mCroppedImageWidth = Math.round(this.mCropRect.width() / this.mCurrentScale);
        int iRound = Math.round(this.mCropRect.height() / this.mCurrentScale);
        this.mCroppedImageHeight = iRound;
        boolean zShouldCrop = shouldCrop(this.mCroppedImageWidth, iRound);
        a7b.f(TAG, "Should crop: " + zShouldCrop);
        if (!zShouldCrop) {
            FileUtils.copyFile(this.mImageInputPath, this.mImageOutputPath);
            return false;
        }
        ExifInterface exifInterface = new ExifInterface(this.mImageInputPath);
        saveImage(Bitmap.createBitmap(this.mViewBitmap, this.cropOffsetX, this.cropOffsetY, this.mCroppedImageWidth, this.mCroppedImageHeight));
        if (this.mCompressFormat.equals(Bitmap.CompressFormat.JPEG)) {
            ImageHeaderParser.copyExif(exifInterface, this.mCroppedImageWidth, this.mCroppedImageHeight, this.mImageOutputPath);
        }
        return true;
    }

    @Nullable
    private Throwable doInBackground() {
        Bitmap bitmap = this.mViewBitmap;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.mCurrentImageRect.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        try {
            crop();
            this.mViewBitmap = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPostExecute, reason: merged with bridge method [inline-methods] */
    public void lambda$runWorker$1(@Nullable Throwable th) {
        BitmapCropCallback bitmapCropCallback = this.mCropCallback;
        if (bitmapCropCallback != null) {
            if (th != null) {
                bitmapCropCallback.onCropFailure(th);
            } else {
                this.mCropCallback.onBitmapCropped(Uri.fromFile(new File(this.mImageOutputPath)), this.cropOffsetX, this.cropOffsetY, this.mCroppedImageWidth, this.mCroppedImageHeight);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runInBackgroundSafely, reason: merged with bridge method [inline-methods] */
    public void lambda$executeOnExecutor$0() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            FALLBACK_BG_EXECUTOR.execute(new Runnable() { // from class: com.oplus.aiunit.vision.a0c
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.runWorker();
                }
            });
        } else {
            runWorker();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runWorker() {
        final Throwable thDoInBackground = doInBackground();
        this.mMainHandler.post(new Runnable() { // from class: com.oplus.aiunit.vision.zzb
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$runWorker$1(thDoInBackground);
            }
        });
    }

    private void saveImage(@NonNull Bitmap bitmap) throws FileNotFoundException {
        Context context = this.mContext.get();
        if (context == null) {
            return;
        }
        OutputStream outputStreamOpenOutputStream = null;
        try {
            outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(Uri.fromFile(new File(this.mImageOutputPath)));
            bitmap.compress(this.mCompressFormat, this.mCompressQuality, outputStreamOpenOutputStream);
        } finally {
            BitmapLoadUtils.close(outputStreamOpenOutputStream);
        }
    }

    private boolean shouldCrop(int i, int i2) {
        int iRound = Math.round(Math.max(i, i2) / 1000.0f) + 1;
        if (this.mMaxResultImageSizeX > 0 && this.mMaxResultImageSizeY > 0) {
            return true;
        }
        float f = iRound;
        return Math.abs(this.mCropRect.left - this.mCurrentImageRect.left) > f || Math.abs(this.mCropRect.top - this.mCurrentImageRect.top) > f || Math.abs(this.mCropRect.bottom - this.mCurrentImageRect.bottom) > f || Math.abs(this.mCropRect.right - this.mCurrentImageRect.right) > f || this.mCurrentAngle != 0.0f;
    }

    public MinBitmapCropTask executeOnExecutor(@NonNull Executor executor) {
        executor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.b0c
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$executeOnExecutor$0();
            }
        });
        return this;
    }
}
