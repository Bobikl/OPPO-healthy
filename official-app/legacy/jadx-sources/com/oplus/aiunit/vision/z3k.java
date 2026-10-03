package com.oplus.aiunit.vision;

import android.net.Uri;
import android.text.TextUtils;
import com.heytap.common.util.TimeUtilKt;
import com.heytap.nearx.taphttp.core.HeyCenter;
import com.heytap.trace.TraceSegment;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Regex;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/z3k;", "", "Companion", "a", "com.heytap.nearx.apptrace"}, k = 1, mv = {1, 4, 0})
public final class z3k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final List<String> a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{".heytapmobi.", ".heytapmobile.", '.' + rd2.a(o04.INSTANCE.c()) + "mobile."});

    @NotNull
    public static final Regex b = new Regex("^((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})(\\.((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})){3}$");

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.z3k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J#\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/z3k$a;", "", "", "samplingRatio", "", b2n.g, "", "methodName", "Lcom/heytap/trace/TraceSegment;", "a", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/heytap/trace/TraceSegment;", "url", "method", "headerHost", "f", "c", "host", b2n.f, "oldPath", "i", "b", "", "domainWhitelist", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lkotlin/text/Regex;", "IP_MATH_REGEX", "Lkotlin/text/Regex;", MapSchema.FIELD_NAME_ENTRY, "()Lkotlin/text/Regex;", "MAX_SAMPLING_RATIO", "I", "<init>", "()V", "com.heytap.nearx.apptrace"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final TraceSegment a(@Nullable String methodName, @Nullable Integer samplingRatio) {
            if (samplingRatio != null) {
                try {
                    Companion companion = z3k.INSTANCE;
                    if (companion.h(samplingRatio.intValue())) {
                        String strC = companion.c();
                        if (methodName == null || methodName.length() == 0) {
                            return null;
                        }
                        dm9 dm9Var = (dm9) HeyCenter.INSTANCE.c(dm9.class);
                        TraceSegment traceSegment = new TraceSegment();
                        if (dm9Var != null) {
                            traceSegment.setAppPackage(b());
                            traceSegment.setAppVersion(dm9Var.a());
                            traceSegment.setModel(dm9Var.model());
                            traceSegment.setBrand(dm9Var.brand());
                        }
                        traceSegment.setTraceId(strC);
                        traceSegment.setLevel("1.1");
                        traceSegment.setStartTime(TimeUtilKt.b());
                        traceSegment.setMethodName(methodName);
                        return traceSegment;
                    }
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        public final String b() {
            dm9 dm9Var = (dm9) HeyCenter.INSTANCE.c(dm9.class);
            String strPackageName = dm9Var != null ? dm9Var.packageName() : null;
            if (TextUtils.isEmpty(strPackageName)) {
                return strPackageName;
            }
            return strPackageName != null ? new Regex("\\.").replace(strPackageName, "-") : null;
        }

        @NotNull
        public final String c() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "UUID.randomUUID().toString()");
            return new Regex("-").replace(string, "");
        }

        @NotNull
        public final List<String> d() {
            return z3k.a;
        }

        @NotNull
        public final Regex e() {
            return z3k.b;
        }

        @Nullable
        public final String f(@NotNull String url, @NotNull String method, @Nullable String headerHost) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(method, "method");
            Uri httpUrl = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(httpUrl, "httpUrl");
            String host = httpUrl.getHost();
            if (!(host == null || host.length() == 0) && !e().matches(host)) {
                headerHost = host;
            }
            if (headerHost == null) {
                return null;
            }
            int length = headerHost.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) headerHost.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String string = headerHost.subSequence(i, length + 1).toString();
            if (string.length() == 0) {
                return null;
            }
            if (!g(string)) {
                return method + " " + httpUrl.getScheme() + "://" + string;
            }
            return method + " " + httpUrl.getScheme() + "://" + string + i(httpUrl.getEncodedPath());
        }

        public final boolean g(String host) {
            if (host.length() == 0) {
                return false;
            }
            Iterator<String> it = d().iterator();
            while (it.hasNext()) {
                if (StringsKt__StringsKt.contains$default((CharSequence) host, (CharSequence) it.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean h(int samplingRatio) {
            if (samplingRatio >= 100000) {
                return true;
            }
            return samplingRatio > 0 && new Random().nextInt(100000) < samplingRatio;
        }

        public final String i(String oldPath) {
            if (oldPath == null) {
                return oldPath;
            }
            return new Regex("TOKEN_.{30}").replace(new Regex("\\d{7,}").replace(oldPath, "**"), "TOKEN_**");
        }
    }
}
