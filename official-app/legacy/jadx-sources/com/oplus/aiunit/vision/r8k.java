package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.pay.opensdk.statistic.helper.DigestHelper;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0005\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/r8k;", "", "", "order", sbe.PAY_SDK_PREPAYTOKEN, "a", "input", "b", "<init>", "()V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTradeTraceParamUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeTraceParamUtil.kt\ncom/oplus/pay/opensdk/statistic/trace/TradeTraceParamUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,36:1\n13004#2,3:37\n*S KotlinDebug\n*F\n+ 1 TradeTraceParamUtil.kt\ncom/oplus/pay/opensdk/statistic/trace/TradeTraceParamUtil\n*L\n29#1:37,3\n*E\n"})
public final class r8k {

    @NotNull
    public static final r8k INSTANCE = new r8k();

    @NotNull
    public final String a(@Nullable String order, @Nullable String prePayToken) {
        if (!TextUtils.isEmpty(prePayToken)) {
            Intrinsics.checkNotNull(prePayToken);
            order = prePayToken;
        } else if (order == null) {
            order = "";
        }
        byte[] bytes = order.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return DigestHelper.d(bytes, 0, 2, null);
    }

    @NotNull
    public final String b(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            byte[] bytes = input.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] messageDigest2 = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(messageDigest2, "messageDigest");
            String string = "";
            for (byte b : messageDigest2) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
                sb.append(str);
                string = sb.toString();
            }
            return string;
        } catch (NoSuchAlgorithmException unused) {
            return input;
        }
    }
}
