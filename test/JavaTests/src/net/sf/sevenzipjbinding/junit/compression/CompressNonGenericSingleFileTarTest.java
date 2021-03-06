package net.sf.sevenzipjbinding.junit.compression;

import net.sf.sevenzipjbinding.ArchiveFormat;
import net.sf.sevenzipjbinding.IOutCreateArchive;
import net.sf.sevenzipjbinding.IOutItemTar;
import net.sf.sevenzipjbinding.SevenZip;
import net.sf.sevenzipjbinding.SevenZipException;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/**
 * Tests compression and extraction of a single file using non-generic callback with Tar.
 *
 * @author Boris Brodski
 * @since 9.20-2.00
 */
public class CompressNonGenericSingleFileTarTest extends CompressNonGenericSingleFileAbstractTest<IOutItemTar> {
    private class SingleFileCreateArchiveCallbackTar extends SingleFileCreateArchiveCallback {
        public IOutItemTar getItemInformation(int index, OutItemFactory<IOutItemTar> outItemFactory)
                throws SevenZipException {
            IOutItemTar outItem = outItemFactory.createOutItem();

            setBaseProperties(outItem);
            setPropertiesForTar(outItem, getTestContext());

            return outItem;
        }
    }

    @Override
    protected ArchiveFormat getArchiveFormat() {
        return ArchiveFormat.TAR;
    }

    @Override
    protected SingleFileCreateArchiveCallback getSingleFileCreateArchiveCallback() {
        return new SingleFileCreateArchiveCallbackTar();
    }

    @Override
    protected IOutCreateArchive<IOutItemTar> openOutArchive() throws SevenZipException {
        return SevenZip.openOutArchiveTar();
    }

}
