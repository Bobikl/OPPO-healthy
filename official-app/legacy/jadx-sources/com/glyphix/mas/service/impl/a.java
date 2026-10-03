package com.glyphix.mas.service.impl;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import com.glyphix.mas.service.b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f2335e;

    public a(Context context) {
        super(context);
        this.f2335e = "gx_".concat(a.class.getName());
    }

    @Override // com.glyphix.mas.service.b
    public boolean a(StatusBarNotification statusBarNotification) {
        Bundle bundle;
        CharSequence charSequence;
        CharSequence[] charSequenceArray;
        CharSequence charSequence2;
        com.glyphix.mas.utils.b.c().c(this.f2335e, "whatsapp recv notice");
        try {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && (bundle = notification.extras) != null) {
                CharSequence charSequence3 = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE);
                String string = "";
                String string2 = charSequence3 != null ? charSequence3.toString() : "";
                Parcelable[] parcelableArray = bundle.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
                if (parcelableArray != null && parcelableArray.length > 0 && (charSequence2 = ((Bundle) parcelableArray[parcelableArray.length - 1]).getCharSequence(NotificationCompat.EXTRA_TEXT)) != null) {
                    string = charSequence2.toString();
                }
                if (string.isEmpty() && (charSequenceArray = bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES)) != null && charSequenceArray.length > 0) {
                    string = charSequenceArray[charSequenceArray.length - 1].toString();
                }
                if (string.isEmpty() && (charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT)) != null) {
                    string = charSequence.toString();
                }
                com.glyphix.mas.utils.b.c().c(this.f2335e, "receiverNotification: " + string2 + " | " + string);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", statusBarNotification.getKey());
                jSONObject.put("user", string2);
                jSONObject.put("content", string);
                com.glyphix.mas.utils.b.c().c(jSONObject.toString());
                a(this.f2334c, jSONObject.toString());
                this.a.put(statusBarNotification.getKey(), statusBarNotification);
                return true;
            }
            com.glyphix.mas.utils.b.c().e("notification or notification.extras is null");
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.glyphix.mas.service.b
    public void a(JSONObject jSONObject) {
        com.glyphix.mas.service.a aVar;
        String str;
        try {
            Notification.Action[] actionArr = this.a.get(jSONObject.getString("id")).getNotification().actions;
            if (actionArr != null) {
                for (Notification.Action action : actionArr) {
                    if (action.getRemoteInputs() != null) {
                        RemoteInput remoteInput = action.getRemoteInputs()[0];
                        String resultKey = remoteInput.getResultKey();
                        Bundle bundle = new Bundle();
                        bundle.putString(resultKey, jSONObject.getString("msg"));
                        Intent intent = new Intent();
                        RemoteInput.addResultsToIntent(new RemoteInput[]{remoteInput}, intent, bundle);
                        PendingIntent pendingIntent = action.actionIntent;
                        if (pendingIntent != null) {
                            try {
                                pendingIntent.send(this.d, 0, intent);
                                return;
                            } catch (PendingIntent.CanceledException e2) {
                                b.a(com.glyphix.mas.service.a.ReplyFailed, "reply failed", jSONObject.getString("replier"));
                                e2.printStackTrace();
                            }
                        } else {
                            b.a(com.glyphix.mas.service.a.ReplyFailed, "pendingIntent is null", jSONObject.getString("replier"));
                        }
                    }
                }
                aVar = com.glyphix.mas.service.a.ReplyFailed;
                str = "remote intput is null";
            } else {
                aVar = com.glyphix.mas.service.a.ReplyFailed;
                str = "notification actions is null";
            }
            b.a(aVar, str, jSONObject.getString("replier"));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
