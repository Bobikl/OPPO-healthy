package androidx.window.reflection;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmClassMappingKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\n\u001a\u00020\u00042\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\fH\u0000¢\u0006\u0002\b\u000eJ%\u0010\u000f\u001a\u00020\u00042\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\rH\u0000¢\u0006\u0002\b\u0012J'\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0001¢\u0006\u0002\b\u0017J\u001d\u0010\u0018\u001a\u00020\u0004*\u00020\b2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\rH\u0000¢\u0006\u0002\b\u001aJ\u001d\u0010\u0018\u001a\u00020\u0004*\u00020\b2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000¢\u0006\u0002\b\u001aR\u001c\u0010\u0003\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t¨\u0006\u001c"}, d2 = {"Landroidx/window/reflection/ReflectionUtils;", "", "()V", "isPublic", "", "Ljava/lang/reflect/Constructor;", "isPublic$window_release", "(Ljava/lang/reflect/Constructor;)Z", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)Z", "checkIsPresent", "classLoader", "Lkotlin/Function0;", "Ljava/lang/Class;", "checkIsPresent$window_release", "validateImplementation", "implementation", "requirements", "validateImplementation$window_release", "validateReflection", "errorMessage", "", "block", "validateReflection$window_release", "doesReturn", "clazz", "doesReturn$window_release", "Lkotlin/reflect/KClass;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReflectionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionUtils.kt\nandroidx/window/reflection/ReflectionUtils\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n12541#2,2:106\n*S KotlinDebug\n*F\n+ 1 ReflectionUtils.kt\nandroidx/window/reflection/ReflectionUtils\n*L\n97#1:106,2\n*E\n"})
public final class ReflectionUtils {

    @NotNull
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    @JvmStatic
    public static final boolean validateReflection$window_release(@Nullable String errorMessage, @NotNull Function0<Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            boolean zBooleanValue = block.invoke().booleanValue();
            if (!zBooleanValue && errorMessage != null) {
                Log.e("ReflectionGuard", errorMessage);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ClassNotFound: ");
            if (errorMessage == null) {
                errorMessage = "";
            }
            sb.append(errorMessage);
            Log.e("ReflectionGuard", sb.toString());
            return false;
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NoSuchMethod: ");
            if (errorMessage == null) {
                errorMessage = "";
            }
            sb2.append(errorMessage);
            Log.e("ReflectionGuard", sb2.toString());
            return false;
        }
    }

    public static /* synthetic */ boolean validateReflection$window_release$default(String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return validateReflection$window_release(str, function0);
    }

    public final boolean checkIsPresent$window_release(@NotNull Function0<? extends Class<?>> classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        try {
            classLoader.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean doesReturn$window_release(@NotNull Method method, @NotNull KClass<?> clazz) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return doesReturn$window_release(method, JvmClassMappingKt.getJavaClass((KClass) clazz));
    }

    public final boolean isPublic$window_release(@NotNull Constructor<?> constructor) {
        Intrinsics.checkNotNullParameter(constructor, "<this>");
        return Modifier.isPublic(constructor.getModifiers());
    }

    public final boolean validateImplementation$window_release(@NotNull final Class<?> implementation, @NotNull Class<?> requirements) {
        Intrinsics.checkNotNullParameter(implementation, "implementation");
        Intrinsics.checkNotNullParameter(requirements, "requirements");
        Method[] methods = requirements.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "requirements.methods");
        for (final Method method : methods) {
            if (!validateReflection$window_release(implementation.getName() + '#' + method.getName() + " is not valid", new Function0<Boolean>() { // from class: androidx.window.reflection.ReflectionUtils$validateImplementation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Code duplicated, block: B:7:0x0039  */
                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() throws NoSuchMethodException {
                    boolean z;
                    Class<?> cls = implementation;
                    String name = method.getName();
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Method implementedMethod = cls.getMethod(name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
                    ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(implementedMethod, "implementedMethod");
                    if (reflectionUtils.isPublic$window_release(implementedMethod)) {
                        Class<?> returnType = method.getReturnType();
                        Intrinsics.checkNotNullExpressionValue(returnType, "it.returnType");
                        if (reflectionUtils.doesReturn$window_release(implementedMethod, returnType)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            })) {
                return false;
            }
        }
        return true;
    }

    public final boolean doesReturn$window_release(@NotNull Method method, @NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return method.getReturnType().equals(clazz);
    }

    public final boolean isPublic$window_release(@NotNull Method method) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }
}
