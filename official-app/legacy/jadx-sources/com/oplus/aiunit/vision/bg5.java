package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.R$string;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.log.collect.auto.SystemInfoCollect;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/bg5;", "", "Companion", "a", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class bg5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.bg5$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001c\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0002H\u0007J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0002H\u0007J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0002H\u0007J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0002H\u0007J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0007J(\u0010'\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0007J\b\u0010(\u001a\u00020\u0012H\u0007J\u0012\u0010+\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)H\u0007¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/bg5$a;", "", "", "", "startIndex", SecureGcmConstants.MESSAGE_KEY, "endIndex", "Q", SystemInfoCollect.IMEI, "o", "SN", "q", "content", "index", "K", "len", "J", ServiceNodeBundleKeys.DEVICE_NAME, "", c8l.KEY_B, "deviceModel", "z", "osVersion", "D", "guid", "t", "mac", "x", LogFieldKey.PROCESS_NAME_KEY, "v", "eid", "r", UserInfo.SEX_FEMALE, "", "weight", "L", "nikcName", "birthday", Fields.HEIGHT_FIELD, "H", "N", "", "appName", LogFieldKey.MESSAGE_KEY, "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDeviceDualListCollectionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDualListCollectionHelper.kt\ncom/heytap/health/base/utils/DeviceDualListCollectionHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n1#2:313\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void A(String str) {
            n7a.Companion.d(n7a.INSTANCE, 16, 6, (str != null ? bg5.INSTANCE.Q(str, 0, 3) : null) + "***", 0L, 0L, null, 56, null);
        }

        public static final void C(String str) {
            n7a.Companion.d(n7a.INSTANCE, 15, 6, (str != null ? bg5.INSTANCE.Q(str, 0, 3) : null) + "***", 0L, 0L, null, 56, null);
        }

        public static final void E(String str) {
            n7a.Companion.d(n7a.INSTANCE, 17, 6, (str != null ? bg5.INSTANCE.Q(str, 0, 2) : null) + "***", 0L, 0L, null, 56, null);
        }

        public static final void G(String SN) {
            Intrinsics.checkNotNullParameter(SN, "$SN");
            n7a.Companion.d(n7a.INSTANCE, 30, 6, bg5.INSTANCE.q(SN), 0L, 0L, null, 56, null);
        }

        public static final void I(String nikcName, String birthday, String height, String weight) {
            Intrinsics.checkNotNullParameter(nikcName, "$nikcName");
            Intrinsics.checkNotNullParameter(birthday, "$birthday");
            Intrinsics.checkNotNullParameter(height, "$height");
            Intrinsics.checkNotNullParameter(weight, "$weight");
            String str = b78.a().getString(R$string.lib_base_device_family_relations_dual_list_collection) + nikcName;
            String str2 = b78.a().getString(R$string.lib_base_device_family_sex_dual_list_collection) + "*";
            String string = b78.a().getString(R$string.lib_base_device_family_birthday_dual_list_collection);
            Companion companion = bg5.INSTANCE;
            String str3 = string + companion.K(birthday, 4);
            String str4 = b78.a().getString(R$string.lib_base_device_family_height_dual_list_collection) + companion.K(height, 1);
            String str5 = b78.a().getString(R$string.lib_base_device_family_weight_dual_list_collection) + companion.K(weight, 1);
            n7a.Companion companion2 = n7a.INSTANCE;
            String str6 = "" + str + "\\n" + str2 + "\\n" + str3 + "\\n" + str4 + "\\n" + str5 + "\\n";
            Intrinsics.checkNotNullExpressionValue(str6, "content.toString()");
            n7a.Companion.d(companion2, 75, 3, str6, 0L, 0L, null, 56, null);
        }

        public static final void M(double d) {
            n7a.Companion.d(n7a.INSTANCE, 4, 1, bg5.INSTANCE.K(String.valueOf(d), 1) + " kg", 0L, 0L, null, 56, null);
        }

        public static final void O() {
            String string = b78.a().getString(R$string.lib_base_device_data_sync_dual_list_collection_sports_records);
            Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        …ollection_sports_records)");
            n7a.Companion.d(n7a.INSTANCE, 62, 5, string, 0L, 0L, null, 56, null);
        }

        public static final void n(CharSequence charSequence) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence.charAt(0));
            int length = charSequence.length();
            for (int i = 1; i < length; i++) {
                sb.append("*");
            }
            n7a.Companion companion = n7a.INSTANCE;
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "str.toString()");
            n7a.Companion.d(companion, 24, 6, string, 0L, 0L, null, 56, null);
        }

        public static final void s(String eid) {
            Intrinsics.checkNotNullParameter(eid, "$eid");
            String content = v0j.a(eid, 6, 2);
            n7a.Companion companion = n7a.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            n7a.Companion.d(companion, 32, 6, content, 0L, 0L, null, 56, null);
        }

        public static final void u(String str) {
            n7a.Companion.d(n7a.INSTANCE, 29, 6, (str != null ? bg5.INSTANCE.Q(str, 0, 2) : null) + "***", 0L, 0L, null, 56, null);
        }

        public static final void w(String IMEI) {
            Intrinsics.checkNotNullParameter(IMEI, "$IMEI");
            n7a.Companion.d(n7a.INSTANCE, 27, 6, bg5.INSTANCE.o(IMEI), 0L, 0L, null, 56, null);
        }

        public static final void y(String mac) {
            Intrinsics.checkNotNullParameter(mac, "$mac");
            n7a.Companion.d(n7a.INSTANCE, 37, 6, bg5.INSTANCE.p(mac), 0L, 0L, null, 56, null);
        }

        @JvmStatic
        public final void B(@Nullable final String deviceName) {
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.yf5
                @Override // java.lang.Runnable
                public final void run() {
                    bg5.Companion.C(deviceName);
                }
            });
        }

        @JvmStatic
        public final void D(@Nullable final String osVersion) {
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.xf5
                @Override // java.lang.Runnable
                public final void run() {
                    bg5.Companion.E(osVersion);
                }
            });
        }

        @JvmStatic
        public final void F(@NotNull final String SN) {
            Intrinsics.checkNotNullParameter(SN, "SN");
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.vf5
                @Override // java.lang.Runnable
                public final void run() {
                    bg5.Companion.G(SN);
                }
            });
        }

        @JvmStatic
        public final void H(@NotNull final String nikcName, @NotNull final String birthday, @NotNull final String height, @NotNull final String weight) {
            Intrinsics.checkNotNullParameter(nikcName, "nikcName");
            Intrinsics.checkNotNullParameter(birthday, "birthday");
            Intrinsics.checkNotNullParameter(height, "height");
            Intrinsics.checkNotNullParameter(weight, "weight");
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.pf5
                @Override // java.lang.Runnable
                public final void run() {
                    bg5.Companion.I(nikcName, birthday, height, weight);
                }
            });
        }

        public final String J(int len) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len; i++) {
                sb.append("*");
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }

        public final String K(String content, int index) {
            if (TextUtils.isEmpty(content)) {
                return content;
            }
            return Q(content, 0, index) + J(content.length() - index);
        }

        @JvmStatic
        public final void L(final double weight) {
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.rf5
                @Override // java.lang.Runnable
                public final void run() {
                    bg5.Companion.M(weight);
                }
            });
        }

        @JvmStatic
        public final void N() {
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.zf5
                @Override // java.lang.Runnable
                public final void run() {
                    bg5.Companion.O();
                }
            });
        }

        public final String P(String str, int i) {
            Object objM5287constructorimpl;
            if (str.length() == 0) {
                return "";
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                String strSubstring = str.substring(i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                objM5287constructorimpl = Result.m5287constructorimpl(strSubstring);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            return (String) (Result.m5290exceptionOrNullimpl(objM5287constructorimpl) == null ? objM5287constructorimpl : "");
        }

        public final String Q(String str, int i, int i2) {
            Object objM5287constructorimpl;
            if (str.length() == 0) {
                return "";
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                String strSubstring = str.substring(i, i2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                objM5287constructorimpl = Result.m5287constructorimpl(strSubstring);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            return (String) (Result.m5290exceptionOrNullimpl(objM5287constructorimpl) == null ? objM5287constructorimpl : "");
        }

        @JvmStatic
        public final void m(@Nullable final CharSequence appName) {
            if (appName != null) {
                ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.wf5
                    @Override // java.lang.Runnable
                    public final void run() {
                        bg5.Companion.n(appName);
                    }
                });
            }
        }

        public final String o(String IMEI) {
            if (TextUtils.isEmpty(IMEI) || IMEI.length() < 15) {
                return IMEI;
            }
            return Q(IMEI, 0, 6) + "***" + P(IMEI, IMEI.length() - 2);
        }

        @NotNull
        public final String p(@NotNull String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            if (TextUtils.isEmpty(mac) || mac.length() < 8) {
                return mac;
            }
            return Q(mac, 0, 2) + ":**:**:" + P(mac, mac.length() - 2);
        }

        public final String q(String SN) {
            if (TextUtils.isEmpty(SN) || SN.length() < 15) {
                return SN;
            }
            return Q(SN, 0, 6) + "***" + P(SN, SN.length() - 2);
        }

        @JvmStatic
        public final void r(@NotNull final String eid) {
            Intrinsics.checkNotNullParameter(eid, "eid");
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.qf5
                @Override // java.lang.Runnable
                public final void run() {
                    bg5.Companion.s(eid);
                }
            });
        }

        @JvmStatic
        public final void t(@Nullable final String guid) {
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.uf5
                @Override // java.lang.Runnable
                public final void run() {
                    bg5.Companion.u(guid);
                }
            });
        }

        @JvmStatic
        public final void v(@NotNull final String IMEI) {
            Intrinsics.checkNotNullParameter(IMEI, "IMEI");
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.ag5
                @Override // java.lang.Runnable
                public final void run() {
                    bg5.Companion.w(IMEI);
                }
            });
        }

        @JvmStatic
        public final void x(@NotNull final String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.sf5
                @Override // java.lang.Runnable
                public final void run() {
                    bg5.Companion.y(mac);
                }
            });
        }

        @JvmStatic
        public final void z(@Nullable final String deviceModel) {
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.tf5
                @Override // java.lang.Runnable
                public final void run() {
                    bg5.Companion.A(deviceModel);
                }
            });
        }
    }

    @JvmStatic
    public static final void a(@NotNull String str) {
        INSTANCE.r(str);
    }

    @JvmStatic
    public static final void b(@NotNull String str) {
        INSTANCE.v(str);
    }

    @JvmStatic
    public static final void c(@NotNull String str) {
        INSTANCE.x(str);
    }

    @JvmStatic
    public static final void d(@Nullable String str) {
        INSTANCE.z(str);
    }

    @JvmStatic
    public static final void e(@Nullable String str) {
        INSTANCE.B(str);
    }

    @JvmStatic
    public static final void f(@Nullable String str) {
        INSTANCE.D(str);
    }

    @JvmStatic
    public static final void g(@NotNull String str) {
        INSTANCE.F(str);
    }

    @JvmStatic
    public static final void h(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        INSTANCE.H(str, str2, str3, str4);
    }

    @JvmStatic
    public static final void i(double d) {
        INSTANCE.L(d);
    }

    @JvmStatic
    public static final void j() {
        INSTANCE.N();
    }
}
