package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiTypeDescriptor{name=BlockStats, data={*device=str, *node-name=str, stats=BlockDeviceStats, *parent=BlockStats, *backing=BlockStats}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=BlockStats, data={*device=str, *node-name=str, stats=BlockDeviceStats, *parent=BlockStats, *backing=BlockStats}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockStats extends QApiType {

	@JsonProperty("device")
	@CheckForNull
	public java.lang.String device;
	@JsonProperty("node-name")
	@CheckForNull
	public java.lang.String nodeName;
	@JsonProperty("stats")
	@Nonnull
	public BlockDeviceStats stats;
	@JsonProperty("parent")
	@CheckForNull
	public BlockStats parent;
	@JsonProperty("backing")
	@CheckForNull
	public BlockStats backing;

	@Nonnull
	public BlockStats withDevice(java.lang.String value) {
		this.device = value;
		return this;
	}

	@Nonnull
	public BlockStats withNodeName(java.lang.String value) {
		this.nodeName = value;
		return this;
	}

	@Nonnull
	public BlockStats withStats(BlockDeviceStats value) {
		this.stats = value;
		return this;
	}

	@Nonnull
	public BlockStats withParent(BlockStats value) {
		this.parent = value;
		return this;
	}

	@Nonnull
	public BlockStats withBacking(BlockStats value) {
		this.backing = value;
		return this;
	}

	public BlockStats() {
	}

	public BlockStats(java.lang.String device, java.lang.String nodeName, BlockDeviceStats stats, BlockStats parent, BlockStats backing) {
		this.device = device;
		this.nodeName = nodeName;
		this.stats = stats;
		this.parent = parent;
		this.backing = backing;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("device");
		names.add("node-name");
		names.add("stats");
		names.add("parent");
		names.add("backing");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("device".equals(name))
			return device;
		if ("node-name".equals(name))
			return nodeName;
		if ("stats".equals(name))
			return stats;
		if ("parent".equals(name))
			return parent;
		if ("backing".equals(name))
			return backing;
		return super.getFieldByName(name);
	}
}
