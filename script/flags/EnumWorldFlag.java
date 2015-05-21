package script.flags;

/**
 * An enum holding all possible data flags for a world
 *
 * @author Alex
 *
 */
public enum EnumWorldFlag implements IEnumFlag {
	A(new GenericFlagDefaulter<Boolean>(Boolean.FALSE, Boolean.class));
	private final GenericFlagDefaulter<?> theFlag;

	private EnumWorldFlag(GenericFlagDefaulter flag) {
		this.theFlag = flag;
	}

	@Override
	public GenericFlagDefaulter<?> getFlag() {
		return this.theFlag;
	}
}
