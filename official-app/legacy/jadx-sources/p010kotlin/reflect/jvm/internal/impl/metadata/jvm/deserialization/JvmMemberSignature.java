package p010kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class JvmMemberSignature {

    public static final class Field extends JvmMemberSignature {

        @NotNull
        private final String desc;

        @NotNull
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(@NotNull String name, @NotNull String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.name = name;
            this.desc = desc;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String asString() {
            return getName() + ':' + getDesc();
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final String component2() {
            return this.desc;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return Intrinsics.areEqual(this.name, field.name) && Intrinsics.areEqual(this.desc, field.desc);
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getDesc() {
            return this.desc;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.desc.hashCode();
        }
    }

    public static final class Method extends JvmMemberSignature {

        @NotNull
        private final String desc;

        @NotNull
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(@NotNull String name, @NotNull String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.name = name;
            this.desc = desc;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String asString() {
            return getName() + getDesc();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return Intrinsics.areEqual(this.name, method.name) && Intrinsics.areEqual(this.desc, method.desc);
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getDesc() {
            return this.desc;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.desc.hashCode();
        }
    }

    private JvmMemberSignature() {
    }

    public /* synthetic */ JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String asString();

    @NotNull
    public abstract String getDesc();

    @NotNull
    public abstract String getName();

    @NotNull
    public final String toString() {
        return asString();
    }
}
