package com.oplus.aiunit.vision;

import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.ContactImpulse;
import com.badlogic.gdx.physics.box2d.Manifold;

/* JADX INFO: loaded from: classes13.dex */
public interface e34 {
    void a(Contact contact, Manifold manifold);

    void b(Contact contact);

    void c(Contact contact, ContactImpulse contactImpulse);

    void d(Contact contact);
}
