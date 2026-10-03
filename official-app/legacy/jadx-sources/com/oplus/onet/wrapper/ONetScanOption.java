package com.oplus.onet.wrapper;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.accessory.bean.ClassScanFilter;
import com.heytap.accessory.bean.StateScanFilter;
import com.oplus.aiunit.vision.h0n;
import com.oplus.aiunit.vision.zqm;
import com.oplus.onet.ability.AbilityFilter;

/* JADX INFO: loaded from: classes8.dex */
public class ONetScanOption implements Parcelable {
    public static final Parcelable.Creator<ONetScanOption> CREATOR = new b();
    public static final int DISCOVERY_MODE_ACTIVE = 1;
    public static final int DISCOVERY_MODE_AUTO = 0;
    public static final int DISCOVERY_MODE_PASSIVE = 2;
    public static final int PAIR_STATE_ALL = 1;
    public static final int PAIR_STATE_UNPAIR = 0;
    public static final String TAG = "ONetScanOption";
    private AbilityFilter mAbilityFilter;
    private ClassScanFilter mClassScanFilter;
    private transient int mClientId;
    private int mConnectionType;
    private int mDiscoverMode;
    private Bundle mExtraData;
    private boolean mHandleByService;
    private long mNsdScanDuration;
    private long mScanDuration;
    private SCAN_MODE mScanMode;
    private int mScanType;
    private StateScanFilter mStateScanFilter;

    public enum SCAN_MODE {
        SCAN_MODE_LOW_POWER,
        SCAN_MODE_BALANCED,
        SCAN_MODE_LOW_LATENCY
    }

    public static final class a {
        public static /* synthetic */ int a(a aVar) {
            throw null;
        }

        public static /* synthetic */ long b(a aVar) {
            throw null;
        }

        public static /* synthetic */ Bundle c(a aVar) {
            throw null;
        }

        public static /* synthetic */ long d(a aVar) {
            throw null;
        }

        public static /* synthetic */ SCAN_MODE e(a aVar) {
            throw null;
        }

        public static /* synthetic */ int f(a aVar) {
            throw null;
        }

        public static /* synthetic */ boolean g(a aVar) {
            throw null;
        }

        public static /* synthetic */ StateScanFilter h(a aVar) {
            throw null;
        }

        public static /* synthetic */ ClassScanFilter i(a aVar) {
            throw null;
        }

        public static /* synthetic */ AbilityFilter j(a aVar) {
            throw null;
        }

        public static /* synthetic */ int k(a aVar) {
            throw null;
        }
    }

    public class b implements Parcelable.Creator<ONetScanOption> {
        @Override // android.os.Parcelable.Creator
        public final ONetScanOption createFromParcel(Parcel parcel) {
            return new ONetScanOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ONetScanOption[] newArray(int i) {
            return new ONetScanOption[i];
        }
    }

