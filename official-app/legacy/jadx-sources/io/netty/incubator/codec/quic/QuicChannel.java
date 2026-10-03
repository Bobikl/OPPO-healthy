package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelProgressivePromise;
import io.netty.channel.ChannelPromise;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.Promise;
import java.net.SocketAddress;

/* JADX INFO: loaded from: classes10.dex */
public interface QuicChannel extends Channel {
    static QuicChannelBootstrap newBootstrap(Channel channel) {
        return new QuicChannelBootstrap(channel);
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture bind(SocketAddress socketAddress) {
        return pipeline().bind(socketAddress);
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture close() {
        return pipeline().close();
    }

    ChannelFuture close(boolean z, int i, ByteBuf byteBuf, ChannelPromise channelPromise);

    default Future<QuicConnectionStats> collectStats() {
        return collectStats(eventLoop().newPromise());
    }

    Future<QuicConnectionStats> collectStats(Promise<QuicConnectionStats> promise);

    @Override // io.netty.channel.Channel
    QuicChannelConfig config();

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture connect(SocketAddress socketAddress) {
        return pipeline().connect(socketAddress);
    }

    EventListener createEventListener(EventListener.Factory factory);

    default Future<QuicStreamChannel> createStream(QuicStreamType quicStreamType, ChannelHandler channelHandler) {
        return createStream(quicStreamType, channelHandler, eventLoop().newPromise());
    }

    Future<QuicStreamChannel> createStream(QuicStreamType quicStreamType, ChannelHandler channelHandler, Promise<QuicStreamChannel> promise);

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture deregister() {
        return pipeline().deregister();
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture disconnect() {
        return pipeline().disconnect();
    }

    @Override // io.netty.channel.Channel, io.netty.channel.ChannelOutboundInvoker
    QuicChannel flush();

    EventListener getEventListener();

    QuicConnectionStats getQuicheQuicConnectionStats();

    boolean isTimedOut();

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture newFailedFuture(Throwable th) {
        return pipeline().newFailedFuture(th);
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelProgressivePromise newProgressivePromise() {
        return pipeline().newProgressivePromise();
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelPromise newPromise() {
        return pipeline().newPromise();
    }

    default QuicStreamChannelBootstrap newStreamBootstrap() {
        return new QuicStreamChannelBootstrap(this);
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture newSucceededFuture() {
        return pipeline().newSucceededFuture();
    }

    long peerAllowedStreams(QuicStreamType quicStreamType);

    @Override // io.netty.channel.Channel, io.netty.channel.ChannelOutboundInvoker
    QuicChannel read();

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelPromise voidPromise() {
        return pipeline().voidPromise();
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture write(Object obj) {
        return pipeline().write(obj);
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture writeAndFlush(Object obj, ChannelPromise channelPromise) {
        return pipeline().writeAndFlush(obj, channelPromise);
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture bind(SocketAddress socketAddress, ChannelPromise channelPromise) {
        return pipeline().bind(socketAddress, channelPromise);
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture close(ChannelPromise channelPromise) {
        return pipeline().close(channelPromise);
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture connect(SocketAddress socketAddress, SocketAddress socketAddress2) {
        return pipeline().connect(socketAddress, socketAddress2);
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture deregister(ChannelPromise channelPromise) {
        return pipeline().deregister(channelPromise);
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture disconnect(ChannelPromise channelPromise) {
        return pipeline().disconnect(channelPromise);
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture write(Object obj, ChannelPromise channelPromise) {
        return pipeline().write(obj, channelPromise);
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture writeAndFlush(Object obj) {
        return pipeline().writeAndFlush(obj);
    }

    default ChannelFuture close(boolean z, int i, ByteBuf byteBuf) {
        return close(z, i, byteBuf, newPromise());
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture connect(SocketAddress socketAddress, ChannelPromise channelPromise) {
        return pipeline().connect(socketAddress, channelPromise);
    }

    @Override // io.netty.channel.ChannelOutboundInvoker
    default ChannelFuture connect(SocketAddress socketAddress, SocketAddress socketAddress2, ChannelPromise channelPromise) {
        return pipeline().connect(socketAddress, socketAddress2, channelPromise);
    }
}
