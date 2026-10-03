package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.drs.core.upload.upload.ChannelType;

/* JADX INFO: loaded from: classes6.dex */
public final class l38 {
    public final opa a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ChannelType.values().length];
            a = iArr;
            try {
                iArr[ChannelType.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ChannelType.PSEUDO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ChannelType.NON_REALTIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l38(@Nullable Context context) {
        this.a = tpe.h(context == null ? w56.h() : context, "upload_gate_state");
        z6b.q("GateStateStore", "GateStateStore initialized");
    }

    @NonNull
    public final String a(@NonNull ChannelType channelType) {
        int i = a.a[channelType.ordinal()];
        if (i == 1) {
            return "rt";
        }
        if (i == 2) {
            return "pseudo";
        }
        if (i == 3) {
            return "nr";
        }
        throw new IllegalArgumentException("Unknown channel type: " + channelType);
    }

    @NonNull
    public e73 b(@NonNull ChannelType channelType) {
        String strA = a(channelType);
        try {
            e73 e73Var = new e73(this.a.getLong(strA + "_last_success_ms", 0L), this.a.getInt(strA + "_compensation_remain", 0));
            z6b.q("GateStateStore", "load[" + channelType + "]: " + e73Var);
            return e73Var;
        } catch (Throwable th) {
            z6b.u("GateStateStore", "load[" + channelType + "] failed: " + th.getMessage());
            return e73.a();
        }
    }

    public void c(@NonNull ChannelType channelType, @NonNull e73 e73Var) {
        String strA = a(channelType);
        try {
            this.a.putLong(strA + "_last_success_ms", e73Var.a);
            this.a.putInt(strA + "_compensation_remain", e73Var.b);
            z6b.k("GateStateStore", "persist[" + channelType + "]: " + e73Var);
        } catch (Throwable th) {
            z6b.u("GateStateStore", "persist[" + channelType + "] failed: " + th.getMessage());
        }
    }

    public void d(@NonNull ChannelType channelType, @NonNull e73 e73Var) {
        c(channelType, e73Var);
    }
}
