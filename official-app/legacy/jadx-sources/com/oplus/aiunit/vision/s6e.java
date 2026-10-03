package com.oplus.aiunit.vision;

import com.oplus.pantaconnect.sdk.connectionservice.net.NetworkConfiguration;
import com.oplus.pantaconnect.sdk.connectionservice.net.WifiConfig;
import com.oplus.pantaconnect.sdk.connectionservice.net.WifiConfigOptions;
import io.protostuff.MapSchema;
import java.util.BitSet;
import java.util.List;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/s6e;", "Lcom/oplus/aiunit/vision/q97;", "", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "Companion", "a", "wifi_impl_release"}, k = 1, mv = {1, 8, 0})
public final class s6e extends q97 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r4 != false) goto L19;
     */
    @Override // com.oplus.aiunit.vision.q97
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e() {
        try {
            a7b.f("PantaFetcher", "start getPantaWifiConfig");
            NetworkConfiguration networkConfigurationCreate = NetworkConfiguration.INSTANCE.create();
            boolean z = true;
            WifiConfigOptions wifiConfigOptions = new WifiConfigOptions(true, true, true);
            List<WifiConfig> list = networkConfigurationCreate.getRecordWifiConfigs(wifiConfigOptions).get();
            WifiConfig wifiConfig = networkConfigurationCreate.getSoftApWifiConfig(wifiConfigOptions).get();
            List<WifiConfig> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                if (wifiConfig != null) {
                    String ssid = wifiConfig.getSsid();
                    if (ssid != null && ssid.length() != 0) {
                        z = false;
                    }
                }
                a7b.f("PantaFetcher", "[getPantaWifiConfig]--> record list and softApWifiConfig is empty");
                return;
            }
            d().clear();
            for (WifiConfig wifiConfig2 : list) {
                String ssid2 = wifiConfig2.getSsid();
                String preSharedKey = wifiConfig2.getPreSharedKey();
                BitSet allowedKeyManagement = wifiConfig2.getAllowedKeyManagement();
                StringBuilder sb = new StringBuilder();
                sb.append("wifiConfig ssid: ");
                sb.append(ssid2);
                sb.append(", preSharedKey: ");
                sb.append(preSharedKey);
                sb.append(", management: ");
                sb.append(allowedKeyManagement);
                if (c(wifiConfig2.getSsid(), wifiConfig2.getPreSharedKey(), wifiConfig2.getAllowedKeyManagement())) {
                    d().add(new WifiRecord(wifiConfig2.getSsid(), wifiConfig2.getPreSharedKey(), a(wifiConfig2.getAllowedKeyManagement())));
                }
            }
            if (wifiConfig != null) {
                String ssid3 = wifiConfig.getSsid();
                String preSharedKey2 = wifiConfig.getPreSharedKey();
                BitSet allowedKeyManagement2 = wifiConfig.getAllowedKeyManagement();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("softApWifiConfig ssid: ");
                sb2.append(ssid3);
                sb2.append(", preSharedKey: ");
                sb2.append(preSharedKey2);
                sb2.append(", management: ");
                sb2.append(allowedKeyManagement2);
                if (c(wifiConfig.getSsid(), wifiConfig.getPreSharedKey(), wifiConfig.getAllowedKeyManagement())) {
                    d().add(new WifiRecord("\"" + wifiConfig.getSsid() + "\"", "\"" + wifiConfig.getPreSharedKey() + "\"", b(wifiConfig.getAllowedKeyManagement())));
                }
            }
            if (d().isEmpty()) {
                return;
            }
            d().toString();
            fwl.a();
        } catch (Throwable th) {
            a7b.b("PantaFetcher", "[getPantaWifiConfig]--> error: " + th.getMessage());
        }
    }
}
