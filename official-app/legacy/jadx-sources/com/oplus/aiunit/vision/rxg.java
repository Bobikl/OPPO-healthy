package com.oplus.aiunit.vision;

import com.heytap.setup.libraries.wear.companion.setup.SetupEngine;
import com.heytap.setup.libraries.wear.companion.setup.SetupStep;
import com.heytap.setup.libraries.wear.companion.setup.StepType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0003\fB\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/rxg;", "Lcom/oplus/aiunit/vision/pxg;", "Lcom/oplus/aiunit/vision/pxg$a;", "a", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine;", jla.DEFAULT_BUILD_METHOD, "Lcom/heytap/setup/libraries/wear/companion/setup/StepType;", "afterStepType", "", "Lcom/oplus/aiunit/vision/rxg$a;", "stepModels", "", "b", "(Lcom/heytap/setup/libraries/wear/companion/setup/StepType;Ljava/util/List;)V", "Lcom/oplus/aiunit/vision/lxg$a;", "c", "Lcom/oplus/aiunit/vision/lxg;", "Lcom/oplus/aiunit/vision/lxg;", "setupApi", "", "", "Ljava/util/Map;", "stepsMap", "<init>", "(Lcom/oplus/aiunit/vision/lxg;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSetupEngineBuilderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetupEngineBuilderImpl.kt\ncom/heytap/setup/impl/internal/wear_companion/SetupEngineBuilderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n*S KotlinDebug\n*F\n+ 1 SetupEngineBuilderImpl.kt\ncom/heytap/setup/impl/internal/wear_companion/SetupEngineBuilderImpl\n*L\n45#1:104\n45#1:105,3\n*E\n"})
public final class rxg implements pxg {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final lxg setupApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<StepType, List<SetupStepModel>> stepsMap;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.rxg$a, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/rxg$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupStep;", "a", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupStep;", "()Lcom/heytap/setup/libraries/wear/companion/setup/SetupStep;", "step", "b", "Z", "()Z", "isPointOfNoReturn", "<init>", "(Lcom/heytap/setup/libraries/wear/companion/setup/SetupStep;Z)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
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

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/rxg$b;", "Lcom/oplus/aiunit/vision/pxg$a;", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupStep;", "setupStep", "", "isPointOfNoReturn", "c", "b", "Lcom/oplus/aiunit/vision/pxg;", "a", "Lcom/oplus/aiunit/vision/rxg;", "Lcom/oplus/aiunit/vision/rxg;", "builder", "Lcom/heytap/setup/libraries/wear/companion/setup/StepType;", "Lcom/heytap/setup/libraries/wear/companion/setup/StepType;", "afterStepType", "", "Lcom/oplus/aiunit/vision/rxg$a;", "Ljava/util/List;", "steps", "<init>", "(Lcom/oplus/aiunit/vision/rxg;Lcom/heytap/setup/libraries/wear/companion/setup/StepType;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements pxg.a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final rxg builder;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final StepType afterStepType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<SetupStepModel> steps;

        public b(@NotNull rxg builder, @NotNull StepType afterStepType) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            Intrinsics.checkNotNullParameter(afterStepType, "afterStepType");
            this.builder = builder;
            this.afterStepType = afterStepType;
            this.steps = new ArrayList();
        }

        @Override // com.oplus.aiunit.vision.pxg.a
        @NotNull
        public pxg a() {
            if (this.steps.isEmpty()) {
                throw new IllegalStateException("No SetupSteps have been added. Please add a SetupStep using step()");
            }
            this.builder.b(this.afterStepType, this.steps);
            return this.builder;
        }

        @Override // com.oplus.aiunit.vision.pxg.a
        @NotNull
        public pxg.a b(@NotNull SetupStep setupStep) {
            Intrinsics.checkNotNullParameter(setupStep, "setupStep");
            return c(setupStep, false);
        }

        @Override // com.oplus.aiunit.vision.pxg.a
        @NotNull
        public pxg.a c(@NotNull SetupStep setupStep, boolean isPointOfNoReturn) {
            Intrinsics.checkNotNullParameter(setupStep, "setupStep");
            this.steps.add(new SetupStepModel(setupStep, isPointOfNoReturn));
            return this;
        }
    }

    public rxg(@NotNull lxg setupApi) {
        Intrinsics.checkNotNullParameter(setupApi, "setupApi");
        this.setupApi = setupApi;
        this.stepsMap = new LinkedHashMap();
    }

    @Override // com.oplus.aiunit.vision.pxg
    @NotNull
    public pxg.a a() {
        return new b(this, StepType.NONE);
    }

    public final void b(@NotNull StepType afterStepType, @NotNull List<SetupStepModel> stepModels) {
        Intrinsics.checkNotNullParameter(afterStepType, "afterStepType");
        Intrinsics.checkNotNullParameter(stepModels, "stepModels");
        this.stepsMap.put(afterStepType, CollectionsKt___CollectionsKt.toMutableList((Collection) stepModels));
    }

    @Override // com.oplus.aiunit.vision.pxg
    @NotNull
    public SetupEngine build() {
        sxg sxgVar = new sxg(c());
        sxgVar.f();
        this.setupApi.b(sxgVar);
        return sxgVar;
    }

    public final List<lxg.SetupStepModel> c() {
        List<SetupStepModel> listFlatten = CollectionsKt__IterablesKt.flatten(this.stepsMap.values());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFlatten, 10));
        for (SetupStepModel setupStepModel : listFlatten) {
            arrayList.add(new lxg.SetupStepModel(setupStepModel.getStep(), setupStepModel.getIsPointOfNoReturn()));
        }
        return arrayList;
    }
}
