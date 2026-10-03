package com.platform.usercenter.tools.ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.platform.usercenter.tools.UCBasicUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes9.dex */
public final class KeyboardUtils {
    private static final int TAG_ON_GLOBAL_LAYOUT_LISTENER = -8;
    private static long millis;
    private static int sDecorViewDelta;

    public interface OnSoftInputChangedListener {
        void onSoftInputChanged(int i);
    }

    private KeyboardUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void fixAndroidBug5497(@NonNull Activity activity) {
        fixAndroidBug5497(activity.getWindow());
    }

    public static void fixSoftInputLeaks(@NonNull Activity activity) {
        fixSoftInputLeaks(activity.getWindow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getContentViewInvisibleHeight(Window window) {
        View viewFindViewById = window.findViewById(R.id.content);
        if (viewFindViewById == null) {
            return 0;
        }
        Rect rect = new Rect();
        viewFindViewById.getWindowVisibleDisplayFrame(rect);
        Log.d("KeyboardUtils", "getContentViewInvisibleHeight: " + (viewFindViewById.getBottom() - rect.bottom));
        int iAbs = Math.abs(viewFindViewById.getBottom() - rect.bottom);
        if (iAbs <= BarUtils.getStatusBarHeight() + BarUtils.getNavBarHeight()) {
            return 0;
        }
        return iAbs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getDecorViewInvisibleHeight(@NonNull Window window) {
        View decorView = window.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        Log.d("KeyboardUtils", "getDecorViewInvisibleHeight: " + (decorView.getBottom() - rect.bottom));
        int iAbs = Math.abs(decorView.getBottom() - rect.bottom);
        if (iAbs > BarUtils.getNavBarHeight() + BarUtils.getStatusBarHeight()) {
            return NavigationUtils.isGestureNavMode(window.getContext()) ? iAbs : iAbs - sDecorViewDelta;
        }
        sDecorViewDelta = iAbs;
        return 0;
    }

    public static void hideSoftInput(Activity activity) {
        View viewPeekDecorView;
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (!inputMethodManager.isActive() || (viewPeekDecorView = activity.getWindow().peekDecorView()) == null || viewPeekDecorView.getWindowToken() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(viewPeekDecorView.getWindowToken(), 0);
    }

    public static void hideSoftKeyboard(View view) {
        if (view != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    public static boolean isSoftInputVisible(@NonNull Activity activity) {
        return getDecorViewInvisibleHeight(activity.getWindow()) > 0;
    }

    public static void registerSoftInputChangedListener(@NonNull Activity activity, @NonNull OnSoftInputChangedListener onSoftInputChangedListener) {
        registerSoftInputChangedListener(activity.getWindow(), onSoftInputChangedListener);
    }

    public static void showSoftInput(Context context) {
        ((InputMethodManager) context.getSystemService("input_method")).toggleSoftInput(0, 2);
    }

    public static void toggleSoftInput() {
        InputMethodManager inputMethodManager = (InputMethodManager) UCBasicUtils.sContext.getApplicationContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 0);
    }

    public static void unregisterSoftInputChangedListener(@NonNull Window window) {
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content);
        Object tag = frameLayout.getTag(-8);
        if (tag instanceof ViewTreeObserver.OnGlobalLayoutListener) {
            frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) tag);
        }
    }

    public static void fixAndroidBug5497(@NonNull final Window window) {
        window.setSoftInputMode(window.getAttributes().softInputMode & (-17));
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content);
        final View childAt = frameLayout.getChildAt(0);
        final int paddingBottom = childAt.getPaddingBottom();
        final int[] iArr = {getContentViewInvisibleHeight(window)};
        if (sDecorViewDelta == 0) {
            getDecorViewInvisibleHeight(window);
        }
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.platform.usercenter.tools.ui.KeyboardUtils.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int contentViewInvisibleHeight = KeyboardUtils.getContentViewInvisibleHeight(window);
                if (iArr[0] != contentViewInvisibleHeight) {
                    View view = childAt;
                    view.setPadding(view.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), paddingBottom + KeyboardUtils.getDecorViewInvisibleHeight(window));
                    iArr[0] = contentViewInvisibleHeight;
                }
            }
        });
    }

    public static void fixSoftInputLeaks(@NonNull Window window) {
        InputMethodManager inputMethodManager = (InputMethodManager) window.getContext().getApplicationContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        String[] strArr = {"mLastSrvView", "mCurRootView", "mServedView", "mNextServedView"};
        for (int i = 0; i < 4; i++) {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField(strArr[i]);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(inputMethodManager);
                if ((obj instanceof View) && ((View) obj).getRootView() == window.getDecorView().getRootView()) {
                    declaredField.set(inputMethodManager, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void registerSoftInputChangedListener(@NonNull final Window window, @NonNull final OnSoftInputChangedListener onSoftInputChangedListener) {
        if ((window.getAttributes().flags & 512) != 0) {
            window.clearFlags(512);
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content);
        final int[] iArr = {getDecorViewInvisibleHeight(window)};
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.platform.usercenter.tools.ui.KeyboardUtils.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int decorViewInvisibleHeight = KeyboardUtils.getDecorViewInvisibleHeight(window);
                if (iArr[0] != decorViewInvisibleHeight) {
                    onSoftInputChangedListener.onSoftInputChanged(decorViewInvisibleHeight);
                    iArr[0] = decorViewInvisibleHeight;
                }
            }
        };
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        frameLayout.setTag(-8, onGlobalLayoutListener);
    }

    public static void showSoftInput(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
