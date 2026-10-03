package com.oplus.drs.core.upload.upload;

import android.content.Context;
import com.oplus.aiunit.vision.j38;
import com.oplus.aiunit.vision.naf;
import com.oplus.aiunit.vision.o6b;
import com.oplus.aiunit.vision.rzl;
import com.oplus.aiunit.vision.t56;
import com.oplus.aiunit.vision.v56;
import com.oplus.aiunit.vision.w56;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.base.ChannelMode;
import com.oplus.drs.base.util.Consumer;
import com.oplus.drs.core.ratelimit.QuotaCheckResult;
import com.oplus.drs.core.upload.gate.EnvRecoveryDetector;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes6.dex */
public final class UploadPipelineV2 {
    private static final String TAG = "UploadPipelineV2";
    private static volatile UploadPipelineV2 instance;
    private final ChannelMode channelMode;
    private final com.oplus.drs.core.upload.gate.a gateFacade;
    private final com.oplus.drs.core.upload.upload.b schedulingCoordinator;
    private final rzl workerRegistry;

    public class a implements Consumer<EnvRecoveryDetector.d> {
        public a() {
        }

        @Override // com.oplus.drs.base.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(EnvRecoveryDetector.d dVar) {
            UploadPipelineV2.this.onEnvRecovered(dVar);
        }
    }

    public class b implements com.oplus.drs.core.db.service.a.n {
        public b() {
        }

        @Override // com.oplus.drs.core.db.service.a.n
        public void a(int i) {
            UploadPipelineV2.this.onDataIngested(i);
        }
    }

    private UploadPipelineV2(Context context) {
        Context applicationContext = context.getApplicationContext();
        ChannelMode channelModeA = w56.a();
        this.channelMode = channelModeA;
        rzl rzlVar = new rzl();
        this.workerRegistry = rzlVar;
        com.oplus.drs.core.upload.gate.a aVarH = com.oplus.drs.core.upload.gate.a.h(applicationContext);
        this.gateFacade = aVarH;
        this.schedulingCoordinator = new com.oplus.drs.core.upload.upload.b(applicationContext, rzlVar, aVarH);
        com.oplus.drs.core.db.service.a.n nVarCreateIngestListener = createIngestListener();
        t56.ingestPipeline.i(nVarCreateIngestListener);
        v56.d(w56.h()).C(nVarCreateIngestListener);
        aVarH.c(new a());
        z6b.q(TAG, "UploadPipelineV2 initialized (V7), channelMode=" + channelModeA);
    }

    private com.oplus.drs.core.db.service.a.n createIngestListener() {
        return new b();
    }

    public static UploadPipelineV2 getInstance(Context context) {
        if (instance == null) {
            synchronized (UploadPipelineV2.class) {
                if (instance == null) {
                    instance = new UploadPipelineV2(context);
                }
            }
        }
        return instance;
    }

    private boolean isGlobalUploadQuotaBlocked() {
        QuotaCheckResult quotaCheckResultJ = t56.k().j(naf.GLOBAL_APP_ID, 1L);
        if (quotaCheckResultJ == null) {
            return false;
        }
        return !quotaCheckResultJ.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDataIngested(int i) {
        if (i == 2) {
            onRealtimeIngested();
        } else if (i == 1) {
            z6b.q(TAG, "onDataIngested: PSEUDO ignored (periodic scheduler only)");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onEnvRecovered(EnvRecoveryDetector.d dVar) {
        this.schedulingCoordinator.p(dVar);
    }

    private void onRealtimeIngested() {
        z6b.q(TAG, "onRealtimeIngested");
        if (isGlobalUploadQuotaBlocked()) {
            z6b.q(TAG, "onRealtimeIngested() SKIPPED by global upload quota");
        } else {
            this.schedulingCoordinator.r();
        }
    }

    public void debugForceNonRealtimeUpload() {
        z6b.q(TAG, "debugForceNonRealtimeUpload");
        this.schedulingCoordinator.A(ChannelType.NON_REALTIME);
    }

    public void debugForcePseudoUpload() {
        z6b.q(TAG, "debugForcePseudoUpload");
        this.schedulingCoordinator.A(ChannelType.PSEUDO);
    }

    public void debugForceRealtimeUpload() {
        z6b.q(TAG, "debugForceRealtimeUpload");
        this.schedulingCoordinator.A(ChannelType.REALTIME);
    }

    public String debugGetChannelStates() {
        return "ChannelStates (V7) {\n" + this.schedulingCoordinator.i() + "  GateFacade: " + this.gateFacade.l() + Weather.SEPARATOR + "  Scheduling: " + this.schedulingCoordinator.B() + Weather.SEPARATOR + "}";
    }

    public void debugResetAllPending() {
        z6b.u(TAG, "debugResetAllPending: FORCE RESETTING all channel pending states!");
        this.schedulingCoordinator.j();
        z6b.q(TAG, "debugResetAllPending: All pending states released.");
    }

    public ChannelMode getChannelMode() {
        return this.channelMode;
    }

    public void onHostAppBackgrounded() {
        if (this.channelMode != ChannelMode.STANDALONE) {
            return;
        }
        if (isGlobalUploadQuotaBlocked()) {
            z6b.q(TAG, "onHostAppBackgrounded SKIPPED by global upload quota");
            return;
        }
        j38 j38VarE = this.gateFacade.e(ChannelType.REALTIME);
        if (!j38VarE.c()) {
            z6b.q(TAG, "onHostAppBackgrounded: BACKGROUND_FLUSH");
            this.schedulingCoordinator.o();
        } else {
            z6b.q(TAG, "onHostAppBackgrounded ignored: " + j38VarE.b());
        }
    }

    public void trigger() {
        triggerNr();
        triggerPseudo();
    }

    public void triggerNr() {
        z6b.q(TAG, "triggerNr() called, channelMode=" + this.channelMode + ", gate=" + this.gateFacade.l());
        o6b.f().a();
        if (isGlobalUploadQuotaBlocked()) {
            z6b.q(TAG, "triggerNr() SKIPPED by global upload quota");
        } else {
            this.schedulingCoordinator.q(ChannelType.NON_REALTIME, ChannelTaskTriggerReason.NR_PERIODIC);
        }
    }

    public void triggerPseudo() {
        z6b.q(TAG, "triggerPseudo() called, gate=" + this.gateFacade.l());
        if (isGlobalUploadQuotaBlocked()) {
            z6b.q(TAG, "triggerPseudo() SKIPPED by global upload quota");
        } else {
            this.schedulingCoordinator.q(ChannelType.PSEUDO, ChannelTaskTriggerReason.PSEUDO_PERIODIC);
        }
    }

    public void triggerRealtimeFromRtWorker() {
        onRealtimeIngested();
    }

    public void triggerRealtimeOnAppStartup() {
        z6b.q(TAG, "triggerRealtimeOnAppStartup");
        if (isGlobalUploadQuotaBlocked()) {
            z6b.q(TAG, "triggerRealtimeOnAppStartup() SKIPPED by global upload quota");
        } else {
            this.schedulingCoordinator.n();
        }
    }
}
