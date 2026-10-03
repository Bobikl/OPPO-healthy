package com.heytap.accessory.transport.credit;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class d extends com.heytap.accessory.transport.credit.a {
    public static final String c = "d";
    public int a;
    public a b;

    public static class a {
        public long b;
        public long c;
        public int a = 0;
        public int d = 0;

        public a(int i, int i2) {
            if (i == 1) {
                this.b = 17825792L;
                this.c = 17825792L;
            } else if (i == 2) {
                this.b = 3565158L;
                this.c = 3565158L;
            } else if (i != 4) {
                this.b = 0L;
                this.c = 0L;
            } else {
                this.b = 10240L;
                this.c = 10240L;
            }
        }
    }

    public d(int i, int i2) {
        this.a = i2;
        this.b = new a(i, i2);
    }

    @Override // com.heytap.accessory.transport.credit.a
    public synchronized boolean a(int i, int i2, int i3, boolean z) {
        a aVar = this.b;
        if (aVar.b <= 0) {
            return false;
        }
        if (z) {
            aVar.a++;
            com.heytap.accessory.base.logging.a.c(c, "incrementSessionCount -  connectivity : " + i + " classType : " + i2 + " sessionCount : " + this.b.a + " , channelType " + this.a);
        }
        a aVar2 = this.b;
        aVar2.b -= (long) i3;
        aVar2.d += i3;
        return true;
    }

    @Override // com.heytap.accessory.transport.credit.a
    public synchronized boolean a(int i, int i2, int i3) {
        a aVar = this.b;
        aVar.b += (long) i3;
        aVar.d = Math.max(aVar.d - i3, 0);
        return true;
    }

    @Override // com.heytap.accessory.transport.credit.a
    public synchronized boolean a(int i, int i2) {
        a aVar = this.b;
        int i3 = aVar.a;
        if (i3 <= 0) {
            return false;
        }
        aVar.a = i3 - 1;
        return true;
    }

    @Override // com.heytap.accessory.transport.credit.a
    public synchronized void a(int i) {
        a aVar = this.b;
        aVar.b = aVar.c;
        aVar.d = 0;
    }
}
