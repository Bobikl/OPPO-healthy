package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.SSLSessionCache;
import com.heytap.unsafe.EmptyHostnameVerifier;
import com.heytap.unsafe.EmptyTrustManager;
import com.heytap.upgrade.exception.UpgradeException;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechErrorCode;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes19.dex */
public class unc {
    public static Pattern a = Pattern.compile("bytes (\\d+)\\-\\d+/(\\d+)");
    public static volatile SSLSessionCache b = null;
    public static TrustManager sSafeTrustManager = null;

    public static jkk a(String str, TreeMap<String, String> treeMap) throws IOException {
        HttpURLConnection httpURLConnectionB = null;
        try {
            try {
                httpURLConnectionB = b(str);
                httpURLConnectionB.setRequestMethod("GET");
                httpURLConnectionB.setDoInput(true);
                if (treeMap != null && treeMap.size() > 0) {
                    for (Map.Entry<String, String> entry : treeMap.entrySet()) {
                        httpURLConnectionB.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnectionB.connect();
                e6b.a("upgrade_NetUtil", "server content-length : " + httpURLConnectionB.getContentLength() + ", statusCode=" + httpURLConnectionB.getResponseCode());
                String str2 = new String(d(httpURLConnectionB.getInputStream()), "utf-8");
                jkk jkkVar = new jkk();
                jkkVar.d = httpURLConnectionB.getResponseCode();
                jkkVar.a = str2;
                try {
                    httpURLConnectionB.getInputStream().close();
                    httpURLConnectionB.disconnect();
                } catch (Exception e2) {
                    e6b.a("upgrade_NetUtil", "checkUpgrade failed : " + e2.getMessage());
                }
                return jkkVar;
            } catch (IOException e3) {
                e6b.a("upgrade_NetUtil", "checkUpgrade failed : " + e3.getMessage());
                throw e3;
            }
        } catch (Throwable th) {
            try {
                httpURLConnectionB.getInputStream().close();
                httpURLConnectionB.disconnect();
            } catch (Exception e4) {
                e6b.a("upgrade_NetUtil", "checkUpgrade failed : " + e4.getMessage());
            }
            throw th;
        }
    }

    public static synchronized HttpURLConnection b(String str) throws IOException {
        HttpURLConnection httpURLConnection;
        Throwable th;
        SecureRandom secureRandom;
        URL url = new URL(str);
        try {
            SecureRandom secureRandom2 = null;
            if (sSafeTrustManager == null) {
                if (p04.DEBUG) {
                    try {
                        sSafeTrustManager = new EmptyTrustManager();
                        HttpsURLConnection.setDefaultHostnameVerifier(new EmptyHostnameVerifier());
                        secureRandom = new SecureRandom();
                        try {
                            u6b.a("HttpURLConnection: use unsafe trust manager");
                        } catch (Throwable th2) {
                            th = th2;
                            u6b.a("HttpURLConnection: use unsafe trust manager exception:" + th.toString());
                            if (sSafeTrustManager == null) {
                                sSafeTrustManager = new jg4(j());
                            }
                            g();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        secureRandom = null;
                    }
                    secureRandom2 = secureRandom;
                } else {
                    sSafeTrustManager = new jg4(j());
                    g();
                }
            }
            HttpsURLConnection.setDefaultSSLSocketFactory(f(sSafeTrustManager, secureRandom2));
        } catch (Exception e2) {
            e6b.a("upgrade_NetUtil", "createUrlConnection failed : " + e2.getMessage());
        }
        httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        return httpURLConnection;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x02c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x02d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    public static void c(String str, String str2, String str3, File file, rp9 rp9Var) throws Throwable {
        HttpURLConnection httpURLConnectionB;
        Object obj;
        ?? r10;
        ?? r9;
        String name = file.getName();
        ?? r2 = 0;
        try {
            try {
                httpURLConnectionB = b(str2);
                try {
                    httpURLConnectionB.setRequestMethod("GET");
                    httpURLConnectionB.setDoInput(true);
                    httpURLConnectionB.setRequestProperty("RANGE", str3);
                    httpURLConnectionB.connect();
                    int responseCode = httpURLConnectionB.getResponseCode();
                    if (responseCode != 200 && responseCode != 206) {
                        u6b.b("upgrade_NetUtil", str + "," + name + " download response code error, responseCode : " + httpURLConnectionB.getResponseCode());
                        throw new UpgradeException(20003, "response code:" + httpURLConnectionB.getResponseCode());
                    }
                    if (httpURLConnectionB.getContentLength() <= 0) {
                        u6b.b("upgrade_NetUtil", str + "," + name + "download response length error, length : " + httpURLConnectionB.getContentLength());
                        throw new UpgradeException(20004, "content length:" + httpURLConnectionB.getContentLength());
                    }
                    long jE = e(httpURLConnectionB.getHeaderField("content-range"));
                    rp9Var.a(jE);
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        randomAccessFile.seek(jE);
                        u6b.a("fileName=" + name + ",rangeFrom=" + jE);
                        InputStream inputStream = httpURLConnectionB.getInputStream();
                        try {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                            try {
                                byte[] bArr = new byte[16384];
                                long j2 = 0;
                                while (true) {
                                    int i = bufferedInputStream.read(bArr);
                                    if (i == -1 || Thread.currentThread().isInterrupted() || w81.stopDownload) {
                                        break;
                                    }
                                    randomAccessFile.write(bArr, 0, i);
                                    j2 += (long) i;
                                    rp9Var.c(j2);
                                }
                                if (Thread.currentThread().isInterrupted()) {
                                    rp9Var.b();
                                } else {
                                    rp9Var.onComplete();
                                }
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e2) {
                                    e6b.a("upgrade_NetUtil", e2.getMessage());
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e3) {
                                        e6b.a("upgrade_NetUtil", e3.getMessage());
                                    }
                                }
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e4) {
                                    e6b.a("upgrade_NetUtil", e4.getMessage());
                                }
                                try {
                                    httpURLConnectionB.disconnect();
                                } catch (Exception e5) {
                                    e6b.a("upgrade_NetUtil", e5.getMessage());
                                }
                            } catch (UpgradeException e6) {
                            } catch (FileNotFoundException e7) {
                                e = e7;
                                throw new UpgradeException(20011, e);
                            } catch (ProtocolException e8) {
                                e = e8;
                                throw new UpgradeException(20014, e);
                            } catch (SocketException e9) {
                                e = e9;
                                throw new UpgradeException(20008, e);
                            } catch (SocketTimeoutException e10) {
                                e = e10;
                                throw new UpgradeException(20007, e);
                            } catch (UnknownHostException e11) {
                                e = e11;
                                throw new UpgradeException(20010, e);
                            } catch (ConnectTimeoutException e12) {
                                e = e12;
                                throw new UpgradeException(SpeechErrorCode.ERROR_EMPTY_UTTERANCE, e);
                            } catch (IOException e13) {
                                e = e13;
                                throw new UpgradeException(SpeechErrorCode.ERROR_LOGIN, e);
                            } catch (Throwable th) {
                                r2 = randomAccessFile;
                                th = th;
                                r9 = inputStream;
                                r10 = bufferedInputStream;
                                if (r2 != 0) {
                                    try {
                                        r2.close();
                                    } catch (IOException e14) {
                                        e6b.a("upgrade_NetUtil", e14.getMessage());
                                    }
                                }
                                if (r9 != 0) {
                                    try {
                                        r9.close();
                                    } catch (IOException e15) {
                                        e6b.a("upgrade_NetUtil", e15.getMessage());
                                    }
                                }
                                if (r10 != 0) {
                                    try {
                                        r10.close();
                                    } catch (IOException e16) {
                                        e6b.a("upgrade_NetUtil", e16.getMessage());
                                    }
                                }
                                try {
                                    httpURLConnectionB.disconnect();
                                    throw th;
                                } catch (Exception e17) {
                                    e6b.a("upgrade_NetUtil", e17.getMessage());
                                    throw th;
                                }
                            }
                        } catch (UpgradeException e18) {
                        } catch (FileNotFoundException e19) {
                            e = e19;
                        } catch (ProtocolException e20) {
                            e = e20;
                        } catch (SocketException e21) {
                            e = e21;
                        } catch (SocketTimeoutException e22) {
                            e = e22;
                        } catch (UnknownHostException e23) {
                            e = e23;
                        } catch (ConnectTimeoutException e24) {
                            e = e24;
                        } catch (IOException e25) {
                            e = e25;
                        } catch (Throwable th2) {
                            r2 = randomAccessFile;
                            th = th2;
                            r10 = 0;
                            r9 = inputStream;
                        }
                    } catch (UpgradeException e26) {
                    } catch (FileNotFoundException e27) {
                        e = e27;
                    } catch (ProtocolException e28) {
                        e = e28;
                    } catch (SocketException e29) {
                        e = e29;
                    } catch (SocketTimeoutException e30) {
                        e = e30;
                    } catch (UnknownHostException e31) {
                        e = e31;
                    } catch (ConnectTimeoutException e32) {
                        e = e32;
                    } catch (IOException e33) {
                        e = e33;
                    } catch (Throwable th3) {
                        r10 = 0;
                        r2 = randomAccessFile;
                        th = th3;
                        r9 = 0;
                    }
                } catch (UpgradeException e34) {
                } catch (FileNotFoundException e35) {
                    e = e35;
                } catch (ProtocolException e36) {
                    e = e36;
                } catch (SocketException e37) {
                    e = e37;
                } catch (SocketTimeoutException e38) {
                    e = e38;
                } catch (UnknownHostException e39) {
                    e = e39;
                } catch (ConnectTimeoutException e40) {
                    e = e40;
                } catch (IOException e41) {
                    e = e41;
                } catch (Throwable th4) {
                    th = th4;
                    obj = null;
                    r10 = obj;
                    r9 = obj;
                    if (r2 != 0) {
                        r2.close();
                    }
                    if (r9 != 0) {
                        r9.close();
                    }
                    if (r10 != 0) {
                        r10.close();
                    }
                    httpURLConnectionB.disconnect();
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                r2 = str2;
                httpURLConnectionB = null;
                r9 = str3;
                r10 = file;
            }
        } catch (UpgradeException e42) {
            throw e42;
        } catch (FileNotFoundException e43) {
            e = e43;
        } catch (ProtocolException e44) {
            e = e44;
        } catch (SocketException e45) {
            e = e45;
        } catch (SocketTimeoutException e46) {
            e = e46;
        } catch (UnknownHostException e47) {
            e = e47;
        } catch (ConnectTimeoutException e48) {
            e = e48;
        } catch (IOException e49) {
            e = e49;
        } catch (Throwable th6) {
            th = th6;
            httpURLConnectionB = null;
            obj = null;
        }
    }

    public static byte[] d(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int i = 0;
        while (i != -1) {
            try {
                i = inputStream.read(bArr);
            } catch (IOException e2) {
                e6b.a("upgrade_NetUtil", "getByteByStream failed : " + e2.getMessage());
                i = -1;
            }
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e3) {
                e6b.a("upgrade_NetUtil", "getByteByStream failed : " + e3.getMessage());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static long e(String str) {
        e6b.a("upgrade_NetUtil", "server content-range : " + str);
        if (str == null || str.equals("")) {
            e6b.a("upgrade_NetUtil", "do not support range, download from head!");
            return 0L;
        }
        Matcher matcher = a.matcher(str);
        if (!matcher.matches()) {
            e6b.a("upgrade_NetUtil", "do not support range, download from head!");
            return 0L;
        }
        try {
            return Long.valueOf(matcher.group(1)).longValue();
        } catch (Throwable th) {
            e6b.a("upgrade_NetUtil", "parse download pos error : " + th);
            return 0L;
        }
    }

    public static SSLSocketFactory f(TrustManager trustManager, SecureRandom secureRandom) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{trustManager}, secureRandom);
            h(sSLContext);
            return sSLContext.getSocketFactory();
        } catch (Exception e2) {
            e6b.a("upgrade_NetUtil", "getSocketFactory failed : " + e2.getMessage());
            return null;
        }
    }

    public static void g() {
        Context contextB;
        if (b == null && (contextB = rqk.b()) != null) {
            b = new SSLSessionCache(contextB);
        }
    }

    public static void h(SSLContext sSLContext) {
        sSLContext.getClientSessionContext().setSessionCacheSize(0);
        sSLContext.getClientSessionContext().setSessionTimeout(604800);
        if (b != null) {
            try {
                SSLSessionCache.class.getMethod("install", SSLSessionCache.class, SSLContext.class).invoke(null, b, sSLContext);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean i(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            e6b.a(p04.TAG, "context is null");
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting() && activeNetworkInfo.isAvailable();
    }

    public static X509TrustManager j() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }
}
