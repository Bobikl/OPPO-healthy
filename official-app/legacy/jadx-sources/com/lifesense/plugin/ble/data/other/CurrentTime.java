package com.lifesense.plugin.ble.data.other;

import android.annotation.SuppressLint;
import com.lifesense.plugin.ble.c.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"SimpleDateFormat"})
public class CurrentTime {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static final String TIME_FORMAT = "%d/%02d/%02d %02d:%02d:%02d";
    private byte[] data;
    private int day;
    private int hours;
    private int minutes;
    private int month;
    private int seconds;
    private String time;
    private long utc;
    private int year;

    public CurrentTime(byte[] bArr) {
        setData(bArr);
        parseCurrentTime(bArr);
    }

    public static byte[] getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(new Date(System.currentTimeMillis()));
            int i = calendar.get(1);
            int i2 = calendar.get(2) + 1;
            int i3 = calendar.get(5);
            int i4 = calendar.get(11);
            int i5 = calendar.get(12);
            int i6 = calendar.get(13);
            int i7 = calendar.get(7) - 1;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(10).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.putShort((short) i);
            byteBufferOrder.put((byte) i2);
            byteBufferOrder.put((byte) i3);
            byteBufferOrder.put((byte) i4);
            byteBufferOrder.put((byte) i5);
            byteBufferOrder.put((byte) i6);
            byteBufferOrder.put((byte) i7);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.put((byte) 0);
            return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void parseCurrentTime(byte[] bArr) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        this.year = a.k(bArr2);
        this.month = a.a(bArr[2]);
        this.day = a.a(bArr[3]);
        this.hours = a.a(bArr[4]);
        this.minutes = a.a(bArr[5]);
        this.seconds = a.a(bArr[6]);
        String str = String.format(TIME_FORMAT, Integer.valueOf(this.year), Integer.valueOf(this.month), Integer.valueOf(this.day), Integer.valueOf(this.hours), Integer.valueOf(this.minutes), Integer.valueOf(this.seconds));
        this.time = str;
        try {
            this.utc = DATE_FORMAT.parse(str).getTime() / 1000;
        } catch (ParseException e2) {
            e2.printStackTrace();
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public int getDay() {
        return this.day;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getMonth() {
        return this.month;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public String getTime() {
        return this.time;
    }

    public long getUtc() {
        return this.utc;
    }

    public int getYear() {
        return this.year;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setDay(int i) {
        this.day = i;
    }

    public void setHours(int i) {
        this.hours = i;
    }

    public void setMinutes(int i) {
        this.minutes = i;
    }

    public void setMonth(int i) {
        this.month = i;
    }

    public void setSeconds(int i) {
        this.seconds = i;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public void setYear(int i) {
        this.year = i;
    }

    public String toString() {
        return "CurrentTime [year=" + this.year + ", month=" + this.month + ", day=" + this.day + ", hours=" + this.hours + ", minutes=" + this.minutes + ", seconds=" + this.seconds + ", utc=" + this.utc + ", time=" + this.time + "]";
    }
}
