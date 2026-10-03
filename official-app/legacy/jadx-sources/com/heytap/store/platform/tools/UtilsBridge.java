package com.heytap.store.platform.tools;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.smartenginehelper.ParserTag;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ$\u0010\f\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\r\"\u0004\b\u0000\u0010\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\rJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0016J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0018J\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001a\u0010#\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010$\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'J\u0016\u0010(\u001a\u00020\u00042\u0006\u0010&\u001a\u00020'2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0018J\u0010\u0010,\u001a\u0004\u0018\u00010\u00132\u0006\u0010-\u001a\u00020\u0011¨\u0006."}, d2 = {"Lcom/heytap/store/platform/tools/UtilsBridge;", "", "()V", "addActivityLifecycleCallbacks", "", "activity", "Landroid/app/Activity;", "callbacks", "Lcom/heytap/store/platform/tools/ContextGetterUtils$ActivityLifecycleCallbacks;", "addOnAppStatusChangedListener", "listener", "Lcom/heytap/store/platform/tools/ContextGetterUtils$OnAppStatusChangedListener;", "doAsync", "Lcom/heytap/store/platform/tools/ContextGetterUtils$Task;", ExifInterface.GPS_DIRECTION_TRUE, "task", "file2Uri", "Landroid/net/Uri;", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "fixSoftInputLeaks", "getActivityList", "", "getApplicationByReflect", "Landroid/app/Application;", "getCurrentProcessName", "", "getForegroundProcessName", "getNavBarHeight", "", "getStatusBarHeight", "init", "app", "isMainProcess", "", "removeActivityLifecycleCallbacks", "removeOnAppStatusChangedListener", "runOnUiThread", "runnable", "Ljava/lang/Runnable;", "runOnUiThreadDelayed", "delayMillis", "", "unInit", "uri2File", ParserTag.TAG_URI, "utils_release"}, k = 1, mv = {1, 4, 0})
public final class UtilsBridge {
    public static final UtilsBridge INSTANCE = new UtilsBridge();

    private UtilsBridge() {
    }

    public final void addActivityLifecycleCallbacks(@Nullable Activity activity, @Nullable ContextGetterUtils.ActivityLifecycleCallbacks callbacks) {
        UtilsActivityLifecycleImpl.INSTANCE.getINSTANCE().addActivityLifecycleCallbacks(activity, callbacks);
    }

    public final void addOnAppStatusChangedListener(@NotNull ContextGetterUtils.OnAppStatusChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        UtilsActivityLifecycleImpl.INSTANCE.getINSTANCE().addOnAppStatusChangedListener(listener);
    }

    @Nullable
    public final <T> ContextGetterUtils.Task<T> doAsync(@Nullable ContextGetterUtils.Task<T> task) {
        ExecutorService cachedPool = ThreadUtils.getCachedPool();
        if (cachedPool != null) {
            cachedPool.execute(task);
        }
        return task;
    }

    @Nullable
    public final Uri file2Uri(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return UriUtils.INSTANCE.file2Uri(file);
    }

    public final void fixSoftInputLeaks(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        KeyboardUtils.INSTANCE.fixSoftInputLeaks(activity);
    }

    @Nullable
    public final List<Activity> getActivityList() {
        return UtilsActivityLifecycleImpl.INSTANCE.getINSTANCE().getActivityList();
    }

    @Nullable
    public final Application getApplicationByReflect() {
        return UtilsActivityLifecycleImpl.INSTANCE.getINSTANCE().getApplicationByReflect();
    }

    @Nullable
    public final String getCurrentProcessName() {
        return ProcessUtils.INSTANCE.getCurrentProcessName();
    }

    @Nullable
    public final String getForegroundProcessName() {
        return ProcessUtils.INSTANCE.getForegroundProcessName();
    }

    public final int getNavBarHeight() {
        return SystemUIUtils.INSTANCE.getNavBarHeight();
    }

    public final int getStatusBarHeight() {
        return SystemUIUtils.INSTANCE.getStatusBarHeight();
    }

    public final void init(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        UtilsActivityLifecycleImpl.INSTANCE.getINSTANCE().init(app);
    }

    public final boolean isMainProcess() {
        return ProcessUtils.INSTANCE.isMainProcess();
    }

    public final void removeActivityLifecycleCallbacks(@Nullable Activity activity) {
        UtilsActivityLifecycleImpl.INSTANCE.getINSTANCE().removeActivityLifecycleCallbacks(activity);
    }

    public final void removeOnAppStatusChangedListener(@Nullable ContextGetterUtils.OnAppStatusChangedListener listener) {
        UtilsActivityLifecycleImpl.INSTANCE.getINSTANCE().removeOnAppStatusChangedListener(listener);
    }

    public final void runOnUiThread(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ThreadUtils.runOnUiThread(runnable);
    }

    public final void runOnUiThreadDelayed(@NotNull Runnable runnable, long delayMillis) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ThreadUtils.runOnUiThreadDelayed(runnable, delayMillis);
    }

    public final void unInit(@NotNull Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        UtilsActivityLifecycleImpl.INSTANCE.getINSTANCE().unInit(app);
    }

    @Nullable
    public final File uri2File(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return UriUtils.INSTANCE.uri2File(uri);
    }

    public final void removeActivityLifecycleCallbacks(@Nullable Activity activity, @Nullable ContextGetterUtils.ActivityLifecycleCallbacks callbacks) {
        UtilsActivityLifecycleImpl.INSTANCE.getINSTANCE().removeActivityLifecycleCallbacks(activity, callbacks);
    }
}
