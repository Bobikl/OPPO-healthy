package p010kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public interface DeclaredMemberIndex {

    public static final class Empty implements DeclaredMemberIndex {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @Nullable
        public JavaField findFieldByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @Nullable
        public JavaRecordComponent findRecordComponentByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return null;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public Set<Name> getFieldNames() {
            return SetsKt__SetsKt.emptySet();
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public Set<Name> getMethodNames() {
            return SetsKt__SetsKt.emptySet();
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public Set<Name> getRecordComponentNames() {
            return SetsKt__SetsKt.emptySet();
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        public List<JavaMethod> findMethodsByName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @Nullable
    JavaField findFieldByName(@NotNull Name name);

    @NotNull
    Collection<JavaMethod> findMethodsByName(@NotNull Name name);

    @Nullable
    JavaRecordComponent findRecordComponentByName(@NotNull Name name);

    @NotNull
    Set<Name> getFieldNames();

    @NotNull
    Set<Name> getMethodNames();

    @NotNull
    Set<Name> getRecordComponentNames();
}
