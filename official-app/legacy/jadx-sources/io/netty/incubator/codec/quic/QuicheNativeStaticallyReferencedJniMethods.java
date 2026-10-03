package io.netty.incubator.codec.quic;

/* JADX INFO: loaded from: classes10.dex */
final class QuicheNativeStaticallyReferencedJniMethods {
    private QuicheNativeStaticallyReferencedJniMethods() {
    }

    public static native int afInet();

    public static native int afInet6();

    public static native int in6AddressOffsetofS6Addr();

    public static native int inAddressOffsetofSAddr();

    public static native int quicheRecvInfoOffsetofFrom();

    public static native int quicheRecvInfoOffsetofFromLen();

    public static native int quicheRecvInfoOffsetofTo();

    public static native int quicheRecvInfoOffsetofToLen();

    public static native int quicheSendInfoOffsetofFrom();

    public static native int quicheSendInfoOffsetofFromLen();

    public static native int quicheSendInfoOffsetofTo();

    public static native int quicheSendInfoOffsetofToLen();

    public static native int quiche_cc_cubic();

    public static native int quiche_cc_reno();

    public static native int quiche_err_buffer_too_short();

    public static native int quiche_err_congestion_control();

    public static native int quiche_err_crypto_fail();

    public static native int quiche_err_done();

    public static native int quiche_err_final_size();

    public static native int quiche_err_flow_control();

    public static native int quiche_err_invalid_frame();

    public static native int quiche_err_invalid_packet();

    public static native int quiche_err_invalid_state();

    public static native int quiche_err_invalid_stream_state();

    public static native int quiche_err_invalid_transport_param();

    public static native int quiche_err_stream_limit();

    public static native int quiche_err_stream_reset();

    public static native int quiche_err_stream_stopped();

    public static native int quiche_err_tls_fail();

    public static native int quiche_err_unknown_version();

    public static native int quiche_max_conn_id_len();

    public static native int quiche_protocol_version();

    public static native int quiche_shutdown_read();

    public static native int quiche_shutdown_write();

    public static native int sizeofQuicheRecvInfo();

    public static native int sizeofQuicheSendInfo();

    public static native int sizeofSizeT();

    public static native int sizeofSockaddrIn();

    public static native int sizeofSockaddrIn6();

    public static native int sizeofSockaddrStorage();

    public static native int sizeofSocklenT();

    public static native int sockaddrIn6OffsetofSin6Addr();

    public static native int sockaddrIn6OffsetofSin6Family();

    public static native int sockaddrIn6OffsetofSin6Flowinfo();

    public static native int sockaddrIn6OffsetofSin6Port();

    public static native int sockaddrIn6OffsetofSin6ScopeId();

    public static native int sockaddrInOffsetofSinAddr();

    public static native int sockaddrInOffsetofSinFamily();

    public static native int sockaddrInOffsetofSinPort();
}
