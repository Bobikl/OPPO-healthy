package com.heytap.nearx.uikit.widget.dialogview;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.widget.dialogview.widget.NearAlertDialogMaxLinearLayout;

/* JADX INFO: loaded from: classes18.dex */
public class NearBottomAlertDialogAdjustUtil {
    private static final boolean IS_DEBUG = false;
    private static final int MEDIUM_LARGE_SCREEN_SW_THRESHOLD = 480;
    private static final String TAG = "NearBottomAlertDialogAdjustUtil";

    public interface OnFirstLayoutListener {
        void onFirstLayout();
    }

    public static void adjustBottomAlertDialog(@NonNull Window window) {
        if (window.getContext().getResources().getConfiguration().smallestScreenWidthDp >= 480) {
            adjustToCenter(window);
        } else {
            adjustToBottom(window);
        }
    }

    public static void adjustToBottom(@NonNull final Window window) {
        setWindowWidth(window, -1);
        window.addFlags(2);
        window.setGravity(80);
        offsetWindowTo(window, 0, 0);
        window.setWindowAnimations(R$style.Animation_Near_Dialog);
        setFirstLayoutListener(window, new OnFirstLayoutListener() { // from class: com.heytap.nearx.uikit.widget.dialogview.NearBottomAlertDialogAdjustUtil.1
            @Override // com.heytap.nearx.uikit.widget.dialogview.NearBottomAlertDialogAdjustUtil.OnFirstLayoutListener
            public void onFirstLayout() {
                NearBottomAlertDialogAdjustUtil.updateParentPanel(window, false);
                NearBottomAlertDialogAdjustUtil.setSizeChangeListener(window, null);
            }
        });
    }

    public static void adjustToCenter(@NonNull final Window window) {
        setWindowWidth(window, -1);
        window.addFlags(2);
        window.setGravity(17);
        offsetWindowTo(window, 0, 0);
        window.setWindowAnimations(R$style.Animation_Near_Dialog_Alpha);
        setFirstLayoutListener(window, new OnFirstLayoutListener() { // from class: com.heytap.nearx.uikit.widget.dialogview.NearBottomAlertDialogAdjustUtil.2
            @Override // com.heytap.nearx.uikit.widget.dialogview.NearBottomAlertDialogAdjustUtil.OnFirstLayoutListener
            public void onFirstLayout() {
                NearBottomAlertDialogAdjustUtil.updateParentPanel(window, false);
                NearBottomAlertDialogAdjustUtil.setSizeChangeListener(window, null);
            }
        });
    }

    public static void adjustToFree(@NonNull final Window window, @NonNull final View view) {
        setWindowWidth(window, -2);
        window.clearFlags(2);
        window.setGravity(51);
        window.setWindowAnimations(R$style.Animation_Near_PopupListWindow);
        setFirstLayoutListener(window, new OnFirstLayoutListener() { // from class: com.heytap.nearx.uikit.widget.dialogview.NearBottomAlertDialogAdjustUtil.3
            @Override // com.heytap.nearx.uikit.widget.dialogview.NearBottomAlertDialogAdjustUtil.OnFirstLayoutListener
            public void onFirstLayout() {
                NearBottomAlertDialogAdjustUtil.updateParentPanel(window, true);
                NearBottomAlertDialogAdjustUtil.updateWindowLocation(window, view);
                NearBottomAlertDialogAdjustUtil.setSizeChangeListener(window, new NearAlertDialogMaxLinearLayout.OnSizeChangeListener() { // from class: com.heytap.nearx.uikit.widget.dialogview.NearBottomAlertDialogAdjustUtil.3.1
                    @Override // com.heytap.nearx.uikit.widget.dialogview.widget.NearAlertDialogMaxLinearLayout.OnSizeChangeListener
                    public void onSizeChange(int i, int i2, int i3, int i4) {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        NearBottomAlertDialogAdjustUtil.updateWindowLocation(window, view);
                        window.getDecorView().setVisibility(0);
                    }
                });
            }
        });
    }

