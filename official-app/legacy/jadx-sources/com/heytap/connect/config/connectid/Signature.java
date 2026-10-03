package com.heytap.connect.config.connectid;

import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.CloudDownloadWorker;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.base.core.http.HttpUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J?\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\n\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/heytap/connect/config/connectid/Signature;", "", "", HttpConst.APP_KEY, CloudDownloadWorker.KEY_SECRET, "", "paramMap", "appendBaseParams", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "", "getSignature", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "key", "data", "encode", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "bytes", "bytesToHex", "([B)Ljava/lang/String;", "HEX_STRING_LIST", "Ljava/lang/String;", "SIGN", "SIGN_METHOD_MD5", "APP_KEY", "API_VERSION_10", "SIGN_METHOD", "API_VERSION", "TIMESTAMP", "ALGORITHM_HMAC_SHA_256", "", "NUM_HEX", "I", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class Signature {

    @NotNull
    private static final String ALGORITHM_HMAC_SHA_256 = "HmacSHA256";

    @NotNull
    private static final String API_VERSION = "api_version";

    @NotNull
    private static final String API_VERSION_10 = "1.0";

    @NotNull
    private static final String APP_KEY = "app_key";

    @NotNull
    private static final String HEX_STRING_LIST = "0123456789abcdef";

    @NotNull
    public static final Signature INSTANCE = new Signature();
    private static final int NUM_HEX = 16;

    @NotNull
    private static final String SIGN = "sign";

    @NotNull
    private static final String SIGN_METHOD = "sign_method";

    @NotNull
    private static final String SIGN_METHOD_MD5 = "md5";

    @NotNull
    private static final String TIMESTAMP = "timestamp";

    private Signature() {
    }

    @NotNull
    public final Map<String, String> appendBaseParams(@NotNull String appKey, @Nullable String secret, @NotNull Map<String, String> paramMap) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(paramMap, "paramMap");
        paramMap.putAll(MapsKt__MapsKt.mutableMapOf(TuplesKt.to(APP_KEY, appKey), TuplesKt.to("timestamp", String.valueOf(System.currentTimeMillis())), TuplesKt.to("api_version", "1.0"), TuplesKt.to(SIGN_METHOD, "md5")));
        paramMap.put("sign", INSTANCE.getSignature(paramMap, secret));
        return paramMap;
    }

    @NotNull
    public final String bytesToHex(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        char[] charArray = HEX_STRING_LIST.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        char[] cArr = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            int i2 = bytes[i] & 255;
            int i3 = i * 2;
            cArr[i3] = charArray[i2 >>> 4];
            cArr[i3 + 1] = charArray[i2 & 15];
        }
        return new String(cArr);
    }

    @NotNull
    public final String encode(@NotNull String key, @NotNull String data) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Mac mac = Mac.getInstance(ALGORITHM_HMAC_SHA_256);
            Intrinsics.checkNotNullExpressionValue(mac, "getInstance(ALGORITHM_HMAC_SHA_256)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = key.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            mac.init(new SecretKeySpec(bytes, ALGORITHM_HMAC_SHA_256));
            Charset UTF_9 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
            byte[] bytes2 = data.getBytes(UTF_9);
            Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
            byte[] bArrDoFinal = mac.doFinal(bytes2);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "sha256Hmac.doFinal(data.toByteArray(StandardCharsets.UTF_8))");
            return bytesToHex(bArrDoFinal);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    @NotNull
    public final String getSignature(@Nullable Map<String, String> paramMap, @Nullable String secret) {
        boolean z;
        TreeMap treeMap = new TreeMap(paramMap);
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : treeMap.entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            if (((CharSequence) key).length() > 0) {
                Object value = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "it.value");
                z = ((CharSequence) value).length() > 0;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            sb.append((String) entry2.getKey());
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append((String) entry2.getValue());
            sb.append("&");
        }
        sb.append(secret);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "query.toString()");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        String strCalcMD5 = ConnectMD5.calcMD5(bytes);
        Intrinsics.checkNotNullExpressionValue(strCalcMD5, "calcMD5(query.toString().toByteArray())");
        return strCalcMD5;
    }
}
