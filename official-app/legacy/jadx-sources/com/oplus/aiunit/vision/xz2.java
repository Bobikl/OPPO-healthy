package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0006B)\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/xz2;", "Lcom/oplus/aiunit/vision/o6e;", "", "name", "Ljava/lang/Class;", "loadClass", "a", "Ljava/lang/String;", "dexPath", "Ljava/lang/ClassLoader;", "b", "Ljava/lang/ClassLoader;", "mHostClassLoader", "filePath", "nativeLibPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V", "Companion", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0})
public final class xz2 extends o6e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String dexPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ClassLoader mHostClassLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz2(@NotNull String dexPath, @NotNull String filePath, @Nullable String str, @NotNull ClassLoader mHostClassLoader) {
        super(dexPath, filePath, str, p6e.a(mHostClassLoader, 1));
        Intrinsics.checkNotNullParameter(dexPath, "dexPath");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(mHostClassLoader, "mHostClassLoader");
        this.dexPath = dexPath;
        this.mHostClassLoader = mHostClassLoader;
    }

    @Override // java.lang.ClassLoader
    @NotNull
    public Class<?> loadClass(@Nullable String name) throws ClassNotFoundException {
        o6e.INSTANCE.a(this.dexPath);
        if (!(name != null && StringsKt__StringsJVMKt.startsWith$default(name, o6e.FUNCTION, false, 2, null))) {
            if (!(name != null && StringsKt__StringsJVMKt.startsWith$default(name, "pantanal.app.", false, 2, null))) {
                if (!(name != null && StringsKt__StringsJVMKt.startsWith$default(name, "pantanal.decision.", false, 2, null))) {
                    if (!(name != null && StringsKt__StringsJVMKt.startsWith$default(name, "com.oplus.utrace.sdk.", false, 2, null))) {
                        Class<?> clsLoadClass = super.loadClass(name);
                        Intrinsics.checkNotNullExpressionValue(clsLoadClass, "{\n            val clazz …          clazz\n        }");
                        return clsLoadClass;
                    }
                }
            }
        }
        Class<?> clsLoadClass2 = this.mHostClassLoader.loadClass(name);
        Intrinsics.checkNotNullExpressionValue(clsLoadClass2, "{\n            val clazz …          clazz\n        }");
        return clsLoadClass2;
    }
}
