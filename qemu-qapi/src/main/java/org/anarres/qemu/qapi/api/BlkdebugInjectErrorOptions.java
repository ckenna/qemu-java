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
 * <pre>QApiTypeDescriptor{name=BlkdebugInjectErrorOptions, data={event=BlkdebugEvent, *state=int, *errno=int, *sector=int, *once=bool, *immediately=bool}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=BlkdebugInjectErrorOptions, data={event=BlkdebugEvent, *state=int, *errno=int, *sector=int, *once=bool, *immediately=bool}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlkdebugInjectErrorOptions extends QApiType {

	@JsonProperty("event")
	@Nonnull
	public BlkdebugEvent event;
	@JsonProperty("state")
	@CheckForNull
	public java.lang.Long state;
	@JsonProperty("errno")
	@CheckForNull
	public java.lang.Long errno;
	@JsonProperty("sector")
	@CheckForNull
	public java.lang.Long sector;
	@JsonProperty("once")
	@CheckForNull
	public java.lang.Boolean once;
	@JsonProperty("immediately")
	@CheckForNull
	public java.lang.Boolean immediately;

	@Nonnull
	public BlkdebugInjectErrorOptions withEvent(BlkdebugEvent value) {
		this.event = value;
		return this;
	}

	@Nonnull
	public BlkdebugInjectErrorOptions withState(java.lang.Long value) {
		this.state = value;
		return this;
	}

	@Nonnull
	public BlkdebugInjectErrorOptions withErrno(java.lang.Long value) {
		this.errno = value;
		return this;
	}

	@Nonnull
	public BlkdebugInjectErrorOptions withSector(java.lang.Long value) {
		this.sector = value;
		return this;
	}

	@Nonnull
	public BlkdebugInjectErrorOptions withOnce(java.lang.Boolean value) {
		this.once = value;
		return this;
	}

	@Nonnull
	public BlkdebugInjectErrorOptions withImmediately(java.lang.Boolean value) {
		this.immediately = value;
		return this;
	}

	public BlkdebugInjectErrorOptions() {
	}

	public BlkdebugInjectErrorOptions(BlkdebugEvent event, java.lang.Long state, java.lang.Long errno, java.lang.Long sector, java.lang.Boolean once, java.lang.Boolean immediately) {
		this.event = event;
		this.state = state;
		this.errno = errno;
		this.sector = sector;
		this.once = once;
		this.immediately = immediately;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("event");
		names.add("state");
		names.add("errno");
		names.add("sector");
		names.add("once");
		names.add("immediately");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("event".equals(name))
			return event;
		if ("state".equals(name))
			return state;
		if ("errno".equals(name))
			return errno;
		if ("sector".equals(name))
			return sector;
		if ("once".equals(name))
			return once;
		if ("immediately".equals(name))
			return immediately;
		return super.getFieldByName(name);
	}
}
