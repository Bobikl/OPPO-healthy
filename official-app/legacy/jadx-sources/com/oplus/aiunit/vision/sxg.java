package com.oplus.aiunit.vision;

import com.heytap.setup.libraries.wear.companion.setup.SetupEngine;
import com.heytap.setup.libraries.wear.companion.setup.SetupStep;
import com.heytap.speech.engine.constant.EngineConstant;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b8\u00109J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\u0010\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rH\u0016J\u0016\u0010\u0013\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\nJ\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0016\u0010-\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010,R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010,R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00100R$\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/oplus/aiunit/vision/sxg;", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine;", "", "f", "start", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$b;", "getCurrentStep", "", EngineConstant.REASON, "", "callErrorCallback", "c", "Lkotlin/Function1;", "", "onError", "b", "Lkotlin/Function0;", "onComplete", "a", MapSchema.FIELD_NAME_ENTRY, "i", b2n.g, "Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine$TransitionHint;", "hint", b2n.f, "d", "", "Lcom/oplus/aiunit/vision/lxg$a;", "Ljava/util/List;", "steps", "Ljava/lang/String;", "TAG", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupStep;", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupStep;", "currentStep", "Lcom/oplus/aiunit/vision/cqi;", "Lcom/oplus/aiunit/vision/cqi;", "currentStepCompletionProvider", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_lifecycleEventsFlow", "_currentStepFlow", "Z", "isStarted", "isFinished", "", "I", "currentStepIndex", "j", "Lkotlin/jvm/functions/Function1;", "onErrorCallback", MapSchema.FIELD_NAME_KEY, "Lkotlin/jvm/functions/Function0;", "onCompleteCallback", "<init>", "(Ljava/util/List;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSetupEngineImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetupEngineImpl.kt\ncom/heytap/setup/impl/internal/wear_companion/SetupEngineImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n766#2:239\n857#2,2:240\n533#2,6:242\n1855#2,2:248\n1855#2,2:250\n*S KotlinDebug\n*F\n+ 1 SetupEngineImpl.kt\ncom/heytap/setup/impl/internal/wear_companion/SetupEngineImpl\n*L\n75#1:239\n75#1:240,2\n84#1:242,6\n100#1:248,2\n214#1:250,2\n*E\n"})
public final class sxg implements SetupEngine {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<lxg.SetupStepModel> steps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SetupStep currentStep;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public cqi currentStepCompletionProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableStateFlow<Object> _lifecycleEventsFlow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final MutableStateFlow<SetupEngine.SetupStepChange> _currentStepFlow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isStarted;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isFinished;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int currentStepIndex;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Throwable, Unit> onErrorCallback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> onCompleteCallback;

    public sxg(@NotNull List<lxg.SetupStepModel> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.steps = steps;
        this.TAG = "HEngine";
        this._lifecycleEventsFlow = StateFlowKt.MutableStateFlow(null);
        this._currentStepFlow = StateFlowKt.MutableStateFlow(new SetupEngine.SetupStepChange(null, SetupEngine.TransitionHint.FORWARD, SetupEngine.Status.NOT_STARTED));
        this.currentStepIndex = -1;
    }

    @Override // com.heytap.setup.libraries.wear.companion.setup.SetupEngine
    @NotNull
    public SetupEngine a(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        this.onCompleteCallback = onComplete;
        return this;
    }

    @Override // com.heytap.setup.libraries.wear.companion.setup.SetupEngine
    @NotNull
    public SetupEngine b(@NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.onErrorCallback = onError;
        return this;
    }

