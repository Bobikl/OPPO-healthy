package com.oplus.aiunit.core;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.i0;
import com.oplus.aiunit.vision.rjg;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class ParamPackage implements Parcelable {
    private static final String BLACK_REGEX = "uuid";
    private static final String BLACK_STR_KEY = "text";
    public static final Parcelable.Creator<ParamPackage> CREATOR = new a();
    private static final int STRING_MAX_LENGTH_TO_PRINT = 1000;
    private static final String TAG = "ParamPackage";
    private final Map<String, Object> mPackageInfo = new HashMap();
    private Bundle mExtra = new Bundle();

    public class a implements Parcelable.Creator<ParamPackage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParamPackage createFromParcel(Parcel parcel) {
            return new ParamPackage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParamPackage[] newArray(int i) {
            return new ParamPackage[i];
        }
    }

    public ParamPackage() {
    }

    public void cleanParam() {
        this.mPackageInfo.clear();
    }

    public void delParam(String str) {
        this.mPackageInfo.remove(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public Bundle getDetectorExtras() {
        if (this.mPackageInfo.containsKey("ai::key::detector_extras") && (this.mPackageInfo.get("ai::key::detector_extras") instanceof Bundle)) {
            return (Bundle) this.mPackageInfo.get("ai::key::detector_extras");
        }
        return null;
    }

    public Object getParam(String str) {
        return this.mPackageInfo.get(str);
    }

    public boolean getParamBoolean(String str) {
        String paramStr = getParamStr(str);
        if (paramStr == null || paramStr.isEmpty()) {
            return false;
        }
        return Boolean.parseBoolean(paramStr);
    }

    public <T> T getParamCallback(String str) {
        IBinder iBinder;
        if (this.mPackageInfo.containsKey(str) && (this.mPackageInfo.get(str) instanceof IBinder) && (iBinder = (IBinder) this.mPackageInfo.get(str)) != null) {
            try {
                return (T) Class.forName(getParamStr(str + "::class")).getMethod("asInterface", IBinder.class).invoke(null, iBinder);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public <T> T getParamCallbackDirectly(String str) {
        T t;
        if (this.mPackageInfo.containsKey(str) && (this.mPackageInfo.get(str) instanceof IBinder) && (t = (T) ((IBinder) this.mPackageInfo.get(str))) != null) {
            return t;
        }
        return null;
    }

    public Bundle getParamExtra() {
        return this.mExtra;
    }

    public float getParamFloat(String str) {
        String paramStr = getParamStr(str);
        if (paramStr == null || paramStr.isEmpty()) {
            return 0.0f;
        }
        return Float.parseFloat(paramStr);
    }

    public int getParamInt(String str) {
        String paramStr = getParamStr(str);
        if (paramStr == null || paramStr.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(paramStr);
    }

    public Map<String, Object> getParamMap() {
        return this.mPackageInfo;
    }

    @SuppressLint({"NewApi"})
    public <T> T getParamParcelable(String str, Class<T> cls) {
        return (T) this.mExtra.getParcelable(str, cls);
    }

    public String getParamStr(String str) {
        return (this.mPackageInfo.containsKey(str) && (this.mPackageInfo.get(str) instanceof String)) ? (String) this.mPackageInfo.get(str) : "";
    }

    public Set<Map.Entry<String, String>> getParamStrEntrySet() {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, Object> entry : this.mPackageInfo.entrySet()) {
            if (entry.getValue() instanceof String) {
                hashSet.add(new AbstractMap.SimpleEntry(entry.getKey(), (String) entry.getValue()));
            }
        }
        return hashSet;
    }

    public void mergeParam(ParamPackage paramPackage) {
        for (Map.Entry<String, Object> entry : paramPackage.getParamMap().entrySet()) {
            setParam(entry.getKey(), entry.getValue());
        }
        if (this.mExtra == null || paramPackage.getParamExtra() == null) {
            return;
        }
        this.mExtra.putAll(paramPackage.getParamExtra());
    }

    public void readFromParcel(Parcel parcel) {
        parcel.readMap(this.mPackageInfo, null);
        try {
            this.mExtra = parcel.readBundle(getClass().getClassLoader());
        } catch (IllegalStateException e2) {
            i0.c(TAG, "readFromParcel: " + e2);
        }
        rjg.a(this.mPackageInfo);
    }

    public String removeParamStr(String str) {
        Object objRemove = this.mPackageInfo.remove(str);
        return objRemove == null ? "" : objRemove.toString();
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.mExtra.setClassLoader(classLoader);
    }

    public void setDetectorExtras(Bundle bundle) {
        setParam("ai::key::detector_extras", bundle);
    }

    public <E> void setParam(String str, E e2) {
        String interfaceDescriptor;
        if (!(e2 instanceof IBinder)) {
            if (e2 instanceof Parcelable) {
                this.mPackageInfo.put(str, e2);
                return;
            } else {
                this.mPackageInfo.put(str, String.valueOf(e2));
                return;
            }
        }
        try {
            interfaceDescriptor = ((IBinder) e2).getInterfaceDescriptor();
        } catch (RemoteException e3) {
            e3.printStackTrace();
            interfaceDescriptor = "";
        }
        this.mPackageInfo.put(str, e2);
        this.mPackageInfo.put(str + "::class", interfaceDescriptor + "$Stub");
    }

    public void setParamExtra(Bundle bundle) {
        if (bundle != null) {
            this.mExtra = bundle;
        }
    }

    public <E extends Parcelable> void setParamParcelable(String str, E e2) {
        this.mExtra.putParcelable(str, e2);
    }

    public void setParamStr(String str, String str2) {
        setParam(str, str2);
    }

    public void setParamStringNoPrint(String str, String str2) {
        this.mPackageInfo.put(str, str2);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ParamPackage {");
        for (Map.Entry<String, Object> entry : this.mPackageInfo.entrySet()) {
            if (entry.getKey().contains(FramePackage.JSON_SOURCE_NAME) || entry.getKey().contains(FramePackage.JSON_RESULT_NAME) || entry.getKey().contains("text")) {
                String string = entry.getValue().toString();
                int length = string.length();
                if (length > 4) {
                    string = string.substring(0, 2) + "****" + string.substring(length - 2, length);
                }
                sb.append("\n\t[");
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(string);
                sb.append("]");
            } else if (!entry.getKey().contains("uuid")) {
                sb.append("\n\t[");
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue());
                sb.append("]");
            }
        }
        sb.append("\n}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.mPackageInfo);
        parcel.writeBundle(this.mExtra);
    }

    public ParamPackage(Parcel parcel) {
        readFromParcel(parcel);
    }
}
