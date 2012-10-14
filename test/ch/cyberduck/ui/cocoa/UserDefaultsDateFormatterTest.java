package ch.cyberduck.ui.cocoa;

import ch.cyberduck.core.AbstractTestCase;
import ch.cyberduck.ui.DateFormatter;

import org.junit.Test;

import java.util.concurrent.Callable;

import static org.junit.Assert.assertNotNull;

/**
 * @version $Id:$
 */
public class UserDefaultsDateFormatterTest extends AbstractTestCase {

    @Test
    public void testGetShortFormat() throws Exception {
        final DateFormatter f = new UserDefaultsDateFormatter();
        this.repeat(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                assertNotNull(f.getShortFormat(System.currentTimeMillis(), false));
                assertNotNull(f.getShortFormat(System.currentTimeMillis(), true));
                return null;
            }
        }, 10);
    }

    @Test
    public void testGetMediumFormat() throws Exception {
        final DateFormatter f = new UserDefaultsDateFormatter();
        this.repeat(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                assertNotNull(f.getMediumFormat(System.currentTimeMillis(), false));
                assertNotNull(f.getMediumFormat(System.currentTimeMillis(), true));
                return null;
            }
        }, 10);
    }

    @Test
    public void testGetLongFormat() throws Exception {
        final DateFormatter f = new UserDefaultsDateFormatter();
        this.repeat(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                assertNotNull(f.getLongFormat(System.currentTimeMillis(), false));
                assertNotNull(f.getLongFormat(System.currentTimeMillis(), true));
                return null;
            }
        }, 10);
    }
}
