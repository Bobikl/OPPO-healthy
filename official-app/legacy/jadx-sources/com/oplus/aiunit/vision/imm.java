package com.oplus.aiunit.vision;

import com.heytap.webview.extension.protocol.Const;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;

/* JADX INFO: loaded from: classes10.dex */
public final class imm {
    public String a = null;
    public InputStream b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wpm f12588c;
    public String d;

    public imm(wpm wpmVar, String str) {
        this.f12588c = wpmVar;
        this.d = str;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    public final int a() {
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        byte b;
        int i;
        f1n.b("uppay", "HttpConn.connect() +++");
        wpm wpmVar = this.f12588c;
        int i2 = 1;
        try {
            try {
                if (wpmVar == null) {
                    f1n.d("uppay", "params==null!!!");
                    return 1;
                }
                try {
                    try {
                        try {
                            URL urlA = wpmVar.a();
                            if (Const.Scheme.SCHEME_HTTPS.equals(urlA.getProtocol().toLowerCase())) {
                                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) urlA.openConnection();
                                httpsURLConnection.setSSLSocketFactory(new rcm(this.d).a().getSocketFactory());
                                httpURLConnection = httpsURLConnection;
                            } else {
                                httpURLConnection = (HttpURLConnection) urlA.openConnection();
                            }
                            httpURLConnection.setRequestMethod(this.f12588c.c());
                            httpURLConnection.setReadTimeout(60000);
                            httpURLConnection.setConnectTimeout(30000);
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setUseCaches(false);
                            HashMap mapE = this.f12588c.e();
                            if (mapE != null) {
                                for (String str : mapE.keySet()) {
                                    httpURLConnection.setRequestProperty(str, (String) mapE.get(str));
                                }
                            }
                            String strC = this.f12588c.c();
                            int iHashCode = strC.hashCode();
                            if (iHashCode != 70454) {
                                if (iHashCode == 2461856 && strC.equals("POST")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                            } else if (strC.equals("GET")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            if (b == 1) {
                                httpURLConnection.setDoOutput(true);
                                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                                outputStreamWriter.write(this.f12588c.d());
                                outputStreamWriter.flush();
                                outputStreamWriter.close();
                            }
                            httpURLConnection.connect();
                            if (httpURLConnection.getResponseCode() == 200) {
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                this.b = inputStream2;
                                if (inputStream2 != null) {
                                    this.a = com.unionpay.utils.a.c(inputStream2, "UTF-8");
                                    i2 = 0;
                                }
                            } else {
                                if (httpURLConnection.getResponseCode() == 401) {
                                    i = 8;
                                } else if (httpURLConnection.getResponseCode() == 404) {
                                    i = 22;
                                } else {
                                    f1n.d("uppay", "http status code:" + httpURLConnection.getResponseCode());
                                }
                                i2 = i;
                            }
                            inputStream = this.b;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (IllegalStateException e2) {
                            e2.printStackTrace();
                            inputStream = this.b;
                            if (inputStream != null) {
                            }
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        inputStream = this.b;
                        if (inputStream != null) {
                        }
                    }
                } catch (SSLHandshakeException e4) {
                    e4.printStackTrace();
                    try {
                        InputStream inputStream3 = this.b;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                    } catch (Exception unused) {
                    }
                    i2 = 4;
                } catch (IOException e5) {
                    e5.printStackTrace();
                    inputStream = this.b;
                    if (inputStream != null) {
                    }
                }
            } catch (Exception unused2) {
            }
            f1n.b("uppay", "HttpConn.connect() ---");
            return i2;
        } catch (Throwable th) {
            try {
                InputStream inputStream4 = this.b;
                if (inputStream4 != null) {
                    inputStream4.close();
                }
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final String b() {
        return this.a;
    }
}
