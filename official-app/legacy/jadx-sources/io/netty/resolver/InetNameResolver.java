package io.netty.resolver;

import io.netty.util.concurrent.EventExecutor;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes10.dex */
public abstract class InetNameResolver extends SimpleNameResolver<InetAddress> {
    private volatile AddressResolver<InetSocketAddress> addressResolver;

    public InetNameResolver(EventExecutor eventExecutor) {
        super(eventExecutor);
    }

    public AddressResolver<InetSocketAddress> asAddressResolver() {
        AddressResolver<InetSocketAddress> inetSocketAddressResolver = this.addressResolver;
        if (inetSocketAddressResolver == null) {
            synchronized (this) {
                inetSocketAddressResolver = this.addressResolver;
                if (inetSocketAddressResolver == null) {
                    inetSocketAddressResolver = new InetSocketAddressResolver(executor(), this);
                    this.addressResolver = inetSocketAddressResolver;
                }
            }
        }
        return inetSocketAddressResolver;
    }
}
