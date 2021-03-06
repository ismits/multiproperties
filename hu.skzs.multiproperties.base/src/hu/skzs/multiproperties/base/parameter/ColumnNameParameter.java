package hu.skzs.multiproperties.base.parameter;

/**
 * The {@link ColumnNameParameter} represents the name of the desired column in the MultiProperties file
 * @author skzs
 *
 */
public class ColumnNameParameter extends ValuedParameter<String>
{

	/**
	 * Default constructor
	 * @param value the given parameter value as String
	 */
	public ColumnNameParameter(final String value)
	{
		super(value);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String convertValue(final String value)
	{
		return value;
	}
}
