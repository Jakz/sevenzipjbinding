package net.sf.sevenzipjbinding.junit.compression;

import net.sf.sevenzipjbinding.ArchiveFormat;
import net.sf.sevenzipjbinding.IOutItemAllFormats;

/**
 * Tests compression, update and extraction of multiple files using non-generic callback with Tar.
 *
 * @author Boris Brodski
 * @since 9.20-2.00
 */
public class UpdateMultipleFilesNonGenericTarTest extends UpdateMultipleFilesNonGenericAbstractTest {

    @Override
    protected ArchiveFormat getArchiveFormat() {
        return ArchiveFormat.TAR;
    }

    @Override
    protected void copyFromDelegate(IOutItemAllFormats outItem, IOutItemAllFormats delegateOutItem) {
        copyFromDelegateTar(outItem, delegateOutItem);
    }

}
