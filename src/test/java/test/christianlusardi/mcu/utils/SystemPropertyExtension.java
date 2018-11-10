package test.christianlusardi.mcu.utils;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class SystemPropertyExtension implements AfterEachCallback, BeforeEachCallback {

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        SystemProperty annotation = extensionContext.getTestMethod().get().getAnnotation(SystemProperty.class);
        System.clearProperty(annotation.key());
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        SystemProperty annotation = extensionContext.getTestMethod().get().getAnnotation(SystemProperty.class);
        System.setProperty(annotation.key(), annotation.value());
    }
}