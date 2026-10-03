package com.heytap.wearable.watch.bandclock;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.health.band.data.AlarmProperty$AlarmDetail;
import com.heytap.wearable.watch.R$string;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ms;
import com.oplus.aiunit.vision.zxj;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class AlarmClockBean implements Parcelable, Comparable<AlarmClockBean>, Cloneable {
    public static final Parcelable.Creator<AlarmClockBean> CREATOR = new a();
    public static final int[] SHOCKTIME = {5, 15, 30, 60};
    private boolean enable;
    private int id;
    private String label;
    private String repeat;
    private int shockTime;
    private int startHour;
    private int startMin;

    public class a implements Parcelable.Creator<AlarmClockBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AlarmClockBean createFromParcel(Parcel parcel) {
            return new AlarmClockBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AlarmClockBean[] newArray(int i) {
            return new AlarmClockBean[i];
        }
    }

    public AlarmClockBean(int i, boolean z, String str, int i2, int i3, int i4, String str2) {
        this.id = i;
        this.enable = z;
        this.repeat = str;
        this.startHour = i2;
        this.startMin = i3;
        this.shockTime = i4;
        this.label = str2;
    }

    public static AlarmClockBean buildDefaultClock() {
        AlarmClockBean alarmClockBean = new AlarmClockBean(new Random().nextInt(10000), true, "0000000", 8, 0, 15, str(R$string.band_settings_clock_title));
        while (ms.i().g().contains(alarmClockBean)) {
            alarmClockBean.id = new Random().nextInt(10000);
        }
        return alarmClockBean;
    }

    public static AlarmClockBean buildPbClock(AlarmProperty$AlarmDetail alarmProperty$AlarmDetail) {
        return new AlarmClockBean(alarmProperty$AlarmDetail.getAlarmId(), alarmProperty$AlarmDetail.getAlarmEnable() == 1, toBinary(alarmProperty$AlarmDetail.getAlarmDayflag(), 7), zxj.a(alarmProperty$AlarmDetail.getAlarmTime()), zxj.c(alarmProperty$AlarmDetail.getAlarmTime()), alarmProperty$AlarmDetail.getAlarmShakeDuration(), alarmProperty$AlarmDetail.getAlarmName());
    }

    private int makeRepeatTime() {
        String str = this.repeat;
        int iPow = 0;
        if (str != null) {
            char[] charArray = str.toCharArray();
            for (int length = charArray.length - 1; length >= 0; length--) {
                iPow = (int) (((double) iPow) + (((double) (charArray[length] - '0')) * Math.pow(2.0d, (charArray.length - 1) - length)));
            }
        }
        return iPow;
    }

    private static String str(int i) {
        return b78.a().getString(i);
    }

    private static String toBinary(int i, int i2) {
        return Integer.toBinaryString(i | (1 << i2)).substring(1);
    }

    public AlarmProperty$AlarmDetail buildPbAlarm(int i) {
        return AlarmProperty$AlarmDetail.newBuilder().setAlarmEnable(isEnable() ? 1 : 0).setAlarmId(getId()).setAlarmName(getLabel()).setAlarmTime(zxj.b(getStartHour(), getStartMin())).setAlarmDayflag(makeRepeatTime()).setAlarmShakeDuration(getShockTime()).build();
    }

    public String buildRepeatLableString() {
        return buildRepeatString() + " | " + this.label;
    }

    public String buildRepeatString() {
        if (!TextUtils.isEmpty(this.repeat) && !this.repeat.equals("0000000")) {
            if (this.repeat.equals("1111111")) {
                return str(R$string.band_clock_everyday);
            }
            if (this.repeat.equals("0011111")) {
                return str(R$string.band_clock_workday);
            }
            if (this.repeat.equals("1100000")) {
                return str(R$string.band_clock_weekend);
            }
            StringBuilder sb = new StringBuilder();
            char[] charArray = this.repeat.toCharArray();
            for (int length = charArray.length - 1; length >= 0; length--) {
                if (charArray[length] - '0' == 1) {
                    switch (length) {
                        case 0:
                            sb.append(str(R$string.band_clock_sunday));
                            sb.append(" ");
                            break;
                        case 1:
                            sb.append(str(R$string.band_clock_saturday));
                            sb.append(" ");
                            break;
                        case 2:
                            sb.append(str(R$string.band_clock_friday));
                            sb.append(" ");
                            break;
                        case 3:
                            sb.append(str(R$string.band_clock_thursday));
                            sb.append(" ");
                            break;
                        case 4:
                            sb.append(str(R$string.band_clock_wednesday));
                            sb.append(" ");
                            break;
                        case 5:
                            sb.append(str(R$string.band_clock_tuesday));
                            sb.append(" ");
                            break;
                        case 6:
                            sb.append(str(R$string.band_clock_monday));
                            sb.append(" ");
                            break;
                    }
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        }
        return str(R$string.band_clock_never);
    }

    public String buildTimeString() {
        return String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf(this.startHour), Integer.valueOf(this.startMin));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.id == ((AlarmClockBean) obj).id;
    }

    public int getId() {
        return this.id;
    }

    public String getLabel() {
        return this.label;
    }

    public String getRepeat() {
        return this.repeat;
    }

    public int getShockTime() {
        return this.shockTime;
    }

    public int getShockTimeIndex() {
        int i = 0;
        while (true) {
            int[] iArr = SHOCKTIME;
            if (i >= iArr.length) {
                return 0;
            }
            if (iArr[i] == this.shockTime) {
                return i;
            }
            i++;
        }
    }

    public int getStartHour() {
        return this.startHour;
    }

    public int getStartMin() {
        return this.startMin;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.id));
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean[] repeatString2Array() {
        boolean[] zArr = new boolean[7];
        char[] charArray = this.repeat.toCharArray();
        for (int length = charArray.length - 1; length >= 0; length--) {
            if (charArray[length] - '0' == 1) {
                zArr[6 - length] = true;
            }
        }
        return zArr;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setRepeat(String str) {
        this.repeat = str;
    }

    public void setShockTime(int i) {
        this.shockTime = i;
    }

    public void setShockTimeByIndex(int i) {
        this.shockTime = SHOCKTIME[i];
    }

    public void setStartHour(int i) {
        this.startHour = i;
    }

    public void setStartMin(int i) {
        this.startMin = i;
    }

    public String toString() {
        return "AlarmClockBean{id='" + this.id + "', enable=" + this.enable + ", repeat='" + this.repeat + "', startHour=" + this.startHour + ", startMin=" + this.startMin + ", shockTime=" + this.shockTime + ", label='" + this.label + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeByte(this.enable ? (byte) 1 : (byte) 0);
        parcel.writeString(this.repeat);
        parcel.writeInt(this.startHour);
        parcel.writeInt(this.startMin);
        parcel.writeInt(this.shockTime);
        parcel.writeString(this.label);
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AlarmClockBean m5132clone() {
        try {
            return (AlarmClockBean) super.clone();
        } catch (CloneNotSupportedException unused) {
            return buildDefaultClock();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(AlarmClockBean alarmClockBean) {
        int startHour = ((getStartHour() * 60) + getStartMin()) - ((alarmClockBean.getStartHour() * 60) + alarmClockBean.getStartMin());
        if (startHour > 0) {
            return 1;
        }
        return startHour < 0 ? -1 : 0;
    }

    public void setRepeat(boolean[] zArr) {
        if (zArr == null) {
            this.repeat = "0000000";
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (boolean z : zArr) {
            sb.insert(0, z ? 1 : 0);
        }
        this.repeat = sb.toString();
    }

    public AlarmClockBean(Parcel parcel) {
        this.id = parcel.readInt();
        this.enable = parcel.readByte() != 0;
        this.repeat = parcel.readString();
        this.startHour = parcel.readInt();
        this.startMin = parcel.readInt();
        this.shockTime = parcel.readInt();
        this.label = parcel.readString();
    }
}
