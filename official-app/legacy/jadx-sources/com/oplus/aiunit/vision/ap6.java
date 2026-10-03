package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpConst;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/ap6;", "", "", HttpConst.SERVER_ENV, "region", "", "a", "b", "", "CDP_MIN_MANUAL_SYNC_TIME_INTERVAL", "J", "<init>", "()V", "Feedback_domesticRelease"}, k = 1, mv = {1, 8, 0})
public final class ap6 {
    public static final long CDP_MIN_MANUAL_SYNC_TIME_INTERVAL = 1800000;
    public static final ap6 INSTANCE = new ap6();

    public String a(int env, int region) {
        return "https://static-cn-feedback.heytapmobi.com";
    }

    public String b(int env, int region) {
        return "https://rest-cn-feedback.heytapmobi.com";
    }
}
