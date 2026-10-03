package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothDevice;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/qg3;", "", "", "next", "", "error", "suggestion", "n", "Lcom/oplus/aiunit/vision/x93;", "s", "()Lcom/oplus/aiunit/vision/x93;", "checkup", "Landroid/bluetooth/BluetoothDevice;", LogFieldKey.PROCESS_NAME_KEY, "()Landroid/bluetooth/BluetoothDevice;", "patient", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public interface qg3 {
    void n(@NotNull String error, @NotNull String suggestion);

    void next();

    @NotNull
    BluetoothDevice p();

    @NotNull
    x93 s();
}
