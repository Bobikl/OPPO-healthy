package com.heytap.health.step.detail.ui.stephistory2.tools;

import androidx.viewpager2.widget.ViewPager2;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.health.base.view.OnPageChangeCallback;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.f04;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 &2\u00020\u0001:\u0003\f\u0012\u0017B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001a\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\"\u0010 R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b!\u0010\u001e\"\u0004\b#\u0010 ¨\u0006'"}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/tools/ViewPagerSliceCompat;", "", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "", "i", "", "curIndex", "patchStartIndex", "patchEndIndex", "j", "Lcom/heytap/health/step/detail/ui/stephistory2/tools/ViewPagerSliceCompat$c;", "a", "Lcom/heytap/health/step/detail/ui/stephistory2/tools/ViewPagerSliceCompat$c;", b2n.g, "()Lcom/heytap/health/step/detail/ui/stephistory2/tools/ViewPagerSliceCompat$c;", "sliceListener", "Lcom/heytap/health/step/detail/ui/stephistory2/tools/ViewPagerSliceCompat$b;", "b", "Lcom/heytap/health/step/detail/ui/stephistory2/tools/ViewPagerSliceCompat$b;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/step/detail/ui/stephistory2/tools/ViewPagerSliceCompat$b;", "dateTransfer", "c", "I", "allEndIndex", "d", "patchSize", "allStartIndex", "f", "()I", MapSchema.FIELD_NAME_KEY, "(I)V", b2n.f, LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "<init>", "(Lcom/heytap/health/step/detail/ui/stephistory2/tools/ViewPagerSliceCompat$c;Lcom/heytap/health/step/detail/ui/stephistory2/tools/ViewPagerSliceCompat$b;)V", "Companion", "step_release"}, k = 1, mv = {1, 8, 0})
public final class ViewPagerSliceCompat {

    @NotNull
    public static final String TAG = "StepDetailViewPagerCompat";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final c sliceListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final b dateTransfer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int allEndIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int patchSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int allStartIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int curIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int patchEndIndex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int patchStartIndex;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/tools/ViewPagerSliceCompat$b;", "", "", CityBean.POS, "Ljava/time/LocalDate;", "K", "date", "j", "step_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        @NotNull
        LocalDate K(int pos);

        int j(@NotNull LocalDate date);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/tools/ViewPagerSliceCompat$c;", "", "", c8l.KEY_B, "z", "startPos", "endPos", "", "J", "i", "Ljava/time/LocalDate;", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "d", "t", "step_release"}, k = 1, mv = {1, 8, 0})
    public interface c {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public static void a(@NotNull c cVar, int i, int i2) {
            }

            public static void b(@NotNull c cVar, int i, int i2) {
            }
        }

        int B();

        void J(int startPos, int endPos);

        void d(@NotNull LocalDate startDate, @NotNull LocalDate endDate);

        void i(int startPos, int endPos);

        void t(@NotNull LocalDate startDate, @NotNull LocalDate endDate);

        int z();
    }

    public ViewPagerSliceCompat(@NotNull c sliceListener, @NotNull b dateTransfer) {
        Intrinsics.checkNotNullParameter(sliceListener, "sliceListener");
        Intrinsics.checkNotNullParameter(dateTransfer, "dateTransfer");
        this.sliceListener = sliceListener;
        this.dateTransfer = dateTransfer;
        int iB = sliceListener.B() - 1;
        this.allEndIndex = iB;
        int iZ = sliceListener.z();
        this.patchSize = iZ;
        this.curIndex = iB;
        this.patchEndIndex = iB - 1;
        this.patchStartIndex = iB - iZ;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCurIndex() {
        return this.curIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getDateTransfer() {
        return this.dateTransfer;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getPatchEndIndex() {
        return this.patchEndIndex;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getPatchStartIndex() {
        return this.patchStartIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getSliceListener() {
        return this.sliceListener;
    }

    public final void i(@NotNull final ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager2");
        a7b.f(TAG, "allDataSize:" + (this.allEndIndex + 1) + ", patchSize:" + this.patchSize);
        viewPager2.registerOnPageChangeCallback(new OnPageChangeCallback(viewPager2) { // from class: com.heytap.health.step.detail.ui.stephistory2.tools.ViewPagerSliceCompat$initSliceCompat$1
            @Override // com.heytap.health.base.view.OnPageChangeCallback, androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                a7b.f(ViewPagerSliceCompat.TAG, "param:(" + this.getCurIndex() + ", [" + this.getPatchStartIndex() + ", " + this.getPatchEndIndex() + "], [" + this.allStartIndex + ", " + this.allEndIndex + "]");
                this.k(position);
                if (this.getCurIndex() == this.getPatchEndIndex() && this.getCurIndex() != this.allEndIndex) {
                    int curIndex = this.getCurIndex() + 1;
                    int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost((this.patchSize + curIndex) - 1, this.allEndIndex);
                    if (this.getDateTransfer() != null) {
                        this.getSliceListener().t(this.getDateTransfer().K(curIndex), this.getDateTransfer().K(iCoerceAtMost));
                    } else {
                        this.getSliceListener().i(curIndex, iCoerceAtMost);
                    }
                    this.l(iCoerceAtMost);
                    return;
                }
                if (this.getCurIndex() != this.getPatchStartIndex() || this.getCurIndex() == this.allStartIndex) {
                    return;
                }
                int curIndex2 = this.getCurIndex() - 1;
                int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast((curIndex2 - this.patchSize) + 1, this.allStartIndex);
                if (this.getDateTransfer() != null) {
                    this.getSliceListener().d(this.getDateTransfer().K(iCoerceAtLeast), this.getDateTransfer().K(curIndex2));
                } else {
                    this.getSliceListener().J(iCoerceAtLeast, curIndex2);
                }
                this.m(iCoerceAtLeast);
            }
        });
    }

    public final void j(int curIndex, int patchStartIndex, int patchEndIndex) {
        this.curIndex = curIndex;
        this.patchEndIndex = patchEndIndex;
        this.patchStartIndex = patchStartIndex;
    }

    public final void k(int i) {
        this.curIndex = i;
    }

    public final void l(int i) {
        this.patchEndIndex = i;
    }

    public final void m(int i) {
        this.patchStartIndex = i;
    }
}
