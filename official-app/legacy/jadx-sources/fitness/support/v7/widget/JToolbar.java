package fitness.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.content.ContextCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.ui.R$color;
import com.heytap.health.ui.R$dimen;
import com.heytap.sporthealth.blib.weiget.jlayout.MultiStateLayout;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.yha;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"all"})
public class JToolbar extends COUIToolbar {
    public a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20440j;
    public Drawable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ActionMenuView f20441l;

    public static class a {
        public View a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f20442c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f20443e;
        public float f;
        public Point g;
        public Point h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f20444j;
        public float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Path f20445l = new Path();
        public float m = 0.0f;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f20446n = MultiStateLayout.g(100.0f);
        public float o;
        public int p;
        public static final int DIVIDER_COLOR = Color.argb(16, 0, 0, 0);
        public static final int DIVIDER_BACKGROUND_COLOR = Color.argb(16, 255, 255, 255);
        public static final int q = MultiStateLayout.g(24.0f);

        public a(View view) {
            this.p = 26;
            this.a = view;
            float fC = rg7.c(R$dimen.common_line_height);
            this.b = fC;
            this.f20442c = fC;
            int color = ContextCompat.getColor(view.getContext(), R$color.common_line_devider);
            this.i = color;
            this.p = Color.alpha(color);
            StringBuilder sb = new StringBuilder();
            sb.append(this.i);
            sb.append(" mOrignAlpha:");
            sb.append(this.p);
            this.f20444j = DIVIDER_BACKGROUND_COLOR;
            this.d = q;
            this.f20443e = new Paint();
            this.f = 0.0f;
            this.g = new Point();
            this.h = new Point();
        }

        public void a(Canvas canvas) {
            d();
            this.f20443e.setStyle(Paint.Style.STROKE);
            this.f20443e.setStrokeWidth(this.f20442c);
            this.f20445l.reset();
            this.f20443e.setColor(this.i);
            this.f20443e.setAlpha((int) (this.k * this.p));
            Path path = this.f20445l;
            Point point = this.g;
            path.moveTo(point.x, point.y);
            Path path2 = this.f20445l;
            Point point2 = this.h;
            path2.lineTo(point2.x, point2.y);
            canvas.drawPath(this.f20445l, this.f20443e);
        }

        public void b(int i) {
            int i2 = this.f20446n;
            if (i > i2) {
                this.m = i2 / 2;
            } else if (i < i2 / 2) {
                this.m = i / 20.0f;
            } else {
                this.m = (i * 0.9f) - (i2 * 0.4f);
            }
            float f = this.m;
            this.o = f;
            c((Math.abs(f) / this.f20446n) * 2.0f);
        }

        public void c(float f) {
            float fClamp = MathUtils.clamp(f, 0.0f, 1.0f);
            if (this.f != fClamp) {
                this.f = fClamp;
                if (fClamp < 0.1f) {
                    this.k = fClamp * 10.0f;
                } else {
                    this.k = 1.0f;
                }
                ViewCompat.postInvalidateOnAnimation(this.a);
            }
        }

        public final void d() {
            this.g.x = Math.round(this.d * (1.0f - this.f));
            Rect rect = new Rect();
            this.a.getLocalVisibleRect(rect);
            this.g.y = (int) (rect.bottom - (this.f20442c / 2.0f));
            this.h.x = Math.round(this.a.getMeasuredWidth() - (this.d * (1.0f - this.f)));
            this.h.y = this.g.y;
        }
    }

    public JToolbar(Context context) {
        this(context, null);
    }

    private ActionMenuView getActionMenuView() throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = COUIToolbar.class.getDeclaredField("mMenuView");
        declaredField.setAccessible(true);
        return (ActionMenuView) declaredField.get(this);
    }

    public void b() {
        this.f20440j = true;
        if (this.i == null) {
            this.i = new a(this);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        a aVar = this.i;
        if (aVar == null || !this.f20440j) {
            return;
        }
        aVar.a(canvas);
    }

    public a getJDividerHelper() {
        if (this.i == null) {
            b();
        }
        return this.i;
    }

    @Override // com.coui.appcompat.toolbar.COUIToolbar, androidx.appcompat.widget.Toolbar
    public Menu getMenu() {
        ActionMenuView actionMenuView = this.f20441l;
        return actionMenuView == null ? super.getMenu() : actionMenuView.getMenu();
    }

    @Override // com.coui.appcompat.toolbar.COUIToolbar, androidx.appcompat.widget.Toolbar
    @Nullable
    public Drawable getOverflowIcon() {
        Drawable drawable = this.k;
        if (drawable != null) {
            return drawable;
        }
        try {
            if (this.f20441l == null) {
                this.f20441l = getActionMenuView();
            }
            ActionMenuView actionMenuView = this.f20441l;
            if (actionMenuView == null) {
                return super.getOverflowIcon();
            }
            Drawable overflowIcon = actionMenuView.getOverflowIcon();
            this.k = overflowIcon;
            return overflowIcon;
        } catch (Exception e2) {
            yha.j(e2);
            return super.getOverflowIcon();
        }
    }

    public JToolbar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.coui.appcompat.toolbar.COUIToolbar
    public TextView getTitleView() {
        return (TextView) super.getTitleView();
    }

    public JToolbar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
