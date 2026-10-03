package p010kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.name.ClassId;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaEnumValueAnnotationArgument extends JavaAnnotationArgument {
    @Nullable
    Name getEntryName();

    @Nullable
    ClassId getEnumClassId();
}
