package com.heytap.store.platform.tools;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/heytap/store/platform/tools/KeyboardUtils;", "", "()V", "TAG_ON_GLOBAL_LAYOUT_LISTENER", "", "millis", "", "sDecorViewDelta", "fixAndroidBug5497", "", "activity", "Landroid/app/Activity;", "window", "Landroid/view/Window;", "fixSoftInputLeaks", "getContentViewInvisibleHeight", "getDecorViewInvisibleHeight", "hideSoftInput", "view", "Landroid/view/View;", "hideSoftInputByToggle", "isSoftInputVisible", "", "registerSoftInputChangedListener", "listener", "Lcom/heytap/store/platform/tools/KeyboardUtils$OnSoftInputChangedListener;", "showSoftInput", UTraceSQLiteHelperKt.COL_FLAGS, "toggleSoftInput", "unregisterSoftInputChangedListener", "OnSoftInputChangedListener", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class KeyboardUtils {
    public static final KeyboardUtils INSTANCE = new KeyboardUtils();
    private static final int TAG_ON_GLOBAL_LAYOUT_LISTENER = -8;
    private static long millis;
    private static int sDecorViewDelta;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/store/platform/tools/KeyboardUtils$OnSoftInputChangedListener;", "", "onSoftInputChanged", "", Fields.HEIGHT_FIELD, "", "utils_release"}, k = 1, mv = {1, 4, 0})
    public interface OnSoftInputChangedListener {
        void onSoftInputChanged(int height);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, k = 3, mv = {1, 4, 0})
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ Window i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int[] f8285j;
        public final /* synthetic */ View k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f8286l;

        public a(Window window, int[] iArr, View view, int i) {
            this.i = window;
            this.f8285j = iArr;
            this.k = view;
            this.f8286l = i;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            KeyboardUtils keyboardUtils = KeyboardUtils.INSTANCE;
            int contentViewInvisibleHeight = keyboardUtils.getContentViewInvisibleHeight(this.i);
            if (this.f8285j[0] != contentViewInvisibleHeight) {
                View view = this.k;
                view.setPadding(view.getPaddingLeft(), this.k.getPaddingTop(), this.k.getPaddingRight(), this.f8286l + keyboardUtils.getDecorViewInvisibleHeight(this.i));
                this.f8285j[0] = contentViewInvisibleHeight;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, k = 3, mv = {1, 4, 0})
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ Window i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int[] f8287j;
        public final /* synthetic */ OnSoftInputChangedListener k;

        public b(Window window, int[] iArr, OnSoftInputChangedListener onSoftInputChangedListener) {
            this.i = window;
            this.f8287j = iArr;
            this.k = onSoftInputChangedListener;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            int decorViewInvisibleHeight = KeyboardUtils.INSTANCE.getDecorViewInvisibleHeight(this.i);
            if (this.f8287j[0] != decorViewInvisibleHeight) {
                this.k.onSoftInputChanged(decorViewInvisibleHeight);
                this.f8287j[0] = decorViewInvisibleHeight;
            }
        }
    }

    private KeyboardUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContentViewInvisibleHeight(Window window) {
        View viewFindViewById = window.findViewById(android.R.id.content);
        if (viewFindViewById == null) {
            return 0;
        }
        Rect rect = new Rect();
        viewFindViewById.getWindowVisibleDisplayFrame(rect);
        Log.d("KeyboardUtils", "getContentViewInvisibleHeight: " + (viewFindViewById.getBottom() - rect.bottom));
        int iAbs = Math.abs(viewFindViewById.getBottom() - rect.bottom);
        UtilsBridge utilsBridge = UtilsBridge.INSTANCE;
        if (iAbs <= utilsBridge.getStatusBarHeight() + utilsBridge.getNavBarHeight()) {
            return 0;
        }
        return iAbs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDecorViewInvisibleHeight(Window window) {
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        Log.d("KeyboardUtils", "getDecorViewInvisibleHeight: " + (decorView.getBottom() - rect.bottom));
        int iAbs = Math.abs(decorView.getBottom() - rect.bottom);
        UtilsBridge utilsBridge = UtilsBridge.INSTANCE;
        if (iAbs > utilsBridge.getNavBarHeight() + utilsBridge.getStatusBarHeight()) {
            return iAbs - sDecorViewDelta;
        }
        sDecorViewDelta = iAbs;
        return 0;
    }

    public final void fixAndroidBug5497(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        fixAndroidBug5497(window);
    }

    public final void fixSoftInputLeaks(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        fixSoftInputLeaks(window);
    }

    public final void hideSoftInput(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        hideSoftInput(window);
    }

    public final void hideSoftInputByToggle(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - millis) > 500 && isSoftInputVisible(activity)) {
            toggleSoftInput();
        }
        millis = jCurrentTimeMillis;
    }

    public final boolean isSoftInputVisible(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        return getDecorViewInvisibleHeight(window) > 0;
    }

    public final void registerSoftInputChangedListener(@NotNull Activity activity, @NotNull OnSoftInputChangedListener listener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        registerSoftInputChangedListener(window, listener);
    }

    public final void showSoftInput(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (isSoftInputVisible(activity)) {
            return;
        }
        toggleSoftInput();
    }

    public final void toggleSoftInput() {
        Object systemService = ContextGetterUtils.INSTANCE.getApp().getSystemService("input_method");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
        ((InputMethodManager) systemService).toggleSoftInput(0, 0);
    }

    public final void unregisterSoftInputChangedListener(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        View viewFindViewById = window.findViewById(android.R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "window.findViewById(android.R.id.content)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        Object tag = frameLayout.getTag(-8);
        if (tag instanceof ViewTreeObserver.OnGlobalLayoutListener) {
            frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) tag);
        }
    }

    public final void fixAndroidBug5497(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.setSoftInputMode(window.getAttributes().softInputMode & (-17));
        View viewFindViewById = window.findViewById(android.R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "window.findViewById(android.R.id.content)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        View childAt = frameLayout.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "contentView.getChildAt(0)");
        int paddingBottom = childAt.getPaddingBottom();
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new a(window, new int[]{getContentViewInvisibleHeight(window)}, childAt, paddingBottom));
    }

    public final void fixSoftInputLeaks(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        Object systemService = ContextGetterUtils.INSTANCE.getApp().getSystemService("input_method");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        String[] strArr = {"mLastSrvView", "mCurRootView", "mServedView", "mNextServedView"};
        for (int i = 0; i < 4; i++) {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField(strArr[i]);
                Intrinsics.checkNotNullExpressionValue(declaredField, "InputMethodManager::clas…etDeclaredField(leakView)");
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(inputMethodManager);
                if (!(obj instanceof View)) {
                    obj = null;
                }
                View view = (View) obj;
                if (view != null) {
                    View rootView = view.getRootView();
                    View decorView = window.getDecorView();
                    Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
                    if (rootView == decorView.getRootView()) {
                        declaredField.set(inputMethodManager, null);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void hideSoftInput(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        View currentFocus = window.getCurrentFocus();
        if (currentFocus == null) {
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
            View viewFindViewWithTag = decorView.findViewWithTag("keyboardTagView");
            if (viewFindViewWithTag == null) {
                viewFindViewWithTag = new EditText(window.getContext());
                viewFindViewWithTag.setTag("keyboardTagView");
                ((ViewGroup) decorView).addView(viewFindViewWithTag, 0, 0);
            }
            currentFocus = viewFindViewWithTag;
            currentFocus.requestFocus();
        }
        hideSoftInput(currentFocus);
    }

    public final void registerSoftInputChangedListener(@NotNull Window window, @NotNull OnSoftInputChangedListener listener) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if ((window.getAttributes().flags & 512) != 0) {
            window.clearFlags(512);
        }
        View viewFindViewById = window.findViewById(android.R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "window.findViewById(android.R.id.content)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        b bVar = new b(window, new int[]{getDecorViewInvisibleHeight(window)}, listener);
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
        frameLayout.setTag(-8, bVar);
    }

    public final void showSoftInput(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        showSoftInput(view, 0);
    }

    public final void showSoftInput(@NotNull View view, int flags) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object systemService = ContextGetterUtils.INSTANCE.getApp().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            inputMethodManager.showSoftInput(view, flags, new ResultReceiver(new Handler()) { // from class: com.heytap.store.platform.tools.KeyboardUtils.showSoftInput.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int resultCode, @NotNull Bundle resultData) {
                    Intrinsics.checkNotNullParameter(resultData, "resultData");
                    if (resultCode == 1 || resultCode == 3) {
                        KeyboardUtils.INSTANCE.toggleSoftInput();
                    }
                }
            });
            inputMethodManager.toggleSoftInput(2, 1);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    public final void hideSoftInput(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object systemService = ContextGetterUtils.INSTANCE.getApp().getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
