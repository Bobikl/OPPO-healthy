package com.oplus.aiunit.vision;

import com.heytap.common.Event;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J3\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/pu5;", "Lcom/oplus/aiunit/vision/dt9;", "Lcom/oplus/aiunit/vision/zn9;", "dispatcher", "", "d", "", "c", "Lcom/oplus/aiunit/vision/zn9$a;", "chain", "Lcom/oplus/aiunit/vision/yx5;", "a", "Lcom/heytap/common/Event;", "event", "Lcom/oplus/aiunit/vision/hn9;", "call", "", "", "obj", "b", "(Lcom/heytap/common/Event;Lcom/oplus/aiunit/vision/hn9;[Ljava/lang/Object;)V", "", "Ljava/lang/String;", "TAG", "", "Ljava/util/List;", "eventModules", "Lcom/oplus/aiunit/vision/r7b;", "Lcom/oplus/aiunit/vision/r7b;", "logger", "<init>", "(Lcom/oplus/aiunit/vision/r7b;)V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class pu5 implements dt9, zn9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String TAG = "Event Dispatcher";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public List<dt9> eventModules = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final r7b logger;

    public pu5(@Nullable r7b r7bVar) {
        this.logger = r7bVar;
    }

    @Override // com.oplus.aiunit.vision.zn9
    @NotNull
    public yx5 a(@NotNull zn9.a chain) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.a(chain.getDomainUnit());
    }

    @Override // com.oplus.aiunit.vision.dt9
    public void b(@NotNull Event event, @NotNull hn9 call, @NotNull Object... obj) {
        String hostAddress;
        r7b r7bVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(obj, "obj");
        int i = lu5.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            if ((obj.length == 0) || obj.length < 2) {
                return;
            }
        } else if (i == 2) {
            if (obj.length == 0) {
                return;
            }
            Object obj2 = obj[0];
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
            }
            RequestAttachInfo requestAttachInfo = (RequestAttachInfo) call.a(RequestAttachInfo.class);
            InetAddress address = ((InetSocketAddress) obj2).getAddress();
            if (address == null || (hostAddress = address.getHostAddress()) == null) {
                hostAddress = "";
            }
            if (requestAttachInfo != null) {
                requestAttachInfo.n(hostAddress);
            }
            r7b r7bVar2 = this.logger;
            if (r7bVar2 != null) {
                r7b.b(r7bVar2, this.TAG, "connect start: " + hostAddress, null, null, 12, null);
            }
        } else if (i == 3) {
            r7b r7bVar3 = this.logger;
            if (r7bVar3 != null) {
                r7b.b(r7bVar3, this.TAG, "dns start", null, null, 12, null);
            }
        } else if (i == 4) {
            if (obj.length == 0) {
                return;
            }
            Object obj3 = obj[0];
            if (!(obj3 instanceof InetSocketAddress)) {
                return;
            }
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
            }
            RequestAttachInfo requestAttachInfo2 = (RequestAttachInfo) call.a(RequestAttachInfo.class);
            InetAddress address2 = ((InetSocketAddress) obj3).getAddress();
            String strC = j35.c(address2 != null ? address2.getHostAddress() : null);
            if (requestAttachInfo2 != null) {
                requestAttachInfo2.n(strC);
            }
            r7b r7bVar4 = this.logger;
            if (r7bVar4 != null) {
                r7b.b(r7bVar4, this.TAG, "connect acquired " + strC, null, null, 12, null);
            }
        } else if (i == 5 && (r7bVar = this.logger) != null) {
            r7b.b(r7bVar, this.TAG, "connection failed", null, null, 12, null);
        }
        Iterator<dt9> it = this.eventModules.iterator();
        while (it.hasNext()) {
            it.next().b(event, call, Arrays.copyOf(obj, obj.length));
        }
    }

    @NotNull
    public final List<zn9> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (dt9 dt9Var : this.eventModules) {
            if (dt9Var instanceof zn9) {
                arrayList.add((zn9) dt9Var);
            }
        }
        return arrayList;
    }

    public final void d(@NotNull dt9 dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        if (!this.eventModules.contains(dispatcher)) {
            this.eventModules.add(dispatcher);
        }
        r7b r7bVar = this.logger;
        if (r7bVar != null) {
            r7b.b(r7bVar, this.TAG, "on Module " + dispatcher + " registered ...", null, null, 12, null);
        }
    }
}
