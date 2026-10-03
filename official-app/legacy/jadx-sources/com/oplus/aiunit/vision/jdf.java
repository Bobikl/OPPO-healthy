package com.oplus.aiunit.vision;

import android.content.res.Resources;
import com.heytap.health.base.R$string;

/* JADX INFO: loaded from: classes19.dex */
public class jdf {
    public static void a(int i) {
        Resources resources = b78.a().getResources();
        if (i == 2) {
            y0k.i(resources.getString(R$string.lib_base_device_disconnected_retry_later));
        } else if (i == 11) {
            y0k.i(resources.getString(com.heytap.health.watchface.R$string.watch_face_disconnect_error_fbe));
        } else {
            y0k.i(resources.getString(com.heytap.health.watchface.R$string.watch_face_communication_fail));
        }
    }
}
