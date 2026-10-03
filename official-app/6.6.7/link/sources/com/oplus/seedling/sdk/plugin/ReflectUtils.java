package com.oplus.seedling.sdk.plugin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.d14;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import com.oplus.aiunit.vision.v5d;
import com.oplus.seedling.sdk.SeedlingSdk;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0003J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\r\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0012J \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/oplus/seedling/sdk/plugin/ReflectUtils;", "", "()V", "KEY_ADD_ASSET_PATH", "", "KEY_DEX_ELEMENTS", "KEY_NATIVE_LIBRARY_PATH_ELEMENTS", "KEY_PATH_LIST", "KEY_RESOURCES", "TAG", "findReflectField", "Ljava/lang/reflect/Field;", "obj", "fieldName", "getPluginContext", "Landroid/content/Context;", "hookElements", "", "hookElements$pantanal_client_release", "hookElementsInternal", "hostListObject", "pluginListObject", "keyElements", "hookResources", "context", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReflectUtils {

    @NotNull
    public static final ReflectUtils INSTANCE = new ReflectUtils();

    @NotNull
    private static final String KEY_ADD_ASSET_PATH = "addAssetPath";

    @NotNull
    private static final String KEY_DEX_ELEMENTS = "dexElements";

    @NotNull
    private static final String KEY_NATIVE_LIBRARY_PATH_ELEMENTS = "nativeLibraryPathElements";

    @NotNull
    private static final String KEY_PATH_LIST = "pathList";

    @NotNull
    private static final String KEY_RESOURCES = "mResources";

    @NotNull
    private static final String TAG = "ReflectUtils";

    private ReflectUtils() {
    }

    @JvmStatic
    private static final Field findReflectField(Object obj, String fieldName) {
        s8e s8eVar = s8e.INSTANCE;
        ht9.a.c(s8eVar, TAG, "Start find reflect field for " + fieldName + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        if (obj == null || TextUtils.isEmpty(fieldName)) {
            ht9.a.e(s8eVar, TAG, "find reflect field abandon for fieldName : " + fieldName + ". ", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !Intrinsics.areEqual(superclass, Object.class); superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException e) {
                ht9.a.e(s8e.INSTANCE, TAG, "Exception happen for find field " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            }
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final Context getPluginContext() {
        return PluginManager.INSTANCE.getSInstance().getPluginContext();
    }

    @JvmStatic
    public static final void hookElements$pantanal_client_release() {
        SeedlingSdk seedlingSdk = SeedlingSdk.INSTANCE;
        Context sAppContext$pantanal_client_release = seedlingSdk.getSAppContext$pantanal_client_release();
        String pathPlugin = SeedlingConstants.PluginFilePath.getPathPlugin(sAppContext$pantanal_client_release);
        File file = new File(pathPlugin);
        if (!file.exists()) {
            ht9.a.c(s8e.INSTANCE, TAG, "apkFile is not exists!", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return;
        }
        try {
            ClassLoader classLoader = sAppContext$pantanal_client_release.getClassLoader();
            Field fieldFindReflectField = findReflectField(classLoader, KEY_PATH_LIST);
            if (fieldFindReflectField == null) {
                ht9.a.e(s8e.INSTANCE, TAG, "hook elements abandon via pathList is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                return;
            }
            Object obj = fieldFindReflectField.get(classLoader);
            if (obj == null) {
                ht9.a.e(s8e.INSTANCE, TAG, "hook elements abandon via hostListObject is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                return;
            }
            if (v5d.b(false, 1, (Object) null)) {
                file.setReadOnly();
            }
            Object obj2 = fieldFindReflectField.get(new DexClassLoader(pathPlugin, sAppContext$pantanal_client_release.getFilesDir().getAbsolutePath(), SeedlingConstants.PluginFilePath.getPathFolderSo(seedlingSdk.getSAppContext$pantanal_client_release()), classLoader));
            if (obj2 == null) {
                ht9.a.e(s8e.INSTANCE, TAG, "hook elements abandon via pluginListObject is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                return;
            }
            hookElementsInternal(obj, obj2, KEY_DEX_ELEMENTS);
            hookElementsInternal(obj, obj2, KEY_NATIVE_LIBRARY_PATH_ELEMENTS);
            ht9.a.c(s8e.INSTANCE, TAG, "hook elements success.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        } catch (Exception e) {
            ht9.a.e(s8e.INSTANCE, TAG, "Exception happen while hook elements : " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
    }

    @JvmStatic
    private static final void hookElementsInternal(Object hostListObject, Object pluginListObject, String keyElements) {
        try {
            Field fieldFindReflectField = findReflectField(hostListObject, keyElements);
            if (fieldFindReflectField == null) {
                ht9.a.e(s8e.INSTANCE, TAG, "hook abandon via filed is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                return;
            }
            Object obj = fieldFindReflectField.get(hostListObject);
            Object[] objArr = obj instanceof Object[] ? (Object[]) obj : null;
            if (objArr == null) {
                ht9.a.e(s8e.INSTANCE, TAG, "hook abandon via host elements array is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                return;
            }
            Object obj2 = fieldFindReflectField.get(pluginListObject);
            Object[] objArr2 = obj2 instanceof Object[] ? (Object[]) obj2 : null;
            if (objArr2 == null) {
                ht9.a.e(s8e.INSTANCE, TAG, "hook abandon via plugin elements array is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                return;
            }
            Class<?> componentType = objArr.getClass().getComponentType();
            if (componentType == null) {
                ht9.a.e(s8e.INSTANCE, TAG, "hook abandon via elements type is null.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                return;
            }
            Object objNewInstance = Array.newInstance(componentType, objArr.length + objArr2.length);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) objNewInstance;
            System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
            System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
            fieldFindReflectField.set(hostListObject, objArr3);
            ht9.a.c(s8e.INSTANCE, TAG, "hook elements " + keyElements + " success.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        } catch (Exception e) {
            ht9.a.e(s8e.INSTANCE, TAG, "Exception happen while hook elements : " + e.getMessage() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
    }

    @JvmStatic
    @Keep
    @SuppressLint({"DiscouragedPrivateApi"})
    @Nullable
    public static final Context hookResources(@NotNull Context context) {
        ContextThemeWrapper contextThemeWrapper;
        Intrinsics.checkNotNullParameter(context, "context");
        ContextThemeWrapper contextThemeWrapper2 = null;
        try {
            AssetManager assetManager = (AssetManager) AssetManager.class.newInstance();
            AssetManager.class.getDeclaredMethod(KEY_ADD_ASSET_PATH, String.class).invoke(assetManager, SeedlingConstants.PluginFilePath.getPathPlugin(SeedlingSdk.INSTANCE.getSAppContext$pantanal_client_release()));
            Resources resources = new Resources(assetManager, context.getResources().getDisplayMetrics(), context.getResources().getConfiguration());
            contextThemeWrapper = new ContextThemeWrapper(context, 0);
            try {
                Field declaredField = ContextThemeWrapper.class.getDeclaredField(KEY_RESOURCES);
                declaredField.setAccessible(true);
                declaredField.set(contextThemeWrapper, resources);
            } catch (Throwable th) {
                th = th;
                contextThemeWrapper2 = contextThemeWrapper;
                ht9.a.b(s8e.INSTANCE, TAG, "Exception while hook resource :" + th.getCause() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                contextThemeWrapper = contextThemeWrapper2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        ht9.a.c(s8e.INSTANCE, TAG, "Finish hook resources.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return contextThemeWrapper;
    }
}
