package com.amap.api.services.auto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class Classify implements Parcelable {
    public static final Parcelable.Creator<Classify> CREATOR = new a();
    public ItermData itermData;
    public RetainState retainState;

    public static class Category implements Parcelable {
        public static final Parcelable.Creator<Category> CREATOR = new a();
        public int checked;
        public String classifyItemType;
        public String componentType;
        public int defaultValue;
        public String img;
        public String name;
        public String params;
        public String showType;
        public String value;

        public static class a implements Parcelable.Creator<Category> {
            public static Category a(Parcel parcel) {
                return new Category(parcel);
            }

            public static Category[] b(int i) {
                return new Category[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Category createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Category[] newArray(int i) {
                return b(i);
            }
        }

        public Category() {
        }

        public Category(Parcel parcel) {
            this.checked = parcel.readInt();
            this.componentType = parcel.readString();
            this.defaultValue = parcel.readInt();
            this.name = parcel.readString();
            this.params = parcel.readString();
            this.value = parcel.readString();
            this.classifyItemType = parcel.readString();
            this.img = parcel.readString();
            this.showType = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.checked);
            parcel.writeString(this.componentType);
            parcel.writeInt(this.defaultValue);
            parcel.writeString(this.name);
            parcel.writeString(this.params);
            parcel.writeString(this.value);
            parcel.writeString(this.classifyItemType);
            parcel.writeString(this.img);
            parcel.writeString(this.showType);
        }
    }

    public static class CheckedNode implements Parcelable {
        public static final Parcelable.Creator<CheckedNode> CREATOR = new a();
        public String id;
        public String name;
        public String value;

        public static class a implements Parcelable.Creator<CheckedNode> {
            public static CheckedNode a(Parcel parcel) {
                return new CheckedNode(parcel);
            }

            public static CheckedNode[] b(int i) {
                return new CheckedNode[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CheckedNode createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CheckedNode[] newArray(int i) {
                return b(i);
            }
        }

        public CheckedNode() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.id);
            parcel.writeString(this.value);
            parcel.writeString(this.name);
        }

        public CheckedNode(Parcel parcel) {
            this.id = parcel.readString();
            this.value = parcel.readString();
            this.name = parcel.readString();
        }
    }

    public static class CheckedValue implements Parcelable {
        public static final Parcelable.Creator<CheckedValue> CREATOR = new a();
        public String classifyV2Data;
        public String classifyV2Level2Data;
        public String classifyV2Level3Data;

        public static class a implements Parcelable.Creator<CheckedValue> {
            public static CheckedValue a(Parcel parcel) {
                return new CheckedValue(parcel);
            }

            public static CheckedValue[] b(int i) {
                return new CheckedValue[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CheckedValue createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ CheckedValue[] newArray(int i) {
                return b(i);
            }
        }

        public CheckedValue() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.classifyV2Data);
            parcel.writeString(this.classifyV2Level2Data);
            parcel.writeString(this.classifyV2Level3Data);
        }

        public CheckedValue(Parcel parcel) {
            this.classifyV2Data = parcel.readString();
            this.classifyV2Level2Data = parcel.readString();
            this.classifyV2Level3Data = parcel.readString();
        }
    }

    public static class Data implements Parcelable {
        public static final Parcelable.Creator<Data> CREATOR = new a();
        public List<DataCategory> categories;
        public int checked;
        public String classifyItemType;
        public int isCancelDefaultSelect;
        public int isNoBtn;
        public int multiSelect;
        public String name;
        public String params;
        public String separator;
        public String type;
        public int useCommonlyUsedConfig;
        public int useLocalConfig;
        public int useRemoteConfig;

        public static class a implements Parcelable.Creator<Data> {
            public static Data a(Parcel parcel) {
                return new Data(parcel);
            }

            public static Data[] b(int i) {
                return new Data[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Data createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Data[] newArray(int i) {
                return b(i);
            }
        }

        public Data() {
        }

        public Data(Parcel parcel) {
            this.categories = parcel.createTypedArrayList(DataCategory.CREATOR);
            this.checked = parcel.readInt();
            this.classifyItemType = parcel.readString();
            this.isCancelDefaultSelect = parcel.readInt();
            this.isNoBtn = parcel.readInt();
            this.name = parcel.readString();
            this.params = parcel.readString();
            this.separator = parcel.readString();
            this.type = parcel.readString();
            this.useCommonlyUsedConfig = parcel.readInt();
            this.useLocalConfig = parcel.readInt();
            this.useRemoteConfig = parcel.readInt();
            this.multiSelect = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.categories);
            parcel.writeInt(this.checked);
            parcel.writeString(this.classifyItemType);
            parcel.writeInt(this.isCancelDefaultSelect);
            parcel.writeInt(this.isNoBtn);
            parcel.writeString(this.name);
            parcel.writeString(this.params);
            parcel.writeString(this.separator);
            parcel.writeString(this.type);
            parcel.writeInt(this.useCommonlyUsedConfig);
            parcel.writeInt(this.useLocalConfig);
            parcel.writeInt(this.useRemoteConfig);
            parcel.writeInt(this.multiSelect);
        }
    }

    public static class DataCategory implements Parcelable {
        public static final Parcelable.Creator<DataCategory> CREATOR = new a();
        public int areaSubwayMark;
        public List<Category> categories;
        public int checked;
        public String classifyItemType;
        public String componentType;
        public int defaultValue;
        public int hideTitle;
        public String img;
        public int maxShowNum;
        public int maxShowNumRow;
        public int multiSelect;
        public String name;
        public String params;
        public String showType;
        public String value;

        public static class a implements Parcelable.Creator<DataCategory> {
            public static DataCategory a(Parcel parcel) {
                return new DataCategory(parcel);
            }

            public static DataCategory[] b(int i) {
                return new DataCategory[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DataCategory createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ DataCategory[] newArray(int i) {
                return b(i);
            }
        }

        public DataCategory() {
        }

        public DataCategory(Parcel parcel) {
            this.categories = parcel.createTypedArrayList(Category.CREATOR);
            this.checked = parcel.readInt();
            this.defaultValue = parcel.readInt();
            this.componentType = parcel.readString();
            this.name = parcel.readString();
            this.params = parcel.readString();
            this.areaSubwayMark = parcel.readInt();
            this.hideTitle = parcel.readInt();
            this.maxShowNum = parcel.readInt();
            this.maxShowNumRow = parcel.readInt();
            this.multiSelect = parcel.readInt();
            this.img = parcel.readString();
            this.showType = parcel.readString();
            this.value = parcel.readString();
            this.classifyItemType = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.categories);
            parcel.writeInt(this.checked);
            parcel.writeInt(this.defaultValue);
            parcel.writeString(this.componentType);
            parcel.writeString(this.name);
            parcel.writeString(this.params);
            parcel.writeInt(this.areaSubwayMark);
            parcel.writeInt(this.hideTitle);
            parcel.writeInt(this.maxShowNum);
            parcel.writeInt(this.maxShowNumRow);
            parcel.writeInt(this.multiSelect);
            parcel.writeString(this.img);
            parcel.writeString(this.showType);
            parcel.writeString(this.value);
            parcel.writeString(this.classifyItemType);
        }
    }

    public static class ItermData implements Parcelable {
        public static final Parcelable.Creator<ItermData> CREATOR = new a();
        public List<CheckedNode> checkedNodes;
        public CheckedValue checkedValue;
        public List<Data> datas;
        public List<Data> defaultPositionDatas;
        public List<Data> level2Datas;

        public static class a implements Parcelable.Creator<ItermData> {
            public static ItermData a(Parcel parcel) {
                return new ItermData(parcel);
            }

            public static ItermData[] b(int i) {
                return new ItermData[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ItermData createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ItermData[] newArray(int i) {
                return b(i);
            }
        }

        public ItermData() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.checkedNodes);
            parcel.writeParcelable(this.checkedValue, i);
            parcel.writeTypedList(this.datas);
            parcel.writeTypedList(this.defaultPositionDatas);
            parcel.writeTypedList(this.level2Datas);
        }

        public ItermData(Parcel parcel) {
            this.checkedNodes = parcel.createTypedArrayList(CheckedNode.CREATOR);
            this.checkedValue = (CheckedValue) parcel.readParcelable(CheckedValue.class.getClassLoader());
            Parcelable.Creator<Data> creator = Data.CREATOR;
            this.datas = parcel.createTypedArrayList(creator);
            this.defaultPositionDatas = parcel.createTypedArrayList(creator);
            this.level2Datas = parcel.createTypedArrayList(creator);
        }
    }

    public static class RetainState implements Parcelable {
        public static final Parcelable.Creator<RetainState> CREATOR = new a();
        public String classifyBusinessType;
        public String classifyConf;
        public String classifyRetainLevel2;
        public String level2All;
        public String newClassifyCityadcode;
        public String newClassifyFlag;

        public static class a implements Parcelable.Creator<RetainState> {
            public static RetainState a(Parcel parcel) {
                return new RetainState(parcel);
            }

            public static RetainState[] b(int i) {
                return new RetainState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ RetainState createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ RetainState[] newArray(int i) {
                return b(i);
            }
        }

        public RetainState() {
        }

        public RetainState(Parcel parcel) {
            this.classifyBusinessType = parcel.readString();
            this.classifyConf = parcel.readString();
            this.classifyRetainLevel2 = parcel.readString();
            this.level2All = parcel.readString();
            this.newClassifyCityadcode = parcel.readString();
            this.newClassifyFlag = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.classifyBusinessType);
            parcel.writeString(this.classifyConf);
            parcel.writeString(this.classifyRetainLevel2);
            parcel.writeString(this.level2All);
            parcel.writeString(this.newClassifyCityadcode);
            parcel.writeString(this.newClassifyFlag);
        }
    }

    public static class a implements Parcelable.Creator<Classify> {
        public static Classify a(Parcel parcel) {
            return new Classify(parcel);
        }

        public static Classify[] b(int i) {
            return new Classify[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Classify createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Classify[] newArray(int i) {
            return b(i);
        }
    }

    public Classify() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.itermData, i);
        parcel.writeParcelable(this.retainState, i);
    }

    public Classify(Parcel parcel) {
        this.itermData = (ItermData) parcel.readParcelable(ItermData.class.getClassLoader());
        this.retainState = (RetainState) parcel.readParcelable(RetainState.class.getClassLoader());
    }
}
