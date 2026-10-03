package com.heytap.log.nx.http;

import android.content.Context;
import android.net.SSLSessionCache;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import com.cloud.sdk.cloudstorage.http.FileSyncModel;
import com.heytap.log.util.AppUtil;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.webview.extension.protocol.Const;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes19.dex */
public class HttpsUtils {
    public static final String DISCRETE_HEADER_KEY = "hlogcfg";
    private static final int ERROR_CODE = Integer.MIN_VALUE;
    private static final String TAG = "HttpsUtils";
    public static TrustManager sSafeTrustManager;
    static Pattern pattern = Pattern.compile("^https?://[\\w\\-]+(\\.[\\w\\-]+)+([\\w\\-.,@?^=%&:/~+#]*[\\w\\-@?^=%&/~+#])?$");
    private static volatile SSLSessionCache mSSLSessionCache = null;

    private static String convertToUrlParams(Map<String, String> map) {
        if (map == null || map.size() < 1) {
            return null;
        }
        String str = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(str)) {
                str = str + "&";
            }
            str = str + entry.getKey() + HttpUtils.EQUAL_SIGN + entry.getValue();
        }
        Log.d(TAG, "linkParams : " + str);
        return str;
    }

    public static synchronized NxResponse downloadHttp(NxRequest nxRequest) {
        String str;
        String str2;
        NxResponse nxResponse = new NxResponse(Integer.MIN_VALUE);
        NxFile nxFile = nxRequest.getNxFile();
        nxFile.getPath();
        String strConvertToUrlParams = convertToUrlParams(nxRequest.getParams());
        FileOutputStream fileOutputStream = null;
        try {
            try {
                String url = nxRequest.getUrl();
                if (!TextUtils.isEmpty(strConvertToUrlParams)) {
                    url = url + "?" + strConvertToUrlParams;
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
                if (nxRequest.getHeader() != null && nxRequest.getHeader().size() > 0) {
                    for (Map.Entry<String, String> entry : nxRequest.getHeader().entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                nxResponse.setCode(responseCode);
                if (responseCode == 200) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (inputStream == null) {
                        return nxResponse;
                    }
                    String abosulteName = nxFile.getAbosulteName();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(abosulteName);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i);
                        }
                        inputStream.close();
                        fileOutputStream2.close();
                        nxResponse.setFile(new File(abosulteName));
                        String headerField = httpURLConnection.getHeaderField(DISCRETE_HEADER_KEY);
                        if (!TextUtils.isEmpty(headerField)) {
                            ArrayMap arrayMap = new ArrayMap();
                            arrayMap.put(DISCRETE_HEADER_KEY, headerField);
                            nxResponse.setHeader(arrayMap);
                        }
                        fileOutputStream = fileOutputStream2;
                    } catch (MalformedURLException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        Log.e("httpsConn", "http response error : " + e.toString());
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                str = "httpsConn";
                                str2 = "http response error : " + e3.toString();
                                Log.e(str, str2);
                            }
                        }
                    } catch (ProtocolException e4) {
                        e = e4;
                        fileOutputStream = fileOutputStream2;
                        Log.e("httpsConn", "http response error : " + e.toString());
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e5) {
                                str = "httpsConn";
                                str2 = "http response error : " + e5.toString();
                                Log.e(str, str2);
                            }
                        }
                    } catch (IOException e6) {
                        e = e6;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e7) {
                                str = "httpsConn";
                                str2 = "http response error : " + e7.toString();
                                Log.e(str, str2);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e8) {
                                Log.e("httpsConn", "http response error : " + e8.toString());
                            }
                        }
                        throw th;
                    }
                } else {
                    Log.e("httpsConn", "http response error code : " + responseCode);
                }
                httpURLConnection.disconnect();
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e9) {
                        str = "httpsConn";
                        str2 = "http response error : " + e9.toString();
                        Log.e(str, str2);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MalformedURLException e10) {
            e = e10;
        } catch (ProtocolException e11) {
            e = e11;
        } catch (IOException e12) {
            e = e12;
        }
        return nxResponse;
    }

    public static synchronized NxResponse downloadRequest(NxRequest nxRequest) {
        new NxResponse(Integer.MIN_VALUE);
        return downloadHttp(nxRequest);
    }

    private static SSLSocketFactory getSocketFactory(TrustManager trustManager, SecureRandom secureRandom) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{trustManager}, secureRandom);
            installSSLSessionCache(sSLContext);
            return sSLContext.getSocketFactory();
        } catch (Exception e2) {
            Log.w(TAG, "getSocketFactory failed : " + e2.getMessage());
            return null;
        }
    }

    private static void initSSLSessionCache() {
        Context appContext;
        if (mSSLSessionCache == null && (appContext = AppUtil.getAppContext()) != null) {
            mSSLSessionCache = new SSLSessionCache(appContext);
        }
    }

    private static void installSSLSessionCache(SSLContext sSLContext) {
        sSLContext.getClientSessionContext().setSessionCacheSize(0);
        sSLContext.getClientSessionContext().setSessionTimeout(604800);
        if (mSSLSessionCache != null) {
            try {
                SSLSessionCache.class.getMethod("install", SSLSessionCache.class, SSLContext.class).invoke(null, mSSLSessionCache, sSLContext);
            } catch (Throwable th) {
                Log.d(TAG, "installSSLSessionCache error: " + th.getMessage());
            }
        }
    }

    public static synchronized NxResponse sendHttp(NxRequest nxRequest) {
        NxResponse nxResponse;
        nxResponse = new NxResponse(Integer.MIN_VALUE);
        String strConvertToUrlParams = convertToUrlParams(nxRequest.getParams());
        String string = null;
        try {
            try {
                try {
                    String url = nxRequest.getUrl();
                    Log.d("httpsConn", "request urls : " + url);
                    if (!TextUtils.isEmpty(strConvertToUrlParams)) {
                        url = url + "?" + strConvertToUrlParams;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
                    if (nxRequest.getHeader() != null && nxRequest.getHeader().size() > 0) {
                        for (Map.Entry<String, String> entry : nxRequest.getHeader().entrySet()) {
                            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod(nxRequest.getMethod());
                    if (nxRequest.getMethod().equalsIgnoreCase("POST")) {
                        httpURLConnection.setDoOutput(true);
                    }
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.connect();
                    if (nxRequest.getFile() != null) {
                        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                        FileInputStream fileInputStream = new FileInputStream(nxRequest.getFile());
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            dataOutputStream.write(bArr, 0, i);
                        }
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        fileInputStream.close();
                    }
                    if (!TextUtils.isEmpty(nxRequest.getJsonDatas())) {
                        DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                        dataOutputStream2.writeBytes(nxRequest.getJsonDatas());
                        dataOutputStream2.flush();
                        dataOutputStream2.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    nxResponse.setCode(responseCode);
                    Log.d("httpsConn", "response code : " + responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        try {
                            InputStream errorStream = httpURLConnection.getErrorStream();
                            try {
                                if (errorStream != null) {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                    StringBuilder sb = new StringBuilder();
                                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                                        sb.append(line);
                                    }
                                    string = sb.toString();
                                } else {
                                    string = "HTTP error: " + responseCode;
                                }
                                if (errorStream != null) {
                                    errorStream.close();
                                }
                            } catch (Throwable th) {
                                if (errorStream != null) {
                                    try {
                                        errorStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException unused) {
                            string = "HTTP error: " + responseCode + " (failed to read error response)";
                        }
                    } else {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                        try {
                            for (String line2 = bufferedReader2.readLine(); line2 != null; line2 = bufferedReader2.readLine()) {
                                string = string != null ? string + line2 : line2;
                            }
                            bufferedReader2.close();
                        } catch (Throwable th3) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                    nxResponse.setMessage(string);
                    httpURLConnection.disconnect();
                } catch (Throwable th5) {
                    nxResponse.setMessage(null);
                    throw th5;
                }
            } catch (ProtocolException e2) {
                e2.printStackTrace();
            }
        } catch (MalformedURLException e3) {
            e3.printStackTrace();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        nxResponse.setMessage(string);
        return nxResponse;
    }

    public static synchronized NxResponse sendHttps(NxRequest nxRequest) {
        NxResponse nxResponse;
        nxResponse = new NxResponse(Integer.MIN_VALUE);
        String strConvertToUrlParams = convertToUrlParams(nxRequest.getParams());
        String string = null;
        try {
            try {
                String url = nxRequest.getUrl();
                if (!TextUtils.isEmpty(strConvertToUrlParams)) {
                    url = url + "?" + strConvertToUrlParams;
                }
                URL url2 = new URL(url);
                if (sSafeTrustManager == null) {
                    Log.d(TAG, "createUrlConnection systemDefaultTrustManager");
                    sSafeTrustManager = new CustomTrustManager(systemDefaultTrustManager());
                    initSSLSessionCache();
                }
                HttpsURLConnection.setDefaultSSLSocketFactory(getSocketFactory(sSafeTrustManager, null));
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url2.openConnection();
                Map<String, String> header = nxRequest.getHeader();
                if (header != null && header.size() > 0) {
                    for (Map.Entry<String, String> entry : header.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpsURLConnection.setRequestMethod(nxRequest.getMethod());
                if (nxRequest.getMethod().equalsIgnoreCase("POST")) {
                    httpsURLConnection.setDoOutput(true);
                }
                httpsURLConnection.connect();
                if (nxRequest.getFile() != null) {
                    DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
                    FileInputStream fileInputStream = new FileInputStream(nxRequest.getFile());
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        dataOutputStream.write(bArr, 0, i);
                    }
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    fileInputStream.close();
                }
                if (!TextUtils.isEmpty(nxRequest.getJsonDatas())) {
                    DataOutputStream dataOutputStream2 = new DataOutputStream(httpsURLConnection.getOutputStream());
                    dataOutputStream2.writeBytes(nxRequest.getJsonDatas());
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                }
                int responseCode = httpsURLConnection.getResponseCode();
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.putAll(httpsURLConnection.getHeaderFields());
                nxResponse.setHeader(arrayMap);
                nxResponse.setCode(responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    try {
                        InputStream errorStream = httpsURLConnection.getErrorStream();
                        try {
                            if (errorStream != null) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                StringBuilder sb = new StringBuilder();
                                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                                    sb.append(line);
                                }
                                string = sb.toString();
                            } else {
                                string = "HTTP error: " + responseCode;
                            }
                            if (errorStream != null) {
                                errorStream.close();
                            }
                        } catch (Throwable th) {
                            if (errorStream != null) {
                                try {
                                    errorStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        string = "HTTP error: " + responseCode + " (failed to read error response)";
                    }
                } else {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
                    try {
                        for (String line2 = bufferedReader2.readLine(); line2 != null; line2 = bufferedReader2.readLine()) {
                            string = string != null ? string + line2 : line2;
                        }
                        bufferedReader2.close();
                    } catch (Throwable th3) {
                        try {
                            bufferedReader2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                httpsURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e(TAG, "HttpsURLConnection exception : " + e2.getMessage());
            }
            nxResponse.setMessage(string);
        } catch (Throwable th5) {
            nxResponse.setMessage(null);
            throw th5;
        }
        return nxResponse;
    }

    public static synchronized NxResponse sendRequest(NxRequest nxRequest) {
        NxResponse nxResponse = new NxResponse(Integer.MIN_VALUE);
        if (nxRequest == null) {
            return nxResponse;
        }
        String url = nxRequest.getUrl();
        if (TextUtils.isEmpty(url)) {
            return nxResponse;
        }
        if (!pattern.matcher(url).matches()) {
            Log.e("", "url format error, show : " + url);
            return nxResponse;
        }
        if (nxRequest.getHeader() == null) {
            ArrayMap arrayMap = new ArrayMap();
            if (nxRequest.getFile() != null) {
                arrayMap.put("Connection", "Keep-Alive");
                arrayMap.put("Charset", "UTF-8");
                arrayMap.put("Content-Type", FileSyncModel.streamMime);
                arrayMap.put("Accept", "application/json");
            } else if (!TextUtils.isEmpty(nxRequest.getJsonDatas())) {
                arrayMap.put("Content-Type", "application/json");
                arrayMap.put("Accept", "application/json");
            } else if (nxRequest.getNxFile() == null) {
                arrayMap.put("Accept", "application/json");
            }
            nxRequest.addHeaders(arrayMap);
        }
        if (url.contains(Const.Scheme.SCHEME_HTTPS)) {
            nxResponse = sendHttps(nxRequest);
        } else if (url.contains("http")) {
            nxResponse = sendHttp(nxRequest);
        }
        return nxResponse;
    }

    private static X509TrustManager systemDefaultTrustManager() {
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
