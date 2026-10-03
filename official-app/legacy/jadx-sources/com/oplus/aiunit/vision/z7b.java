package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.CloudDownloadWorker;
import com.heytap.log.HLog;
import com.heytap.log.Settings;
import io.protostuff.MapSchema;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007J\u001c\u0010\u000e\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007J\u001c\u0010\u000f\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/z7b;", "", "Landroid/content/Context;", "context", "", b2n.f, "i", "", "content", MapSchema.FIELD_NAME_ENTRY, "tag", "message", "b", "f", "j", "c", "Ljava/io/File;", "d", "PUSH_DESC", "Ljava/lang/String;", "business", "key", CloudDownloadWorker.KEY_SECRET, "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLoggerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoggerHelper.kt\ncom/heytap/health/base/log/logger/LoggerHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,183:1\n731#2,9:184\n37#3,2:193\n*S KotlinDebug\n*F\n+ 1 LoggerHelper.kt\ncom/heytap/health/base/log/logger/LoggerHelper\n*L\n103#1:184,9\n104#1:193,2\n*E\n"})
public final class z7b {

    @NotNull
    public static final z7b INSTANCE = new z7b();

    @NotNull
    public static final String PUSH_DESC = "log";

    @NotNull
    public static final String business = "health";

    @NotNull
    public static final String key = "314";

    @NotNull
    public static final String secret = "VjVWunjiTWgshhJ8MKVRsyHQrp87uI3i";

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/z7b$a", "Lcom/heytap/log/Settings$IOpenIdProvider;", "", "getGuid", "getOuid", "getDuid", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Settings.IOpenIdProvider {
        @Override // com.heytap.log.Settings.IOpenIdProvider
        @NotNull
        public String getDuid() {
            String strI = old.i();
            StringBuilder sb = new StringBuilder();
            sb.append("Duid: ");
            sb.append(strI);
            String strI2 = old.i();
            Intrinsics.checkNotNullExpressionValue(strI2, "getVaid()");
            return strI2;
        }

        @Override // com.heytap.log.Settings.IOpenIdProvider
        @NotNull
        public String getGuid() {
            return "";
        }

        @Override // com.heytap.log.Settings.IOpenIdProvider
        @NotNull
        public String getOuid() {
            String strH = old.h();
            StringBuilder sb = new StringBuilder();
            sb.append("Ouid: ");
            sb.append(strH);
            String strH2 = old.h();
            Intrinsics.checkNotNullExpressionValue(strH2, "getOaid()");
            return strH2;
        }
    }

    @JvmStatic
    public static final void b(@Nullable String tag, @Nullable String message) {
        HLog.d(tag, message);
    }

    @JvmStatic
    public static final void c(@Nullable String tag, @Nullable String message) {
        HLog.e(tag, message);
    }

    @JvmStatic
    public static final void e(@NotNull Context context, @NotNull String content) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            if (HLog.getInnerLog() == null) {
                g(context);
            }
            JSONObject jSONObject = new JSONObject(content).getJSONObject("content");
            a7b.f("LoggerHelper", "internalContent: " + jSONObject);
            HLog.checkOPushDataContent(jSONObject.toString());
        } catch (Exception e2) {
            a7b.b("LoggerHelper", e2.toString());
        }
    }

    @JvmStatic
    public static final void f(@Nullable String tag, @Nullable String message) {
        HLog.i(tag, message);
    }

    @JvmStatic
    public static final void g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HLog.initHLog(context, new Settings.Builder(context, "health", key, secret, new Settings.ICustomIDProvider() { // from class: com.oplus.aiunit.vision.y7b
            @Override // com.heytap.log.Settings.ICustomIDProvider
            public final String getCustomID() {
                return z7b.h();
            }
        }, new a()).consoleLogLevel(6).fileLogLevel(2).fileExpireDays(14).setRegion("CN").build());
    }

    public static final String h() {
        return "";
    }

    @JvmStatic
    public static final void i() {
        String str = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now());
        Intrinsics.checkNotNullExpressionValue(str, "dtf.format(LocalDateTime.now())");
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(str, " ", "_", false, 4, (Object) null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        HLog.getInnerLog().reportUpload("health", "", jCurrentTimeMillis - 86400000, jCurrentTimeMillis, false, "", key, strReplace$default, secret);
    }

    @JvmStatic
    public static final void j(@Nullable String tag, @Nullable String message) {
        HLog.w(tag, message);
    }

    @Nullable
    public final File d() {
        File externalCacheDir = b78.a().getExternalCacheDir();
        if (externalCacheDir == null) {
            return null;
        }
        return new File(externalCacheDir, "HeyTap/HLog_file");
    }
}
