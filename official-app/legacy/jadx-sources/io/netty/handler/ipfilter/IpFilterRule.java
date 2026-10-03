package io.netty.handler.ipfilter;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes10.dex */
public interface IpFilterRule {
    boolean matches(InetSocketAddress inetSocketAddress);

    IpFilterRuleType ruleType();
}
