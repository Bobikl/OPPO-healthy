package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import io.protostuff.MapSchema;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u001c\u0010\u0013\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0002J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/qld;", "", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/r7b;", "logger", "", b2n.f, "Landroid/content/SharedPreferences;", "spConfig", "", "d", "f", MapSchema.FIELD_NAME_ENTRY, "a", "i", "clientId", "b", "localId", b2n.g, "c", "Ljava/lang/String;", "TAG", "sClientId", "sOuterId", "Ljava/lang/Object;", "adgLock", "", "I", "getEXTRAS_KEY_CLIENT_ID_LEN", "()I", "EXTRAS_KEY_CLIENT_ID_LEN", "<init>", "()V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class qld {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static String sClientId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static String sOuterId;
    public static final qld INSTANCE = new qld();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = pgm.a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Object adgLock = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final int EXTRAS_KEY_CLIENT_ID_LEN = 15;

    public final String a() {
        String str = new SimpleDateFormat("yyMMddHHmmssSSS", Locale.US).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(\"yyMMdd…Locale.US).format(Date())");
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String strSubstring2 = strSubstring + i();
        int length = strSubstring2.length();
        int i = EXTRAS_KEY_CLIENT_ID_LEN;
        if (length < i) {
            String str2 = strSubstring2 + "123456789012345";
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            strSubstring2 = str2.substring(0, i);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        String strC = c0n.c(strSubstring2);
        Intrinsics.checkNotNullExpressionValue(strC, "idIOUtil.replaceNonHexChar(clientIdTemp)");
        return b(StringsKt__StringsJVMKt.replace$default(strC, ",", strSubstring, false, 4, (Object) null));
    }

    public final String b(String clientId) {
        int length = clientId.length();
        if (length >= 29) {
            String strSubstring = clientId.substring(0, 29);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }
        StringBuilder sb = new StringBuilder(clientId);
        while (length < 29) {
            sb.append("0");
            length = sb.length();
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final String c(SharedPreferences spConfig) {
        if (spConfig != null) {
            return spConfig.getString("pref_net_okhttp_v2_clientId", null);
        }
        return null;
    }

    @Nullable
    public final String d(@Nullable SharedPreferences spConfig, @NotNull r7b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        if (TextUtils.isEmpty(sClientId)) {
            sClientId = e(spConfig, logger);
        }
        return sClientId;
    }

    public final String e(SharedPreferences spConfig, r7b logger) {
        String strC = c(spConfig);
        if (!TextUtils.isEmpty(strC)) {
            return strC;
        }
        String strA = a();
        r7b.b(logger, TAG, "自动生成ClientId：" + strA, null, null, 12, null);
        h(spConfig, strA);
        return strA;
    }

    public final String f(Context context, r7b logger) {
        String strE = null;
        try {
            poi.j(context);
            if (!poi.k()) {
                return null;
            }
            strE = poi.e(context);
            r7b.b(logger, TAG, "Got duid from stdIdSDK:" + strE, null, null, 12, null);
            return strE;
        } catch (Throwable th) {
            r7b.b(logger, TAG, "get stdId crash error ", th, null, 8, null);
            return strE;
        }
    }

    public final void g(@NotNull Context context, @NotNull r7b logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        if (TextUtils.isEmpty(sOuterId)) {
            synchronized (adgLock) {
                if (TextUtils.isEmpty(sOuterId)) {
                    boolean z = true;
                    try {
                        if (!Intrinsics.areEqual("com.heytap.openid", context.getPackageName())) {
                            sOuterId = INSTANCE.f(context, logger);
                        }
                        if (TextUtils.isEmpty(sOuterId)) {
                            sOuterId = pf3.INSTANCE.a(context);
                            r7b.b(logger, TAG, "get adg from clientIdUtils " + sOuterId, null, null, 12, null);
                        }
                    } catch (Throwable th) {
                        r7b.b(logger, TAG, "heytap getClientId error", th, null, 8, null);
                    }
                    String str = sOuterId;
                    if (str != null && str.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        sClientId = sOuterId;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void h(SharedPreferences spConfig, String localId) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        if (spConfig == null || (editorEdit = spConfig.edit()) == null || (editorPutString = editorEdit.putString("pref_net_okhttp_v2_clientId", localId)) == null) {
            return;
        }
        editorPutString.apply();
    }

    public final String i() {
        String strValueOf = String.valueOf(Math.abs(UUID.randomUUID().toString().hashCode()));
        if (strValueOf.length() < 9) {
            while (strValueOf.length() < 9) {
                strValueOf = strValueOf + "0";
            }
        }
        String strSubstring = strValueOf.substring(0, 9);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
