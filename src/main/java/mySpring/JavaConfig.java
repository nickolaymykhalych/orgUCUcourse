package mySpring;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nickolay on 14.04.17.
 */
public class JavaConfig implements Config {
    private Map<Class,Class> ifc2Impl = new HashMap<>();

    public JavaConfig() {
        ifc2Impl.put(Speaker.class, ConsoleSpeaker.class);
        ifc2Impl.put(Cleaner.class, PowerCleaner.class);
    }

    @Override
    public <T> Class<T> getImpl(Class<T> type) {
        return ifc2Impl.get(type);
    }
}
