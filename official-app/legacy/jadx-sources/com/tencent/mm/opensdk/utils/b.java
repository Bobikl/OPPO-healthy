package com.tencent.mm.opensdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static Context a;
    public static ThreadPoolExecutor b = new ThreadPoolExecutor(5, 9, 1, TimeUnit.SECONDS, new LinkedBlockingDeque());

    public static int a(ContentResolver contentResolver, Uri uri) {
        Log.i("MicroMsg.SDK.Util", "getFileSize with content url");
        if (contentResolver == null || uri == null) {
            Log.w("MicroMsg.SDK.Util", "getFileSize fail, resolver or uri is null");
            return 0;
        }
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e2) {
                            Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e2.getMessage());
                        }
                    }
                    return 0;
                }
                int iAvailable = inputStreamOpenInputStream.available();
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e3) {
                    Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e3.getMessage());
                }
                return iAvailable;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e4.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            Log.w("MicroMsg.SDK.Util", "getFileSize fail, " + e5.getMessage());
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    Log.e("MicroMsg.SDK.Util", "getFileSize exception: " + e6.getMessage());
                }
            }
            return 0;
        }
    }

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }

    public static int a(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return (int) file.length();
        }
        if (a != null && str.startsWith("content")) {
            try {
                return a(a.getContentResolver(), Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static int a(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return str.length() <= 0 ? i : Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static boolean a(int i) {
        return i == 36 || i == 46;
    }
}
