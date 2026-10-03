package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SleepDataStat;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0016\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u001a\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u0003\u0010\u001e\"\u0004\b\u0017\u0010\u001f¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/xqh;", "", "Lcom/oplus/aiunit/vision/rqh;", "a", "Lcom/oplus/aiunit/vision/rqh;", "b", "()Lcom/oplus/aiunit/vision/rqh;", b2n.g, "(Lcom/oplus/aiunit/vision/rqh;)V", "curSleepTimeData", "", "I", "getBeforeSleepInTime", "()I", "c", "(I)V", "beforeSleepInTime", "getBeforeSleepOutTime", "d", "beforeSleepOutTime", "getCurSleepInTime", "f", "curSleepInTime", MapSchema.FIELD_NAME_ENTRY, "getCurSleepOutTime", b2n.f, "curSleepOutTime", "", "Lcom/heytap/databaseengine/model/SleepDataStat;", "Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)V", "curList", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class xqh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public rqh curSleepTimeData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int beforeSleepInTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int beforeSleepOutTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int curSleepInTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int curSleepOutTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public List<SleepDataStat> curList = new ArrayList();

    @NotNull
    public final List<SleepDataStat> a() {
        return this.curList;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final rqh getCurSleepTimeData() {
        return this.curSleepTimeData;
    }

    public final void c(int i) {
        this.beforeSleepInTime = i;
    }

    public final void d(int i) {
        this.beforeSleepOutTime = i;
    }

    public final void e(@NotNull List<SleepDataStat> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.curList = list;
    }

    public final void f(int i) {
        this.curSleepInTime = i;
    }

    public final void g(int i) {
        this.curSleepOutTime = i;
    }

    public final void h(@Nullable rqh rqhVar) {
        this.curSleepTimeData = rqhVar;
    }
}
