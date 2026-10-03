package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.webview.extension.protocol.Const;
import io.protostuff.MapSchema;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Triple;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J0\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006J0\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0010H\u0002¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/e5a;", "", "Landroid/graphics/Bitmap;", "originalBitmap", "", "outputPath", "", "targetSize", "", "b", "filePath", "c", "Ljava/io/File;", Const.Scheme.SCHEME_FILE, "outputFile", "Lkotlin/Triple;", "", "a", "srcBmp", "targetWidth", "targetHeight", "Ljava/io/ByteArrayOutputStream;", "baos", "quality", MapSchema.FIELD_NAME_ENTRY, "source", "d", "path", "f", "bmp", "degrees", b2n.f, "<init>", "()V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class e5a {

    @NotNull
    public static final e5a INSTANCE = new e5a();

    @NotNull
    public final Triple<Boolean, Integer, Integer> a(@NotNull File file, @NotNull File outputFile, long targetSize) throws Throwable {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
        int iF = f(absolutePath);
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        Bitmap bitmapD = d(g(bitmap, iF));
        int width = bitmapD.getWidth();
        int height = bitmapD.getHeight();
        if (file.length() > targetSize) {
            int width2 = bitmapD.getWidth() / 2;
            int height2 = bitmapD.getHeight() / 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap bitmapE = e(bitmapD, width2, height2, byteArrayOutputStream, 100);
            Bitmap bitmapE2 = bitmapE;
            for (int i = 0; byteArrayOutputStream.size() > targetSize && i <= 10; i++) {
                width2 /= 2;
                height2 /= 2;
                byteArrayOutputStream.reset();
                bitmapE2 = e(bitmapE2, width2, height2, byteArrayOutputStream, 100);
            }
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(outputFile);
                    try {
                        fileOutputStream2.write(byteArrayOutputStream.toByteArray());
                        fileOutputStream2.flush();
                        width = bitmapE2.getWidth();
                        height = bitmapE2.getHeight();
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e2) {
                            a7b.c("CommunityImageUtil", "compressBmpFileToTargetSize close stream error", e2);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream = fileOutputStream2;
                        a7b.c("CommunityImageUtil", "compressBmpFileToTargetSize error. file=" + file.getAbsolutePath(), e);
                        Triple<Boolean, Integer, Integer> triple = new Triple<>(Boolean.FALSE, -1, -1);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e4) {
                                a7b.c("CommunityImageUtil", "compressBmpFileToTargetSize close stream error", e4);
                            }
                        }
                        return triple;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        Throwable th2 = th;
                        if (fileOutputStream == null) {
                            throw th2;
                        }
                        try {
                            fileOutputStream.close();
                            throw th2;
                        } catch (Exception e5) {
                            a7b.c("CommunityImageUtil", "compressBmpFileToTargetSize close stream error", e5);
                            throw th2;
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                bitmapD.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                FileOutputStream fileOutputStream3 = new FileOutputStream(outputFile);
                fileOutputStream3.write(byteArray);
                fileOutputStream3.flush();
                fileOutputStream3.close();
            } catch (Exception e7) {
                a7b.c("CommunityImageUtil", "compressBmpFileToTargetSize copy file error", e7);
                return new Triple<>(Boolean.FALSE, -1, -1);
            }
        }
        a7b.f("CommunityImageUtil", "compressBmpFileToTargetSize cost time=" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return new Triple<>(true, Integer.valueOf(width), Integer.valueOf(height));
    }

    public final boolean b(@NotNull Bitmap originalBitmap, @NotNull String outputPath, long targetSize) throws IOException {
        Intrinsics.checkNotNullParameter(originalBitmap, "originalBitmap");
        Intrinsics.checkNotNullParameter(outputPath, "outputPath");
        File file = new File(outputPath);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdir();
            }
            file.createNewFile();
        }
        for (int i = 100; i > 0; i -= 5) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            originalBitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray.length <= targetSize) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(outputPath);
                    fileOutputStream.write(byteArray);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return true;
                } catch (IOException e2) {
                    a7b.c("CommunityImageUtil", "compressImageToTargetSize error.", e2);
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean c(@NotNull String filePath, @NotNull String outputPath, long targetSize) throws IOException {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(outputPath, "outputPath");
        File file = new File(outputPath);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdir();
            }
            file.createNewFile();
        }
        Bitmap originalBitmap = BitmapFactory.decodeFile(filePath);
        int iF = f(filePath);
        Intrinsics.checkNotNullExpressionValue(originalBitmap, "originalBitmap");
        Bitmap bitmapG = g(originalBitmap, iF);
        for (int i = 100; i > 0; i -= 5) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapG.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray.length <= targetSize) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(outputPath);
                    fileOutputStream.write(byteArray);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return true;
                } catch (IOException e2) {
                    a7b.c("CommunityImageUtil", "compressImageToTargetSize error.", e2);
                    return false;
                }
            }
        }
        return false;
    }

    public final Bitmap d(Bitmap source) {
        int i;
        int i2;
        int width = source.getWidth();
        int height = source.getHeight();
        float f = width;
        float f2 = height;
        float f3 = f / f2;
        if (f3 <= 1.3333334f) {
            if (f3 < 0.75f) {
                i = (int) (f / 0.75f);
                i2 = width;
            }
            return source;
        }
        i2 = (int) (f2 * 1.3333334f);
        i = height;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(source, (width - i2) / 2, (height - i) / 2, i2, i);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(source, sta…rtY, newWidth, newHeight)");
            return bitmapCreateBitmap;
        } catch (Exception e2) {
            a7b.c("CommunityImageUtil", "cropToAspectRatio createBitmap error. ", e2);
        }
    }

    public final Bitmap e(Bitmap srcBmp, int targetWidth, int targetHeight, ByteArrayOutputStream baos, int quality) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(targetWidth, targetHeight, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(targetWidth… Bitmap.Config.ARGB_8888)");
        new Canvas(bitmapCreateBitmap).drawBitmap(srcBmp, (Rect) null, new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), (Paint) null);
        if (!srcBmp.isRecycled()) {
            srcBmp.recycle();
        }
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, quality, baos);
        return bitmapCreateBitmap;
    }

    public final int f(String path) {
        try {
            int attributeInt = new ExifInterface(path).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e2) {
            a7b.b("CommunityImageUtil", "readDegreeFromPath IOException: " + e2.getMessage());
            return 0;
        }
    }

    public final Bitmap g(Bitmap bmp, int degrees) {
        if (degrees == 0) {
            return bmp;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(degrees);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bmp, 0, 0, bmp.getWidth(), bmp.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(bmp, 0, 0, …bmp.height, matrix, true)");
        return bitmapCreateBitmap;
    }
}
