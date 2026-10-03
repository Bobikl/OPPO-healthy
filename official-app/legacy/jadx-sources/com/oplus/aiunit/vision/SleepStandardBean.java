package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.wph, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t\"\u0004\b\r\u0010\u000bR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b\"\u0010 R\"\u0010&\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b\u0017\u0010 R\"\u0010(\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b'\u0010\u001e\"\u0004\b\u0010\u0010 ¨\u0006+"}, d2 = {"Lcom/oplus/aiunit/vision/wph;", "", "", "toString", "", "Lcom/oplus/aiunit/vision/xph;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "setCurStandardList", "(Ljava/util/List;)V", "curStandardList", "setBeforeStandardList", "beforeStandardList", "", "c", "I", "getCurStandardNum", "()I", b2n.g, "(I)V", "curStandardNum", "d", "getBeforeStandardNum", MapSchema.FIELD_NAME_ENTRY, "beforeStandardNum", "", "Z", "getCurHasMainSleep", "()Z", b2n.f, "(Z)V", "curHasMainSleep", "f", "getCurHasAdvice", "curHasAdvice", "getBeforeHasMainSleep", "beforeHasMainSleep", "getBeforeHasAdvice", "beforeHasAdvice", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepStandardBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public List<SleepStandardDayBean> curStandardList = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public List<SleepStandardDayBean> beforeStandardList = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int curStandardNum;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int beforeStandardNum;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean curHasMainSleep;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public boolean curHasAdvice;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public boolean beforeHasMainSleep;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public boolean beforeHasAdvice;

    @NotNull
    public final List<SleepStandardDayBean> a() {
        return this.beforeStandardList;
    }

    @NotNull
    public final List<SleepStandardDayBean> b() {
        return this.curStandardList;
    }

    public final void c(boolean z) {
        this.beforeHasAdvice = z;
    }

    public final void d(boolean z) {
        this.beforeHasMainSleep = z;
    }

    public final void e(int i) {
        this.beforeStandardNum = i;
    }

    public final void f(boolean z) {
        this.curHasAdvice = z;
    }

    public final void g(boolean z) {
        this.curHasMainSleep = z;
    }

    public final void h(int i) {
        this.curStandardNum = i;
    }

    @NotNull
    public String toString() {
        return "SleepStandardBean(curStandardList=" + this.curStandardList + ", beforeStandardList=" + this.beforeStandardList + ", curStandardNum=" + this.curStandardNum + ", beforeStandardNum=" + this.beforeStandardNum + ", curHasMainSleep=" + this.curHasMainSleep + ", curHasAdvice=" + this.curHasAdvice + ", beforeHasMainSleep=" + this.beforeHasMainSleep + ", beforeHasAdvice=" + this.beforeHasAdvice + ")";
    }
}
