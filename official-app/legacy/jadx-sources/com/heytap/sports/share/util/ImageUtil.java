package com.heytap.sports.share.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cloud.sdk.cloudstorage.http.FileSyncModel;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.health.base.R$string;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.gqf;
import com.oplus.aiunit.vision.l8c;
import com.oplus.aiunit.vision.o8c;
import com.oplus.aiunit.vision.yf4;
import com.support.dialog.R$style;
import io.protostuff.MapSchema;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001b\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eJ\u001e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017J \u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0002J0\u0010&\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0013H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/heytap/sports/share/util/ImageUtil;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "savePath", "", "f", "Ljava/io/File;", "imageFile", b2n.f, "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Const.Scheme.SCHEME_FILE, "outputFile", "", "targetSize", "", "b", "path", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroidx/appcompat/app/AlertDialog;", "d", "Landroid/graphics/BitmapFactory$Options;", "options", "reqWidth", "reqHeight", "a", "srcBmp", "targetWidth", "targetHeight", "Ljava/io/ByteArrayOutputStream;", "baos", "quality", "c", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ImageUtil {
    public static final int $stable = 0;

    @NotNull
    public static final ImageUtil INSTANCE = new ImageUtil();

    public final int a(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        int i3 = 1;
        if (i > reqHeight || i2 > reqWidth) {
            int i4 = i / 2;
            int i5 = i2 / 2;
            while (i4 / i3 >= reqHeight && i5 / i3 >= reqWidth) {
                i3 *= 2;
            }
        }
        return i3;
    }

    /* JADX INFO: Removed unreachable split cross block B:41:0x00bf */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v23 */
    public final void b(@NotNull File file, @NotNull File outputFile, long targetSize) throws Throwable {
        Throwable th;
        ?? r2;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (file.length() > targetSize) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            int i = options.outWidth / 2;
            int i2 = options.outHeight / 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
            Bitmap bitmapC = c(bitmap, i, i2, byteArrayOutputStream, 100);
            int i3 = 0;
            Bitmap bitmapC2 = bitmapC;
            while (byteArrayOutputStream.size() > targetSize && i3 <= 10) {
                i /= 2;
                i2 /= 2;
                i3++;
                byteArrayOutputStream.reset();
                bitmapC2 = c(bitmapC2, i, i2, byteArrayOutputStream, 100);
            }
            Object obj = null;
            obj = null;
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(outputFile);
                        try {
                            fileOutputStream2.write(byteArrayOutputStream.toByteArray());
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            a7b.c("ShareImageUtil", "compressBmpFileToTargetSize error. file=" + file.getAbsolutePath(), e);
                            obj = fileOutputStream;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                                obj = fileOutputStream;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = fileOutputStream2;
                            if (r2 == 0) {
                                throw th;
                            }
                            try {
                                r2.close();
                                throw th;
                            } catch (Exception e3) {
                                a7b.c("ShareImageUtil", "compressBmpFileToTargetSize close stream error", e3);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r2 = obj;
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Exception e5) {
                Exception exc = e5;
                a7b.c("ShareImageUtil", "compressBmpFileToTargetSize close stream error", exc);
                obj = exc;
            }
        }
        a7b.f("ShareImageUtil", "compressBmpFileToTargetSize cost time=" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public final Bitmap c(Bitmap srcBmp, int targetWidth, int targetHeight, ByteArrayOutputStream baos, int quality) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(targetWidth, targetHeight, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(targetWidth… Bitmap.Config.ARGB_8888)");
        new Canvas(bitmapCreateBitmap).drawBitmap(srcBmp, (Rect) null, new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), (Paint) null);
        if (!srcBmp.isRecycled()) {
            srcBmp.recycle();
        }
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, quality, baos);
        return bitmapCreateBitmap;
    }

    @NotNull
    public final AlertDialog d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AlertDialog alertDialogShow = new COUIAlertDialogBuilder(context, R$style.COUIAlertDialog_Rotating).setCancelable(false).setTitle(R$string.lib_base_network_loading).show();
        Intrinsics.checkNotNullExpressionValue(alertDialogShow, "COUIAlertDialogBuilder(\n…ding)\n            .show()");
        return alertDialogShow;
    }

    @NotNull
    public final Bitmap e(@NotNull String path, int width, int height) {
        Intrinsics.checkNotNullParameter(path, "path");
        long jCurrentTimeMillis = System.currentTimeMillis();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        options.inSampleSize = a(options, width, height);
        options.inJustDecodeBounds = false;
        Bitmap bitmap = BitmapFactory.decodeFile(path, options);
        a7b.f("ShareImageUtil", "sampleBitmap cost time=" + (System.currentTimeMillis() - jCurrentTimeMillis));
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        return bitmap;
    }

    public final boolean f(@Nullable Bitmap bitmap, @NotNull String savePath) throws Throwable {
        Intrinsics.checkNotNullParameter(savePath, "savePath");
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (bitmap == null || TextUtils.isEmpty(savePath)) {
            a7b.b("ShareImageUtil", "saveBitmap error, bitmap=" + bitmap + " savePath=" + savePath);
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(savePath);
                if (!file.exists()) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    try {
                        fileOutputStream2.close();
                    } catch (Exception e2) {
                        a7b.b("ShareImageUtil", "[saveBitmap] 2 " + e2.getMessage());
                    }
                    z = true;
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream2;
                    a7b.b("ShareImageUtil", "[saveBitmap]IOException " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e4) {
                            a7b.b("ShareImageUtil", "[saveBitmap] 2 " + e4.getMessage());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e5) {
                            a7b.b("ShareImageUtil", "[saveBitmap] 2 " + e5.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            }
            a7b.f("ShareImageUtil", "saveBitmap cost time=" + (System.currentTimeMillis() - jCurrentTimeMillis));
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object g(@NotNull File file, @NotNull Continuation<? super Boolean> continuation) {
        ImageUtil$uploadImageReview$1 imageUtil$uploadImageReview$1;
        boolean zIsSuccess;
        if (continuation instanceof ImageUtil$uploadImageReview$1) {
            imageUtil$uploadImageReview$1 = (ImageUtil$uploadImageReview$1) continuation;
            int i = imageUtil$uploadImageReview$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                imageUtil$uploadImageReview$1.label = i - Integer.MIN_VALUE;
            } else {
                imageUtil$uploadImageReview$1 = new ImageUtil$uploadImageReview$1(this, continuation);
            }
        } else {
            imageUtil$uploadImageReview$1 = new ImageUtil$uploadImageReview$1(this, continuation);
        }
        Object objA = imageUtil$uploadImageReview$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = imageUtil$uploadImageReview$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objA);
                l8c.a aVarD = new l8c.a().d(o8c.FORM);
                gqf gqfVarC = gqf.INSTANCE.c(MediaType.INSTANCE.a(FileSyncModel.streamMime), file);
                aVarD.a(LogSenderConst.FILENAME, file.getName());
                aVarD.b(Const.Scheme.SCHEME_FILE, file.getName(), gqfVarC);
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                aVarD.a("clientFileId", StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null));
                aVarD.a(Fields.FILE_TYPE, "4");
                aVarD.a("fileSource", "1");
                aVarD.a("version", "1");
                l8c build = aVarD.c();
                yf4 yf4Var = (yf4) a.j(yf4.class);
                Intrinsics.checkNotNullExpressionValue(build, "build");
                imageUtil$uploadImageReview$1.label = 1;
                objA = yf4Var.a(build, imageUtil$uploadImageReview$1);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
            zIsSuccess = ((BaseResponse) objA).isSuccess();
        } catch (Exception e2) {
            a7b.b("ShareImageUtil", "uploadImageReview error. e=" + e2);
            zIsSuccess = false;
        }
        return Boxing.boxBoolean(zIsSuccess);
    }
}
