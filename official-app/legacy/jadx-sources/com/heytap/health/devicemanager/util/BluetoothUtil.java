package com.heytap.health.devicemanager.util;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.heytap.health.base.R$string;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.ml4;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u000eJ\u001a\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/devicemanager/util/BluetoothUtil;", "", "", b2n.f, "", "profile", "i", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lcom/heytap/health/devicemanager/util/BluetoothUtil$a;", "bluetoothCallback", "", LogFieldKey.MESSAGE_KEY, "j", "", "changedMac", "localMac", LogFieldKey.LEVEL_KEY, "mac", b2n.g, ServiceNodeBundleKeys.DEVICE_ADDRESS, MapSchema.FIELD_NAME_KEY, "f", "q", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "t", "<init>", "()V", "a", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class BluetoothUtil {

    @NotNull
    public static final BluetoothUtil INSTANCE = new BluetoothUtil();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/devicemanager/util/BluetoothUtil$a;", "", "", "onSuccess", "onFailed", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void onFailed();

        void onSuccess();
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/heytap/health/devicemanager/util/BluetoothUtil$b", "Lcom/heytap/health/devicemanager/util/a$c;", "", "a", "c", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements com.heytap.health.devicemanager.util.a.c {
        public final /* synthetic */ AppCompatActivity a;
        public final /* synthetic */ a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.heytap.health.devicemanager.util.a f4062c;

        public b(AppCompatActivity appCompatActivity, a aVar, com.heytap.health.devicemanager.util.a aVar2) {
            this.a = appCompatActivity;
            this.b = aVar;
            this.f4062c = aVar2;
        }

        @Override // com.heytap.health.devicemanager.util.a.c
        public void a() {
            BluetoothUtil.INSTANCE.m(this.a, this.b);
            this.f4062c.H();
        }

        @Override // com.heytap.health.devicemanager.util.a.c
        public void c() {
            a aVar = this.b;
            if (aVar != null) {
                aVar.onFailed();
            }
            this.f4062c.H();
        }
    }

    public static final void n(final AppCompatActivity activity, final a aVar, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        if (!INSTANCE.j()) {
            Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
            dialogInterface.dismiss();
            new com.heytap.health.base.permission.a(activity.getSupportFragmentManager()).e(intent, 100, new com.heytap.health.base.permission.a.b() { // from class: com.oplus.aiunit.vision.ou1
                @Override // com.heytap.health.base.permission.a.b
                public final void onActivityResult(int i2, int i3, Intent intent2) {
                    BluetoothUtil.o(aVar, activity, i2, i3, intent2);
                }
            });
        } else {
            dialogInterface.dismiss();
            if (aVar != null) {
                aVar.onSuccess();
            }
        }
    }

    public static final void o(a aVar, AppCompatActivity activity, int i, int i2, Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        BluetoothUtil bluetoothUtil = INSTANCE;
        if (!bluetoothUtil.j()) {
            bluetoothUtil.q(activity, aVar);
        } else if (aVar != null) {
            aVar.onSuccess();
        }
    }

    public static final void p(a aVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (aVar != null) {
            aVar.onFailed();
        }
    }

    public static final void r(AppCompatActivity activity, a aVar, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        dialogInterface.dismiss();
        INSTANCE.m(activity, aVar);
    }

    public static final void s(a aVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (aVar != null) {
            aVar.onFailed();
        }
    }

    @Nullable
    public final String f(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        if (StringsKt__StringsKt.contains$default((CharSequence) mac, (CharSequence) "mac=", false, 2, (Object) null)) {
            return StringsKt__StringsJVMKt.replace$default(mac, "mac=", "", false, 4, (Object) null);
        }
        if (mac.length() != 12) {
            return mac;
        }
        StringBuilder sb = new StringBuilder();
        int length = mac.length();
        for (int i = 0; i < length; i++) {
            if (i != 0 && i % 2 == 0) {
                sb.append(":");
            }
            sb.append(mac.charAt(i));
        }
        return sb.toString();
    }

    public final boolean g() {
        if (Build.VERSION.SDK_INT >= 31) {
            return PermissionRequestDialog.D(8, "android.permission.BLUETOOTH_CONNECT") && PermissionRequestDialog.D(8, "android.permission.BLUETOOTH_SCAN");
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Object] */
    public final void h(@Nullable String mac) {
        Set<BluetoothDevice> bondedDevices;
        if (!INSTANCE.g()) {
            a7b.b("BluetoothUtil", "deletePairedDeviceInPhone not os12 bluetooth permission");
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = mac;
        ?? A = lc5.c(mac).a(new Function1<DeviceInfo, String>() { // from class: com.heytap.health.devicemanager.util.BluetoothUtil$deletePairedDeviceInPhone$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @Nullable
            public final String invoke(@NotNull DeviceInfo applyInfo) {
                Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                if (!applyInfo.k0()) {
                    return objectRef.element;
                }
                UserDeviceInfo deviceInfo = applyInfo.getDeviceInfo();
                String bleMac = deviceInfo != null ? deviceInfo.getBleMac() : null;
                return bleMac == null ? "" : bleMac;
            }
        });
        objectRef.element = A;
        ml4.d("BluetoothUtil", "deletePairedDeviceInPhone " + gdb.a((String) A));
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || (bondedDevices = defaultAdapter.getBondedDevices()) == null || !(!bondedDevices.isEmpty())) {
            return;
        }
        for (BluetoothDevice device : bondedDevices) {
            if (TextUtils.equals((CharSequence) objectRef.element, device.getAddress())) {
                Intrinsics.checkNotNullExpressionValue(device, "device");
                t(device);
            }
        }
    }

    public final int i(int profile) {
        if (g()) {
            return BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(profile);
        }
        a7b.b("BluetoothUtil", "getProfileConnectionState not 12 bluetooth permission!!!");
        return 0;
    }

    public final boolean j() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        return defaultAdapter.isEnabled();
    }

    public final boolean k(@Nullable String deviceAddress) {
        BluetoothAdapter defaultAdapter;
        Set<BluetoothDevice> bondedDevices;
        if (deviceAddress != null && !Intrinsics.areEqual("", deviceAddress) && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && (bondedDevices = defaultAdapter.getBondedDevices()) != null && (!bondedDevices.isEmpty())) {
            Iterator<BluetoothDevice> it = bondedDevices.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(deviceAddress, it.next().getAddress())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean l(@NotNull String changedMac, @Nullable String localMac) {
        Intrinsics.checkNotNullParameter(changedMac, "changedMac");
        String strA = gdb.a(changedMac);
        String strA2 = gdb.a(localMac);
        StringBuilder sb = new StringBuilder();
        sb.append("isLocalDevice: changedMac:");
        sb.append(strA);
        sb.append(" localMac:");
        sb.append(strA2);
        if (TextUtils.isEmpty(changedMac) || TextUtils.isEmpty(localMac)) {
            return false;
        }
        return StringsKt__StringsJVMKt.equals(changedMac, localMac, true);
    }

    public final void m(@NotNull final AppCompatActivity activity, @Nullable final a bluetoothCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!g()) {
            com.heytap.health.devicemanager.util.a aVarT = com.heytap.health.devicemanager.util.a.t(activity);
            aVarT.d = false;
            aVarT.J(new b(activity, bluetoothCallback, aVarT));
            aVarT.P();
            return;
        }
        if (j()) {
            if (bluetoothCallback != null) {
                bluetoothCallback.onSuccess();
            }
        } else {
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(activity);
            healthAlertDialogBuilder.setTitle(R$string.lib_base_open_bluetooth);
            healthAlertDialogBuilder.setMessage(R$string.lib_base_connect_device_need_bluetooth_enable);
            healthAlertDialogBuilder.setCancelable(false);
            healthAlertDialogBuilder.setPositiveButton(R$string.lib_base_open, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.mu1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BluetoothUtil.n(activity, bluetoothCallback, dialogInterface, i);
                }
            });
            healthAlertDialogBuilder.setNegativeButton(R$string.lib_base_share_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.nu1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BluetoothUtil.p(bluetoothCallback, dialogInterface, i);
                }
            });
            healthAlertDialogBuilder.show();
        }
    }

    public final void q(final AppCompatActivity activity, final a bluetoothCallback) {
        HealthAlertDialogBuilder healthAlertDialogBuilder = new HealthAlertDialogBuilder(activity);
        healthAlertDialogBuilder.setTitle(R$string.lib_core_bpg_error_bleclose);
        healthAlertDialogBuilder.setCancelable(false);
        healthAlertDialogBuilder.setPositiveButton(R$string.lib_base_device_retry, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.pu1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BluetoothUtil.r(activity, bluetoothCallback, dialogInterface, i);
            }
        });
        healthAlertDialogBuilder.setNegativeButton(R$string.lib_base_device_exist, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.qu1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BluetoothUtil.s(bluetoothCallback, dialogInterface, i);
            }
        });
        healthAlertDialogBuilder.show();
    }

    public final void t(BluetoothDevice bluetoothDevice) {
        try {
            bluetoothDevice.getClass().getMethod("removeBond", new Class[0]).invoke(bluetoothDevice, new Object[0]);
        } catch (Exception e2) {
            a7b.b("BluetoothUtil", " remove bond Device Error!!!" + e2.getMessage());
        }
    }
}
