package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.settings.me.settings2.permission.PermissionDetailAct;
import com.heytap.health.watch.thirdparty.R$string;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\tR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/ree;", "", "", PermissionDetailAct.PERMISSION, "c", "Landroid/content/Context;", "context", "d", MapSchema.FIELD_NAME_ENTRY, "", "b", "a", "PERMISSION_COMMON", "Ljava/lang/String;", "PERMISSION_P2P_DATA_EXCHANGE", "PERMISSION_P2P_DEVICE_INFO", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ree {

    @NotNull
    public static final ree INSTANCE = new ree();

    @NotNull
    public static final String PERMISSION_COMMON = "oplus.ocs.wearengine.permission.";

    @NotNull
    public static final String PERMISSION_P2P_DATA_EXCHANGE = "oplus.ocs.wearengine.permission.P2P_DATA_EXCHANGE";

    @NotNull
    public static final String PERMISSION_P2P_DEVICE_INFO = "oplus.ocs.wearengine.permission.P2P_DEVICE_INFO";

    @NotNull
    public final String a(int permission) {
        if (permission != 101) {
            return permission != 102 ? "" : PERMISSION_P2P_DEVICE_INFO;
        }
        return PERMISSION_P2P_DATA_EXCHANGE;
    }

    public final int b(@NotNull String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (Intrinsics.areEqual(permission, PERMISSION_P2P_DATA_EXCHANGE)) {
            return 101;
        }
        return Intrinsics.areEqual(permission, PERMISSION_P2P_DEVICE_INFO) ? 102 : -1;
    }

    @NotNull
    public final String c(@NotNull String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return Intrinsics.areEqual(permission, PERMISSION_P2P_DATA_EXCHANGE) ? true : Intrinsics.areEqual(permission, PERMISSION_P2P_DEVICE_INFO) ? "oplus.ocs.wearengine.permission.group.P2P" : "";
    }

    @NotNull
    public final String d(@NotNull Context context, @NotNull String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        int iHashCode = permission.hashCode();
        int i = (iHashCode == -1948635263 ? !permission.equals(PERMISSION_P2P_DATA_EXCHANGE) : iHashCode == -1004977927 ? !permission.equals("oplus.ocs.wearengine.permission.group.P2P") : !(iHashCode == 1884845984 && permission.equals(PERMISSION_P2P_DEVICE_INFO))) ? -1 : R$string.watch_third_party_permission_group_p2p;
        if (i == -1) {
            return "";
        }
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "{\n            context.getString(id)\n        }");
        return string;
    }

    @NotNull
    public final String e(@NotNull Context context, @NotNull String permission) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (Intrinsics.areEqual(permission, PERMISSION_P2P_DATA_EXCHANGE)) {
            i = R$string.watch_third_party_permission_title_p2p_data_exchange;
        } else {
            i = Intrinsics.areEqual(permission, PERMISSION_P2P_DEVICE_INFO) ? R$string.watch_third_party_permission_title_p2p_device_info : -1;
        }
        if (i == -1) {
            return "";
        }
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "{\n            context.getString(id)\n        }");
        return string;
    }
}
