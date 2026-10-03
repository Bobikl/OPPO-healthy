package com.heytap.health.insight.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.insight.ui.view.AdaptiveLegendView;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.LegendPair;
import com.oplus.aiunit.vision.LegendWrapper;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,B\u001b\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b+\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0014\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0002J\u0016\u0010\u0015\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\tH\u0002J\f\u0010\u0018\u001a\u00020\u0002*\u00020\u0017H\u0002J\f\u0010\u0019\u001a\u00020\u0002*\u00020\u0017H\u0002J\f\u0010\u001a\u001a\u00020\u0002*\u00020\fH\u0002R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001e¨\u00060"}, d2 = {"Lcom/heytap/health/insight/ui/view/AdaptiveLegendView;", "Landroid/view/View;", "", "getLineHeight", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", "Lcom/oplus/aiunit/vision/qva;", "legendList", "setLegendPairList", "", "leftOffset", "Lcom/oplus/aiunit/vision/rva;", "legend", "c", "rowNum", b2n.f, "top", "f", MapSchema.FIELD_NAME_ENTRY, "d", "", "j", b2n.g, "b", "i", "Ljava/util/List;", "legendPairList", "I", "lineSpacing", MapSchema.FIELD_NAME_KEY, "legendSpacing", LogFieldKey.LEVEL_KEY, "textImageSpacing", "Landroid/graphics/Paint;", LogFieldKey.MESSAGE_KEY, "Landroid/graphics/Paint;", "textPaint", "n", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAdaptiveLegendView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdaptiveLegendView.kt\ncom/heytap/health/insight/ui/view/AdaptiveLegendView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
public final class AdaptiveLegendView extends View {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public List<LegendWrapper> legendPairList;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int lineSpacing;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int legendSpacing;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int textImageSpacing;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Paint textPaint;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int rowNum;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaptiveLegendView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.legendPairList = CollectionsKt__CollectionsKt.emptyList();
        this.lineSpacing = b(3.0f);
        this.legendSpacing = b(20.0f);
        this.textImageSpacing = b(4.0f);
        Paint paint = new Paint();
        this.textPaint = paint;
        paint.setTextSize(b(10.0f));
        paint.setColor(Color.parseColor("#99000000"));
    }

    private final int getLineHeight() {
        return h("A");
    }

    public static final void i(AdaptiveLegendView this$0, List legendList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(legendList, "$legendList");
        this$0.rowNum = this$0.e(legendList);
        this$0.setLayoutParams(new LinearLayout.LayoutParams(this$0.getWidth(), this$0.g(this$0.rowNum)));
    }

    public final int b(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void c(Canvas canvas, float leftOffset, LegendWrapper legend) {
        float width = legend.getWidth() + leftOffset;
        float rowNum = legend.getRowNum() * (getLineHeight() + this.lineSpacing);
        Drawable drawable = legend.getLegend().getDrawable();
        if (drawable != null) {
            float lineHeight = ((getLineHeight() - drawable.getIntrinsicHeight()) / 2) + rowNum;
            drawable.setBounds(new Rect((int) width, (int) lineHeight, (int) (width + drawable.getIntrinsicWidth()), (int) (lineHeight + drawable.getIntrinsicHeight())));
            drawable.draw(canvas);
        }
        canvas.save();
        canvas.translate((drawable != null ? drawable.getIntrinsicWidth() : 0.0f) + this.textImageSpacing, 0.0f);
        canvas.drawText(legend.getLegend().getText(), leftOffset + legend.getWidth(), f(rowNum), this.textPaint);
        canvas.restore();
    }

    public final float d(LegendPair legend) {
        Drawable drawable = legend.getDrawable();
        return (drawable != null ? drawable.getIntrinsicWidth() : 0.0f) + this.textImageSpacing + j(legend.getText());
    }

    public final int e(List<LegendPair> legendList) {
        ArrayList arrayList = new ArrayList();
        int size = legendList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            float fD = d(legendList.get(i3));
            if (i2 + fD >= getWidth()) {
                i++;
                i2 = 0;
            }
            arrayList.add(new LegendWrapper(legendList.get(i3), i, i2));
            i2 = i2 + ((int) fD) + this.legendSpacing;
        }
        this.legendPairList = arrayList;
        return i + 1;
    }

    public final float f(float top) {
        return (top + getLineHeight()) - this.textPaint.getFontMetrics().descent;
    }

    public final int g(int rowNum) {
        return (RangesKt___RangesKt.coerceAtLeast(rowNum - 1, 0) * this.lineSpacing) + (rowNum * h("A"));
    }

    public final int h(String str) {
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        return (int) (fontMetrics.bottom - fontMetrics.top);
    }

    public final int j(String str) {
        return (int) this.textPaint.measureText(str);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        float width;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.rowNum == 1) {
            Iterator<T> it = this.legendPairList.iterator();
            int iD = 0;
            while (it.hasNext()) {
                iD += (int) d(((LegendWrapper) it.next()).getLegend());
            }
            width = (getWidth() - (iD + ((this.legendPairList.size() - 1) * this.legendSpacing))) / 2;
        } else {
            width = 0.0f;
        }
        int size = this.legendPairList.size();
        for (int i = 0; i < size; i++) {
            c(canvas, width, this.legendPairList.get(i));
        }
    }

    public final void setLegendPairList(@NotNull final List<LegendPair> legendList) {
        Intrinsics.checkNotNullParameter(legendList, "legendList");
        post(new Runnable() { // from class: com.oplus.aiunit.vision.vp
            @Override // java.lang.Runnable
            public final void run() {
                AdaptiveLegendView.i(this.i, legendList);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaptiveLegendView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.legendPairList = CollectionsKt__CollectionsKt.emptyList();
        this.lineSpacing = b(3.0f);
        this.legendSpacing = b(20.0f);
        this.textImageSpacing = b(4.0f);
        Paint paint = new Paint();
        this.textPaint = paint;
        paint.setTextSize(b(10.0f));
        paint.setColor(Color.parseColor("#99000000"));
    }
}
