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
 * <pre>QApiTypeDescriptor{name=BlockdevQcow2EncryptionBase, data={format=BlockdevQcow2EncryptionFormat}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=BlockdevQcow2EncryptionBase, data={format=BlockdevQcow2EncryptionFormat}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevQcow2EncryptionBase extends QApiType {

	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("format")
	@Nonnull
	public BlockdevQcow2EncryptionFormat format;

	@Nonnull
	public BlockdevQcow2EncryptionBase withFormat(BlockdevQcow2EncryptionFormat value) {
		this.format = value;
		return this;
	}

	public BlockdevQcow2EncryptionBase() {
	}

	public BlockdevQcow2EncryptionBase(BlockdevQcow2EncryptionFormat format) {
		this.format = format;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("format");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("format".equals(name))
			return format;
		return super.getFieldByName(name);
	}
}
