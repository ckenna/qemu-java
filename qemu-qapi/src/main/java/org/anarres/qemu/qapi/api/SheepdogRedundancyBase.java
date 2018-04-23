package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiTypeDescriptor{name=SheepdogRedundancyBase, data={type=SheepdogRedundancyType}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=SheepdogRedundancyBase, data={type=SheepdogRedundancyType}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SheepdogRedundancyBase extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("type")
	@Nonnull
	public SheepdogRedundancyType type;

	@Nonnull
	public SheepdogRedundancyBase withType(SheepdogRedundancyType value) {
		this.type = value;
		return this;
	}

	public SheepdogRedundancyBase() {
	}

	public SheepdogRedundancyBase(SheepdogRedundancyType type) {
		this.type = type;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("type");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("type".equals(name))
			return type;
		return super.getFieldByName(name);
	}
}
