package com.heytap.sports.move.treadmill.ui.nfc;

import android.content.Intent;
import android.nfc.Tag;
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
import android.nfc.tech.TagTechnology;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public InterfaceC0776a a;

    /* JADX INFO: renamed from: com.heytap.sports.move.treadmill.ui.nfc.a$a, reason: collision with other inner class name */
    public interface InterfaceC0776a {
        void d3(int i, TagTechnology tagTechnology);
    }

    public a(InterfaceC0776a interfaceC0776a) {
        this.a = interfaceC0776a;
    }

    public void a(Intent intent) {
        Tag tag;
        try {
            tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
        } catch (Exception e2) {
            e2.getMessage();
            tag = null;
        }
        if (tag != null) {
            tag.getId();
            String[] techList = tag.getTechList();
            Arrays.toString(techList);
            for (String str : techList) {
                b(str, tag);
            }
        }
    }

    public final void b(String str, Tag tag) {
        str.hashCode();
        switch (str) {
            case "android.nfc.tech.NfcBarcode":
                this.a.d3(10, NfcBarcode.get(tag));
                break;
            case "android.nfc.tech.NdefFormatable":
                this.a.d3(7, NdefFormatable.get(tag));
                break;
            case "android.nfc.tech.Ndef":
                this.a.d3(6, Ndef.get(tag));
                break;
            case "android.nfc.tech.NfcA":
                this.a.d3(1, NfcA.get(tag));
                break;
            case "android.nfc.tech.NfcB":
                this.a.d3(2, NfcB.get(tag));
                break;
            case "android.nfc.tech.NfcF":
                this.a.d3(4, NfcF.get(tag));
                break;
            case "android.nfc.tech.NfcV":
                this.a.d3(5, NfcV.get(tag));
                break;
            case "android.nfc.tech.MifareUltralight":
                this.a.d3(9, MifareUltralight.get(tag));
                break;
            case "android.nfc.tech.MifareClassic":
                this.a.d3(8, MifareClassic.get(tag));
                break;
            case "android.nfc.tech.IsoDep":
                this.a.d3(3, IsoDep.get(tag));
                break;
        }
    }
}
