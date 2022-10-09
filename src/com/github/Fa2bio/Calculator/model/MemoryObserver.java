package com.github.Fa2bio.Calculator.model;
@FunctionalInterface
public interface MemoryObserver {
	void changedValue(String newValue);
}
