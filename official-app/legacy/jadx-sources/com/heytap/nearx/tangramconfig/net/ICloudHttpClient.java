package com.heytap.nearx.tangramconfig.net;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.bean.Okio_api_250Kt;
import com.heytap.nearx.tangramconfig.stat.Const;
import com.oplus.aiunit.vision.kam;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/tangramconfig/net/ICloudHttpClient;", "", "sendRequest", "Lcom/heytap/nearx/tangramconfig/net/IResponse;", "request", "Lcom/heytap/nearx/tangramconfig/net/IRequest;", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ICloudHttpClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/tangramconfig/net/ICloudHttpClient$Companion;", "", "()V", "DEFAULT", "Lcom/heytap/nearx/tangramconfig/net/ICloudHttpClient;", "getDEFAULT", "()Lcom/heytap/nearx/tangramconfig/net/ICloudHttpClient;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final ICloudHttpClient DEFAULT = new ICloudHttpClient() { // from class: com.heytap.nearx.tangramconfig.net.ICloudHttpClient$Companion$DEFAULT$1
            /* JADX WARN: Code duplicated, block: B:65:0x01ad  */
            @Override // com.heytap.nearx.tangramconfig.net.ICloudHttpClient
            @NotNull
            public IResponse sendRequest(@NotNull IRequest request) {
                String url;
                boolean z;
                Intrinsics.checkNotNullParameter(request, "request");
                try {
                    if (StringsKt__StringsKt.contains$default((CharSequence) request.getUrl(), (CharSequence) Const.UPDATE_PATH_V3, false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) request.getUrl(), (CharSequence) "/checkUpdate", false, 2, (Object) null)) {
                        url = request.getUrl();
                    } else {
                        String url2 = request.getUrl();
                        String str = StringsKt__StringsKt.contains$default((CharSequence) url2, (CharSequence) "?", false, 2, (Object) null) ? "&" : "?";
                        String str2 = str;
                        url = url2;
                        for (Map.Entry<String, String> entry : request.getParams().entrySet()) {
                            url = url + str2 + entry.getKey() + kam.h + entry.getValue();
                            str2 = "&";
                        }
                    }
                    URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
                    Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    final HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    int iIntValue = ((Number) request.config("OKHTTP_CONNECT_TIME_OUT")).intValue();
                    if (iIntValue > 0) {
                        httpURLConnection.setConnectTimeout(iIntValue);
                    }
                    int iIntValue2 = ((Number) request.config("OKHTTP_READ_TIME_OUT")).intValue();
                    if (iIntValue2 > 0) {
                        httpURLConnection.setReadTimeout(iIntValue2);
                    }
                    for (Map.Entry<String, String> entry2 : request.getHeader().entrySet()) {
                        httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    request.getParams().get("body");
                    if (StringsKt__StringsKt.contains$default((CharSequence) request.getUrl(), (CharSequence) Const.UPDATE_PATH_V3, false, 2, (Object) null) && StringsKt__StringsKt.contains$default((CharSequence) request.getUrl(), (CharSequence) "/checkUpdate", false, 2, (Object) null)) {
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setDoOutput(true);
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        try {
                            String str3 = request.getParams().get("body");
                            if (str3 != null) {
                                Charset charset = Charsets.UTF_8;
                                byte[] bytes = str3.getBytes(charset);
                                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                                if (bytes != null) {
                                    int length = bytes.length;
                                    byte[] bytes2 = str3.getBytes(charset);
                                    Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                                    outputStream.write(bytes2, 0, length);
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                            CloseableKt.closeFinally(outputStream, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(outputStream, th);
                                throw th2;
                            }
                        }
                    } else {
                        httpURLConnection.setRequestMethod("GET");
                    }
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "if (connection.responseC…eam\n                    }");
                    BufferedSource buffer = Okio_api_250Kt.toBuffer(Okio_api_250Kt.toSource(inputStream));
                    final byte[] byteArray = buffer.readByteArray();
                    buffer.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    String responseMessage = httpURLConnection.getResponseMessage();
                    Intrinsics.checkNotNullExpressionValue(responseMessage, "connection.responseMessage");
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    Intrinsics.checkNotNullExpressionValue(headerFields, "connection.headerFields");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, List<String>> entry3 : headerFields.entrySet()) {
                        if (entry3.getKey() == null) {
                            z = false;
                        } else {
                            List<String> value = entry3.getValue();
                            if (value == null || value.isEmpty()) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        if (z) {
                            linkedHashMap.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        Object key = entry4.getKey();
                        Intrinsics.checkNotNull(key);
                        Object value2 = entry4.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "it.value");
                        arrayList.add(TuplesKt.to(key, CollectionsKt___CollectionsKt.joinToString$default((Iterable) value2, null, null, null, 0, null, null, 63, null)));
                    }
                    return new IResponse(responseCode, responseMessage, MapsKt__MapsKt.toMutableMap(MapsKt__MapsKt.toMap(arrayList)), new Function0<byte[]>() { // from class: com.heytap.nearx.tangramconfig.net.ICloudHttpClient$Companion$DEFAULT$1$sendRequest$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        @Nullable
                        public final byte[] invoke() {
                            return byteArray;
                        }
                    }, new Function0<Long>() { // from class: com.heytap.nearx.tangramconfig.net.ICloudHttpClient$Companion$DEFAULT$1$sendRequest$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // p010kotlin.jvm.functions.Function0
                        @Nullable
                        public final Long invoke() {
                            return Long.valueOf(httpURLConnection.getContentLength());
                        }
                    }, request.getConfigs());
                } catch (BindException e2) {
                    return new IResponse(904, e2.toString(), null, null, null, null, 60, null);
                } catch (ConnectException e3) {
                    return new IResponse(901, e3.toString(), null, null, null, null, 60, null);
                } catch (HttpRetryException e4) {
                    return new IResponse(IResponse.RESPONSE_CODE_HTTP_RETRY, e4.toString(), null, null, null, null, 60, null);
                } catch (MalformedURLException e5) {
                    return new IResponse(910, e5.toString(), null, null, null, null, 60, null);
                } catch (NoRouteToHostException e6) {
                    return new IResponse(903, e6.toString(), null, null, null, null, 60, null);
                } catch (PortUnreachableException e7) {
                    return new IResponse(906, e7.toString(), null, null, null, null, 60, null);
                } catch (ProtocolException e8) {
                    return new IResponse(911, e8.toString(), null, null, null, null, 60, null);
                } catch (SocketException e9) {
                    return new IResponse(IResponse.RESPONSE_CODE_SOCKET, e9.toString(), null, null, null, null, 60, null);
                } catch (SocketTimeoutException e10) {
                    return new IResponse(902, e10.toString(), null, null, null, null, 60, null);
                } catch (UnknownHostException e11) {
                    return new IResponse(900, e11.toString(), null, null, null, null, 60, null);
                } catch (IOException e12) {
                    return new IResponse(990, e12.toString(), null, null, null, null, 60, null);
                } catch (URISyntaxException e13) {
                    return new IResponse(912, e13.toString(), null, null, null, null, 60, null);
                } catch (UnknownServiceException e14) {
                    return new IResponse(905, e14.toString(), null, null, null, null, 60, null);
                } catch (SSLHandshakeException e15) {
                    return new IResponse(IResponse.RESPONSE_CODE_SSL_HAND_SHAKE, e15.toString(), null, null, null, null, 60, null);
                } catch (SSLKeyException e16) {
                    return new IResponse(IResponse.RESPONSE_CODE_SSL_KEY, e16.toString(), null, null, null, null, 60, null);
                } catch (SSLPeerUnverifiedException e17) {
                    return new IResponse(IResponse.RESPONSE_CODE_SSL_PEER_UNVERIFIED, e17.toString(), null, null, null, null, 60, null);
                } catch (SSLProtocolException e18) {
                    return new IResponse(IResponse.RESPONSE_CODE_SSL_PROTOCOL, e18.toString(), null, null, null, null, 60, null);
                } catch (SSLException e19) {
                    return new IResponse(IResponse.RESPONSE_CODE_SSL, e19.toString(), null, null, null, null, 60, null);
                } catch (Exception e20) {
                    return new IResponse(999, e20.toString(), null, null, null, null, 60, null);
                }
            }
        };

        private Companion() {
        }

        @NotNull
        public final ICloudHttpClient getDEFAULT() {
            return DEFAULT;
        }
    }

    @NotNull
    IResponse sendRequest(@NotNull IRequest request);
}