    private static int[] calculateFinalLocationOnScreen(@NonNull Window window, @NonNull View view) {
        View childAt = ((ViewGroup) view.getRootView()).getChildAt(0);
        Rect locationRectInScreen = getLocationRectInScreen(view);
        Rect locationRectInScreen2 = getLocationRectInScreen(childAt);
        getLocationRectInScreen(window.getDecorView());
        int measuredWidth = window.getDecorView().getMeasuredWidth();
        int measuredHeight = window.getDecorView().getMeasuredHeight();
        int iLerp = lerp(((locationRectInScreen.left + locationRectInScreen.right) / 2) - (measuredWidth / 2), 0, locationRectInScreen2.right - measuredWidth);
        int i = locationRectInScreen2.bottom;
        int i2 = i - measuredHeight;
        int i3 = locationRectInScreen.bottom;
        if (measuredHeight > i - i3) {
            i3 = locationRectInScreen.top - measuredHeight;
        }
        return new int[]{iLerp, lerp(i3, 0, i2)};
    }

    private static int getDimensionPixel(@NonNull Window window, int i, int i2) {
        Resources resources = window.getDecorView().getResources();
        return (resources == null || i == 0) ? i2 : resources.getDimensionPixelOffset(i);
    }

    private static Drawable getDrawable(@NonNull Window window, int i) {
        Resources resources = window.getDecorView().getResources();
        if (resources == null || i == 0) {
            return null;
        }
        return resources.getDrawable(i);
    }

    private static Rect getLocationRectInScreen(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getMeasuredWidth() + i, iArr[1] + view.getMeasuredHeight());
    }

    private static int lerp(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    private static void offsetWindowBy(@NonNull Window window, int i, int i2) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x += i;
        attributes.y += i2;
        window.setAttributes(attributes);
    }

    private static void offsetWindowTo(@NonNull Window window, int i, int i2) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = i;
        attributes.y = i2;
        window.setAttributes(attributes);
    }

    private static void setFirstLayoutListener(@NonNull final Window window, final OnFirstLayoutListener onFirstLayoutListener) {
        if (onFirstLayoutListener == null) {
            return;
        }
        window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.heytap.nearx.uikit.widget.dialogview.NearBottomAlertDialogAdjustUtil.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                window.getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                onFirstLayoutListener.onFirstLayout();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setSizeChangeListener(@NonNull Window window, NearAlertDialogMaxLinearLayout.OnSizeChangeListener onSizeChangeListener) {
        View viewFindViewById = window.findViewById(R$id.parentPanel);
        if (viewFindViewById instanceof NearAlertDialogMaxLinearLayout) {
            ((NearAlertDialogMaxLinearLayout) viewFindViewById).setOnSizeChangeListener(onSizeChangeListener);
        }
    }

    private static void setWindowWidth(@NonNull Window window, int i) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = i;
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateParentPanel(@NonNull Window window, boolean z) {
        View viewFindViewById = window.findViewById(R$id.parentPanel);
        if (viewFindViewById instanceof NearAlertDialogMaxLinearLayout) {
            if (z) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                layoutParams.width = getDimensionPixel(window, R$dimen.nx_dialog_max_width_in_bottom_free, 0);
                viewFindViewById.setLayoutParams(layoutParams);
                viewFindViewById.setBackground(getDrawable(window, R$drawable.nx_free_bottom_alert_dialog_background));
            } else {
                ((NearAlertDialogMaxLinearLayout) viewFindViewById).setMaxWidth(getDimensionPixel(window, R$dimen.nx_dialog_max_width, 0));
                viewFindViewById.setBackground(getDrawable(window, R$drawable.nx_alert_dialog_builder_background));
            }
            viewFindViewById.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateWindowLocation(@NonNull Window window, @NonNull View view) {
        int[] iArrCalculateFinalLocationOnScreen = calculateFinalLocationOnScreen(window, view);
        int[] iArr = new int[2];
        window.getDecorView().getLocationOnScreen(iArr);
        offsetWindowBy(window, iArrCalculateFinalLocationOnScreen[0] - iArr[0], iArrCalculateFinalLocationOnScreen[1] - iArr[1]);
    }
}
