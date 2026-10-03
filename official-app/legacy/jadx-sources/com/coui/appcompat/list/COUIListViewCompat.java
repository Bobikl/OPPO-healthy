package com.coui.appcompat.list;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes13.dex */
public class COUIListViewCompat extends ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    public static final int[] p = {0};
    public final Rect i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1824j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1825l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Field f1826n;
    public a o;

    public static class a extends DrawableWrapper {
        public boolean a;

        public a(Drawable drawable) {
            super(drawable);
            this.a = true;
        }

        public void a(boolean z) {
            this.a = z;
        }
    }

    public COUIListViewCompat(Context context) {
        this(context, null);
    }

    public void a(Canvas canvas) {
        Drawable selector;
        if (this.i.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.i);
        selector.draw(canvas);
    }

    public boolean b() {
        return c() && isPressed();
    }

    public boolean c() {
        return false;
    }

    public void d() {
        Drawable selector = getSelector();
        if (selector == null || !b()) {
            return;
        }
        selector.setState(getDrawableState());
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        a(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setSelectorEnabled(true);
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.graphics.drawable.Drawable, com.coui.appcompat.list.COUIListViewCompat$a] */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        ?? aVar = drawable != null ? new a(drawable) : 0;
        this.o = aVar;
        super.setSelector((Drawable) aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1824j = rect.left;
        this.k = rect.top;
        this.f1825l = rect.right;
        this.m = rect.bottom;
    }

    public void setSelectorEnabled(boolean z) {
        a aVar = this.o;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    public COUIListViewCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIListViewCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new Rect();
        this.f1824j = 0;
        this.k = 0;
        this.f1825l = 0;
        this.m = 0;
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1826n = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }
}
