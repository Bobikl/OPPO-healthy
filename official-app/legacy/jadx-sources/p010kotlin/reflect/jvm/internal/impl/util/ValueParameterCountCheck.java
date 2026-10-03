package p010kotlin.reflect.jvm.internal.impl.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ValueParameterCountCheck implements Check {

    @NotNull
    private final String description;

    public static final class AtLeast extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f20701n;

        public AtLeast(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("must have at least ");
            sb.append(i);
            sb.append(" value parameter");
            sb.append(i > 1 ? "s" : "");
            super(sb.toString(), null);
            this.f20701n = i;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() >= this.f20701n;
        }
    }

    public static final class Equals extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f20702n;

        public Equals(int i) {
            super("must have exactly " + i + " value parameters", null);
            this.f20702n = i;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == this.f20702n;
        }
    }

    public static final class NoValueParameters extends ValueParameterCountCheck {

        @NotNull
        public static final NoValueParameters INSTANCE = new NoValueParameters();

        private NoValueParameters() {
            super("must have no value parameters", null);
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().isEmpty();
        }
    }

    public static final class SingleValueParameter extends ValueParameterCountCheck {

        @NotNull
        public static final SingleValueParameter INSTANCE = new SingleValueParameter();

        private SingleValueParameter() {
            super("must have a single value parameter", null);
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.getValueParameters().size() == 1;
        }
    }

    public /* synthetic */ ValueParameterCountCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.description;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    private ValueParameterCountCheck(String str) {
        this.description = str;
    }
}
