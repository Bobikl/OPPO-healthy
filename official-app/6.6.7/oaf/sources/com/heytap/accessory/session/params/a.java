package com.heytap.accessory.session.params;

import com.heytap.accessory.utils.buffer.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public int a;
    public Buffer b;
    public List<a> c = new ArrayList();
    public List<Long> d = new ArrayList();
    public int e;
    public byte f;
    public int g;
    public byte[] h;
    public byte i;
    public byte j;

    public static class a {
        public int a;
        public byte b;
        public a c = new a();

        public static final class a {
            public byte a;
            public byte b;

            public String toString() {
                return "QosParams{classType=" + ((int) this.a) + ", type=" + ((int) this.b) + '}';
            }
        }

        public String toString() {
            return "ChannelRecord{channelId=" + this.a + ", payloadType=" + ((int) this.b) + ", qosParams=" + this.c + '}';
        }
    }

    public List<Integer> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().a));
        }
        return arrayList;
    }

    public String toString() {
        return "ProtocolMessageParams{remoteAgentId=" + this.a + ", certificate=" + this.b + ", channelInfoRecords=" + this.c + ", localAgentId=" + this.e + ", messageType=" + ((int) this.f) + ", nSessions=" + this.g + ", profileId=" + Arrays.toString(this.h) + ", sessionIds=" + this.d + ", statusCode=" + ((int) this.i) + ", runningState=" + ((int) this.j) + '}';
    }
}
