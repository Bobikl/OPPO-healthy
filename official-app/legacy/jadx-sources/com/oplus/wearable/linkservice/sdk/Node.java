package com.oplus.wearable.linkservice.sdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.gdb;
import com.oplus.wearable.linkservice.sdk.common.Module;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class Node implements Parcelable {
    public static final String ADDRESS = "address";
    public static final Parcelable.Creator<Node> CREATOR = new a();
    private static final String DEVICE_ROLE = "DEVICE_ROLE";
    private static final String DISCONNECT_CODE = "DISCONNECT_CODE";
    public static final String I_KEY = "key";
    public static final String I_TAG = "R1";
    public static final int ROLE_NULL = -1;
    public static final int ROLE_PRIMARY = 1;
    public static final int ROLE_SECONDARY = 2;
    private String mDisplayName;
    private final Bundle mExtra;
    private Module mMainModule;
    private String mModel;
    private String mNodeId;
    private Module mStubModule;

    public class a implements Parcelable.Creator<Node> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Node createFromParcel(Parcel parcel) {
            return new Node(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Node[] newArray(int i) {
            return new Node[i];
        }
    }

    public static class b {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20141c = -1;
        public int d = -1;

        public Node a() {
            if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b)) {
                throw new IllegalArgumentException("can not build because main mac isEmpty && stub mac isEmpty");
            }
            if (TextUtils.isEmpty(this.a)) {
                this.a = this.b;
                this.b = "";
            }
            Node node = new Node(this.a);
            if (!TextUtils.isEmpty(this.a)) {
                Module module = new Module();
                module.setConnectionType(this.f20141c);
                module.setNodeId(this.a);
                module.setMacAddress(this.a);
                node.setMainModule(module);
            }
            if (!TextUtils.isEmpty(this.b)) {
                Module module2 = new Module();
                module2.setConnectionType(this.d);
                module2.setNodeId(this.a);
                module2.setMacAddress(this.b);
                node.setStubModule(module2);
            }
            return node;
        }

        public b b(String str, int i) {
            this.a = str;
            this.f20141c = i;
            return this;
        }

        public b c(String str, int i) {
            this.b = str;
            this.d = i;
            return this;
        }
    }

    private Node() {
        this.mExtra = new Bundle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.mExtra.getString("address", "");
    }

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public int getErrorCode() {
        return this.mExtra.getInt(DISCONNECT_CODE, 0);
    }

    @NonNull
    public Bundle getExtra() {
        return this.mExtra;
    }

    public Module getMainModule() {
        return this.mMainModule;
    }

    public String getModel() {
        return this.mModel;
    }

    public String getNodeId() {
        return this.mNodeId;
    }

    public int getRole() {
        return this.mExtra.getInt(DEVICE_ROLE, 1);
    }

    public Module getStubModule() {
        return this.mStubModule;
    }

    public boolean isConnected() {
        return isMainModule() || isStubModule();
    }

    public boolean isMainModule() {
        Module module = this.mMainModule;
        if (module != null) {
            return module.isConnected();
        }
        return false;
    }

    public boolean isSmartDevice() {
        int connectionType;
        Module module = this.mStubModule;
        if (module != null) {
            connectionType = module.getConnectionType();
        } else {
            Module module2 = this.mMainModule;
            connectionType = module2 != null ? module2.getConnectionType() : -1;
        }
        return connectionType == 6 || connectionType == 1 || connectionType == 2 || connectionType == 9;
    }

    public boolean isStubModule() {
        Module module;
        if (isSmartDevice() && (module = this.mStubModule) != null) {
            return module.isConnected();
        }
        return false;
    }

    public void putAddress(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.mExtra.putString("address", str);
    }

    public void putErrorCode(int i) {
        this.mExtra.putInt(DISCONNECT_CODE, i);
    }

    public void putKey(String str) {
        this.mExtra.putString("key", str);
    }

    public void putR1(String str) {
        this.mExtra.putString(I_TAG, str);
    }

    public void putRole(int i) {
        this.mExtra.putInt(DEVICE_ROLE, i);
    }

    public void setDisplayName(String str) {
        this.mDisplayName = str;
    }

    public void setMainModule(Module module) {
        this.mMainModule = module;
    }

    public void setModel(String str) {
        this.mModel = str;
    }

    public void setStubModule(Module module) {
        this.mStubModule = module;
    }

    public String toString() {
        return "Node{mDisplayName='" + this.mDisplayName + "', mNodeId='" + gdb.a(this.mNodeId) + "', code=" + getErrorCode() + ", mMainModule=" + this.mMainModule + ", mStubModule=" + this.mStubModule + ", mModel=" + this.mModel + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDisplayName);
        parcel.writeString(this.mNodeId);
        parcel.writeParcelable(this.mMainModule, i);
        parcel.writeParcelable(this.mStubModule, i);
        parcel.writeString(this.mModel);
        parcel.writeBundle(this.mExtra);
    }

    public Node(String str) {
        this.mExtra = new Bundle();
        this.mNodeId = str;
    }

    public Node(Node node) {
        Bundle bundle = new Bundle();
        this.mExtra = bundle;
        this.mDisplayName = node.mDisplayName;
        this.mNodeId = node.mNodeId;
        this.mMainModule = node.mMainModule;
        this.mStubModule = node.mStubModule;
        this.mModel = node.mModel;
        bundle.putAll(node.mExtra);
    }

    public Node(Parcel parcel) {
        Bundle bundle = new Bundle();
        this.mExtra = bundle;
        this.mDisplayName = parcel.readString();
        this.mNodeId = parcel.readString();
        this.mMainModule = (Module) parcel.readParcelable(Module.class.getClassLoader());
        this.mStubModule = (Module) parcel.readParcelable(Module.class.getClassLoader());
        this.mModel = parcel.readString();
        bundle.putAll(parcel.readBundle(getClass().getClassLoader()));
    }
}
