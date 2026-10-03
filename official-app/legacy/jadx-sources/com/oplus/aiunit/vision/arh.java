package com.oplus.aiunit.vision;

import com.heytap.health.sleep.bean.SleepDayBean;

/* JADX INFO: loaded from: classes18.dex */
public class arh extends obh {
    public void a() {
        int i = this.b;
        if (i <= 2) {
            this.f14880c = 11;
            this.d = 14;
        } else if (i <= 5) {
            this.f14880c = 10;
            this.d = 13;
        } else if (i <= 13) {
            this.f14880c = 9;
            this.d = 11;
        } else if (i <= 17) {
            this.f14880c = 8;
            this.d = 10;
        } else if (i <= 64) {
            this.f14880c = 7;
            this.d = 9;
        } else {
            this.f14880c = 7;
            this.d = 8;
        }
        int i2 = this.f14880c * 60;
        this.f14880c = i2;
        int i3 = this.d * 60;
        this.d = i3;
        this.f14881e = (i2 + i3) / 2;
        StringBuilder sb = new StringBuilder();
        sb.append("minMinute:");
        sb.append(this.f14880c);
        sb.append("maxMinute:");
        sb.append(this.d);
        sb.append("/age:");
        sb.append(this.b);
        sb.append("/centre:");
        sb.append(this.f14881e);
    }

    public int b(SleepDayBean sleepDayBean) {
        this.b = sleepDayBean.getAge();
        a();
        int totalSleepTime = (int) sleepDayBean.getTotalSleepTime();
        int i = this.f14880c;
        if (totalSleepTime < i) {
            return totalSleepTime - i;
        }
        int i2 = this.d;
        if (totalSleepTime <= i2) {
            return 0;
        }
        return totalSleepTime - i2;
    }
}
