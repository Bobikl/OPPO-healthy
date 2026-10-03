package com.pantanal.server.content.utils;

import android.net.Uri;
import com.amap.api.maps.model.MyLocationStyle;
import com.cloud.sdk.cloudstorage.http.HttpHeaders;
import com.heytap.log.formatter.LogFieldKey;
import com.lifesense.device.scale.data.entity.DeviceDao;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.f7b;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.oplus.utrace.sdk.CompletionType;
import com.oplus.utrace.sdk.UTrace;
import com.oplus.utrace.sdk.UTraceCompat;
import com.oplus.utrace.sdk.UTraceContext;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001AB\t\b\u0002¢\u0006\u0004\b?\u0010@J\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bH\u0007J&\u0010\f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bH\u0007J\u001c\u0010\u000f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007JB\u0010\u0017\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0007J,\u0010\u001a\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007J\u001a\u0010\u001d\u001a\u00020\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0007J\"\u0010\u001f\u001a\u00020\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0013H\u0007J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0003J\u0012\u0010\"\u001a\u00020!2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003J\u0014\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010%R\u0014\u0010)\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010%R\u0014\u0010*\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010%R\u0014\u0010+\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010%R\u0014\u0010,\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010-R\u0014\u00100\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010-R\u0014\u00101\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010-R\u0014\u00102\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010-R\u0014\u00103\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010-R\"\u00109\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010%R&\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=¨\u0006B"}, d2 = {"Lcom/pantanal/server/content/utils/UTraceUtils;", "", "", "traceNode", "Lcom/oplus/utrace/sdk/UTraceContext;", HttpHeaders.CTX, LogFieldKey.MESSAGE_KEY, "uTraceContext", "", UTraceSQLiteHelperKt.COL_TAGS, "", "b", "a", "Lcom/oplus/utrace/sdk/CompletionType;", "completionType", MapSchema.FIELD_NAME_ENTRY, "Lcom/pantanal/server/content/utils/UTraceUtils$ErrorType;", "errorType", MyLocationStyle.ERROR_INFO, "", "code", "methodName", "className", b2n.f, "", "exception", b2n.g, "Landroid/net/Uri;", ParserTag.TAG_URI, "c", "platformVersion", "d", "j", "", LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_KEY, "VERSION_KEY", "Ljava/lang/String;", "KEY_TRACE_SERVICE_ID", "KEY_TRACE_SERVICE_IDS", "KEY_TRACE_SCENE_ID", "KEY_TRACE_SERVICE_INSTANCE_ID", "TRACE_NODE_931000", "TRACE_NODE_931002", "ERROR_CODE_9310001", "I", "ERROR_CODE_9310002", "ERROR_CODE_9310003", "ERROR_CODE_9310021", "ERROR_CODE_9310022", "ERROR_CODE_9310023", "ERROR_CODE_9310024", "Z", "getUTraceIsOpen", "()Z", "setUTraceIsOpen", "(Z)V", "uTraceIsOpen", "KEY_URI_QUERY_PARAMETER_TRANCE", "", "Ljava/lang/ThreadLocal;", "Ljava/util/Map;", "traceContextMap", "<init>", "()V", "ErrorType", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class UTraceUtils {
    public static final int ERROR_CODE_9310001 = 9310001;
    public static final int ERROR_CODE_9310002 = 9310002;
    public static final int ERROR_CODE_9310003 = 9310003;
    public static final int ERROR_CODE_9310021 = 9310021;
    public static final int ERROR_CODE_9310022 = 9310022;
    public static final int ERROR_CODE_9310023 = 9310023;
    public static final int ERROR_CODE_9310024 = 9310024;

    @NotNull
    public static final String KEY_TRACE_SCENE_ID = "scene_id";

    @NotNull
    public static final String KEY_TRACE_SERVICE_ID = "service_id";

    @NotNull
    public static final String KEY_TRACE_SERVICE_IDS = "service_ids";

    @NotNull
    public static final String KEY_TRACE_SERVICE_INSTANCE_ID = "service_instance_id";

    @NotNull
    public static final String KEY_URI_QUERY_PARAMETER_TRANCE = "UTranceCtx";

    @NotNull
    public static final String TRACE_NODE_931000 = "931000";

    @NotNull
    public static final String TRACE_NODE_931002 = "931002";

    @NotNull
    public static final String VERSION_KEY = "static_sdk_ver";

    @NotNull
    public static final UTraceUtils INSTANCE = new UTraceUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean uTraceIsOpen = true;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, ThreadLocal<UTraceContext>> traceContextMap = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/pantanal/server/content/utils/UTraceUtils$ErrorType;", "", "(Ljava/lang/String;I)V", "CAUGHT", DeviceDao.TABLENAME, "COMPATIBILITY", "IPC", "ILLEGAL_CALL", "ILLEGAL_ARGS", "SWITCH", "PROCEDURE", "USER_SETTING", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum ErrorType {
        CAUGHT,
        DEVICE,
        COMPATIBILITY,
        IPC,
        ILLEGAL_CALL,
        ILLEGAL_ARGS,
        SWITCH,
        PROCEDURE,
        USER_SETTING
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorType.values().length];
            iArr[ErrorType.CAUGHT.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final void a(@Nullable UTraceContext uTraceContext, @NotNull Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (l(uTraceContext) && uTraceContext != null) {
            UTrace.addSpanTags(uTraceContext, tags);
            f7b.d("UTraceUtils", "[addSpanTags]  tags:" + tags + ", uTraceContext:" + uTraceContext);
        }
    }

    @JvmStatic
    public static final void b(@Nullable UTraceContext uTraceContext, @NotNull Map<String, String> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (uTraceContext == null) {
            return;
        }
        UTrace.addTraceTags(uTraceContext, tags);
        f7b.h("UTraceUtils", "[addTraceTags] tags:" + tags + ", uTraceContext:" + uTraceContext);
    }

    @JvmStatic
    @NotNull
    public static final Uri c(@Nullable UTraceContext uTraceContext, @NotNull Uri uri) {
        Uri resultUri;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!l(uTraceContext)) {
            return uri;
        }
        if (uTraceContext == null) {
            resultUri = uri;
        } else {
            Uri.Builder builder = uri.buildUpon();
            UTraceCompat uTraceCompat = UTraceCompat.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            resultUri = UTraceCompat.writeToUri$default(uTraceCompat, uTraceContext, builder, KEY_URI_QUERY_PARAMETER_TRANCE, null, 8, null).build();
        }
        f7b.h("UTraceUtils", "[appendTraceContextToUri] uTraceContext:" + uTraceContext + ", uri:" + uri + ", resultUri:" + resultUri);
        Intrinsics.checkNotNullExpressionValue(resultUri, "resultUri");
        return resultUri;
    }

    @JvmStatic
    @NotNull
    public static final Uri d(@Nullable UTraceContext uTraceContext, @NotNull Uri uri, int platformVersion) {
        Uri resultUri;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!l(uTraceContext)) {
            Uri uriBuild = uri.buildUpon().appendQueryParameter("platformVersion", String.valueOf(platformVersion)).build();
            Intrinsics.checkNotNullExpressionValue(uriBuild, "uri.buildUpon()\n        …rsion.toString()).build()");
            return uriBuild;
        }
        if (uTraceContext == null) {
            resultUri = uri.buildUpon().appendQueryParameter("platformVersion", String.valueOf(platformVersion)).build();
        } else {
            Uri.Builder builder = uri.buildUpon();
            builder.appendQueryParameter("platformVersion", String.valueOf(platformVersion));
            UTraceCompat uTraceCompat = UTraceCompat.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(builder, "builder");
            resultUri = UTraceCompat.writeToUri$default(uTraceCompat, uTraceContext, builder, KEY_URI_QUERY_PARAMETER_TRANCE, null, 8, null).build();
        }
        f7b.d("UTraceUtils", "[appendTraceContextToUri] uTraceContext:" + uTraceContext + ", uri:" + uri + ", resultUri:" + resultUri);
        Intrinsics.checkNotNullExpressionValue(resultUri, "resultUri");
        return resultUri;
    }

    @JvmStatic
    public static final synchronized void e(@Nullable UTraceContext uTraceContext, @NotNull CompletionType completionType) {
        Intrinsics.checkNotNullParameter(completionType, "completionType");
        if (l(uTraceContext)) {
            if (uTraceContext != null) {
                UTrace.end$default(uTraceContext, completionType, false, 4, null);
                f7b.d("UTraceUtils", Intrinsics.stringPlus("[end] uTraceContext:", uTraceContext));
            }
        }
    }

    public static /* synthetic */ void f(UTraceContext uTraceContext, CompletionType completionType, int i, Object obj) {
        if ((i & 2) != 0) {
            completionType = CompletionType.GOAHEAD;
        }
        e(uTraceContext, completionType);
    }

    @JvmStatic
    public static final void g(@Nullable UTraceContext uTraceContext, @NotNull ErrorType errorType, @NotNull String errorInfo, int code, @NotNull String methodName, @NotNull String className) {
        String str;
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(className, "className");
        if (l(uTraceContext)) {
            if (a.$EnumSwitchMapping$0[errorType.ordinal()] == 1) {
                str = errorType.name() + ':' + methodName + ':' + className + ':' + errorInfo;
            } else {
                str = errorType.name() + ':' + errorInfo;
            }
            if (uTraceContext != null) {
                UTrace.error(uTraceContext, code, str);
            }
            f7b.d("UTraceUtils", "[error]  errorCode:" + code + ", errorType:" + errorType + ", uTraceContext:" + uTraceContext + ", errorInfo:" + errorInfo);
        }
    }

    @JvmStatic
    public static final void h(@Nullable UTraceContext uTraceContext, @NotNull ErrorType errorType, @NotNull Throwable exception, int code) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (l(uTraceContext)) {
            String strJ = j(errorType, exception);
            if (uTraceContext != null) {
                UTrace.error(uTraceContext, code, strJ);
            }
            f7b.f("UTraceUtils", "[error from catch]  errorCode:" + code + " errorType:" + errorType + ", uTraceContext:" + uTraceContext + ", errorInfo:" + strJ);
        }
    }

    public static /* synthetic */ void i(UTraceContext uTraceContext, ErrorType errorType, String str, int i, String str2, String str3, int i2, Object obj) {
        String str4 = (i2 & 4) != 0 ? "" : str;
        if ((i2 & 8) != 0) {
            i = 0;
        }
        g(uTraceContext, errorType, str4, i, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3);
    }

    @JvmStatic
    public static final String j(ErrorType errorType, Throwable exception) {
        String strStringPlus = Intrinsics.stringPlus(errorType.name(), ":");
        StackTraceElement[] stackTrace = exception.getStackTrace();
        if (stackTrace.length < 2) {
            return strStringPlus;
        }
        StackTraceElement stackTraceElement = stackTrace[1];
        String fileName = stackTraceElement.getFileName();
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return strStringPlus + ((Object) className) + '.' + ((Object) methodName) + '(' + ((Object) fileName) + "/line:" + stackTraceElement.getLineNumber() + "):" + ((Object) exception.getMessage());
    }

    @JvmStatic
    @Nullable
    public static final UTraceContext k(@Nullable Uri uri) {
        f7b.d("UTraceUtils", Intrinsics.stringPlus("[getCtxFromUri] uri:", uri));
        if (uri == null) {
            return null;
        }
        UTraceContext fromUri$default = UTraceCompat.readFromUri$default(UTraceCompat.INSTANCE, uri, KEY_URI_QUERY_PARAMETER_TRANCE, null, 4, null);
        f7b.d("UTraceUtils", Intrinsics.stringPlus("[getCtxFromUri] uTraceContext:", fromUri$default));
        if (l(fromUri$default)) {
            return fromUri$default;
        }
        return null;
    }

    @JvmStatic
    public static final boolean l(UTraceContext ctx) {
        return uTraceIsOpen && ctx != null && Intrinsics.areEqual(OSUtils.c("com.pantanal.server.utrace.switch", "1"), "1");
    }

    @JvmStatic
    @Nullable
    public static final synchronized UTraceContext m(@NotNull String traceNode, @Nullable UTraceContext ctx) {
        Intrinsics.checkNotNullParameter(traceNode, "traceNode");
        UTraceContext uTraceContextStart$default = null;
        if (!l(ctx)) {
            return null;
        }
        if (ctx != null) {
            uTraceContextStart$default = UTrace.start$default(ctx, null, traceNode, 2, null);
            f7b.d("UTraceUtils", "[start] traceNode:" + traceNode + ", innerCtx:" + ctx);
        }
        return uTraceContextStart$default;
    }
}
