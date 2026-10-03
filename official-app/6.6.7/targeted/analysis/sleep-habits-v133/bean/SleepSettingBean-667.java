package com.heytap.wsport.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.StringRes;
import com.heytap.databaseengine.model.SleepModelSettings;
import com.heytap.store.platform.barcode.util.LogUtils;
import com.oplus.aiunit.vision.quh;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes5.dex */
public class SleepSettingBean {
    public int b;
    public int c;
    public int e;
    public int a = 0;
    public String d = "";
    public SleepModelSettings f = new SleepModelSettings();
    public SleepRemind g = new SleepRemind();
    public SleepRemind h = new SleepRemind();
    public SleepGoal i = new SleepGoal();
    public SleepRestSetting j = new SleepRestSetting();

    public static class SleepGoal implements Parcelable {
        public static final Parcelable.Creator<SleepGoal> CREATOR = new a();
        int mSleepGoalTime;

        public class a implements Parcelable.Creator<SleepGoal> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SleepGoal createFromParcel(Parcel parcel) {
                return new SleepGoal(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SleepGoal[] newArray(int i) {
                return new SleepGoal[i];
            }
        }

        public SleepGoal() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getSleepGoalTime() {
            return this.mSleepGoalTime;
        }

        public void setSleepGoalTime(int i) {
            this.mSleepGoalTime = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mSleepGoalTime);
        }

        public SleepGoal(Parcel parcel) {
            this.mSleepGoalTime = parcel.readInt();
        }
    }

    public static class SleepRemind implements Parcelable {
        public static final Parcelable.Creator<SleepRemind> CREATOR = new a();
        int mRemindSwitch;
        int mRemindTime;

        public class a implements Parcelable.Creator<SleepRemind> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SleepRemind createFromParcel(Parcel parcel) {
                return new SleepRemind(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SleepRemind[] newArray(int i) {
                return new SleepRemind[i];
            }
        }

        public SleepRemind() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getRemindSwitch() {
            return this.mRemindSwitch;
        }

        public int getRemindTime() {
            return this.mRemindTime;
        }

        public boolean isEnable() {
            return this.mRemindSwitch == 1;
        }

        public void setRemindSwitch(int i) {
            this.mRemindSwitch = i;
        }

        public void setRemindTime(int i) {
            this.mRemindTime = i;
        }

        public String toString() {
            return "SleepRemind{mRemindTime=" + ((this.mRemindTime >> 8) & 255) + LogUtils.COLON + (this.mRemindTime & 255) + ", mRemindSwitch=" + this.mRemindSwitch + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mRemindTime);
            parcel.writeInt(this.mRemindSwitch);
        }

        public SleepRemind(Parcel parcel) {
            this.mRemindTime = parcel.readInt();
            this.mRemindSwitch = parcel.readInt();
        }
    }

    @Keep
    public static class SleepRest {
        int bedTime;
        transient int bedTimeDateName;
        long createTime;
        int excludeHoliday;
        public transient boolean isSelected = false;
        String name;
        int restType;
        int userDefinedDate;
        int wakeUpTime;
        transient int wakeUpTimeDateName;

        public boolean equals(Object obj) {
            return (obj instanceof SleepRest) && this.createTime == ((SleepRest) obj).createTime;
        }

        public int getBedTime() {
            return this.bedTime;
        }

        public long getCreateTime() {
            return this.createTime;
        }

        public List<Integer> getDayOfWeekList() {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 7; i++) {
                if (((this.userDefinedDate >> i) & 1) == 1) {
                    arrayList.add(Integer.valueOf(i + 1));
                }
            }
            return arrayList;
        }

        public int getExcludeHoliday() {
            return this.excludeHoliday;
        }

        public String getName() {
            return this.name;
        }

        public int getRestType() {
            return this.restType;
        }

        public int getUserDefinedDate() {
            return this.userDefinedDate;
        }

        public int getWakeUpTime() {
            return this.wakeUpTime;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.createTime));
        }

        public void setBedTime(int i) {
            this.bedTime = i;
        }

        public void setBedTimeDateName(@StringRes int i) {
            this.bedTimeDateName = i;
        }

        public void setCreateTime(long j) {
            this.createTime = j;
        }

        public void setExcludeHoliday(int i) {
            this.excludeHoliday = i;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setRestType(int i) {
            this.restType = i;
        }

        public void setUserDefinedDate(int i) {
            this.userDefinedDate = i;
        }

        public void setWakeUpTime(int i) {
            this.wakeUpTime = i;
        }

        public void setWakeUpTimeDateName(@StringRes int i) {
            this.wakeUpTimeDateName = i;
        }

        public String toString() {
            return "SleepRest{createTime=" + this.createTime + ",bedTime=" + quh.a(this.bedTime) + LogUtils.COLON + quh.b(this.bedTime) + ", wakeUpTime=" + quh.a(this.wakeUpTime) + LogUtils.COLON + quh.b(this.wakeUpTime) + ", userDefinedDate=" + this.userDefinedDate + ", excludeHoliday=" + this.excludeHoliday + '}';
        }

        public void update(SleepRest sleepRest) {
            this.createTime = sleepRest.createTime;
            this.name = sleepRest.name;
            this.bedTime = sleepRest.bedTime;
            this.wakeUpTime = sleepRest.wakeUpTime;
            this.userDefinedDate = sleepRest.userDefinedDate;
            this.restType = sleepRest.restType;
            this.excludeHoliday = sleepRest.excludeHoliday;
        }
    }

    @Keep
    public static class SleepRestSetting {
        List<SleepRest> mSleepRests = new ArrayList();
        int mSleepRestSwitch = 1;

        public int getSleepRestSwitch() {
            return 1;
        }

        public List<SleepRest> getSleepRests() {
            return this.mSleepRests;
        }

        public boolean isSleepRestSwitch() {
            return true;
        }

        public void setSleepRestSwitch(int i) {
            this.mSleepRestSwitch = i;
        }

        public void setSleepRests(List<SleepRest> list) {
            if (!this.mSleepRests.isEmpty()) {
                this.mSleepRests.clear();
            }
            this.mSleepRests.addAll(list);
        }

        public String toString() {
            return "SleepRestSetting{mSleepRests=" + this.mSleepRests + ", SleepRestSwitch=" + this.mSleepRestSwitch + '}';
        }
    }

    public SleepRemind a() {
        return this.g;
    }

    public int b() {
        return this.e;
    }

    public String c() {
        return this.d;
    }

    public SleepGoal d() {
        return this.i;
    }

    public SleepModelSettings e() {
        return this.f;
    }

    public SleepRestSetting f() {
        return this.j;
    }

    public SleepRemind g() {
        return this.h;
    }

    public List<SleepRest> h() {
        return this.j.getSleepRests();
    }

    public boolean i() {
        return quh.d(this.a);
    }

    public boolean j() {
        return quh.d(this.c);
    }

    public void k(int i) {
        this.a = i;
    }

    public void l(int i) {
        this.b = i;
    }

    public void m(int i) {
        this.e = i;
    }

    public void n(String str) {
        this.d = str;
    }

    public void o(int i) {
        this.c = i;
    }

    public void p(SleepModelSettings sleepModelSettings) {
        this.f = sleepModelSettings;
    }

    public void q(SleepRestSetting sleepRestSetting) {
        this.j = sleepRestSetting;
    }

    public String toString() {
        return "SleepSettingBean{mCloseMusicSwitch=" + this.a + ", mSleepModeSettings=" + this.f + ", mBedRemind=" + this.g + ", mStayUpRemind=" + this.h + ", mSleepRestSetting=" + this.j + '}';
    }
}