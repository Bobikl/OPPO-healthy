package com.coui.appcompat.list;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.uk2;
import com.support.appcompat.R$style;
import com.support.listview.R$dimen;
import com.support.listview.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIListView extends ListView implements uk2.c {
    private static final float DEFAULT_INTERACTING_NESTED_SCROLL_ANGLE = 20.0f;
    private static final double DEGREE_TO_ARC_CONSTANT = 0.017453292519943295d;
    private static final int INVALID_SCROLL_CHOICE_POSITION = -2;
    private static final int SCROLLBARS_NONE = 0;
    private static final int SCROLLBARS_VERTICAL = 512;
    private static final long SCROLL_CHOICE_SCROLL_DELAY = 50;
    private static final String TAG = "COUIListView";
    private uk2 mCOUIScrollBar;
    private int mCheckItemId;
    private Runnable mDelayedScroll;
    private boolean mEnableDispatchEventWhileScrolling;
    private float mEventFilterAngle;
    private boolean mFlag;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mLastPosition;
    private int mLastSite;
    private int mLasterPosition;
    private int mLeftOffset;
    private boolean mMultiChoice;
    private int mRightOffset;
    private b mScrollMultiChoiceListener;
    private Drawable mScrollbarThumbVertical;
    private int mScrollbars;
    private int mScrollbarsSize;
    private int mStyle;
    private boolean mUpScroll;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (COUIListView.this.mUpScroll) {
                COUIListView cOUIListView = COUIListView.this;
                cOUIListView.setSelectionFromTop(cOUIListView.getFirstVisiblePosition() - 1, -COUIListView.this.getPaddingTop());
            } else {
                COUIListView cOUIListView2 = COUIListView.this;
                cOUIListView2.alignBottomChild(cOUIListView2.getLastVisiblePosition() + 1, COUIListView.this.getPaddingBottom());
            }
        }
    }

    public interface b {
    }

    public COUIListView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void alignBottomChild(int i, int i2) {
        setSelectionFromTop(i, (((getHeight() - getPaddingTop()) - getPaddingBottom()) - getChildAt(getChildCount() - 1).getHeight()) + i2);
    }

    private void createCOUIScrollDelegate(Context context) {
        this.mCOUIScrollBar = new uk2.b(this).a();
    }

    private void initAttr(Context context, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet == null || attributeSet.getStyleAttribute() == 0) {
            this.mStyle = i;
        } else {
            this.mStyle = attributeSet.getStyleAttribute();
        }
        if (context != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.COUIListView, i, i2);
            this.mScrollbars = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIListView_couiScrollbars, 0);
            this.mScrollbarsSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIListView_couiScrollbarSize, 0);
            this.mScrollbarThumbVertical = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIListView_couiScrollbarThumbVertical);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private boolean isInScrollRange(MotionEvent motionEvent) {
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        int rawX = (int) motionEvent.getRawX();
        int[] iArr = new int[2];
        try {
            if (this.mCheckItemId <= 0) {
                this.mMultiChoice = false;
                return false;
            }
            CheckBox checkBox = (CheckBox) getChildAt(iPointToPosition - getFirstVisiblePosition()).findViewById(this.mCheckItemId);
            checkBox.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = i - this.mLeftOffset;
            int i3 = i + this.mRightOffset;
            if (checkBox.getVisibility() == 0 && rawX > i2 && rawX < i3 && iPointToPosition > getHeaderViewsCount() - 1 && iPointToPosition < getCount() - getFooterViewsCount()) {
                this.mMultiChoice = true;
                return true;
            }
            if (motionEvent.getActionMasked() == 0) {
                this.mMultiChoice = false;
            }
            return false;
        } catch (Exception unused) {
            if (motionEvent.getActionMasked() == 0) {
                this.mMultiChoice = false;
            }
            return false;
        }
    }

    @Override // android.view.View
    public boolean awakenScrollBars() {
        uk2 uk2Var = this.mCOUIScrollBar;
        return uk2Var != null ? uk2Var.c() : super.awakenScrollBars();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null) {
            uk2Var.e(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.mEnableDispatchEventWhileScrolling && (motionEvent.getAction() & 255) == 0) {
            super.onTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public uk2 getCOUIScrollDelegate() {
        return this.mCOUIScrollBar;
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public View getCOUIScrollableView() {
        return this;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null) {
            uk2Var.h();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null) {
            uk2Var.q();
            this.mCOUIScrollBar = null;
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null && uk2Var.j(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mInitialTouchX = (int) motionEvent.getX();
            this.mInitialTouchY = (int) motionEvent.getY();
            if (isInScrollRange(motionEvent)) {
                return true;
            }
        }
        if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.mInitialTouchX);
            float fAbs2 = Math.abs(motionEvent.getY() - this.mInitialTouchY);
            if (fAbs != 0.0f && this.mEnableDispatchEventWhileScrolling && Math.abs(fAbs2 / fAbs) < Math.tan(((double) this.mEventFilterAngle) * 0.017453292519943295d)) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r4 != 2) goto L23;
     */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null && uk2Var.l(motionEvent)) {
            return true;
        }
        if (this.mMultiChoice && isInScrollRange(motionEvent)) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.mFlag = true;
            } else if (actionMasked == 1) {
                this.mLastPosition = -2;
                this.mLasterPosition = -2;
            }
            if (iPointToPosition == getCount() - 1) {
                alignBottomChild(iPointToPosition, 0);
            }
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            this.mUpScroll = true;
            this.mLastPosition = -2;
            this.mLasterPosition = -2;
            this.mFlag = false;
            this.mMultiChoice = true;
            this.mLastSite = -1;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null) {
            uk2Var.n(view, i);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        uk2 uk2Var = this.mCOUIScrollBar;
        if (uk2Var != null) {
            uk2Var.o(i);
        }
    }

    public void refresh() {
        String resourceTypeName = getResources().getResourceTypeName(this.mStyle);
        TypedArray typedArrayObtainStyledAttributes = null;
        if ("attr".equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.COUIListView, this.mStyle, 0);
        } else if (Const.Arguments.Open.STYLE.equals(resourceTypeName)) {
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.COUIListView, 0, this.mStyle);
        }
        if (typedArrayObtainStyledAttributes != null) {
            this.mScrollbarThumbVertical = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUIListView_couiScrollbarThumbVertical);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.mScrollbars == 512) {
            Drawable drawable = this.mScrollbarThumbVertical;
            if (drawable != null) {
                this.mCOUIScrollBar.s(drawable);
            } else {
                this.mCOUIScrollBar.p();
            }
        }
        invalidate();
    }

    public void setCheckItemId(int i) {
        this.mCheckItemId = i;
    }

    public void setDispatchEventWhileScrolling(boolean z) {
        this.mEnableDispatchEventWhileScrolling = z;
    }

    public void setEventFilterTangent(float f) {
        this.mEventFilterAngle = f;
    }

    public void setNewCOUIScrollDelegate(uk2 uk2Var) {
        if (uk2Var == null) {
            throw new IllegalArgumentException("setNewFastScrollDelegate must NOT be NULL.");
        }
        this.mCOUIScrollBar = uk2Var;
        uk2Var.h();
    }

    public void setScrollMultiChoiceListener(b bVar) {
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public int superComputeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public int superComputeVerticalScrollOffset() {
        return super.computeVerticalScrollOffset();
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public int superComputeVerticalScrollRange() {
        return super.computeVerticalScrollRange();
    }

    @Override // com.oplus.aiunit.vision.uk2.c
    public void superOnTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
    }

    public COUIListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public COUIListView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Widget_COUI_ListView);
    }

    public COUIListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mMultiChoice = true;
        this.mLastPosition = -2;
        this.mLasterPosition = -2;
        this.mFlag = false;
        this.mUpScroll = true;
        this.mLastSite = -1;
        this.mCheckItemId = -1;
        this.mScrollbars = 0;
        this.mEventFilterAngle = 20.0f;
        this.mEnableDispatchEventWhileScrolling = false;
        this.mDelayedScroll = new a();
        initAttr(context, attributeSet, i, i2);
        if (this.mScrollbars == 512) {
            createCOUIScrollDelegate(context);
            int i3 = this.mScrollbarsSize;
            if (i3 != 0) {
                this.mCOUIScrollBar.t(i3);
            }
            Drawable drawable = this.mScrollbarThumbVertical;
            if (drawable != null) {
                this.mCOUIScrollBar.s(drawable);
            }
        }
        this.mLeftOffset = getResources().getDimensionPixelOffset(R$dimen.coui_listview_scrollchoice_left_offset);
        this.mRightOffset = getResources().getDimensionPixelOffset(R$dimen.coui_listview_scrollchoice_right_offset);
    }
}
