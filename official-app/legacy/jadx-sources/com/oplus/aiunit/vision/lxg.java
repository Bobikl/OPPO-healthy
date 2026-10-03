package com.oplus.aiunit.vision;

import com.heytap.setup.libraries.wear.companion.setup.SetupEngine;
import com.heytap.setup.libraries.wear.companion.setup.SetupStep;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/lxg;", "", "Lcom/oplus/aiunit/vision/pxg;", "a", "Lcom/oplus/aiunit/vision/sxg;", "engine", "", "b", "(Lcom/oplus/aiunit/vision/sxg;)V", "Lcom/oplus/aiunit/vision/qxg;", "Lcom/oplus/aiunit/vision/qxg;", "builderFactory", "Lcom/oplus/aiunit/vision/sxg;", "currentEngine", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine;", "c", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_lastCreatedEngineFlow", "<init>", "(Lcom/oplus/aiunit/vision/qxg;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSetupApiImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetupApiImpl.kt\ncom/heytap/setup/impl/internal/wear_companion/SetupApiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class lxg {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final qxg builderFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public sxg currentEngine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableStateFlow<SetupEngine> _lastCreatedEngineFlow;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.lxg$a, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/lxg$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupStep;", "a", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupStep;", "()Lcom/heytap/setup/libraries/wear/companion/setup/SetupStep;", "step", "b", "Z", "()Z", "isPointOfNoReturn", "<init>", "(Lcom/heytap/setup/libraries/wear/companion/setup/SetupStep;Z)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class SetupStepModel {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final SetupStep step;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean isPointOfNoReturn;

        public SetupStepModel(@NotNull SetupStep step, boolean z) {
            Intrinsics.checkNotNullParameter(step, "step");
            this.step = step;
            this.isPointOfNoReturn = z;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final SetupStep getStep() {
            return this.step;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsPointOfNoReturn() {
            return this.isPointOfNoReturn;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetupStepModel)) {
                return false;
            }
            SetupStepModel setupStepModel = (SetupStepModel) other;
            return Intrinsics.areEqual(this.step, setupStepModel.step) && this.isPointOfNoReturn == setupStepModel.isPointOfNoReturn;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            int iHashCode = this.step.hashCode() * 31;
            boolean z = this.isPointOfNoReturn;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iHashCode + r1;
        }

        @NotNull
        public String toString() {
            return "SetupStepModel(step=" + this.step + ", isPointOfNoReturn=" + this.isPointOfNoReturn + ")";
        }
    }

    public lxg(@NotNull qxg builderFactory) {
        Intrinsics.checkNotNullParameter(builderFactory, "builderFactory");
        this.builderFactory = builderFactory;
        this._lastCreatedEngineFlow = StateFlowKt.MutableStateFlow(null);
    }

    @NotNull
    public pxg a() {
        return this.builderFactory.a(this);
    }

    public final void b(@NotNull sxg engine) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        this.currentEngine = engine;
        this._lastCreatedEngineFlow.setValue(engine);
    }
}
