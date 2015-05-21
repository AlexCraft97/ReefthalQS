package script.flags;

/**
 * An enum holding all possible data flags for players
 *
 * @author Alex
 *
 */
public enum EnumPlayerFlag implements IEnumFlag {
	A(new GenericFlagDefaulter<Boolean>(Boolean.FALSE, Boolean.class));
	private final GenericFlagDefaulter<?> theFlag;

	private EnumPlayerFlag(GenericFlagDefaulter flag) {
		this.theFlag = flag;
	}

	@Override
	public GenericFlagDefaulter<?> getFlag() {
		return this.theFlag;
	}
}
