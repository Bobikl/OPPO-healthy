package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATStepSummary extends ATDeviceData {
    private List steps;

    public ATStepSummary(byte[] bArr) {
        super(bArr);
    }

    public List getSteps() {
        return this.steps;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            this.steps = new ArrayList();
            int i = 0;
            this.cmd = toUnsignedInt(bArr[0]);
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 1, bArr2, 0, length);
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.BIG_ENDIAN);
            do {
                byte[] bArr3 = new byte[4];
                byteBufferOrder.get(bArr3, 1, 3);
                int iByte2Uint32 = byte2Uint32(bArr3, ByteOrder.BIG_ENDIAN);
                int i2 = byteBufferOrder.getInt();
                int unsignedInt = toUnsignedInt(byteBufferOrder.getShort());
                int i3 = byteBufferOrder.getInt();
                int unsignedInt2 = toUnsignedInt(byteBufferOrder.getShort());
                int unsignedInt3 = toUnsignedInt(byteBufferOrder.getShort());
                int unsignedInt4 = toUnsignedInt(byteBufferOrder.get());
                int unsignedInt5 = toUnsignedInt(byteBufferOrder.get());
                i = i + 3 + 4 + 2 + 4 + 2 + 2 + 1 + 1;
                ATStepItem aTStepItem = new ATStepItem();
                aTStepItem.setCmd(this.cmd);
                long j2 = i2;
                aTStepItem.setUtc(j2);
                aTStepItem.setMeasureTime(formatUtcTime(j2));
                aTStepItem.setStep(iByte2Uint32);
                aTStepItem.setCalories(a.c(i3));
                aTStepItem.setExerciseTime(unsignedInt2);
                aTStepItem.setExerciseAmount(a.c((short) unsignedInt));
                aTStepItem.setDistance(unsignedInt3);
                aTStepItem.setStatus(unsignedInt4);
                aTStepItem.setBatteryVoltage((float) ((((double) unsignedInt5) * 0.01d) + 1.6d));
                this.steps.add(aTStepItem);
            } while (length - i > 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setSteps(List list) {
        this.steps = list;
    }

    public String toString() {
        return "ATStepSummary{, steps=" + this.steps + ", cmd=" + this.cmd + '}';
    }
}
