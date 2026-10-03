package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.media.AudioManager;
import android.net.Uri;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.hearing.bean.Exposure;
import com.heytap.health.hearing.bean.Volume;
import com.heytap.health.interconnection.oplus.IOplusPhoneManager;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class zw8 {
    public static final Uri VOLUME_CONTENT_URI = Uri.parse("content://com.oplus.atlas.sound.provider/volume");
    public static final Uri EXPOSURE_CONTENT_URI = Uri.parse("content://com.oplus.atlas.sound.provider/exposure");
    public static final Uri SWITCH_CONTENT_URI = Uri.parse("content://com.oplus.atlas.sound.provider/switch");
    public static final Uri REMIND_SWITCH_URI = Uri.parse("content://com.oplus.atlas.sound.provider/reminder_switch");

    public static class a {
        public final boolean a;
        public final int b;

        public a(boolean z, int i) {
            this.a = z;
            this.b = i;
        }

        public String toString() {
            return "VolumeLimitData{enable=" + this.a + ", volumeDB=" + this.b + '}';
        }
    }

    public static List<Exposure> b(long j2, long j3) {
        Cursor cursorQuery;
        StringBuilder sb = new StringBuilder();
        sb.append("HearingContentUtil getExposure start., startTime = ");
        sb.append(fn9.g(j2, "yyyMMMdd HH:mm"));
        sb.append(", endTime = ");
        sb.append(fn9.g(j3, "yyyMMMdd HH:mm"));
        ArrayList arrayList = new ArrayList();
        if (j2 == j3) {
            cursorQuery = b78.a().getContentResolver().query(EXPOSURE_CONTENT_URI, new String[]{"exposure", ClickApiEntity.TIME}, "time = ?", new String[]{"" + j2}, null);
        } else {
            cursorQuery = b78.a().getContentResolver().query(EXPOSURE_CONTENT_URI, new String[]{"exposure", ClickApiEntity.TIME}, "time >= ? and time <= ?", new String[]{"" + j2, "" + j3}, null);
        }
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                double d = cursorQuery.getDouble(cursorQuery.getColumnIndex("exposure"));
                long j4 = cursorQuery.getLong(cursorQuery.getColumnIndex(ClickApiEntity.TIME));
                Exposure exposure = new Exposure();
                exposure.setValue(d);
                exposure.setTime(j4);
                arrayList.add(exposure);
            }
            cursorQuery.close();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HearingContentUtil getExposure end. exposure list: ");
        sb2.append(arrayList.size());
        return arrayList;
    }

    public static Long c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContentResolver contentResolver = b78.a().getContentResolver();
        Uri uri = VOLUME_CONTENT_URI;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        long j2 = 0;
        sb.append(0L);
        Cursor cursorQuery = contentResolver.query(uri, null, "time >= ? and time <= ?", new String[]{sb.toString(), "" + jCurrentTimeMillis}, null);
        if (cursorQuery != null) {
            j2 = cursorQuery.moveToLast() ? cursorQuery.getLong(cursorQuery.getColumnIndex(ClickApiEntity.TIME)) : 0L;
            cursorQuery.close();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HearingContentUtil getFirstDataTime end. time: ");
        sb2.append(fn9.g(j2, "yyyMMMdd HH:mm"));
        return Long.valueOf(j2);
    }

    public static a d() {
        AudioManager audioManager = (AudioManager) b78.a().getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        String parameters = audioManager.getParameters("spl_limit");
        a7b.f(b04.TAG, "Read volume limit data=" + parameters);
        if (parameters == null) {
            return null;
        }
        String[] strArrSplit = parameters.split(",");
        if (strArrSplit.length >= 2) {
            return new a("1".equals(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
        }
        return null;
    }

    public static List<Volume> e(long j2, long j3) {
        Cursor cursorQuery;
        StringBuilder sb = new StringBuilder();
        sb.append("HearingContentUtil getVolumeList start., startTime = ");
        sb.append(fn9.g(j2, "yyyMMMdd HH:mm"));
        sb.append(", endTime = ");
        sb.append(fn9.g(j3, "yyyMMMdd HH:mm"));
        ArrayList arrayList = new ArrayList();
        if (j2 == j3) {
            cursorQuery = b78.a().getContentResolver().query(VOLUME_CONTENT_URI, new String[]{SpeechConstant.KEY_VOLUME, "duration", ClickApiEntity.TIME}, "time = ?", new String[]{"" + j2}, null);
        } else {
            cursorQuery = b78.a().getContentResolver().query(VOLUME_CONTENT_URI, new String[]{SpeechConstant.KEY_VOLUME, "duration", ClickApiEntity.TIME}, "time >= ? and time <= ?", new String[]{"" + j2, "" + j3}, null);
        }
        if (cursorQuery != null) {
            long j4 = 0;
            long j5 = 0;
            long j6 = 0;
            double d = 0.0d;
            while (cursorQuery.moveToNext()) {
                double d2 = cursorQuery.getDouble(cursorQuery.getColumnIndex(SpeechConstant.KEY_VOLUME));
                long j7 = cursorQuery.getLong(cursorQuery.getColumnIndex("duration"));
                long j8 = cursorQuery.getLong(cursorQuery.getColumnIndex(ClickApiEntity.TIME));
                if ((j5 == j4 || j5 == j8) && j7 > j4 && j8 > j4) {
                    d += d2 * j7;
                    j6 += j7;
                } else {
                    if (d > 0.0d && j6 > j4 && j5 > j4) {
                        Volume volume = new Volume();
                        volume.setVolume(d / j6);
                        volume.setDuration(j6);
                        volume.setTimestamp(j5);
                        arrayList.add(volume);
                    }
                    j6 = j7;
                    d = d2 * j7;
                }
                j5 = j8;
                j4 = 0;
            }
            if (d > 0.0d && j6 > 0 && j5 > 0) {
                Volume volume2 = new Volume();
                volume2.setVolume(d / j6);
                volume2.setDuration(j6);
                volume2.setTimestamp(j5);
                arrayList.add(volume2);
            }
            cursorQuery.close();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HearingContentUtil getVolumeList end. list size: ");
        sb2.append(arrayList.size());
        return arrayList;
    }

    public static boolean f() {
        a7b.f(b04.TAG, "Read overrun remind enable");
        try {
            Cursor cursorQuery = b78.a().getContentResolver().query(REMIND_SWITCH_URI, null, null, null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        int columnIndex = cursorQuery.getColumnIndex("status");
                        if (columnIndex >= 0) {
                            int i = cursorQuery.getInt(columnIndex);
                            a7b.f(b04.TAG, "Read volume overrun remind status=" + i);
                            boolean z = i > 0;
                            cursorQuery.close();
                            return z;
                        }
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                cursorQuery.close();
            }
        } catch (Throwable th2) {
            a7b.b(b04.TAG, "Query overrun remind enable fail=" + th2);
        }
        return false;
    }

    public static boolean g() {
        return ((IOplusPhoneManager) x0.d().h(IOplusPhoneManager.class)).p6("oplus.software.audio.hearing_health_support");
    }

    public static boolean h() {
        return ((IOplusPhoneManager) x0.d().h(IOplusPhoneManager.class)).p6("oplus.software.audio.spl_limit_support");
    }

    public static /* synthetic */ void i(boolean z, int i) {
        AudioManager audioManager = (AudioManager) b78.a().getSystemService("audio");
        if (audioManager != null) {
            if (!z) {
                i = -1;
            }
            String str = String.format("spl_limit=%s,%s", Integer.valueOf(z ? 1 : 0), Integer.valueOf(i));
            audioManager.setParameters(str);
            a7b.f(b04.TAG, "Set volume limit success, data:" + str);
        }
    }

    public static int j(boolean z) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", Integer.valueOf(z ? 1 : 0));
            return b78.a().getContentResolver().update(REMIND_SWITCH_URI, contentValues, null, null);
        } catch (Throwable th) {
            a7b.b(b04.TAG, "setOverrunRemindSwitch fail=" + th);
            return 0;
        }
    }

    public static int k(int i) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", Integer.valueOf(i));
            return b78.a().getContentResolver().update(SWITCH_CONTENT_URI, contentValues, null, null);
        } catch (Throwable th) {
            a7b.b(b04.TAG, "setSwitchStatus fail=" + th);
            return 0;
        }
    }

    public static void l(final boolean z, final int i) {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.yw8
            @Override // java.lang.Runnable
            public final void run() {
                zw8.i(z, i);
            }
        });
    }
}
