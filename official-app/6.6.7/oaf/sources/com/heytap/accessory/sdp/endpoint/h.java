package com.heytap.accessory.sdp.endpoint;

import com.heytap.accessory.utils.buffer.Buffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface h {

    public static class a {
        public long a;
        public Buffer b;

        public a(long j, Buffer buffer) {
            this.a = j;
            this.b = buffer;
        }
    }

    int a(long j, Buffer buffer);

    void a(long j, int i, int i2);

    void a(com.heytap.accessory.base.bean.b bVar);

    void a(com.heytap.accessory.message.b bVar);

    boolean a();

    com.heytap.accessory.base.bean.b b();

    void b(com.heytap.accessory.base.bean.b bVar);

    void c();
}
