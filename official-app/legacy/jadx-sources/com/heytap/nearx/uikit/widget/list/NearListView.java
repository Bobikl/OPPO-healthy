package com.heytap.nearx.uikit.widget.list;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import com.heytap.nearx.uikit.R$dimen;

/* JADX INFO: loaded from: classes18.dex */
public class NearListView extends ListView {
    private static final int INVALID_SCROLL_CHOICE_POSITION = -2;
    private static final long SCROLL_CHOICE_SCROLL_DELAY = 50;
    private static final String TAG = "NearListView";
    private int mCheckItemId;
    private Runnable mDelayedScroll;
    private boolean mFlag;
    private int mLastPosition;
    private int mLastSite;
    private int mLasterPosition;
    private int mLeftOffset;
    private boolean mMultiChoice;
    private int mRightOffset;
    private ScrollMultiChoiceListener mScrollMultiChoiceListener;
    private boolean mUpScroll;

    public interface ScrollMultiChoiceListener {
        void onItemTouch(int i, View view);
    }

    public NearListView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void alignBottomChild(int i, int i2) {
        setSelectionFromTop(i, (((getHeight() - getPaddingTop()) - getPaddingBottom()) - getChildAt(getChildCount() - 1).getHeight()) + i2);
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

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0 && isInScrollRange(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r5 != 2) goto L40;
     */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
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
            if (this.mFlag && this.mLastPosition != iPointToPosition && iPointToPosition != -1 && this.mScrollMultiChoiceListener != null) {
                removeCallbacks(this.mDelayedScroll);
                this.mScrollMultiChoiceListener.onItemTouch(iPointToPosition, getChildAt(iPointToPosition - getFirstVisiblePosition()));
                if (this.mLastPosition != -2) {
                    if (iPointToPosition == getFirstVisiblePosition() && iPointToPosition > 0) {
                        this.mUpScroll = true;
                        postDelayed(this.mDelayedScroll, SCROLL_CHOICE_SCROLL_DELAY);
                    } else if (iPointToPosition == getLastVisiblePosition() && iPointToPosition < getCount()) {
                        this.mUpScroll = false;
                        postDelayed(this.mDelayedScroll, SCROLL_CHOICE_SCROLL_DELAY);
                    }
                }
                if (this.mLasterPosition == iPointToPosition) {
                    ScrollMultiChoiceListener scrollMultiChoiceListener = this.mScrollMultiChoiceListener;
                    int i = this.mLastPosition;
                    scrollMultiChoiceListener.onItemTouch(i, getChildAt(i - getFirstVisiblePosition()));
                }
                this.mLasterPosition = this.mLastPosition;
                this.mLastPosition = iPointToPosition;
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

    public void setCheckItemId(int i) {
        this.mCheckItemId = i;
    }

    public void setScrollMultiChoiceListener(ScrollMultiChoiceListener scrollMultiChoiceListener) {
        this.mScrollMultiChoiceListener = scrollMultiChoiceListener;
    }

    public NearListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public NearListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMultiChoice = true;
        this.mLastPosition = -2;
        this.mLasterPosition = -2;
        this.mFlag = false;
        this.mUpScroll = true;
        this.mLastSite = -1;
        this.mCheckItemId = -1;
        this.mDelayedScroll = new Runnable() { // from class: com.heytap.nearx.uikit.widget.list.NearListView.1
            @Override // java.lang.Runnable
            public void run() {
                if (NearListView.this.mUpScroll) {
                    NearListView nearListView = NearListView.this;
                    nearListView.setSelectionFromTop(nearListView.getFirstVisiblePosition() - 1, -NearListView.this.getPaddingTop());
                } else {
                    NearListView nearListView2 = NearListView.this;
                    nearListView2.alignBottomChild(nearListView2.getLastVisiblePosition() + 1, NearListView.this.getPaddingBottom());
                }
            }
        };
        this.mLeftOffset = getResources().getDimensionPixelOffset(R$dimen.nx_listview_scrollchoice_left_offset);
        this.mRightOffset = getResources().getDimensionPixelOffset(R$dimen.nx_listview_scrollchoice_right_offset);
    }
}
