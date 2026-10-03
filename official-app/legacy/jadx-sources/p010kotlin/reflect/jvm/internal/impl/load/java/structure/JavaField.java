package p010kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaField extends JavaMember {
    boolean getHasConstantNotNullInitializer();

    @NotNull
    JavaType getType();

    boolean isEnumEntry();
}
