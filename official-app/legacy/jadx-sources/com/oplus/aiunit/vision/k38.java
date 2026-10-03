package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.drs.core.upload.upload.ChannelType;
import java.util.EnumMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class k38 {
    public final EnumMap<ChannelType, AtomicReference<e73>> a = new EnumMap<>(ChannelType.class);
    public final l38 b;

    public class a implements e {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.k38.e
        public e73 a(e73 e73Var) {
            if (e73Var.b <= 0) {
                return null;
            }
            return e73Var.d();
        }
    }

    public class b implements e {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        @Override // com.oplus.aiunit.vision.k38.e
        public e73 a(e73 e73Var) {
            return e73Var.c(this.a);
        }
    }

    public class c implements e {
        public final /* synthetic */ long a;

        public c(long j2) {
            this.a = j2;
        }

        @Override // com.oplus.aiunit.vision.k38.e
        public e73 a(e73 e73Var) {
            return e73Var.e(this.a);
        }
    }

    public class d implements e {
        public final /* synthetic */ long a;

        public d(long j2) {
            this.a = j2;
        }

        @Override // com.oplus.aiunit.vision.k38.e
        public e73 a(e73 e73Var) {
            return e73Var.b(this.a);
        }
    }

    public interface e {
        e73 a(e73 e73Var);
    }

    public k38(@Nullable Context context) {
        this.b = new l38(context);
        for (ChannelType channelType : ChannelType.values()) {
            this.a.put(channelType, new AtomicReference<>(this.b.b(channelType)));
        }
        z6b.q("GateStateManager", "GateStateManager initialized: " + f());
    }

    @NonNull
    public e73 a(@NonNull ChannelType channelType) {
        return b(channelType).get();
    }

    @NonNull
    public final AtomicReference<e73> b(@NonNull ChannelType channelType) {
        AtomicReference<e73> atomicReference = this.a.get(channelType);
        if (atomicReference != null) {
            return atomicReference;
        }
        throw new IllegalArgumentException("Unknown channel type: " + channelType);
    }

    public void c(@NonNull ChannelType channelType) {
        h(channelType, new d(System.currentTimeMillis()));
        z6b.q("GateStateManager", "markAllUploaded[" + channelType + "]: all data uploaded, compensationRemain cleared to 0");
    }

    public void d(@NonNull ChannelType channelType) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        h(channelType, new c(jCurrentTimeMillis));
        z6b.q("GateStateManager", "markSuccess[" + channelType + "]: recorded at " + jCurrentTimeMillis + ", compensationRemain restored to 2");
    }

    public void e(@NonNull ChannelType channelType, int i) {
        h(channelType, new b(i));
        z6b.q("GateStateManager", "resetCompensationBudget[" + channelType + "]: budget=" + i);
    }

    @NonNull
    public String f() {
        StringBuilder sb = new StringBuilder("GateStateManager{");
        for (ChannelType channelType : ChannelType.values()) {
            sb.append("\n  ");
            sb.append(channelType);
            sb.append(": ");
            sb.append(a(channelType));
        }
        sb.append("\n}");
        return sb.toString();
    }

    public boolean g(@NonNull ChannelType channelType) {
        e73 e73VarA = a(channelType);
        boolean zH = h(channelType, new a());
        if (zH) {
            z6b.q("GateStateManager", "tryConsumeCompensationBudget[" + channelType + "]: SUCCESS, remain=" + a(channelType).b + "/2");
        } else {
            z6b.u("GateStateManager", "tryConsumeCompensationBudget[" + channelType + "]: BUDGET EXHAUSTED! compensationRemain=" + e73VarA.b + ", lastSuccessMs=" + e73VarA.a + ". Compensation blocked until next cycle trigger or ingest trigger (resetCompensationBudget).");
        }
        return zH;
    }

    public final boolean h(@NonNull ChannelType channelType, @NonNull e eVar) {
        AtomicReference<e73> atomicReferenceB = b(channelType);
        while (true) {
            e73 e73Var = atomicReferenceB.get();
            e73 e73VarA = eVar.a(e73Var);
            if (e73VarA == null) {
                return false;
            }
            if (fue.a(atomicReferenceB, e73Var, e73VarA)) {
                this.b.d(channelType, e73VarA);
                return true;
            }
            z6b.k("GateStateManager", "updateState[" + channelType + "]: CAS failed, retrying");
        }
    }
}
