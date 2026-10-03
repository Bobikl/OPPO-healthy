package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.customer.feedback.sdk.util.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes10.dex */
public final class qwm {
    /* JADX WARN: Code duplicated, block: B:45:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef A[Catch: Exception -> 0x00eb, TRY_LEAVE, TryCatch #3 {Exception -> 0x00eb, blocks: (B:42:0x00e7, B:46:0x00ef), top: B:66:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0110 A[Catch: Exception -> 0x010c, TRY_LEAVE, TryCatch #2 {Exception -> 0x010c, blocks: (B:54:0x0108, B:58:0x0110), top: B:64:0x0108 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] a(String str, String str2) throws Throwable {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setReadTimeout(60000);
            httpsURLConnection.setConnectTimeout(60000);
            httpsURLConnection.setChunkedStreamingMode(0);
            httpsURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpsURLConnection.setRequestProperty("Charset", "UTF-8");
            httpsURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpsURLConnection.setRequestProperty("accept", "application/json");
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                byte[] bytes = str2.getBytes();
                httpsURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                outputStream.write(bytes);
                outputStream.flush();
                outputStream.close();
            }
            int responseCode = httpsURLConnection.getResponseCode();
            LogUtil.d("HttpMultipartRequest", "responseCode=" + responseCode);
            inputStream = (responseCode == 202 || responseCode == 201 || responseCode == 200) ? httpsURLConnection.getInputStream() : httpsURLConnection.getErrorStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i = inputStream.read();
                        if (i == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(i);
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            LogUtil.e("HttpMultipartRequest", "exceptionInfo：" + e);
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                } catch (Exception e3) {
                                    LogUtil.e("HttpMultipartRequest", "exceptionInfo：" + e3);
                                    return null;
                                }
                            } else if (inputStream != null) {
                                inputStream.close();
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                } catch (Exception e4) {
                                    LogUtil.e("HttpMultipartRequest", "exceptionInfo：" + e4);
                                    throw th;
                                }
                            } else if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } else if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                }
                httpsURLConnection.disconnect();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    inputStream.close();
                } catch (Exception e5) {
                    LogUtil.e("HttpMultipartRequest", "exceptionInfo：" + e5);
                }
                return byteArray;
            } catch (Exception e6) {
                e = e6;
                byteArrayOutputStream = null;
                LogUtil.e("HttpMultipartRequest", "exceptionInfo：" + e);
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } else if (inputStream != null) {
                    inputStream.close();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } else if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }
}
