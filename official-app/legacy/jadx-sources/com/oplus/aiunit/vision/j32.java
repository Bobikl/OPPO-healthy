package com.oplus.aiunit.vision;

import com.heytap.device.R$string;
import com.heytap.health.device.third.bgp.BpgBean;

/* JADX INFO: loaded from: classes16.dex */
public class j32 {
    public static String a(BpgBean bpgBean) {
        int errorCode = bpgBean.getErrorCode();
        if (errorCode != 3) {
            return errorCode != 5 ? b78.a().getString(R$string.device_orther_tip) : b78.a().getString(R$string.device_input_correct_pin);
        }
        return b78.a().getString(R$string.device_bpg_search_fail_tips);
    }

    public static String b(BpgBean bpgBean) {
        return bpgBean.getErrorCode() != 3 ? b78.a().getString(R$string.lib_core_bpg_error_bind_failed) : b78.a().getString(R$string.device_bpg_search_fail_title);
    }
}
