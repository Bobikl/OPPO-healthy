package com.oplus.aiunit.vision;

import com.heytap.common.LogLevel;
import com.heytap.httpdns.env.ApiEnv;
import com.heytap.httpdns.webkit.extension.util.DnsEnv;
import com.heytap.httpdns.webkit.extension.util.DnsLogLevel;
import com.heytap.store.base.core.http.HttpConst;
import io.protostuff.MapSchema;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/xq9;", "httpHandler", "Lcom/oplus/aiunit/vision/hw9;", "f", "Lcom/heytap/httpdns/webkit/extension/util/DnsLogLevel;", "level", "Lcom/heytap/common/LogLevel;", b2n.g, "Lcom/heytap/httpdns/webkit/extension/util/DnsEnv;", HttpConst.SERVER_ENV, "Lcom/heytap/httpdns/env/ApiEnv;", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/op9;", "logHook", "Lcom/oplus/aiunit/vision/r7b$b;", b2n.f, "com.heytap.nearx.httpdns"}, k = 2, mv = {1, 4, 0})
public final class b89 {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/b89$a", "Lcom/oplus/aiunit/vision/hw9;", "Lcom/oplus/aiunit/vision/gw9;", "request", "Lcom/oplus/aiunit/vision/jw9;", "a", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
    public static final class a implements hw9 {
        public final /* synthetic */ xq9 a;

        public a(xq9 xq9Var) {
            this.a = xq9Var;
        }

        @Override // com.oplus.aiunit.vision.hw9
        @NotNull
        public jw9 a(@NotNull gw9 request) throws IOException {
            Intrinsics.checkNotNullParameter(request, "request");
            return this.a.doRequest(new ck9(request)).getCom.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ=\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ=\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ=\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"com/oplus/aiunit/vision/b89$b", "Lcom/oplus/aiunit/vision/r7b$b;", "", "tag", "format", "", "error", "", "", "obj", "", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)Z", MapSchema.FIELD_NAME_ENTRY, "i", "v", "w", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
    public static final class b implements r7b.b {
        public final /* synthetic */ op9 a;

        public b(op9 op9Var) {
            this.a = op9Var;
        }

        @Override // com.oplus.aiunit.vision.r7b.b
        public boolean d(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(obj, "obj");
            return this.a.d(tag, format, error);
        }

        @Override // com.oplus.aiunit.vision.r7b.b
        public boolean e(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(obj, "obj");
            return this.a.e(tag, format, error);
        }

        @Override // com.oplus.aiunit.vision.r7b.b
        public boolean i(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(obj, "obj");
            return this.a.i(tag, format, error);
        }

        @Override // com.oplus.aiunit.vision.r7b.b
        public boolean v(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(obj, "obj");
            return this.a.v(tag, format, error);
        }

        @Override // com.oplus.aiunit.vision.r7b.b
        public boolean w(@NotNull String tag, @NotNull String format, @Nullable Throwable error, @NotNull Object... obj) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(obj, "obj");
            return this.a.w(tag, format, error);
        }
    }

    public static final ApiEnv e(DnsEnv dnsEnv) {
        int i = a89.$EnumSwitchMapping$1[dnsEnv.ordinal()];
        if (i == 1) {
            return ApiEnv.RELEASE;
        }
        if (i == 2) {
            return ApiEnv.TEST;
        }
        if (i == 3) {
            return ApiEnv.DEV;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final hw9 f(xq9 xq9Var) {
        return new a(xq9Var);
    }

    public static final r7b.b g(op9 op9Var) {
        return new b(op9Var);
    }

    public static final LogLevel h(DnsLogLevel dnsLogLevel) {
        switch (a89.$EnumSwitchMapping$0[dnsLogLevel.ordinal()]) {
            case 1:
                return LogLevel.LEVEL_VERBOSE;
            case 2:
                return LogLevel.LEVEL_DEBUG;
            case 3:
                return LogLevel.LEVEL_INFO;
            case 4:
                return LogLevel.LEVEL_WARNING;
            case 5:
                return LogLevel.LEVEL_ERROR;
            case 6:
                return LogLevel.LEVEL_NONE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
