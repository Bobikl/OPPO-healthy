package com.heytap.store.splash.widget;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.entity.HomeConfigDetailBean;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.sdk.R;
import com.oplus.aiunit.vision.ugc;
import com.oplus.aiunit.vision.vhc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class StoreMenuPopupWindow {
    private static final int DISMISS_BACKGROUND_ALPHA_NORMAL = 102;
    private static final int DISMISS_BACKGROUND_ALPHA_PRESSED = 51;
    private static final String TAG = "StoreMenuPopupWindow";
    private View mAnchor;
    private Drawable mArrowDownDrawable;
    private Drawable mArrowUpDrawable;
    private ViewGroup mContentContainer;
    private Rect mContentRectOnScreen;
    private Context mContext;
    private boolean mIsShowing;
    private LinearLayout mLinearLayout;
    private ViewGroup mMainPanel;
    private OnPopupWindowClickListener mOnPopupWindowClickListener;
    private View mParent;
    private PopupWindow mPopupWindow;
    private Rect mViewPortOnScreen = new Rect();
    private final int[] mTmpCoords = new int[2];
    private final Point mCoordsOnWindow = new Point();
    private View.OnTouchListener mDismissTouchListener = new View.OnTouchListener() { // from class: com.heytap.store.splash.widget.StoreMenuPopupWindow.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                view.getBackground().setAlpha(51);
                return false;
            }
            if (action != 1 && action != 3) {
                return false;
            }
            view.getBackground().setAlpha(102);
            return false;
        }
    };
    private View.OnLayoutChangeListener mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.heytap.store.splash.widget.StoreMenuPopupWindow.2
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Rect rect = new Rect(i, i2, i3, i4);
            Rect rect2 = new Rect(i5, i6, i7, i8);
            if (!StoreMenuPopupWindow.this.mIsShowing || rect.equals(rect2) || StoreMenuPopupWindow.this.mAnchor == null) {
                return;
            }
            StoreMenuPopupWindow.this.dismiss();
        }
    };
    private PopupWindow.OnDismissListener mOnPopupWindowDismissListener = new PopupWindow.OnDismissListener() { // from class: com.heytap.store.splash.widget.StoreMenuPopupWindow.3
        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            StoreMenuPopupWindow.this.mIsShowing = false;
            StoreMenuPopupWindow.this.mContentContainer.removeAllViews();
        }
    };

    public interface OnPopupWindowClickListener {
        void onClick(HomeConfigDetailBean homeConfigDetailBean, String str);
    }

    public StoreMenuPopupWindow(Window window) {
        this.mContext = window.getContext();
        this.mParent = window.getDecorView();
        this.mArrowDownDrawable = this.mContext.getResources().getDrawable(R.mipmap.heytap_store_widget_widget_down_arrow);
        this.mArrowUpDrawable = this.mContext.getResources().getDrawable(R.mipmap.heytap_store_widget_widget_up_arrow);
        this.mMainPanel = createMainPanel(this.mContext);
        this.mContentContainer = createContentContainer(this.mContext);
        LinearLayout linearLayout = (LinearLayout) this.mMainPanel.findViewById(R.id.list_view);
        this.mLinearLayout = linearLayout;
        linearLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: com.heytap.store.splash.widget.StoreMenuPopupWindow.4
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (view == null || outline == null) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), DisplayUtil.dip2px(16.0f));
                view.setClipToOutline(true);
            }
        });
        ugc.d(12, this.mContext.getResources().getConfiguration().fontScale, 5);
        this.mPopupWindow = createPopupWindow(this.mContentContainer);
    }

    private void addIndicator(Rect rect) {
        this.mParent.getRootView().getLocationOnScreen(this.mTmpCoords);
        int i = this.mTmpCoords[0];
        this.mParent.getRootView().getLocationInWindow(this.mTmpCoords);
        int i2 = i - this.mTmpCoords[0];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = ((rect.centerX() - this.mCoordsOnWindow.x) - i2) - (this.mArrowUpDrawable.getIntrinsicWidth() / 2);
        layoutParams.rightMargin = (this.mPopupWindow.getWidth() - layoutParams.leftMargin) - this.mArrowUpDrawable.getIntrinsicWidth();
        if (this.mCoordsOnWindow.y >= rect.top) {
            this.mContentContainer.addView(this.mMainPanel);
        } else {
            layoutParams.gravity = 80;
            this.mContentContainer.addView(this.mMainPanel);
        }
    }

    private static ViewGroup createContentContainer(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    private static ViewGroup createMainPanel(Context context) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.heytap_store_widget_popup_window_layout, (ViewGroup) null);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    private PopupWindow createPopupWindow(ViewGroup viewGroup) {
        PopupWindow popupWindow = new PopupWindow(viewGroup);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setOnDismissListener(this.mOnPopupWindowDismissListener);
        return popupWindow;
    }

    private void initClickListener() {
        LinearLayout linearLayout = this.mLinearLayout;
        if (linearLayout == null || linearLayout.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < this.mLinearLayout.getChildCount(); i++) {
            if (this.mLinearLayout.getChildAt(i) != null) {
                this.mLinearLayout.getChildAt(i).setOnClickListener(new View.OnClickListener() { // from class: com.heytap.store.splash.widget.StoreMenuPopupWindow.5
                    @Override // android.view.View.OnClickListener
                    @SensorsDataInstrumented
                    public void onClick(View view) {
                        if (StoreMenuPopupWindow.this.mOnPopupWindowClickListener != null) {
                            if (view.getTag() != null && (view.getTag() instanceof HomeConfigDetailBean)) {
                                StoreMenuPopupWindow.this.mOnPopupWindowClickListener.onClick((HomeConfigDetailBean) view.getTag(), "");
                            }
                            StoreMenuPopupWindow.this.dismiss();
                        }
                        SensorsDataAutoTrackHelper.trackViewOnClick(view);
                    }
                });
            }
        }
    }

    private void prepareContent(Rect rect) {
        this.mContentContainer.removeAllViews();
        addIndicator(rect);
    }

    private void refreshCoordinated(Rect rect) {
        int i;
        int iMin = Math.min(rect.centerX() - (this.mPopupWindow.getWidth() / 2), this.mViewPortOnScreen.right - this.mPopupWindow.getWidth());
        int i2 = rect.top;
        Rect rect2 = this.mViewPortOnScreen;
        int i3 = i2 - rect2.top;
        int i4 = rect2.bottom - rect.bottom;
        int height = this.mPopupWindow.getHeight();
        if (i3 >= height) {
            i = rect.top - height;
        } else if (i4 >= height) {
            i = rect.bottom;
        } else if (i3 > i4) {
            i = this.mViewPortOnScreen.top;
            this.mPopupWindow.setHeight(i3);
        } else {
            i = rect.bottom;
            this.mPopupWindow.setHeight(i4);
        }
        this.mParent.getRootView().getLocationOnScreen(this.mTmpCoords);
        int[] iArr = this.mTmpCoords;
        int i5 = iArr[0];
        int i6 = iArr[1];
        this.mParent.getRootView().getLocationInWindow(this.mTmpCoords);
        int[] iArr2 = this.mTmpCoords;
        this.mCoordsOnWindow.set(Math.max(0, iMin - (i5 - iArr2[0])), Math.max(0, i - (i6 - iArr2[1])));
    }

    private void registerOrientationHandler() {
        unregisterOrientationHandler();
        this.mParent.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
    }

    private void sizePopupWindow() {
        int fullScreenWidth = DisplayUtil.getFullScreenWidth() + this.mMainPanel.getPaddingLeft() + this.mMainPanel.getPaddingRight();
        this.mMainPanel.measure(0, 0);
        this.mPopupWindow.setWidth(Math.min(this.mMainPanel.getMeasuredWidth(), fullScreenWidth));
        this.mPopupWindow.setHeight(this.mMainPanel.getMeasuredHeight() + this.mArrowUpDrawable.getIntrinsicHeight());
    }

    private void unregisterOrientationHandler() {
        this.mParent.removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
    }

    public void dismiss() {
        this.mPopupWindow.dismiss();
        unregisterOrientationHandler();
        this.mIsShowing = false;
        this.mContentContainer.removeAllViews();
    }

    public void setContent(String str) {
    }

    public void setDismissOnTouchOutside(boolean z) {
        if (z) {
            this.mPopupWindow.setTouchable(true);
            this.mPopupWindow.setFocusable(true);
            this.mPopupWindow.setOutsideTouchable(true);
        } else {
            this.mPopupWindow.setFocusable(false);
            this.mPopupWindow.setOutsideTouchable(false);
        }
        this.mPopupWindow.update();
    }

    public void setOnPopupWindowClickListener(OnPopupWindowClickListener onPopupWindowClickListener) {
        this.mOnPopupWindowClickListener = onPopupWindowClickListener;
    }

    public void show(View view) {
        if (this.mIsShowing) {
            return;
        }
        this.mAnchor = view;
        this.mIsShowing = true;
        this.mParent.getWindowVisibleDisplayFrame(this.mViewPortOnScreen);
        registerOrientationHandler();
        Rect rect = new Rect();
        this.mContentRectOnScreen = rect;
        view.getGlobalVisibleRect(rect);
        int[] iArr = new int[2];
        this.mParent.getLocationOnScreen(iArr);
        this.mContentRectOnScreen.offset(iArr[0], iArr[1]);
        sizePopupWindow();
        refreshCoordinated(this.mContentRectOnScreen);
        prepareContent(this.mContentRectOnScreen);
        PopupWindow popupWindow = this.mPopupWindow;
        View view2 = this.mParent;
        Point point = this.mCoordsOnWindow;
        popupWindow.showAtLocation(view2, 0, point.x, point.y + DisplayUtil.dip2px(10.0f));
    }

    public void setContent(List<HomeConfigDetailBean> list) {
        LinearLayout linearLayout;
        if (list != null && list.size() > 0 && (linearLayout = this.mLinearLayout) != null) {
            linearLayout.removeAllViews();
            for (int i = 0; i < list.size(); i++) {
                HomeConfigDetailBean homeConfigDetailBean = list.get(i);
                if (homeConfigDetailBean != null) {
                    View viewInflate = LayoutInflater.from(this.mLinearLayout.getContext()).inflate(R.layout.heytap_store_widget_popup_window_chlid_layout, (ViewGroup) null);
                    viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, DisplayUtil.dip2px(ContextGetterUtils.INSTANCE.getApp(), 40.0f)));
                    ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
                    String pic = homeConfigDetailBean.getPic() != null ? homeConfigDetailBean.getPic() : "";
                    if (!"".equals(pic)) {
                        ImageLoader.load(pic).into(imageView);
                        int i2 = R.color.heytap_base_black_ignore_dark;
                        if (vhc.a(this.mLinearLayout.getContext())) {
                            i2 = R.color.heytap_base_white_ignore_dark;
                        }
                        imageView.setColorFilter(this.mLinearLayout.getContext().getResources().getColor(i2));
                    }
                    ((TextView) viewInflate.findViewById(R.id.tv_item_title)).setText(homeConfigDetailBean.getTitle());
                    viewInflate.setTag(homeConfigDetailBean);
                    this.mLinearLayout.addView(viewInflate);
                }
            }
        }
        initClickListener();
    }
}
