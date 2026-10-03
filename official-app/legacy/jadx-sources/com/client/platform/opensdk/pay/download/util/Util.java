package com.client.platform.opensdk.pay.download.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class Util {
    public static String Utf8URLencode(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 0 || cCharAt > 255) {
                byte[] bytes = new byte[0];
                try {
                    bytes = Character.toString(cCharAt).getBytes("UTF-8");
                } catch (Exception unused) {
                }
                for (int i2 : bytes) {
                    if (i2 < 0) {
                        i2 += 256;
                    }
                    stringBuffer.append("%" + Integer.toHexString(i2).toUpperCase());
                }
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }

    public static String getDownloadPath(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir());
        String str = File.separator;
        sb.append(str);
        sb.append("app");
        sb.append(str);
        sb.append("temp.apk");
        String string = sb.toString();
        File file = new File(context.getFilesDir() + str + "app");
        if (!file.exists()) {
            file.mkdirs();
        }
        return string;
    }

    public static String getPackageName(Context context) {
        return context.getPackageName();
    }

    public static void installPayApk(Context context) {
        File file = new File(getDownloadPath(context));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileProvider", file);
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        context.startActivity(intent);
    }

    public static void shortToast(Context context, int i) {
        Toast.makeText(context, context.getString(i), 0).show();
    }
}
