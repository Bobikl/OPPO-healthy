package com.heytap.store.base.core.ativitylifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.MainThread;
import com.heytap.store.base.core.callback.JumpFromOutSideCall;
import com.heytap.store.base.core.navigation.SystemUiHelper;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.base.core.util.RxBus;
import com.oplus.aiunit.vision.vhc;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.TypeIntrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0007J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0012J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0006\u0010\u001f\u001a\u00020\u0004J\u0006\u0010 \u001a\u00020\u0016J\b\u0010!\u001a\u0004\u0018\u00010\u0016J\u001e\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010%J\b\u0010&\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010'\u001a\u00020\u0006J\u000e\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*J\u0016\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0016J\u0016\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-2\u0006\u00100\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u00101\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016J\u0012\u00102\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/heytap/store/base/core/ativitylifecycle/ActivityCollectionManager;", "", "()V", "appCount", "", "catPassed", "", "getCatPassed", "()Z", "setCatPassed", "(Z)V", "isRunInBackground", "mActivities", "", "Landroid/app/Activity;", "observers", "Lcom/heytap/store/base/core/ativitylifecycle/IActivitiesLifecycleObserver;", "addLifecycleObserver", "", "observer", "backAllActivitiesExceptActivity", "exceptActivityName", "", "clearActivityJumpFromOutSideAndOpenAfterJump", "finishAllActivities", "finishAllActivitiesExceptActivity", "finishAllNoFocusActivity", "getActivity", "ActivityName", "getActivityLifecycleCallbacks", "Landroid/app/Application$ActivityLifecycleCallbacks;", "getAliveActivitiesNumber", "getMainActivityName", "getMainActivitySimpleName", "getSameSubActivity", "", "clazz", "Ljava/lang/Class;", "getTopActivity", "hasAliveActivity", "init", "application", "Landroid/app/Application;", "isActivityTop", "context", "Landroid/content/Context;", "clsName", "isProductActivity", "hashCode", "isTopActivity", "removeLifecycleObserver", "Companion", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ActivityCollectionManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static String TAG = ActivityCollectionManager.class.getSimpleName();

    @Nullable
    private static ActivityCollectionManager instance;
    private int appCount;
    private boolean catPassed;
    private boolean isRunInBackground;

    @NotNull
    private final List<Activity> mActivities;

    @NotNull
    private final List<IActivitiesLifecycleObserver> observers;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\u000bR\"\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/heytap/store/base/core/ativitylifecycle/ActivityCollectionManager$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "instance", "Lcom/heytap/store/base/core/ativitylifecycle/ActivityCollectionManager;", "getInstance", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActivityCollectionManager getInstance() {
            if (ActivityCollectionManager.instance == null) {
                ActivityCollectionManager.instance = new ActivityCollectionManager(null);
            }
            ActivityCollectionManager activityCollectionManager = ActivityCollectionManager.instance;
            Intrinsics.checkNotNull(activityCollectionManager);
            return activityCollectionManager;
        }

        public final String getTAG() {
            return ActivityCollectionManager.TAG;
        }

        public final void setTAG(String str) {
            ActivityCollectionManager.TAG = str;
        }
    }

    public /* synthetic */ ActivityCollectionManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final Application.ActivityLifecycleCallbacks getActivityLifecycleCallbacks() {
        return new ActivityLifecycleCallbacksImp() { // from class: com.heytap.store.base.core.ativitylifecycle.ActivityCollectionManager.getActivityLifecycleCallbacks.1
            @Override // com.heytap.store.base.core.ativitylifecycle.ActivityLifecycleCallbacksImp, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
                View decorView;
                Intrinsics.checkNotNullParameter(activity, "activity");
                super.onActivityCreated(activity, savedInstanceState);
                if (!ActivityCollectionManager.this.mActivities.contains(activity)) {
                    ActivityCollectionManager.this.mActivities.add(activity);
                }
                try {
                    Iterator it = ActivityCollectionManager.this.observers.iterator();
                    while (it.hasNext()) {
                        ((IActivitiesLifecycleObserver) it.next()).onActivityCreated(activity, savedInstanceState);
                    }
                } catch (ConcurrentModificationException unused) {
                }
                if (activity.getComponentName() == null || !Intrinsics.areEqual("com.heytap.uccreditlib.internal.UserCreditsMarketActivity", activity.getComponentName().getClassName()) || (decorView = activity.getWindow().getDecorView()) == null || vhc.a(activity)) {
                    return;
                }
                decorView.setBackgroundColor(-1);
                activity.getWindow().setStatusBarColor(Color.parseColor("#ffffff"));
                SystemUiHelper.setStatusBarDarkMode(true, activity);
            }

            @Override // com.heytap.store.base.core.ativitylifecycle.ActivityLifecycleCallbacksImp, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                super.onActivityDestroyed(activity);
                ActivityCollectionManager.this.mActivities.remove(activity);
                try {
                    Iterator it = ActivityCollectionManager.this.observers.iterator();
                    while (it.hasNext()) {
                        ((IActivitiesLifecycleObserver) it.next()).onActivityDestroyed(activity);
                    }
                } catch (ConcurrentModificationException unused) {
                }
            }

            @Override // com.heytap.store.base.core.ativitylifecycle.ActivityLifecycleCallbacksImp, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                super.onActivityPaused(activity);
                try {
                    Iterator it = ActivityCollectionManager.this.observers.iterator();
                    while (it.hasNext()) {
                        ((IActivitiesLifecycleObserver) it.next()).onActivityPaused(activity);
                    }
                } catch (ConcurrentModificationException unused) {
                }
            }

            @Override // com.heytap.store.base.core.ativitylifecycle.ActivityLifecycleCallbacksImp, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                try {
                    Iterator it = ActivityCollectionManager.this.observers.iterator();
                    while (it.hasNext()) {
                        ((IActivitiesLifecycleObserver) it.next()).onActivityResumed(activity);
                    }
                } catch (ConcurrentModificationException unused) {
                }
            }

            @Override // com.heytap.store.base.core.ativitylifecycle.ActivityLifecycleCallbacksImp, android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // com.heytap.store.base.core.ativitylifecycle.ActivityLifecycleCallbacksImp, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                boolean z = true;
                ActivityCollectionManager.this.appCount++;
                if (ActivityCollectionManager.this.isRunInBackground && ActivityCollectionManager.this.getCatPassed()) {
                    ActivityCollectionManager.this.isRunInBackground = false;
                    ActivityCollectionManager activityCollectionManager = ActivityCollectionManager.this;
                    if (activityCollectionManager.isActivityTop(activity, activityCollectionManager.getMainActivityName())) {
                        RxBus.get().post(new RxBus.Event("foreground", ""));
                    }
                } else {
                    z = false;
                }
                try {
                    Iterator it = ActivityCollectionManager.this.observers.iterator();
                    while (it.hasNext()) {
                        ((IActivitiesLifecycleObserver) it.next()).onActivityStarted(activity, z);
                    }
                } catch (ConcurrentModificationException unused) {
                }
            }

            @Override // com.heytap.store.base.core.ativitylifecycle.ActivityLifecycleCallbacksImp, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                ActivityCollectionManager.this.appCount--;
                if (ActivityCollectionManager.this.appCount == 0) {
                    ActivityCollectionManager.this.isRunInBackground = true;
                }
                try {
                    List list = ActivityCollectionManager.this.observers;
                    ActivityCollectionManager activityCollectionManager = ActivityCollectionManager.this;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((IActivitiesLifecycleObserver) it.next()).onActivityStopped(activity, activityCollectionManager.isRunInBackground);
                    }
                } catch (ConcurrentModificationException unused) {
                }
            }
        };
    }

    @MainThread
    public final void addLifecycleObserver(@NotNull IActivitiesLifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.add(observer);
    }

    public final void backAllActivitiesExceptActivity(@NotNull String exceptActivityName) {
        Intrinsics.checkNotNullParameter(exceptActivityName, "exceptActivityName");
        if (TextUtils.isEmpty(exceptActivityName)) {
            return;
        }
        for (Activity activity : this.mActivities) {
            String name = activity.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "activity.javaClass.name");
            if (!StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) exceptActivityName, false, 2, (Object) null)) {
                String name2 = activity.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name2, "activity.javaClass.name");
                if (!StringsKt__StringsKt.contains$default((CharSequence) name2, (CharSequence) "EasygoWebBrowserActivity", false, 2, (Object) null)) {
                    activity.finish();
                }
            }
        }
    }

    public final void clearActivityJumpFromOutSideAndOpenAfterJump() {
        int size = this.mActivities.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Activity activity = this.mActivities.get(i);
            if ((activity instanceof JumpFromOutSideCall) && !activity.isFinishing()) {
                activity.finish();
            }
            i = i2;
        }
    }

    public final void finishAllActivities() {
        for (Activity activity : this.mActivities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    public final void finishAllActivitiesExceptActivity(@NotNull String exceptActivityName) {
        Intrinsics.checkNotNullParameter(exceptActivityName, "exceptActivityName");
        if (TextUtils.isEmpty(exceptActivityName)) {
            return;
        }
        for (Activity activity : this.mActivities) {
            if (!activity.isFinishing() && !Intrinsics.areEqual(activity.getClass().getName(), exceptActivityName)) {
                activity.finish();
            }
        }
    }

    public final void finishAllNoFocusActivity() {
        int size = this.mActivities.size() - 2;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.mActivities.get(i).finish();
            if (i == size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Nullable
    public final Activity getActivity(@NotNull String ActivityName) {
        Intrinsics.checkNotNullParameter(ActivityName, "ActivityName");
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.mActivities);
        if (lastIndex < 0) {
            return null;
        }
        while (true) {
            int i = lastIndex - 1;
            if (Intrinsics.areEqual(this.mActivities.get(lastIndex).getClass().getSimpleName(), ActivityName)) {
                return this.mActivities.get(lastIndex);
            }
            if (i < 0) {
                return null;
            }
            lastIndex = i;
        }
    }

    public final int getAliveActivitiesNumber() {
        return this.mActivities.size();
    }

    public final boolean getCatPassed() {
        return this.catPassed;
    }

    @NotNull
    public final String getMainActivityName() {
        return DisplayUtil.isRealSpitWindow() ? "com.oppo.store.NoBgWindowMainActivity" : "com.oppo.store.MainActivity";
    }

    @Nullable
    public final String getMainActivitySimpleName() {
        return DisplayUtil.isRealSpitWindow() ? "NoBgWindowMainActivity" : "MainActivity";
    }

    @Nullable
    public final List<Activity> getSameSubActivity(@Nullable Class<?> clazz) {
        ArrayList arrayList = null;
        if ((!this.mActivities.isEmpty()) && clazz != null) {
            for (Activity activity : this.mActivities) {
                if (clazz.isAssignableFrom(activity.getClass())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(activity);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public final Activity getTopActivity() {
        if (!hasAliveActivity()) {
            return null;
        }
        List<Activity> list = this.mActivities;
        return list.get(list.size() - 1);
    }

    public final boolean hasAliveActivity() {
        return getAliveActivitiesNumber() > 0;
    }

    public final void init(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        application.registerActivityLifecycleCallbacks(getActivityLifecycleCallbacks());
    }

    public final boolean isActivityTop(@NotNull Context context, @NotNull String clsName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clsName, "clsName");
        return false;
    }

    public final boolean isProductActivity(@NotNull Context context, int hashCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            Activity activity = getActivity("ProductDetailActivity");
            return activity != null && hashCode == activity.hashCode();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    /* JADX INFO: renamed from: isRunInBackground, reason: from getter */
    public final boolean getIsRunInBackground() {
        return this.isRunInBackground;
    }

    public final boolean isTopActivity(@Nullable String ActivityName) {
        Activity topActivity = getTopActivity();
        if (topActivity == null) {
            return false;
        }
        String simpleName = topActivity.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "topActivity.javaClass.simpleName");
        Intrinsics.checkNotNull(ActivityName);
        return StringsKt__StringsKt.contains$default((CharSequence) simpleName, (CharSequence) ActivityName, false, 2, (Object) null);
    }

    @MainThread
    public final void removeLifecycleObserver(@Nullable IActivitiesLifecycleObserver observer) {
        TypeIntrinsics.asMutableCollection(this.observers).remove(observer);
    }

    public final void setCatPassed(boolean z) {
        this.catPassed = z;
    }

    private ActivityCollectionManager() {
        this.mActivities = new ArrayList(5);
        this.isRunInBackground = true;
        this.observers = new ArrayList();
    }
}
