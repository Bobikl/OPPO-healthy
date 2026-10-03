package com.health.sleep_breath_rate.day.card;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.ViewPager;
import com.health.sleep_breath_rate.R$id;
import com.health.sleep_breath_rate.R$layout;
import com.health.sleep_breath_rate.day.SleepBRDayFragment;
import com.health.sleep_breath_rate.view.SleepBRDayViewPager;
import com.heytap.health.health.family.FamilyMoreDataDetailConfigBean;
import com.oplus.aiunit.vision.bdh;
import com.oplus.aiunit.vision.ceh;
import com.oplus.aiunit.vision.m8b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001?B\u001b\u0012\u0006\u0010'\u001a\u00020 \u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010(¢\u0006\u0004\b<\u0010=J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\bJ\u0014\u0010\u0019\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0017J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000bH\u0002R\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108¨\u0006@"}, d2 = {"Lcom/health/sleep_breath_rate/day/card/SleepBRDayPageCard;", "Lcom/oplus/aiunit/vision/ceh;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", "p", "", "e", "", "", "allDataList", "currentItemIndex", "G", "A", "z", "H", "C", "timestamp", "currentItem", "B", "", "Lcom/oplus/aiunit/vision/bdh;", "dataList", "D", "curSleepDayBean", "F", "", "u5", "curDayTimestamp", "E", "Lcom/health/sleep_breath_rate/day/SleepBRDayFragment;", "s", "Lcom/health/sleep_breath_rate/day/SleepBRDayFragment;", "getFragment", "()Lcom/health/sleep_breath_rate/day/SleepBRDayFragment;", "setFragment", "(Lcom/health/sleep_breath_rate/day/SleepBRDayFragment;)V", "fragment", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "t", "Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "getFamilyConfigBean", "()Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;", "setFamilyConfigBean", "(Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;)V", "familyConfigBean", "Lcom/health/sleep_breath_rate/view/SleepBRDayViewPager;", "u", "Lcom/health/sleep_breath_rate/view/SleepBRDayViewPager;", "sleepDayViewPage", "v", "Z", "isScrolling", "w", "J", "lastDayTime", "x", "lastRefreshTimestamp", "<init>", "(Lcom/health/sleep_breath_rate/day/SleepBRDayFragment;Lcom/heytap/health/health/family/FamilyMoreDataDetailConfigBean;)V", "Companion", "a", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class SleepBRDayPageCard extends ceh {

    @NotNull
    public SleepBRDayFragment s;

    @Nullable
    public FamilyMoreDataDetailConfigBean t;

    @Nullable
    public SleepBRDayViewPager u;
    public boolean v;
    public long w;
    public long x;
    public static final int $stable = 8;

    public SleepBRDayPageCard(@NotNull SleepBRDayFragment sleepBRDayFragment, @Nullable FamilyMoreDataDetailConfigBean familyMoreDataDetailConfigBean) {
        Intrinsics.checkNotNullParameter(sleepBRDayFragment, "fragment");
        this.s = sleepBRDayFragment;
        this.t = familyMoreDataDetailConfigBean;
    }

    public final void A() {
        SleepBRDayViewPager sleepBRDayViewPager = this.u;
        if (sleepBRDayViewPager != null) {
            sleepBRDayViewPager.f();
        }
    }

    public final void B(long timestamp, int currentItem) {
        SleepBRDayViewPager sleepBRDayViewPager = this.u;
        if (sleepBRDayViewPager != null) {
            sleepBRDayViewPager.setCurrentItem(currentItem, false);
        }
        E(timestamp);
    }

    public final void C() {
        SleepBRDayViewPager sleepBRDayViewPager = this.u;
        if (sleepBRDayViewPager != null) {
            Intrinsics.checkNotNull(sleepBRDayViewPager);
            sleepBRDayViewPager.setCurrentItem(sleepBRDayViewPager.getCurrentItem() + 1, true);
        }
    }

    public final void D(@NotNull List<bdh> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        m8b.f("SleepHRDayPageCard", "refresh:" + dataList.size());
        SleepBRDayViewPager sleepBRDayViewPager = this.u;
        if (sleepBRDayViewPager != null) {
            sleepBRDayViewPager.h(dataList);
        }
    }

    public final void E(long curDayTimestamp) {
        m8b.f("SleepHRDayPageCard", "refreshCardView:" + curDayTimestamp);
        if (this.x != curDayTimestamp) {
            this.x = curDayTimestamp;
            this.s.t0().u(curDayTimestamp);
            this.s.s0().k(curDayTimestamp, 3);
        } else {
            m8b.f("SleepHRDayPageCard", "Need not refresh:" + curDayTimestamp);
        }
    }

    public final void F(@NotNull bdh curSleepDayBean) {
        Intrinsics.checkNotNullParameter(curSleepDayBean, "curSleepDayBean");
    }

    public final void G(@NotNull List<Long> allDataList, int currentItemIndex) {
        Intrinsics.checkNotNullParameter(allDataList, "allDataList");
        SleepBRDayViewPager sleepBRDayViewPager = this.u;
        if (sleepBRDayViewPager != null) {
            sleepBRDayViewPager.setData(allDataList);
        }
        SleepBRDayViewPager sleepBRDayViewPager2 = this.u;
        if (sleepBRDayViewPager2 != null) {
            sleepBRDayViewPager2.setCurrentItem(currentItemIndex, false);
        }
        E(allDataList.get(currentItemIndex).longValue());
    }

    public final void H() {
        SleepBRDayViewPager sleepBRDayViewPager = this.u;
        if (sleepBRDayViewPager != null) {
            Intrinsics.checkNotNull(sleepBRDayViewPager);
            sleepBRDayViewPager.setCurrentItem(sleepBRDayViewPager.getCurrentItem() - 1, true);
        }
    }

    public int e() {
        return R$layout.health_sleep_br_day_view_page_card;
    }

    public void p(@NotNull Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        Object objA = a(cardView, R$id.sleep_day_viewpage);
        Intrinsics.checkNotNull(objA, "null cannot be cast to non-null type com.health.sleep_breath_rate.view.SleepBRDayViewPager");
        SleepBRDayViewPager sleepBRDayViewPager = (SleepBRDayViewPager) objA;
        this.u = sleepBRDayViewPager;
        if (sleepBRDayViewPager != null) {
            sleepBRDayViewPager.setFamilyConfig(this.t);
        }
        SleepBRDayViewPager sleepBRDayViewPager2 = this.u;
        if (sleepBRDayViewPager2 != null) {
            sleepBRDayViewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.health.sleep_breath_rate.day.card.SleepBRDayPageCard$initView$1
                public void onPageScrollStateChanged(int state) {
                    if (state == 0) {
                        this.i.v = false;
                    } else {
                        if (state != 1) {
                            return;
                        }
                        this.i.v = true;
                    }
                }

                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                public void onPageSelected(int position) {
                    m8b.f("SleepHRDayPageCard", "onPageSelected:" + position);
                    SleepBRDayViewPager sleepBRDayViewPager3 = this.i.u;
                    Intrinsics.checkNotNull(sleepBRDayViewPager3);
                    long jLongValue = sleepBRDayViewPager3.getData().get(position).longValue();
                    this.i.E(jLongValue);
                    if (this.i.v && this.i.w > 0 && (this.i.w < jLongValue || this.i.w > jLongValue)) {
                        this.i.u5();
                    }
                    this.i.w = jLongValue;
                    this.i.v = false;
                }
            });
        }
    }

    public final boolean u5() {
        return this.t != null;
    }

    public final void z() {
        SleepBRDayViewPager sleepBRDayViewPager = this.u;
        if (sleepBRDayViewPager != null) {
            sleepBRDayViewPager.e();
        }
    }
}
