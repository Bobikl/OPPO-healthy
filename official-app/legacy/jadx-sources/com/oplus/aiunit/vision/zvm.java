package com.oplus.aiunit.vision;

import com.customer.feedback.sdk.util.LogUtil;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes10.dex */
public final class zvm {
    public static String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                    } else {
                        try {
                            break;
                        } catch (Exception e2) {
                            LogUtil.e("BaseHelper", "exceptionInfo：" + e2);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        inputStream.close();
                    } catch (Exception e3) {
                        LogUtil.e("BaseHelper", "exceptionInfo：" + e3);
                    }
                    throw th;
                }
            } catch (Exception e4) {
                LogUtil.e("BaseHelper", "exceptionInfo：" + e4);
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    LogUtil.e("BaseHelper", "exceptionInfo：" + e5);
                }
            }
        }
        inputStream.close();
        return sb.toString();
    }
}
