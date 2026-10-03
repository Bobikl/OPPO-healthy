package com.lifesense.device.scale.device.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.annotation.JSONField;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceType;
import com.lifesense.android.bluetooth.core.enums.ProtocolType;
import com.lifesense.weidong.lzsimplenetlibs.base.BaseResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public class DisplayProduct extends BaseResponse implements Parcelable {
    public static final Parcelable.Creator<DisplayProduct> CREATOR = new Parcelable.Creator<DisplayProduct>() { // from class: com.lifesense.device.scale.device.product.DisplayProduct.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DisplayProduct createFromParcel(Parcel parcel) {
            return new DisplayProduct(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DisplayProduct[] newArray(int i) {
            return new DisplayProduct[i];
        }
    };
    public int defaultBindMode;
    public long displayProductId;

    @JSONField(name = "factoryProducts")
    public List<FactoryProduct> factoryProducts;
    public Long id;
    public String imageUrl;
    public String name;
    public String otherBindModes;
    public int productTypeCode;

    /* JADX INFO: renamed from: com.lifesense.device.scale.device.product.DisplayProduct$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$lifesense$device$scale$device$product$DisplayProductType;
        public static final /* synthetic */ int[] $SwitchMap$com$lifesense$device$scale$device$product$FactoryProtocol;

        static {
            int[] iArr = new int[DisplayProductType.values().length];
            $SwitchMap$com$lifesense$device$scale$device$product$DisplayProductType = iArr;
            try {
                iArr[DisplayProductType.bloodPressure.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$lifesense$device$scale$device$product$DisplayProductType[DisplayProductType.weight.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$lifesense$device$scale$device$product$DisplayProductType[DisplayProductType.interconnection.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$lifesense$device$scale$device$product$DisplayProductType[DisplayProductType.pedometer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[FactoryProtocol.values().length];
            $SwitchMap$com$lifesense$device$scale$device$product$FactoryProtocol = iArr2;
            try {
                iArr2[FactoryProtocol.A6.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$lifesense$device$scale$device$product$FactoryProtocol[FactoryProtocol.InterConnection.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public DisplayProduct() {
    }

    public DisplayProduct(Parcel parcel) {
        this.id = (Long) parcel.readValue(Long.class.getClassLoader());
        this.displayProductId = parcel.readLong();
        this.name = parcel.readString();
        this.imageUrl = parcel.readString();
        this.productTypeCode = parcel.readInt();
        this.defaultBindMode = parcel.readInt();
        this.otherBindModes = parcel.readString();
        this.factoryProducts = parcel.createTypedArrayList(FactoryProduct.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<String> getBroadcastNames() {
        ArrayList arrayList = new ArrayList();
        Iterator<FactoryProduct> it = getFactoryProducts().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getBluetoothBroadcastName().toUpperCase());
        }
        return arrayList;
    }

    public int getDefaultBindMode() {
        return this.defaultBindMode;
    }

    public List<DeviceType> getDeviceTypes() {
        DeviceType deviceType;
        ArrayList arrayList = new ArrayList();
        int i = AnonymousClass2.$SwitchMap$com$lifesense$device$scale$device$product$DisplayProductType[getDisplayProductType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                deviceType = DeviceType.FAT_SCALE;
            } else if (i == 3) {
                arrayList.add(DeviceType.BLOOD_PRESSURE);
                deviceType = DeviceType.FAT_SCALE;
            } else if (i == 4) {
                deviceType = DeviceType.PEDOMETER;
            }
            return arrayList;
        }
        deviceType = DeviceType.BLOOD_PRESSURE;
        arrayList.add(deviceType);
        return arrayList;
    }

    public DisplayBindType getDisplayBindType() {
        return DisplayBindType.toDisplayBindType(this.defaultBindMode);
    }

    public long getDisplayProductId() {
        return this.displayProductId;
    }

    public DisplayProductType getDisplayProductType() {
        return DisplayProductType.toProductType(this.productTypeCode);
    }

    public String getFactoryNameByBroadCastName(String str) {
        for (FactoryProduct factoryProduct : getFactoryProducts()) {
            if (factoryProduct.getBluetoothBroadcastName().equalsIgnoreCase(str)) {
                return factoryProduct.getName();
            }
        }
        return str;
    }

    public List<FactoryProduct> getFactoryProducts() {
        return this.factoryProducts;
    }

    public Long getId() {
        return this.id;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getName() {
        return this.name;
    }

    public String getOtherBindModes() {
        return this.otherBindModes;
    }

    public int getProductTypeCode() {
        return this.productTypeCode;
    }

    public ProtocolType getProtocolType() {
        ProtocolType protocolType = ProtocolType.UNKNOWN;
        int i = AnonymousClass2.$SwitchMap$com$lifesense$device$scale$device$product$FactoryProtocol[getFactoryProducts().get(0).getFactoryProtocal().ordinal()];
        return (i == 1 || i == 2) ? ProtocolType.A6 : protocolType;
    }

    public boolean isContainsModel(String str) {
        if (CollectionUtils.isEmpty(this.factoryProducts)) {
            return false;
        }
        for (FactoryProduct factoryProduct : this.factoryProducts) {
            if (!StringUtils.isEmpty(factoryProduct.getModel()) && factoryProduct.getModel().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public void setDefaultBindMode(int i) {
        this.defaultBindMode = i;
    }

    public void setDisplayProductId(long j2) {
        this.displayProductId = j2;
    }

    public void setFactoryProducts(List<FactoryProduct> list) {
        this.factoryProducts = list;
    }

    public void setId(Long l2) {
        this.id = l2;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOtherBindModes(String str) {
        this.otherBindModes = str;
    }

    public void setProductTypeCode(int i) {
        this.productTypeCode = i;
    }

    public String toString() {
        return "DisplayProduct{id=" + this.id + ", displayProductId=" + this.displayProductId + ", name='" + this.name + "', imageUrl='" + this.imageUrl + "', productTypeCode=" + this.productTypeCode + ", defaultBindMode=" + this.defaultBindMode + ", otherBindModes='" + this.otherBindModes + "', factoryProducts=" + this.factoryProducts + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.id);
        parcel.writeLong(this.displayProductId);
        parcel.writeString(this.name);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.productTypeCode);
        parcel.writeInt(this.defaultBindMode);
        parcel.writeString(this.otherBindModes);
        parcel.writeTypedList(this.factoryProducts);
    }

    public DisplayProduct(Long l2, long j2, String str, String str2, int i, int i2, String str3) {
        this.id = l2;
        this.displayProductId = j2;
        this.name = str;
        this.imageUrl = str2;
        this.productTypeCode = i;
        this.defaultBindMode = i2;
        this.otherBindModes = str3;
    }
}