    public /* synthetic */ ONetScanOption(a aVar, b bVar) {
        this(aVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AbilityFilter getAbilityFilter() {
        return this.mAbilityFilter;
    }

    public ClassScanFilter getClassScanFilter() {
        return this.mClassScanFilter;
    }

    public int getClientId() {
        return this.mClientId;
    }

    public int getConnectionType() {
        return this.mConnectionType;
    }

    public int getDiscoverMode() {
        return this.mDiscoverMode;
    }

    public Bundle getExtraData() {
        return this.mExtraData;
    }

    public long getNsdScanDuration() {
        return this.mNsdScanDuration;
    }

    public long getScanDuration() {
        return this.mScanDuration;
    }

    public SCAN_MODE getScanPolicy() {
        return this.mScanMode;
    }

    public int getScanType() {
        return this.mScanType;
    }

    public StateScanFilter getStateScanFilter() {
        return this.mStateScanFilter;
    }

    public boolean isHandleByService() {
        return this.mHandleByService;
    }

    public void readFromParcel(Parcel parcel) {
        this.mScanType = parcel.readInt();
        if (h0n.b() || h0n.a(1020040) >= 0) {
            this.mScanDuration = parcel.readLong();
            this.mNsdScanDuration = parcel.readLong();
        } else {
            this.mScanDuration = parcel.readInt();
        }
        this.mScanMode = SCAN_MODE.values()[parcel.readInt()];
        this.mDiscoverMode = parcel.readInt();
        this.mHandleByService = parcel.readByte() != 0;
        this.mStateScanFilter = (StateScanFilter) parcel.readParcelable(StateScanFilter.class.getClassLoader());
        this.mClassScanFilter = (ClassScanFilter) parcel.readParcelable(ClassScanFilter.class.getClassLoader());
        this.mAbilityFilter = (AbilityFilter) parcel.readParcelable(AbilityFilter.class.getClassLoader());
        this.mConnectionType = parcel.readInt();
        if (this.mDiscoverMode == 0) {
            this.mDiscoverMode = 2;
        }
        if (h0n.b() || h0n.a(1020040) >= 0) {
            this.mExtraData = parcel.readBundle();
        }
    }

    public void setClientId(int i) {
        this.mClientId = i;
    }

    public void setConnectionType(int i) {
        this.mConnectionType = i;
    }

    public void setExtraData(Bundle bundle) {
        this.mExtraData = bundle;
    }

    public void setNsdScanDuration(long j2) {
        this.mNsdScanDuration = j2;
    }

    public void setScanDuration(long j2) {
        this.mScanDuration = j2;
    }

    public String toString() {
        StringBuilder sbA = zqm.a("ONetScanSetting{mScanType=");
        sbA.append(this.mScanType);
        sbA.append(", mScanDuration=");
        sbA.append(this.mScanDuration);
        sbA.append(", mNsdScanDuration=");
        sbA.append(this.mNsdScanDuration);
        sbA.append(", mScanMode=");
        sbA.append(this.mScanMode);
        sbA.append(", mAbilityFilter=");
        sbA.append(this.mAbilityFilter);
        sbA.append(", mDiscoverMode=");
        sbA.append(this.mDiscoverMode);
        sbA.append(", mConnectionType=");
        sbA.append(this.mConnectionType);
        sbA.append(", mHandleByService=");
        sbA.append(this.mHandleByService);
        sbA.append(", mStateScanFilter=");
        sbA.append(this.mStateScanFilter);
        sbA.append(", mClassFilter=");
        sbA.append(this.mClassScanFilter);
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mScanType);
        if (h0n.b() || h0n.a(1020040) >= 0) {
            parcel.writeLong(this.mScanDuration);
            parcel.writeLong(this.mNsdScanDuration);
        } else {
            parcel.writeInt((int) this.mScanDuration);
        }
        parcel.writeInt(this.mScanMode.ordinal());
        parcel.writeInt(this.mDiscoverMode);
        parcel.writeByte(this.mHandleByService ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.mStateScanFilter, i);
        parcel.writeParcelable(this.mClassScanFilter, i);
        parcel.writeParcelable(this.mAbilityFilter, i);
        parcel.writeInt(this.mConnectionType);
        if (h0n.b() || h0n.a(1020040) >= 0) {
            parcel.writeBundle(this.mExtraData);
        }
    }

    public ONetScanOption() {
        this.mStateScanFilter = null;
        this.mClassScanFilter = null;
        this.mAbilityFilter = null;
        this.mExtraData = new Bundle();
        this.mConnectionType = 255;
        SCAN_MODE scan_mode = SCAN_MODE.SCAN_MODE_LOW_LATENCY;
        this.mScanType = 1;
        this.mScanMode = scan_mode;
        this.mDiscoverMode = 0;
        this.mHandleByService = false;
    }

    public ONetScanOption(int i, long j2, long j3, SCAN_MODE scan_mode, int i2, boolean z, StateScanFilter stateScanFilter, ClassScanFilter classScanFilter, AbilityFilter abilityFilter, int i3) {
        this.mStateScanFilter = null;
        this.mClassScanFilter = null;
        this.mAbilityFilter = null;
        this.mExtraData = new Bundle();
        this.mConnectionType = 255;
        SCAN_MODE scan_mode2 = SCAN_MODE.SCAN_MODE_LOW_POWER;
        this.mScanType = i;
        this.mScanDuration = j2;
        this.mNsdScanDuration = j3;
        this.mScanMode = scan_mode;
        this.mDiscoverMode = i2;
        this.mHandleByService = z;
        this.mStateScanFilter = stateScanFilter;
        this.mClassScanFilter = classScanFilter;
        this.mAbilityFilter = abilityFilter;
        this.mConnectionType = i3;
        if (i2 == 0) {
            this.mDiscoverMode = 2;
        }
    }

    private ONetScanOption(a aVar) {
        this.mStateScanFilter = null;
        this.mClassScanFilter = null;
        this.mAbilityFilter = null;
        this.mExtraData = new Bundle();
        this.mConnectionType = 255;
        this.mScanMode = SCAN_MODE.SCAN_MODE_LOW_LATENCY;
        this.mDiscoverMode = 2;
        this.mScanType = a.a(aVar);
        this.mScanDuration = a.b(aVar);
        this.mNsdScanDuration = a.d(aVar);
        this.mScanMode = a.e(aVar);
        this.mDiscoverMode = a.f(aVar);
        this.mHandleByService = a.g(aVar);
        this.mStateScanFilter = a.h(aVar);
        this.mClassScanFilter = a.i(aVar);
        this.mAbilityFilter = a.j(aVar);
        this.mConnectionType = a.k(aVar);
        if (this.mDiscoverMode == 0) {
            this.mDiscoverMode = 2;
        }
        if (a.c(aVar) != null) {
            this.mExtraData.putAll(a.c(aVar));
        }
    }

    public ONetScanOption(Parcel parcel) {
        this.mStateScanFilter = null;
        this.mClassScanFilter = null;
        this.mAbilityFilter = null;
        this.mExtraData = new Bundle();
        this.mConnectionType = 255;
        this.mScanMode = SCAN_MODE.SCAN_MODE_LOW_LATENCY;
        this.mDiscoverMode = 2;
        readFromParcel(parcel);
    }
}
