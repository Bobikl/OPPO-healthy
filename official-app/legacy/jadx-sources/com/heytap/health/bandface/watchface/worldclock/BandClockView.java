package com.heytap.health.bandface.watchface.worldclock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.timepicker.TimeModel;
import com.heytap.health.bandface.R$color;
import com.heytap.health.bandface.R$drawable;
import com.heytap.health.base.R$font;
import com.heytap.log.config.LogMemoryConfig;
import com.oplus.aiunit.vision.ayj;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.v05;
import com.oplus.aiunit.vision.vda;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes15.dex */
public class BandClockView extends View {
    public final TextPaint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextPaint f3141j;
    public TimeZone k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ContentObserver f3142l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3143n;
    public Calendar o;
    public String p;
    public String q;
    public final BroadcastReceiver r;
    public final Runnable s;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (BandClockView.this.p == null && "android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
                BandClockView.this.f(vda.k(intent, "time-zone"));
            } else if (!BandClockView.this.f3143n && ("android.intent.action.TIME_TICK".equals(intent.getAction()) || "android.intent.action.TIME_SET".equals(intent.getAction()))) {
                return;
            }
            BandClockView.this.h();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BandClockView.this.h();
            long jUptimeMillis = SystemClock.uptimeMillis();
            BandClockView.this.getHandler().postAtTime(BandClockView.this.s, jUptimeMillis + (1000 - (jUptimeMillis % 1000)));
        }
    }

    public class c extends ContentObserver {
        public c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            BandClockView.this.h();
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            BandClockView.this.h();
        }
    }

    public BandClockView(Context context) {
        this(context, null);
    }

    public final void f(String str) {
        if (str != null) {
            TimeZone timeZone = TimeZone.getTimeZone(str);
            this.k = timeZone;
            this.o = Calendar.getInstance(timeZone);
        } else {
            this.k = TimeZone.getDefault();
            this.o = Calendar.getInstance();
        }
        this.o.setFirstDayOfWeek(2);
    }

    public final String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() <= 12) {
            return str;
        }
        return str.substring(0, 10) + LogMemoryConfig.LOG_ELLIPSIS;
    }

    public TimeZone getTimeZoneObj() {
        return this.k;
    }

    public final void h() {
        this.o.setTimeInMillis(System.currentTimeMillis());
        invalidate();
    }

    public final void i() {
        if (this.m) {
            if (this.f3142l == null) {
                this.f3142l = new c(getHandler());
            }
            getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("time_12_24"), true, this.f3142l);
        }
    }

    public final void j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        rdf.b(getContext(), this.r, intentFilter, null, getHandler(), 2);
    }

    public void k(String str, String str2) {
        this.q = str2;
        setTimeZone(str);
    }

    public void l(TimeZone timeZone, String str) {
        this.q = str;
        this.p = timeZone.getID();
        this.k = timeZone;
        Calendar calendar = Calendar.getInstance(timeZone);
        this.o = calendar;
        calendar.setFirstDayOfWeek(2);
        h();
    }

    public final void m() {
        if (this.f3142l != null) {
            getContext().getContentResolver().unregisterContentObserver(this.f3142l);
        }
    }

    public final void n() {
        getContext().unregisterReceiver(this.r);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.m) {
            return;
        }
        this.m = true;
        j();
        i();
        f(this.p);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.m) {
            n();
            m();
            this.m = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getWidth() / 2, 0.0f);
        String str = DateFormat.is24HourFormat(getContext()) ? v05.DATE_FORMAT_HOUR : "hh:mm";
        if (TextUtils.isEmpty(this.q)) {
            String string = DateFormat.format(str, Calendar.getInstance()).toString();
            this.i.setTextSize(getHeight() * 0.115f);
            this.i.setColor(ContextCompat.getColor(getContext(), R$color.band_face_clock_time));
            canvas.drawText(string, (-this.i.measureText(string)) / 2.0f, getHeight() * 0.28f, this.i);
            String strG = g(ayj.a());
            this.f3141j.setTextSize(getHeight() * 0.068f);
            TextPaint textPaint = this.f3141j;
            Context context = getContext();
            int i = R$color.band_face_clock_city;
            textPaint.setColor(ContextCompat.getColor(context, i));
            canvas.drawText(strG, (-this.f3141j.measureText(strG)) / 2.0f, getHeight() * 0.3956f, this.f3141j);
            if (!DateFormat.is24HourFormat(getContext())) {
                String str2 = new SimpleDateFormat("a", Locale.ENGLISH).format(Calendar.getInstance().getTime());
                this.i.setTextSize(getHeight() * 0.061f);
                this.i.setColor(ContextCompat.getColor(getContext(), i));
                canvas.drawText(str2, (-this.i.measureText(str2)) / 2.0f, getHeight() * 0.464f, this.i);
            }
            String str3 = new SimpleDateFormat(ExifInterface.LONGITUDE_EAST, Locale.ENGLISH).format(this.o.getTime()).toUpperCase() + " " + String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.o.get(5)));
            this.i.setTextSize(getHeight() * 0.082f);
            this.i.setColor(-1);
            canvas.drawText(str3, (-this.i.measureText(str3)) / 2.0f, getHeight() * 0.737f, this.i);
            return;
        }
        String string2 = DateFormat.format(str, Calendar.getInstance()).toString();
        this.i.setTextSize(getHeight() * 0.115f);
        TextPaint textPaint2 = this.i;
        Context context2 = getContext();
        int i2 = R$color.band_face_clock_time;
        textPaint2.setColor(ContextCompat.getColor(context2, i2));
        canvas.drawText(string2, (-this.i.measureText(string2)) / 2.0f, getHeight() * 0.197f, this.i);
        String strG2 = g(ayj.a());
        this.f3141j.setTextSize(getHeight() * 0.068f);
        TextPaint textPaint3 = this.f3141j;
        Context context3 = getContext();
        int i3 = R$color.band_face_clock_city;
        textPaint3.setColor(ContextCompat.getColor(context3, i3));
        canvas.drawText(strG2, (-this.f3141j.measureText(strG2)) / 2.0f, getHeight() * 0.279f, this.f3141j);
        if (!DateFormat.is24HourFormat(getContext())) {
            String str4 = new SimpleDateFormat("a", Locale.ENGLISH).format(Calendar.getInstance().getTime());
            this.i.setTextSize(getHeight() * 0.061f);
            this.i.setColor(ContextCompat.getColor(getContext(), i3));
            canvas.drawText(str4, (-this.i.measureText(str4)) / 2.0f, getHeight() * 0.354f, this.i);
        }
        if (!TextUtils.isEmpty(this.q)) {
            String string3 = DateFormat.format(str, this.o).toString();
            this.i.setTextSize(getHeight() * 0.115f);
            this.i.setColor(ContextCompat.getColor(getContext(), i2));
            canvas.drawText(string3, (-this.i.measureText(string3)) / 2.0f, getHeight() * 0.588f, this.i);
            String str5 = this.q;
            if (str5 == null) {
                str5 = "";
            }
            this.f3141j.setTextSize(getHeight() * 0.068f);
            this.f3141j.setColor(ContextCompat.getColor(getContext(), i3));
            String strG3 = g(str5);
            canvas.drawText(strG3, (-this.f3141j.measureText(strG3)) / 2.0f, getHeight() * 0.67f, this.f3141j);
            if (!DateFormat.is24HourFormat(getContext())) {
                String str6 = this.o.get(9) == 0 ? "AM" : "PM";
                this.i.setTextSize(getHeight() * 0.061f);
                this.i.setColor(ContextCompat.getColor(getContext(), i3));
                canvas.drawText(str6, (-this.i.measureText(str6)) / 2.0f, getHeight() * 0.745f, this.i);
            }
        }
        String str7 = new SimpleDateFormat(ExifInterface.LONGITUDE_EAST, Locale.ENGLISH).format(Calendar.getInstance().getTime()).toUpperCase() + " " + String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(Calendar.getInstance().get(5)));
        this.i.setTextSize(getHeight() * 0.082f);
        this.i.setColor(-1);
        canvas.drawText(str7, (-this.i.measureText(str7)) / 2.0f, getHeight() * 0.918f, this.i);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        boolean z2 = this.f3143n;
        if (!z2 && z) {
            this.f3143n = true;
            h();
        } else {
            if (!z2 || z) {
                return;
            }
            this.f3143n = false;
            getHandler().removeCallbacks(this.s);
        }
    }

    public void setTimeZone(String str) {
        this.p = str;
        f(str);
        h();
    }

    public BandClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        setBackgroundResource(R$drawable.band_dial_clock_bg);
        this.i.setTypeface(ResourcesCompat.getFont(getContext(), R$font.opposans_en_os_medium));
        this.f3141j.setTypeface(ResourcesCompat.getFont(getContext(), R$font.x_type301_bold));
    }

    public BandClockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new TextPaint(1);
        this.f3141j = new TextPaint(1);
        this.r = new a();
        this.s = new b();
    }
}
