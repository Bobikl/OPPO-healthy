package com.heytap.nearx.uikit.widget.poplist;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.widget.panel.NearPanelMultiWindowUtils;
import com.oplus.aiunit.vision.whc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class NearPopupListWindow extends NearPopupWindow implements View.OnLayoutChangeListener {
    private static final int MARGIN_SCREEN = 20;
    private BaseAdapter mAdapter;
    private View mAnchor;
    private Rect mAnchorRect;
    private Rect mBackgroundPaddingRect;
    private ViewGroup mContentView;
    private Context mContext;
    private BaseAdapter mCustomAdapter;
    private Rect mDecorViewRect;
    private BaseAdapter mDefaultAdapter;
    private List<PopupListItem> mItemList;
    private ListView mListView;
    private ListView mListViewUsedToMeasure;
    private AdapterView.OnItemClickListener mOnItemClickListener;
    OnPopListShowListener mOnPopListShowListener;
    private Rect mParentRectOnScreen;
    private int mPopupHeight;
    private int mPopupListWindowMinWidth;
    private int[] mPopupWindowOffset;
    private int[] mTempLocation;
    private int[] mWindowLocationOnScreen;

    public interface OnPopListShowListener {
        void popListShow();
    }

    public NearPopupListWindow(Context context) {
        super(context);
        this.mTempLocation = new int[2];
        this.mWindowLocationOnScreen = new int[2];
        this.mPopupWindowOffset = new int[4];
        this.mContext = context;
        this.mItemList = new ArrayList();
        this.mPopupListWindowMinWidth = context.getResources().getDimensionPixelSize(R$dimen.nx_popup_list_window_min_width);
        ListView listView = new ListView(context);
        this.mListViewUsedToMeasure = listView;
        listView.setDivider(null);
        this.mListViewUsedToMeasure.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mContentView = createContentView(context);
        setExitTransition(null);
        setEnterTransition(null);
    }

    private void configListView() {
        BaseAdapter baseAdapter = this.mCustomAdapter;
        if (baseAdapter == null) {
            this.mAdapter = this.mDefaultAdapter;
        } else {
            this.mAdapter = baseAdapter;
        }
        this.mListView.setAdapter((ListAdapter) this.mAdapter);
        AdapterView.OnItemClickListener onItemClickListener = this.mOnItemClickListener;
        if (onItemClickListener != null) {
            this.mListView.setOnItemClickListener(onItemClickListener);
        }
    }

    private void configRect(View view) {
        this.mDecorViewRect = new Rect();
        this.mAnchorRect = new Rect();
        this.mParentRectOnScreen = new Rect();
        this.mAnchor = view;
        view.getRootView().removeOnLayoutChangeListener(this);
        this.mAnchor.getRootView().addOnLayoutChangeListener(this);
        this.mAnchor.getWindowVisibleDisplayFrame(this.mDecorViewRect);
        this.mAnchor.getGlobalVisibleRect(this.mAnchorRect);
        this.mAnchor.getRootView().getGlobalVisibleRect(this.mParentRectOnScreen);
        Rect rect = this.mAnchorRect;
        int i = rect.left;
        int[] iArr = this.mPopupWindowOffset;
        rect.left = i - iArr[0];
        rect.top -= iArr[1];
        rect.right += iArr[2];
        rect.bottom += iArr[3];
        this.mAnchor.getRootView().getLocationOnScreen(this.mTempLocation);
        Rect rect2 = this.mAnchorRect;
        int[] iArr2 = this.mTempLocation;
        rect2.offset(iArr2[0], iArr2[1]);
        Rect rect3 = this.mParentRectOnScreen;
        int[] iArr3 = this.mTempLocation;
        rect3.offset(iArr3[0], iArr3[1]);
        Rect rect4 = this.mDecorViewRect;
        rect4.left = Math.max(rect4.left, this.mParentRectOnScreen.left);
        Rect rect5 = this.mDecorViewRect;
        rect5.top = Math.max(rect5.top, this.mParentRectOnScreen.top);
        Rect rect6 = this.mDecorViewRect;
        rect6.right = Math.min(rect6.right, this.mParentRectOnScreen.right);
        Rect rect7 = this.mDecorViewRect;
        rect7.bottom = Math.min(rect7.bottom, this.mParentRectOnScreen.bottom);
        this.mAnchor.getRootView().getLocationOnScreen(this.mTempLocation);
        int[] iArr4 = this.mTempLocation;
        int i2 = iArr4[0];
        int i3 = iArr4[1];
        this.mAnchor.getRootView().getLocationInWindow(this.mTempLocation);
        int[] iArr5 = this.mTempLocation;
        int i4 = iArr5[0];
        int i5 = iArr5[1];
        int[] iArr6 = this.mWindowLocationOnScreen;
        iArr6[0] = i2 - i4;
        iArr6[1] = i3 - i5;
    }

    private ViewGroup createContentView(Context context) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R$layout.nx_popup_list_window_layout, (ViewGroup) null);
        this.mListView = (ListView) frameLayout.findViewById(R$id.nx_popup_list_view);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R$attr.nxPopupWindowBackground});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = context.getResources().getDrawable(R$drawable.nx_popup_window_bg);
        }
        Rect rect = new Rect();
        this.mBackgroundPaddingRect = rect;
        drawable.getPadding(rect);
        typedArrayObtainStyledAttributes.recycle();
        return frameLayout;
    }

    private int getPopupWindowMaxWidth() {
        Rect rect = this.mDecorViewRect;
        int i = rect.right - rect.left;
        Rect rect2 = this.mBackgroundPaddingRect;
        return (i - rect2.left) - rect2.right;
    }

    private boolean isInMultiWindowMode(Activity activity) {
        return activity != null && activity.isInMultiWindowMode();
    }

    private void showAsMeasure() {
        int iH = 20;
        if (getHeight() <= this.mDecorViewRect.bottom - this.mAnchorRect.bottom) {
            int[] iArr = this.mPopupWindowOffset;
            int i = iArr[0];
            int i2 = iArr[1];
            int[] iArr2 = new int[2];
            this.mAnchor.getLocationInWindow(iArr2);
            if (iArr2[0] + i + getWidth() > whc.h(this.mAnchor.getContext()) - 20) {
                iH = ((whc.h(this.mAnchor.getContext()) - 20) - getWidth()) - iArr2[0];
            } else if (i >= 20) {
                iH = i;
            }
            showAsDropDown(this.mAnchor, iH, i2, 0);
            return;
        }
        int height = getHeight();
        Rect rect = this.mDecorViewRect;
        if (height > rect.bottom - rect.top) {
            View view = this.mAnchor;
            int iMax = Math.max((-this.mPopupWindowOffset[0]) - (getWidth() / 2), 0);
            int height2 = getHeight();
            Rect rect2 = this.mDecorViewRect;
            showAtLocation(view, 0, iMax, (height2 - rect2.bottom) + rect2.top);
            return;
        }
        int[] iArr3 = this.mPopupWindowOffset;
        int i3 = iArr3[0];
        int height3 = iArr3[1] - getHeight();
        int[] iArr4 = new int[2];
        this.mAnchor.getLocationInWindow(iArr4);
        if (iArr4[0] + i3 + getWidth() > whc.h(this.mAnchor.getContext()) - 20) {
            iH = ((whc.h(this.mAnchor.getContext()) - 20) - getWidth()) - iArr4[0];
        } else if (i3 >= 20) {
            iH = i3;
        }
        showAsDropDown(this.mAnchor, iH, height3, 0);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        View view = this.mAnchor;
        if (view != null) {
            view.getRootView().removeOnLayoutChangeListener(this);
        }
        superDismiss();
    }

    public ListAdapter getAdapter() {
        ListView listView = this.mListView;
        if (listView != null) {
            return listView.getAdapter();
        }
        return null;
    }

    public View getAnchorView() {
        return this.mAnchor;
    }

    public List<PopupListItem> getItemList() {
        return this.mItemList;
    }

    public ListView getListView() {
        return this.mListView;
    }

    public void measurePopupWindow() {
        BaseAdapter baseAdapter = this.mAdapter;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getPopupWindowMaxWidth(), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = baseAdapter.getCount();
        int i = 0;
        int iMakeMeasureSpec3 = iMakeMeasureSpec2;
        int i2 = 0;
        for (int i3 = 0; i3 < count; i3++) {
            View view = baseAdapter.getView(i3, null, this.mListViewUsedToMeasure);
            int i4 = ((AbsListView.LayoutParams) view.getLayoutParams()).height;
            if (i4 != -2) {
                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
            i += measuredHeight;
        }
        int i5 = this.mPopupHeight;
        if (i5 != 0) {
            i = i5;
        }
        Context context = this.mContext;
        int currentWindowVisibleHeight = context instanceof Activity ? NearPanelMultiWindowUtils.getCurrentWindowVisibleHeight((Activity) context, null) : NearPanelMultiWindowUtils.getScreenHeight(context);
        int iMax = Math.max(i2, this.mPopupListWindowMinWidth);
        Rect rect = this.mBackgroundPaddingRect;
        setWidth(iMax + rect.left + rect.right);
        Rect rect2 = this.mBackgroundPaddingRect;
        setHeight(Math.min(currentWindowVisibleHeight, i + rect2.top + rect2.bottom));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Rect rect = new Rect(i, i2, i3, i4);
        Rect rect2 = new Rect(i5, i6, i7, i8);
        if (!isShowing() || rect.equals(rect2)) {
            return;
        }
        dismiss();
    }

    public void refresh() {
        TypedArray typedArrayObtainStyledAttributes = this.mContext.getTheme().obtainStyledAttributes(new int[]{R$attr.nxPopupWindowBackground});
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = this.mContext.getResources().getDrawable(R$drawable.nx_popup_window_bg);
        }
        this.mContentView.setBackground(drawable);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setAdapter(BaseAdapter baseAdapter) {
        this.mCustomAdapter = baseAdapter;
    }

    public void setAnchorView(View view) {
        this.mAnchor = view;
    }

    public void setContentHeight(int i) {
        this.mPopupHeight = i;
    }

    public void setContentWidth(int i) {
        this.mPopupListWindowMinWidth = i;
    }

    public void setItemList(List<PopupListItem> list) {
        if (list != null) {
            this.mItemList = list;
            this.mDefaultAdapter = new DefaultAdapter(this.mContext, list);
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        BaseAdapter baseAdapter = this.mDefaultAdapter;
        if (baseAdapter instanceof DefaultAdapter) {
            ((DefaultAdapter) baseAdapter).setItemTextColor(colorStateList);
        }
    }

    public void setOffset(int i, int i2, int i3, int i4) {
        int[] iArr = this.mPopupWindowOffset;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public void setOnPopListShowListener(OnPopListShowListener onPopListShowListener) {
        this.mOnPopListShowListener = onPopListShowListener;
    }

    public void show() {
        View view = this.mAnchor;
        if (view != null) {
            show(view);
        }
    }

    public void superDismiss() {
        super.setContentView(null);
        super.dismiss();
    }

    public void show(View view) {
        if (view != null) {
            if ((this.mDefaultAdapter == null && this.mCustomAdapter == null) || isShowing()) {
                return;
            }
            configListView();
            configRect(view);
            measurePopupWindow();
            setContentView(this.mContentView);
            showAsMeasure();
            OnPopListShowListener onPopListShowListener = this.mOnPopListShowListener;
            if (onPopListShowListener != null) {
                onPopListShowListener.popListShow();
            }
        }
    }

    public void setOffset(int i, int i2) {
        setOffset(i, i2, 0, 0);
    }
}
