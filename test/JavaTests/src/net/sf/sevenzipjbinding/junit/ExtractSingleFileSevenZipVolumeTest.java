package net.sf.sevenzipjbinding.junit;

import net.sf.sevenzipjbinding.ArchiveFormat;

public class ExtractSingleFileSevenZipVolumeTest extends ExtractSingleFileAbstractTest {

	public ExtractSingleFileSevenZipVolumeTest() {
		super(ArchiveFormat.SEVEN_ZIP, 0, 5, 9);

		useVolumedSevenZip();
	}

}