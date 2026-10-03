package com.oplus.aiunit.vision;

import dalvik.system.DexClassLoader;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B)\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0014R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/n8e;", "Ldalvik/system/DexClassLoader;", "", "toString", "name", "Ljava/lang/Class;", "findClass", "dexPath", "Ljava/lang/String;", "filePath", "nativeLibPath", "Ljava/lang/ClassLoader;", "mHostClassLoader", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V", "Companion", "a", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0})
public class n8e extends DexClassLoader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String FUNCTION = "kotlin.jvm.functions.";

    @NotNull
    public static final String TAG = "BaseDexClassLoader";

    @NotNull
    private final String dexPath;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.n8e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/n8e$a;", "", "", "filePath", "a", "FUNCTION", "Ljava/lang/String;", "TAG", "<init>", "()V", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String a(@Nullable String filePath) {
            Object obj;
            if (filePath != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    File file = new File(filePath);
                    if (file.exists() && v5d.a(false) && !file.setReadOnly()) {
                        ht9.a.d(s8e.INSTANCE, n8e.TAG, "setReadOnly failed.dexPath=" + filePath, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                    }
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                Throwable th2 = Result.exceptionOrNull-impl(obj);
                if (th2 != null) {
                    ht9.a.e(s8e.INSTANCE, n8e.TAG, "setReadOnly fail " + th2.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                }
                Result.box-impl(obj);
            }
            return filePath;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8e(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull ClassLoader classLoader) {
        super(INSTANCE.a(str), str2, str3, classLoader);
        Intrinsics.checkNotNullParameter(str, "dexPath");
        Intrinsics.checkNotNullParameter(str2, "filePath");
        Intrinsics.checkNotNullParameter(classLoader, "mHostClassLoader");
        this.dexPath = str;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    @NotNull
    public Class<?> findClass(@Nullable String name) throws ClassNotFoundException {
        Class<?> clsFindClass = super.findClass(name);
        Intrinsics.checkNotNullExpressionValue(clsFindClass, "result");
        return clsFindClass;
    }

    @Override // dalvik.system.BaseDexClassLoader
    @NotNull
    public String toString() {
        return super.toString() + "@" + hashCode();
    }
}
