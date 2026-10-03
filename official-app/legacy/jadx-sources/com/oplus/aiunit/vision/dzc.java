package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.common.ntp.TimeStamp;
import io.protostuff.MapSchema;
import java.net.DatagramPacket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b`\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0011\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0016\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u001a¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/dzc;", "", "Lcom/oplus/nearx/track/internal/common/ntp/TimeStamp;", "ts", "", "f", "Ljava/net/DatagramPacket;", "c", "()Ljava/net/DatagramPacket;", "setDatagramPacket", "(Ljava/net/DatagramPacket;)V", "datagramPacket", "", "getMode", "()I", "b", "(I)V", "mode", "getVersion", "setVersion", "version", MapSchema.FIELD_NAME_ENTRY, "()Lcom/oplus/nearx/track/internal/common/ntp/TimeStamp;", "transmitTimeStamp", "a", "setOriginateTimeStamp", "(Lcom/oplus/nearx/track/internal/common/ntp/TimeStamp;)V", "originateTimeStamp", "d", "setReceiveTimeStamp", "receiveTimeStamp", "Companion", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public interface dzc {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
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

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.dzc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/dzc$a;", "", "", "NTP_PORT", "I", "MODE_RESERVED", "MODE_SYMMETRIC_ACTIVE", "MODE_SYMMETRIC_PASSIVE", "MODE_CLIENT", "MODE_SERVER", "MODE_BROADCAST", "MODE_CONTROL_MESSAGE", "MODE_PRIVATE", "VERSION_3", "VERSION_4", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
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
        public static final /* synthetic */ Companion a = new Companion();
    }

    @Nullable
    TimeStamp a();

    void b(int i);

    @Nullable
    DatagramPacket c();

    @Nullable
    TimeStamp d();

    @Nullable
    TimeStamp e();

    void f(@Nullable TimeStamp ts);

    void setVersion(int i);
}
