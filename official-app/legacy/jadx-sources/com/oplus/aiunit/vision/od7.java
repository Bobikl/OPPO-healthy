package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes2.dex */
public class od7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.BufferedReader, java.io.Closeable] */
    public static String a(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        ?? bufferedReader;
        SdkDebugLog.d(ld7.TAG, "[readFile] pathName = " + str + " fileName = " + str2);
        ?? r2 = 0;
        r2 = 0;
        r2 = 0;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            SdkDebugLog.d(ld7.TAG, "[readFile] !pkgDir.exists return");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            File file2 = new File(file, str2);
            if (!file2.exists()) {
                lt9.a(null, ld7.TAG);
                lt9.a(null, ld7.TAG);
                lt9.a(null, ld7.TAG);
                return null;
            }
            fileInputStream = new FileInputStream(file2);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    String string = sb.toString();
                                    SdkDebugLog.d(ld7.TAG, "[readFile] --> str " + string);
                                    lt9.a(bufferedReader, ld7.TAG);
                                    lt9.a(inputStreamReader, ld7.TAG);
                                    lt9.a(fileInputStream, ld7.TAG);
                                    return string;
                                }
                                sb.append(line);
                            } catch (IOException e2) {
                                e = e2;
                                SdkDebugLog.e(ld7.TAG, "[readFile] --> " + e.getMessage());
                                lt9.a(bufferedReader, ld7.TAG);
                                lt9.a(inputStreamReader, ld7.TAG);
                                lt9.a(fileInputStream, ld7.TAG);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r2 = bufferedReader;
                        }
                        th = th;
                        r2 = bufferedReader;
                        lt9.a(r2, ld7.TAG);
                        lt9.a(inputStreamReader, ld7.TAG);
                        lt9.a(fileInputStream, ld7.TAG);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    bufferedReader = 0;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e4) {
                e = e4;
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (IOException e5) {
            e = e5;
            fileInputStream = null;
            inputStreamReader = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            inputStreamReader = null;
        }
        bufferedReader = inputStreamReader;
        SdkDebugLog.e(ld7.TAG, "[readFile] --> " + e.getMessage());
        lt9.a(bufferedReader, ld7.TAG);
        lt9.a(inputStreamReader, ld7.TAG);
        lt9.a(fileInputStream, ld7.TAG);
        return null;
    }
}
