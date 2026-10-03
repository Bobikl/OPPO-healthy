package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import androidx.annotation.StringRes;
import com.heytap.health.watch.thirdparty.R$string;
import com.heytap.wearable.oms.common.Status;
import com.oplus.health.apiprovider.ClientManager;
import com.oplus.ocs.wearengine.aidl.IWearEngineApi;
import com.oplus.ocs.wearengine.internal.WearEngineServiceApi;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\r\u001a\u00020\fH\u0007J/\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u001c\u001a\u00020\u00138G@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0013\u0010 \u001a\u0004\u0018\u00010\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/df0;", "", "", "name", "f", "Landroid/content/Intent;", "activity", "appName", "Landroid/net/Uri;", ParserTag.TAG_URI, "Lcom/heytap/wearable/oms/common/Status;", b2n.f, "", "resId", "d", "", "args", MapSchema.FIELD_NAME_ENTRY, "(I[Ljava/lang/Object;)Ljava/lang/String;", "Landroid/app/Application;", "a", "Landroid/app/Application;", "b", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "get$annotations", "()V", "application", "Landroid/content/pm/PackageManager;", "c", "()Landroid/content/pm/PackageManager;", "packageManager", "<init>", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class df0 {

    @NotNull
    public static final df0 INSTANCE = new df0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static Application application;

    static {
        Application applicationB = b78.b();
        Intrinsics.checkNotNullExpressionValue(applicationB, "getApplication()");
        application = applicationB;
    }

    @JvmName(name = ParserTag.TAG_GET)
    @NotNull
    public static final Application b() {
        return application;
    }

    @JvmStatic
    @Nullable
    public static final PackageManager c() {
        Application application2 = application;
        if (application2 != null) {
            return application2.getPackageManager();
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final String d(@StringRes int resId) {
        Application application2 = application;
        if (application2 != null) {
            return application2.getString(resId);
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final String e(@StringRes int resId, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Application application2 = application;
        if (application2 != null) {
            return application2.getString(resId, Arrays.copyOf(args, args.length));
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final Object f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Application application2 = application;
        if (application2 != null) {
            return application2.getSystemService(name);
        }
        return null;
    }

    @JvmStatic
    @NotNull
    public static final Status g(@NotNull Intent activity, @NotNull String appName, @NotNull Uri uri) {
        String strE;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(uri, "uri");
        IWearEngineApi iWearEngineApi = (IWearEngineApi) ClientManager.getInstance().getBuildService(WearEngineServiceApi.WEARENGINE_SERVICE_API, new ClientManager.a() { // from class: com.oplus.aiunit.vision.cf0
            @Override // com.oplus.health.apiprovider.ClientManager.a
            public final Object a(IBinder iBinder) {
                return df0.h(iBinder);
            }
        });
        if (!(iWearEngineApi != null ? iWearEngineApi.isForeground() : false)) {
            int iO = gue.o(uri);
            if (iO == 2) {
                strE = e(R$string.watch_third_party_try_install, appName);
            } else if (iO != 3) {
                strE = iO != 4 ? null : d(R$string.watch_third_party_try_open_url);
            } else {
                strE = e(R$string.watch_third_party_try_awaken, appName);
            }
            qvj.b(appName, iO, strE, activity);
            return new Status(30, null, 2, null);
        }
        try {
            activity.addFlags(268435456);
            Application application2 = application;
            if (application2 != null) {
                application2.startActivity(activity);
            }
            return new Status(0, null, 2, null);
        } catch (ActivityNotFoundException e2) {
            k25.b("ApplicationProxy", "dispatchTryAwaken Exception " + e2);
            return new Status(31, null, 2, null);
        } catch (Exception e3) {
            k25.b("ApplicationProxy", "dispatchTryAwaken Exception " + e3);
            return new Status(8, null, 2, null);
        }
    }

    public static final IWearEngineApi h(IBinder iBinder) {
        return IWearEngineApi.Stub.asInterface(iBinder);
    }
}
