package io.netty.incubator.codec.quic;

import io.netty.channel.ChannelHandler;
import io.netty.incubator.codec.quic.QuicCodecBuilder;
import io.netty.util.internal.ObjectUtil;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class QuicCodecBuilder<B extends QuicCodecBuilder<B>> {
    private Long ackDelayExponent;
    private Long activeConnectionIdLimit;
    private String[] applicationProtocols;
    private QuicCongestionControlAlgorithm congestionControlAlgorithm;
    private Boolean disableActiveMigration;
    private Boolean earlyDataEnabled;
    private Boolean enableHystart;
    private FlushStrategy flushStrategy;
    private Boolean grease;
    private Long initialMaxData;
    private Long initialMaxStreamDataBidiLocal;
    private Long initialMaxStreamDataBidiRemote;
    private Long initialMaxStreamDataUni;
    private Long initialMaxStreamsBidi;
    private Long initialMaxStreamsUni;
    private Boolean keylogEnable;
    private int localConnIdLength;
    private Long maxAckDelay;
    private Long maxIdleTimeout;
    private Long maxRecvUdpPayloadSize;
    private Long maxSendUdpPayloadSize;
    private Integer recvQueueLen;
    private Integer sendQueueLen;
    private final boolean server;
    private Boolean verifyPeerEnable;
    int version;

    public QuicCodecBuilder(boolean z) {
        this.flushStrategy = FlushStrategy.DEFAULT;
        Quic.ensureAvailability();
        this.version = Quiche.QUICHE_PROTOCOL_VERSION;
        this.localConnIdLength = Quiche.QUICHE_MAX_CONN_ID_LEN;
        this.server = z;
    }

    private QuicheConfig createConfig() {
        return new QuicheConfig(this.version, this.grease, this.maxIdleTimeout, this.maxSendUdpPayloadSize, this.maxRecvUdpPayloadSize, this.initialMaxData, this.initialMaxStreamDataBidiLocal, this.initialMaxStreamDataBidiRemote, this.initialMaxStreamDataUni, this.initialMaxStreamsBidi, this.initialMaxStreamsUni, this.ackDelayExponent, this.maxAckDelay, this.disableActiveMigration, this.enableHystart, this.congestionControlAlgorithm, this.activeConnectionIdLimit, this.recvQueueLen, this.sendQueueLen, this.earlyDataEnabled, this.keylogEnable, this.verifyPeerEnable, this.applicationProtocols);
    }

    public final B ackDelayExponent(long j2) {
        this.ackDelayExponent = Long.valueOf(ObjectUtil.checkPositiveOrZero(j2, "value"));
        return (B) self();
    }

    public final B activeMigration(boolean z) {
        this.disableActiveMigration = Boolean.valueOf(!z);
        return (B) self();
    }

    public final B applicationProtocols(String... strArr) {
        this.applicationProtocols = (String[]) ObjectUtil.checkNotNull(strArr, "protos");
        return (B) self();
    }

    public final ChannelHandler build() {
        validate();
        QuicheConfig quicheConfigCreateConfig = createConfig();
        try {
            return build(quicheConfigCreateConfig, this.localConnIdLength, this.flushStrategy);
        } catch (Throwable th) {
            quicheConfigCreateConfig.free();
            throw th;
        }
    }

    public abstract ChannelHandler build(QuicheConfig quicheConfig, int i, FlushStrategy flushStrategy);

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract B mo5277clone();

    public final B congestionControlAlgorithm(QuicCongestionControlAlgorithm quicCongestionControlAlgorithm) {
        this.congestionControlAlgorithm = quicCongestionControlAlgorithm;
        return (B) self();
    }

    public final B datagram(int i, int i2) {
        ObjectUtil.checkPositive(i, "recvQueueLen");
        ObjectUtil.checkPositive(i2, "sendQueueLen");
        this.recvQueueLen = Integer.valueOf(i);
        this.sendQueueLen = Integer.valueOf(i2);
        return (B) self();
    }

    public final B flushStrategy(FlushStrategy flushStrategy) {
        Objects.requireNonNull(flushStrategy, "flushStrategy");
        this.flushStrategy = flushStrategy;
        return (B) self();
    }

    public final B grease(boolean z) {
        this.grease = Boolean.valueOf(z);
        return (B) self();
    }

    public final B hystart(boolean z) {
        this.enableHystart = Boolean.valueOf(z);
        return (B) self();
    }

    public final B initialActiveConnectionIdLimit(long j2) {
        this.activeConnectionIdLimit = Long.valueOf(ObjectUtil.checkPositiveOrZero(j2, "value"));
        return (B) self();
    }

    public final B initialMaxData(long j2) {
        this.initialMaxData = Long.valueOf(ObjectUtil.checkPositiveOrZero(j2, "value"));
        return (B) self();
    }

    public final B initialMaxStreamDataBidirectionalLocal(long j2) {
        this.initialMaxStreamDataBidiLocal = Long.valueOf(ObjectUtil.checkPositiveOrZero(j2, "value"));
        return (B) self();
    }

    public final B initialMaxStreamDataBidirectionalRemote(long j2) {
        this.initialMaxStreamDataBidiRemote = Long.valueOf(ObjectUtil.checkPositiveOrZero(j2, "value"));
        return (B) self();
    }

    public final B initialMaxStreamDataUnidirectional(long j2) {
        this.initialMaxStreamDataUni = Long.valueOf(ObjectUtil.checkPositiveOrZero(j2, "value"));
        return (B) self();
    }

    public final B initialMaxStreamsBidirectional(long j2) {
        this.initialMaxStreamsBidi = Long.valueOf(ObjectUtil.checkPositiveOrZero(j2, "value"));
        return (B) self();
    }

    public final B initialMaxStreamsUnidirectional(long j2) {
        this.initialMaxStreamsUni = Long.valueOf(ObjectUtil.checkPositiveOrZero(j2, "value"));
        return (B) self();
    }

    public final B localConnectionIdLength(int i) {
        this.localConnIdLength = ObjectUtil.checkInRange(i, 0, Quiche.QUICHE_MAX_CONN_ID_LEN, "value");
        return (B) self();
    }

    public final B maxAckDelay(long j2, TimeUnit timeUnit) {
        this.maxAckDelay = Long.valueOf(timeUnit.toMillis(ObjectUtil.checkPositiveOrZero(j2, "amount")));
        return (B) self();
    }

    public final B maxIdleTimeout(long j2, TimeUnit timeUnit) {
        this.maxIdleTimeout = Long.valueOf(timeUnit.toMillis(ObjectUtil.checkPositiveOrZero(j2, "amount")));
        return (B) self();
    }

    public final B maxRecvUdpPayloadSize(long j2) {
        this.maxRecvUdpPayloadSize = Long.valueOf(ObjectUtil.checkPositiveOrZero(j2, "value"));
        return (B) self();
    }

    public final B maxSendUdpPayloadSize(long j2) {
        this.maxSendUdpPayloadSize = Long.valueOf(ObjectUtil.checkPositiveOrZero(j2, "value"));
        return (B) self();
    }

    public final B quicContext(QuicContext quicContext) {
        this.earlyDataEnabled = Boolean.valueOf(quicContext.isEarlyDataEnable());
        this.keylogEnable = Boolean.valueOf(quicContext.isKeylogEnable());
        return (B) self();
    }

    public final B self() {
        return this;
    }

    public void validate() {
    }

    public final B verifyPeerEnable(boolean z) {
        this.verifyPeerEnable = Boolean.valueOf(z);
        return (B) self();
    }

    public final B version(int i) {
        this.version = i;
        return (B) self();
    }

    public QuicCodecBuilder(QuicCodecBuilder<B> quicCodecBuilder) {
        this.flushStrategy = FlushStrategy.DEFAULT;
        Quic.ensureAvailability();
        this.server = quicCodecBuilder.server;
        this.grease = quicCodecBuilder.grease;
        this.maxIdleTimeout = quicCodecBuilder.maxIdleTimeout;
        this.maxRecvUdpPayloadSize = quicCodecBuilder.maxRecvUdpPayloadSize;
        this.maxSendUdpPayloadSize = quicCodecBuilder.maxSendUdpPayloadSize;
        this.initialMaxData = quicCodecBuilder.initialMaxData;
        this.initialMaxStreamDataBidiLocal = quicCodecBuilder.initialMaxStreamDataBidiLocal;
        this.initialMaxStreamDataBidiRemote = quicCodecBuilder.initialMaxStreamDataBidiRemote;
        this.initialMaxStreamDataUni = quicCodecBuilder.initialMaxStreamDataUni;
        this.initialMaxStreamsBidi = quicCodecBuilder.initialMaxStreamsBidi;
        this.initialMaxStreamsUni = quicCodecBuilder.initialMaxStreamsUni;
        this.ackDelayExponent = quicCodecBuilder.ackDelayExponent;
        this.maxAckDelay = quicCodecBuilder.maxAckDelay;
        this.disableActiveMigration = quicCodecBuilder.disableActiveMigration;
        this.enableHystart = quicCodecBuilder.enableHystart;
        this.congestionControlAlgorithm = quicCodecBuilder.congestionControlAlgorithm;
        this.activeConnectionIdLimit = quicCodecBuilder.activeConnectionIdLimit;
        this.localConnIdLength = quicCodecBuilder.localConnIdLength;
        this.flushStrategy = quicCodecBuilder.flushStrategy;
        this.recvQueueLen = quicCodecBuilder.recvQueueLen;
        this.sendQueueLen = quicCodecBuilder.sendQueueLen;
        this.version = quicCodecBuilder.version;
        this.applicationProtocols = quicCodecBuilder.applicationProtocols;
        this.verifyPeerEnable = quicCodecBuilder.verifyPeerEnable;
    }
}
