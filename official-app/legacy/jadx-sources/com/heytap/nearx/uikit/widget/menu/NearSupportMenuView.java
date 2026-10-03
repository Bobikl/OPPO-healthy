package com.heytap.nearx.uikit.widget.menu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.core.view.ViewCompat;
import com.heytap.log.config.LogMemoryConfig;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper;
import com.oplus.aiunit.vision.xhc;
import com.oplus.aiunit.vision.z63;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class NearSupportMenuView extends View {
    private static final int MAX_ITEM_COUNTS = 10;
    private static final String TAG = "NearSupportMenuView";
    static final int VIEW_STATE_ENABLED = 16842910;
    static final int VIEW_STATE_PRESSED = 16842919;
    private List<NearSupportMenuItem> mColorItemList;
    private ViewExplorerByTouchHelper.a mColorViewTalkBalkInteraction;
    private Drawable mIconCover;
    private int mIconHeight;
    private int mIconWidth;
    private boolean mIsSelected;
    private int mItemCount;
    private int mItemPadding;
    private int mLineMaxCount;
    private int mNormalColor;
    private int mPaddingBottom;
    private int mPaddingTop;
    private Paint mPaint;
    private Rect mSelectRect;
    private int mSelectedColor;
    private int mSelectedPosition;
    private int mSingleLineViewHeight;
    private int mTextMaxLength;
    private int mTextPaddingSide;
    private int mTextPaddingTop;
    private float mTextSize;
    private ViewExplorerByTouchHelper mTouchHelper;
    private int mViewPaddingBottom;
    private int mViewWidth;
    static final int[] STATE_ENABLED = {16842910};
    static final int[] STATE_UNENABLED = {-16842910};
    static final int[] STATE_PRESSED = {16842919, 16842910};
    static final int[] STATE_NORMAL = {-16842919, 16842910};

    public NearSupportMenuView(Context context) {
        this(context, null);
    }

    private void clearState() {
        Iterator<NearSupportMenuItem> it = this.mColorItemList.iterator();
        while (it.hasNext()) {
            Drawable icon = it.next().getIcon();
            if (icon != null && icon.isStateful()) {
                icon.setState(STATE_NORMAL);
            }
        }
        this.mIsSelected = false;
        invalidate();
    }

    private String getDisplayText(String str, Paint paint, int i) {
        int iBreakText = paint.breakText(str, true, i, null);
        if (iBreakText == str.length()) {
            return str;
        }
        return str.substring(0, iBreakText - 1) + LogMemoryConfig.LOG_ELLIPSIS;
    }

    private void getRect(int i, Rect rect) {
        int i2 = this.mItemPadding;
        int i3 = (i2 / 2) + ((i2 + this.mIconWidth) * (i % this.mLineMaxCount));
        if (isLayoutRtl()) {
            int width = getWidth();
            int i4 = this.mIconWidth;
            int i5 = this.mItemPadding;
            i3 = width - (((i5 / 2) + i4) + ((i5 + i4) * (i % this.mLineMaxCount)));
        }
        int i6 = this.mPaddingTop;
        int i7 = this.mLineMaxCount;
        int i8 = i / i7;
        if (i >= i7) {
            i6 += this.mSingleLineViewHeight;
        }
        rect.set(i3, i6, this.mIconWidth + i3, this.mIconHeight + i6);
    }

    private void initStateListDrawable(int i) {
        Drawable icon = this.mColorItemList.get(i).getIcon();
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = STATE_PRESSED;
        icon.setState(iArr);
        stateListDrawable.addState(iArr, icon.getCurrent());
        int[] iArr2 = STATE_ENABLED;
        icon.setState(iArr2);
        stateListDrawable.addState(iArr2, icon.getCurrent());
        int[] iArr3 = STATE_UNENABLED;
        icon.setState(iArr3);
        stateListDrawable.addState(iArr3, icon.getCurrent());
        int[] iArr4 = STATE_NORMAL;
        icon.setState(iArr4);
        stateListDrawable.addState(iArr4, icon.getCurrent());
        this.mColorItemList.get(i).setIcon(stateListDrawable);
        this.mColorItemList.get(i).getIcon().setCallback(this);
        clearState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int selectedIndex(float f, float f2) {
        int width;
        int i = this.mItemCount;
        if (i < 1) {
            return -1;
        }
        if (i <= this.mLineMaxCount) {
            if (isLayoutRtl()) {
                f = getWidth() - f;
            }
            width = (int) (f / (getWidth() / this.mItemCount));
        } else {
            if (isLayoutRtl()) {
                f = getWidth() - f;
            }
            int width2 = getWidth();
            int i2 = this.mLineMaxCount;
            width = (int) (f / (width2 / i2));
            if (f2 > this.mSingleLineViewHeight) {
                width += i2;
            }
        }
        if (width < this.mItemCount) {
            return width;
        }
        return -1;
    }

    public void clearAccessibilityFocus() {
        ViewExplorerByTouchHelper viewExplorerByTouchHelper = this.mTouchHelper;
        if (viewExplorerByTouchHelper != null) {
            viewExplorerByTouchHelper.a();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        ViewExplorerByTouchHelper viewExplorerByTouchHelper = this.mTouchHelper;
        if (viewExplorerByTouchHelper == null || !viewExplorerByTouchHelper.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        if (motionEvent.getPointerCount() != 1 || y < 0.0f) {
            clearState();
        } else if (motionEvent.getAction() == 0) {
            this.mSelectedPosition = selectedIndex(motionEvent.getX(), motionEvent.getY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        Drawable icon;
        int i = this.mSelectedPosition;
        if (i >= 0 && i < this.mItemCount && (icon = this.mColorItemList.get(i).getIcon()) != null && icon.isStateful()) {
            icon.setState(getDrawableState());
        }
        super.drawableStateChanged();
    }

    public boolean isLayoutRtl() {
        return getLayoutDirection() == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.mItemCount;
        if (i < 1) {
            return;
        }
        if (i <= this.mLineMaxCount) {
            int width = getWidth();
            int i2 = this.mIconWidth;
            int i3 = this.mItemCount;
            this.mItemPadding = (width - (i2 * i3)) / i3;
        } else {
            int width2 = getWidth();
            int i4 = this.mIconWidth;
            int i5 = this.mLineMaxCount;
            this.mItemPadding = (width2 - (i4 * i5)) / i5;
        }
        this.mTextMaxLength = (this.mItemPadding + this.mIconWidth) - (this.mTextPaddingSide * 2);
        for (int i6 = 0; i6 < this.mItemCount; i6++) {
            getRect(i6, this.mSelectRect);
            NearSupportMenuItem nearSupportMenuItem = this.mColorItemList.get(i6);
            nearSupportMenuItem.getIcon().setBounds(this.mSelectRect);
            nearSupportMenuItem.getIcon().draw(canvas);
            this.mPaint.setColor(this.mNormalColor);
            int i7 = -this.mPaint.getFontMetricsInt().top;
            Rect rect = this.mSelectRect;
            canvas.drawText(getDisplayText(nearSupportMenuItem.getText(), this.mPaint, this.mTextMaxLength), rect.left + (this.mIconWidth / 2), rect.bottom + this.mTextPaddingTop + i7, this.mPaint);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Paint.FontMetricsInt fontMetricsInt = this.mPaint.getFontMetricsInt();
        int i3 = this.mPaddingTop + this.mIconHeight + this.mTextPaddingTop + (fontMetricsInt.bottom - fontMetricsInt.top) + this.mPaddingBottom;
        this.mSingleLineViewHeight = i3;
        if (this.mItemCount > this.mLineMaxCount) {
            i3 *= 2;
        }
        setMeasuredDimension(this.mViewWidth, i3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mIsSelected = true;
            invalidate();
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            clearState();
            return false;
        }
        int i = this.mSelectedPosition;
        if (i >= 0) {
            this.mColorItemList.get(i).getOnItemClickListener().onColorMenuItemClick(this.mSelectedPosition);
        }
        clearState();
        return false;
    }

    public void setColorSupportMenuItem(List<NearSupportMenuItem> list) {
        this.mColorItemList = list;
        int size = list.size();
        if (size <= 0) {
            return;
        }
        if (size > 10) {
            this.mItemCount = 10;
            this.mColorItemList = this.mColorItemList.subList(0, 10);
        } else if (size == 7) {
            this.mItemCount = 6;
            this.mColorItemList = this.mColorItemList.subList(0, 6);
        } else if (size == 9) {
            this.mItemCount = 8;
            this.mColorItemList = this.mColorItemList.subList(0, 8);
        } else {
            this.mItemCount = size;
        }
        if (size > 5) {
            this.mLineMaxCount = size / 2;
        } else {
            this.mLineMaxCount = 5;
        }
        for (int i = 0; i < this.mItemCount; i++) {
            initStateListDrawable(i);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }

    public NearSupportMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearSupportMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLineMaxCount = 5;
        this.mColorItemList = new ArrayList();
        this.mSelectRect = new Rect();
        this.mIsSelected = false;
        this.mSelectedPosition = -1;
        this.mTextSize = 30.0f;
        this.mItemCount = 0;
        this.mColorViewTalkBalkInteraction = new ViewExplorerByTouchHelper.a() { // from class: com.heytap.nearx.uikit.widget.menu.NearSupportMenuView.1
            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public CharSequence getClassName() {
                return Button.class.getName();
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public int getCurrentPosition() {
                return NearSupportMenuView.this.mSelectedPosition;
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public int getDisablePosition() {
                return -1;
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public void getItemBounds(int i2, Rect rect) {
                Paint.FontMetricsInt fontMetricsInt = NearSupportMenuView.this.mPaint.getFontMetricsInt();
                int width = (NearSupportMenuView.this.mItemPadding / 2) + ((NearSupportMenuView.this.mItemPadding + NearSupportMenuView.this.mIconWidth) * (i2 % NearSupportMenuView.this.mLineMaxCount));
                if (NearSupportMenuView.this.isLayoutRtl()) {
                    width = NearSupportMenuView.this.getWidth() - ((NearSupportMenuView.this.mIconWidth + (NearSupportMenuView.this.mItemPadding / 2)) + ((NearSupportMenuView.this.mItemPadding + NearSupportMenuView.this.mIconWidth) * (i2 % NearSupportMenuView.this.mLineMaxCount)));
                }
                int i3 = NearSupportMenuView.this.mIconWidth + width;
                int i4 = i2 < NearSupportMenuView.this.mLineMaxCount ? NearSupportMenuView.this.mPaddingTop : NearSupportMenuView.this.mSingleLineViewHeight;
                rect.set(width, i4, i3, (((NearSupportMenuView.this.mIconHeight + i4) + NearSupportMenuView.this.mTextPaddingTop) + fontMetricsInt.bottom) - fontMetricsInt.top);
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public int getItemCounts() {
                return NearSupportMenuView.this.mItemCount;
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public CharSequence getItemDescription(int i2) {
                String text = ((NearSupportMenuItem) NearSupportMenuView.this.mColorItemList.get(i2)).getText();
                return text != null ? text : getClass().getSimpleName();
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public int getVirtualViewAt(float f, float f2) {
                return NearSupportMenuView.this.selectedIndex((int) f, (int) f2);
            }

            @Override // com.heytap.nearx.uikit.internal.utils.ViewExplorerByTouchHelper.a
            public void performAction(int i2, int i3, boolean z) {
                if (((NearSupportMenuItem) NearSupportMenuView.this.mColorItemList.get(i2)).getOnItemClickListener() != null) {
                    ((NearSupportMenuItem) NearSupportMenuView.this.mColorItemList.get(i2)).getOnItemClickListener().onColorMenuItemClick(i2);
                }
                NearSupportMenuView.this.mTouchHelper.sendEventForVirtualView(i2, 1);
            }
        };
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        this.mPaint.setAntiAlias(true);
        this.mViewWidth = (int) getResources().getDimension(R$dimen.nx_support_menu_width);
        this.mPaddingTop = (int) getResources().getDimension(R$dimen.nx_support_menu_padding_top);
        this.mPaddingBottom = (int) getResources().getDimension(R$dimen.nx_support_menu_padding_bottom);
        this.mViewPaddingBottom = (int) getResources().getDimension(R$dimen.nx_support_menu_view_padding_bottom);
        this.mIconHeight = (int) getResources().getDimension(R$dimen.nx_support_menu_item_height);
        this.mIconWidth = (int) getResources().getDimension(R$dimen.nx_support_menu_item_width);
        this.mTextPaddingTop = (int) getResources().getDimension(R$dimen.nx_support_menu_text_padding_top);
        this.mTextMaxLength = (int) getResources().getDimension(R$dimen.nx_support_menu_text_max_length);
        this.mTextPaddingSide = (int) getResources().getDimension(R$dimen.nx_support_menu_text_padding_side);
        this.mTextSize = (int) getResources().getDimension(R$dimen.nx_support_menu_item_text_size);
        this.mSelectedColor = getResources().getColor(R$color.nx_support_menu_text_color_select);
        this.mNormalColor = getResources().getColor(R$color.nx_support_menu_text_color_normal);
        xhc xhcVar = xhc.INSTANCE;
        this.mIconCover = xhc.a(context, R$drawable.nx_color_support_menu_item_cover);
        float fC = (int) z63.c(this.mTextSize, getResources().getConfiguration().fontScale, 4);
        this.mTextSize = fC;
        this.mPaint.setTextSize(fC);
        setClickable(true);
        ViewExplorerByTouchHelper viewExplorerByTouchHelper = new ViewExplorerByTouchHelper(this, this.mColorViewTalkBalkInteraction);
        this.mTouchHelper = viewExplorerByTouchHelper;
        ViewCompat.setAccessibilityDelegate(this, viewExplorerByTouchHelper);
        ViewCompat.setImportantForAccessibility(this, 1);
    }
}
