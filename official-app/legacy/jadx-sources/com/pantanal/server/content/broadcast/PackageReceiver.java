package com.pantanal.server.content.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.oplus.aiunit.vision.f7b;
import com.oplus.aiunit.vision.u93;
import com.oplus.aiunit.vision.v93;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/pantanal/server/content/broadcast/PackageReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "()V", "Companion", "a", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class PackageReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.pantanal.server.content.broadcast.PackageReceiver$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/pantanal/server/content/broadcast/PackageReceiver$a;", "", "", "pkg", "a", "CATEGORY", "Ljava/lang/String;", "PKG_PREFIX", "RECEIVER_SCHEMA", "TAG", "Lcom/pantanal/server/content/broadcast/PackageReceiver;", "instance", "Lcom/pantanal/server/content/broadcast/PackageReceiver;", "", "isRegisterReceiver", "Z", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String a(@Nullable String pkg) {
            boolean z = false;
            if (pkg != null && StringsKt__StringsJVMKt.startsWith$default(pkg, "package:", false, 2, null)) {
                z = true;
            }
            if (!z) {
                return null;
            }
            String strSubstring = pkg.substring(8);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        f7b.h("PackageReceiver", Intrinsics.stringPlus(" onReceive intent = ", intent));
        String strA = INSTANCE.a(intent == null ? null : intent.getDataString());
        if (strA == null) {
            return;
        }
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != 172491798) {
                if (iHashCode != 525384130) {
                    if (iHashCode != 1544582882 || !action.equals("android.intent.action.PACKAGE_ADDED")) {
                        return;
                    }
                } else if (!action.equals("android.intent.action.PACKAGE_REMOVED")) {
                    return;
                }
            } else if (!action.equals("android.intent.action.PACKAGE_CHANGED")) {
                return;
            }
            v93.c(context, strA);
            u93.c(context, strA);
        }
    }
}
