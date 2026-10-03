package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.R$string;
import com.heytap.health.protocol.PermissionProto$Permission;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/p87;", "", "", "permissionName", "Lcom/heytap/health/protocol/PermissionProto$Permission$PermissionsType;", "a", "TAG", "Ljava/lang/String;", "<init>", "()V", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class p87 {
    public static final int $stable = 0;

    @NotNull
    public static final p87 INSTANCE = new p87();

    @NotNull
    public static final String TAG = "IFeaturePermissionService";

    @Nullable
    public final PermissionProto$Permission.PermissionsType a(@NotNull String permissionName) {
        Intrinsics.checkNotNullParameter(permissionName, "permissionName");
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_permission_camera_title_v1))) {
            return PermissionProto$Permission.PermissionsType.CAMERA;
        }
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_permission_storage_title))) {
            return PermissionProto$Permission.PermissionsType.EXTERNAL_STORAGE;
        }
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_permission_location_title))) {
            return PermissionProto$Permission.PermissionsType.LOCATION;
        }
        if (TextUtils.equals(permissionName, contextA.getString(com.heytap.health.settings.R$string.lib_core_perms_allow_all_the_time))) {
            return PermissionProto$Permission.PermissionsType.BACKGROUND_LOCATION;
        }
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_permission_phone_title))) {
            return PermissionProto$Permission.PermissionsType.READ_PHONE_STATE;
        }
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_permission_record_audio_title))) {
            return PermissionProto$Permission.PermissionsType.RECORD_AUDIO;
        }
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_permission_calendar_title_read))) {
            return PermissionProto$Permission.PermissionsType.READ_CALENDAR;
        }
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_permission_calendar_title_write))) {
            return PermissionProto$Permission.PermissionsType.WRITE_CALENDAR;
        }
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_sports_permission_notice_t1))) {
            return PermissionProto$Permission.PermissionsType.ACTIVITY_RECOGNITION;
        }
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_sports_permission_nearby_equipment))) {
            return PermissionProto$Permission.PermissionsType.BLUETOOTH;
        }
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_permission_phone_title_1))) {
            return PermissionProto$Permission.PermissionsType.CALL_PHONE;
        }
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_permission_read_contacts_title))) {
            return PermissionProto$Permission.PermissionsType.READ_CONTACTS;
        }
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_permission_call_record_title))) {
            return PermissionProto$Permission.PermissionsType.READ_CALL_LOG;
        }
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_permission_sms_title))) {
            return PermissionProto$Permission.PermissionsType.SEND_SMS;
        }
        if (TextUtils.equals(permissionName, contextA.getString(R$string.lib_base_permission_phone_title_2))) {
            return PermissionProto$Permission.PermissionsType.ANSWER_PHONE_CALLS;
        }
        a7b.b(TAG, "permission: " + permissionName);
        return null;
    }
}
