package com.heytap.connect.api.request;

import com.oplus.aiunit.vision.kam;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/heytap/connect/api/request/IHttpClient;", "", "Lcom/heytap/connect/api/request/IRequest;", "request", "Lcom/heytap/connect/api/request/IResponse;", "sendRequest", "(Lcom/heytap/connect/api/request/IRequest;)Lcom/heytap/connect/api/request/IResponse;", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IHttpClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/connect/api/request/IHttpClient$Companion;", "", "Lcom/heytap/connect/api/request/IHttpClient;", "DEFAULT", "Lcom/heytap/connect/api/request/IHttpClient;", "getDEFAULT", "()Lcom/heytap/connect/api/request/IHttpClient;", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final IHttpClient DEFAULT = new IHttpClient() { // from class: com.heytap.connect.api.request.IHttpClient$Companion$DEFAULT$1

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    Method.valuesCustom();
                    int[] iArr = new int[2];
                    iArr[Method.GET.ordinal()] = 1;
                    iArr[Method.POST.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Code duplicated, block: B:51:0x017a  */
            @Override // com.heytap.connect.api.request.IHttpClient
            @NotNull
            public IResponse sendRequest(@NotNull IRequest request) {
                boolean z;
                Intrinsics.checkNotNullParameter(request, "request");
                try {
                    String str = "";
                    String str2 = str;
                    for (Map.Entry<String, String> entry : request.getParams().entrySet()) {
                        str = str + str2 + ((Object) URLEncoder.encode(entry.getKey())) + kam.h + ((Object) URLEncoder.encode(entry.getValue()));
                        str2 = "&";
                    }
                    String url = request.getUrl();
                    if (request.getMethod() == Method.GET) {
                        url = url + (StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "?", false, 2, (Object) null) ? "&" : "?") + str;
                    }
                    URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
                    if (uRLConnectionOpenConnection == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    final HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    for (Map.Entry<String, String> entry2 : request.getHeader().entrySet()) {
                        httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    int iOrdinal = request.getMethod().ordinal();
                    if (iOrdinal == 0) {
                        httpURLConnection.setRequestMethod("GET");
                    } else if (iOrdinal == 1) {
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    httpURLConnection.connect();
                    if (request.getMethod() == Method.POST) {
                        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                        Charset charset = Charsets.UTF_8;
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        byte[] bytes = str.getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                        dataOutputStream.write(bytes);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    }
                    InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "if (connection.responseCode == HTTP_OK) {\n                        connection.inputStream\n                    } else {\n                        connection.errorStream\n                    }");
                    final byte[] byteArray = Okio.buffer(Okio.source(inputStream)).readByteArray();
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
                        String str3 = (String) entry4.getKey();
                        Intrinsics.checkNotNull(str3);
                        Object value2 = entry4.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "it.value");
                        arrayList.add(TuplesKt.to(str3, CollectionsKt___CollectionsKt.joinToString$default((Iterable) value2, null, null, null, 0, null, null, 63, null)));
                    }
                    return new IResponse(responseCode, responseMessage, MapsKt__MapsKt.toMutableMap(MapsKt__MapsKt.toMap(arrayList)), new Function0<byte[]>() { // from class: com.heytap.connect.api.request.IHttpClient$Companion$DEFAULT$1$sendRequest$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        @Nullable
                        public final byte[] invoke() {
                            return byteArray;
                        }
                    }, new Function0<Long>() { // from class: com.heytap.connect.api.request.IHttpClient$Companion$DEFAULT$1$sendRequest$6
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
                } catch (Exception e2) {
                    String message = e2.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    return new IResponse(400, message, new LinkedHashMap(), new Function0<byte[]>() { // from class: com.heytap.connect.api.request.IHttpClient$Companion$DEFAULT$1$sendRequest$7
                        @Override // p010kotlin.jvm.functions.Function0
                        @Nullable
                        public final byte[] invoke() {
                            return new byte[0];
                        }
                    }, new Function0<Long>() { // from class: com.heytap.connect.api.request.IHttpClient$Companion$DEFAULT$1$sendRequest$8
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // p010kotlin.jvm.functions.Function0
                        @Nullable
                        public final Long invoke() {
                            return 0L;
                        }
                    }, request.getConfigs());
                }
            }
        };

        private Companion() {
        }

        @NotNull
        public final IHttpClient getDEFAULT() {
            return DEFAULT;
        }
    }

    @NotNull
    IResponse sendRequest(@NotNull IRequest request);
}
