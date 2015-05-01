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
 * <pre>QApiTypeDescriptor{name=BlockInfo, data={device=str, type=str, removable=bool, locked=bool, *inserted=BlockDeviceInfo, *tray_open=bool, *io-status=BlockDeviceIoStatus, *dirty-bitmaps=[BlockDirtyInfo]}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=BlockInfo, data={device=str, type=str, removable=bool, locked=bool, *inserted=BlockDeviceInfo, *tray_open=bool, *io-status=BlockDeviceIoStatus, *dirty-bitmaps=[BlockDirtyInfo]}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockInfo extends QApiType {

	@JsonProperty("device")
	@Nonnull
	public java.lang.String device;
	@JsonProperty("type")
	@Nonnull
	public java.lang.String type;
	@JsonProperty("removable")
	@Nonnull
	public boolean removable;
	@JsonProperty("locked")
	@Nonnull
	public boolean locked;
	@JsonProperty("inserted")
	@CheckForNull
	public BlockDeviceInfo inserted;
	@JsonProperty("tray_open")
	@CheckForNull
	public java.lang.Boolean trayOpen;
	@JsonProperty("io-status")
	@CheckForNull
	public BlockDeviceIoStatus ioStatus;
	@JsonProperty("dirty-bitmaps")
	@CheckForNull
	public java.util.List<BlockDirtyInfo> dirtyBitmaps;

	@Nonnull
	public BlockInfo withDevice(java.lang.String value) {
		this.device = value;
		return this;
	}

	@Nonnull
	public BlockInfo withType(java.lang.String value) {
		this.type = value;
		return this;
	}

	@Nonnull
	public BlockInfo withRemovable(boolean value) {
		this.removable = value;
		return this;
	}

	@Nonnull
	public BlockInfo withLocked(boolean value) {
		this.locked = value;
		return this;
	}

	@Nonnull
	public BlockInfo withInserted(BlockDeviceInfo value) {
		this.inserted = value;
		return this;
	}

	@Nonnull
	public BlockInfo withTrayOpen(java.lang.Boolean value) {
		this.trayOpen = value;
		return this;
	}

	@Nonnull
	public BlockInfo withIoStatus(BlockDeviceIoStatus value) {
		this.ioStatus = value;
		return this;
	}

	@Nonnull
	public BlockInfo withDirtyBitmaps(java.util.List<BlockDirtyInfo> value) {
		this.dirtyBitmaps = value;
		return this;
	}

	public BlockInfo() {
	}

	public BlockInfo(java.lang.String device, java.lang.String type, boolean removable, boolean locked, BlockDeviceInfo inserted, java.lang.Boolean trayOpen, BlockDeviceIoStatus ioStatus, java.util.List<BlockDirtyInfo> dirtyBitmaps) {
		this.device = device;
		this.type = type;
		this.removable = removable;
		this.locked = locked;
		this.inserted = inserted;
		this.trayOpen = trayOpen;
		this.ioStatus = ioStatus;
		this.dirtyBitmaps = dirtyBitmaps;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("device");
		names.add("type");
		names.add("removable");
		names.add("locked");
		names.add("inserted");
		names.add("tray_open");
		names.add("io-status");
		names.add("dirty-bitmaps");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("device".equals(name))
			return device;
		if ("type".equals(name))
			return type;
		if ("removable".equals(name))
			return removable;
		if ("locked".equals(name))
			return locked;
		if ("inserted".equals(name))
			return inserted;
		if ("tray_open".equals(name))
			return trayOpen;
		if ("io-status".equals(name))
			return ioStatus;
		if ("dirty-bitmaps".equals(name))
			return dirtyBitmaps;
		return super.getFieldByName(name);
	}
}
