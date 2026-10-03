package com.lifesense.device.scale.device.product;

/* JADX INFO: loaded from: classes4.dex */
public enum FactoryProtocol {
    Wechat("Wechat"),
    A5("A5"),
    InterConnection("InterConnection"),
    A6("A6"),
    Standard("Standard"),
    Sleepace("Sleepace");

    public String msg;

    FactoryProtocol(String str) {
        this.msg = str;
    }

    public static FactoryProtocol toFactoryProtocal(String str) {
        FactoryProtocol factoryProtocol = A5;
        for (FactoryProtocol factoryProtocol2 : values()) {
            if (factoryProtocol2.msg.equals(str)) {
                return factoryProtocol2;
            }
        }
        return factoryProtocol;
    }
}
