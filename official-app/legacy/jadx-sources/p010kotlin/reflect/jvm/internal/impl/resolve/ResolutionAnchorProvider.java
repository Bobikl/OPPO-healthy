package p010kotlin.reflect.jvm.internal.impl.resolve;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public interface ResolutionAnchorProvider {
    @Nullable
    ModuleDescriptor getResolutionAnchor(@NotNull ModuleDescriptor moduleDescriptor);
}
