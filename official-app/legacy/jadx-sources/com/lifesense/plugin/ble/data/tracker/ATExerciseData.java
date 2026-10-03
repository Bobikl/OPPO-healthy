package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATExerciseData extends ATDeviceData {
    private int avgHeartRate;
    private float avgSpeed;
    private int avgStepFrequency;
    private int avgStride;
    private float calories;
    private ATExerciseType category;
    private int distance;
    private List exerciseStatus;
    private int flag;
    private float[] heartRateZoneTimeRatio;
    private int maxHeartRate;
    private float maxSpeed;
    private int maxStepFrequency;
    private int mode;
    private int numOfSwimming;
    private int pausesCount;
    private long startUtc;
    private int step;
    private long stopUtc;
    private int time;

    public ATExerciseData(byte[] bArr) {
        super(bArr);
    }

    private float formatExerciseCalories(int i) {
        if (i == -1) {
            return 0.0f;
        }
        return (float) (((double) Math.round(((float) (((double) i) * 0.1d)) * 10.0f)) * 0.1d);
    }

    private int formatExerciseDistance(int i) {
        if (i == -1) {
            return 0;
        }
        return i;
    }

    private float formatExerciseSpeed(int i) {
        if (i == 65535) {
            return 0.0f;
        }
        return (float) (((double) i) * 0.01d);
    }

    private int formatExerciseStep(int i) {
        if (i == 16777215) {
            return 0;
        }
        return i;
    }

    private int formatExerciseStepFrequency(int i) {
        if (i == 255) {
            return 0;
        }
        return i;
    }

    private void parseNewExerciseData(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        this.cmd = toUnsignedInt(byteBufferOrder.get());
        this.category = ATExerciseType.getDataType(toUnsignedInt(byteBufferOrder.get()));
        this.mode = toUnsignedInt(byteBufferOrder.get());
        this.flag = (this.category.getValue() == 1 || this.category.getValue() == 4) ? byteBufferOrder.getInt() : toUnsignedInt(byteBufferOrder.getShort());
        if (this.category.getValue() == 1) {
            int length = bArr.length - 7;
            byte[] bArr2 = new byte[length];
            byteBufferOrder.get(bArr2, 0, length);
            parseRunningData(bArr2);
            return;
        }
        if (this.category.getValue() == 4) {
            int length2 = bArr.length - 7;
            byte[] bArr3 = new byte[length2];
            byteBufferOrder.get(bArr3, 0, length2);
            parseSwimmingData(bArr3);
            return;
        }
        boolean z = (this.flag & 1) == 1;
        this.pausesCount = toUnsignedInt(byteBufferOrder.get());
        this.startUtc = byteBufferOrder.getInt();
        int iPosition = byteBufferOrder.position();
        int length3 = bArr.length - iPosition;
        System.arraycopy(bArr, iPosition, new byte[length3], 0, length3);
        this.exerciseStatus = new ArrayList();
        for (int i = this.pausesCount; i > 1; i--) {
            this.exerciseStatus.add(new ATExerciseStatus(0, byteBufferOrder.getInt()));
            this.exerciseStatus.add(new ATExerciseStatus(1, byteBufferOrder.getInt()));
        }
        this.stopUtc = byteBufferOrder.getInt();
        this.time = toUnsignedInt(byteBufferOrder.getShort());
        this.step = 0;
        int value = this.category.getValue();
        ATExerciseType aTExerciseType = ATExerciseType.Cycling;
        if (value != aTExerciseType.getValue() && this.category.getValue() != ATExerciseType.IndoorCycling.getValue()) {
            byte[] bArr4 = new byte[4];
            byteBufferOrder.get(bArr4, 1, 3);
            this.step = formatExerciseStep(byte2Uint32(bArr4, ByteOrder.BIG_ENDIAN));
        }
        int i2 = byteBufferOrder.getInt();
        this.calories = formatExerciseCalories(i2);
        System.err.println("calories value >> " + String.format("%X", Integer.valueOf(i2)) + ">> parse value" + this.calories);
        this.maxHeartRate = toUnsignedInt(byteBufferOrder.get());
        this.avgHeartRate = toUnsignedInt(byteBufferOrder.get());
        this.maxSpeed = formatExerciseSpeed(toUnsignedInt(byteBufferOrder.getShort()));
        this.avgSpeed = formatExerciseSpeed(toUnsignedInt(byteBufferOrder.getShort()));
        this.distance = formatExerciseDistance(byteBufferOrder.getInt());
        if (!z || this.category.getValue() == aTExerciseType.getValue() || this.category.getValue() == ATExerciseType.IndoorCycling.getValue()) {
            this.maxStepFrequency = 0;
            this.avgStepFrequency = 0;
        } else {
            this.maxStepFrequency = formatExerciseStepFrequency(toUnsignedInt(byteBufferOrder.get()));
            this.avgStepFrequency = formatExerciseStepFrequency(toUnsignedInt(byteBufferOrder.get()));
        }
    }

    private void parseRunningData(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        this.pausesCount = toUnsignedInt(byteBufferOrder.get());
        this.startUtc = byteBufferOrder.getInt();
        int iPosition = byteBufferOrder.position();
        int length = bArr.length - iPosition;
        System.arraycopy(bArr, iPosition, new byte[length], 0, length);
        this.exerciseStatus = new ArrayList();
        for (int i = this.pausesCount; i > 1; i--) {
            this.exerciseStatus.add(new ATExerciseStatus(0, byteBufferOrder.getInt()));
            this.exerciseStatus.add(new ATExerciseStatus(1, byteBufferOrder.getInt()));
        }
        this.stopUtc = byteBufferOrder.getInt();
        this.time = toUnsignedInt(byteBufferOrder.getShort());
        byte[] bArr2 = new byte[4];
        byteBufferOrder.get(bArr2, 1, 3);
        this.step = byte2Uint32(bArr2, ByteOrder.BIG_ENDIAN);
        this.calories = a.c(byteBufferOrder.getInt());
        this.maxHeartRate = toUnsignedInt(byteBufferOrder.get());
        this.avgHeartRate = toUnsignedInt(byteBufferOrder.get());
        this.maxStepFrequency = toUnsignedInt(byteBufferOrder.get());
        this.avgStepFrequency = toUnsignedInt(byteBufferOrder.get());
        this.maxSpeed = 0.0f;
        this.avgSpeed = 0.0f;
    }

    private void parseSwimmingData(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        this.startUtc = byteBufferOrder.getInt();
        this.stopUtc = byteBufferOrder.getInt();
        this.time = toUnsignedInt(byteBufferOrder.getShort());
        this.numOfSwimming = toUnsignedInt(byteBufferOrder.getShort());
        this.calories = (float) (((double) byteBufferOrder.getInt()) * 0.1d);
    }

    private void parseWatchExerciseData(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        this.cmd = toUnsignedInt(byteBufferOrder.get());
        this.category = ATExerciseType.getDataType(toUnsignedInt(byteBufferOrder.get()));
        this.mode = toUnsignedInt(byteBufferOrder.get());
        this.startUtc = byteBufferOrder.getInt();
        this.stopUtc = byteBufferOrder.getInt();
        this.time = toUnsignedInt(byteBufferOrder.getShort());
        this.step = formatExerciseStep(byteBufferOrder.getInt());
        this.distance = formatExerciseDistance(byteBufferOrder.getInt());
        this.calories = formatExerciseCalories(toUnsignedInt(byteBufferOrder.getShort()));
        this.avgHeartRate = toUnsignedInt(byteBufferOrder.get());
        this.maxHeartRate = toUnsignedInt(byteBufferOrder.get());
        this.avgStepFrequency = toUnsignedInt(byteBufferOrder.getShort());
        this.avgStride = toUnsignedInt(byteBufferOrder.get());
        this.avgSpeed = formatExerciseSpeed(toUnsignedInt(byteBufferOrder.getShort()));
        float[] fArr = new float[5];
        this.heartRateZoneTimeRatio = fArr;
        fArr[0] = (float) (((double) toUnsignedInt(byteBufferOrder.getShort())) * 0.1d);
        this.heartRateZoneTimeRatio[1] = (float) (((double) toUnsignedInt(byteBufferOrder.getShort())) * 0.1d);
        this.heartRateZoneTimeRatio[2] = (float) (((double) toUnsignedInt(byteBufferOrder.getShort())) * 0.1d);
        this.heartRateZoneTimeRatio[3] = (float) (((double) toUnsignedInt(byteBufferOrder.getShort())) * 0.1d);
        this.heartRateZoneTimeRatio[4] = (float) (((double) toUnsignedInt(byteBufferOrder.getShort())) * 0.1d);
    }

    public int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public float getAvgSpeed() {
        return this.avgSpeed;
    }

    public int getAvgStepFrequency() {
        return this.avgStepFrequency;
    }

    public int getAvgStride() {
        return this.avgStride;
    }

    public float getCalories() {
        return this.calories;
    }

    public ATExerciseType getCategory() {
        return this.category;
    }

    public int getDistance() {
        return this.distance;
    }

    public List getExerciseStatus() {
        return this.exerciseStatus;
    }

    public int getFlag() {
        return this.flag;
    }

    public float[] getHeartRateZoneTimeRatio() {
        return this.heartRateZoneTimeRatio;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public float getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getMaxStepFrequency() {
        return this.maxStepFrequency;
    }

    public int getMode() {
        return this.mode;
    }

    public int getNumOfSwimming() {
        return this.numOfSwimming;
    }

    public int getPausesCount() {
        return this.pausesCount;
    }

    public long getStartUtc() {
        return this.startUtc;
    }

    public int getStep() {
        return this.step;
    }

    public long getStopUtc() {
        return this.stopUtc;
    }

    public int getTime() {
        return this.time;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        byte[] bArr2 = this.srcData;
        if (bArr2 == null || bArr2.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.BIG_ENDIAN);
            int unsignedInt = toUnsignedInt(byteBufferOrder.get());
            this.cmd = unsignedInt;
            if (unsignedInt == 226) {
                parseNewExerciseData(bArr);
            } else if (unsignedInt == 20) {
                parseWatchExerciseData(bArr);
            } else {
                int length = this.srcData.length - 1;
                byte[] bArr3 = new byte[length];
                byteBufferOrder.get(bArr3, 0, length);
                parseRunningData(bArr3);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setAvgHeartRate(int i) {
        this.avgHeartRate = i;
    }

    public void setAvgSpeed(float f) {
        this.avgSpeed = f;
    }

    public void setAvgStepFrequency(int i) {
        this.avgStepFrequency = i;
    }

    public void setAvgStride(int i) {
        this.avgStride = i;
    }

    public void setCalories(float f) {
        this.calories = f;
    }

    public void setCategory(ATExerciseType aTExerciseType) {
        this.category = aTExerciseType;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setExerciseStatus(List list) {
        this.exerciseStatus = list;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setHeartRateZoneTimeRatio(float[] fArr) {
        this.heartRateZoneTimeRatio = fArr;
    }

    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public void setMaxSpeed(float f) {
        this.maxSpeed = f;
    }

    public void setMaxStepFrequency(int i) {
        this.maxStepFrequency = i;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setNumOfSwimming(int i) {
        this.numOfSwimming = i;
    }

    public void setPausesCount(int i) {
        this.pausesCount = i;
    }

    public void setStartUtc(long j2) {
        this.startUtc = j2;
    }

    public void setStep(int i) {
        this.step = i;
    }

    public void setStopUtc(long j2) {
        this.stopUtc = j2;
    }

    public void setTime(int i) {
        this.time = i;
    }

    public String toString() {
        return "ATExerciseData{category=" + this.category + ", mode=" + this.mode + ", flag=" + this.flag + ", pausesCount=" + this.pausesCount + ", startUtc=" + this.startUtc + ", stopUtc=" + this.stopUtc + ", time=" + this.time + ", step=" + this.step + ", calories=" + this.calories + ", maxHeartRate=" + this.maxHeartRate + ", avgHeartRate=" + this.avgHeartRate + ", maxSpeed=" + this.maxSpeed + ", avgSpeed=" + this.avgSpeed + ", distance=" + this.distance + ", maxStepFrequency=" + this.maxStepFrequency + ", avgStepFrequency=" + this.avgStepFrequency + ", numOfSwimming=" + this.numOfSwimming + ", exerciseStatus=" + this.exerciseStatus + ", avgStride=" + this.avgStride + ", heartRateZoneTimeRatio=" + Arrays.toString(this.heartRateZoneTimeRatio) + '}';
    }
}
