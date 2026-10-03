package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.heytap.health.watchface.business.store.view.ClipImageView;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public class cg1 {
    public static final int ARGB_SIZE = 4;
    public static final int RGB_SIZE = 3;
    public static final String TAG = "BitmapUtil";
    public static final double WEIGHT_BLUE = 0.2989d;
    public static final double WEIGHT_GREEN = 0.587d;
    public static final double WEIGHT_RED = 0.114d;

    public static void A(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    public static Bitmap B(Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap C(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        int iApplyDimension = (int) TypedValue.applyDimension(1, f, b78.a().getResources().getDisplayMetrics());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        float f2 = iApplyDimension;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        return bitmapCreateBitmap;
    }

    public static void D(Bitmap bitmap, Bitmap.CompressFormat compressFormat, String str) throws Throwable {
        if (bitmap == null || TextUtils.isEmpty(str)) {
            ltl.b(TAG, "[saveBitmap] --> error, bitmap or localFilePath is null");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    ltl.a(TAG, file.getAbsolutePath() + " mkdirs mkStatus = " + file.getParentFile().mkdirs() + " nfStatus = " + file.createNewFile());
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    bitmap.compress(compressFormat, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    nt9.a(fileOutputStream2, TAG);
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    ltl.b(TAG, "[copyAssetsToDst]IOException " + e.getMessage());
                    nt9.a(fileOutputStream, TAG);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    nt9.a(fileOutputStream, TAG);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static void E(Bitmap bitmap, String str) throws Throwable {
        if (bitmap == null || TextUtils.isEmpty(str)) {
            ltl.b(TAG, "[saveBitmapToBmp] --> error, bitmap or localFilePath is null");
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = height * width * 2;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    ltl.a(TAG, file.getAbsolutePath() + " mkdirs mkStatus = " + file.getParentFile().mkdirs() + " nfStatus = " + file.createNewFile());
                }
                Bitmap bitmapH = h(bitmap);
                if (bitmapH == null) {
                    ltl.i(TAG, "[saveBitmapToBmp] --> error, roundBitmap is null");
                    nt9.a(null, TAG);
                    return;
                }
                byte[] bArr = new byte[i];
                int i2 = 0;
                for (int i3 = 0; i3 < height; i3++) {
                    for (int i4 = 0; i4 < width; i4++) {
                        int pixel = bitmapH.getPixel(i4, i3);
                        if (Color.alpha(pixel) == 0) {
                            bArr[i2 + 1] = 0;
                            bArr[i2] = 0;
                        } else {
                            int iRed = Color.red(pixel);
                            int iGreen = Color.green(pixel);
                            int iBlue = Color.blue(pixel);
                            bArr[i2 + 1] = (byte) ((iRed & 248) | ((iGreen >> 5) & 7));
                            bArr[i2] = (byte) (((iBlue >> 3) & 31) | ((iGreen << 3) & oei.TAI_CHI));
                        }
                        i2 += 2;
                    }
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    nt9.a(fileOutputStream2, TAG);
                } catch (Exception e2) {
                    fileOutputStream = fileOutputStream2;
                    e = e2;
                    ltl.b(TAG, "[saveBitmapToBmp] --> error=" + e.getMessage());
                    nt9.a(fileOutputStream, TAG);
                } catch (Throwable th) {
                    fileOutputStream = fileOutputStream2;
                    th = th;
                    nt9.a(fileOutputStream, TAG);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static void F(Bitmap bitmap, String str) throws Throwable {
        if (bitmap == null || TextUtils.isEmpty(str)) {
            ltl.b(TAG, "[saveBitmapToJpg] --> error, bitmap or localFilePath is null");
        } else {
            D(bitmap, Bitmap.CompressFormat.JPEG, str);
        }
    }

    public static void G(Bitmap bitmap, String str) throws Throwable {
        D(bitmap, Bitmap.CompressFormat.PNG, str);
    }

    public static void H(Bitmap bitmap, String str) throws Throwable {
        G(q(bitmap), str);
    }

    public static void I(Bitmap bitmap, String str) throws Throwable {
        if (bitmap == null || TextUtils.isEmpty(str)) {
            ltl.b(TAG, "[saveBitmapToBmp] --> error, bitmap or localFilePath is null");
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = height * width * 2;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    ltl.a(TAG, file.getAbsolutePath() + " mkdirs mkStatus = " + file.getParentFile().mkdirs() + " nfStatus = " + file.createNewFile());
                }
                byte[] bArr = new byte[i];
                int i2 = 0;
                for (int i3 = 0; i3 < height; i3++) {
                    for (int i4 = 0; i4 < width; i4++) {
                        int pixel = bitmap.getPixel(i4, i3);
                        if (Color.alpha(pixel) == 0) {
                            bArr[i2 + 1] = 0;
                            bArr[i2] = 0;
                        } else {
                            int iRed = Color.red(pixel);
                            int iGreen = Color.green(pixel);
                            int iBlue = Color.blue(pixel);
                            bArr[i2 + 1] = (byte) ((iRed & 248) | ((iGreen >> 5) & 7));
                            bArr[i2] = (byte) (((iBlue >> 3) & 31) | ((iGreen << 3) & oei.TAI_CHI));
                        }
                        i2 += 2;
                    }
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    nt9.a(fileOutputStream2, TAG);
                } catch (Exception e2) {
                    fileOutputStream = fileOutputStream2;
                    e = e2;
                    ltl.b(TAG, "[saveBitmapToBmp] --> error=" + e.getMessage());
                    nt9.a(fileOutputStream, TAG);
                } catch (Throwable th) {
                    fileOutputStream = fileOutputStream2;
                    th = th;
                    nt9.a(fileOutputStream, TAG);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static byte[] J(Bitmap bitmap) {
        if (bitmap == null) {
            ltl.i(TAG, " [toArray]  bitmap is null");
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        byte[] bArrArray = byteBufferAllocate.array();
        int length = bArrArray.length / 4;
        byte[] bArr = new byte[length * 3];
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            int i3 = i * 4;
            bArr[i2 + 2] = bArrArray[i3 + 2];
            bArr[i2 + 1] = bArrArray[i3 + 1];
            bArr[i2] = bArrArray[i3];
        }
        return bArr;
    }

    public static Bitmap K(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        ltl.a(TAG, "zoomImage newWidth " + i + " newHeight " + i2 + " width " + width + " height " + height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static void a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(13.0f);
        paint.setColor(-16777216);
        int i = width >> 1;
        float f = i;
        canvas.drawCircle(f, f, i - 1, paint);
        paint.setColor(Color.parseColor("#4C4C4C"));
        paint.setStrokeWidth(5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        canvas.drawCircle(f, f, i - 2, paint);
    }

    public static void b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(14.0f);
        paint.setColor(-16777216);
        int i = width >> 1;
        float f = i;
        canvas.drawCircle(f, f, i - 5, paint);
        paint.setStrokeWidth(4.0f);
        paint.setColor(Color.parseColor("#4C4C4C"));
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 4.0f}, 0.0f));
        canvas.drawCircle(f, f, i - 3, paint);
    }

    public static Bitmap c(String str, int i, int i2) {
        Bitmap bitmapI = i(str, k18.GL_BYTE);
        if (bitmapI == null) {
            ltl.i(TAG, "[adjustFdDegreeAndSize] bitmap compress failed ");
            return null;
        }
        int iW = w(str);
        ltl.a(TAG, "[adjustFdDegreeAndSize]  degree " + iW);
        return K(n(B(bitmapI, iW), i, i2), i, i2);
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2) {
        if (bitmap == null || bitmap.isRecycled()) {
            ltl.b("BitmapUtils", "[mergeBitmap] --> error");
            return null;
        }
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        ltl.a(TAG, "[adjustedBitmap] width " + width + " height " + height);
        if (height == i && width == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rect = new Rect(0, 0, i, i2);
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(rect, paint);
        int i3 = (int) ((i / width) * height);
        Bitmap bitmapK = K(bitmap, i, i3);
        int i4 = (i2 - i3) / 2;
        ltl.a(TAG, "[adjustedBitmap] screenWidth " + i + " screenHeight " + i2 + " scaleHeight " + i3);
        canvas.drawBitmap(bitmapK, new Rect(0, 0, i, i3), new Rect(0, i4, i, i3 + i4), (Paint) null);
        return bitmapCreateBitmap;
    }

    public static Drawable e(Bitmap bitmap) {
        return new BitmapDrawable(b78.a().getResources(), bitmap);
    }

    public static Bitmap f(Bitmap bitmap, String str) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(Color.parseColor(str), PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static Drawable g(Context context, @DrawableRes int i, int i2) {
        Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(context, i).mutate());
        DrawableCompat.setTintList(drawableWrap, ColorStateList.valueOf(i2));
        return drawableWrap;
    }

    public static Bitmap h(Bitmap bitmap) {
        if (bitmap == null) {
            ltl.i(TAG, "[circleBitmap] --> error, bitmap is null");
            return null;
        }
        int width = bitmap.getWidth();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float f = width / 2;
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap i(String str, int i) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = b78.a().getContentResolver().openFileDescriptor(Uri.parse(str), "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                if (parcelFileDescriptorOpenFileDescriptor.getStatSize() <= (i << 10)) {
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return bitmapDecodeFileDescriptor;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
                ltl.d(TAG, "width: " + options.outWidth + "height: " + options.outHeight);
                options.inSampleSize = j(options.outWidth, options.outHeight);
                options.inJustDecodeBounds = false;
                Bitmap bitmapDecodeFileDescriptor2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
                parcelFileDescriptorOpenFileDescriptor.close();
                return bitmapDecodeFileDescriptor2;
            } catch (Throwable th) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            ltl.d(TAG, "[compress] FileNotFoundException " + e2.getMessage());
            return null;
        }
    }

    public static int j(int i, int i2) {
        if (i % 2 == 1) {
            i++;
        }
        if (i2 % 2 == 1) {
            i2++;
        }
        int iMax = Math.max(i, i2);
        float fMin = Math.min(i, i2);
        float f = iMax;
        float f2 = fMin / f;
        if (f2 > 1.0f || f2 <= 0.5625d) {
            double d = f2;
            if (d > 0.5625d || d <= 0.5d) {
                return (int) Math.ceil(f / (1280.0f / f2));
            }
            int i3 = iMax / k18.GL_INVALID_ENUM;
            if (i3 == 0) {
                return 1;
            }
            return i3;
        }
        if (iMax < 1664) {
            return 1;
        }
        if (iMax >= 1664 && iMax < 4990) {
            return 2;
        }
        if (iMax <= 4990 || iMax >= 10240) {
            return iMax / k18.GL_INVALID_ENUM;
        }
        return 4;
    }

    public static Bitmap k(Context context, Uri uri) {
        Bitmap bitmapDecodeFileDescriptor = null;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                parcelFileDescriptorOpenFileDescriptor.close();
            }
        } catch (FileNotFoundException e2) {
            ltl.i(TAG, "[createBitmap]  FileNotFoundException e " + e2);
        } catch (IOException e3) {
            ltl.i(TAG, "[createBitmap] IOException  e " + e3);
        }
        return bitmapDecodeFileDescriptor != null ? B(bitmapDecodeFileDescriptor, z(uri)) : bitmapDecodeFileDescriptor;
    }

    public static ClipImageView.CropParams l(String str, int i, int i2) {
        float width;
        boolean z;
        int i3;
        Bitmap bitmapT = t(str);
        float f = i;
        float f2 = i2;
        int i4 = 0;
        if (bitmapT.getWidth() / bitmapT.getHeight() > f / f2) {
            width = bitmapT.getHeight() / f2;
            z = true;
        } else {
            width = bitmapT.getWidth() / f;
            z = false;
        }
        int iRound = Math.round(bitmapT.getWidth() / width);
        int iRound2 = Math.round(bitmapT.getHeight() / width);
        if (z) {
            i4 = (iRound - i) / 2;
            i3 = 0;
        } else {
            i3 = (iRound2 - i2) / 2;
        }
        ClipImageView.CropParams cropParams = new ClipImageView.CropParams();
        cropParams.previewWidth = iRound;
        cropParams.previewHeight = iRound2;
        cropParams.cropPreviewWidth = i;
        cropParams.cropPreviewHeight = i2;
        cropParams.cropLeft = i4;
        cropParams.cropTop = i3;
        return cropParams;
    }

    public static Bitmap m(Bitmap bitmap, int i, int i2) {
        return K(n(bitmap, i, i2), i, i2);
    }

    public static Bitmap n(Bitmap bitmap, int i, int i2) {
        int i3;
        int i4;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width / height > i / i2) {
            i4 = (i * height) / i2;
            i3 = height;
        } else {
            i3 = (i2 * width) / i;
            i4 = width;
        }
        return Bitmap.createBitmap(bitmap, width > i4 ? (width - i4) / 2 : 0, height > i3 ? (height - i3) / 2 : 0, i4, i3, (Matrix) null, false);
    }

    public static Bitmap o(Drawable drawable) {
        return p(drawable, Bitmap.Config.ARGB_8888);
    }

    public static Bitmap p(Drawable drawable, Bitmap.Config config) {
        if (drawable == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Bitmap q(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.hasAlpha() && bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            ltl.d(TAG, "ensureTransparentBitmap: bitmap already supports transparency");
            return bitmap;
        }
        boolean zHasAlpha = bitmap.hasAlpha();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        if (!zHasAlpha) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap r(Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = b78.a().getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
                ltl.d(TAG, "width: " + options.outWidth + "height: " + options.outHeight);
                options.inSampleSize = j(options.outWidth, options.outHeight);
                options.inJustDecodeBounds = false;
                Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
                parcelFileDescriptorOpenFileDescriptor.close();
                return bitmapDecodeFileDescriptor;
            } catch (Throwable th) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            ltl.d(TAG, "[compress] FileNotFoundException " + e2.getMessage());
            return null;
        }
    }

    public static Bitmap s(Uri uri) {
        ltl.a(TAG, "[getBitmapFromUri]  uri " + uri);
        Bitmap bitmapR = r(uri);
        if (bitmapR != null) {
            return B(bitmapR, z(uri));
        }
        ltl.i(TAG, "[adjustFdDegreeAndSize] bitmap compress failed ");
        return null;
    }

    public static Bitmap t(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        ltl.d(TAG, "width: " + options.outWidth + "height: " + options.outHeight);
        options.inSampleSize = j(options.outWidth, options.outHeight);
        options.inJustDecodeBounds = false;
        int iY = y(str);
        ltl.a(TAG, "[generateMergeRoundImage] degree " + iY);
        return B(BitmapFactory.decodeFile(str, options), iY);
    }

    public static Bitmap u(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) {
            ltl.b(TAG, "[mergeBitmap] --> error");
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(bitmapCopy);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), (Paint) null);
        return bitmapCopy;
    }

    public static Bitmap v(Context context, int i, int i2, int i3) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static int w(String str) {
        return z(Uri.parse(str));
    }

    public static int x(FileDescriptor fileDescriptor) {
        int i;
        try {
            int attributeInt = new ExifInterface(fileDescriptor).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            ltl.d(TAG, "[readPictureDegree] orientation " + attributeInt);
            if (attributeInt == 3) {
                i = 180;
            } else if (attributeInt == 6) {
                i = 90;
            } else {
                if (attributeInt != 8) {
                    return 0;
                }
                i = 270;
            }
            return i;
        } catch (IOException e2) {
            ltl.d(TAG, "[readPictureDegree] IOException " + e2.getMessage());
            return 0;
        }
    }

    public static int y(String str) {
        int i;
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            ltl.d(TAG, "[readPictureDegree] orientation " + attributeInt);
            if (attributeInt == 3) {
                i = 180;
            } else if (attributeInt == 6) {
                i = 90;
            } else {
                if (attributeInt != 8) {
                    return 0;
                }
                i = 270;
            }
            return i;
        } catch (IOException e2) {
            ltl.d(TAG, "[readPictureDegree] IOException " + e2.getMessage());
            return 0;
        }
    }

    public static int z(Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = b78.a().getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return 0;
            }
            try {
                int iX = x(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                parcelFileDescriptorOpenFileDescriptor.close();
                return iX;
            } catch (Throwable th) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            ltl.d(TAG, "[readDegreeFromUri] FileNotFoundException " + e2.getMessage());
            return 0;
        }
    }
}
