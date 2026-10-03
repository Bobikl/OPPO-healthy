package com.oplus.compat.content.pm;

import android.content.pm.IPackageDataObserver;
import android.content.pm.IPackageDeleteObserver;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.oplus.aiunit.vision.ep6;
import com.oplus.aiunit.vision.jvk;
import com.oplus.aiunit.vision.q2e;
import com.oplus.aiunit.vision.xu9;
import com.oplus.aiunit.vision.yu9;
import com.oplus.compat.utils.util.UnSupportedApiVersionException;
import com.oplus.epona.Request;

/* JADX INFO: loaded from: classes4.dex */
public class PackageManagerNative {

    @RequiresApi(api = 29)
    public static int FLAG_PERMISSION_REVIEW_REQUIRED;

    @RequiresApi(api = 29)
    public static int INSTALL_FAILED_INVALID_URI;

    @RequiresApi(api = 21)
    public static int INSTALL_REPLACE_EXISTING;

    @RequiresApi(api = 30)
    public static int MATCH_ANY_USER;

    @RequiresApi(api = 29)
    public static int OPLUS_STATE_FREEZE_FREEZED;

    @RequiresApi(api = 29)
    public static int OPLUS_UNFREEZE_FLAG_NORMAL;

    /* JADX INFO: renamed from: com.oplus.compat.content.pm.PackageManagerNative$2, reason: invalid class name */
    class AnonymousClass2 extends IPackageDeleteObserver.Stub {
        final /* synthetic */ yu9 val$observer;

        public AnonymousClass2(yu9 yu9Var) {
        }

        @Override // android.content.pm.IPackageDeleteObserver.Stub, android.content.pm.IPackageDeleteObserver
        public void packageDeleted(String str, int i) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.oplus.compat.content.pm.PackageManagerNative$4, reason: invalid class name */
    class AnonymousClass4 extends IPackageDataObserver.Stub {
        final /* synthetic */ xu9 val$observer;

        public AnonymousClass4(xu9 xu9Var) {
        }

        @Override // android.content.pm.IPackageDataObserver.Stub, android.content.pm.IPackageDataObserver
        public void onRemoveCompleted(String str, boolean z) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: com.oplus.compat.content.pm.PackageManagerNative$6, reason: invalid class name */
    class AnonymousClass6 extends IPackageDataObserver.Stub {
        final /* synthetic */ xu9 val$observer;

        public AnonymousClass6(xu9 xu9Var) {
        }

        @Override // android.content.pm.IPackageDataObserver.Stub, android.content.pm.IPackageDataObserver
        public void onRemoveCompleted(String str, boolean z) throws RemoteException {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.oplus.compat.content.pm.PackageManagerNative$7, reason: invalid class name */
    class AnonymousClass7 extends IPackageDataObserver.Stub {
        final /* synthetic */ xu9 val$observerNative;

        public AnonymousClass7(xu9 xu9Var) {
        }

        @Override // android.content.pm.IPackageDataObserver.Stub, android.content.pm.IPackageDataObserver
        public void onRemoveCompleted(String str, boolean z) throws RemoteException {
            throw null;
        }
    }

    @RequiresApi(api = 29)
    public static class PackageDataObserver extends IPackageDataObserver.Stub {
        private final xu9 mObserver;

        private PackageDataObserver(xu9 xu9Var) {
        }

        @Override // android.content.pm.IPackageDataObserver.Stub, android.content.pm.IPackageDataObserver
        public void onRemoveCompleted(String str, boolean z) throws RemoteException {
        }
    }

    static {
        try {
            if (!jvk.a()) {
                MATCH_ANY_USER = 4194304;
            } else {
                if (!jvk.m()) {
                    throw new UnSupportedApiVersionException("not supported before R");
                }
                MATCH_ANY_USER = ep6.o(new Request.b().c("android.content.pm.PackageManager").b("MATCH_ANY_USER").a()).d().getBundle().getInt("result");
            }
        } catch (Exception e2) {
            Log.e("PackageManagerNative", e2.toString());
        }
        try {
            if (jvk.n()) {
                INSTALL_REPLACE_EXISTING = 2;
                FLAG_PERMISSION_REVIEW_REQUIRED = 64;
                OPLUS_UNFREEZE_FLAG_NORMAL = 1;
                OPLUS_STATE_FREEZE_FREEZED = 2;
                INSTALL_FAILED_INVALID_URI = -3;
                return;
            }
            if (jvk.j()) {
                INSTALL_REPLACE_EXISTING = 2;
                FLAG_PERMISSION_REVIEW_REQUIRED = 64;
                OPLUS_UNFREEZE_FLAG_NORMAL = 1;
                OPLUS_STATE_FREEZE_FREEZED = 2;
                INSTALL_FAILED_INVALID_URI = -3;
                return;
            }
            if (!jvk.l()) {
                if (!jvk.f()) {
                    throw new UnSupportedApiVersionException();
                }
                INSTALL_REPLACE_EXISTING = 2;
            } else {
                INSTALL_REPLACE_EXISTING = ((Integer) c()).intValue();
                FLAG_PERMISSION_REVIEW_REQUIRED = ((Integer) a()).intValue();
                OPLUS_UNFREEZE_FLAG_NORMAL = ((Integer) e()).intValue();
                OPLUS_STATE_FREEZE_FREEZED = ((Integer) d()).intValue();
                INSTALL_FAILED_INVALID_URI = ((Integer) b()).intValue();
            }
        } catch (Throwable th) {
            Log.e("PackageManagerNative", th.toString());
        }
    }

    public static Object a() {
        return q2e.a();
    }

    public static Object b() {
        return q2e.b();
    }

    public static Object c() {
        return q2e.c();
    }

    public static Object d() {
        return q2e.d();
    }

    public static Object e() {
        return q2e.e();
    }
}
