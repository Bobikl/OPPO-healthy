package p010kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes11.dex */
public interface KotlinMetadataFinder {
    @Nullable
    InputStream findBuiltInsData(@NotNull FqName fqName);
}
