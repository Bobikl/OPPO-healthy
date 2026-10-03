package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.WindowInsetsCompat;
import androidx.window.core.Bounds;
import androidx.window.layout.util.ActivityCompatHelperApi24;
import androidx.window.layout.util.ContextCompatHelper;
import androidx.window.layout.util.ContextCompatHelperApi30;
import androidx.window.layout.util.DisplayCompatHelperApi28;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u001aJ\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0003J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0015\u0010#\u001a\u00020$2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b%J\u0018\u0010&\u001a\u00020'2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006)"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculatorCompat;", "Landroidx/window/layout/WindowMetricsCalculator;", "()V", "TAG", "", "insetsTypeMasks", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getInsetsTypeMasks$window_release", "()Ljava/util/ArrayList;", "computeCurrentWindowMetrics", "Landroidx/window/layout/WindowMetrics;", "activity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "computeMaximumWindowMetrics", "computeWindowBoundsIceCreamSandwich", "Landroid/graphics/Rect;", "computeWindowBoundsIceCreamSandwich$window_release", "computeWindowBoundsN", "computeWindowBoundsN$window_release", "computeWindowBoundsP", "computeWindowBoundsP$window_release", "computeWindowBoundsQ", "computeWindowBoundsQ$window_release", "computeWindowInsetsCompat", "Landroidx/core/view/WindowInsetsCompat;", "computeWindowInsetsCompat$window_release", "getCutoutForDisplay", "Landroid/view/DisplayCutout;", "display", "Landroid/view/Display;", "getNavigationBarHeight", "getRealSizeForDisplay", "Landroid/graphics/Point;", "getRealSizeForDisplay$window_release", "getRectSizeFromDisplay", "", "bounds", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {

    @NotNull
    public static final WindowMetricsCalculatorCompat INSTANCE = new WindowMetricsCalculatorCompat();

    @NotNull
    private static final String TAG;

    @NotNull
    private static final ArrayList<Integer> insetsTypeMasks;

    static {
        String simpleName = WindowMetricsCalculatorCompat.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        TAG = simpleName;
        insetsTypeMasks = CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(WindowInsetsCompat.Type.statusBars()), Integer.valueOf(WindowInsetsCompat.Type.navigationBars()), Integer.valueOf(WindowInsetsCompat.Type.captionBar()), Integer.valueOf(WindowInsetsCompat.Type.ime()), Integer.valueOf(WindowInsetsCompat.Type.systemGestures()), Integer.valueOf(WindowInsetsCompat.Type.mandatorySystemGestures()), Integer.valueOf(WindowInsetsCompat.Type.tappableElement()), Integer.valueOf(WindowInsetsCompat.Type.displayCutout()));
    }

    private WindowMetricsCalculatorCompat() {
    }

    @RequiresApi(28)
    @SuppressLint({"BanUncheckedReflection"})
    private final DisplayCutout getCutoutForDisplay(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
        } catch (ClassNotFoundException e2) {
            Log.w(TAG, e2);
        } catch (IllegalAccessException e3) {
            Log.w(TAG, e3);
        } catch (InstantiationException e4) {
            Log.w(TAG, e4);
        } catch (NoSuchFieldException e5) {
            Log.w(TAG, e5);
        } catch (NoSuchMethodException e6) {
            Log.w(TAG, e6);
        } catch (InvocationTargetException e7) {
            Log.w(TAG, e7);
        }
        return null;
    }

    private final int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", ResourcesUtil.ResourceType.DIMEN, "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void getRectSizeFromDisplay(Activity activity, Rect bounds) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(bounds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.window.layout.WindowMetricsCalculator
    @NotNull
    public WindowMetrics computeCurrentWindowMetrics(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return ContextCompatHelperApi30.INSTANCE.currentWindowMetrics(context);
        }
        Context contextUnwrapUiContext$window_release = ContextCompatHelper.INSTANCE.unwrapUiContext$window_release(context);
        if (contextUnwrapUiContext$window_release instanceof Activity) {
            return computeCurrentWindowMetrics((Activity) contextUnwrapUiContext$window_release);
        }
        if (!(contextUnwrapUiContext$window_release instanceof InputMethodService)) {
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "wm.defaultDisplay");
        Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        return new WindowMetrics(new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y), null, 2, 0 == true ? 1 : 0);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    @NotNull
    public WindowMetrics computeMaximumWindowMetrics(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return computeMaximumWindowMetrics((Context) activity);
    }

    @NotNull
    public final Rect computeWindowBoundsIceCreamSandwich$window_release(@NotNull Activity activity) {
        int i;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
        Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        Rect rect = new Rect();
        int i2 = realSizeForDisplay$window_release.x;
        if (i2 == 0 || (i = realSizeForDisplay$window_release.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i2;
            rect.bottom = i;
        }
        return rect;
    }

    @RequiresApi(24)
    @NotNull
    public final Rect computeWindowBoundsN$window_release(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i = rect.bottom;
            if (i + navigationBarHeight == realSizeForDisplay$window_release.y) {
                rect.bottom = i + navigationBarHeight;
            } else {
                int i2 = rect.right;
                if (i2 + navigationBarHeight == realSizeForDisplay$window_release.x) {
                    rect.right = i2 + navigationBarHeight;
                }
            }
        }
        return rect;
    }

    @RequiresApi(28)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @NotNull
    public final Rect computeWindowBoundsP$window_release(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e2) {
            Log.w(TAG, e2);
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchFieldException e3) {
            Log.w(TAG, e3);
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchMethodException e4) {
            Log.w(TAG, e4);
            getRectSizeFromDisplay(activity, rect);
        } catch (InvocationTargetException e5) {
            Log.w(TAG, e5);
            getRectSizeFromDisplay(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        currentDisplay.getRealSize(point);
        ActivityCompatHelperApi24 activityCompatHelperApi24 = ActivityCompatHelperApi24.INSTANCE;
        if (!activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i = rect.bottom;
            if (i + navigationBarHeight == point.y) {
                rect.bottom = i + navigationBarHeight;
            } else {
                int i2 = rect.right;
                if (i2 + navigationBarHeight == point.x) {
                    rect.right = i2 + navigationBarHeight;
                } else if (rect.left == navigationBarHeight) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            Intrinsics.checkNotNullExpressionValue(currentDisplay, "currentDisplay");
            DisplayCutout cutoutForDisplay = getCutoutForDisplay(currentDisplay);
            if (cutoutForDisplay != null) {
                int i3 = rect.left;
                DisplayCompatHelperApi28 displayCompatHelperApi28 = DisplayCompatHelperApi28.INSTANCE;
                if (i3 == displayCompatHelperApi28.safeInsetLeft(cutoutForDisplay)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCompatHelperApi28.safeInsetRight(cutoutForDisplay)) {
                    rect.right += displayCompatHelperApi28.safeInsetRight(cutoutForDisplay);
                }
                if (rect.top == displayCompatHelperApi28.safeInsetTop(cutoutForDisplay)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay)) {
                    rect.bottom += displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay);
                }
            }
        }
        return rect;
    }

    @RequiresApi(29)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @NotNull
    public final Rect computeWindowBoundsQ$window_release(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (IllegalAccessException e2) {
            Log.w(TAG, e2);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchFieldException e3) {
            Log.w(TAG, e3);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchMethodException e4) {
            Log.w(TAG, e4);
            return computeWindowBoundsP$window_release(activity);
        } catch (InvocationTargetException e5) {
            Log.w(TAG, e5);
            return computeWindowBoundsP$window_release(activity);
        }
    }

    @RequiresApi(30)
    @NotNull
    public final WindowInsetsCompat computeWindowInsetsCompat$window_release(@NotNull Context context) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return ContextCompatHelperApi30.INSTANCE.currentWindowInsets(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    @NotNull
    public final ArrayList<Integer> getInsetsTypeMasks$window_release() {
        return insetsTypeMasks;
    }

    @VisibleForTesting
    @NotNull
    public final Point getRealSizeForDisplay$window_release(@NotNull Display display) {
        Intrinsics.checkNotNullParameter(display, "display");
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    @NotNull
    public WindowMetrics computeMaximumWindowMetrics(@NotNull Context context) throws Exception {
        Rect rect;
        WindowInsetsCompat windowInsetsCompatBuild;
        Intrinsics.checkNotNullParameter(context, "context");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            rect = ContextCompatHelperApi30.INSTANCE.maximumWindowBounds(context);
        } else {
            Object systemService = context.getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display display = ((WindowManager) systemService).getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue(display, "display");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(display);
            rect = new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        if (i >= 30) {
            windowInsetsCompatBuild = computeWindowInsetsCompat$window_release(context);
        } else {
            windowInsetsCompatBuild = new WindowInsetsCompat.Builder().build();
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new WindowMetrics(new Bounds(rect), windowInsetsCompatBuild);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    @NotNull
    public WindowMetrics computeCurrentWindowMetrics(@NotNull Activity activity) throws Exception {
        Rect rectComputeWindowBoundsQ$window_release;
        WindowInsetsCompat windowInsetsCompatBuild;
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            rectComputeWindowBoundsQ$window_release = ContextCompatHelperApi30.INSTANCE.currentWindowBounds(activity);
        } else {
            rectComputeWindowBoundsQ$window_release = computeWindowBoundsQ$window_release(activity);
        }
        if (i >= 30) {
            windowInsetsCompatBuild = computeWindowInsetsCompat$window_release(activity);
        } else {
            windowInsetsCompatBuild = new WindowInsetsCompat.Builder().build();
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new WindowMetrics(new Bounds(rectComputeWindowBoundsQ$window_release), windowInsetsCompatBuild);
    }
}
