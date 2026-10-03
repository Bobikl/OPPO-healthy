package io.netty.incubator.codec.quic;

import com.oplus.aiunit.vision.i6b;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.internal.ClassUtil;
import io.netty.util.internal.NativeLibraryLoader;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes10.dex */
public final class Quiche {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final short AF_INET;
    static final short AF_INET6;
    static final int IN6_ADDRESS_OFFSETOF_S6_ADDR;
    static final int IN_ADDRESS_OFFSETOF_S_ADDR;
    static final int QUICHE_CC_CUBIC;
    static final int QUICHE_CC_RENO;
    static final int QUICHE_ERR_BUFFER_TOO_SHORT;
    static final int QUICHE_ERR_CONGESTION_CONTROL;
    static final int QUICHE_ERR_CRYPTO_FAIL;
    static final int QUICHE_ERR_DONE;
    static final int QUICHE_ERR_FINAL_SIZE;
    static final int QUICHE_ERR_FLOW_CONTROL;
    static final int QUICHE_ERR_INVALID_FRAME;
    static final int QUICHE_ERR_INVALID_PACKET;
    static final int QUICHE_ERR_INVALID_STATE;
    static final int QUICHE_ERR_INVALID_STREAM_STATE;
    static final int QUICHE_ERR_INVALID_TRANSPORT_PARAM;
    static final int QUICHE_ERR_STREAM_LIMIT;
    static final int QUICHE_ERR_STREAM_RESET;
    static final int QUICHE_ERR_STREAM_STOPPED;
    static final int QUICHE_ERR_TLS_FAIL;
    static final int QUICHE_ERR_UNKNOWN_VERSION;
    static final int QUICHE_MAX_CONN_ID_LEN;
    static final int QUICHE_PROTOCOL_VERSION;
    static final int QUICHE_RECV_INFO_OFFSETOF_FROM;
    static final int QUICHE_RECV_INFO_OFFSETOF_FROM_LEN;
    static final int QUICHE_RECV_INFO_OFFSETOF_TO;
    static final int QUICHE_RECV_INFO_OFFSETOF_TO_LEN;
    static final int QUICHE_SEND_INFO_OFFSETOF_FROM;
    static final int QUICHE_SEND_INFO_OFFSETOF_FROM_LEN;
    static final int QUICHE_SEND_INFO_OFFSETOF_TO;
    static final int QUICHE_SEND_INFO_OFFSETOF_TO_LEN;
    static final int QUICHE_SHUTDOWN_READ;
    static final int QUICHE_SHUTDOWN_WRITE;
    static final int SIZEOF_QUICHE_RECV_INFO;
    static final int SIZEOF_QUICHE_SEND_INFO;
    static final int SIZEOF_SIZE_T;
    static final int SIZEOF_SOCKADDR_IN;
    static final int SIZEOF_SOCKADDR_IN6;
    static final int SIZEOF_SOCKADDR_STORAGE;
    static final int SIZEOF_SOCKLEN_T;
    static final int SOCKADDR_IN6_OFFSETOF_SIN6_ADDR;
    static final int SOCKADDR_IN6_OFFSETOF_SIN6_FAMILY;
    static final int SOCKADDR_IN6_OFFSETOF_SIN6_FLOWINFO;
    static final int SOCKADDR_IN6_OFFSETOF_SIN6_PORT;
    static final int SOCKADDR_IN6_OFFSETOF_SIN6_SCOPE_ID;
    static final int SOCKADDR_IN_OFFSETOF_SIN_ADDR;
    static final int SOCKADDR_IN_OFFSETOF_SIN_FAMILY;
    static final int SOCKADDR_IN_OFFSETOF_SIN_PORT;
    private static volatile boolean hasPreload = false;

