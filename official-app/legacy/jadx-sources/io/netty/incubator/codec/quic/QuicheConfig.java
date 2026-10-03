package io.netty.incubator.codec.quic;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes10.dex */
final class QuicheConfig {
    private long config;
    private final boolean isDatagramSupported;

    /* JADX INFO: renamed from: io.netty.incubator.codec.quic.QuicheConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$incubator$codec$quic$QuicCongestionControlAlgorithm;

        static {
            int[] iArr = new int[QuicCongestionControlAlgorithm.values().length];
            $SwitchMap$io$netty$incubator$codec$quic$QuicCongestionControlAlgorithm = iArr;
            try {
                iArr[QuicCongestionControlAlgorithm.RENO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$incubator$codec$quic$QuicCongestionControlAlgorithm[QuicCongestionControlAlgorithm.CUBIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public QuicheConfig(int i, Boolean bool, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Boolean bool2, Boolean bool3, QuicCongestionControlAlgorithm quicCongestionControlAlgorithm, Long l13, Integer num, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, String... strArr) {
        this.config = -1L;
        long jQuiche_config_new = Quiche.quiche_config_new(i);
        if (bool6 != null) {
            try {
                Quiche.quiche_config_verify_peer(jQuiche_config_new, bool6.booleanValue());
            } catch (Throwable th) {
                Quiche.quiche_config_free(jQuiche_config_new);
                throw th;
            }
        }
        if (bool5 != null) {
            Quiche.quiche_config_log_keys(jQuiche_config_new);
        }
        if (bool != null) {
            Quiche.quiche_config_grease(jQuiche_config_new, bool.booleanValue());
        }
        if (l2 != null) {
            Quiche.quiche_config_set_max_idle_timeout(jQuiche_config_new, l2.longValue());
        }
        if (l3 != null) {
            Quiche.quiche_config_set_max_send_udp_payload_size(jQuiche_config_new, l3.longValue());
        }
        if (l4 != null) {
            Quiche.quiche_config_set_max_recv_udp_payload_size(jQuiche_config_new, l4.longValue());
        }
        if (l5 != null) {
            Quiche.quiche_config_set_initial_max_data(jQuiche_config_new, l5.longValue());
        }
        if (l6 != null) {
            Quiche.quiche_config_set_initial_max_stream_data_bidi_local(jQuiche_config_new, l6.longValue());
        }
        if (l7 != null) {
            Quiche.quiche_config_set_initial_max_stream_data_bidi_remote(jQuiche_config_new, l7.longValue());
        }
        if (l8 != null) {
            Quiche.quiche_config_set_initial_max_stream_data_uni(jQuiche_config_new, l8.longValue());
        }
        if (l9 != null) {
            Quiche.quiche_config_set_initial_max_streams_bidi(jQuiche_config_new, l9.longValue());
        }
        if (l10 != null) {
            Quiche.quiche_config_set_initial_max_streams_uni(jQuiche_config_new, l10.longValue());
        }
        if (l11 != null) {
            Quiche.quiche_config_set_ack_delay_exponent(jQuiche_config_new, l11.longValue());
        }
        if (l12 != null) {
            Quiche.quiche_config_set_max_ack_delay(jQuiche_config_new, l12.longValue());
        }
        if (bool2 != null) {
            Quiche.quiche_config_set_disable_active_migration(jQuiche_config_new, bool2.booleanValue());
        }
        if (bool3 != null) {
            Quiche.quiche_config_enable_hystart(jQuiche_config_new, bool3.booleanValue());
        }
        if (quicCongestionControlAlgorithm != null) {
            int i2 = AnonymousClass1.$SwitchMap$io$netty$incubator$codec$quic$QuicCongestionControlAlgorithm[quicCongestionControlAlgorithm.ordinal()];
            if (i2 == 1) {
                Quiche.quiche_config_set_cc_algorithm(jQuiche_config_new, Quiche.QUICHE_CC_RENO);
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException("Unknown congestionControlAlgorithm: " + quicCongestionControlAlgorithm);
                }
                Quiche.quiche_config_set_cc_algorithm(jQuiche_config_new, Quiche.QUICHE_CC_CUBIC);
            }
        }
        if (num == null || num2 == null) {
            this.isDatagramSupported = false;
        } else {
            this.isDatagramSupported = true;
            Quiche.quiche_config_enable_dgram(jQuiche_config_new, true, num.intValue(), num2.intValue());
        }
        if (l13 != null) {
            Quiche.quiche_config_set_active_connection_id_limit(jQuiche_config_new, l13.longValue());
        }
        if (strArr.length > 0) {
            Quiche.quiche_config_set_application_protos(jQuiche_config_new, toWireFormat(strArr));
        }
        if (bool4 != null) {
            Quiche.quiche_config_enable_early_data(jQuiche_config_new);
        }
        this.config = jQuiche_config_new;
    }

    private static byte[] toWireFormat(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                for (String str : strArr) {
                    byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
                    byteArrayOutputStream.write(bytes.length);
                    byteArrayOutputStream.write(bytes);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void finalize() throws Throwable {
        try {
            free();
        } finally {
            super.finalize();
        }
    }

    public void free() {
        long j2 = this.config;
        if (j2 != -1) {
            try {
                Quiche.quiche_config_free(j2);
            } finally {
                this.config = -1L;
            }
        }
    }

    public boolean isDatagramSupported() {
        return this.isDatagramSupported;
    }

    public long nativeAddress() {
        return this.config;
    }
}
