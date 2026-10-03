package com.heytap.databaseengine.option;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\r\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u00010B\t\b\u0016¢\u0006\u0004\b+\u0010,B\u0011\b\u0016\u0012\u0006\u0010-\u001a\u00020\u0007¢\u0006\u0004\b+\u0010.J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R.\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00061"}, d2 = {"Lcom/heytap/databaseengine/option/DataReadOptionV2;", "Lcom/heytap/databaseengine/option/DataReadOption;", "Landroid/os/Parcelable;", "", "toString", "", "describeContents", "Landroid/os/Parcel;", "dest", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "", "readConfig", "Ljava/util/Map;", "getReadConfig", "()Ljava/util/Map;", "setReadConfig", "(Ljava/util/Map;)V", "", "readValidCountData", "Z", "getReadValidCountData", "()Z", "setReadValidCountData", "(Z)V", "", "deviceCategoryList", "Ljava/util/List;", "getDeviceCategoryList", "()Ljava/util/List;", "setDeviceCategoryList", "(Ljava/util/List;)V", "readCondition", "getReadCondition", "setReadCondition", "", "intConditionArray", "[I", "getIntConditionArray", "()[I", "setIntConditionArray", "([I)V", "<init>", "()V", "in", "(Landroid/os/Parcel;)V", "CREATOR", "a", "heytap_health_sdk_v2.1.7_release"}, k = 1, mv = {1, 8, 0})
public final class DataReadOptionV2 extends DataReadOption {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<String> deviceCategoryList;

    @Nullable
    private int[] intConditionArray;

    @NotNull
    private Map<String, String> readCondition;

    @NotNull
    private Map<Integer, Integer> readConfig;
    private boolean readValidCountData;

    /* JADX INFO: renamed from: com.heytap.databaseengine.option.DataReadOptionV2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/databaseengine/option/DataReadOptionV2$a;", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/databaseengine/option/DataReadOptionV2;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/heytap/databaseengine/option/DataReadOptionV2;", "<init>", "()V", "heytap_health_sdk_v2.1.7_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<DataReadOptionV2> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataReadOptionV2 createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new DataReadOptionV2(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataReadOptionV2[] newArray(int size) {
            return new DataReadOptionV2[size];
        }
    }

    public DataReadOptionV2() {
        this.readConfig = new HashMap();
        this.readCondition = new HashMap();
    }

    @Override // com.heytap.databaseengine.option.DataReadOption, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final List<String> getDeviceCategoryList() {
        return this.deviceCategoryList;
    }

    @Nullable
    public final int[] getIntConditionArray() {
        return this.intConditionArray;
    }

    @NotNull
    public final Map<String, String> getReadCondition() {
        return this.readCondition;
    }

    @NotNull
    public final Map<Integer, Integer> getReadConfig() {
        return this.readConfig;
    }

    public final boolean getReadValidCountData() {
        return this.readValidCountData;
    }

    public final void setDeviceCategoryList(@Nullable List<String> list) {
        this.deviceCategoryList = list;
    }

    public final void setIntConditionArray(@Nullable int[] iArr) {
        this.intConditionArray = iArr;
    }

    public final void setReadCondition(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.readCondition = map;
    }

    public final void setReadConfig(@NotNull Map<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.readConfig = map;
    }

    public final void setReadValidCountData(boolean z) {
        this.readValidCountData = z;
    }

    @Override // com.heytap.databaseengine.option.DataReadOption
    @NotNull
    public String toString() {
        return "DataReadOptionV2(readConfig=" + this.readConfig + ", readValidCountData=" + this.readValidCountData + ", deviceCategoryList=" + this.deviceCategoryList + ", readCondition=" + this.readCondition + "， intConditionArray=" + this.intConditionArray + ")";
    }

    @Override // com.heytap.databaseengine.option.DataReadOption, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, flags);
        dest.writeInt(this.readConfig.size());
        for (Map.Entry<Integer, Integer> entry : this.readConfig.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            dest.writeValue(Integer.valueOf(iIntValue));
            dest.writeValue(Integer.valueOf(iIntValue2));
        }
        dest.writeByte(this.readValidCountData ? (byte) 1 : (byte) 0);
        dest.writeStringList(this.deviceCategoryList);
        dest.writeInt(this.readCondition.size());
        for (Map.Entry<String, String> entry2 : this.readCondition.entrySet()) {
            String key = entry2.getKey();
            String value = entry2.getValue();
            dest.writeValue(key);
            dest.writeValue(value);
        }
        dest.writeIntArray(this.intConditionArray);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataReadOptionV2(@NotNull Parcel in) {
        super(in);
        Intrinsics.checkNotNullParameter(in, "in");
        this.readConfig = new HashMap();
        this.readCondition = new HashMap();
        int i = in.readInt();
        this.readConfig = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            Class cls = Integer.TYPE;
            Object value = in.readValue(cls.getClassLoader());
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) value).intValue();
            Object value2 = in.readValue(cls.getClassLoader());
            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) value2).intValue();
            Map<Integer, Integer> map = this.readConfig;
            Intrinsics.checkNotNull(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.Int, kotlin.Int>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Int, kotlin.Int> }");
            ((HashMap) map).put(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
        this.readValidCountData = in.readByte() != 0;
        this.deviceCategoryList = in.createStringArrayList();
        int i3 = in.readInt();
        this.readCondition = new HashMap(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            Object value3 = in.readValue(String.class.getClassLoader());
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.String");
            Object value4 = in.readValue(String.class.getClassLoader());
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.String");
            Map<String, String> map2 = this.readCondition;
            Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
            ((HashMap) map2).put((String) value3, (String) value4);
        }
        this.intConditionArray = in.createIntArray();
    }
}
