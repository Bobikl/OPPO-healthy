package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.LSUserGender;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATUserInfoSetting extends LSDeviceSyncSetting {
    public static final String PRODUCT_MODEL_M5 = "M5";
    private int age;
    private String deviceId;
    private float height;
    private boolean isClearData;
    private String macAddress;
    private int previousSteps;
    private String productModel;
    private ATEncourageType targetState;
    private float targetValue;
    private LSUserGender userGender;
    private float weight;

    public ATUserInfoSetting() {
    }

    public ATUserInfoSetting(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
            byte[] bArr2 = new byte[4];
            byteBufferOrder.get(bArr2, 0, 4);
            this.weight = a.c(a.b(bArr2, byteOrder));
            byteBufferOrder.get(new byte[4], 0, 4);
            this.height = a.c(a.b(bArr2, byteOrder));
            this.targetState = ATEncourageType.getTargetState(a.a(byteBufferOrder.get()));
            byte[] bArr3 = new byte[4];
            byteBufferOrder.get(bArr3, 0, 4);
            if (this.targetState == ATEncourageType.Step) {
                this.targetValue = a.b(bArr3, byteOrder);
            } else {
                this.targetValue = a.c(a.b(bArr3, byteOrder));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private byte[] formatM5UserInfo() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) getCmd());
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

    private byte[] formatUserInfo() {
        String strA;
        byte[] bArr = new byte[15];
        bArr[0] = (byte) getCmd();
        bArr[1] = 0;
        if (isClearData()) {
            bArr[1] = 1;
        }
        if (getWeight() > 0.0f) {
            float weight = getWeight();
            if (weight > 300.0f) {
                weight = 300.0f;
            }
            if (weight < 5.0f) {
                weight = 5.0f;
            }
            byte[] bArrB = a.b(a.a(weight));
            bArr[2] = bArrB[0];
            bArr[3] = bArrB[1];
            bArr[4] = bArrB[2];
            bArr[5] = bArrB[3];
        } else {
            bArr[2] = -1;
            bArr[3] = 0;
            bArr[4] = 2;
            bArr[5] = 88;
        }
        if (getHeight() > 0.0f) {
            float height = getHeight();
            if (height > 3.0f) {
                height = 3.0f;
            }
            if (height < 0.5d) {
                height = 0.5f;
            }
            byte[] bArrB2 = a.b(a.a(height));
            bArr[6] = bArrB2[0];
            bArr[7] = bArrB2[1];
            bArr[8] = bArrB2[2];
            bArr[9] = bArrB2[3];
        } else {
            bArr[6] = -2;
            bArr[7] = 0;
            bArr[8] = 0;
            bArr[9] = -81;
        }
        ATEncourageType targetState = getTargetState();
        bArr[10] = (byte) (targetState == null ? 0 : targetState.getValue());
        byte[] bArrB3 = new byte[4];
        if (getTargetState() == ATEncourageType.Step) {
            strA = a.a(Long.toHexString((int) getTargetValue()), 8);
        } else {
            strA = (getTargetState() == ATEncourageType.Calories || getTargetState() == ATEncourageType.Distance || getTargetState() == ATEncourageType.ExerciseAmount) ? a.a(getTargetValue()) : "";
        }
        if (strA != null && strA.length() > 1) {
            bArrB3 = a.b(strA);
        }
        bArr[11] = bArrB3[0];
        bArr[12] = bArrB3[1];
        bArr[13] = bArrB3[2];
        bArr[14] = bArrB3[3];
        return bArr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        String str = this.productModel;
        return (str == null || !str.equalsIgnoreCase("M5")) ? formatUserInfo() : formatM5UserInfo();
    }

    public int getAge() {
        return this.age;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        String str = this.productModel;
        return (str == null || !str.equalsIgnoreCase("M5")) ? 104 : 181;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public float getHeight() {
        return this.height;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public int getPreviousSteps() {
        return this.previousSteps;
    }

    public String getProductModel() {
        return this.productModel;
    }

    public ATEncourageType getTargetState() {
        return this.targetState;
    }

    public float getTargetValue() {
        return this.targetValue;
    }

    public LSUserGender getUserGender() {
        return this.userGender;
    }

    public float getWeight() {
        return this.weight;
    }

    public boolean isClearData() {
        return this.isClearData;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public void setClearData(boolean z) {
        this.isClearData = z;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public void setPreviousSteps(int i) {
        this.previousSteps = i;
    }

    public void setProductModel(String str) {
        this.productModel = str;
    }

    public void setTargetState(ATEncourageType aTEncourageType) {
        this.targetState = aTEncourageType;
    }

    public void setTargetValue(float f) {
        this.targetValue = f;
    }

    public void setUserGender(LSUserGender lSUserGender) {
        this.userGender = lSUserGender;
    }

    public void setWeight(float f) {
        this.weight = f;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATUserInfoSetting{productModel='" + this.productModel + "', height=" + this.height + ", weight=" + this.weight + ", age=" + this.age + ", userGender=" + this.userGender + ", targetState=" + this.targetState + ", targetValue=" + this.targetValue + ", previousSteps=" + this.previousSteps + ", isClearData=" + this.isClearData + '}';
    }
}
