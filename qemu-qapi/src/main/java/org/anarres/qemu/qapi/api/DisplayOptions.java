package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiUnionDescriptor{name=DisplayOptions, discriminator=type, data={default=DisplayNoOpts, none=DisplayNoOpts, gtk=DisplayGTK, sdl=DisplayNoOpts, egl-headless=DisplayNoOpts, curses=DisplayNoOpts, cocoa=DisplayNoOpts}, innerTypes=null, fields=null, base={type=DisplayType, *full-screen=bool, *window-close=bool, *gl=DisplayGLMode}, discriminatorField=null}</pre>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DisplayOptions extends DisplayOptionsBase implements QApiUnion {

	// union {
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("default")
	@JsonUnwrapped
	@CheckForNull
	public DisplayNoOpts _default;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("none")
	@JsonUnwrapped
	@CheckForNull
	public DisplayNoOpts none;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("gtk")
	@JsonUnwrapped
	@CheckForNull
	public DisplayGTK gtk;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("sdl")
	@JsonUnwrapped
	@CheckForNull
	public DisplayNoOpts sdl;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("egl-headless")
	@JsonUnwrapped
	@CheckForNull
	public DisplayNoOpts eglHeadless;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("curses")
	@JsonUnwrapped
	@CheckForNull
	public DisplayNoOpts curses;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("cocoa")
	@JsonUnwrapped
	@CheckForNull
	public DisplayNoOpts cocoa;
	// }

	@Nonnull
	public static DisplayOptions _default(@Nonnull DisplayNoOpts _default) {
		DisplayOptions self = new DisplayOptions();
		self.type = DisplayType._default;
		self._default = _default;
		return self;
	}

	@Nonnull
	public static DisplayOptions none(@Nonnull DisplayNoOpts none) {
		DisplayOptions self = new DisplayOptions();
		self.type = DisplayType.none;
		self.none = none;
		return self;
	}

	@Nonnull
	public static DisplayOptions gtk(@Nonnull DisplayGTK gtk) {
		DisplayOptions self = new DisplayOptions();
		self.type = DisplayType.gtk;
		self.gtk = gtk;
		return self;
	}

	@Nonnull
	public static DisplayOptions sdl(@Nonnull DisplayNoOpts sdl) {
		DisplayOptions self = new DisplayOptions();
		self.type = DisplayType.sdl;
		self.sdl = sdl;
		return self;
	}

	@Nonnull
	public static DisplayOptions eglHeadless(@Nonnull DisplayNoOpts eglHeadless) {
		DisplayOptions self = new DisplayOptions();
		self.type = DisplayType.egl_headless;
		self.eglHeadless = eglHeadless;
		return self;
	}

	@Nonnull
	public static DisplayOptions curses(@Nonnull DisplayNoOpts curses) {
		DisplayOptions self = new DisplayOptions();
		self.type = DisplayType.curses;
		self.curses = curses;
		return self;
	}

	@Nonnull
	public static DisplayOptions cocoa(@Nonnull DisplayNoOpts cocoa) {
		DisplayOptions self = new DisplayOptions();
		self.type = DisplayType.cocoa;
		self.cocoa = cocoa;
		return self;
	}

	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("default");
		names.add("none");
		names.add("gtk");
		names.add("sdl");
		names.add("egl-headless");
		names.add("curses");
		names.add("cocoa");
		return names;
	}

	@JsonIgnore
	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("default".equals(name))
			return _default;
		if ("none".equals(name))
			return none;
		if ("gtk".equals(name))
			return gtk;
		if ("sdl".equals(name))
			return sdl;
		if ("egl-headless".equals(name))
			return eglHeadless;
		if ("curses".equals(name))
			return curses;
		if ("cocoa".equals(name))
			return cocoa;
		return super.getFieldByName(name);
	}

	@JsonIgnore
	public boolean isValidUnion() {
		int count = 0;
		if (_default != null)
			count++;
		if (none != null)
			count++;
		if (gtk != null)
			count++;
		if (sdl != null)
			count++;
		if (eglHeadless != null)
			count++;
		if (curses != null)
			count++;
		if (cocoa != null)
			count++;
		return (count == 1);
	}
}
