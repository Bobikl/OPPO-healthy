package com.heytap.health.operation.ecg.weiget;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.sporthealth.blib.weiget.jlayout.MultiStateLayout;
import com.oplus.aiunit.vision.rg7;

/* JADX INFO: loaded from: classes17.dex */
public class BottomTipDecoration extends RecyclerView.ItemDecoration {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextPaint f5182c = new TextPaint(1);
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5183e;
    public int f;
    public StaticLayout g;

    public BottomTipDecoration(int i, int i2, int i3) {
        this.a = 40;
        this.b = SupportMenu.CATEGORY_MASK;
        this.d = "00";
        this.a = MultiStateLayout.g(i);
        this.b = i2;
        this.d = rg7.e(i3);
        this.f5182c.setTextSize(this.a);
        this.f5182c.setColor(this.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        int measuredWidth;
        View viewFindViewByPosition;
        super.onDrawOver(canvas, recyclerView, state);
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || (measuredWidth = recyclerView.getMeasuredWidth()) == 0) {
            return;
        }
        if (this.f5183e == 0.0f) {
            int iMin = (int) Math.min(this.f5182c.measureText(this.d), measuredWidth - (MultiStateLayout.g(24.0f) * 2));
            String str = this.d;
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), this.f5182c, iMin).build();
            this.g = staticLayoutBuild;
            float width = staticLayoutBuild.getWidth();
            this.f = this.g.getHeight();
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), MultiStateLayout.g(40.0f) + this.f);
            this.f5183e = (measuredWidth >> 1) - (width / 2.0f);
        }
        int itemCount = adapter.getItemCount() - 1;
        if (itemCount == iFindLastVisibleItemPosition && !recyclerView.canScrollVertically(11) && !recyclerView.canScrollVertically(-11)) {
            canvas.save();
            canvas.translate(this.f5183e, (recyclerView.getBottom() - MultiStateLayout.g(20.0f)) - this.f);
            this.g.draw(canvas);
            canvas.restore();
            return;
        }
        if (itemCount != iFindLastVisibleItemPosition || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindLastVisibleItemPosition)) == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.f5183e, viewFindViewByPosition.getBottom() + MultiStateLayout.g(20.0f));
        this.g.draw(canvas);
        canvas.restore();
    }
}
