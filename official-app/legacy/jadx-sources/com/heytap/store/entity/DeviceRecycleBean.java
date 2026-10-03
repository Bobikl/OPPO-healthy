package com.heytap.store.entity;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceRecycleBean extends BaseResponseData<Data> {

    public static class Data implements IBean {
        public double discountMoney;
        public boolean isShow;
        public long productId;
        public String productLink;
        public String productLogo;
        public String productName;
        public String recycleLink;
        public double recyclePrice;
        public int showName;
        public String title;

        public String toString() {
            return "Data{productId=" + this.productId + ", title='" + this.title + "', productName='" + this.productName + "', recyclePrice=" + this.recyclePrice + ", productLogo='" + this.productLogo + "', discountMoney=" + this.discountMoney + ", productLink='" + this.productLink + "', recycleLink='" + this.recycleLink + "', isShow=" + this.isShow + '}';
        }
    }
}
