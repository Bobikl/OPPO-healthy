package com.heytap.sports.move.treadmill.ui.nfc;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.tech.IsoDep;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.MifareUltralight;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.nfc.tech.NfcA;
import android.nfc.tech.NfcB;
import android.nfc.tech.NfcBarcode;
import android.nfc.tech.NfcF;
import android.nfc.tech.NfcV;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.heytap.health.base.base.BaseActivity;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseNfcActivity extends BaseActivity implements a.InterfaceC0776a {
    public a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7914n = false;
    public NfcAdapter o;
    public PendingIntent p;
    public IntentFilter[] q;
    public String[][] r;

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void l7(boolean z) {
        NfcAdapter nfcAdapter = this.o;
        if (nfcAdapter != null) {
            if (z) {
                nfcAdapter.enableForegroundDispatch(this, this.p, this.q, this.r);
            } else {
                nfcAdapter.disableForegroundDispatch(this);
            }
        }
    }

    public boolean m7() {
        this.p = PendingIntent.getActivity(this, 0, new Intent(this, getClass()).addFlags(536870912), 33554432);
        this.o = NfcAdapter.getDefaultAdapter(this);
        IntentFilter intentFilter = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
        IntentFilter intentFilter2 = new IntentFilter("android.nfc.action.TAG_DISCOVERED");
        IntentFilter intentFilter3 = new IntentFilter("android.nfc.action.TECH_DISCOVERED");
        try {
            intentFilter.addDataType("*/*");
        } catch (IntentFilter.MalformedMimeTypeException e2) {
            e2.getMessage();
        }
        this.q = new IntentFilter[]{intentFilter, intentFilter2, intentFilter3};
        this.r = new String[][]{new String[]{NfcA.class.getName(), NfcB.class.getName(), NfcF.class.getName(), NfcV.class.getName(), IsoDep.class.getName(), Ndef.class.getName(), NdefFormatable.class.getName(), MifareClassic.class.getName(), MifareUltralight.class.getName(), NfcBarcode.class.getName()}};
        return false;
    }

    public abstract boolean n7();

    public void o7() {
        this.f7914n = m7();
        a aVar = new a(this);
        this.m = aVar;
        aVar.a(getIntent());
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (n7()) {
            finish();
        } else {
            o7();
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a aVar = this.m;
        if (aVar != null) {
            aVar.a(intent);
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f7914n) {
            l7(false);
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f7914n) {
            l7(true);
        }
    }
}
