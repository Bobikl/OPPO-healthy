package com.heytap.sports.record.details.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0017\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u001dJ\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\f\u001a\u00020\u0007H\u0002R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/heytap/sports/record/details/widget/TennisDetailDistributionMapView;", "Landroid/view/View;", "", "", "dataArr", "", "refresh", "", "b", "Landroid/graphics/Canvas;", "canvas", "onDraw", "a", "i", "Ljava/util/List;", "colorArr", "j", "Landroid/graphics/Paint;", MapSchema.FIELD_NAME_KEY, "Landroid/graphics/Paint;", "mPaint", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTennisDetailDistributionMapView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TennisDetailDistributionMapView.kt\ncom/heytap/sports/record/details/widget/TennisDetailDistributionMapView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1855#2,2:118\n*S KotlinDebug\n*F\n+ 1 TennisDetailDistributionMapView.kt\ncom/heytap/sports/record/details/widget/TennisDetailDistributionMapView\n*L\n69#1:118,2\n*E\n"})
public final class TennisDetailDistributionMapView extends View {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public List<Integer> colorArr;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<Integer> dataArr;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public Paint mPaint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TennisDetailDistributionMapView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorArr = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{-14037656, -7940066, -14259211, -14758451, -15602});
        this.dataArr = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{34, 12, 8, 9, 10});
        this.mPaint = new Paint();
        a();
    }

    public final void a() {
        this.mPaint.setAntiAlias(true);
        this.mPaint.setPathEffect(new CornerPathEffect(8.0f));
    }

    public final void b(@NotNull List<Integer> dataArr, boolean refresh) {
        Intrinsics.checkNotNullParameter(dataArr, "dataArr");
        this.dataArr = dataArr;
        if (refresh) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        int i;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.colorArr.isEmpty()) {
            this.colorArr = CollectionsKt__CollectionsJVMKt.listOf(2739560);
        }
        int i2 = 0;
        if (!this.dataArr.isEmpty()) {
            Iterator<T> it = this.dataArr.iterator();
            i = 0;
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (iIntValue > 0) {
                    i += iIntValue;
                }
            }
        } else {
            i = 0;
        }
        canvas.save();
        canvas.clipRect(getPaddingStart(), getPaddingTop(), getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom());
        if (i <= 0) {
            this.mPaint.setColor(this.colorArr.get(0).intValue());
            this.mPaint.setStyle(Paint.Style.STROKE);
            canvas.drawRect(getPaddingStart(), getPaddingTop(), getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom(), this.mPaint);
        } else {
            this.mPaint.setStyle(Paint.Style.FILL);
            float paddingStart = getPaddingStart();
            int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
            Iterator<Integer> it2 = this.dataArr.iterator();
            while (it2.hasNext()) {
                i2++;
                int iIntValue2 = it2.next().intValue();
                if (iIntValue2 > 0) {
                    float f = paddingStart + (width * (iIntValue2 / i));
                    canvas.save();
                    canvas.clipRect(paddingStart, getPaddingTop(), f, getHeight() - getPaddingBottom());
                    Paint paint = this.mPaint;
                    List<Integer> list = this.colorArr;
                    paint.setColor(list.get(i2 % list.size()).intValue());
                    canvas.drawRect(getPaddingStart(), getPaddingTop(), getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom(), this.mPaint);
                    canvas.restore();
                    paddingStart = f;
                }
            }
        }
        canvas.restore();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TennisDetailDistributionMapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorArr = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{-14037656, -7940066, -14259211, -14758451, -15602});
        this.dataArr = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{34, 12, 8, 9, 10});
        this.mPaint = new Paint();
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TennisDetailDistributionMapView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorArr = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{-14037656, -7940066, -14259211, -14758451, -15602});
        this.dataArr = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{34, 12, 8, 9, 10});
        this.mPaint = new Paint();
        a();
    }
}
