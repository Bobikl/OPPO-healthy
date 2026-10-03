package com.oplus.aiunit.vision;

import android.net.wifi.WifiConfiguration;
import android.util.ArraySet;
import androidx.annotation.RequiresApi;
import io.protostuff.MapSchema;
import java.util.BitSet;
import java.util.List;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/kr3;", "Lcom/oplus/aiunit/vision/q97;", "", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "Companion", "a", "wifi_impl_release"}, k = 1, mv = {1, 8, 0})
public final class kr3 extends q97 {
    @Override // com.oplus.aiunit.vision.q97
    @RequiresApi(30)
    public void e() {
        a7b.f("CompatFetcher", "start getCompatWifiConfig");
        try {
            List<WifiConfiguration> listA = gwl.a();
            if (listA != null && !listA.isEmpty()) {
                d().clear();
                for (WifiConfiguration wifiConfiguration : listA) {
                    wifiConfiguration.toString();
                    if (c(wifiConfiguration.SSID, wifiConfiguration.preSharedKey, wifiConfiguration.allowedKeyManagement)) {
                        ArraySet<WifiRecord> arraySetD = d();
                        String str = wifiConfiguration.SSID;
                        Intrinsics.checkNotNullExpressionValue(str, "configuration.SSID");
                        String str2 = wifiConfiguration.preSharedKey;
                        Intrinsics.checkNotNullExpressionValue(str2, "configuration.preSharedKey");
                        BitSet bitSet = wifiConfiguration.allowedKeyManagement;
                        Intrinsics.checkNotNullExpressionValue(bitSet, "configuration.allowedKeyManagement");
                        arraySetD.add(new WifiRecord(str, str2, a(bitSet)));
                    }
                }
                if (d().isEmpty()) {
                    return;
                }
                d().toString();
                fwl.a();
                return;
            }
            a7b.f("CompatFetcher", "[getCompatWifiConfig]--> privileged configured networks is empty");
        } catch (Throwable th) {
            a7b.b("CompatFetcher", "[getCompatWifiConfig]--> error: " + th.getMessage());
        }
    }
}
