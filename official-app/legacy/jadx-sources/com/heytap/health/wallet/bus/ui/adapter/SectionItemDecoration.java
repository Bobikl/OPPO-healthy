package com.heytap.health.wallet.bus.ui.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.network.bus.rsp.CityCardIotDTO;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.qz0;
import com.oppo.lib.common.R$color;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SectionItemDecoration extends RecyclerView.ItemDecoration {
    public List<CityCardIotDTO> a;
    public TextPaint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f6203c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6204e;
    public int f;

    public SectionItemDecoration(Context context, List<CityCardIotDTO> list) {
        this.a = list;
        Context context2 = qz0.mContext;
        this.d = ejg.a(context2, 28.0f);
        this.f = ejg.a(context2, 12.0f);
        this.f6204e = ContextCompat.getColor(context, R$color.color_FF000000);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(this.f);
        this.b.setColor(this.f6204e);
        this.f6203c = new Rect();
    }

    public final void a(Canvas canvas, int i, int i2, View view, RecyclerView.LayoutParams layoutParams, int i3) {
        this.b.getTextBounds(this.a.get(i3).getSection(), 0, this.a.get(i3).getSection().length(), this.f6203c);
        canvas.drawText(this.a.get(i3).getSection(), view.getPaddingLeft(), (view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((this.d / 2) - (this.f6203c.height() / 2)), this.b);
    }

    public void b(List<CityCardIotDTO> list) {
        this.a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int viewLayoutPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        List<CityCardIotDTO> list = this.a;
        if (list == null || list.isEmpty() || viewLayoutPosition > this.a.size() - 1 || viewLayoutPosition <= -1) {
            return;
        }
        if (viewLayoutPosition == 0) {
            rect.set(0, this.d, 0, 0);
        } else {
            if (this.a.get(viewLayoutPosition).getSection() == null || this.a.get(viewLayoutPosition).getSection().equals(this.a.get(viewLayoutPosition - 1).getSection())) {
                return;
            }
            rect.set(0, this.d, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            List<CityCardIotDTO> list = this.a;
            if (list != null && !list.isEmpty() && viewLayoutPosition <= this.a.size() - 1 && viewLayoutPosition > -1) {
                if (viewLayoutPosition == 0) {
                    a(canvas, paddingLeft, width, childAt, layoutParams, viewLayoutPosition);
                } else if (this.a.get(viewLayoutPosition).getSection() != null && !this.a.get(viewLayoutPosition).getSection().equals(this.a.get(viewLayoutPosition - 1).getSection())) {
                    a(canvas, paddingLeft, width, childAt, layoutParams, viewLayoutPosition);
                }
            }
        }
    }
}
