package com.oplus.aiunit.vision;

import android.os.Binder;
import android.os.Bundle;
import com.heytap.health.wallet.iccoa.DigitalKeyManager;
import org.iccoa.android.digitalkey.IDigitalKeyCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/um9;", "", "", "method", "Landroid/os/Bundle;", "params", "Lorg/iccoa/android/digitalkey/IDigitalKeyCallback;", "callback", "", "b", "a", "Ljava/lang/String;", "TAG", "", "(Landroid/os/Bundle;)[B", "keyIdOrNull", "<init>", "()V", "entrance_release"}, k = 1, mv = {1, 8, 0})
public final class um9 {

    @NotNull
    public static final um9 INSTANCE = new um9();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String TAG = "ICCOA_ICCOAApiDigitalKeyFramework";

    @Nullable
    public final byte[] a(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        return bundle.getByteArray(f04.KEY_KEY_ID);
    }

    public final void b(@NotNull String method, @NotNull Bundle params, @NotNull IDigitalKeyCallback callback) {
        String str;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        t6b.b(TAG, "method = " + method + ",params = " + params);
        switch (method.hashCode()) {
            case -2012038408:
                str = f04.METHOD_REGISTER_VEHICLE_STATUS_LISTENER;
                break;
            case -1841933213:
                str = f04.METHOD_SET_KEY_BLE_DISABLED;
                break;
            case -1808076609:
                str = f04.METHOD_UNREGISTER_VEHICLE_STATUS_LISTENER;
                break;
            case -1746419328:
                str = f04.METHOD_CHECK_PERMISSION;
                break;
            case -1465936748:
                str = f04.METHOD_GRANT_PERMISSION;
                break;
            case -1286778904:
                if (method.equals(f04.METHOD_GET_SERVICE_STATUS)) {
                    DigitalKeyManager.INSTANCE.e(callback, null);
                    return;
                }
                return;
            case -1172702095:
                str = f04.METHOD_SET_KEY_PASSIVE_ENTRY_STATUS;
                break;
            case -1100611148:
                if (method.equals(f04.METHOD_GET_DIGITAL_KEY_INFO)) {
                    DigitalKeyManager digitalKeyManager = DigitalKeyManager.INSTANCE;
                    byte[] bArrA = a(params);
                    String nameForUid = b78.b().getPackageManager().getNameForUid(Binder.getCallingUid());
                    if (nameForUid == null) {
                        nameForUid = "";
                    }
                    digitalKeyManager.c(bArrA, nameForUid, callback);
                    return;
                }
                return;
            case -901780393:
                str = f04.METHOD_GET_KEY_BLE_DISABLED;
                break;
            case -867659261:
                str = f04.METHOD_MANAGE_KEY;
                break;
            case -771726545:
                str = f04.METHOD_CONSECUTIVE_RKE_ACTION;
                break;
            case -659425756:
                str = f04.METHOD_REGISTER_VEHICLE_STATUS;
                break;
            case -580044391:
                str = f04.METHOD_REGISTER_KEY_CHANGE_EVENT_LISTENER;
                break;
            case -471419796:
                str = f04.METHOD_CONFIRM_DIGITAL_KEY_SHARING;
                break;
            case -436845206:
                str = f04.METHOD_REQUEST_RKE_ACTION;
                break;
            case -368621059:
                str = f04.METHOD_GET_KEY_PASSIVE_ENTRY_STATUS;
                break;
            case -176097301:
                str = f04.METHOD_QUERY_VEHICLE_CONNECTION_STATUS;
                break;
            case 21225734:
                str = f04.METHOD_REQUEST_VEHICLE_STATUS;
                break;
            case 290611925:
                str = f04.METHOD_GET_KEY_BLE_AUTH_STATUS;
                break;
            case 381511407:
                str = f04.METHOD_SHARE_DIGITAL_KEY;
                break;
            case 664421371:
                str = f04.METHOD_NEED_BLUETOOTH_PAIR;
                break;
            case 929161333:
                str = f04.METHOD_REQUEST_VEHICLE_PROPRIETARY_DATA;
                break;
            case 1236937115:
                str = f04.METHOD_SYNC_KEY_INFO;
                break;
            case 1447804082:
                str = f04.METHOD_UNREGISTER_KEY_CHANGE_EVENT_LISTENER;
                break;
            case 1626530688:
                str = f04.METHOD_REQUEST_SIGNATURE;
                break;
            case 1680834522:
                str = f04.METHOD_CREATE_DIGITAL_KEY;
                break;
            case 1734381629:
                str = f04.METHOD_START_BLUETOOTH_PAIR;
                break;
            default:
                return;
        }
        method.equals(str);
    }
}
