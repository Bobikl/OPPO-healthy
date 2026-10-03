package com.heytap.accessory.session.params;

import com.heytap.accessory.utils.buffer.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public int a;
    public Buffer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<C0262a> f2710c = new ArrayList();
    public List<Long> d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2711e;
    public byte f;
    public int g;
    public byte[] h;
    public byte i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f2712j;

    /* JADX INFO: renamed from: com.heytap.accessory.session.params.a$a, reason: collision with other inner class name */
    public static class C0262a {
        public int a;
        public byte b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C0263a f2713c = new C0263a();

        /* JADX INFO: renamed from: com.heytap.accessory.session.params.a$a$a, reason: collision with other inner class name */
        public static final class C0263a {
            public byte a;
            public byte b;

            public String toString() {
                return "QosParams{classType=" + ((int) this.a) + ", type=" + ((int) this.b) + '}';
            }
        }

        public String toString() {
            return "ChannelRecord{channelId=" + this.a + ", payloadType=" + ((int) this.b) + ", qosParams=" + this.f2713c + '}';
        }
    }

    public List<Integer> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<C0262a> it = this.f2710c.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().a));
        }
        return arrayList;
    }

    public String toString() {
        return "ProtocolMessageParams{remoteAgentId=" + this.a + ", certificate=" + this.b + ", channelInfoRecords=" + this.f2710c + ", localAgentId=" + this.f2711e + ", messageType=" + ((int) this.f) + ", nSessions=" + this.g + ", profileId=" + Arrays.toString(this.h) + ", sessionIds=" + this.d + ", statusCode=" + ((int) this.i) + ", runningState=" + ((int) this.f2712j) + '}';
    }
}
