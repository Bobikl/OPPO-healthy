package com.heytap.nearx.net;

import com.heytap.nearx.cloudconfig.bean.Okio_api_250Kt;
import com.oplus.aiunit.vision.gw9;
import com.oplus.aiunit.vision.jw9;
import com.oplus.aiunit.vision.kam;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.TypeCastException;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/net/ICloudHttpClient;", "", "Lcom/oplus/aiunit/vision/gw9;", "request", "Lcom/oplus/aiunit/vision/jw9;", "a", "Companion", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public interface ICloudHttpClient {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/heytap/nearx/net/ICloudHttpClient$Companion;", "", "Lcom/heytap/nearx/net/ICloudHttpClient;", "a", "Lcom/heytap/nearx/net/ICloudHttpClient;", "()Lcom/heytap/nearx/net/ICloudHttpClient;", "DEFAULT", "<init>", "()V", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion b = new Companion();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final ICloudHttpClient DEFAULT = new ICloudHttpClient() { // from class: com.heytap.nearx.net.ICloudHttpClient$Companion$DEFAULT$1
            /* JADX WARN: Code duplicated, block: B:41:0x0128  */
            @Override // com.heytap.nearx.net.ICloudHttpClient
            @NotNull
            public jw9 a(@NotNull gw9 request) {
                boolean z;
                Intrinsics.checkParameterIsNotNull(request, "request");
                try {
                    String url = request.getUrl();
                    String str = StringsKt__StringsKt.contains$default((CharSequence) url, (CharSequence) "?", false, 2, (Object) null) ? "&" : "?";
                    for (Map.Entry<String, String> entry : request.d().entrySet()) {
                        url = url + str + entry.getKey() + kam.h + entry.getValue();
                        str = "&";
                    }
                    URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
                    if (uRLConnectionOpenConnection == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    final HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setRequestMethod("GET");
                    int iIntValue = ((Number) request.a("OKHTTP_CONNECT_TIME_OUT")).intValue();
                    if (iIntValue > 0) {
                        httpURLConnection.setConnectTimeout(iIntValue);
                    }
                    int iIntValue2 = ((Number) request.a("OKHTTP_READ_TIME_OUT")).intValue();
                    if (iIntValue2 > 0) {
                        httpURLConnection.setReadTimeout(iIntValue2);
                    }
                    for (Map.Entry<String, String> entry2 : request.c().entrySet()) {
                        httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    httpURLConnection.connect();
                    InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    Intrinsics.checkExpressionValueIsNotNull(inputStream, "if (connection.responseC…eam\n                    }");
                    BufferedSource buffer = Okio_api_250Kt.toBuffer(Okio_api_250Kt.toSource(inputStream));
                    final byte[] byteArray = buffer.readByteArray();
                    buffer.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    String responseMessage = httpURLConnection.getResponseMessage();
                    Intrinsics.checkExpressionValueIsNotNull(responseMessage, "connection.responseMessage");
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    Intrinsics.checkExpressionValueIsNotNull(headerFields, "connection.headerFields");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, List<String>> entry3 : headerFields.entrySet()) {
                        if (entry3.getKey() != null) {
                            List<String> value = entry3.getValue();
                            z = true;
                            if (value == null || value.isEmpty()) {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            linkedHashMap.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        Object key = entry4.getKey();
                        if (key == null) {
                            Intrinsics.throwNpe();
                        }
                        Object value2 = entry4.getValue();
                        Intrinsics.checkExpressionValueIsNotNull(value2, "it.value");
                        arrayList.add(TuplesKt.to(key, CollectionsKt___CollectionsKt.joinToString$default((Iterable) value2, null, null, null, 0, null, null, 63, null)));
                    }
                    return new jw9(responseCode, responseMessage, MapsKt__MapsKt.toMutableMap(MapsKt__MapsKt.toMap(arrayList)), new Function0<byte[]>() { // from class: com.heytap.nearx.net.ICloudHttpClient$Companion$DEFAULT$1$sendRequest$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        @NotNull
                        public final byte[] invoke() {
                            return byteArray;
                        }
                    }, new Function0<Long>() { // from class: com.heytap.nearx.net.ICloudHttpClient$Companion$DEFAULT$1$sendRequest$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Long invoke() {
                            return Long.valueOf(invoke2());
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final long invoke2() {
                            return httpURLConnection.getContentLength();
                        }
                    }, request.b());
                } catch (Exception e2) {
                    return new jw9(400, String.valueOf(e2), new ConcurrentHashMap(), new Function0<byte[]>() { // from class: com.heytap.nearx.net.ICloudHttpClient$Companion$DEFAULT$1$sendRequest$6
                        @Override // p010kotlin.jvm.functions.Function0
                        @NotNull
                        public final byte[] invoke() {
                            return new byte[0];
                        }
                    }, new Function0<Long>() { // from class: com.heytap.nearx.net.ICloudHttpClient$Companion$DEFAULT$1$sendRequest$7
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final long invoke2() {
                            return 0L;
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Long invoke() {
                            return Long.valueOf(invoke2());
                        }
                    }, request.b());
                }
            }
        };

        @NotNull
        public final ICloudHttpClient a() {
            return DEFAULT;
        }
    }

    @NotNull
    jw9 a(@NotNull gw9 request);
}
