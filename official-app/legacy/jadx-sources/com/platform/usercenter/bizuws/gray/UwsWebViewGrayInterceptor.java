package com.platform.usercenter.bizuws.gray;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.efd;
import com.oplus.aiunit.vision.to2;
import com.oplus.aiunit.vision.ytf;
import com.oplus.smartenginehelper.ParserTag;
import com.platform.usercenter.bizuws.utils.UwsMimeTypeMapUtils;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.uws.util.UwsNoNetworkUtil;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Request;

/* JADX INFO: loaded from: classes9.dex */
public class UwsWebViewGrayInterceptor {
    private final File mCacheFile;
    private final long mCacheSize;
    private final long mConnectTimeout;
    private final long mReadTimeout;
    private SSLSocketFactory mSSLSocketFactory;
    private X509TrustManager mX509TrustManager;
    private efd mHttpClient = null;
    private HostnameVerifier mHostnameVerifier = null;

    public static class Builder {
        private File mCacheFile;
        private long mCacheSize = 31457280;
        private long mConnectTimeout = 20;
        private long mReadTimeout = 20;
        private SSLSocketFactory mSSLSocketFactory = null;
        private X509TrustManager mX509TrustManager = null;

        public Builder(Context context) {
            this.mCacheFile = new File(context.getCacheDir().toString(), "UwsCacheWebViewCache");
        }

        public UwsWebViewGrayInterceptor build() {
            return new UwsWebViewGrayInterceptor(this);
        }

        public Builder setCachePath(File file) {
            if (file != null) {
                this.mCacheFile = file;
            }
            return this;
        }

        public Builder setCacheSize(long j2) {
            if (j2 > 1024) {
                this.mCacheSize = j2;
            }
            return this;
        }

        public Builder setConnectTimeoutSecond(long j2) {
            if (j2 >= 0) {
                this.mConnectTimeout = j2;
            }
            return this;
        }

        public Builder setReadTimeoutSecond(long j2) {
            if (j2 >= 0) {
                this.mReadTimeout = j2;
            }
            return this;
        }

        public Builder setSSLSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory != null) {
                this.mSSLSocketFactory = sSLSocketFactory;
            }
            if (x509TrustManager != null) {
                this.mX509TrustManager = x509TrustManager;
            }
            return this;
        }
    }

    public UwsWebViewGrayInterceptor(Builder builder) {
        this.mSSLSocketFactory = null;
        this.mX509TrustManager = null;
        this.mCacheFile = builder.mCacheFile;
        this.mCacheSize = builder.mCacheSize;
        this.mConnectTimeout = builder.mConnectTimeout;
        this.mReadTimeout = builder.mReadTimeout;
        this.mX509TrustManager = builder.mX509TrustManager;
        this.mSSLSocketFactory = builder.mSSLSocketFactory;
        initHttpClient();
    }

    private void initHttpClient() {
        X509TrustManager x509TrustManager;
        efd.a aVarD = new efd.a().d(new to2(this.mCacheFile, this.mCacheSize));
        long j2 = this.mConnectTimeout;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        efd.a aVarX = aVarD.g(j2, timeUnit).X(this.mReadTimeout, timeUnit);
        SSLSocketFactory sSLSocketFactory = this.mSSLSocketFactory;
        if (sSLSocketFactory != null && (x509TrustManager = this.mX509TrustManager) != null) {
            aVarX.a0(sSLSocketFactory, x509TrustManager);
        }
        HostnameVerifier hostnameVerifier = this.mHostnameVerifier;
        if (hostnameVerifier != null) {
            aVarX.S(hostnameVerifier);
        }
        this.mHttpClient = aVarX.c();
    }

    private WebResourceResponse interceptRequest(String str, Map<String, String> map) {
        try {
            Request.Builder builderUrl = new Request.Builder().url(str);
            addHeader(builderUrl, map);
            ytf ytfVarExecute = this.mHttpClient.a(builderUrl.build()).execute();
            WebResourceResponse webResourceResponse = new WebResourceResponse(UwsMimeTypeMapUtils.getMimeTypeFromUrl(str), "", ytfVarExecute.getBody().a());
            String message = ytfVarExecute.getMessage();
            if (TextUtils.isEmpty(message)) {
                message = "OK";
            }
            try {
                webResourceResponse.setStatusCodeAndReasonPhrase(ytfVarExecute.getCode(), message);
                webResourceResponse.setResponseHeaders(UwsNoNetworkUtil.multimapToSingle(ytfVarExecute.getHeaders().g()));
                return webResourceResponse;
            } catch (Exception unused) {
                return null;
            }
        } catch (IOException e2) {
            UCLogUtil.e(e2.getMessage());
            return null;
        }
    }

    public static boolean needAppendGray(WebResourceRequest webResourceRequest) {
        if (!UwsGrayHelper.isGray() || webResourceRequest == null || webResourceRequest.getUrl() == null || !webResourceRequest.getMethod().equalsIgnoreCase(ParserTag.TAG_GET) || !UwsGrayHelper.isGrayWhiteDomain(webResourceRequest.getUrl().toString())) {
            return false;
        }
        String strTrim = webResourceRequest.getUrl().getScheme().trim();
        return strTrim.equalsIgnoreCase("http") || strTrim.equalsIgnoreCase(Const.Scheme.SCHEME_HTTPS);
    }

    public void addHeader(Request.Builder builder, Map<String, String> map) {
        if (UwsGrayHelper.isGray()) {
            builder.addHeader(UwsGrayHelper.KEY_GARY_ENV_HEADER, UwsGrayHelper.GRAY_CONFIG_VALUE);
        }
        if (map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder.addHeader(entry.getKey(), entry.getValue());
        }
    }

    public WebResourceResponse grayInterceptRequest(WebResourceRequest webResourceRequest) {
        return interceptRequest(UwsGrayHelper.getGrayUrl(webResourceRequest.getUrl().toString()), webResourceRequest.getRequestHeaders());
    }

    public WebResourceResponse grayInterceptRequest(String str) {
        return interceptRequest(UwsGrayHelper.getGrayUrl(str), null);
    }

    public static boolean needAppendGray(String str) {
        return UwsGrayHelper.isGray() && URLUtil.isNetworkUrl(str);
    }
}
