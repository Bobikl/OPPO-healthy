package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class oi {
    public static String TEMP_FILE = "temp.jpg";

    public static void a(Context context, Uri uri, File file) throws IOException {
        bn.f("AcPhotoPathUtil", "copyUriToFile " + file);
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (inputStreamOpenInputStream == null) {
                    throw new IOException("Cannot open input stream from URI: " + uri);
                }
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStreamOpenInputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public static String b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getExternalCacheDir());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(wrf.DEFAULT_IMAGES_DIR_NAME);
        sb.append(str2);
        sb.append(str);
        String string = sb.toString();
        bn.f("AcPhotoPathUtil", "getAppCacheFilePath temp " + string);
        return string;
    }

    public static Intent c(Context context, Uri uri, boolean z) {
        Intent intent = z ? new Intent("com.android.camera.action.CROP") : new Intent("android.intent.action.PICK", (Uri) null);
        intent.setDataAndType(uri, "image/*");
        intent.addFlags(1);
        intent.addFlags(2);
        intent.putExtra("crop", SpeechConstant.TRUE_STR);
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", 960);
        intent.putExtra("outputY", 960);
        intent.putExtra("scale", true);
        intent.putExtra("output", uri);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            context.grantUriPermission(it.next().activityInfo.packageName, uri, 3);
        }
        return intent;
    }

    public static File d(Context context) {
        File file = new File(b(context, TEMP_FILE));
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }
        return file;
    }

    public static Uri e(Context context) {
        return f(context, b(context, TEMP_FILE));
    }

    public static Uri f(Context context, String str) {
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }
        return FileProvider.getUriForFile(context, context.getPackageName() + ".ac_open_verify_sys_fileprovider", file);
    }

    public static boolean g(@Nullable String str) {
        if (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) {
            return false;
        }
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            str = str.substring(0, iIndexOf2);
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".bmp") || lowerCase.endsWith(".webp");
    }
}
