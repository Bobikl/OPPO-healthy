package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpUtils;
import feedbackf.feedbackb;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.jetbrains.annotations.NotNull;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class jwm {
    @NotNull
    public static HashMap a(@NotNull String ts, @NotNull String body) {
        Intrinsics.checkNotNullParameter(ts, "ts");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter("/api-new/feedback/fms/upload-feedback", "path");
        HashMap map = new HashMap();
        map.put("ts", ts);
        map.put("appId", zo6.a() == 0 ? "fbpw2cv3aa8jpyym7y5afawnwanweg1p" : "fbtjppmuxp2bkohfiaztm0mv0naefwov");
        TreeMap treeMap = new TreeMap();
        StringBuilder sb = new StringBuilder();
        treeMap.put("appId", zo6.a() != 0 ? "fbtjppmuxp2bkohfiaztm0mv0naefwov" : "fbpw2cv3aa8jpyym7y5afawnwanweg1p");
        treeMap.put("body", body);
        treeMap.put("path", "/api-new/feedback/fms/upload-feedback");
        treeMap.put("ts", ts);
        treeMap.put("urlParam", "");
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append(str);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(StringsKt__StringsKt.trim((CharSequence) str2).toString());
            sb.append("&");
        }
        sb.append("secret=");
        sb.append(StringsKt__StringsKt.trim((CharSequence) (zo6.a() == 0 ? "0mrznnvl4wfpk0oph323crmv4aiega9r" : "epv8a2oae10h6gp4zdy9eliebn8siv6k")).toString());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "baseString.toString()");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        byte[] bytes = lowerCase.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] hash = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(hash, "hash");
        map.put("sign", ArraysKt___ArraysKt.joinToString$default(hash, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) feedbackb.feedbacka, 30, (Object) null));
        map.put("x-fb-encrypt-algo", "v1");
        return map;
    }
}
