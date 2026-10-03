package p010kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaConstructor extends JavaMember, JavaTypeParameterListOwner {
    @NotNull
    List<JavaValueParameter> getValueParameters();
}
