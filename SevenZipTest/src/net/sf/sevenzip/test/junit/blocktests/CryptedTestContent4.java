package net.sf.sevenzip.test.junit.blocktests;

public class CryptedTestContent4 extends StandardTest {

	@Override
	protected int getTestId() {
		return 4;
	}

	@Override
	protected boolean usingPassword() {
		return true;
	}

}