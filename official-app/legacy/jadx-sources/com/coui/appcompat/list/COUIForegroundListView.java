package com.coui.appcompat.list;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HeaderViewListAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.MenuItemHoverListener;
import com.oplus.aiunit.vision.o35;
import com.oplus.aiunit.vision.qne;

/* JADX INFO: loaded from: classes13.dex */
public class COUIForegroundListView extends ListView {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1821j;
    public MenuItemHoverListener k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MenuItem f1822l;
    public Paint m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1823n;
    public float o;
    public Path p;
    public RectF q;

    public COUIForegroundListView(Context context) {
        super(context);
        this.m = new Paint();
        this.o = 0.0f;
        this.q = null;
        b(context);
    }

    public final Path a() {
        Path path = this.p;
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        float f = this.o;
        path.addRoundRect(rectF, new float[]{f, f, f, f, f, f, f, f}, Path.Direction.CW);
        return this.p;
    }

    public final void b(Context context) {
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.i = 21;
            this.f1821j = 22;
        } else {
            this.i = 22;
            this.f1821j = 21;
        }
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return this.f1823n || super.isInTouchMode();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.o > 0.0f) {
            canvas.clipPath(this.p);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        MenuAdapter menuAdapter;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.k != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
            } else {
                menuAdapter = (MenuAdapter) adapter;
                headersCount = 0;
            }
            MenuItemImpl item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= menuAdapter.getCount()) ? null : menuAdapter.getItem(i);
            MenuItem menuItem = this.f1822l;
            if (menuItem != item) {
                MenuBuilder adapterMenu = menuAdapter.getAdapterMenu();
                if (menuItem != null) {
                    this.k.onItemHoverExit(adapterMenu, menuItem);
                }
                this.f1822l = item;
                if (item != null) {
                    this.k.onItemHoverEnter(adapterMenu, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        View selectedView = getSelectedView();
        if (!(selectedView instanceof LinearLayout)) {
            return super.onKeyDown(i, keyEvent);
        }
        LinearLayout linearLayout = (LinearLayout) selectedView;
        ListAdapter adapter = getAdapter();
        if (linearLayout != null && i == this.i && (adapter instanceof o35)) {
            if (linearLayout.isEnabled() && ((qne) ((o35) adapter).getItem(getSelectedItemPosition())).v()) {
                performItemClick(linearLayout, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (linearLayout == null || i != this.f1821j) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        return true;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.p;
        if (path == null) {
            this.p = new Path();
        } else {
            path.reset();
        }
        this.q = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        a();
    }

    public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
        this.k = menuItemHoverListener;
    }

    public void setListSelectionHidden(boolean z) {
        this.f1823n = z;
    }

    public void setRadius(float f) {
        this.o = f;
    }

    public COUIForegroundListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new Paint();
        this.o = 0.0f;
        this.q = null;
        b(context);
    }

    public COUIForegroundListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new Paint();
        this.o = 0.0f;
        this.q = null;
        b(context);
    }

    public COUIForegroundListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.m = new Paint();
        this.o = 0.0f;
        this.q = null;
        b(context);
    }
}