    static {
        ClassUtil.tryLoadClasses(Quiche.class, byte[].class, String.class, QuicheLogger.class);
        try {
            quiche_version();
        } catch (UnsatisfiedLinkError unused) {
            loadNativeLibrary();
        }
        AF_INET = (short) QuicheNativeStaticallyReferencedJniMethods.afInet();
        AF_INET6 = (short) QuicheNativeStaticallyReferencedJniMethods.afInet6();
        SIZEOF_SOCKADDR_STORAGE = QuicheNativeStaticallyReferencedJniMethods.sizeofSockaddrStorage();
        SIZEOF_SOCKADDR_IN = QuicheNativeStaticallyReferencedJniMethods.sizeofSockaddrIn();
        SIZEOF_SOCKADDR_IN6 = QuicheNativeStaticallyReferencedJniMethods.sizeofSockaddrIn6();
        SOCKADDR_IN_OFFSETOF_SIN_FAMILY = QuicheNativeStaticallyReferencedJniMethods.sockaddrInOffsetofSinFamily();
        SOCKADDR_IN_OFFSETOF_SIN_PORT = QuicheNativeStaticallyReferencedJniMethods.sockaddrInOffsetofSinPort();
        SOCKADDR_IN_OFFSETOF_SIN_ADDR = QuicheNativeStaticallyReferencedJniMethods.sockaddrInOffsetofSinAddr();
        IN_ADDRESS_OFFSETOF_S_ADDR = QuicheNativeStaticallyReferencedJniMethods.inAddressOffsetofSAddr();
        SOCKADDR_IN6_OFFSETOF_SIN6_FAMILY = QuicheNativeStaticallyReferencedJniMethods.sockaddrIn6OffsetofSin6Family();
        SOCKADDR_IN6_OFFSETOF_SIN6_PORT = QuicheNativeStaticallyReferencedJniMethods.sockaddrIn6OffsetofSin6Port();
        SOCKADDR_IN6_OFFSETOF_SIN6_FLOWINFO = QuicheNativeStaticallyReferencedJniMethods.sockaddrIn6OffsetofSin6Flowinfo();
        SOCKADDR_IN6_OFFSETOF_SIN6_ADDR = QuicheNativeStaticallyReferencedJniMethods.sockaddrIn6OffsetofSin6Addr();
        SOCKADDR_IN6_OFFSETOF_SIN6_SCOPE_ID = QuicheNativeStaticallyReferencedJniMethods.sockaddrIn6OffsetofSin6ScopeId();
        IN6_ADDRESS_OFFSETOF_S6_ADDR = QuicheNativeStaticallyReferencedJniMethods.in6AddressOffsetofS6Addr();
        SIZEOF_SOCKLEN_T = QuicheNativeStaticallyReferencedJniMethods.sizeofSocklenT();
        SIZEOF_SIZE_T = QuicheNativeStaticallyReferencedJniMethods.sizeofSizeT();
        QUICHE_RECV_INFO_OFFSETOF_FROM = QuicheNativeStaticallyReferencedJniMethods.quicheRecvInfoOffsetofFrom();
        QUICHE_RECV_INFO_OFFSETOF_FROM_LEN = QuicheNativeStaticallyReferencedJniMethods.quicheRecvInfoOffsetofFromLen();
        QUICHE_RECV_INFO_OFFSETOF_TO = QuicheNativeStaticallyReferencedJniMethods.quicheRecvInfoOffsetofTo();
        QUICHE_RECV_INFO_OFFSETOF_TO_LEN = QuicheNativeStaticallyReferencedJniMethods.quicheRecvInfoOffsetofToLen();
        SIZEOF_QUICHE_RECV_INFO = QuicheNativeStaticallyReferencedJniMethods.sizeofQuicheRecvInfo();
        QUICHE_SEND_INFO_OFFSETOF_FROM = QuicheNativeStaticallyReferencedJniMethods.quicheSendInfoOffsetofFrom();
        QUICHE_SEND_INFO_OFFSETOF_FROM_LEN = QuicheNativeStaticallyReferencedJniMethods.quicheSendInfoOffsetofFromLen();
        QUICHE_SEND_INFO_OFFSETOF_TO = QuicheNativeStaticallyReferencedJniMethods.quicheSendInfoOffsetofTo();
        QUICHE_SEND_INFO_OFFSETOF_TO_LEN = QuicheNativeStaticallyReferencedJniMethods.quicheSendInfoOffsetofToLen();
        SIZEOF_QUICHE_SEND_INFO = QuicheNativeStaticallyReferencedJniMethods.sizeofQuicheSendInfo();
        QUICHE_PROTOCOL_VERSION = QuicheNativeStaticallyReferencedJniMethods.quiche_protocol_version();
        QUICHE_MAX_CONN_ID_LEN = QuicheNativeStaticallyReferencedJniMethods.quiche_max_conn_id_len();
        QUICHE_SHUTDOWN_READ = QuicheNativeStaticallyReferencedJniMethods.quiche_shutdown_read();
        QUICHE_SHUTDOWN_WRITE = QuicheNativeStaticallyReferencedJniMethods.quiche_shutdown_write();
        QUICHE_ERR_DONE = QuicheNativeStaticallyReferencedJniMethods.quiche_err_done();
        QUICHE_ERR_BUFFER_TOO_SHORT = QuicheNativeStaticallyReferencedJniMethods.quiche_err_buffer_too_short();
        QUICHE_ERR_UNKNOWN_VERSION = QuicheNativeStaticallyReferencedJniMethods.quiche_err_unknown_version();
        QUICHE_ERR_INVALID_FRAME = QuicheNativeStaticallyReferencedJniMethods.quiche_err_invalid_frame();
        QUICHE_ERR_INVALID_PACKET = QuicheNativeStaticallyReferencedJniMethods.quiche_err_invalid_packet();
        QUICHE_ERR_INVALID_STATE = QuicheNativeStaticallyReferencedJniMethods.quiche_err_invalid_state();
        QUICHE_ERR_INVALID_STREAM_STATE = QuicheNativeStaticallyReferencedJniMethods.quiche_err_invalid_stream_state();
        QUICHE_ERR_INVALID_TRANSPORT_PARAM = QuicheNativeStaticallyReferencedJniMethods.quiche_err_invalid_transport_param();
        QUICHE_ERR_CRYPTO_FAIL = QuicheNativeStaticallyReferencedJniMethods.quiche_err_crypto_fail();
        QUICHE_ERR_TLS_FAIL = QuicheNativeStaticallyReferencedJniMethods.quiche_err_tls_fail();
        QUICHE_ERR_FLOW_CONTROL = QuicheNativeStaticallyReferencedJniMethods.quiche_err_flow_control();
        QUICHE_ERR_STREAM_LIMIT = QuicheNativeStaticallyReferencedJniMethods.quiche_err_stream_limit();
        QUICHE_ERR_FINAL_SIZE = QuicheNativeStaticallyReferencedJniMethods.quiche_err_final_size();
        QUICHE_ERR_CONGESTION_CONTROL = QuicheNativeStaticallyReferencedJniMethods.quiche_err_congestion_control();
        QUICHE_ERR_STREAM_RESET = QuicheNativeStaticallyReferencedJniMethods.quiche_err_stream_reset();
        QUICHE_ERR_STREAM_STOPPED = QuicheNativeStaticallyReferencedJniMethods.quiche_err_stream_stopped();
        QUICHE_CC_RENO = QuicheNativeStaticallyReferencedJniMethods.quiche_cc_reno();
        QUICHE_CC_CUBIC = QuicheNativeStaticallyReferencedJniMethods.quiche_cc_cubic();
    }

