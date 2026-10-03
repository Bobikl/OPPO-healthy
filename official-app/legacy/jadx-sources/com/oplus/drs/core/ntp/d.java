package com.oplus.drs.core.ntp;

import java.net.DatagramPacket;

/* JADX INFO: loaded from: classes6.dex */
public interface d {
    public static final int MODE_BROADCAST = 5;
    public static final int MODE_CLIENT = 3;
    public static final int MODE_CONTROL_MESSAGE = 6;
    public static final int MODE_PRIVATE = 7;
    public static final int MODE_RESERVED = 0;
    public static final int MODE_SERVER = 4;
    public static final int MODE_SYMMETRIC_ACTIVE = 1;
    public static final int MODE_SYMMETRIC_PASSIVE = 2;
    public static final int NTP_PORT = 123;
    public static final int VERSION_3 = 3;
    public static final int VERSION_4 = 4;

    TimeStamp a();

    void b(int i);

    DatagramPacket c();

    TimeStamp d();

    TimeStamp e();

    void f(TimeStamp timeStamp);

    void setVersion(int i);
}
