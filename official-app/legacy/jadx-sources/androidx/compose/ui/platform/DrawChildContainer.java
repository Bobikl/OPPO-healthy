package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.R;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J%\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J0\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0014J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isDrawing", "", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawChild", "Landroidx/compose/ui/graphics/Canvas;", "view", "Landroid/view/View;", "drawingTime", "", "drawChild$ui_release", "getChildCount", "", "onLayout", "changed", LogFieldKey.LEVEL_KEY, "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DrawChildContainer extends ViewGroup {
    private boolean isDrawing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawChildContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        boolean z;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int childCount = super.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).getIsInvalidated()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.isDrawing = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.isDrawing = false;
            }
        }
    }

    public final void drawChild$ui_release(@NotNull androidx.compose.ui.graphics.Canvas canvas, @NotNull View view, long drawingTime) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        super.drawChild(AndroidCanvas_androidKt.getNativeCanvas(canvas), view, drawingTime);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.isDrawing) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t, int r, int b) {
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }
}
