package org.apache.commons.collections4.functors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FunctorException;

/* JADX INFO: loaded from: classes11.dex */
public class PrototypeFactory {

    public static class PrototypeCloneFactory<T> implements Factory<T> {
        private transient Method iCloneMethod;
        private final T iPrototype;

        private void findCloneMethod() {
            try {
                this.iCloneMethod = this.iPrototype.getClass().getMethod("clone", null);
            } catch (NoSuchMethodException unused) {
                throw new IllegalArgumentException("PrototypeCloneFactory: The clone method must exist and be public ");
            }
        }

        @Override // org.apache.commons.collections4.Factory
        public T create() {
            if (this.iCloneMethod == null) {
                findCloneMethod();
            }
            try {
                return (T) this.iCloneMethod.invoke(this.iPrototype, null);
            } catch (IllegalAccessException e2) {
                throw new FunctorException("PrototypeCloneFactory: Clone method must be public", e2);
            } catch (InvocationTargetException e3) {
                throw new FunctorException("PrototypeCloneFactory: Clone method threw an exception", e3);
            }
        }

        private PrototypeCloneFactory(T t, Method method) {
            this.iPrototype = t;
            this.iCloneMethod = method;
        }
    }

    public static class PrototypeSerializationFactory<T extends Serializable> implements Factory<T> {
        private final T iPrototype;

        private PrototypeSerializationFactory(T t) {
            this.iPrototype = t;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2 */
        @Override // org.apache.commons.collections4.Factory
        public T create() throws Throwable {
            Throwable th;
            ClassNotFoundException e2;
            IOException e3;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            try {
                try {
                    new ObjectOutputStream(byteArrayOutputStream).writeObject(this.iPrototype);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    try {
                        T t = (T) new ObjectInputStream(byteArrayInputStream).readObject();
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused2) {
                        }
                        return t;
                    } catch (IOException e4) {
                        e3 = e4;
                        throw new FunctorException(e3);
                    } catch (ClassNotFoundException e5) {
                        e2 = e5;
                        throw new FunctorException(e2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (this != 0) {
                        try {
                            this.close();
                        } catch (IOException unused3) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
            } catch (IOException e6) {
                e3 = e6;
            } catch (ClassNotFoundException e7) {
                e2 = e7;
            } catch (Throwable th3) {
                th = th3;
                this = (PrototypeSerializationFactory<T>) null;
                if (this != 0) {
                    this.close();
                }
                byteArrayOutputStream.close();
                throw th;
            }
        }
    }

    private PrototypeFactory() {
    }

    public static <T> Factory<T> prototypeFactory(T t) {
        if (t == null) {
            return ConstantFactory.constantFactory(null);
        }
        try {
            try {
                return new PrototypeCloneFactory(t, t.getClass().getMethod("clone", null));
            } catch (NoSuchMethodException unused) {
                t.getClass().getConstructor(t.getClass());
                return new InstantiateFactory(t.getClass(), new Class[]{t.getClass()}, new Object[]{t});
            }
        } catch (NoSuchMethodException unused2) {
            if (t instanceof Serializable) {
                return new PrototypeSerializationFactory((Serializable) t);
            }
            throw new IllegalArgumentException("The prototype must be cloneable via a public clone method");
        }
    }
}
