package com.oplus.aiunit.vision;

import com.customer.feedback.sdk.feedbacka;
import com.customer.feedback.sdk.util.LogUtil;
import com.heytap.health.bitmap.BitmapProviderService;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class vvm implements Runnable {
    public final /* synthetic */ String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ywm f18014j;

    public vvm(ywm ywmVar, String str) {
        this.i = str;
        this.f18014j = ywmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Long lValueOf = Long.valueOf(new File(this.i).length());
            if (lValueOf.longValue() <= BitmapProviderService.BITMAP_MAX_SIZE) {
                CopyOnWriteArrayList copyOnWriteArrayList = feedbacka.f2201feedbackf;
                LogUtil.d("FeedbackHelper", "start upload customerLog.");
                this.f18014j.a(axm.a(this.i, false), pwm.feedbacke);
            } else {
                CopyOnWriteArrayList copyOnWriteArrayList2 = feedbacka.f2201feedbackf;
                LogUtil.d("FeedbackHelper", String.format("customerLog %.2fM is oversize 5M,can't upload.", Float.valueOf((lValueOf.longValue() / 1024) / 1024.0f)));
            }
        } catch (Exception e2) {
            CopyOnWriteArrayList copyOnWriteArrayList3 = feedbacka.f2201feedbackf;
            LogUtil.e("FeedbackHelper", "exceptionInfo:" + e2);
        }
    }
}
