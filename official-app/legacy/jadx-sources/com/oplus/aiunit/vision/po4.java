package com.oplus.aiunit.vision;

import android.content.Context;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.HttpDataFactory;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes9.dex */
public class po4 {
    public DatagramSocket a;
    public BlockingDeque<ij9> b = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f15421c;
    public Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mug f15422e;

    public class a extends qv8 {
        public boolean i;

        public a() {
            super("BtNetDnsSend");
            this.i = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            c3f.c("DNSHandler", ">>>>>> DNS请求发送线程启动 >>>>>>");
            while (!this.i) {
                c3f.a("DNSHandler", "等待DNS请求数据...");
                try {
                    ij9 ij9Var = (ij9) po4.this.b.take();
                    if (ij9Var.l() == 1536) {
                        c3f.c("DNSHandler", "<<<<<< DNS请求发送线程退出 <<<<<< [NO_MORE_DATA]");
                        return;
                    }
                    DatagramPacket datagramPacket = new DatagramPacket(ij9Var.e(), ij9Var.k(), grk.a(po4.this.d, 0), 53);
                    if (po4.this.a == null) {
                        return;
                    }
                    po4.this.a.send(datagramPacket);
                    c3f.a("DNSHandler", "DNS请求发送完毕，等待回复...");
                    DatagramPacket datagramPacket2 = new DatagramPacket(new byte[1024], 1024);
                    po4.this.a.receive(datagramPacket2);
                    c3f.a("DNSHandler", "收到DNS回复... 插入发送到手表端队列  数据长度：" + datagramPacket2.getLength() + "收到的DNS 回复的 DatagramPacket 端口号:" + datagramPacket2.getPort() + " 地址:" + datagramPacket2.getAddress());
                    byte[] bArr = new byte[datagramPacket2.getLength()];
                    System.arraycopy(datagramPacket2.getData(), 0, bArr, 0, datagramPacket2.getLength());
                    ij9 ij9VarB = HttpDataFactory.b(HttpDataFactory.DNS_RES, -1L, (byte) 0, (short) datagramPacket2.getLength(), bArr);
                    if (po4.this.f15422e != null) {
                        po4.this.f15422e.j(ij9VarB);
                    }
                } catch (IOException e2) {
                    c3f.b("DNSHandler", "run: ex " + e2);
                } catch (InterruptedException e3) {
                    c3f.c("DNSHandler", "<<<<<< DNS请求发送线程退出 <<<<<< " + e3.toString());
                    return;
                }
            }
            c3f.c("DNSHandler", "<<<<<< DNS请求发送线程退出 <<<<<<");
        }
    }

    public po4(Context context) {
        try {
            this.d = context;
            DatagramSocket datagramSocket = new DatagramSocket();
            this.a = datagramSocket;
            datagramSocket.setSoTimeout(10000);
        } catch (SocketException e2) {
            c3f.a("DNSHandler", " 错误 ：" + e2.toString());
        }
        this.f15421c = new a();
        jr0.a().execute(this.f15421c);
    }

    public void e(ij9 ij9Var) {
        try {
            this.b.put(ij9Var);
        } catch (InterruptedException e2) {
            c3f.b("DNSHandler", "addDnsRquest: ex " + e2);
        }
    }

    public void f() {
        this.b.clear();
    }

    public void g(mug mugVar) {
        this.f15422e = mugVar;
    }
}
