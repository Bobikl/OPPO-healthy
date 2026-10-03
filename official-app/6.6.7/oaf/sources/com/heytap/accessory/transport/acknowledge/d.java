package com.heytap.accessory.transport.acknowledge;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class d implements a {
    public final long a;
    public final b b;

    public d(long j, b bVar) {
        this.a = j;
        this.b = bVar;
    }

    @Override // com.heytap.accessory.transport.acknowledge.a
    public void a(int i) {
    }

    @Override // com.heytap.accessory.transport.acknowledge.a
    public boolean b() {
        return false;
    }

    @Override // com.heytap.accessory.transport.acknowledge.a
    public void a(com.heytap.accessory.misc.utils.d.b bVar) {
        this.b.a(this.a, bVar.g, bVar.c, bVar.e);
    }

    @Override // com.heytap.accessory.transport.acknowledge.a
    public void a() {
        this.b.a();
    }
}
