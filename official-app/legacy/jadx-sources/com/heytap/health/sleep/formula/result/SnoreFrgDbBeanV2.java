package com.heytap.health.sleep.formula.result;

import androidx.annotation.Keep;
import com.heytap.databaseengine.model.snore.SnoreDbBuff;
import com.heytap.health.sleep.formula.formula.result.SnoreFrgDbBean;
import com.oplus.aiunit.vision.lza;
import com.oplus.aiunit.vision.um;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SnoreFrgDbBeanV2 extends SnoreFrgDbBean {
    public String ssoid = um.c().getSsoid();
    private final List<SnoreDbBuff> snoreDbBuffList = new ArrayList();

    public SnoreFrgDbBeanV2(SnoreFrgDbBean snoreFrgDbBean, long j2) {
        this.snoreDbCurve = snoreFrgDbBean.snoreDbCurve;
        this.snoreDbLen = snoreFrgDbBean.snoreDbLen;
        long j3 = j2 * 1000;
        if (snoreFrgDbBean.snoreDbCurve != null) {
            for (int i = 0; i < snoreFrgDbBean.snoreDbCurve.length; i++) {
                SnoreDbBuff snoreDbBuff = new SnoreDbBuff();
                snoreDbBuff.setSsoid(this.ssoid);
                snoreDbBuff.setUtcTimestamp(j3);
                snoreDbBuff.setTimezone(ZoneId.systemDefault().toString());
                snoreDbBuff.setMode(2);
                snoreDbBuff.setSecondDBValue(snoreFrgDbBean.snoreDbCurve[i]);
                this.snoreDbBuffList.add(snoreDbBuff);
                j3 += 500;
            }
        }
    }

    public List<SnoreDbBuff> getSnoreDbBuffList() {
        return this.snoreDbBuffList;
    }

    public boolean isEmpty() {
        return lza.a(this.snoreDbBuffList);
    }
}
