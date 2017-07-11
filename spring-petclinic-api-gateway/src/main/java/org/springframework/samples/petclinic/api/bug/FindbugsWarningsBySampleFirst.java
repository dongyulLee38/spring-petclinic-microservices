package org.springframework.samples.petclinic.api.bug;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UnknownFormatConversionException;

@SuppressWarnings(value = { "null", "unused" })
public class FindbugsWarningsBySampleFirst {

    public static void bugs(final String[] args) {
        System.out.println("Findbugs Sample 009 for NP_ALWAYS_NULL");
        // WRONG
        try {
            FindbugsWarningsBySampleFirst.npAlwaysNullWRONG();
        } catch (final NullPointerException e) {
            System.out.println("   - ERROR:" + e.getMessage());
        }

    }

    private static void npAlwaysNullWRONG() {
        final String value = null;
        if (null != value & value.length() > 2) {
            System.out.println(String.format("   - " + value));
        } else {
            System.out.println(String.format("   - value is invalid"));
        }
    }
}

