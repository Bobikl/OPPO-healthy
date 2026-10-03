package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.health.ui.R$id;
import com.oplus.aiunit.vision.yha;
import fitness.support.v7.widget.JToolbar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SuppressLint({"WrongConstant"})
public class ColorRecyclerView2 extends COUIRecyclerView {
    JToolbar.a mDividerRangeHelper;
    private boolean mLinkageToolbar;
    private Paint mPullDownGapPaint;
    private int mPullDownGapPaintColor;
    private float mPullDownHeight;
    private int mTotalOverScrollY;
    private int mTotalScrollY;
    private int oldSy;
    private OnOverScrolledListener onOverScrolledListener;

    public interface OnOverScrolledListener {
        void onOverScrolledBottom();

        void onOverScrolledTop();
    }

    public ColorRecyclerView2(@NotNull Context context) {
        super(context);
        this.oldSy = 0;
        this.mLinkageToolbar = true;
        this.mPullDownGapPaint = new Paint();
        initPaint();
    }

    private void initPaint() {
        Paint paint = new Paint();
        this.mPullDownGapPaint = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.mPullDownGapPaint;
        this.mPullDownGapPaintColor = 16777215;
        paint2.setColor(16777215);
        this.mPullDownGapPaint.setStyle(Paint.Style.FILL);
    }

    private void updateTopLine(int i, int i2) {
        JToolbar.a aVar;
        if (i2 == 0) {
            int i3 = this.mTotalScrollY + i;
            this.mTotalScrollY = i3;
            JToolbar.a aVar2 = this.mDividerRangeHelper;
            if (aVar2 != null) {
                aVar2.b(i3);
                return;
            }
            return;
        }
        int i4 = this.mTotalOverScrollY + i2;
        this.mTotalOverScrollY = i4;
        if (i4 < 0 || this.mTotalScrollY > 6 || (aVar = this.mDividerRangeHelper) == null) {
            return;
        }
        aVar.b(i4);
    }

    public void linkageJToolbar(boolean z) {
        this.mLinkageToolbar = z;
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mLinkageToolbar) {
            View viewFindViewById = getRootView().findViewById(R$id.fit_toolbar);
            if (viewFindViewById instanceof JToolbar) {
                JToolbar.a jDividerHelper = ((JToolbar) viewFindViewById).getJDividerHelper();
                this.mDividerRangeHelper = jDividerHelper;
                jDividerHelper.b(0);
                yha.b("onAttachedToWindow：", Integer.valueOf(this.mTotalScrollY));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.mPullDownHeight;
        if (f < 0.0f) {
            canvas.drawRect(0.0f, f, getWidth(), 0.0f, this.mPullDownGapPaint);
        }
    }

    @Override // androidx.recyclerview.widget.COUIRecyclerView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        updateTopLine(0, i2 - this.oldSy);
        OnOverScrolledListener onOverScrolledListener = this.onOverScrolledListener;
        if (onOverScrolledListener != null) {
            if (this.oldSy < 0 && i2 >= 0) {
                onOverScrolledListener.onOverScrolledTop();
            }
            if (this.oldSy > 0 && i2 <= 0) {
                this.onOverScrolledListener.onOverScrolledBottom();
            }
        }
        this.oldSy = i2;
        this.mPullDownHeight = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        updateTopLine(i2, 0);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && isShown() && this.mDividerRangeHelper != null) {
            yha.b("onWindowFocusChanged：", Integer.valueOf(this.mTotalScrollY));
            this.mDividerRangeHelper.b(this.mTotalScrollY);
        }
    }

    public void setOnOverScrolledListener(OnOverScrolledListener onOverScrolledListener) {
        this.onOverScrolledListener = onOverScrolledListener;
    }

    public void setPullDownGapColor(int i) {
        this.mPullDownGapPaintColor = i;
        this.mPullDownGapPaint.setColor(i);
    }

    public ColorRecyclerView2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.oldSy = 0;
        this.mLinkageToolbar = true;
        this.mPullDownGapPaint = new Paint();
        initPaint();
    }
}
