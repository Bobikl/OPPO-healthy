package com.heytap.accessory.pair.seeker.pairing.workers;

import com.alipay.sdk.m.x.d;
import com.heytap.accessory.pair.logging.PairLog;
import com.lifesense.android.bluetooth.scale.bean.WeightData_A3;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/heytap/accessory/pair/seeker/pairing/workers/FastPairSeekerFsm;", "", "(Ljava/lang/String;I)V", "enter", "", "worker", "Lcom/heytap/accessory/pair/seeker/pairing/workers/AbsWorker;", "onEntry", "", d.r, "IDLE", "EARLY_GATT", "EARLY_INITIALIZATION", "EARLY_WAIT", "GATT_CONNECTING", "INITIALIZATION", "KEY_BASED_PAIRING", "AUTHENTICATION", "PAIRING", "ACCOUNT_KEY", "KSC", "SUCCESS", WeightData_A3.IMPEDANCE_STATUS_ERROR, "Companion", "security_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum FastPairSeekerFsm {
    IDLE,
    EARLY_GATT { // from class: com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm.EARLY_GATT
        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onEntry(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onEntry(worker);
        }

        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onExit(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onExit(worker);
        }
    },
    EARLY_INITIALIZATION { // from class: com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm.EARLY_INITIALIZATION
        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onEntry(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onEntry(worker);
        }

        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onExit(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onExit(worker);
        }
    },
    EARLY_WAIT { // from class: com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm.EARLY_WAIT
        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onEntry(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onEntry(worker);
        }

        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onExit(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onExit(worker);
        }
    },
    GATT_CONNECTING { // from class: com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm.GATT_CONNECTING
        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onEntry(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onEntry(worker);
        }

        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onExit(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onExit(worker);
        }
    },
    INITIALIZATION { // from class: com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm.INITIALIZATION
        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onEntry(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onEntry(worker);
        }

        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onExit(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onExit(worker);
        }
    },
    KEY_BASED_PAIRING { // from class: com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm.KEY_BASED_PAIRING
        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onEntry(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onEntry(worker);
        }

        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onExit(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onExit(worker);
        }
    },
    AUTHENTICATION { // from class: com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm.AUTHENTICATION
        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onEntry(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onEntry(worker);
        }

        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onExit(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onExit(worker);
        }
    },
    PAIRING { // from class: com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm.PAIRING
        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onEntry(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onEntry(worker);
        }

        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onExit(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onExit(worker);
        }
    },
    ACCOUNT_KEY { // from class: com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm.ACCOUNT_KEY
        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onEntry(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onEntry(worker);
        }

        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onExit(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onExit(worker);
        }
    },
    KSC { // from class: com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm.KSC
        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onEntry(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onEntry(worker);
        }

        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onExit(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onExit(worker);
        }
    },
    SUCCESS,
    ERROR { // from class: com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm.ERROR
        @Override // com.heytap.accessory.pair.seeker.pairing.workers.FastPairSeekerFsm
        public void onEntry(@NotNull AbsWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            super.onEntry(worker);
        }
    };


    @NotNull
    private static final String TAG = "FastPairSeekerFsm";

    /* synthetic */ FastPairSeekerFsm(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean enter(@NotNull AbsWorker worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        FastPairSeekerFsm fsm = worker.getFsm();
        if (fsm == this) {
            PairLog.w(TAG, worker + ", enter failed, duplicate FastPairSeekerFsm: " + this);
            return false;
        }
        FastPairSeekerFsm fastPairSeekerFsm = ERROR;
        if (fsm != fastPairSeekerFsm) {
            if (fsm != null) {
                fsm.onExit(worker);
            }
            worker.setFsm(this);
            onEntry(worker);
            return true;
        }
        PairLog.w(TAG, worker.toString() + ", enter " + this + " failed, preFsm is " + fastPairSeekerFsm);
        return false;
    }

    public void onEntry(@NotNull AbsWorker worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        PairLog.i(TAG, worker + ", onEntry: " + this);
    }

    public void onExit(@NotNull AbsWorker worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        PairLog.i(TAG, worker + ", onExit: " + this);
    }
}
