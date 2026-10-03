package com.oplus.aiunit.vision;

import android.content.Context;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import io.protostuff.MapSchema;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/jzk;", "", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "", "nativeLibDirPath", "", "d", "b", "Ljava/lang/ClassLoader;", "classLoader", "nativeDirPath", "a", "Ldalvik/system/PathClassLoader;", "pathClassLoader", "c", "SO_NAME_VIDEO_SDK", "Ljava/lang/String;", "Z", "mInitOnce", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class jzk {

    @NotNull
    public static final jzk INSTANCE = new jzk();

    @NotNull
    public static final String SO_NAME_VIDEO_SDK = "videosdk";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static volatile boolean mInitOnce;

    public final void a(ClassLoader classLoader, String nativeDirPath) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Intrinsics.checkNotNull(classLoader, "null cannot be cast to non-null type dalvik.system.PathClassLoader");
        Object objC = c((PathClassLoader) classLoader);
        Field declaredField = objC != null ? objC.getClass().getDeclaredField("systemNativeLibraryDirectories") : null;
        Intrinsics.checkNotNull(declaredField, "null cannot be cast to non-null type java.lang.reflect.Field");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(objC);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<java.io.File>");
        List listAsMutableList = TypeIntrinsics.asMutableList(obj);
        listAsMutableList.add(new File(nativeDirPath));
        declaredField.set(objC, listAsMutableList);
        Field declaredField2 = objC.getClass().getDeclaredField("nativeLibraryDirectories");
        Intrinsics.checkNotNull(declaredField2, "null cannot be cast to non-null type java.lang.reflect.Field");
        declaredField2.setAccessible(true);
        Object obj2 = declaredField2.get(objC);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.util.ArrayList<java.io.File>{ kotlin.collections.TypeAliasesKt.ArrayList<java.io.File> }");
        ArrayList arrayList = (ArrayList) obj2;
        arrayList.add(new File(nativeDirPath));
        declaredField2.set(objC, arrayList);
        Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
        Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
        Field declaredField3 = objC.getClass().getDeclaredField("nativeLibraryPathElements");
        Intrinsics.checkNotNull(declaredField3, "null cannot be cast to non-null type java.lang.reflect.Field");
        declaredField3.setAccessible(true);
        Object obj3 = declaredField3.get(objC);
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
        Object[] objArr = (Object[]) obj3;
        Object objNewInstance = Array.newInstance(cls, objArr.length + 1);
        if (constructor != null) {
            try {
                Array.set(objNewInstance, 0, constructor.newInstance(new File(nativeDirPath), Boolean.TRUE, null, null));
                int length = objArr.length + 1;
                for (int i = 1; i < length; i++) {
                    Array.set(objNewInstance, i, objArr[i - 1]);
                }
                declaredField3.set(objC, objNewInstance);
            } catch (IllegalArgumentException e2) {
                Method declaredMethod = objC.getClass().getDeclaredMethod("makePathElements", List.class);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, arrayList);
                Field declaredField4 = objC.getClass().getDeclaredField("nativeLibraryPathElements");
                Intrinsics.checkNotNull(declaredField4, "null cannot be cast to non-null type java.lang.reflect.Field");
                declaredField4.setAccessible(true);
                declaredField4.set(objC, objInvoke);
                ltl.b("VideoSoLoadHelper", "createNativeDirAboveApi21 e1: " + e2.getMessage());
            } catch (InstantiationException e3) {
                ltl.b("VideoSoLoadHelper", "createNativeDirAboveApi21 e2: " + e3.getMessage());
            } catch (InvocationTargetException e4) {
                ltl.b("VideoSoLoadHelper", "createNativeDirAboveApi21 e3: " + e4.getMessage());
            }
        }
        ltl.d("VideoSoLoadHelper", "createNativeDirAboveApi21: load " + nativeDirPath + " finish");
    }

    public final boolean b() {
        if (!e()) {
            ltl.a("VideoSoLoadHelper", "ensureVideoSoLoaded: loading video SO on demand");
            Context contextA = b78.a();
            Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
            String SO_DIR = j1i.SO_DIR;
            Intrinsics.checkNotNullExpressionValue(SO_DIR, "SO_DIR");
            d(contextA, SO_DIR);
        }
        return e();
    }

    public final Object c(PathClassLoader pathClassLoader) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Field declaredField = Class.forName("dalvik.system.BaseDexClassLoader").getDeclaredField("pathList");
        declaredField.setAccessible(true);
        return declaredField.get(pathClassLoader);
    }

    public final void d(@NotNull Context context, @NotNull String nativeLibDirPath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeLibDirPath, "nativeLibDirPath");
        if (mInitOnce) {
            return;
        }
        synchronized (this) {
            if (mInitOnce) {
                return;
            }
            try {
                jzk jzkVar = INSTANCE;
                ClassLoader classLoader = jzk.class.getClassLoader();
                Intrinsics.checkNotNullExpressionValue(classLoader, "this::class.java.classLoader");
                jzkVar.a(classLoader, nativeLibDirPath);
            } catch (Exception e2) {
                ltl.b("VideoSoLoadHelper", "initNativeLibraryDirPath: " + e2.getMessage());
            }
            try {
                System.loadLibrary("ffmpeg");
                System.loadLibrary("yuv");
                System.loadLibrary(SO_NAME_VIDEO_SDK);
                mInitOnce = true;
            } catch (Exception e3) {
                ltl.b("VideoSoLoadHelper", "loadLibrary: " + e3.getMessage());
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean e() {
        return mInitOnce;
    }
}