    private Quiche() {
    }

    public static ByteBuf allocateNativeOrder(int i) {
        ByteBuf byteBufDirectBuffer = Unpooled.directBuffer(i);
        return PlatformDependent.BIG_ENDIAN_NATIVE_ORDER ? byteBufDirectBuffer : byteBufDirectBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    private static native long buffer_memory_address(ByteBuffer byteBuffer);

    public static void enable_debug_logging(boolean z, i6b i6bVar) {
        if (z) {
            quiche_enable_debug_logging(new QuicheLogger(i6bVar));
        }
    }

    private static void loadNativeLibrary() {
        ClassLoader classLoader = PlatformDependent.getClassLoader(Quiche.class);
        String str = "quiche";
        if (!PlatformDependent.isAndroid()) {
            str = "quiche_" + PlatformDependent.normalizedOs() + '_' + PlatformDependent.normalizedArch();
        }
        NativeLibraryLoader.load(str, classLoader);
    }

    public static long memoryAddress(ByteBuf byteBuf) {
        return byteBuf.hasMemoryAddress() ? byteBuf.memoryAddress() : buffer_memory_address(byteBuf.internalNioBuffer(byteBuf.readerIndex(), byteBuf.readableBytes()));
    }

    public static long memoryAddressWithPosition(ByteBuffer byteBuffer) {
        return memoryAddress(byteBuffer) + ((long) byteBuffer.position());
    }

    public static Exception newException(int i) {
        QuicError quicErrorValueOf = QuicError.valueOf(i);
        QuicException quicException = new QuicException(quicErrorValueOf);
        return i == QUICHE_ERR_CRYPTO_FAIL ? new SSLException(quicErrorValueOf.message(), quicException) : quicException;
    }

    public static native void quiche_config_enable_dgram(long j2, boolean z, int i, int i2);

    public static native void quiche_config_enable_early_data(long j2);

    public static native void quiche_config_enable_hystart(long j2, boolean z);

    public static native void quiche_config_free(long j2);

    public static native void quiche_config_grease(long j2, boolean z);

    public static native void quiche_config_log_keys(long j2);

    public static native long quiche_config_new(int i);

    public static native void quiche_config_set_ack_delay_exponent(long j2, long j3);

    public static native void quiche_config_set_active_connection_id_limit(long j2, long j3);

    public static native void quiche_config_set_application_protos(long j2, byte[] bArr);

    public static native void quiche_config_set_cc_algorithm(long j2, int i);

    public static native void quiche_config_set_disable_active_migration(long j2, boolean z);

    public static native void quiche_config_set_initial_max_data(long j2, long j3);

    public static native void quiche_config_set_initial_max_stream_data_bidi_local(long j2, long j3);

    public static native void quiche_config_set_initial_max_stream_data_bidi_remote(long j2, long j3);

    public static native void quiche_config_set_initial_max_stream_data_uni(long j2, long j3);

    public static native void quiche_config_set_initial_max_streams_bidi(long j2, long j3);

    public static native void quiche_config_set_initial_max_streams_uni(long j2, long j3);

    public static native void quiche_config_set_max_ack_delay(long j2, long j3);

    public static native void quiche_config_set_max_idle_timeout(long j2, long j3);

    public static native void quiche_config_set_max_recv_udp_payload_size(long j2, long j3);

    public static native void quiche_config_set_max_send_udp_payload_size(long j2, long j3);

    public static native void quiche_config_verify_peer(long j2, boolean z);

    public static native int quiche_conn_close(long j2, boolean z, long j3, long j4, int i);

    public static native byte[] quiche_conn_destination_id(long j2);

    public static native int quiche_conn_dgram_max_writable_len(long j2);

    public static native int quiche_conn_dgram_recv(long j2, long j3, int i);

    public static native int quiche_conn_dgram_recv_front_len(long j2);

    public static native int quiche_conn_dgram_send(long j2, long j3, int i);

    public static native boolean quiche_conn_early_data_accepted(long j2);

    public static native void quiche_conn_free(long j2);

    public static native int quiche_conn_get_early_data_reason(long j2);

    public static native byte[] quiche_conn_get_session(long j2);

    public static native boolean quiche_conn_is_closed(long j2);

    public static native boolean quiche_conn_is_established(long j2);

    public static native boolean quiche_conn_is_in_early_data(long j2);

    public static native boolean quiche_conn_is_timed_out(long j2);

    public static native int quiche_conn_new_recv(long j2, long[] jArr, int[] iArr, int i, long j3);

    public static native long quiche_conn_new_with_tls(long j2, int i, long j3, int i2, long j4, int i3, long j5, int i4, long j6, long j7, boolean z);

    public static native void quiche_conn_on_timeout(long j2);

    public static native long quiche_conn_peer_streams_left_bidi(long j2);

    public static native long quiche_conn_peer_streams_left_uni(long j2);

    public static native long quiche_conn_readable(long j2);

    public static native int quiche_conn_recv(long j2, long j3, int i, long j4);

    public static native int quiche_conn_send(long j2, long j3, int i, long j4);

    public static native boolean quiche_conn_session_reused(long j2);

    public static native boolean quiche_conn_set_keylog_path(long j2, String str);

    public static native boolean quiche_conn_set_qlog_path(long j2, String str, String str2, String str3);

    public static native int quiche_conn_set_session(long j2, byte[] bArr);

    public static native byte[] quiche_conn_source_id(long j2);

    public static native long[] quiche_conn_stats(long j2);

    public static native int quiche_conn_stream_capacity(long j2, long j3);

    public static native boolean quiche_conn_stream_finished(long j2, long j3);

    public static native int quiche_conn_stream_priority(long j2, long j3, byte b, boolean z);

    public static native int quiche_conn_stream_recv(long j2, long j3, long j4, int i, long j5);

    public static native int quiche_conn_stream_send(long j2, long j3, long j4, int i, boolean z);

    public static native int quiche_conn_stream_shutdown(long j2, long j3, int i, long j4);

    public static native long quiche_conn_timeout_as_nanos(long j2);

    public static native byte[] quiche_conn_trace_id(long j2);

    public static native long quiche_conn_writable(long j2);

    public static native long quiche_connect(String str, long j2, int i, long j3, int i2, long j4, int i3, long j5);

    private static native void quiche_enable_debug_logging(QuicheLogger quicheLogger);

    public static native int quiche_header_info(long j2, int i, int i2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10);

    public static native int quiche_negotiate_version(long j2, int i, long j3, int i2, long j4, int i3);

    public static void quiche_preload() {
        if (hasPreload) {
            return;
        }
        hasPreload = true;
    }

    public static native int quiche_retry(long j2, int i, long j3, int i2, long j4, int i3, long j5, int i4, int i5, long j6, int i6);

    public static native void quiche_stream_iter_free(long j2);

    public static native int quiche_stream_iter_next(long j2, long[] jArr);

    public static native String quiche_version();

    public static native boolean quiche_version_is_supported(int i);

    public static native int sockaddr_cmp(long j2, long j3);

    public static boolean throwIfError(int i) throws Exception {
        if (i >= 0) {
            return false;
        }
        if (i == QUICHE_ERR_DONE) {
            return true;
        }
        throw newException(i);
    }

    public static long memoryAddress(ByteBuffer byteBuffer) {
        return buffer_memory_address(byteBuffer);
    }
}
