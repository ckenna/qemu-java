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
 * <p><pre>QApiTypeDescriptor{name=BlockJobInfo, data={type=str, device=str, len=int, offset=int, busy=bool, paused=bool, speed=int, io-status=BlockDeviceIoStatus}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=BlockJobInfo, data={type=str, device=str, len=int, offset=int, busy=bool, paused=bool, speed=int, io-status=BlockDeviceIoStatus}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockJobInfo extends QApiType {

	@JsonProperty("type")
	@Nonnull
	public java.lang.String type;
	@JsonProperty("device")
	@Nonnull
	public java.lang.String device;
	@JsonProperty("len")
	@Nonnull
	public long len;
	@JsonProperty("offset")
	@Nonnull
	public long offset;
	@JsonProperty("busy")
	@Nonnull
	public boolean busy;
	@JsonProperty("paused")
	@Nonnull
	public boolean paused;
	@JsonProperty("speed")
	@Nonnull
	public long speed;
	@JsonProperty("io-status")
	@Nonnull
	public BlockDeviceIoStatus ioStatus;

	@Nonnull
	public BlockJobInfo withType(java.lang.String value) {
		this.type = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withDevice(java.lang.String value) {
		this.device = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withLen(long value) {
		this.len = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withOffset(long value) {
		this.offset = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withBusy(boolean value) {
		this.busy = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withPaused(boolean value) {
		this.paused = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withSpeed(long value) {
		this.speed = value;
		return this;
	}

	@Nonnull
	public BlockJobInfo withIoStatus(BlockDeviceIoStatus value) {
		this.ioStatus = value;
		return this;
	}

	public BlockJobInfo() {
	}

	public BlockJobInfo(java.lang.String type, java.lang.String device, long len, long offset, boolean busy, boolean paused, long speed, BlockDeviceIoStatus ioStatus) {
		this.type = type;
		this.device = device;
		this.len = len;
		this.offset = offset;
		this.busy = busy;
		this.paused = paused;
		this.speed = speed;
		this.ioStatus = ioStatus;
	}
}
