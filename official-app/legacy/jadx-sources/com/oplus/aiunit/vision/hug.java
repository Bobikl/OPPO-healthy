package com.oplus.aiunit.vision;

import com.heytap.httpdns.env.ApiEnv;
import com.heytap.httpdns.env.WhiteHttpPolicy;
import com.heytap.store.base.core.http.HttpConst;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\t\u000b\r\bB\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0003\u001a\u00020\u0007R\"\u0010\u0011\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/hug;", "", "Lcom/heytap/httpdns/env/ApiEnv;", HttpConst.SERVER_ENV, "", "f", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/dp6;", "d", "a", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setDEFAULT_EXT_DNS_HOST$com_heytap_nearx_httpdns", "(Ljava/lang/String;)V", "DEFAULT_EXT_DNS_HOST", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class hug {
    public static final hug INSTANCE = new hug();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static String DEFAULT_EXT_DNS_HOST = ky6.INSTANCE.a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/hug$a;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "HTTPDNS_GET", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
    public static final class a {
        public static final a INSTANCE = new a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final String HTTPDNS_GET = "/httpdns/get";

        @NotNull
        public final String a() {
            return HTTPDNS_GET;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0005R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\n\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/hug$b;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "DN_LIST", "b", "getGET_SET", "GET_SET", "c", "getDNS", "DNS", "d", "GET_HTTPDNS_SERVER_LIST", MapSchema.FIELD_NAME_ENTRY, "GET_SET_AND_IP", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
    public static final class b {
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final String DN_LIST = "/getDNList";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final String GET_SET = "/getSet";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final String DNS = "/d";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public static final String GET_HTTPDNS_SERVER_LIST = "/getHttpDnsServerList";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final String GET_SET_AND_IP = "/v2/d";

        @NotNull
        public final String a() {
            return DN_LIST;
        }

        @NotNull
        public final String b() {
            return GET_HTTPDNS_SERVER_LIST;
        }

        @NotNull
        public final String c() {
            return GET_SET_AND_IP;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/hug$c;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "SECURITY_HEADER_KEY", "b", "SECURITY_HEADER_VALUE", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
    public static final class c {
        public static final c INSTANCE = new c();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final String SECURITY_HEADER_KEY = "Accept-Security";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final String SECURITY_HEADER_VALUE = com.alipay.sdk.m.x.c.d;

        @NotNull
        public final String a() {
            return SECURITY_HEADER_KEY;
        }

        @NotNull
        public final String b() {
            return SECURITY_HEADER_VALUE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/hug$d;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "PUBLIC_KEY_RLS", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
    public static final class d {
        public static final d INSTANCE = new d();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final String PUBLIC_KEY_RLS = "3059301306072a8648ce3d020106082a8648ce3d030107034200043d5a5fb0fea339b515ac2b91a351edde77cc26b952d29a13d2f731397dcc6f8c96414d195df40901a42c0bfd2afe50b51b68133bc5262784eda909f599ec4426";

        @NotNull
        public final String a() {
            return PUBLIC_KEY_RLS;
        }
    }

    static {
        List<String> listD = xo6.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (!StringsKt__StringsJVMKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WhiteHttpPolicy.INSTANCE.add(StringsKt__StringsJVMKt.replace$default((String) it.next(), "http://", "", false, 4, (Object) null));
        }
        ky6 ky6Var = ky6.INSTANCE;
        if (!StringsKt__StringsJVMKt.isBlank(ky6Var.a())) {
            WhiteHttpPolicy.INSTANCE.add(StringsKt__StringsJVMKt.replace$default(ky6Var.a(), "http://", "", false, 4, (Object) null));
        }
        try {
            WhiteHttpPolicy whiteHttpPolicy = WhiteHttpPolicy.INSTANCE;
            String strE = srj.e();
            Intrinsics.checkNotNullExpressionValue(strE, "com.heytap.env.TestEnv.tapHttpDnsHostTest()");
            whiteHttpPolicy.add(StringsKt__StringsJVMKt.replace$default(strE, "http://", "", false, 4, (Object) null));
            String strD = srj.d();
            Intrinsics.checkNotNullExpressionValue(strD, "com.heytap.env.TestEnv.tapHttpDnsHostDev()");
            whiteHttpPolicy.add(StringsKt__StringsJVMKt.replace$default(strD, "http://", "", false, 4, (Object) null));
        } catch (Throwable unused) {
        }
    }

    @NotNull
    public final String a(@NotNull dp6 env) {
        Intrinsics.checkNotNullParameter(env, "env");
        if (iug.$EnumSwitchMapping$3[env.getApiEnv().ordinal()] != 1) {
            return ky6.INSTANCE.a();
        }
        String strF = srj.f();
        Intrinsics.checkNotNullExpressionValue(strF, "com.heytap.env.TestEnv.tapHttpExtDnsHost()");
        return strF;
    }

    @NotNull
    public final List<String> b(@NotNull dp6 env) {
        Intrinsics.checkNotNullParameter(env, "env");
        if (env.getIsReleaseEnv() && env.getIsRegionCN()) {
            try {
                return StringsKt__StringsKt.split$default((CharSequence) ky6.INSTANCE.b(), new String[]{","}, false, 0, 6, (Object) null);
            } catch (Throwable unused) {
            }
        }
        return new ArrayList();
    }

    @NotNull
    public final String c() {
        return DEFAULT_EXT_DNS_HOST;
    }

    @NotNull
    public final String d(@NotNull dp6 env) {
        Intrinsics.checkNotNullParameter(env, "env");
        String strC = xo6.c(env.getRegion());
        int i = iug.$EnumSwitchMapping$2[env.getApiEnv().ordinal()];
        if (i == 1) {
            String host = srj.e();
            if (StringsKt__StringsJVMKt.startsWith(strC, "https:", true)) {
                Intrinsics.checkNotNullExpressionValue(host, "host");
                strC = StringsKt__StringsJVMKt.replace$default(host, "http://", "https://", false, 4, (Object) null);
            } else {
                strC = host;
            }
            Intrinsics.checkNotNullExpressionValue(strC, "if(productHost.startsWit…   host\n                }");
        } else if (i == 2) {
            String host2 = srj.d();
            if (StringsKt__StringsJVMKt.startsWith(strC, "https:", true)) {
                Intrinsics.checkNotNullExpressionValue(host2, "host");
                strC = StringsKt__StringsJVMKt.replace$default(host2, "http://", "https://", false, 4, (Object) null);
            } else {
                strC = host2;
            }
            Intrinsics.checkNotNullExpressionValue(strC, "if(productHost.startsWit…   host\n                }");
        }
        return strC;
    }

    @NotNull
    public final String e(@NotNull ApiEnv env) {
        Intrinsics.checkNotNullParameter(env, "env");
        int i = iug.$EnumSwitchMapping$1[env.ordinal()];
        if (i != 1 && i != 2) {
            return ay5.b();
        }
        return ay5.a();
    }

    @NotNull
    public final String f(@NotNull ApiEnv env) {
        Intrinsics.checkNotNullParameter(env, "env");
        int i = iug.$EnumSwitchMapping$0[env.ordinal()];
        if (i == 1) {
            String strH = srj.h();
            Intrinsics.checkNotNullExpressionValue(strH, "com.heytap.env.TestEnv.taphttpPublicKeyTest()");
            return strH;
        }
        if (i != 2) {
            return d.INSTANCE.a();
        }
        String strG = srj.g();
        Intrinsics.checkNotNullExpressionValue(strG, "com.heytap.env.TestEnv.taphttpPublicKeyDev()");
        return strG;
    }
}
