package MemoryManagement;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class GC {

    /*
        Creates a strong reference meaning when Garbage Collector runs,
        it does not delete this from heap memory.
     */
    Person personObj = new Person();

    /*
        Creates a weak reference meaning when GC run it deletes this object
        from heap memory.
     */
    WeakReference<Person> personWeakReference = new WeakReference<>(new Person());

    /*
        Creates a soft reference, when GC runs its a suggestion that please dont delete
        it unless absolutely necessary.
     */
    SoftReference<Person> personSoftReference = new SoftReference<>(new Person());

}
