package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=CommandLineOptionInfo, data={option=str, parameters=[CommandLineParameterInfo]}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=CommandLineOptionInfo, data={option=str, parameters=[CommandLineParameterInfo]}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CommandLineOptionInfo extends QApiType {

	@JsonProperty("option")
	@Nonnull
	public java.lang.String option;
	@JsonProperty("parameters")
	@Nonnull
	public java.util.List<CommandLineParameterInfo> parameters;

	@Nonnull
	public CommandLineOptionInfo withOption(java.lang.String value) {
		this.option = value;
		return this;
	}

	@Nonnull
	public CommandLineOptionInfo withParameters(java.util.List<CommandLineParameterInfo> value) {
		this.parameters = value;
		return this;
	}

	public CommandLineOptionInfo() {
	}

	public CommandLineOptionInfo(java.lang.String option, java.util.List<CommandLineParameterInfo> parameters) {
		this.option = option;
		this.parameters = parameters;
	}
}
