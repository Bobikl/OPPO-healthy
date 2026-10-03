package com.heytap.health.wallet.bean;

import androidx.annotation.Keep;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class DetectList {
    private boolean keyB;

    @Keep
    private ArrayList<Detect> probeList = new ArrayList<>();
    private int sectorIndex;

    @Keep
    public static class Detect {

        @Keep
        public long median;
        public ArrayList<Sample> ntList = new ArrayList<>();

        @Keep
        public int tolerance;
    }

    public static class Sample {

        @Keep
        public long nt;

        @Keep
        public long ntEnc;

        @Keep
        public int[] parity = {0, 0, 0};
    }

    public Detect getByIndex(int i) {
        if (i < 0 || i >= this.probeList.size()) {
            return null;
        }
        return this.probeList.get(i);
    }

    public int getSectorIndex() {
        return this.sectorIndex;
    }

    public boolean isKeyB() {
        return this.keyB;
    }

    public void setKeyB(boolean z) {
        this.keyB = z;
    }

    public void setSectorIndex(int i) {
        this.sectorIndex = i;
    }

    public int size() {
        ArrayList<Detect> arrayList = this.probeList;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }
}
