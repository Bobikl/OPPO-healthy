package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import androidx.core.content.pm.PackageInfoCompat;
import com.heytap.accessory.Initializer;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013RZ\u0010\u001f\u001aH\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00060\u00180\u0017j#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00060\u0018`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/w9d;", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", ParserTag.TAG_URI, "", "onChange", "Landroid/content/Context;", "context", "j", "i", "", "f", "status", b2n.g, "", MapSchema.FIELD_NAME_ENTRY, "a", "Ljava/lang/String;", "TAG", "b", "OAF_ENABLE_STATUS", "Ljava/util/HashSet;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "on", "Lkotlin/collections/HashSet;", "c", "Ljava/util/HashSet;", "listeners", "d", "I", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "Companion", "oafhost_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOafEnableStatusManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OafEnableStatusManager.kt\ncom/heytap/health/oaf/util/OafEnableStatusManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n1855#2,2:162\n*S KotlinDebug\n*F\n+ 1 OafEnableStatusManager.kt\ncom/heytap/health/oaf/util/OafEnableStatusManager\n*L\n43#1:162,2\n*E\n"})
public final class w9d extends ContentObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static w9d f18173e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String OAF_ENABLE_STATUS;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HashSet<Function1<Boolean, Unit>> listeners;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int status;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.w9d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/w9d$a;", "", "Lcom/oplus/aiunit/vision/w9d;", "a", "", "modeState", "", "b", "DEFAULT_VALUE", "I", "STATUS_ON", "oafEnableStatusManager", "Lcom/oplus/aiunit/vision/w9d;", "<init>", "()V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final w9d a() {
            w9d w9dVar = w9d.f18173e;
            if (w9dVar != null) {
                return w9dVar;
            }
            w9d w9dVar2 = new w9d(new Handler(z2c.a()));
            w9d.f18173e = w9dVar2;
            return w9dVar2;
        }

        @JvmStatic
        public final boolean b(int modeState) {
            return modeState != -1234;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9d(@NotNull Handler handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.TAG = "OafStatus";
        this.OAF_ENABLE_STATUS = "key_settings_strengthen_service_oaf";
        this.listeners = new HashSet<>();
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        int iF = f(contextA);
        if (iF == -1234) {
            wil.k("OafStatus", "init status, use default");
            iF = 1;
        }
        this.status = iF;
    }

    @JvmStatic
    @NotNull
    public static final w9d d() {
        return INSTANCE.a();
    }

    @JvmStatic
    public static final boolean g(int i) {
        return INSTANCE.b(i);
    }

    public static final void k(w9d this$0) {
        HashSet hashSet;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.listeners) {
            hashSet = new HashSet(this$0.listeners);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Boolean.valueOf(this$0.h(this$0.status)));
        }
    }

    public final String e(Context context) {
        String str;
        String str2;
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.oplus.camera", 0);
            str = "cameraCode=" + PackageInfoCompat.getLongVersionCode(packageInfo) + " cameraCode=" + packageInfo.versionName;
        } catch (Exception e2) {
            str = "camera:" + e2.getMessage();
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.heytap.accessory", 0);
            str2 = "code=" + PackageInfoCompat.getLongVersionCode(packageInfo2) + " name=" + packageInfo2.versionName;
        } catch (Exception e3) {
            str2 = "err=" + e3;
        }
        return str2 + " " + str;
    }

    public final int f(@NotNull Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        int i = -1234;
        try {
            str = "sys not support";
            if (Initializer.useSystemOAF4Watch(context)) {
                int iB = ec0.e.b(context.getContentResolver(), this.OAF_ENABLE_STATUS, -1234);
                wil.d(this.TAG, "getSwitchModeOn: ch=" + iB);
                if (iB != -1234) {
                    str = "getSettings ch";
                    i = iB;
                }
            }
        } catch (Exception e2) {
            str = "failed " + e2;
        }
        String str2 = "getSwitchModeOn: " + i + " from=" + str + " info=[" + e(context) + "]";
        bni.INSTANCE.b(str2);
        wil.d(this.TAG, str2);
        return i;
    }

    public final boolean h(int status) {
        return (status == 0 || status == -1234) ? false : true;
    }

    public final boolean i() {
        return h(this.status);
    }

    public final void j(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (Initializer.useOAFApp(context)) {
                b78.a().getContentResolver().registerContentObserver(ec0.e.f(this.OAF_ENABLE_STATUS), true, this);
            }
        } catch (Exception e2) {
            wil.d(this.TAG, "monitorOafEnableStatus: failed " + e2);
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange, @Nullable Uri uri) {
        int i = this.status;
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        int iF = f(contextA);
        this.status = iF;
        wil.d(this.TAG, "onChange preStatus=" + i + " status=" + iF);
        if (i != this.status) {
            oad.g(new Runnable() { // from class: com.oplus.aiunit.vision.v9d
                @Override // java.lang.Runnable
                public final void run() {
                    w9d.k(this.i);
                }
            });
        }
    }
}
