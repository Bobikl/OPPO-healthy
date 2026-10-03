package com.heytap.health.base.view.calendar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.yq2;
import com.oplus.aiunit.vision.yt5;
import io.protostuff.MapSchema;
import java.time.DayOfWeek;
import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u0001:\u0001\u0013B+\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001e\u001a\u00020\f\u0012\b\b\u0002\u0010 \u001a\u00020\f¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\"R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u00061"}, d2 = {"Lcom/heytap/health/base/view/calendar/FixedMonthView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "Ljava/time/LocalDate;", "date", MapSchema.FIELD_NAME_ENTRY, "setSelectedDay", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "", "Lcom/heytap/health/base/view/calendar/a;", "getDayViews", "()[Lcom/heytap/health/base/view/calendar/a;", "", "a", "weekDay", "c", "b", "d", "Lcom/oplus/aiunit/vision/yq2;", "i", "Lcom/oplus/aiunit/vision/yq2;", "monthViewAdapter", "j", "Z", "fixedTotalHeight", MapSchema.FIELD_NAME_KEY, "mondayFirst", LogFieldKey.LEVEL_KEY, "Ljava/time/LocalDate;", "firstDateOfMonth", LogFieldKey.MESSAGE_KEY, "I", "rowNum", "n", "selectedDate", "o", "[Lcom/heytap/health/base/view/calendar/a;", "dayViews", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/oplus/aiunit/vision/yq2;ZZ)V", "Companion", "lib_base_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nFixedMonthView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixedMonthView.kt\ncom/heytap/health/base/view/calendar/FixedMonthView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n13374#2,3:204\n13309#2,2:208\n1#3:207\n*S KotlinDebug\n*F\n+ 1 FixedMonthView.kt\ncom/heytap/health/base/view/calendar/FixedMonthView\n*L\n89#1:204,3\n118#1:208,2\n*E\n"})
public final class FixedMonthView extends View {

    @NotNull
    public static final String TAG = "FixedMonthView";
    public static final int dayPerWeek = 7;
    public static final int maxDayNum = 42;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final yq2 monthViewAdapter;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final boolean fixedTotalHeight;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final boolean mondayFirst;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LocalDate firstDateOfMonth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int rowNum;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LocalDate selectedDate;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public a[] dayViews;
    public static final int p = yt5.a(36.0f);
    public static final int q = yt5.a(30.0f);
    public static final int r = yt5.a(4.0f);

    public /* synthetic */ FixedMonthView(Context context, yq2 yq2Var, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, yq2Var, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2);
    }

    public final int a(LocalDate date) {
        LocalDate localDateY = h15.y(date);
        LocalDate localDateH = h15.h(date);
        return ((h15.e(localDateY, localDateH) + c(h15.K(localDateY))) + b(h15.K(localDateH))) / 7;
    }

    public final int b(int weekDay) {
        if (this.mondayFirst) {
            return 7 - weekDay;
        }
        if (weekDay > DayOfWeek.SATURDAY.getValue()) {
            return 6;
        }
        return 6 - weekDay;
    }

    public final int c(int weekDay) {
        if (this.mondayFirst) {
            return weekDay - 1;
        }
        if (weekDay > DayOfWeek.SATURDAY.getValue()) {
            return 0;
        }
        return weekDay;
    }

    public final boolean d() {
        for (ViewParent parent = getParent(); parent != null && (parent instanceof ViewGroup); parent = parent.getParent()) {
            if ((parent instanceof RecyclerView) || (parent instanceof ScrollView)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup instanceof RecyclerView) {
                    return ((RecyclerView) parent).getScrollState() != 0;
                }
                boolean z = viewGroup instanceof ScrollView;
                return false;
            }
        }
        return false;
    }

    public final void e(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDateY = h15.y(date);
        this.firstDateOfMonth = localDateY;
        int i = this.rowNum;
        this.rowNum = a(localDateY);
        LocalDate localDateS = this.mondayFirst ? h15.s(date) : h15.L(date);
        a[] aVarArr = this.dayViews;
        int length = aVarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            a aVar = aVarArr[i2];
            int i4 = i3 + 1;
            LocalDate localDatePlusDays = localDateS.plusDays(i3);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "tempFirstDay.plusDays(index.toLong())");
            aVar.r(localDatePlusDays);
            aVar.t(!h15.o(aVar.getDate(), date) ? 4 : 0);
            if (aVar.getVisibility() == 0) {
                this.monthViewAdapter.d(aVar, aVar.getDate());
            }
            i2++;
            i3 = i4;
        }
        if (!this.fixedTotalHeight && i != this.rowNum) {
            setLayoutParams(new LinearLayout.LayoutParams(-1, this.rowNum * (p + q)));
        }
        invalidate();
    }

    @NotNull
    public final a[] getDayViews() {
        return this.dayViews;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float height = getHeight() / this.rowNum;
        int i = p;
        int i2 = q;
        float f = (height / (i + i2)) * (i + i2);
        int width = getWidth();
        int i3 = r;
        int i4 = (width - (i3 * 2)) / 7;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            a[] aVarArr = this.dayViews;
            if (i5 >= aVarArr.length) {
                return;
            }
            if (i5 % 7 == 0 && aVarArr[i5].getVisibility() == 4) {
                int i7 = i5 + 7;
                if (this.dayViews[i7 - 1].getVisibility() == 4) {
                    i5 = i7;
                }
            }
            a aVar = this.dayViews[i5];
            int i8 = p;
            float f2 = ((i6 / 7) * f) + ((f - i8) / 2.0f);
            float f3 = ((i6 % 7) * i4) + i3;
            aVar.p(canvas, this, f3, f2, f3 + i4, f2 + i8);
            aVar.c();
            i5++;
            i6++;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (event == null) {
            return super.onTouchEvent(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            return true;
        }
        if (actionMasked != 1) {
            return super.onTouchEvent(event);
        }
        if (d()) {
            return false;
        }
        float x = event.getX();
        float y = event.getY();
        for (a aVar : this.dayViews) {
            if (aVar.getVisibility() == 0 && aVar.q(x, y)) {
                m8b.f(TAG, "onTouchEvent onClickDate:" + aVar.getDate());
                a.c onClickDayListener = aVar.getOnClickDayListener();
                if (onClickDayListener != null) {
                    onClickDayListener.a(aVar.getDate());
                }
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setSelectedDay(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate date2 = ((a) ArraysKt___ArraysKt.first(this.dayViews)).getDate();
        LocalDate date3 = ((a) ArraysKt___ArraysKt.last(this.dayViews)).getDate();
        m8b.f(TAG, "setSelectedDay:" + date + ", lastSelectDay:" + this.selectedDate + ", dayViewFirst:" + date2 + ", dayLast:" + date3);
        if (h15.m(date, date2, date3)) {
            LocalDate localDate = this.selectedDate;
            LocalDate localDate2 = null;
            if (localDate != null) {
                if (!h15.m(localDate, date2, date3)) {
                    localDate = null;
                }
                localDate2 = localDate;
            }
            this.selectedDate = localDate2;
            if (Intrinsics.areEqual(localDate2, date)) {
                m8b.f(TAG, "date equals with last, do nothing");
                return;
            }
            this.selectedDate = date;
            if (date != null) {
                for (a aVar : this.dayViews) {
                    aVar.s(Intrinsics.areEqual(aVar.getDate(), date));
                }
            }
            invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedMonthView(@NotNull Context context, @NotNull yq2 monthViewAdapter, boolean z, boolean z2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(monthViewAdapter, "monthViewAdapter");
        this.monthViewAdapter = monthViewAdapter;
        this.fixedTotalHeight = z;
        this.mondayFirst = z2;
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
        this.firstDateOfMonth = localDateNow;
        this.rowNum = 5;
        a[] aVarArr = new a[42];
        for (int i = 0; i < 42; i++) {
            aVarArr[i] = this.monthViewAdapter.c(this);
        }
        this.dayViews = aVarArr;
        LocalDate localDateNow2 = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow2, "now()");
        e(localDateNow2);
    }
}