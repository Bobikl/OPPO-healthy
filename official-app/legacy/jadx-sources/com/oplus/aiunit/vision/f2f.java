package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.oplus.aiunit.core.data.ServiceType;
import com.oplus.smartenginehelper.entity.ViewEntity;
import com.opos.process.bridge.base.BridgeConstant;
import io.netty.util.internal.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/f2f;", "", "Companion", "a", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
public final class f2f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.f2f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J6\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/f2f$a;", "", "Landroid/content/Context;", "context", "", "detectName", "Lcom/oplus/aiunit/core/data/ServiceType;", "type", "", "c", "arg", "Landroid/os/Bundle;", BridgeConstant.KEY_EXTRAS, "method", "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.f2f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class C0875a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ServiceType.values().length];
                try {
                    iArr[ServiceType.AIUNIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ServiceType.OCRSERVICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Bundle b(Companion companion, Context context, ServiceType serviceType, String str, Bundle bundle, String str2, int i, Object obj) {
            if ((i & 16) != 0) {
                str2 = "common_call";
            }
            return companion.a(context, serviceType, str, bundle, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v13 */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.StringBuilder] */
        @JvmStatic
        @Nullable
        public final Bundle a(@NotNull Context context, @NotNull ServiceType type, @Nullable String arg, @NotNull Bundle extras, @NotNull String method) {
            String str;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
            long jCurrentTimeMillis;
            String string = "] ms";
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intrinsics.checkNotNullParameter(method, "method");
            int i = C0875a.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                str = "content://com.oplus.aiunit.authority.open";
            } else {
                if (i != 2) {
                    return null;
                }
                str = "content://com.coloros.ocrservice.authority.open";
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            try {
                try {
                    Uri uri = Uri.parse(str);
                    Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                    contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                    try {
                        Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.call(type == ServiceType.AIUNIT ? "com.oplus.aiunit.authority.open" : "com.coloros.ocrservice.authority.open", method, arg, extras) : null;
                        StringBuilder sb = new StringBuilder("call: code = ");
                        sb.append(bundleCall != null ? Integer.valueOf(bundleCall.getInt("package::error_code", 0)) : null);
                        sb.append(", result = ");
                        sb.append(bundleCall);
                        i0.f("ProviderClient", sb.toString());
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        i0.f("ProviderClient", "call " + type + " cost[" + (System.currentTimeMillis() - jCurrentTimeMillis2) + "] ms");
                        return bundleCall;
                    } catch (RemoteException e2) {
                        e = e2;
                        i0.n("ProviderClient", "call " + extras + " remote failed. " + e.getMessage());
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        jCurrentTimeMillis = System.currentTimeMillis();
                        context = new StringBuilder("call ");
                        context.append(type);
                        context.append(" cost[");
                        context.append(jCurrentTimeMillis - jCurrentTimeMillis2);
                        context.append("] ms");
                        string = context.toString();
                        i0.f("ProviderClient", string);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        i0.c("ProviderClient", "call " + extras + " failed. " + th.getMessage());
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        jCurrentTimeMillis = System.currentTimeMillis();
                        context = new StringBuilder("call ");
                        context.append(type);
                        context.append(" cost[");
                        context.append(jCurrentTimeMillis - jCurrentTimeMillis2);
                        context.append("] ms");
                        string = context.toString();
                        i0.f("ProviderClient", string);
                        return null;
                    }
                } catch (Throwable th2) {
                    if (context != 0) {
                        context.close();
                    }
                    i0.f("ProviderClient", "call " + type + " cost[" + (System.currentTimeMillis() - jCurrentTimeMillis2) + string);
                    throw th2;
                }
            } catch (RemoteException e3) {
                e = e3;
                contentProviderClientAcquireUnstableContentProviderClient = null;
            } catch (Throwable th3) {
                th = th3;
                contentProviderClientAcquireUnstableContentProviderClient = null;
            }
        }

        @JvmStatic
        public final boolean c(@NotNull Context context, @NotNull String detectName, @NotNull ServiceType type) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(detectName, "detectName");
            Intrinsics.checkNotNullParameter(type, "type");
            ContentResolver contentResolver = context.getContentResolver();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Cursor cursorQuery = contentResolver.query(Uri.parse((type == ServiceType.AIUNIT ? "content://com.oplus.aiunit.authority.open/query/unit" : "content://com.coloros.ocrservice.authority.open/query/unit") + mla.SEPARATOR + detectName), null, null, null);
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    cursorQuery.moveToNext();
                    int columnIndex = cursorQuery.getColumnIndex("unitName");
                    int columnIndex2 = cursorQuery.getColumnIndex("unitId");
                    int columnIndex3 = cursorQuery.getColumnIndex(ViewEntity.ENABLED);
                    String string = columnIndex >= 0 ? cursorQuery.getString(columnIndex) : detectName;
                    int i = columnIndex2 >= 0 ? cursorQuery.getInt(columnIndex2) : 0;
                    boolean z = columnIndex3 >= 0 && cursorQuery.getInt(columnIndex3) > 0;
                    cursorQuery.close();
                    i0.f("ProviderClient", "queryUnitSupported " + type + StringUtil.SPACE + detectName + ": [" + string + ", " + i + ", " + z + "]. cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
                    return z;
                }
                i0.a("ProviderClient", "queryUnitSupported false by cursor is empty!");
                return false;
            } catch (Exception e2) {
                i0.c("ProviderClient", "queryUnitSupported " + type + StringUtil.SPACE + detectName + " err. " + e2.getMessage());
                return false;
            }
        }
    }
}
