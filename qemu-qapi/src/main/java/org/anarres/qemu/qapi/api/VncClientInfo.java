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
 * <pre>QApiTypeDescriptor{name=VncClientInfo, data={*x509_dname=str, *sasl_username=str}, innerTypes=null}</pre>
 */
// QApiTypeDescriptor{name=VncClientInfo, data={*x509_dname=str, *sasl_username=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VncClientInfo extends VncBasicInfo {

	@JsonProperty("x509_dname")
	@CheckForNull
	public java.lang.String x509Dname;
	@JsonProperty("sasl_username")
	@CheckForNull
	public java.lang.String saslUsername;

	@Nonnull
	public VncClientInfo withX509Dname(java.lang.String value) {
		this.x509Dname = value;
		return this;
	}

	@Nonnull
	public VncClientInfo withSaslUsername(java.lang.String value) {
		this.saslUsername = value;
		return this;
	}

	public VncClientInfo() {
	}

	public VncClientInfo(java.lang.String x509Dname, java.lang.String saslUsername) {
		this.x509Dname = x509Dname;
		this.saslUsername = saslUsername;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("x509_dname");
		names.add("sasl_username");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("x509_dname".equals(name))
			return x509Dname;
		if ("sasl_username".equals(name))
			return saslUsername;
		return super.getFieldByName(name);
	}
}
