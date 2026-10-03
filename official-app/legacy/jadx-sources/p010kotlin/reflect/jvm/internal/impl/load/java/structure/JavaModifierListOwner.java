package p010kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaModifierListOwner extends JavaElement {
    @NotNull
    Visibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isStatic();
}
