package com.oplus.aiunit.vision;

import dalvik.system.DexClassLoader;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B)\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0014R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/o6e;", "Ldalvik/system/DexClassLoader;", "", "toString", "name", "Ljava/lang/Class;", "findClass", "dexPath", "Ljava/lang/String;", "filePath", "nativeLibPath", "Ljava/lang/ClassLoader;", "mHostClassLoader", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V", "Companion", "a", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0})
public class o6e extends DexClassLoader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String FUNCTION = "kotlin.jvm.functions.";

    @NotNull
    public static final String TAG = "BaseDexClassLoader";

    @NotNull
    private final String dexPath;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.o6e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/o6e$a;", "", "", "filePath", "a", "FUNCTION", "Ljava/lang/String;", "TAG", "<init>", "()V", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String a(@Nullable String filePath) {
            Object objM5287constructorimpl;
            if (filePath != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    File file = new File(filePath);
                    if (file.exists() && d4d.a(false) && !file.setReadOnly()) {
                        bs9.a.d(t6e.INSTANCE, o6e.TAG, "setReadOnly failed.dexPath=" + filePath, false, null, false, 0, false, null, 252, null);
                    }
                    objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
                if (thM5290exceptionOrNullimpl != null) {
                    bs9.a.e(t6e.INSTANCE, o6e.TAG, "setReadOnly fail " + thM5290exceptionOrNullimpl.getMessage(), false, null, false, 0, false, null, 252, null);
                }
                Result.m5286boximpl(objM5287constructorimpl);
            }
            return filePath;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6e(@NotNull String dexPath, @NotNull String filePath, @Nullable String str, @NotNull ClassLoader mHostClassLoader) {
        super(INSTANCE.a(dexPath), filePath, str, mHostClassLoader);
        Intrinsics.checkNotNullParameter(dexPath, "dexPath");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(mHostClassLoader, "mHostClassLoader");
        this.dexPath = dexPath;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    @NotNull
    public Class<?> findClass(@Nullable String name) throws ClassNotFoundException {
        Class<?> result = super.findClass(name);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    @Override // dalvik.system.BaseDexClassLoader
    @NotNull
    public String toString() {
        return super.toString() + "@" + hashCode();
    }
}
