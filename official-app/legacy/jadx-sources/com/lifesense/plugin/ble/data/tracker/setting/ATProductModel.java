package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATProductModel {
    Unknown("null"),
    Mambo("405"),
    MamboCall("405-1"),
    MamboHR("405-2"),
    Bonbon("407"),
    BonbonC("410"),
    MamboWatch("415"),
    Mambo2("417"),
    Ziva("418"),
    MamboDD("421"),
    MamboMID("422"),
    Mambo3("428");

    private final String model;

    ATProductModel(String str) {
        this.model = str;
    }

    public boolean equalsName(String str) {
        return this.model.equals(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.model;
    }
}
