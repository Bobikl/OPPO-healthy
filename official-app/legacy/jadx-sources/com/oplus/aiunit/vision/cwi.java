package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class cwi extends l4b<InputStream> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final UriMatcher f10271l;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f10271l = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public cwi(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.oplus.aiunit.vision.ft4
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.oplus.aiunit.vision.l4b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.oplus.aiunit.vision.l4b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamI = i(uri, contentResolver);
        if (inputStreamI != null) {
            return inputStreamI;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    public final InputStream i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f10271l.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return j(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return j(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    public final InputStream j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
