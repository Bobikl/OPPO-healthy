package com.heytap.accessory.transport.transmit;

/* JADX INFO: loaded from: classes14.dex */
public class e implements b {
    public final long a;
    public final a b;

    public e(long j2, a aVar) {
        this.a = j2;
        this.b = aVar;
    }

    @Override // com.heytap.accessory.transport.transmit.b
    public void a() {
    }

    @Override // com.heytap.accessory.transport.transmit.b
    public boolean b() {
        return true;
    }

    @Override // com.heytap.accessory.transport.transmit.b
    public void a(int i) {
    }

    @Override // com.heytap.accessory.transport.transmit.b
    public void b(long j2, com.heytap.accessory.message.b bVar) {
        bVar.c().f().recycle();
        this.b.a(j2, this.a, true, bVar.i());
    }

    @Override // com.heytap.accessory.transport.transmit.b
    public void a(com.heytap.accessory.misc.utils.d.b bVar) {
    }

    @Override // com.heytap.accessory.transport.transmit.b
    public int a(long j2, com.heytap.accessory.message.b bVar) {
        return this.b.a(j2, this.a, bVar);
    }
}
