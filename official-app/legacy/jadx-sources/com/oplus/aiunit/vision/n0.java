package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.webview.extension.activity.FragmentStyle;
import com.oplus.aiunit.core.data.ServiceType;
import com.oplus.aiunit.core.protocol.common.ErrorCode;
import com.oplus.aiunit.core.service.IServiceManager;
import com.opos.process.bridge.base.BridgeConstant;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/n0;", "", "Companion", "a", "aiunit.sdk.core_release"}, k = 1, mv = {1, 9, 0})
public final class n0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.n0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007J$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0014\u001a\u00020\u0006H\u0007J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0007J$\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007R\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/n0$a;", "", "Landroid/content/Context;", "context", "", "minVersionCode", "", b2n.g, "", "detectName", "Landroid/os/Bundle;", BridgeConstant.KEY_EXTRAS, "j", "c", "Lcom/oplus/aiunit/vision/ky3;", "callback", FragmentStyle.DEBUG, "", b2n.f, LogFieldKey.MESSAGE_KEY, "i", "Lcom/oplus/aiunit/vision/n95;", LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/core/data/a;", "a", "b", MapSchema.FIELD_NAME_ENTRY, "TAG", "Ljava/lang/String;", "<init>", "()V", "aiunit.sdk.core_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Bundle f(Companion companion, Context context, String str, Bundle bundle, int i, Object obj) {
            if ((i & 4) != 0) {
                bundle = null;
            }
            return companion.e(context, str, bundle);
        }

        public static /* synthetic */ boolean k(Companion companion, Context context, String str, Bundle bundle, int i, Object obj) {
            if ((i & 4) != 0) {
                bundle = null;
            }
            return companion.j(context, str, bundle);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final com.oplus.aiunit.core.data.a a(@NotNull Context context, @NotNull String detectName, @Nullable Bundle extras) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(detectName, "detectName");
            return l0.c(context, detectName, extras);
        }

        @JvmStatic
        @Nullable
        public final Bundle b(@NotNull String detectName) {
            Intrinsics.checkNotNullParameter(detectName, "detectName");
            return IServiceManager.INSTANCE.a().c(detectName);
        }

        @JvmStatic
        public final int c(@NotNull Context context, @NotNull String detectName, @Nullable Bundle extras) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(detectName, "detectName");
            return k0.e(context, detectName, extras);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final Bundle d(@NotNull Context context, @NotNull String detectName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(detectName, "detectName");
            return f(this, context, detectName, null, 4, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final Bundle e(@NotNull Context context, @NotNull String detectName, @Nullable Bundle extras) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(detectName, "detectName");
            Bundle bundleB = b(detectName);
            return bundleB == null ? a(context, detectName, extras).getInData() : bundleB;
        }

        @JvmStatic
        @JvmOverloads
        public final void g(@NotNull Context context, @Nullable ky3 callback, boolean debug) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                if (Trace.isEnabled()) {
                    Trace.beginSection("AIUnit#init");
                }
                i0.g(context, debug);
                ServiceType serviceTypeA = k0.a(context);
                i0.f("AIUnit", "init for service: " + serviceTypeA);
                if (serviceTypeA != ServiceType.NONE) {
                    IServiceManager.INSTANCE.a().a(context, callback, serviceTypeA);
                } else {
                    if (callback != null) {
                        callback.a(ErrorCode.kErrorDeviceNotSupported.value());
                    }
                }
            } finally {
                if (Trace.isEnabled()) {
                    Trace.endSection();
                }
            }
        }

        @JvmStatic
        @JvmOverloads
        public final boolean h(@NotNull Context context, int minVersionCode) {
            Intrinsics.checkNotNullParameter(context, "context");
            return k0.j(context, minVersionCode);
        }

        @JvmStatic
        public final boolean i() {
            return IServiceManager.INSTANCE.a().isConnected();
        }

        @JvmStatic
        @JvmOverloads
        public final boolean j(@NotNull Context context, @NotNull String detectName, @Nullable Bundle extras) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(detectName, "detectName");
            return k0.l(context, detectName, extras);
        }

        @Deprecated(message = "No longer use", replaceWith = @ReplaceWith(expression = "getDetectData", imports = {}))
        @JvmStatic
        @NotNull
        public final n95 l(@NotNull Context context, @NotNull String detectName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(detectName, "detectName");
            return l0.d(context, detectName, null, 4, null).i();
        }

        @JvmStatic
        public final void m(@NotNull ky3 callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            IServiceManager.INSTANCE.a().b(callback);
        }

        public Companion() {
        }
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final com.oplus.aiunit.core.data.a a(@NotNull Context context, @NotNull String str, @Nullable Bundle bundle) {
        return INSTANCE.a(context, str, bundle);
    }

    @JvmStatic
    public static final int b(@NotNull Context context, @NotNull String str, @Nullable Bundle bundle) {
        return INSTANCE.c(context, str, bundle);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final Bundle c(@NotNull Context context, @NotNull String str) {
        return INSTANCE.d(context, str);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final Bundle d(@NotNull Context context, @NotNull String str, @Nullable Bundle bundle) {
        return INSTANCE.e(context, str, bundle);
    }

    @JvmStatic
    @JvmOverloads
    public static final boolean e(@NotNull Context context, @NotNull String str, @Nullable Bundle bundle) {
        return INSTANCE.j(context, str, bundle);
    }

    @Deprecated(message = "No longer use", replaceWith = @ReplaceWith(expression = "getDetectData", imports = {}))
    @JvmStatic
    @NotNull
    public static final n95 f(@NotNull Context context, @NotNull String str) {
        return INSTANCE.l(context, str);
    }
}
