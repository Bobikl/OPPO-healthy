package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.sleep.bean.SleepDayBean;
import com.heytap.health.sleep.snore.SnoreHistoryActivity;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.random.Random;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\b'\u0018\u0000 ;2\u00020\u0001:\u0001<B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b:\u0010\u001aJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0014J&\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u000f\u001a\u00020\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010)\u001a\u00020\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\"\u0010,\u001a\u00020\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\"\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b*\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00107\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b'\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00109\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00108¨\u0006="}, d2 = {"Lcom/oplus/aiunit/vision/jah;", "Lcom/oplus/aiunit/vision/ap8;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, "", "b", "", "s", "itemView", "f", "", "curDayTime", "r", "Lcom/heytap/health/sleep/bean/SleepDayBean;", "curSleepDayBean", "z", "Lcom/heytap/health/base/base/BaseFragment;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/health/base/base/BaseFragment;", "getBaseFragment", "()Lcom/heytap/health/base/base/BaseFragment;", "setBaseFragment", "(Lcom/heytap/health/base/base/BaseFragment;)V", "baseFragment", "q", "Landroid/view/View;", "t", "()Landroid/view/View;", "setCardView", "(Landroid/view/View;)V", "J", "w", "()J", "setCurDayTime", "(J)V", "v", "setCurDayStartTime", SnoreHistoryActivity.CUR_DAY_START_TIME, "u", "setCurDayEndTime", SnoreHistoryActivity.CUR_DAY_END_TIME, "Lcom/heytap/health/sleep/bean/SleepDayBean;", "x", "()Lcom/heytap/health/sleep/bean/SleepDayBean;", "setCurSleepDayBean", "(Lcom/heytap/health/sleep/bean/SleepDayBean;)V", "Z", "y", "()Z", "A", "(Z)V", "isInit", "I", "mViewType", "<init>", "Companion", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepBaseCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepBaseCard.kt\ncom/heytap/health/sleep/day/card/SleepBaseCard\n+ 2 CommonUtil.kt\ncom/heytap/health/healthbase/util/CommonUtilKt\n*L\n1#1,82:1\n15#2,4:83\n*S KotlinDebug\n*F\n+ 1 SleepBaseCard.kt\ncom/heytap/health/sleep/day/card/SleepBaseCard\n*L\n47#1:83,4\n*E\n"})
public abstract class jah extends ap8 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public BaseFragment baseFragment;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public View cardView;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public long curDayTime;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public long curDayStartTime;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public long curDayEndTime;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public SleepDayBean curSleepDayBean;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean isInit;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final int mViewType;
    public static final int $stable = 8;

    public jah(@NotNull BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        this.baseFragment = baseFragment;
        this.mViewType = Random.INSTANCE.nextInt();
    }

    public final void A(boolean z) {
        this.isInit = z;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getMViewType() {
        return this.mViewType;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void f(@Nullable Context context, @Nullable View itemView, @Nullable View cardView) {
        super.f(context, itemView, cardView);
        if (!s() || cardView == null) {
            return;
        }
        y0l.d(this.baseFragment, cardView);
    }

    @Override // com.oplus.aiunit.vision.ap8, com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable Context context, @Nullable View cardView) {
        String simpleName = getClass().getSimpleName();
        int i = this.mViewType;
        StringBuilder sb = new StringBuilder();
        sb.append("renderView: ");
        sb.append(simpleName);
        sb.append(", mViewType: ");
        sb.append(i);
        this.cardView = cardView;
        if (ArraysKt___ArraysKt.filterNotNull(new Object[]{context, cardView}).size() == 2) {
            Intrinsics.checkNotNull(context);
            q(context);
            Intrinsics.checkNotNull(cardView);
            p(context, cardView);
            this.isInit = true;
            SleepDayBean sleepDayBean = this.curSleepDayBean;
            if (sleepDayBean != null) {
                z(sleepDayBean);
            }
        }
    }

    public void r(long curDayTime) {
        this.curDayTime = curDayTime;
        mq8 mq8Var = mq8.INSTANCE;
        this.curDayStartTime = mq8Var.o(curDayTime);
        this.curDayEndTime = mq8Var.n(curDayTime);
    }

    public boolean s() {
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: t, reason: from getter */
    public final View getCardView() {
        return this.cardView;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getCurDayEndTime() {
        return this.curDayEndTime;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getCurDayStartTime() {
        return this.curDayStartTime;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final long getCurDayTime() {
        return this.curDayTime;
    }

    @Nullable
    /* JADX INFO: renamed from: x, reason: from getter */
    public final SleepDayBean getCurSleepDayBean() {
        return this.curSleepDayBean;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getIsInit() {
        return this.isInit;
    }

    public void z(@NotNull SleepDayBean curSleepDayBean) {
        Intrinsics.checkNotNullParameter(curSleepDayBean, "curSleepDayBean");
        this.curSleepDayBean = curSleepDayBean;
    }
}
