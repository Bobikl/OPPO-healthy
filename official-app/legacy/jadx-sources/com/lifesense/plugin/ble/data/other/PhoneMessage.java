package com.lifesense.plugin.ble.data.other;

/* JADX INFO: loaded from: classes5.dex */
public class PhoneMessage {
    private String brand;
    private String model;
    private String osVersion;
    private String product;
    private int sdkVersion;

    public synchronized String getBrand() {
        return this.brand;
    }

    public synchronized String getModel() {
        return this.model;
    }

    public synchronized String getOsVersion() {
        return this.osVersion;
    }

    public synchronized String getProduct() {
        return this.product;
    }

    public synchronized int getSdkVersion() {
        return this.sdkVersion;
    }

    public synchronized void setBrand(String str) {
        this.brand = str;
    }

    public synchronized void setModel(String str) {
        this.model = str;
    }

    public synchronized void setOsVersion(String str) {
        this.osVersion = str;
    }

    public synchronized void setProduct(String str) {
        this.product = str;
    }

    public synchronized void setSdkVersion(int i) {
        this.sdkVersion = i;
    }

    public String toString() {
        return "PhoneMessage [brand=" + this.brand + ", model=" + this.model + ", product=" + this.product + ", osVersion=" + this.osVersion + ", sdkVersion=" + this.sdkVersion + "]";
    }
}
