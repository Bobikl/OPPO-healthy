package com.oplus.nearx.track.internal.common.ntp;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.eui;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\r\u001a\u00020\u000bJ\u0011\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002R\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/oplus/nearx/track/internal/common/ntp/TimeStamp;", "Ljava/io/Serializable;", "", "", "ntpValue", "", "hashCode", "", "obj", "", "equals", "", "toString", "toDateString", "anotherTimeStamp", "compareTo", "ntpTime", "J", "Ljava/text/DateFormat;", "simpleFormatter", "Ljava/text/DateFormat;", "getTime", "()J", ClickApiEntity.TIME, "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "date", "<init>", "(J)V", "Companion", "a", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class TimeStamp implements Serializable, Comparable<TimeStamp> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NTP_DATE_FORMAT = "EEE, MMM dd yyyy HH:mm:ss.SSS";
    protected static final long msb0baseTime = 2085978496000L;
    protected static final long msb1baseTime = -2208988800000L;
    private static final long serialVersionUID = 8139806907588338737L;
    private final long ntpTime;

    @Nullable
    private DateFormat simpleFormatter;

    /* JADX INFO: renamed from: com.oplus.nearx.track.internal.common.ntp.TimeStamp$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0004J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002J\u001c\u0010\u0012\u001a\u00020\u00112\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002R\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/oplus/nearx/track/internal/common/ntp/TimeStamp$a;", "", "", "ntpTimeValue", "d", "date", "Lcom/oplus/nearx/track/internal/common/ntp/TimeStamp;", "c", "t", MapSchema.FIELD_NAME_ENTRY, "ntpTime", "", "f", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "buf", LogFieldKey.LEVEL_KEY, "", "a", "b", "()Lcom/oplus/nearx/track/internal/common/ntp/TimeStamp;", "currentTime", "NTP_DATE_FORMAT", "Ljava/lang/String;", "msb0baseTime", "J", "msb1baseTime", "serialVersionUID", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(StringBuilder buf, long l2) {
            String hexString = Long.toHexString(l2);
            for (int length = hexString.length(); length < 8; length++) {
                buf.append('0');
            }
            buf.append(hexString);
        }

        @NotNull
        public final TimeStamp b() {
            return c(System.currentTimeMillis());
        }

        @NotNull
        public final TimeStamp c(long date) {
            return new TimeStamp(e(date));
        }

        public final long d(long ntpTimeValue) {
            long j2;
            long j3;
            long j4 = (ntpTimeValue >>> 32) & 4294967295L;
            long jRound = Math.round(((ntpTimeValue & 4294967295L) * 1000.0d) / eui.MIN_CAP_LIMIT);
            if ((2147483648L & j4) == 0) {
                j2 = j4 * ((long) 1000);
                j3 = TimeStamp.msb0baseTime;
            } else {
                j2 = j4 * ((long) 1000);
                j3 = TimeStamp.msb1baseTime;
            }
            return j2 + j3 + jRound;
        }

        public final long e(long t) {
            long j2 = TimeStamp.msb0baseTime;
            boolean z = t < TimeStamp.msb0baseTime;
            if (z) {
                j2 = TimeStamp.msb1baseTime;
            }
            long j3 = t - j2;
            long j4 = 1000;
            long j5 = j3 / j4;
            long j6 = ((j3 % j4) * eui.MIN_CAP_LIMIT) / j4;
            if (z) {
                j5 |= 2147483648L;
            }
            return (j5 << 32) | j6;
        }

        @NotNull
        public final String f(long ntpTime) {
            StringBuilder sb = new StringBuilder();
            a(sb, (ntpTime >>> 32) & 4294967295L);
            sb.append('.');
            a(sb, ntpTime & 4294967295L);
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "buf.toString()");
            return string;
        }
    }

    public TimeStamp(long j2) {
        this.ntpTime = j2;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof TimeStamp) && this.ntpTime == ((TimeStamp) obj).getNtpTime();
    }

    @NotNull
    public final Date getDate() {
        return new Date(INSTANCE.d(this.ntpTime));
    }

    public final long getTime() {
        return INSTANCE.d(this.ntpTime);
    }

    public int hashCode() {
        long j2 = this.ntpTime;
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX INFO: renamed from: ntpValue, reason: from getter */
    public final long getNtpTime() {
        return this.ntpTime;
    }

    @NotNull
    public final String toDateString() {
        if (this.simpleFormatter == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss.SSS", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            this.simpleFormatter = simpleDateFormat;
            Unit unit = Unit.INSTANCE;
        }
        Date date = getDate();
        DateFormat dateFormat = this.simpleFormatter;
        Intrinsics.checkNotNull(dateFormat);
        String str = dateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "simpleFormatter!!.format(ntpDate)");
        return str;
    }

    @NotNull
    public String toString() {
        return INSTANCE.f(this.ntpTime);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull TimeStamp anotherTimeStamp) {
        Intrinsics.checkNotNullParameter(anotherTimeStamp, "anotherTimeStamp");
        long j2 = this.ntpTime;
        long j3 = anotherTimeStamp.ntpTime;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }
}
