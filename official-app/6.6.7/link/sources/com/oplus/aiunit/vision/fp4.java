package com.oplus.aiunit.vision;

import android.content.Context;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.HttpDataFactory;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class fp4 {
    public DatagramSocket a;
    public BlockingDeque<ok9> b = new LinkedBlockingDeque();
    public a c;
    public Context d;
    public cyg e;

    public class a extends uw8 {
        public boolean i;

        public a() {
            super("BtNetDnsSend");
            this.i = false;
        }

        public void run() {
            o5f.c("DNSHandler", ">>>>>> DNS请求发送线程启动 >>>>>>");
            while (!this.i) {
                o5f.a("DNSHandler", "等待DNS请求数据...");
                try {
                    ok9 ok9Var = (ok9) fp4.this.b.take();
                    if (ok9Var.l() == 1536) {
                        o5f.c("DNSHandler", "<<<<<< DNS请求发送线程退出 <<<<<< [NO_MORE_DATA]");
                        return;
                    }
                    DatagramPacket datagramPacket = new DatagramPacket(ok9Var.e(), ok9Var.k(), evk.a(fp4.this.d, 0), 53);
                    if (fp4.this.a == null) {
                        return;
                    }
                    fp4.this.a.send(datagramPacket);
                    o5f.a("DNSHandler", "DNS请求发送完毕，等待回复...");
                    DatagramPacket datagramPacket2 = new DatagramPacket(new byte[1024], 1024);
                    fp4.this.a.receive(datagramPacket2);
                    o5f.a("DNSHandler", "收到DNS回复... 插入发送到手表端队列  数据长度：" + datagramPacket2.getLength() + "收到的DNS 回复的 DatagramPacket 端口号:" + datagramPacket2.getPort() + " 地址:" + datagramPacket2.getAddress());
                    byte[] bArr = new byte[datagramPacket2.getLength()];
                    System.arraycopy(datagramPacket2.getData(), 0, bArr, 0, datagramPacket2.getLength());
                    ok9 ok9VarB = HttpDataFactory.b(HttpDataFactory.DNS_RES, -1L, (byte) 0, (short) datagramPacket2.getLength(), bArr);
                    if (fp4.this.e != null) {
                        fp4.this.e.j(ok9VarB);
                    }
                } catch (IOException e) {
                    o5f.b("DNSHandler", "run: ex " + e);
                } catch (InterruptedException e2) {
                    o5f.c("DNSHandler", "<<<<<< DNS请求发送线程退出 <<<<<< " + e2.toString());
                    return;
                }
            }
            o5f.c("DNSHandler", "<<<<<< DNS请求发送线程退出 <<<<<<");
        }
    }

    public fp4(Context context) {
        try {
            this.d = context;
            DatagramSocket datagramSocket = new DatagramSocket();
            this.a = datagramSocket;
            datagramSocket.setSoTimeout(10000);
        } catch (SocketException e) {
            o5f.a("DNSHandler", " 错误 ：" + e.toString());
        }
        this.c = new a();
        as0.a().execute(this.c);
    }

    public void e(ok9 ok9Var) {
        try {
            this.b.put(ok9Var);
        } catch (InterruptedException e) {
            o5f.b("DNSHandler", "addDnsRquest: ex " + e);
        }
    }

    public void f() {
        this.b.clear();
    }

    public void g(cyg cygVar) {
        this.e = cygVar;
    }
}
