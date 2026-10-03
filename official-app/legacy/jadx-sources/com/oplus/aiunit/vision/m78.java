package com.oplus.aiunit.vision;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/m78;", "", "", "cmd", "", "a", "CMD_RESET_DN_UNIT_SET_1", "I", "CMD_FORCE_LOCAL_DNS_2", "CMD_RESET_IP_LIST_3", "CMD_DIRECT_DN_UNIT_SET_4", "CMD_RESET_DN_LIST_5", "CMD_RESUME_HTTP_DNS_6", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class m78 {
    public static final int CMD_DIRECT_DN_UNIT_SET_4 = 4;
    public static final int CMD_FORCE_LOCAL_DNS_2 = 2;
    public static final int CMD_RESET_DN_LIST_5 = 5;
    public static final int CMD_RESET_DN_UNIT_SET_1 = 1;
    public static final int CMD_RESET_IP_LIST_3 = 3;
    public static final int CMD_RESUME_HTTP_DNS_6 = 6;
    public static final m78 INSTANCE = new m78();

    public final boolean a(int cmd) {
        return cmd == 5;
    }
}