    @Override // com.heytap.setup.libraries.wear.companion.setup.SetupEngine
    public void c(@NotNull String reason, boolean callErrorCallback) {
        Function1<? super Throwable, Unit> function1;
        Intrinsics.checkNotNullParameter(reason, "reason");
        a7b.b(this.TAG, "abort -> reason=" + reason + ", currentStepIndex=" + this.currentStepIndex + ", currentStep=" + this.currentStep);
        if (this.currentStepIndex < 0) {
            Function1<? super Throwable, Unit> function2 = this.onErrorCallback;
            if (function2 != null) {
                function2.invoke(new RuntimeException(reason));
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        cqi cqiVar = this.currentStepCompletionProvider;
        if (cqiVar != null) {
            cqiVar.b();
        }
        SetupStep setupStep = this.currentStep;
        if (setupStep != null) {
            setupStep.c();
        }
        Iterator<T> it = this.steps.iterator();
        while (it.hasNext()) {
            ((lxg.SetupStepModel) it.next()).getStep().b();
        }
        this._lifecycleEventsFlow.setValue(new Aborted(jCurrentTimeMillis));
        this._currentStepFlow.setValue(new SetupEngine.SetupStepChange(null, SetupEngine.TransitionHint.FORWARD, SetupEngine.Status.ABORTED));
        if (callErrorCallback && (function1 = this.onErrorCallback) != null) {
            function1.invoke(new RuntimeException(reason));
        }
        this.isFinished = true;
    }

    public final void d() {
        a7b.f(this.TAG, "engine done cleanup all step");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<T> it = this.steps.iterator();
        while (it.hasNext()) {
            ((lxg.SetupStepModel) it.next()).getStep().b();
        }
        this._lifecycleEventsFlow.setValue(new Finished(jCurrentTimeMillis));
        this._currentStepFlow.setValue(new SetupEngine.SetupStepChange(null, SetupEngine.TransitionHint.FORWARD, SetupEngine.Status.FINISHED));
        this.isFinished = true;
        Function0<Unit> function0 = this.onCompleteCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void e() {
        a7b.f(this.TAG, "finishCurrentStep -> " + this.currentStep);
        SetupStep setupStep = this.currentStep;
        if (setupStep != null) {
            setupStep.c();
        }
        h();
    }

    public final void f() {
    }

    public final boolean g(SetupEngine.TransitionHint hint) {
        SetupStep setupStep;
        try {
            lxg.SetupStepModel setupStepModel = this.steps.get(this.currentStepIndex);
            SetupStep step = setupStepModel.getStep();
            this.currentStep = step;
            Intrinsics.checkNotNull(step);
            if (!step.d()) {
                a7b.f(this.TAG, "moveStep -> " + this.currentStep + " not available, skip");
                return false;
            }
            a7b.f(this.TAG, "moveStep -> " + this.currentStep + ", hint=" + hint);
            this.currentStepCompletionProvider = new cqi(this);
            this._currentStepFlow.setValue(new SetupEngine.SetupStepChange(setupStepModel, hint, SetupEngine.Status.IN_PROGRESS));
            cqi cqiVar = this.currentStepCompletionProvider;
            if (cqiVar == null || (setupStep = this.currentStep) == null) {
                return true;
            }
            setupStep.a(cqiVar);
            return true;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            SetupEngine.a.a(this, message, false, 2, null);
            throw th;
        }
    }

    @Override // com.heytap.setup.libraries.wear.companion.setup.SetupEngine
    @NotNull
    public StateFlow<SetupEngine.SetupStepChange> getCurrentStep() {
        return FlowKt.asStateFlow(this._currentStepFlow);
    }

    public final void h() {
        int i = this.currentStepIndex + 1;
        this.currentStepIndex = i;
        a7b.f(this.TAG, "moveToNextStep -> index=" + i + ", totalSteps=" + this.steps.size());
        if (this.currentStepIndex >= this.steps.size()) {
            d();
        } else {
            if (g(SetupEngine.TransitionHint.FORWARD)) {
                return;
            }
            h();
        }
    }

    public final boolean i() {
        if (this.currentStepIndex <= 0) {
            return false;
        }
        cqi cqiVar = this.currentStepCompletionProvider;
        if (cqiVar != null) {
            cqiVar.b();
        }
        SetupStep setupStep = this.currentStep;
        if (setupStep != null) {
            setupStep.c();
        }
        this.currentStepIndex--;
        if (g(SetupEngine.TransitionHint.BACKWARD)) {
            return true;
        }
        i();
        return true;
    }

    @Override // com.heytap.setup.libraries.wear.companion.setup.SetupEngine
    public void start() {
        a7b.f(this.TAG, "start -> isStarted=" + this.isStarted + ", stepsCount=" + this.steps.size());
        if (this.isStarted) {
            IllegalStateException illegalStateException = new IllegalStateException("Setup flow already in progress");
            a7b.b(this.TAG, "start -> already started, throwing");
            Function1<? super Throwable, Unit> function1 = this.onErrorCallback;
            if (function1 == null) {
                throw illegalStateException;
            }
            function1.invoke(illegalStateException);
            throw illegalStateException;
        }
        this.isStarted = true;
        this._lifecycleEventsFlow.setValue(new Started(System.currentTimeMillis()));
        try {
            h();
        } catch (Throwable th) {
            a7b.b(this.TAG, "start -> moveToNextStep failed: " + th.getMessage());
            Function1<? super Throwable, Unit> function2 = this.onErrorCallback;
            if (function2 != null) {
                function2.invoke(th);
            }
            throw th;
        }
    }
}
