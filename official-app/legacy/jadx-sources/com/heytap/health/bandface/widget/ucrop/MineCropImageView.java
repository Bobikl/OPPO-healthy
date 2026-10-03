package com.heytap.health.bandface.widget.ucrop;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.kw0;
import com.oplus.aiunit.vision.u22;
import com.oplus.aiunit.vision.yq8;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.model.ImageState;
import com.yalantis.ucrop.util.RectUtils;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.TransformImageView;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class MineCropImageView extends GestureCropImageView {
    private static final Executor CROP_EXECUTOR = yq8.a();
    private static final String TAG = "MineCropImageView";
    private ExifInfo mExifInfo;
    private String mImageInputPath;
    private String mImageOutputPath;
    private int mMaxResultImageSizeX;
    private int mMaxResultImageSizeY;
    private int mMinResultImageSizeX;
    private int mMinResultImageSizeY;

    public class a implements BitmapLoadCallback {
        public a() {
        }

        @Override // com.yalantis.ucrop.callback.BitmapLoadCallback
        public void onBitmapLoaded(@NonNull Bitmap bitmap, @NonNull ExifInfo exifInfo, @NonNull String str, @Nullable String str2) {
            MineCropImageView.this.mImageInputPath = str;
            MineCropImageView.this.mImageOutputPath = str2;
            MineCropImageView.this.mExifInfo = exifInfo;
            ((TransformImageView) MineCropImageView.this).mBitmapDecoded = true;
            MineCropImageView.this.setImageBitmap(bitmap);
        }

        @Override // com.yalantis.ucrop.callback.BitmapLoadCallback
        public void onFailure(@NonNull Exception exc) {
            kw0.e(MineCropImageView.TAG, "[setImageUri] bitmapWorkerException " + exc.getMessage());
            if (((TransformImageView) MineCropImageView.this).mTransformImageListener != null) {
                ((TransformImageView) MineCropImageView.this).mTransformImageListener.onLoadFailure(exc);
            }
        }
    }

    public MineCropImageView(Context context) {
        super(context);
    }

    private RectF getCropRect() {
        Class<? super Object> superclass = getClass().getSuperclass();
        while (superclass != null) {
            try {
                Field declaredField = superclass.getDeclaredField("mCropRect");
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    return (RectF) declaredField.get(this);
                }
                superclass = superclass.getSuperclass();
            } catch (Exception e2) {
                kw0.e(TAG, "[getCropRect] e=" + e2.getMessage());
                superclass = superclass.getSuperclass();
            }
        }
        return new RectF();
    }

    @Override // com.yalantis.ucrop.view.CropImageView
    public void cropAndSaveImage(@NonNull Bitmap.CompressFormat compressFormat, int i, @Nullable BitmapCropCallback bitmapCropCallback) {
        cancelAllAnimations();
        setImageToWrapCropBounds(false);
        new MinBitmapCropTask(getContext(), getViewBitmap(), new ImageState(getCropRect(), RectUtils.trapToRect(this.mCurrentImageCorners), getCurrentScale(), getCurrentAngle()), new MinCropParameters(this.mMinResultImageSizeX, this.mMinResultImageSizeY, this.mMaxResultImageSizeX, this.mMaxResultImageSizeY, compressFormat, i, this.mImageInputPath, this.mImageOutputPath, this.mExifInfo), bitmapCropCallback).executeOnExecutor(CROP_EXECUTOR);
    }

    @Override // com.yalantis.ucrop.view.CropImageView
    public void processStyledAttributes(@NonNull TypedArray typedArray) {
        super.processStyledAttributes(typedArray);
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public void setImageUri(@NonNull Uri uri, @Nullable Uri uri2) throws Exception {
        int maxBitmapSize = getMaxBitmapSize();
        u22.i(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new a());
    }

    @Override // com.yalantis.ucrop.view.CropImageView
    public void setMaxResultImageSizeX(@IntRange(from = 10) int i) {
        this.mMaxResultImageSizeX = i;
    }

    @Override // com.yalantis.ucrop.view.CropImageView
    public void setMaxResultImageSizeY(@IntRange(from = 10) int i) {
        this.mMaxResultImageSizeY = i;
    }

    public void setMinResultImageSizeX(@IntRange(from = 10) int i) {
        this.mMinResultImageSizeX = i;
    }

    public void setMinResultImageSizeY(@IntRange(from = 10) int i) {
        this.mMinResultImageSizeY = i;
    }

    public MineCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MineCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
