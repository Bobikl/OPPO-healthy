package com.heytap.health.sleep.snore.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.snore.OsaResultBean;
import com.heytap.health.sleep.bean.SleepBloodDayBean;
import com.heytap.health.sleep.bean.SnoreDbDayBean;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/heytap/health/sleep/snore/bean/SnoreDayBean;", "", SnoreHistoryActivity.CUR_DAY_START_TIME, "", SnoreHistoryActivity.CUR_DAY_END_TIME, "(JJ)V", "getCurDayEndTime", "()J", "getCurDayStartTime", "value", "Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "osaResultBean", "getOsaResultBean", "()Lcom/heytap/databaseengine/model/snore/OsaResultBean;", "setOsaResultBean", "(Lcom/heytap/databaseengine/model/snore/OsaResultBean;)V", "sleepBloodDayBean", "Lcom/heytap/health/sleep/bean/SleepBloodDayBean;", "getSleepBloodDayBean", "()Lcom/heytap/health/sleep/bean/SleepBloodDayBean;", "setSleepBloodDayBean", "(Lcom/heytap/health/sleep/bean/SleepBloodDayBean;)V", "sleepIndex", "Lcom/heytap/databaseengine/model/SleepIndex;", "getSleepIndex", "()Lcom/heytap/databaseengine/model/SleepIndex;", "setSleepIndex", "(Lcom/heytap/databaseengine/model/SleepIndex;)V", "snoreDbDayBean", "Lcom/heytap/health/sleep/bean/SnoreDbDayBean;", "getSnoreDbDayBean", "()Lcom/heytap/health/sleep/bean/SnoreDbDayBean;", "setSnoreDbDayBean", "(Lcom/heytap/health/sleep/bean/SnoreDbDayBean;)V", "snoreFrgList", "", "Lcom/heytap/health/sleep/snore/bean/SnoreExcerptBean;", "getSnoreFrgList", "()Ljava/util/List;", "totalSleepTime", "", "getTotalSleepTime", "()I", "setTotalSleepTime", "(I)V", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnoreDayBean {
    public static final int $stable = 8;
    private final long curDayEndTime;
    private final long curDayStartTime;

    @Nullable
    private OsaResultBean osaResultBean;

    @Nullable
    private SleepBloodDayBean sleepBloodDayBean;

    @Nullable
    private SleepIndex sleepIndex;

    @Nullable
    private SnoreDbDayBean snoreDbDayBean;

    @NotNull
    private final List<SnoreExcerptBean> snoreFrgList = new ArrayList();
    private int totalSleepTime;

    public SnoreDayBean(long j2, long j3) {
        this.curDayStartTime = j2;
        this.curDayEndTime = j3;
    }

    public final long getCurDayEndTime() {
        return this.curDayEndTime;
    }

    public final long getCurDayStartTime() {
        return this.curDayStartTime;
    }

    @Nullable
    public final OsaResultBean getOsaResultBean() {
        return this.osaResultBean;
    }

    @Nullable
    public final SleepBloodDayBean getSleepBloodDayBean() {
        return this.sleepBloodDayBean;
    }

    @Nullable
    public final SleepIndex getSleepIndex() {
        return this.sleepIndex;
    }

    @Nullable
    public final SnoreDbDayBean getSnoreDbDayBean() {
        return this.snoreDbDayBean;
    }

    @NotNull
    public final List<SnoreExcerptBean> getSnoreFrgList() {
        return this.snoreFrgList;
    }

    public final int getTotalSleepTime() {
        return this.totalSleepTime;
    }

    public final void setOsaResultBean(@Nullable OsaResultBean osaResultBean) {
        this.osaResultBean = osaResultBean;
        this.snoreDbDayBean = new SnoreDbDayBean(osaResultBean, this.curDayStartTime, this.curDayEndTime);
    }

    public final void setSleepBloodDayBean(@Nullable SleepBloodDayBean sleepBloodDayBean) {
        this.sleepBloodDayBean = sleepBloodDayBean;
    }

    public final void setSleepIndex(@Nullable SleepIndex sleepIndex) {
        this.sleepIndex = sleepIndex;
    }

    public final void setSnoreDbDayBean(@Nullable SnoreDbDayBean snoreDbDayBean) {
        this.snoreDbDayBean = snoreDbDayBean;
    }

    public final void setTotalSleepTime(int i) {
        this.totalSleepTime = i;
    }
}
