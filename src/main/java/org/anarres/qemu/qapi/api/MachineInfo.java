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
 * <p><pre>QApiTypeDescriptor{name=MachineInfo, data={name=str, *alias=str, *is-default=bool, cpu-max=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=MachineInfo, data={name=str, *alias=str, *is-default=bool, cpu-max=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MachineInfo extends QApiType {

	@JsonProperty("name")
	@Nonnull
	public java.lang.String name;
	@JsonProperty("alias")
	@CheckForNull
	public java.lang.String alias;
	@JsonProperty("is-default")
	@CheckForNull
	public java.lang.Boolean isDefault;
	@JsonProperty("cpu-max")
	@Nonnull
	public long cpuMax;

	@Nonnull
	public MachineInfo withName(java.lang.String value) {
		this.name = value;
		return this;
	}

	@Nonnull
	public MachineInfo withAlias(java.lang.String value) {
		this.alias = value;
		return this;
	}

	@Nonnull
	public MachineInfo withIsDefault(java.lang.Boolean value) {
		this.isDefault = value;
		return this;
	}

	@Nonnull
	public MachineInfo withCpuMax(long value) {
		this.cpuMax = value;
		return this;
	}

	public MachineInfo() {
	}

	public MachineInfo(java.lang.String name, java.lang.String alias, java.lang.Boolean isDefault, long cpuMax) {
		this.name = name;
		this.alias = alias;
		this.isDefault = isDefault;
		this.cpuMax = cpuMax;
	}
}