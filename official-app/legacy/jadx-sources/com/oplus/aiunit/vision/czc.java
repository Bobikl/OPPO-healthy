package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.nearx.track.internal.common.ntp.TimeStamp;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.net.DatagramPacket;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0006\n\u0002\b\u001d\b\u0000\u0018\u0000 S2\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\bQ\u0010RJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\u001c\u0010\"R$\u0010#\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010\"R$\u0010&\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010!\"\u0004\b(\u0010\"R$\u0010)\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010\"R$\u0010,\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010!\"\u0004\b.\u0010\"R$\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u0010!\"\u0004\b1\u0010\"R$\u00106\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u0010!\"\u0004\b5\u0010\"R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R$\u0010>\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b<\u0010!\"\u0004\b=\u0010\"R\u0014\u0010A\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR(\u0010G\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010C\"\u0004\bE\u0010FR(\u0010J\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010C\"\u0004\bI\u0010FR(\u0010P\u001a\u0004\u0018\u00010\u001b2\b\u0010K\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006T"}, d2 = {"Lcom/oplus/aiunit/vision/czc;", "Lcom/oplus/aiunit/vision/dzc;", "", "u", "v", "t", "", "index", b2n.f, "Lcom/oplus/nearx/track/internal/common/ntp/TimeStamp;", "r", "", b2n.g, "", "w", "ts", "f", "", "obj", "", "equals", "hashCode", "toString", "", "a", "[B", "buf", "Ljava/net/DatagramPacket;", "b", "Ljava/net/DatagramPacket;", "dp", "mode", "i", "()I", "(I)V", "poll", "j", "setPoll", "precision", MapSchema.FIELD_NAME_KEY, "setPrecision", "version", "s", "setVersion", "stratum", "q", "setStratum", ClickApiEntity.DELAY, "n", "setRootDelay", "rootDelay", "dispersion", "o", "setRootDispersion", "rootDispersion", "", LogFieldKey.PROCESS_NAME_KEY, "()D", "rootDispersionInMillisDouble", "refId", LogFieldKey.LEVEL_KEY, "setReferenceId", "referenceId", LogFieldKey.MESSAGE_KEY, "()Ljava/lang/String;", "referenceIdString", MapSchema.FIELD_NAME_ENTRY, "()Lcom/oplus/nearx/track/internal/common/ntp/TimeStamp;", "transmitTimeStamp", "setOriginateTimeStamp", "(Lcom/oplus/nearx/track/internal/common/ntp/TimeStamp;)V", "originateTimeStamp", "d", "setReceiveTimeStamp", "receiveTimeStamp", "srcDp", "c", "()Ljava/net/DatagramPacket;", "setDatagramPacket", "(Ljava/net/DatagramPacket;)V", "datagramPacket", "<init>", "()V", "Companion", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class czc implements dzc {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final byte[] buf = new byte[48];

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public volatile DatagramPacket dp;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.czc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/czc$a;", "", "", "b", "", "a", "", "LI_INDEX", "I", "LI_SHIFT", "MODE_INDEX", "MODE_SHIFT", "ORIGINATE_TIMESTAMP_INDEX", "POLL_INDEX", "PRECISION_INDEX", "RECEIVE_TIMESTAMP_INDEX", "REFERENCE_ID_INDEX", "REFERENCE_TIMESTAMP_INDEX", "ROOT_DELAY_INDEX", "ROOT_DISPERSION_INDEX", "STRATUM_INDEX", "TRANSMIT_TIMESTAMP_INDEX", "VERSION_INDEX", "VERSION_SHIFT", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(byte b) {
            return b & 255;
        }

        public final long b(byte b) {
            return ((long) b) & 255;
        }
    }

    @Override // com.oplus.aiunit.vision.dzc
    @Nullable
    public TimeStamp a() {
        return r(24);
    }

    @Override // com.oplus.aiunit.vision.dzc
    public void b(int i) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) ((i | (bArr[0] & 248)) & 7);
    }

    @Override // com.oplus.aiunit.vision.dzc
    @Nullable
    public synchronized DatagramPacket c() {
        if (this.dp == null) {
            byte[] bArr = this.buf;
            this.dp = new DatagramPacket(bArr, bArr.length);
            DatagramPacket datagramPacket = this.dp;
            Intrinsics.checkNotNull(datagramPacket);
            datagramPacket.setPort(123);
        }
        return this.dp;
    }

    @Override // com.oplus.aiunit.vision.dzc
    @Nullable
    public TimeStamp d() {
        return r(32);
    }

    @Override // com.oplus.aiunit.vision.dzc
    @NotNull
    public TimeStamp e() {
        return r(40);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(czc.class, obj.getClass())) {
            return false;
        }
        return Arrays.equals(this.buf, ((czc) obj).buf);
    }

    @Override // com.oplus.aiunit.vision.dzc
    public void f(@Nullable TimeStamp ts) {
        w(40, ts);
    }

    public final int g(int index) {
        Companion companion = INSTANCE;
        return companion.a(this.buf[index + 3]) | (companion.a(this.buf[index]) << 24) | (companion.a(this.buf[index + 1]) << 16) | (companion.a(this.buf[index + 2]) << 8);
    }

    public final long h(int index) {
        Companion companion = INSTANCE;
        return companion.b(this.buf[index + 7]) | (companion.b(this.buf[index]) << 56) | (companion.b(this.buf[index + 1]) << 48) | (companion.b(this.buf[index + 2]) << 40) | (companion.b(this.buf[index + 3]) << 32) | (companion.b(this.buf[index + 4]) << 24) | (companion.b(this.buf[index + 5]) << 16) | (companion.b(this.buf[index + 6]) << 8);
    }

    public int hashCode() {
        return Arrays.hashCode(this.buf);
    }

    public int i() {
        return (INSTANCE.a(this.buf[0]) >> 0) & 7;
    }

    public int j() {
        return this.buf[2];
    }

    public int k() {
        return this.buf[3];
    }

    public int l() {
        return g(12);
    }

    @NotNull
    public String m() {
        int iS = s();
        int iQ = q();
        if (iS == 3 || iS == 4) {
            if (iQ == 0 || iQ == 1) {
                return v();
            }
            if (iS == 4) {
                return t();
            }
        }
        return iQ >= 2 ? u() : t();
    }

    public int n() {
        return g(4);
    }

    public int o() {
        return g(8);
    }

    public double p() {
        return ((double) o()) / 65.536d;
    }

    public int q() {
        return INSTANCE.a(this.buf[1]);
    }

    public final TimeStamp r(int index) {
        return new TimeStamp(h(index));
    }

    public int s() {
        return (INSTANCE.a(this.buf[0]) >> 3) & 7;
    }

    @Override // com.oplus.aiunit.vision.dzc
    public void setVersion(int i) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) (((i & 7) << 3) | (bArr[0] & 199));
    }

    public final String t() {
        String hexString = Integer.toHexString(l());
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(referenceId)");
        return hexString;
    }

    @NotNull
    public String toString() {
        return "[version:" + s() + ", mode:" + i() + ", poll:" + j() + ", precision:" + k() + ", delay:" + n() + ", dispersion(ms):" + p() + ", id:" + m() + ", xmitTime:" + e().toDateString() + " ]";
    }

    public final String u() {
        StringBuilder sb = new StringBuilder();
        Companion companion = INSTANCE;
        sb.append(companion.a(this.buf[12]));
        sb.append('.');
        sb.append(companion.a(this.buf[13]));
        sb.append('.');
        sb.append(companion.a(this.buf[14]));
        sb.append('.');
        sb.append(companion.a(this.buf[15]));
        return sb.toString();
    }

    public final String v() {
        char c2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4 && (c2 = (char) this.buf[i + 12]) != 0; i++) {
            sb.append(c2);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
        return string;
    }

    public final void w(int index, TimeStamp t) {
        long ntpTime = t != null ? t.getNtpTime() : 0L;
        for (int i = 7; -1 < i; i--) {
            this.buf[index + i] = (byte) (255 & ntpTime);
            ntpTime >>>= 8;
        }
    }
}
