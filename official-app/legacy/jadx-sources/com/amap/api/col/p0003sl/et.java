package com.amap.api.col.p0003sl;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.maps.model.BaseOptions;
import com.autonavi.base.amap.mapcore.jbinding.JBindingExclude;
import com.autonavi.base.amap.mapcore.jbinding.JBindingInclude;
import com.oplus.aiunit.vision.mtm;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
@JBindingInclude
public final class et extends BaseOptions implements Parcelable {

    @JBindingExclude
    public static final Parcelable.Creator<et> CREATOR = new a();
    private float a;
    private float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f722c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f723e;
    private boolean f;
    private int g;
    private double h;
    private List<mtm> i;

    public static class a implements Parcelable.Creator<et> {
        public static et a(Parcel parcel) {
            return new et(parcel);
        }

        public static et[] b(int i) {
            return new et[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ et createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ et[] newArray(int i) {
            return b(i);
        }
    }

    public et() {
        this.a = 3.0f;
        this.b = 20.0f;
        this.f722c = Float.MIN_VALUE;
        this.d = Float.MAX_VALUE;
        this.f723e = 200.0f;
        this.f = true;
        this.g = -3355444;
        this.h = 3.0d;
        this.i = new ArrayList();
        this.type = "ContourLineOptions";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.f722c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.f723e);
        parcel.writeBooleanArray(new boolean[]{this.f});
        parcel.writeInt(this.g);
        parcel.writeDouble(this.h);
        parcel.writeList(this.i);
    }

    @JBindingExclude
    public et(Parcel parcel) {
        this.a = 3.0f;
        this.b = 20.0f;
        this.f722c = Float.MIN_VALUE;
        this.d = Float.MAX_VALUE;
        this.f723e = 200.0f;
        this.f = true;
        this.g = -3355444;
        this.h = 3.0d;
        this.i = new ArrayList();
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.f722c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.f723e = parcel.readFloat();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f = zArr[0];
        this.g = parcel.readInt();
        this.h = parcel.readDouble();
        this.i = parcel.readArrayList(mtm.class.getClassLoader());
    }
}
