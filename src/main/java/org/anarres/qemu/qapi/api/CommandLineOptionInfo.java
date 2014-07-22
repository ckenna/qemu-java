package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=CommandLineOptionInfo, data={option=str, parameters=[CommandLineParameterInfo]}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=CommandLineOptionInfo, data={option=str, parameters=[CommandLineParameterInfo]}, innerTypes=null}
public class CommandLineOptionInfo extends QApiType {

	@SerializedName("option")
	@Nonnull
	public java.lang.String option;
	@SerializedName("parameters")
	@Nonnull
	public List<CommandLineParameterInfo> parameters;

	public CommandLineOptionInfo() {
	}

	public CommandLineOptionInfo(java.lang.String option, List<CommandLineParameterInfo> parameters) {
		this.option = option;
		this.parameters = parameters;
	}
}