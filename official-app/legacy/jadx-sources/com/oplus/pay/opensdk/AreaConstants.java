package com.oplus.pay.opensdk;

import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.z6m;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/oplus/pay/opensdk/AreaConstants;", "", "Lcom/oplus/pay/opensdk/AreaConstants$Env;", HttpConst.SERVER_ENV, "", "region", "a", "b", "merchantServeRegion", "c", "GET_URL_OVERSEAS_PATH", "Ljava/lang/String;", "DEV", "TEST1", "TEST3", "<init>", "()V", "Env", "paysdk_release"}, k = 1, mv = {1, 8, 0})
public final class AreaConstants {

    @NotNull
    public static final String DEV = "`||x2''xiq%kdamf|%szmoagfu%lm~&\u007fifqgd&kge";

    @NotNull
    public static final String GET_URL_OVERSEAS_PATH = "/plugin/post/appdownload/";

    @NotNull
    public static final AreaConstants INSTANCE = new AreaConstants();

    @NotNull
    public static final String TEST1 = "`||x2''xiq%kdamf|%szmoagfu%|m{|&\u007fifqgd&kge";

    @NotNull
    public static final String TEST3 = "`||x2''xiq%kdamf|%szmoagfu%|m{|8;&\u007fifqgd&kge";

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/oplus/pay/opensdk/AreaConstants$Env;", "", "", "envName", "Ljava/lang/String;", "getEnvName", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "DEV", "TEST1", "TEST3", "GRAY", "RELEASE", "paysdk_release"}, k = 1, mv = {1, 8, 0})
    public enum Env {
        DEV("dev"),
        TEST1("test1"),
        TEST3("test3"),
        GRAY("gray"),
        RELEASE("release");


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String envName;

        /* JADX INFO: renamed from: com.oplus.pay.opensdk.AreaConstants$Env$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/pay/opensdk/AreaConstants$Env$a;", "", "", "envName", "Lcom/oplus/pay/opensdk/AreaConstants$Env;", "a", "<init>", "()V", "paysdk_release"}, k = 1, mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nAreaConstants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaConstants.kt\ncom/oplus/pay/opensdk/AreaConstants$Env$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
            @JvmStatic
            @NotNull
            public final Env a(@NotNull String envName) {
                Intrinsics.checkNotNullParameter(envName, "envName");
                for (Env env : Env.values()) {
                    if (StringsKt__StringsJVMKt.equals(env.getEnvName(), envName, true)) {
                        if (env == null) {
                            return Env.RELEASE;
                        }
                        return env;
                    }
                }
                env = null;
                if (env == null) {
                    return Env.RELEASE;
                }
                return env;
            }
        }

        Env(String str) {
            this.envName = str;
        }

        @JvmStatic
        @NotNull
        public static final Env fromString(@NotNull String str) {
            return INSTANCE.a(str);
        }

        @NotNull
        public final String getEnvName() {
            return this.envName;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Env.values().length];
            try {
                iArr[Env.DEV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Env.TEST1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Env.TEST3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Env.GRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Env.RELEASE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    @NotNull
    public static final String a(@NotNull Env env, @NotNull String region) {
        String strA;
        Pair pair;
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(region, "region");
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[env.ordinal()];
        if (i == 1) {
            strA = z6m.a(DEV);
        } else if (i == 2) {
            strA = z6m.a(TEST1);
        } else if (i == 3) {
            strA = z6m.a(TEST3);
        } else if (i == 4) {
            strA = "https://pay-preclient-{region}.{host}.com";
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            strA = "https://pay-client-{region}.{host}.com";
        }
        String template = strA;
        if (Intrinsics.areEqual(region, "cn")) {
            pair = TuplesKt.to(region, "heytapmobi");
        } else {
            if (env != Env.RELEASE) {
                region = "sg";
            }
            pair = TuplesKt.to(region, "heytapmobile");
        }
        String str = (String) pair.component1();
        String str2 = (String) pair.component2();
        Intrinsics.checkNotNullExpressionValue(template, "template");
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(template, "{region}", str, false, 4, (Object) null);
        int i2 = iArr[env.ordinal()];
        return (i2 == 4 || i2 == 5) ? StringsKt__StringsJVMKt.replace$default(strReplace$default, "{host}", str2, false, 4, (Object) null) : strReplace$default;
    }

    @JvmStatic
    @NotNull
    public static final String b(@NotNull String env, @NotNull String region) {
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(region, "region");
        return a(Env.INSTANCE.a(env), region);
    }

    @JvmStatic
    @NotNull
    public static final String c(@NotNull String merchantServeRegion) {
        Intrinsics.checkNotNullParameter(merchantServeRegion, "merchantServeRegion");
        String upperCase = merchantServeRegion.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (Intrinsics.areEqual(upperCase, "CN")) {
            return "cn";
        }
        return Intrinsics.areEqual(upperCase, alf.IN) ? "in" : "sg";
    }
}
