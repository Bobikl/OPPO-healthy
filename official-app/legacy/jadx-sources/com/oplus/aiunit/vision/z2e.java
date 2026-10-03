package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageManager;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/z2e;", "", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class z2e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String PN_LIANLIAN = "com.gzyunke.lianlian";

    @NotNull
    public static final String PN_SDK_DEMO = "com.example.healthsdkdemoforauth";

    @NotNull
    public static final String PN_TBULU = "com.lolaage.tbulu.tools";

    @NotNull
    public static final String PN_XUNJI = "com.trainnote.rn";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.z2e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/z2e$a;", "", "Landroid/content/Context;", "context", "", TriggerEvent.EXTRA_UID, "a", "", "c", "Landroid/content/pm/PackageManager;", "b", "PN_LIANLIAN", "Ljava/lang/String;", "PN_SDK_DEMO", "PN_TBULU", "PN_XUNJI", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final int a(@NotNull Context context, int uid) {
            Intrinsics.checkNotNullParameter(context, "context");
            String strC = c(context, uid);
            if (strC != null) {
                switch (strC.hashCode()) {
                    case -2073311747:
                        if (strC.equals(z2e.PN_XUNJI)) {
                            return 1;
                        }
                        break;
                    case -54547863:
                        if (strC.equals(z2e.PN_TBULU)) {
                            return 3;
                        }
                        break;
                    case 158732886:
                        if (strC.equals(z2e.PN_LIANLIAN)) {
                            return 2;
                        }
                        break;
                    case 278237921:
                        if (strC.equals(z2e.PN_SDK_DEMO)) {
                            return -1;
                        }
                        break;
                }
            }
            return 0;
        }

        public final PackageManager b(Context context) {
            if (context != null) {
                return context.getPackageManager();
            }
            return null;
        }

        @Nullable
        public final String c(@NotNull Context context, int uid) {
            Intrinsics.checkNotNullParameter(context, "context");
            PackageManager packageManagerB = b(context);
            if (packageManagerB == null) {
                return null;
            }
            String[] packagesForUid = packageManagerB.getPackagesForUid(uid);
            boolean z = true;
            if (packagesForUid != null) {
                if (!(packagesForUid.length == 0)) {
                    z = false;
                }
            }
            if (z) {
                return null;
            }
            return packagesForUid[0];
        }
    }
}
