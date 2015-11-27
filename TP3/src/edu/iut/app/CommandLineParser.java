package edu.iut.app;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;

public class CommandLineParser<T> {
	
	protected HashMap<String, CommandLineOption<T>> options;
	protected ArrayList<String> parseErrors;
		
	public CommandLineParser() {
		options = new HashMap<String, CommandLineOption<T> >();
		parseErrors = new ArrayList<String>();
	}
	
	public void addOption(CommandLineOption<T> option) {
		if (option != null) {
			options.put(option.getKey(),option);
		}
	}
	
	public void parse(String[] args) {
		for (String argument: args) {
			String[] keyValue=argument.split("=");
			if (options.containsKey(keyValue[0])) {
				switch (((CommandLineOption<?>)options.get(keyValue[0])).getOptionType()) {
					case FILE:
						CommandLineOption<File> fileOption = (CommandLineOption<File>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption.setValue(new File(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
					case STRING:
						CommandLineOption<String> fileOption1 = (CommandLineOption<String>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption1.setValue(new String(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
					case INTEGER:
						CommandLineOption<Integer> fileOption2 = (CommandLineOption<Integer>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption2.setValue(new Integer(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
					case BOOLEAN:
						CommandLineOption<Boolean> fileOption3 = (CommandLineOption<Boolean>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption3.setValue(new Boolean(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;
					case DOUBLE:
						CommandLineOption<Double> fileOption4 = (CommandLineOption<Double>)options.get(keyValue[0]);
						if (keyValue.length == 2) {
							fileOption4.setValue(new Double(keyValue[1]));
						}
						else {
							parseErrors.add("Option should have a key and a value.");
						}
						break;

					/* EX1 : reproduire le comportement de 'case FILE', pour STRING,INTEGER, ... */

					default:
						parseErrors.add("Unrecognize option type.");						
				}
			}
		}
	}
	
	public CommandLineOption<?> getOption(String key) {
		if (options.containsKey(key)) {
			return options.get(key);
		}
		return null;
	}
	
	public ArrayList<String> getErrors() {
		return parseErrors;
	}
	
}
