package com.heytap.health.step.card.data;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.time.LocalDate;

/* JADX INFO: loaded from: classes18.dex */
public class StepCardBean implements Serializable {
    private LocalDate[] allDay;
    private int[] dayPunchStatus;
    private LocalDate firstDateOfMonth;

    public LocalDate[] getAllDay() {
        return this.allDay;
    }

    public int[] getDayPunchStatus() {
        return this.dayPunchStatus;
    }

    public LocalDate getFirstDateOfMonth() {
        return this.firstDateOfMonth;
    }

    public void setAllDay(LocalDate[] localDateArr) {
        this.allDay = localDateArr;
    }

    public void setDayPunchStatus(int[] iArr) {
        this.dayPunchStatus = iArr;
    }

    public void setFirstDateOfMonth(LocalDate localDate) {
        this.firstDateOfMonth = localDate;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("date:" + this.firstDateOfMonth.toString() + "/");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("status length:");
        sb2.append(this.dayPunchStatus.length);
        sb.append(sb2.toString());
        sb.append("/");
        sb.append("localDates:");
        LocalDate[] localDateArr = this.allDay;
        if (localDateArr != null && localDateArr.length > 0) {
            int i = 0;
            while (true) {
                LocalDate[] localDateArr2 = this.allDay;
                if (i >= localDateArr2.length) {
                    break;
                }
                sb.append(localDateArr2[i]);
                sb.append("##");
                i++;
            }
        }
        sb.append("/punchStatus:");
        if (getDayPunchStatus() != null && getDayPunchStatus().length > 0) {
            for (int i2 = 0; i2 < getDayPunchStatus().length; i2++) {
                sb.append(this.dayPunchStatus[i2]);
                sb.append("##");
            }
        }
        sb.append("/ end!!");
        return sb.toString();
    }
}
