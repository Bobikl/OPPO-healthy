package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.sleepdaystat.SleepMainData;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u0011\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0010\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/dkh;", "", "", "a", "I", b2n.f, "()I", "n", "(I)V", "score", "b", b2n.g, "beforeScore", "c", "i", "beforeSleepInTime", "d", "j", "beforeSleepOutTime", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.LEVEL_KEY, "curSleepInTime", "f", LogFieldKey.MESSAGE_KEY, "curSleepOutTime", "", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "Ljava/util/List;", "()Ljava/util/List;", MapSchema.FIELD_NAME_KEY, "(Ljava/util/List;)V", "curList", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class dkh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int score;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int beforeScore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int beforeSleepInTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int beforeSleepOutTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int curSleepInTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int curSleepOutTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public List<SleepMainData> curList = new ArrayList();

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBeforeScore() {
        return this.beforeScore;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBeforeSleepInTime() {
        return this.beforeSleepInTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBeforeSleepOutTime() {
        return this.beforeSleepOutTime;
    }

    @NotNull
    public final List<SleepMainData> d() {
        return this.curList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCurSleepInTime() {
        return this.curSleepInTime;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCurSleepOutTime() {
        return this.curSleepOutTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    public final void h(int i) {
        this.beforeScore = i;
    }

    public final void i(int i) {
        this.beforeSleepInTime = i;
    }

    public final void j(int i) {
        this.beforeSleepOutTime = i;
    }

    public final void k(@NotNull List<SleepMainData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.curList = list;
    }

    public final void l(int i) {
        this.curSleepInTime = i;
    }

    public final void m(int i) {
        this.curSleepOutTime = i;
    }

    public final void n(int i) {
        this.score = i;
    }
}
