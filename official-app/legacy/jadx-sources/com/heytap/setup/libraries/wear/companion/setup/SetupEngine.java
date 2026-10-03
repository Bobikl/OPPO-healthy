package com.heytap.setup.libraries.wear.companion.setup;

import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.lxg;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\u000f\u0013\u0014J\b\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH&J\u001c\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\fH&J\u0016\u0010\u0012\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H&¨\u0006\u0015"}, d2 = {"Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine;", "", "", "start", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$b;", "getCurrentStep", "", EngineConstant.REASON, "", "callErrorCallback", "c", "Lkotlin/Function1;", "", "onError", "b", "Lkotlin/Function0;", "onComplete", "a", "Status", "TransitionHint", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public interface SetupEngine {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$Status;", "", "(Ljava/lang/String;I)V", "NOT_STARTED", "IN_PROGRESS", "FINISHED", "ABORTED", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Status {
        NOT_STARTED,
        IN_PROGRESS,
        FINISHED,
        ABORTED
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$TransitionHint;", "", "(Ljava/lang/String;I)V", "FORWARD", "BACKWARD", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum TransitionHint {
        FORWARD,
        BACKWARD
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(SetupEngine setupEngine, String str, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: abort");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            setupEngine.c(str, z);
        }
    }

    /* JADX INFO: renamed from: com.heytap.setup.libraries.wear.companion.setup.SetupEngine$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/lxg$a;", "a", "Lcom/oplus/aiunit/vision/lxg$a;", "()Lcom/oplus/aiunit/vision/lxg$a;", "currentStep", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$TransitionHint;", "b", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$TransitionHint;", "c", "()Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$TransitionHint;", "transitionHint", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$Status;", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$Status;", "()Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$Status;", "status", "<init>", "(Lcom/oplus/aiunit/vision/lxg$a;Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$TransitionHint;Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$Status;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class SetupStepChange {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final lxg.SetupStepModel currentStep;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final TransitionHint transitionHint;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Status status;

        public SetupStepChange(@Nullable lxg.SetupStepModel setupStepModel, @NotNull TransitionHint transitionHint, @NotNull Status status) {
            Intrinsics.checkNotNullParameter(transitionHint, "transitionHint");
            Intrinsics.checkNotNullParameter(status, "status");
            this.currentStep = setupStepModel;
            this.transitionHint = transitionHint;
            this.status = status;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final lxg.SetupStepModel getCurrentStep() {
            return this.currentStep;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Status getStatus() {
            return this.status;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TransitionHint getTransitionHint() {
            return this.transitionHint;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetupStepChange)) {
                return false;
            }
            SetupStepChange setupStepChange = (SetupStepChange) other;
            return Intrinsics.areEqual(this.currentStep, setupStepChange.currentStep) && this.transitionHint == setupStepChange.transitionHint && this.status == setupStepChange.status;
        }

        public int hashCode() {
            lxg.SetupStepModel setupStepModel = this.currentStep;
            return ((((setupStepModel == null ? 0 : setupStepModel.hashCode()) * 31) + this.transitionHint.hashCode()) * 31) + this.status.hashCode();
        }

        @NotNull
        public String toString() {
            return "SetupStepChange(currentStep=" + this.currentStep + ", transitionHint=" + this.transitionHint + ", status=" + this.status + ")";
        }
    }

    @NotNull
    SetupEngine a(@NotNull Function0<Unit> onComplete);

    @NotNull
    SetupEngine b(@NotNull Function1<? super Throwable, Unit> onError);

    void c(@NotNull String reason, boolean callErrorCallback);

    @NotNull
    StateFlow<SetupStepChange> getCurrentStep();

    void start();
}
