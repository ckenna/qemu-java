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
 * <pre>QApiTypeDescriptor{name=InputBtnEvent, data={button=InputButton, down=bool}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=InputBtnEvent, data={button=InputButton, down=bool}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class InputBtnEvent extends QApiType {

	@JsonProperty("button")
	@Nonnull
	public InputButton button;
	@JsonProperty("down")
	@Nonnull
	public boolean down;

	@Nonnull
	public InputBtnEvent withButton(InputButton value) {
		this.button = value;
		return this;
	}

	@Nonnull
	public InputBtnEvent withDown(boolean value) {
		this.down = value;
		return this;
	}

	public InputBtnEvent() {
	}

	public InputBtnEvent(InputButton button, boolean down) {
		this.button = button;
		this.down = down;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("button");
		names.add("down");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("button".equals(name))
			return button;
		if ("down".equals(name))
			return down;
		return super.getFieldByName(name);
	}
}
