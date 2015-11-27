package edu.iut.app;

public class CommandLineOption<T> /* EX1 : CLASSE GENERIC SUR le type ValueType */ {
	
	public enum OptionType{
		NONE("None"),
		FILE("File"),
		STRING("String"),
		INTEGER("Integer"),
		DOUBLE("Double"),
		NOVALUE("NoValue"),
		BOOLEAN("Boolean");
		private String optionType;
		
		OptionType(String optionType) {
			this.optionType = optionType;
		}
		
		public String toString() {
			return optionType;
		}		
	}
	
	public CommandLineOption() {		
		/* EX1: Initializer les attributs */
		this.optionType = OptionType.NONE;
		this.key="";
		this.description="";
		//this.defaultValue;
		this.defaultValue=new ValueType<T>(type);
		this.value = this.defaultValue;
		
	}
	public CommandLineOption(final OptionType optionType, final String key, final String description, final ValueType<T> defaultValue) {
		/* EX1 : Affecter les attributs */
		this.optionType=optionType;
		this.key=key;
		this.description=description;
		this.defaultValue=defaultValue;
		this.value = defaultValue;
		
	}
	public void setOption(OptionType optionType, String key, String description, ValueType<T> defaultValue) {
		/* EX1 : Affecter les attributs */
		this.optionType=optionType;
		this.key=key;
		this.description=description;
		this.defaultValue=defaultValue;
		this.value = defaultValue;
	}
	public void setValue(T value) {
		this.value=new ValueType<T>(value);
	}
		
	public String getKey() {
		return this.key;
	}
	public String getDescription() {
		return this.description;
	}
	public ValueType<T> getValue() {
		if (value != null) {
			return value;
		}
		return defaultValue;
	}
	public OptionType getOptionType() {
		return optionType;
	}

	protected String key;
	protected String description;
	protected ValueType<T> defaultValue;
	protected ValueType<T> value;
	protected OptionType optionType;
	protected T type;

}
