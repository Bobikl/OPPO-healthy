package com.tencent.open.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.ar9;
import com.oplus.aiunit.vision.dzm;
import com.oplus.aiunit.vision.iw9;
import com.oplus.aiunit.vision.jcm;
import com.oplus.aiunit.vision.p4f;
import com.oplus.aiunit.vision.q8g;
import com.oplus.aiunit.vision.rxm;
import com.oplus.aiunit.vision.tpm;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.NotActiveException;
import java.io.NotSerializableException;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.SyncFailedException;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import java.io.WriteAbortedException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileLockInterruptionException;
import java.nio.charset.MalformedInputException;
import java.nio.charset.UnmappableCharacterException;
import java.util.InvalidPropertiesFormatException;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import org.apache.http.ConnectionClosedException;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HttpUtils {

    public static class HttpStatusException extends Exception {
        public static final String ERROR_INFO = "http status code error:";

        public HttpStatusException(String str) {
            super(str);
        }
    }

    public static class NetworkUnavailableException extends Exception {
        public static final String ERROR_INFO = "network unavailable";

        public NetworkUnavailableException(String str) {
            super(str);
        }
    }

    public static class a extends Thread {
        public final /* synthetic */ p4f i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f20312j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Bundle f20313l;
        public final /* synthetic */ String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ iw9 f20314n;

        public a(p4f p4fVar, Context context, String str, Bundle bundle, String str2, iw9 iw9Var) {
            this.i = p4fVar;
            this.f20312j = context;
            this.k = str;
            this.f20313l = bundle;
            this.m = str2;
            this.f20314n = iw9Var;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObjectK = HttpUtils.k(this.i, this.f20312j, this.k, this.f20313l, this.m);
                iw9 iw9Var = this.f20314n;
                if (iw9Var != null) {
                    iw9Var.e(jSONObjectK);
                    q8g.i("openSDK_LOG.HttpUtils", "OpenApi onComplete");
                }
            } catch (HttpStatusException e2) {
                iw9 iw9Var2 = this.f20314n;
                if (iw9Var2 != null) {
                    iw9Var2.g(e2);
                    q8g.f("openSDK_LOG.HttpUtils", "OpenApi requestAsync onHttpStatusException" + e2.toString());
                }
            } catch (NetworkUnavailableException e3) {
                iw9 iw9Var3 = this.f20314n;
                if (iw9Var3 != null) {
                    iw9Var3.i(e3);
                    q8g.f("openSDK_LOG.HttpUtils", "OpenApi requestAsync onNetworkUnavailableException" + e3.toString());
                }
            } catch (MalformedURLException e4) {
                iw9 iw9Var4 = this.f20314n;
                if (iw9Var4 != null) {
                    iw9Var4.f(e4);
                    q8g.f("openSDK_LOG.HttpUtils", "OpenApi requestAsync MalformedURLException" + e4.toString());
                }
            } catch (SocketTimeoutException e5) {
                iw9 iw9Var5 = this.f20314n;
                if (iw9Var5 != null) {
                    iw9Var5.b(e5);
                    q8g.f("openSDK_LOG.HttpUtils", "OpenApi requestAsync onSocketTimeoutException" + e5.toString());
                }
            } catch (ConnectTimeoutException e6) {
                iw9 iw9Var6 = this.f20314n;
                if (iw9Var6 != null) {
                    iw9Var6.h(e6);
                    q8g.f("openSDK_LOG.HttpUtils", "OpenApi requestAsync onConnectTimeoutException" + e6.toString());
                }
            } catch (IOException e7) {
                iw9 iw9Var7 = this.f20314n;
                if (iw9Var7 != null) {
                    iw9Var7.a(e7);
                    q8g.f("openSDK_LOG.HttpUtils", "OpenApi requestAsync IOException" + e7.toString());
                }
            } catch (JSONException e8) {
                iw9 iw9Var8 = this.f20314n;
                if (iw9Var8 != null) {
                    iw9Var8.d(e8);
                    q8g.f("openSDK_LOG.HttpUtils", "OpenApi requestAsync JSONException" + e8.toString());
                }
            } catch (Exception e9) {
                iw9 iw9Var9 = this.f20314n;
                if (iw9Var9 != null) {
                    iw9Var9.c(e9);
                    q8g.f("openSDK_LOG.HttpUtils", "OpenApi requestAsync onUnknowException" + e9.toString());
                }
            }
        }
    }

    public static class b {
        public final String a;
        public final int b;

        public /* synthetic */ b(String str, int i, a aVar) {
            this(str, i);
        }

        public b(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    public static int a(Context context) {
        String property = System.getProperty("http.proxyPort");
        if (!TextUtils.isEmpty(property)) {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static String b(HttpResponse httpResponse) throws IllegalStateException, IOException {
        InputStream content = httpResponse.getEntity().getContent();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Header firstHeader = httpResponse.getFirstHeader(ar9.CONTENT_ENCODING);
        if (firstHeader != null && firstHeader.getValue().toLowerCase().indexOf("gzip") > -1) {
            content = new GZIPInputStream(content);
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i = content.read(bArr);
            if (i == -1) {
                String str = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                content.close();
                return str;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static void c(Context context, p4f p4fVar, String str) {
        if (str.indexOf("add_share") > -1 || str.indexOf("upload_pic") > -1 || str.indexOf("add_topic") > -1 || str.indexOf("set_user_face") > -1 || str.indexOf("add_t") > -1 || str.indexOf("add_pic_t") > -1 || str.indexOf("add_pic_url") > -1 || str.indexOf("add_video") > -1) {
            jcm.a(context, p4fVar, "requireApi", str);
        }
    }

    public static String d(Context context) {
        return System.getProperty("http.proxyHost");
    }

    public static String e(Bundle bundle, String str) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = bundle.size();
        int i = -1;
        for (String str2 : bundle.keySet()) {
            i++;
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                sb.append("Content-Disposition: form-data; name=\"" + str2 + "\"\r\n\r\n" + ((String) obj));
                if (i < size - 1) {
                    sb.append("\r\n--" + str + "\r\n");
                }
            }
        }
        return sb.toString();
    }

    public static String f(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if ((obj instanceof String) || (obj instanceof String[])) {
                if (obj instanceof String[]) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    sb.append(URLEncoder.encode(str) + com.heytap.store.base.core.http.HttpUtils.EQUAL_SIGN);
                    String[] stringArray = bundle.getStringArray(str);
                    if (stringArray != null) {
                        for (int i = 0; i < stringArray.length; i++) {
                            if (i == 0) {
                                sb.append(URLEncoder.encode(stringArray[i]));
                            } else {
                                sb.append(URLEncoder.encode("," + stringArray[i]));
                            }
                        }
                    }
                } else {
                    if (z) {
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    sb.append(URLEncoder.encode(str) + com.heytap.store.base.core.http.HttpUtils.EQUAL_SIGN + URLEncoder.encode(bundle.getString(str)));
                }
            }
        }
        return sb.toString();
    }

    public static int g(IOException iOException) {
        if (iOException instanceof CharConversionException) {
            return -20;
        }
        if (iOException instanceof MalformedInputException) {
            return -21;
        }
        if (iOException instanceof UnmappableCharacterException) {
            return -22;
        }
        if (iOException instanceof HttpResponseException) {
            return -23;
        }
        if (iOException instanceof ClosedChannelException) {
            return -24;
        }
        if (iOException instanceof ConnectionClosedException) {
            return -25;
        }
        if (iOException instanceof EOFException) {
            return -26;
        }
        if (iOException instanceof FileLockInterruptionException) {
            return -27;
        }
        if (iOException instanceof FileNotFoundException) {
            return -28;
        }
        if (iOException instanceof HttpRetryException) {
            return -29;
        }
        if (iOException instanceof ConnectTimeoutException) {
            return -7;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -8;
        }
        if (iOException instanceof InvalidPropertiesFormatException) {
            return -30;
        }
        if (iOException instanceof MalformedChunkCodingException) {
            return -31;
        }
        if (iOException instanceof MalformedURLException) {
            return -3;
        }
        if (iOException instanceof NoHttpResponseException) {
            return -32;
        }
        if (iOException instanceof InvalidClassException) {
            return -33;
        }
        if (iOException instanceof InvalidObjectException) {
            return -34;
        }
        if (iOException instanceof NotActiveException) {
            return -35;
        }
        if (iOException instanceof NotSerializableException) {
            return -36;
        }
        if (iOException instanceof OptionalDataException) {
            return -37;
        }
        if (iOException instanceof StreamCorruptedException) {
            return -38;
        }
        if (iOException instanceof WriteAbortedException) {
            return -39;
        }
        if (iOException instanceof ProtocolException) {
            return -40;
        }
        if (iOException instanceof SSLHandshakeException) {
            return -41;
        }
        if (iOException instanceof SSLKeyException) {
            return -42;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -43;
        }
        if (iOException instanceof SSLProtocolException) {
            return -44;
        }
        if (iOException instanceof BindException) {
            return -45;
        }
        if (iOException instanceof ConnectException) {
            return -46;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -47;
        }
        if (iOException instanceof PortUnreachableException) {
            return -48;
        }
        if (iOException instanceof SyncFailedException) {
            return -49;
        }
        if (iOException instanceof UTFDataFormatException) {
            return -50;
        }
        if (iOException instanceof UnknownHostException) {
            return -51;
        }
        if (iOException instanceof UnknownServiceException) {
            return -52;
        }
        if (iOException instanceof UnsupportedEncodingException) {
            return -53;
        }
        return iOException instanceof ZipException ? -54 : -2;
    }

    public static HttpClient h(Context context, String str, String str2) {
        int iB;
        int iB2;
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        try {
            SSLSocketFactory socketFactory = SSLSocketFactory.getSocketFactory();
            socketFactory.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
            schemeRegistry.register(new Scheme(Const.Scheme.SCHEME_HTTPS, socketFactory, 443));
        } catch (Exception unused) {
            schemeRegistry.register(new Scheme(Const.Scheme.SCHEME_HTTPS, SSLSocketFactory.getSocketFactory(), 443));
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        com.tencent.open.utils.a aVarD = context != null ? com.tencent.open.utils.a.d(context, str) : null;
        if (aVarD != null) {
            iB = aVarD.b("Common_HttpConnectionTimeout");
            iB2 = aVarD.b("Common_SocketConnectionTimeout");
        } else {
            iB = 0;
            iB2 = 0;
        }
        if (iB == 0) {
            iB = 15000;
        }
        if (iB2 == 0) {
            iB2 = 30000;
        }
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, iB);
        HttpConnectionParams.setSoTimeout(basicHttpParams, iB2);
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basicHttpParams, "UTF-8");
        HttpProtocolParams.setUserAgent(basicHttpParams, "AndroidSDK_" + Build.VERSION.SDK + "_" + Build.DEVICE + "_" + Build.VERSION.RELEASE);
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
        b bVarI = i(context);
        if (bVarI != null) {
            defaultHttpClient.getParams().setParameter("http.route.default-proxy", new HttpHost(bVarI.a, bVarI.b));
        }
        return defaultHttpClient;
    }

    public static b i(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        a aVar = null;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() == 0) {
            String strD = d(context);
            int iA = a(context);
            if (!TextUtils.isEmpty(strD) && iA >= 0) {
                return new b(strD, iA, aVar);
            }
        }
        return null;
    }

    public static com.tencent.open.utils.b.C1015b j(Context context, String str, String str2, Bundle bundle) throws IOException, NetworkUnavailableException, HttpStatusException {
        HttpUriRequest httpGet;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && ((activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable())) {
            throw new NetworkUnavailableException(NetworkUnavailableException.ERROR_INFO);
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        String string = bundle2.getString("appid_for_getting_config");
        bundle2.remove("appid_for_getting_config");
        HttpClient httpClientH = h(context, string, str);
        int i = -1;
        int length = 0;
        if (str2.equals("GET")) {
            String strF = f(bundle2);
            length = 0 + strF.length();
            q8g.j("openSDK_LOG.HttpUtils", "-->openUrl2 before url =" + str);
            String str3 = str.indexOf("?") == -1 ? str + "?" : str + "&";
            Bundle bundleC = tpm.c(bundle2);
            if (bundleC != bundle2) {
                q8g.i("openSDK_LOG.HttpUtils", "-->openUrl2 encodedParam =" + f(bundleC) + " -- url = " + str3);
            } else {
                q8g.i("openSDK_LOG.HttpUtils", "-->openUrl2 encodedParam =" + strF + " -- url = " + str3);
            }
            httpGet = new HttpGet(str3 + strF);
            httpGet.addHeader("Accept-Encoding", "gzip");
        } else if (str2.equals("POST")) {
            HttpPost httpPost = new HttpPost(str);
            httpPost.addHeader("Accept-Encoding", "gzip");
            Bundle bundle3 = new Bundle();
            for (String str4 : bundle2.keySet()) {
                Object obj = bundle2.get(str4);
                if (obj instanceof byte[]) {
                    bundle3.putByteArray(str4, (byte[]) obj);
                }
            }
            if (!bundle2.containsKey("method")) {
                bundle2.putString("method", str2);
            }
            httpPost.setHeader("Content-Type", "multipart/form-data; boundary=3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
            httpPost.setHeader("Connection", "Keep-Alive");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(com.tencent.open.utils.b.K("--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"));
            byteArrayOutputStream.write(com.tencent.open.utils.b.K(e(bundle2, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f")));
            if (!bundle3.isEmpty()) {
                int size = bundle3.size();
                byteArrayOutputStream.write(com.tencent.open.utils.b.K("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"));
                for (String str5 : bundle3.keySet()) {
                    i++;
                    byteArrayOutputStream.write(com.tencent.open.utils.b.K("Content-Disposition: form-data; name=\"" + str5 + "\"; filename=\"" + str5 + "\"\r\n"));
                    byteArrayOutputStream.write(com.tencent.open.utils.b.K("Content-Type: content/unknown\r\n\r\n"));
                    byte[] byteArray = bundle3.getByteArray(str5);
                    if (byteArray != null) {
                        byteArrayOutputStream.write(byteArray);
                    }
                    if (i < size - 1) {
                        byteArrayOutputStream.write(com.tencent.open.utils.b.K("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"));
                    }
                }
            }
            byteArrayOutputStream.write(com.tencent.open.utils.b.K("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f--\r\n"));
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            length = 0 + byteArray2.length;
            byteArrayOutputStream.close();
            httpPost.setEntity(new ByteArrayEntity(byteArray2));
            httpGet = httpPost;
        } else {
            httpGet = null;
        }
        HttpResponse httpResponseExecute = httpClientH.execute(httpGet);
        int statusCode = httpResponseExecute.getStatusLine().getStatusCode();
        q8g.i("openSDK_LOG.HttpUtils", "-->openUrl2 response cdoe =" + statusCode);
        if (statusCode == 200) {
            return new com.tencent.open.utils.b.C1015b(b(httpResponseExecute), length);
        }
        throw new HttpStatusException(HttpStatusException.ERROR_INFO + statusCode);
    }

    public static JSONObject k(p4f p4fVar, Context context, String str, Bundle bundle, String str2) throws JSONException, IOException, HttpStatusException, NetworkUnavailableException {
        String str3;
        String str4;
        int i;
        long j2;
        long j3;
        int i2;
        int i3;
        q8g.i("openSDK_LOG.HttpUtils", "OpenApi request");
        if (str.toLowerCase().startsWith("http")) {
            str3 = str;
            str4 = str3;
        } else {
            str3 = dzm.a().b(context, "https://openmobile.qq.com/") + str;
            str4 = dzm.a().b(context, "https://openmobile.qq.com/") + str;
        }
        c(context, p4fVar, str);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iB = com.tencent.open.utils.a.d(context, p4fVar.h()).b("Common_HttpRetryCount");
        q8g.j("OpenConfig_test", "config 1:Common_HttpRetryCount            config_value:" + iB + "   appid:" + p4fVar.h() + "     url:" + str4);
        if (iB == 0) {
            iB = 3;
        }
        q8g.j("OpenConfig_test", "config 1:Common_HttpRetryCount            result_value:" + iB + "   appid:" + p4fVar.h() + "     url:" + str4);
        JSONObject jSONObjectC = null;
        int i4 = 0;
        do {
            i4++;
            try {
                try {
                    com.tencent.open.utils.b.C1015b c1015bJ = j(context, str3, str2, bundle);
                    jSONObjectC = com.tencent.open.utils.b.C(c1015bJ.a);
                    try {
                        i3 = jSONObjectC.getInt("ret");
                    } catch (JSONException unused) {
                        i3 = -4;
                    }
                    long j4 = c1015bJ.b;
                    long j5 = c1015bJ.f20321c;
                    i = i3;
                    j2 = j4;
                    j3 = j5;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    rxm.b().d(str4, jElapsedRealtime, 0L, 0L, -4);
                    throw e2;
                }
            } catch (HttpStatusException e3) {
                e3.printStackTrace();
                try {
                    i2 = Integer.parseInt(e3.getMessage().replace(HttpStatusException.ERROR_INFO, ""));
                } catch (Exception e4) {
                    e4.printStackTrace();
                    i2 = -9;
                }
                rxm.b().d(str4, jElapsedRealtime, 0L, 0L, i2);
                throw e3;
            } catch (NetworkUnavailableException e5) {
                e5.printStackTrace();
                throw e5;
            } catch (MalformedURLException e6) {
                e6.printStackTrace();
                rxm.b().d(str4, jElapsedRealtime, 0L, 0L, -3);
                throw e6;
            } catch (SocketTimeoutException e7) {
                e7.printStackTrace();
                i = -8;
                if (i4 >= iB) {
                    rxm.b().d(str4, jElapsedRealtime, 0L, 0L, -8);
                    throw e7;
                }
                jElapsedRealtime = SystemClock.elapsedRealtime();
            } catch (ConnectTimeoutException e8) {
                e8.printStackTrace();
                i = -7;
                if (i4 >= iB) {
                    rxm.b().d(str4, jElapsedRealtime, 0L, 0L, -7);
                    throw e8;
                }
                jElapsedRealtime = SystemClock.elapsedRealtime();
            } catch (IOException e9) {
                e9.printStackTrace();
                rxm.b().d(str4, jElapsedRealtime, 0L, 0L, g(e9));
                throw e9;
            }
            rxm.b().d(str4, jElapsedRealtime, j2, j3, i);
            return jSONObjectC;
        } while (i4 < iB);
        j2 = 0;
        j3 = 0;
        rxm.b().d(str4, jElapsedRealtime, j2, j3, i);
        return jSONObjectC;
    }

    public static void l(p4f p4fVar, Context context, String str, Bundle bundle, String str2, iw9 iw9Var) {
        q8g.i("openSDK_LOG.HttpUtils", "OpenApi requestAsync");
        new a(p4fVar, context, str, bundle, str2, iw9Var).start();
    }
}
