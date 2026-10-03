package com.heytap.health.devicemanager.processor.cloudaccess.response;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class ProductCategoryRsp {
    public List<ProductCategory> modelsList;

    @Keep
    public static class Product {
        public String deviceName;
        public int deviceType;
        public List<ImageList> imageList;
        public String imageUrl;
        public String model;
        public String slogan;
        public String thirdPartyModel;

        @Keep
        public static class ImageList {
            public String imageTypeCode;
            public String imageUrl;

            public String toString() {
                return "ImageList{imageUrl='" + this.imageUrl + "', imageTypeCode='" + this.imageTypeCode + "'}";
            }
        }

        public String toString() {
            return "Product{deviceType=" + this.deviceType + ", deviceName='" + this.deviceName + "', model='" + this.model + "', slogan='" + this.slogan + "', imageUrl='" + this.imageUrl + "', thirdPartyModel='" + this.thirdPartyModel + "', imageList=" + this.imageList + '}';
        }
    }

    @Keep
    public static class ProductCategory {
        public String deviceTypeName;
        public List<Product> modelList;
    }
}
