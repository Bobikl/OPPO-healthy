package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.bandface.widget.ucrop.MinBitmapLoadTask;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
public class u22 {
    public static final String TAG = "BpUtil";
    public static final Executor a = yq8.a();

    public static String a(byte[] bArr) {
        try {
            return Base64.encodeToString(bArr, 2);
        } catch (Exception e2) {
            kw0.b(TAG, "[base64]Exception  e" + e2.getMessage());
            return null;
        }
    }

    public static String b(Uri uri, jie jieVar, Activity activity) {
        return c(f(j(uri, jieVar, activity), jieVar));
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return a(bArr);
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = Environment.getExternalStorageDirectory().getPath();
        }
        return str + "/" + System.currentTimeMillis() + "_" + new Random().nextInt(10000) + ".bmp";
    }

    public static Bitmap e(Uri uri, jie jieVar, Activity activity) {
        return g(f(j(uri, jieVar, activity), jieVar));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] f(Bitmap bitmap, jie jieVar) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (jieVar == null || bitmap == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (jieVar.a() == 1) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                    } else if (jieVar.a() == 2) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    }
                    bitmap.compress(compressFormat, jieVar.b(), byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        kw0.b(TAG, "catch IOException = " + e2.getMessage());
                    }
                    return byteArray;
                } catch (Exception e3) {
                    e = e3;
                    kw0.b(TAG, "catch exception = " + e.getMessage());
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e4) {
                            kw0.b(TAG, "catch IOException = " + e4.getMessage());
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (IOException e5) {
                        kw0.b(TAG, "catch IOException = " + e5.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            throw th;
        }
    }

    public static Bitmap g(byte[] bArr) {
        try {
            return BitmapFactory.decodeStream(new ByteArrayInputStream(bArr), null, null);
        } catch (Exception e2) {
            kw0.b(TAG, "catch exception = " + e2.getMessage());
            return null;
        }
    }

    public static File h(String str) {
        File parentFile;
        File file = new File(str);
        if (!file.exists() && (parentFile = file.getParentFile()) != null) {
            parentFile.mkdirs();
        }
        return file;
    }

    public static void i(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i, int i2, BitmapLoadCallback bitmapLoadCallback) {
        new MinBitmapLoadTask(context, uri, uri2, i, i2, bitmapLoadCallback).executeOnExecutor(a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Bitmap j(Uri uri, jie jieVar, Activity activity) throws Throwable {
        InputStream inputStream;
        StringBuilder sb;
        InputStream inputStream2 = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        Bitmap bitmapDecodeStream = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            if (jieVar == null || jieVar.a() != 0) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            } else {
                options.inPreferredConfig = Bitmap.Config.RGB_565;
            }
            InputStream inputStreamOpenInputStream = activity.getContentResolver().openInputStream(uri);
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Exception e2) {
                        e = e2;
                        sb = new StringBuilder();
                        sb.append("[decodeUriAsBitmap] Exception  e");
                        sb.append(e.getMessage());
                        kw0.b(TAG, sb.toString());
                    }
                }
            } catch (Exception e3) {
                inputStream = inputStreamOpenInputStream;
                e = e3;
                try {
                    kw0.b(TAG, "catch exception = " + e.getMessage());
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e4) {
                            e = e4;
                            sb = new StringBuilder();
                            sb.append("[decodeUriAsBitmap] Exception  e");
                            sb.append(e.getMessage());
                            kw0.b(TAG, sb.toString());
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Exception e5) {
                            kw0.b(TAG, "[decodeUriAsBitmap] Exception  e" + e5.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                inputStream2 = inputStreamOpenInputStream;
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
        return bitmapDecodeStream;
    }

    public static String k(String str) {
        if (TextUtils.isEmpty(str)) {
            str = Environment.getExternalStorageDirectory().getPath();
        }
        return str + "/" + System.currentTimeMillis() + "_" + new Random().nextInt(10000) + ".jpg";
    }

    public static Uri l(Bitmap bitmap, String str) {
        if (bitmap == null || TextUtils.isEmpty(str)) {
            kw0.b(TAG, "saveBmp bitmap and filename must not be null");
            return null;
        }
        kw0.a(TAG, "fileName = " + str);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        kw0.a(TAG, "size=" + width + ";" + height);
        int i = height * width * 2;
        try {
            File fileH = h(str);
            byte[] bArr = new byte[i];
            int i2 = 0;
            for (int i3 = 0; i3 < height; i3++) {
                for (int i4 = 0; i4 < width; i4++) {
                    int pixel = bitmap.getPixel(i4, i3);
                    int iRed = Color.red(pixel);
                    int iGreen = Color.green(pixel);
                    int iBlue = Color.blue(pixel);
                    bArr[i2] = (byte) ((iRed & 248) | ((iGreen >> 5) & 7));
                    bArr[i2 + 1] = (byte) (((iBlue >> 3) & 31) | ((iGreen << 3) & oei.TAI_CHI));
                    i2 += 2;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(fileH);
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e2) {
            kw0.b(TAG, "[saveBmp]Exception  e" + e2.getMessage());
        }
        return Uri.parse(str);
    }

    public static Uri m(Uri uri, Activity activity) {
        return l(j(uri, new jie(), activity), d(ld7.BAND_DIAL_BMP));
    }
}
