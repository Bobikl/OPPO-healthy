package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSUserGender;
import com.lifesense.plugin.ble.data.tracker.setting.ATDistanceFormat;
import com.lifesense.plugin.ble.data.tracker.setting.ATEncourageType;
import com.lifesense.plugin.ble.data.tracker.setting.ATTimeFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATUserInfo {
    public static final String PRODUCT_MODEL_M5 = "M5";
    private int age;
    private int athleteActivityLevel;
    private String broadcastId;
    private String deviceId;
    private String disableDetectEndTime;
    private String disableDetectStartTime;
    private boolean enableHeartRateDetect;
    private float height;
    private ATTimeFormat hourSystem;
    private boolean isAthlete;

    @Deprecated
    private boolean isClearData;
    private ATDistanceFormat lengthUnit;
    private String macAddress;

    @Deprecated
    private String memberId;

    @Deprecated
    private int previousDeviceSteps;
    private String productModel;
    private byte productUserNumber = 1;
    private float stride;
    private ATEncourageType targetState;

    @Deprecated
    private byte unit;
    private LSUserGender userGender;
    private int weekStart;
    private float weekTargetCalories;
    private float weekTargetDistance;
    private float weekTargetExerciseAmount;
    private int weekTargetSteps;
    private float weight;
    private String weightUnit;

    private int getSexValue(LSUserGender lSUserGender, boolean z) {
        if (lSUserGender == LSUserGender.Male) {
            return z ? 3 : 1;
        }
        if (lSUserGender == LSUserGender.Female) {
            return z ? 4 : 2;
        }
        return 1;
    }

    public String formatUserInfo() {
        return "{ height=" + this.height + "; weight=" + this.weight + "; gender=" + this.userGender + "}";
    }

    public int getAge() {
        return this.age;
    }

    public int getAthleteActivityLevel() {
        return this.athleteActivityLevel;
    }

    public String getBroadcastId() {
        return this.broadcastId;
    }

    public byte[] getCurrentStateBytes() {
        byte b;
        byte[] bArr = new byte[18];
        bArr[0] = 5;
        bArr[2] = 0;
        int i = 8;
        if (this.hourSystem == ATTimeFormat.H12) {
            bArr[2] = (byte) (0 | 8);
        }
        if (this.lengthUnit == ATDistanceFormat.Mile) {
            bArr[2] = (byte) (bArr[2] | 4);
        }
        bArr[3] = this.productUserNumber;
        float f = this.weight;
        if (f > 0.0f) {
            b = (byte) 3;
            byte[] bArrC = a.c(f);
            bArr[4] = bArrC[0];
            bArr[5] = bArrC[1];
            bArr[6] = bArrC[2];
            bArr[7] = bArrC[3];
        } else {
            i = 4;
            b = 1;
        }
        float f2 = this.height;
        if (f2 > 0.0f) {
            b = (byte) (b | 8);
            byte[] bArrB = a.b(f2);
            bArr[i] = bArrB[0];
            int i2 = i + 1;
            bArr[i2] = bArrB[1];
            i = i2 + 1;
        }
        int i3 = this.age;
        if (i3 > 0) {
            b = (byte) (b | 64);
            bArr[i] = (byte) i3;
        }
        bArr[1] = b;
        return bArr;
    }

    public byte[] getData() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) -75);
        byteBufferOrder.put((byte) this.age);
        byteBufferOrder.put((byte) (this.userGender == LSUserGender.Male ? 1 : 0));
        byte[] bArrB = {-1, 0, 2, 88};
        byte[] bArrB2 = {-2, 0, 0, -81};
        float f = this.weight;
        if (f > 0.0f) {
            if (f > 300.0f) {
                f = 300.0f;
            }
            if (f < 5.0f) {
                f = 5.0f;
            }
            bArrB = a.b(a.a(f));
        }
        float f2 = this.height;
        if (f2 > 0.0f) {
            if (f2 > 3.0f) {
                f2 = 3.0f;
            }
            if (f2 < 0.5d) {
                f2 = 0.5f;
            }
            bArrB2 = a.b(a.a(f2));
        }
        byteBufferOrder.put(bArrB);
        byteBufferOrder.put(bArrB2);
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public synchronized String getDisableDetectEndTime() {
        return this.disableDetectEndTime;
    }

    public synchronized String getDisableDetectStartTime() {
        return this.disableDetectStartTime;
    }

    public float getHeight() {
        return this.height;
    }

    public ATTimeFormat getHourSystem() {
        return this.hourSystem;
    }

    public ATDistanceFormat getLengthUnit() {
        return this.lengthUnit;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public int getPreviousDeviceSteps() {
        return this.previousDeviceSteps;
    }

    public String getProductModel() {
        return this.productModel;
    }

    public byte getProductUserNumber() {
        return this.productUserNumber;
    }

    public float getStride() {
        return this.stride;
    }

    public ATEncourageType getTargetState() {
        return this.targetState;
    }

    public byte getUnit() {
        return this.unit;
    }

    public byte[] getUnitConversionBytes() {
        byte[] bArr = {5, 0, 0};
        if (this.hourSystem == ATTimeFormat.H12) {
            bArr[2] = (byte) (bArr[2] | 8);
        }
        if (this.lengthUnit == ATDistanceFormat.Mile) {
            bArr[2] = (byte) (bArr[2] | 4);
        }
        return bArr;
    }

    public LSUserGender getUserGender() {
        return this.userGender;
    }

    public byte[] getUserMessageBytes() {
        byte b;
        byte[] bArr = new byte[11];
        int i = 4;
        bArr[0] = 4;
        bArr[2] = (byte) 100;
        bArr[3] = this.productUserNumber;
        LSUserGender lSUserGender = this.userGender;
        if (lSUserGender == LSUserGender.Female || lSUserGender == LSUserGender.Male) {
            b = (byte) 3;
            bArr[4] = (byte) getSexValue(lSUserGender, this.isAthlete);
            i = 5;
        } else {
            b = 1;
        }
        int i2 = this.athleteActivityLevel;
        if (i2 >= 1 && i2 <= 5) {
            b = (byte) (b | 4);
            bArr[i] = (byte) i2;
            i++;
        }
        int i3 = this.weekStart;
        if (i3 == 1 || i3 == 2) {
            b = (byte) (b | 16);
            bArr[i] = (byte) i3;
        }
        bArr[1] = b;
        return bArr;
    }

    public int getWeekStart() {
        return this.weekStart;
    }

    public byte[] getWeekTargetBytes() {
        byte b;
        byte[] bArr = new byte[19];
        bArr[0] = 8;
        bArr[2] = this.productUserNumber;
        int i = this.weekTargetSteps;
        if (i > 0) {
            b = (byte) 3;
            byte[] bArrA = a.a(i);
            bArr[3] = bArrA[0];
            bArr[4] = bArrA[1];
            bArr[5] = bArrA[2];
            bArr[6] = bArrA[3];
        } else {
            b = 1;
        }
        bArr[1] = b;
        return bArr;
    }

    public float getWeekTargetCalories() {
        return this.weekTargetCalories;
    }

    public float getWeekTargetDistance() {
        return this.weekTargetDistance;
    }

    public float getWeekTargetExerciseAmount() {
        return this.weekTargetExerciseAmount;
    }

    public int getWeekTargetSteps() {
        return this.weekTargetSteps;
    }

    public float getWeight() {
        return this.weight;
    }

    public String getWeightUnit() {
        return this.weightUnit;
    }

    public boolean isAthlete() {
        return this.isAthlete;
    }

    public boolean isClearData() {
        return this.isClearData;
    }

    public boolean isCurrentStateSetting() {
        return this.weight > 0.0f && this.height > 0.0f && this.age > 0;
    }

    public boolean isEnableHeartRateDetect() {
        return this.enableHeartRateDetect;
    }

    public boolean isUnitConversionSetting() {
        ATDistanceFormat aTDistanceFormat;
        ATTimeFormat aTTimeFormat = this.hourSystem;
        return aTTimeFormat == ATTimeFormat.H12 || aTTimeFormat == ATTimeFormat.H24 || (aTDistanceFormat = this.lengthUnit) == ATDistanceFormat.Kilometer || aTDistanceFormat == ATDistanceFormat.Mile;
    }

    public boolean isUserMessageSetting() {
        int i = this.weekStart;
        return i == 1 || i == 2;
    }

    public boolean isWeekTargetSetting() {
        return this.weekTargetSteps > 0;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public void setAthlete(boolean z) {
        this.isAthlete = z;
    }

    public void setAthleteActivityLevel(int i) {
        this.athleteActivityLevel = i;
    }

    public void setBroadcastId(String str) {
        this.broadcastId = str;
    }

    public void setClearData(boolean z) {
        this.isClearData = z;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public synchronized void setDisableDetectEndTime(String str) {
        this.disableDetectEndTime = str;
    }

    public synchronized void setDisableDetectStartTime(String str) {
        this.disableDetectStartTime = str;
    }

    public void setEnableHeartRateDetect(boolean z) {
        this.enableHeartRateDetect = z;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setHourSystem(ATTimeFormat aTTimeFormat) {
        this.hourSystem = aTTimeFormat;
    }

    public void setLengthUnit(ATDistanceFormat aTDistanceFormat) {
        this.lengthUnit = aTDistanceFormat;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public void setMemberId(String str) {
        this.memberId = str;
    }

    public void setPreviousDeviceSteps(int i) {
        this.previousDeviceSteps = i;
    }

    public void setProductModel(String str) {
        this.productModel = str;
    }

    public void setProductUserNumber(byte b) {
        this.productUserNumber = b;
    }

    public void setStride(float f) {
        this.stride = f;
    }

    public void setTargetState(ATEncourageType aTEncourageType) {
        this.targetState = aTEncourageType;
    }

    public void setUnit(byte b) {
        this.unit = b;
    }

    public void setUserGender(LSUserGender lSUserGender) {
        this.userGender = lSUserGender;
    }

    public void setWeekStart(int i) {
        this.weekStart = i;
    }

    public void setWeekTargetCalories(float f) {
        this.weekTargetCalories = f;
    }

    public void setWeekTargetDistance(float f) {
        this.weekTargetDistance = f;
    }

    public void setWeekTargetExerciseAmount(float f) {
        this.weekTargetExerciseAmount = f;
    }

    public void setWeekTargetSteps(int i) {
        this.weekTargetSteps = i;
    }

    public void setWeight(float f) {
        this.weight = f;
    }

    public void setWeightUnit(String str) {
        this.weightUnit = str;
    }

    public String toString() {
        return "ATUserInfo [deviceId=" + this.deviceId + ", broadcastId=" + this.broadcastId + ", memberId=" + this.memberId + ", productUserNumber=" + ((int) this.productUserNumber) + ", stride=" + this.stride + ", height=" + this.height + ", weight=" + this.weight + ", weekStart=" + this.weekStart + ", weekTargetSteps=" + this.weekTargetSteps + ", weekTargetCalories=" + this.weekTargetCalories + ", weekTargetDistance=" + this.weekTargetDistance + ", weekTargetExerciseAmount=" + this.weekTargetExerciseAmount + ", weightUnit=" + this.weightUnit + ", unit=" + ((int) this.unit) + ", lengthUnit=" + this.lengthUnit + ", hourSystem=" + this.hourSystem + ", age=" + this.age + ", userGender=" + this.userGender + ", athleteActivityLevel=" + this.athleteActivityLevel + ", isAthlete=" + this.isAthlete + ", macAddress=" + this.macAddress + ", targetState=" + this.targetState + ", previousDeviceSteps=" + this.previousDeviceSteps + ", isClearData=" + this.isClearData + ", enableHeartRateDetect=" + this.enableHeartRateDetect + ", disableDetectStartTime=" + this.disableDetectStartTime + ", disableDetectEndTime=" + this.disableDetectEndTime + ", productModel=" + this.productModel + "]";
    }
}
