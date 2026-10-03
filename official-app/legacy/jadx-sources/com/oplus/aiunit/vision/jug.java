package com.oplus.aiunit.vision;

import android.util.Base64;
import com.heytap.connect_dns.request.ServerHostResponse;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 \u00162\u00020\u0001:\u0001\u0005B9\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/jug;", "", "", "toString", "", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "", "Z", "d", "()Z", "success", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "bodyText", "msg", "<init>", "(Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;)V", "Companion", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class jug {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Map<String, String> header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean success;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String bodyText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String msg;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.jug$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/jug$a;", "", "", "tag", "url", "Lcom/oplus/aiunit/vision/jw9;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "withSign", "Lcom/oplus/aiunit/vision/dp6;", HttpConst.SERVER_ENV, "Lcom/oplus/aiunit/vision/r7b;", "logger", "Lcom/oplus/aiunit/vision/jug;", "a", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final jug a(@NotNull String tag, @NotNull String url, @Nullable jw9 response, boolean withSign, @NotNull dp6 env, @Nullable r7b logger) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(env, "env");
            if (response == null) {
                if (logger != null) {
                    r7b.l(logger, tag, "checkResponseValid. url:" + url + ", response is null.", null, null, 12, null);
                }
                return new jug(null, false, null, "response is null");
            }
            if (response.getCode() != 200) {
                if (logger != null) {
                    r7b.l(logger, tag, "checkResponseValid. url:" + url + ", response code is " + response.getCode(), null, null, 12, null);
                }
                return new jug(response.e(), false, null, "response code is " + response.getCode());
            }
            try {
                Long lC = response.c();
                if (lC == null) {
                    if (logger != null) {
                        r7b.l(logger, tag, "checkResponseValid. url:" + url + ", body is null.", null, null, 12, null);
                    }
                    return new jug(response.e(), false, null, "body is null");
                }
                if (lC.longValue() > 2097152) {
                    if (logger != null) {
                        r7b.l(logger, tag, "checkResponseValid. url:" + url + ", body large than 2M.", null, null, 12, null);
                    }
                    return new jug(response.e(), false, null, "too large body");
                }
                byte[] bArrA = response.a();
                if (bArrA == null) {
                    if (logger != null) {
                        r7b.l(logger, tag, "checkResponseValid. url:" + url + ", body is null.", null, null, 12, null);
                    }
                    return new jug(response.e(), false, null, "body is null");
                }
                Map<String, String> mapE = response.e();
                String str = mapE.get(ServerHostResponse.HTTPDNS_SIGNATURE);
                if (withSign) {
                    if (str == null || str.length() == 0) {
                        if (logger != null) {
                            r7b.l(logger, tag, "checkResponseValid. url:" + url + ", withSign:true, md5:null", null, null, 12, null);
                        }
                        return new jug(mapE, false, "", "signature is null");
                    }
                }
                String strA = rd2.a(bArrA);
                if (!withSign) {
                    if (logger != null) {
                        r7b.l(logger, tag, "checkResponseValid no sign. url:" + url + " ,header:" + mapE + ", bodyText:" + strA, null, null, 12, null);
                    }
                    return new jug(mapE, true, strA, null);
                }
                hug hugVar = hug.INSTANCE;
                byte[] bArrB = rd2.b(hugVar.e(env.getApiEnv()));
                byte[] bodyEnc = Base64.decode(bArrA, 0);
                if (bArrB != null) {
                    n nVar = n.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(bodyEnc, "bodyEnc");
                    byte[] bArrA2 = nVar.a(bodyEnc, bArrB);
                    Charset charsetDefaultCharset = Charset.defaultCharset();
                    Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "Charset.defaultCharset()");
                    String str2 = new String(bArrA2, charsetDefaultCharset);
                    byte[] sign = Base64.decode(str, 0);
                    e86 e86Var = e86.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(sign, "sign");
                    boolean zA = e86Var.a(bArrA2, sign, hugVar.f(env.getApiEnv()));
                    if (logger != null) {
                        r7b.l(logger, tag, "checkResponseValid. url:" + url + ", signature:" + sign + ", bodyText:\n" + str2 + ",result :" + zA, null, null, 12, null);
                    }
                    if (zA) {
                        return new jug(mapE, true, str2, null);
                    }
                }
                return new jug(mapE, false, null, "signature failed");
            } catch (Throwable th) {
                if (logger != null) {
                    r7b.d(logger, tag, "checkResponseValid. url:" + url + ", Throwable:" + j35.c(th.getMessage()), null, null, 12, null);
                }
                return new jug(null, false, null, th.getMessage());
            }
        }
    }

    public jug(@Nullable Map<String, String> map, boolean z, @Nullable String str, @Nullable String str2) {
        this.header = map;
        this.success = z;
        this.bodyText = str;
        this.msg = str2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    @Nullable
    public final Map<String, String> b() {
        return this.header;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "success:" + this.success + ", msg:" + this.msg + ". body:\n" + this.bodyText, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }
}
