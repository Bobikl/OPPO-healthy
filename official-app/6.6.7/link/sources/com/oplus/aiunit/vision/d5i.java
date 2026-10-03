package com.oplus.aiunit.vision;

import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.wearable.btnet.proto.SocketProto;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.httpMessage.exception.BuildHttpMessageError;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.httpMessage.exception.ConnectServerError;
import com.oppo.bluetooth.btnet.bluetoothproxyserver.utils.HttpDataFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class d5i implements lz9 {
    public Socket d;
    public InputStream e;
    public OutputStream f;
    public kl9 g;
    public int h;
    public long i;
    public cyg j;
    public d m;
    public byte[] n;
    public boolean a = true;
    public boolean b = false;
    public BlockingQueue<ok9> c = new LinkedBlockingQueue(500);
    public b k = null;
    public c l = null;

    public class a extends c {
        public void run() {
            byte b;
            o5f.a("SocketHandle", ">>>>>> 开始执行 Socket " + d5i.this.i + " Https2ClientThread 线程 >>>>>>");
            boolean z = true;
            while (!this.i) {
                try {
                    o5f.a("SocketHandle", "==========>>> Https2ClientThread waiting read from remote.....................mSocketID:" + d5i.this.i);
                    byte[] bArrD = ok9.d(d5i.this.e);
                    o5f.a("SocketHandle", "==========>>>Https2ClientThread waiting read from remote body socketid " + d5i.this.i);
                    if (bArrD == null) {
                        o5f.e("SocketHandle", "getBytesFromTCPSocket is null, stop Https2ClientThread ");
                        d5i.this.finish();
                        o5f.c("SocketHandle", "<<<<<< Socket " + d5i.this.i + " Https2ClientThread 线程退出 <<<<<<");
                        return;
                    }
                    int length = bArrD.length;
                    if (z) {
                        b = length < 10240 ? (byte) 0 : (byte) 1;
                    } else {
                        b = length < 10240 ? (byte) 3 : (byte) 2;
                    }
                    ok9 ok9VarB = HttpDataFactory.b(HttpDataFactory.TLS, d5i.this.i, b, (short) bArrD.length, bArrD);
                    if (d5i.this.j != null) {
                        d5i.this.j.j(ok9VarB);
                    } else {
                        o5f.b("SocketHandle", "Https2ClientThread mServerTransportSession is null");
                    }
                    z = false;
                } catch (IOException e) {
                    o5f.c("SocketHandle", "<<<<<< Socket " + d5i.this.i + " Https2ClientThread 线程退出 <<<<<<" + e.toString());
                    long j = d5i.this.i;
                    byte[] bArr = HttpDataFactory.HTTP_DATA_EOT;
                    d5i.this.j.j(HttpDataFactory.b(HttpDataFactory.TLS, j, (byte) 4, (short) bArr.length, bArr));
                }
            }
            d5i.this.finish();
            o5f.c("SocketHandle", "<<<<<< Socket " + d5i.this.i + " Https2ClientThread 线程退出 <<<<<<");
        }

        public a() {
        }
    }

    public class b extends c {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.oplus.aiunit.vision.d5i.c
        public void a() {
            this.i = true;
            o5f.c("SocketHandle", "<<<<<< Socket " + d5i.this.i + " Https2ServerThread  shutdown 线程退出 <<<<<< [NO_MORE_DATA]");
            long j = d5i.this.i;
            byte[] bArr = HttpDataFactory.HTTP_DATA_EOT;
            try {
                d5i.this.c.put(HttpDataFactory.b(HttpDataFactory.NO_MORE_DATA, j, (byte) 0, (short) bArr.length, bArr));
            } catch (InterruptedException e) {
                o5f.b("SocketHandle", "shutdown: ex " + e);
            }
            interrupt();
        }

        public void run() {
            o5f.d("SocketHandle", ">>>>>> 开始执行 Socket " + d5i.this.i + " Https2ServerThread 线程 >>>>>>");
            while (!this.i) {
                try {
                    ok9 ok9VarTake = d5i.this.c.take();
                    if (ok9VarTake.l() == 1536) {
                        o5f.c("SocketHandle", "<<<<<< Socket " + d5i.this.i + " Https2ServerThread 线程退出 <<<<<< [NO_MORE_DATA]");
                        return;
                    }
                    o5f.a("SocketHandle", "Https2ServerThread 发送数据到 server,  mSocketID = " + d5i.this.i + "   group = " + ((int) ok9VarTake.f()));
                    if (ok9VarTake.f() == 4) {
                        o5f.a("SocketHandle", "客户端要求关闭连接，结束socket连接 mSocketID" + d5i.this.i);
                        d5i.this.finish();
                        o5f.c("SocketHandle", "<<<<<< Socket " + d5i.this.i + " Https2ServerThread 线程退出 <<<<<< [CONNECTION CLOSE]");
                        return;
                    }
                    try {
                        d5i.this.f.write(ok9VarTake.e());
                        d5i.this.f.flush();
                    } catch (IOException e) {
                        o5f.b("SocketHandle", "Https2ServerThread : " + e.toString());
                        d5i.this.finish();
                    }
                } catch (InterruptedException e2) {
                    o5f.c("SocketHandle", "<<<<<< Socket " + d5i.this.i + " Https2ServerThread 线程退出 <<<<<<" + e2.toString());
                    return;
                }
            }
            o5f.c("SocketHandle", "<<<<<< Socket " + d5i.this.i + " Https2ServerThread 线程退出 <<<<<<");
        }

        public b() {
        }
    }

    public static abstract class c extends uw8 {
        public boolean i;

        public c() {
            super("BtNetHttps");
            this.i = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void a() {
            this.i = true;
            interrupt();
        }
    }

    public class d extends uw8 {
        public d() {
            super("BtNetSocket");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void a() {
            interrupt();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            String strH;
            int port;
            o5f.a("SocketHandle", ">>>>>> Socket " + d5i.this.i + " 启动SendThread线程 >>>>>>");
            int i = d5i.this.h;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (i != 1537) {
                if (i == 1543) {
                    strH = qf0.a(d5i.this.n);
                    port = 443;
                } else if (i != 1544) {
                    o5f.c("SocketHandle", "未知的请求类型：" + d5i.this.h);
                    strH = null;
                    port = 0;
                } else {
                    try {
                        SocketProto from = SocketProto.parseFrom(d5i.this.n);
                        port = from.getPort();
                        strH = from.getAddress();
                        o5f.c("SocketHandle", "socketProto：" + from.toString());
                    } catch (InvalidProtocolBufferException e) {
                        o5f.b("SocketHandle", "run: ex " + e);
                        return;
                    }
                }
            } else {
                if (d5i.this.g == null) {
                    o5f.a("SocketHandle", "请求消息为空，放弃！");
                    o5f.a("SocketHandle", "<<<<<< Socket " + d5i.this.i + " 退出SendThread线程 <<<<<<");
                    return;
                }
                ((duf) d5i.this.g.j()).e();
                o5f.a("SocketHandle", "mSocketID : " + d5i.this.i + "  请求服务端：" + d5i.this.g.toString());
                strH = d5i.this.g.h("host");
                if (strH == null || !strH.contains(":")) {
                    port = 80;
                } else {
                    String[] strArrSplit = strH.split(":");
                    strH = strArrSplit[0];
                    port = Integer.parseInt(strArrSplit[1]);
                }
            }
            o5f.c("SocketHandle", "host = " + strH + " port = " + port + " mSocketID=" + d5i.this.i);
            if (strH == null) {
                o5f.e("SocketHandle", "mSocketID host is null !!! : mSocketID: " + d5i.this.i);
                return;
            }
            try {
                d5i.this.d = h5i.a(strH, port, 30000);
            } catch (ConnectServerError e2) {
                o5f.b("SocketHandle", "run: ex " + e2);
            }
            if (d5i.this.d == null) {
                o5f.b("SocketHandle", "mServerSocket 连接失败，放弃请求，主机为:" + strH);
                o5f.c("SocketHandle", "<<<<<< Socket " + d5i.this.i + " 退出SendThread线程 <<<<<<");
                long j = d5i.this.i;
                byte[] bArr = HttpDataFactory.HTTP_DATA_EOT;
                d5i.this.j.j(HttpDataFactory.b(HttpDataFactory.TLS, j, (byte) 4, (short) bArr.length, bArr));
                return;
            }
            o5f.d("SocketHandle", "mServerSocket 连接成功 : " + d5i.this.d);
            o5f.d("SocketHandle", ">>>>>> Socket " + d5i.this.i + " 获取ServerSocket >>>>>>");
            try {
                d5i d5iVar = d5i.this;
                d5iVar.e = d5iVar.d.getInputStream();
                d5i d5iVar2 = d5i.this;
                d5iVar2.f = d5iVar2.d.getOutputStream();
                o5f.a("SocketHandle", ">>>>>> Socket " + d5i.this.i + " 获取ServerSocket OutputStream>>>>>>");
                o5f.a("SocketHandle", ">>>>>> Socket " + d5i.this.i + " 获取ServerSocket InputStream>>>>>>");
            } catch (IOException e3) {
                o5f.b("SocketHandle", "run: ex2 " + e3);
            }
            int i2 = d5i.this.h;
            if (i2 != 1537) {
                if (i2 == 1543) {
                    o5f.a("SocketHandle", "发送Client Hello ！");
                    if (!h5i.d(d5i.this.f, d5i.this.n, false)) {
                        o5f.b("SocketHandle", "向服务端发送数据失败，退出。");
                        o5f.c("SocketHandle", "<<<<<< Socket " + d5i.this.i + " 退出SendThread线程 <<<<<<");
                        return;
                    }
                    d5i d5iVar3 = d5i.this;
                    d5iVar3.l = new a();
                    d5i d5iVar4 = d5i.this;
                    d5iVar4.k = new b();
                    as0.a().execute(d5i.this.l);
                    as0.a().execute(d5i.this.k);
                } else {
                    if (i2 != 1544) {
                        o5f.a("SocketHandle", "未支持的类型:" + d5i.this.h + "直接返回！");
                        o5f.c("SocketHandle", "<<<<<< Socket " + d5i.this.i + " 退出SendThread线程 <<<<<<");
                        return;
                    }
                    d5i d5iVar5 = d5i.this;
                    d5iVar5.l = new a();
                    d5i d5iVar6 = d5i.this;
                    d5iVar6.k = new b();
                    Executor executorA = as0.a();
                    if (executorA != null) {
                        executorA.execute(d5i.this.l);
                        executorA.execute(d5i.this.k);
                    }
                }
            } else {
                if (!h5i.b(d5i.this.f, d5i.this.g, false)) {
                    o5f.b("SocketHandle", "向服务端发送数据失败，退出！");
                    o5f.c("SocketHandle", "<<<<<< Socket " + d5i.this.i + " 退出SendThread线程 <<<<<<");
                    return;
                }
                d5i d5iVar7 = d5i.this;
                d5iVar7.l = new a();
                d5i d5iVar8 = d5i.this;
                d5iVar8.k = new b();
                Executor executorA2 = as0.a();
                if (executorA2 != null) {
                    executorA2.execute(d5i.this.l);
                    executorA2.execute(d5i.this.k);
                }
            }
            o5f.d("SocketHandle", "<<<<<< Socket " + d5i.this.i + " 退出SendThread线程 <<<<<<");
        }
    }

    public d5i(byte[] bArr, long j, int i, cyg cygVar) {
        this.i = -1L;
        this.m = null;
        if (i == 1537) {
            try {
                this.g = new kl9(new ByteArrayInputStream(bArr));
            } catch (BuildHttpMessageError e) {
                o5f.b("SocketHandle", "SocketHandle: ex " + e);
            }
        }
        this.j = cygVar;
        this.h = i;
        this.n = bArr;
        this.i = j;
        this.m = new d();
        as0.a().execute(this.m);
    }

    @Override // com.oplus.aiunit.vision.lz9
    public void a() {
        ok9 ok9VarA = HttpDataFactory.a(this.i, (byte) 4, HttpDataFactory.HTTP_DATA_EOT);
        cyg cygVar = this.j;
        if (cygVar != null) {
            cygVar.j(ok9VarA);
        } else {
            o5f.b("SocketHandle", "finish() mServerTransportSession is null");
        }
        d dVar = this.m;
        if (dVar != null) {
            dVar.a();
            this.m = null;
        }
        c cVar = this.l;
        if (cVar != null) {
            cVar.a();
            this.l = null;
        }
        b bVar = this.k;
        if (bVar != null) {
            bVar.a();
            this.k = null;
        }
        OutputStream outputStream = this.f;
        if (outputStream != null) {
            try {
                outputStream.close();
                o5f.a("SocketHandle", "<<<<<< Socket " + this.i + " 关闭ServerSocket OutputStream <<<<<<");
            } catch (IOException e) {
                o5f.b("SocketHandle", "onRemove: ex " + e);
            }
        }
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                inputStream.close();
                o5f.a("SocketHandle", "<<<<<< Socket " + this.i + " 关闭ServerSocket InputStream<<<<<<");
            } catch (IOException e2) {
                o5f.b("SocketHandle", "onRemove: ex " + e2);
            }
        }
        Socket socket = this.d;
        if (socket != null) {
            try {
                socket.close();
                o5f.a("SocketHandle", "<<<<<< Socket " + this.i + " 关闭ServerSocket <<<<<<");
            } catch (IOException e3) {
                o5f.b("SocketHandle", "close mServerSocket erroe: " + e3.toString());
            }
        }
        this.c.clear();
        this.d = null;
    }

    @Override // com.oplus.aiunit.vision.lz9
    public void finish() {
        ok9 ok9VarA = HttpDataFactory.a(this.i, (byte) 4, HttpDataFactory.HTTP_DATA_EOT);
        cyg cygVar = this.j;
        if (cygVar != null) {
            cygVar.j(ok9VarA);
            this.j.v(this.i);
        } else {
            o5f.b("SocketHandle", "finish() mServerTransportSession is null");
        }
        d dVar = this.m;
        if (dVar != null) {
            dVar.a();
            this.m = null;
        }
        c cVar = this.l;
        if (cVar != null) {
            cVar.a();
            this.l = null;
        }
        b bVar = this.k;
        if (bVar != null) {
            bVar.a();
            this.k = null;
        }
        OutputStream outputStream = this.f;
        if (outputStream != null) {
            try {
                outputStream.close();
                o5f.a("SocketHandle", "<<<<<< Socket " + this.i + " 关闭ServerSocket OutputStream <<<<<<");
            } catch (IOException e) {
                o5f.b("SocketHandle", "finish: ex " + e);
            }
        }
        InputStream inputStream = this.e;
        if (inputStream != null) {
            try {
                inputStream.close();
                o5f.a("SocketHandle", "<<<<<< Socket " + this.i + " 关闭ServerSocket InputStream<<<<<<");
            } catch (IOException e2) {
                o5f.b("SocketHandle", "finish: ex " + e2);
            }
        }
        Socket socket = this.d;
        if (socket != null) {
            try {
                socket.close();
                o5f.a("SocketHandle", "<<<<<< Socket " + this.i + " 关闭ServerSocket <<<<<<");
            } catch (IOException e3) {
                o5f.b("SocketHandle", "close mServerSocket erroe: " + e3.toString());
            }
        }
        this.c.clear();
        this.d = null;
    }
}
