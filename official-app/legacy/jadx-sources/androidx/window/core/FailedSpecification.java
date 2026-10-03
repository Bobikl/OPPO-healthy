package androidx.window.core;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B-\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000f\u0010\u001b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0017J/\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\b H\u0016R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Landroidx/window/core/FailedSpecification;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/window/core/SpecificationComputer;", "value", "tag", "", "message", "logger", "Landroidx/window/core/Logger;", "verificationMode", "Landroidx/window/core/VerificationMode;", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroidx/window/core/Logger;Landroidx/window/core/VerificationMode;)V", "exception", "Landroidx/window/core/WindowStrictModeException;", "getException", "()Landroidx/window/core/WindowStrictModeException;", "getLogger", "()Landroidx/window/core/Logger;", "getMessage", "()Ljava/lang/String;", "getTag", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getVerificationMode", "()Landroidx/window/core/VerificationMode;", "compute", "require", "condition", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpecificationComputer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecificationComputer.kt\nandroidx/window/core/FailedSpecification\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,174:1\n37#2,2:175\n*S KotlinDebug\n*F\n+ 1 SpecificationComputer.kt\nandroidx/window/core/FailedSpecification\n*L\n146#1:175,2\n*E\n"})
final class FailedSpecification<T> extends SpecificationComputer<T> {

    @NotNull
    private final WindowStrictModeException exception;

    @NotNull
    private final Logger logger;

    @NotNull
    private final String message;

    @NotNull
    private final String tag;

    @NotNull
    private final T value;

    @NotNull
    private final VerificationMode verificationMode;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationMode.values().length];
            try {
                iArr[VerificationMode.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationMode.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationMode.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FailedSpecification(@NotNull T value, @NotNull String tag, @NotNull String message, @NotNull Logger logger, @NotNull VerificationMode verificationMode) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.value = value;
        this.tag = tag;
        this.message = message;
        this.logger = logger;
        this.verificationMode = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(createMessage(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        windowStrictModeException.setStackTrace((StackTraceElement[]) ArraysKt___ArraysKt.drop(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.exception = windowStrictModeException;
    }

    @Override // androidx.window.core.SpecificationComputer
    @Nullable
    public T compute() throws WindowStrictModeException {
        int i = WhenMappings.$EnumSwitchMapping$0[this.verificationMode.ordinal()];
        if (i == 1) {
            throw this.exception;
        }
        if (i == 2) {
            this.logger.debug(this.tag, createMessage(this.value, this.message));
            return null;
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final WindowStrictModeException getException() {
        return this.exception;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final T getValue() {
        return this.value;
    }

    @NotNull
    public final VerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    @Override // androidx.window.core.SpecificationComputer
    @NotNull
    public SpecificationComputer<T> require(@NotNull String message, @NotNull Function1<? super T, Boolean> condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return this;
    }
}
