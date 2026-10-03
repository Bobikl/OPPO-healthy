package com.oplus.aiunit.vision;

import android.util.Base64;
import com.cloud.sdk.cloudstorage.http.FileSyncModel;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes12.dex */
public final class f5n {
    public static boolean a(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        try {
            o6n o6nVar = new o6n();
            o6nVar.b.put("Content-Type", FileSyncModel.streamMime);
            o6nVar.b.put("aps_c_src", Base64.encodeToString(o6n.a().getBytes(), 2));
            o6nVar.b.put("aps_c_key", Base64.encodeToString(o6n.b().getBytes(), 2));
            o6nVar.d = bArr;
            if (w4n.a) {
                o6nVar.a = "http://cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&";
            } else {
                o6nVar.a = (w4n.b ? "https://" : "http://") + "cgicol.amap.com/collection/collectData?src=baseCol&ver=v74&";
            }
            p6n p6nVarA = h6n.c().a(o6nVar);
            byte[] bArr2 = (p6nVarA == null || p6nVarA.a != 200) ? null : p6nVarA.f15220c;
            return bArr2 != null && SpeechConstant.TRUE_STR.equals(new String(bArr2, StandardCharsets.UTF_8));
        } catch (Exception e2) {
            n6n.a(e2);
            return false;
        }
    }
}
