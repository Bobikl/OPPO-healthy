package com.heytap.device.data.sporthealth.receive;

import android.annotation.SuppressLint;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.operations.fatreduction.IFatReduction;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.i37;
import com.oplus.aiunit.vision.x0;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@SuppressLint({"CheckResult"})
public class l implements j {
    public IFatReduction i;

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(MessageEvent messageEvent) {
        if (this.i == null) {
            this.i = (IFatReduction) x0.d().h(IFatReduction.class);
        }
        IFatReduction iFatReduction = this.i;
        if (iFatReduction != null) {
            iFatReduction.n1(messageEvent);
        }
    }

    @Override // com.oplus.aiunit.vision.rl4.b
    public void onMessageReceived(String str, final MessageEvent messageEvent) {
        if (i37.b()) {
            return;
        }
        try {
            ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.vmd
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.c(messageEvent);
                }
            });
        } catch (Exception e2) {
            a7b.b("OperationProcessor", "onMessageReceived e:" + e2.getMessage());
        }
    }

    @Override // com.heytap.device.data.sporthealth.receive.j
    public List<j.a> t() {
        return Arrays.asList(j.a.a(4, 21), j.a.a(4, 22), j.a.a(4, 46), j.a.a(4, 36));
    }
}
